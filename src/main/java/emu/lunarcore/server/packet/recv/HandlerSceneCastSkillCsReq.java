package emu.lunarcore.server.packet.recv;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.battle.skills.MazeSkill;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.SceneCastSkillCsReqOuterClass.SceneCastSkillCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketSceneCastSkillMpUpdateScNotify;
import emu.lunarcore.server.packet.send.PacketSceneCastSkillScRsp;
import it.unimi.dsi.fastutil.ints.IntLinkedOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

@Opcodes(CmdId.SceneCastSkillCsReq)
public class HandlerSceneCastSkillCsReq extends PacketHandler {
    
    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SceneCastSkillCsReq.parseFrom(data);
        
        // Setup variables
        Player player = session.getPlayer();
        MazeSkill skill = null;
        IntSet hitTargets = new IntLinkedOpenHashSet();
        IntSet hitTargetAssist = new IntOpenHashSet(); // targets around cast location (not actually hitting)
        IntSet assistMonsters = new IntLinkedOpenHashSet();

        if (req.hasHitTargetEntityIdList() || req.hasAssistMonsterEntityIdList()) {
            // Parse targets efficiently (skips integer boxing)
            for (var entityId:  req.getHitTargetEntityIdList()) {
                hitTargets.add(entityId.intValue());
                hitTargetAssist.add(entityId.intValue());
            }

            for (var assistWave : req.getAssistMonsterWaveList()) {
                for (int id : assistWave.getEntityIdList()) {
                    assistMonsters.add(id);
                }
            }
            
            for (var entityId: req.getAssistMonsterEntityIdList()) {
                hitTargetAssist.add(entityId.intValue());
            }
        }
        
        // Check if player casted a maze skill
        if (player.getScene().getAvatarEntityIds().contains(req.getCasterId())) {
            // Get casting avatar
            GameAvatar caster = player.getCurrentLeaderAvatar();
            var casterEntity = player.getScene().getEntityById(req.getCasterId());
            if (casterEntity instanceof GameAvatar && caster == null) {
                caster = ((GameAvatar) casterEntity);
            }
            
            // Sanity check, but should never happen
            if (caster == null) {
                session.send(new PacketSceneCastSkillScRsp(req.getAttackedGroupId()));
                return;
            }
            
            // Check if normal attack or technique was used
            if (req.getSkillIndex() > 0) {
                // Spend one skill point
                player.getCurrentLineup().removeMp(1);
                session.send(new PacketSceneCastSkillMpUpdateScNotify(req.getAttackedGroupId(), player.getCurrentLineup().getMp()));
                // Cast skill effects
                if (caster.getExcel().getMazeSkill() != null) {
                    skill = caster.getExcel().getMazeSkill();
                    skill.onCast(caster, req.getTargetMotion(), hitTargetAssist);
                }
            } else {
                skill = caster.getExcel().getMazeAttack();
            }
        }
        
        // Start battle
        if (!hitTargets.isEmpty()) {
            session.getServer().getBattleService().startBattle(player, req.getCasterId(), req.getAttackedGroupId(), skill, hitTargets, assistMonsters);
        } else {
            // We had no targets for some reason
            session.send(new PacketSceneCastSkillScRsp(req.getAttackedGroupId()));
        }
    }

}
