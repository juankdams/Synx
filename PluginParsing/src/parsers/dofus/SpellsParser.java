package parsers.dofus;

import static Handlers.GHandler.packetCantParse;
import Constants.CSpells;
import Core.Syn;
import Enums.CharacteristicType;
import Game.DofusGameClient;
import GameObjects.GSpell;
import GameObjects.GStatistiques.CharacteristicColumn;
import Misc.Utils;
import Plugins.Abstractions.AbstractPacketParser;

public class SpellsParser extends AbstractPacketParser<DofusGameClient, String> {

	@Override
	public boolean parse(DofusGameClient c, String packet){
		switch(packet.charAt(1)){
			case 'B'://onBoost. Ex recevoir: Game: Recv << SB198.  Ex à renvoyer: [Send] >> SUK198~2
				if(Utils.isParsableInteger(packet.substring(2)) == false){
					packetCantParse(c, packet, "L'ID du sort est imparsable en int dans le parseSpells.onBoost");
				}
				short spellID1 = Short.parseShort(packet.substring(2));
				GSpell spell = c.getAccount().getCurPerso().getSpellByID(spellID1);
				if(spell == null){
					SM.Spells.SUE(c.getSession());
					packetCantParse(c, packet, "Le personnage ne possède pas le sort demandé ("+spellID1+") dans le parseSpells.onBoost");
				}
				byte spellLvl = spell.getSpellLvl(c.getAccount().getCurPerso().getWorld());
				if(spellLvl > c.getAccount().getCurPerso().getStatistique().getValue(CharacteristicType.SPELL_POINTS.get(), CharacteristicColumn.BASE)){
					SM.Spells.SUE(c.getSession());
					packetCantParse(c, packet, "Le personnage ne possède pas assez de points de sorts pour booster le sort demandé ("+spellID1+") jusqu'au niveau "+(spellLvl+1)+" dans le parseSpells.onBoost");
				}
				Syn.d("le joueur avait le bon nombre de points.");
				if(spellLvl >= c.getAccount().getCurPerso().getWorld().getSpell(spellID1).length){
					SM.Spells.SUE(c.getSession());
					packetCantParse(c, packet, "Impossible de booster le sort demandé ("+spellID1+") jusqu'au niveau "+(spellLvl+1)+" dans le parseSpells.onBoost, ce sort est déjà boosté au niveau maximum.");
				}
				Syn.w("safdgiuhldfjg  Man, le Exception.throwXXXException fait pas toujours déco le perso -.-");
				c.getAccount().getCurPerso().upgradeSpellByID(spellID1, c.getAccount().getCurPerso().getWorld().getSpell(spellID1)[spellLvl]);
				SM.Spells.SUK(c.getSession(), spellID1, spellLvl+1);
				//rien d'autre à renvoyer apparemment.
				return true;
			//TODO case 'F': //forgetSpell
			//	break;
			case 'M'://onSpellMove -> pour bouger un sort dans les barres de raccourcis  Ex: SM181|1
				if(Utils.isParsableInteger(packet.substring(2, packet.indexOf("|"))) == false
					|| Utils.isParsableInteger(packet.substring(1+packet.indexOf("|"))) == false){
					packetCantParse(c, packet, "L'ID du sort ou l'ID de la nouvelle position sont imparsable en int dans le parseSpells.onMovement");
				}
				short spellID = Short.parseShort(packet.substring(2, packet.indexOf("|")));
				byte positionID = Byte.parseByte(packet.substring(1+packet.indexOf("|")));
				if(positionID > CSpells.maxSpellPositionID || positionID < CSpells.minSpellPositionID){
					packetCantParse(c, packet, "Position de sort invalide ("+positionID+") dans le parseSpells.onMovement");
				}
				GSpell s = c.getAccount().getCurPerso().removeSpellByID(spellID);
				if(s == null){
					packetCantParse(c, packet, "Le personnage ne possède pas le sort demandé ("+spellID+") dans le parseSpells.onMovement");
				}
				GSpell old = c.getAccount().getCurPerso().removeSpellByPosition(positionID);
				c.getAccount().getCurPerso().setSpellByPosition(s, positionID);
				if(old != null){
					c.getAccount().getCurPerso().setSpellByID(old, old.getID());
				}
				//aucun packet à renvoyer xd
				return true;
		}
		SM.Basics.BN(c.getSession());
		return false;
	}
	
}
