package emu.lunarcore.server.packet.recv;

import emu.lunarcore.GameConstants;
import emu.lunarcore.config.ConfigManager;
import emu.lunarcore.proto.SetClientPausedCsReqOuterClass.SetClientPausedCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import emu.lunarcore.server.packet.send.PacketSetClientPausedScRsp;

@Opcodes(CmdId.SetClientPausedCsReq)
public class HandlerSetClientPausedCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SetClientPausedCsReq.parseFrom(data);
        
        session.getPlayer().setPaused(req.getIsPaused());
        session.send(new PacketSetClientPausedScRsp(session.getPlayer()));

        
        String content = "";
        if (ConfigManager.getConfig().getAccountOptions().useModifiedUid) {
            // Process strings
            String name = session.getPlayer().getName();
            int uid = session.getPlayer().getUid();
            String hintText = "";
            if (session.getPlayer().getAccount().hasPermission("admin")) {
                hintText = "<color=#FFC0CB>" + name + " " + uid + " ( Admin Account )" + "</color>";
            } else {
                hintText = name + " " + uid;
            }

            // Hardcode content
            content += "local function main()\nCS.UnityEngine.QualitySettings.vSyncCount = 0";
            content += "local hint2 = CS.UnityEngine.GameObject.Find(\"/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/VersionText\")\n" +
                       "hint2:GetComponent(\"Text\").text = tostring(\"<color=#FFC0CB>" + GameConstants.NAME + "</color>\")\n" +
                       "hint2:SetActive(true)";
            content += "local hint1 = CS.UnityEngine.GameObject.Find(\"/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/HintText\")\n" +
                          "hint1:GetComponent(\"Text\").text = tostring(\"" + hintText + "\")\n" +
                          "hint1:SetActive(true)\n";
        }

        // Encode bytecode
        session.send(new PacketClientDownloadDataScNotify(content.getBytes(), session.getPlayer()));
    }
}
