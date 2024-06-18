package emu.lunarcore.game.multi;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.config.GroupInfo;
import emu.lunarcore.data.config.PropInfo;
import emu.lunarcore.data.excel.PropExcel;
import emu.lunarcore.game.enums.PropState;
import emu.lunarcore.game.scene.entity.EntityProp;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.util.Position;

public class MultiSpawnManager {
    public void multiEntitySpawn(GameSession session, Position vec) {
        // TODO: Implement multi entity spawn
        PropExcel propExcel = GameData.getPropExcelMap().get(3002);
        if (propExcel != null) {
            GroupInfo groupInfo = null;
            PropInfo propInfo = null;
            
            for (var group : session.getPlayer().getScene().getFloorInfo().getGroups().values()) {
                if (group.getPropList().size() == 0) continue;
                
                for (var p : group.getPropList()) {
                    if (p.getFarmElementID() == 0 && p.getAnchorID() == 0 && p.getCocoonID() == 0) {
                        groupInfo = group;
                        propInfo = p;
                        break;
                    }
                }
                
                if (propInfo != null) break;
            }
        

            EntityProp prop = new EntityProp(session.getPlayer().getScene(), propExcel, groupInfo, propInfo);
            prop.getPos().set(vec);
            prop.getRot().set(0, 0, 0);
            prop.setState(PropState.Open);

            session.getPlayer().getScene().removeEntity(session.getPlayer().getScene().getMultiEntityId());
            session.getPlayer().getScene().addEntity(prop, true);
            session.getPlayer().getScene().setMultiEntityId(prop.getEntityId());
        }
    }
}
