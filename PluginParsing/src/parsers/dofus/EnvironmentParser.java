package parsers.dofus;

import static Handlers.GHandler.packetCantParse;
import Enums.EmoteEnum;
import Enums.Orientation;
import Game.DofusGameClient;
import Misc.Utils;
import Plugins.Abstractions.AbstractPacketParser;

public class EnvironmentParser extends AbstractPacketParser<DofusGameClient, String> {

	@SuppressWarnings("static-access")
	@Override
	public boolean parse(DofusGameClient c, String packet){
		switch(packet.charAt(1)){
			case 'D'://TODO Direction/Orientation
				if(c.getAccount().getCurPerso().getFight() != null){
					packetCantParse(c, packet, "Personnage en combat donc n'a pas le droit de changer d'orientation");
				}
				if(Utils.isParsableInteger(packet.charAt(2)+"") == false){
					SM.emotes.eUE(c.getSession());
					packetCantParse(c, packet, "Impossible de parser l'ID d'Orientation en chiffre");
				}
				byte orientation = Byte.parseByte(""+packet.charAt(2));
				if(Enums.Orientation.getOrientation(orientation) != null){
					if(Orientation.isDiagonal(orientation) == false){
						if(c.getAccount().getCurPerso().isSit()){
							//Set à l'orientation d'apres si le perso est assis et 
							//demande une orientation non-diagonale. 
							//(Le sprite s'afficherait alors mal (debout alors quil est assit...))
							orientation = Orientation.getNextOrientation(orientation);
						}
					}
					c.getAccount().getCurPerso().setOrientationID(orientation);
					SM.emotes.eD(c.getAccount().getCurPerso().getMap(), c.getAccount().getCurPerso(), orientation);
				}
				return true;
			case 'U'://TODO Use (D'emote)
				if(packet.length() > 4){//impossible d'avoir un packet plus long que 4. le max étant:"eU23"
					packetCantParse(c, packet, "Impossible d'avoir un packet d'emote d'une length de plus de 4. Le max est \"eU23\"");
				}
				if(c.getAccount().getCurPerso().getFight() != null){//pas d'emote en combat...
					packetCantParse(c, packet, "Personnage en combat. Impossible de faire une emote en combat.");
				}
				if(Utils.isParsableInteger(packet.substring(2)) == false){
					packetCantParse(c, packet, "Impossible de de parser l'ID de l'emote en chiffre.");
				}
				EmoteEnum EE = EmoteEnum.getEmote(Integer.parseInt(packet.substring(2)));
				if(EE == null){
					packetCantParse(c, packet, "Impossible de trouver l'emote correspondante à cet ID.("+Integer.parseInt(packet.substring(2))+")");//passible de BAN (flood/cheat packet)
				}
				if(c.getAccount().getCurPerso().hasEmote(EE) == false){
					SM.emotes.eUE(c.getSession());//Message rouge: "Votre personnage ne connaît pas cette attitude !"
					return true;
				}
				if(EE == EE.SIT || EE == EE.REST || EE == EE.SIT_CHAIR){
					if(c.getAccount().getCurPerso().isSit()){
						EE = EmoteEnum.STAND_UP;
					}
					c.getAccount().getCurPerso().sit();
				}
				//if(EE == EE.DRINK_BEER || EE == EE.EAT_BREAD){} -> Activé dans ObjectOnUse 
				SM.emotes.eU(c.getAccount().getCurPerso(), EE.getValue(), 0);
				return true;
		}
		return false;
	}
	
	
}
