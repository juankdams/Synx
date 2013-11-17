package parsers.dofus;

import Enums.SmileyEnum;
import Game.DofusGameClient;
import Handlers.GHandler;
import Misc.Utils;
import Plugins.Abstractions.AbstractPacketParser;

public class BasicParser extends AbstractPacketParser<DofusGameClient, String> {


	@Override
	public boolean parse(DofusGameClient c, String packet){
		//Core.Syn.d("Char at length-1 du message : "+(packet.charAt(packet.length()-1)+""));
		while((packet.charAt(packet.length()-1)+"").equals("\\|")){
			packet = packet.substring(0, packet.length()-2).trim();
		}
		switch(packet.charAt(1)){
			case 'S'://Smileys
				//Core.Syn.d("parseBasics, emotes : le chiffre vérifé par pattern est : "+isInteger);
				if(Utils.isParsableInteger(packet.substring(2)) == false){
					GHandler.packetCantParse(c, packet, "GGHandler.parseBasics.Smileys: impossible de parser l'ID du smiley en int");
				}	
				if(SmileyEnum.getSmiley(Integer.parseInt(packet.substring(2))) == null){
					break;
				}
				SM.chat.cS(c.getAccount().getCurPerso(), Integer.parseInt(packet.substring(2)));//envoie le packet d'emote au layer.
				return true;
			case 'T'://TODO: GetServerTimer exemple //[Send] >> BT1355840128776
				/*
				 case "T":
                {
                    this.aks.Basics.onReferenceTime(sData.substr(2));
                    break;
                }
				 */
				
				break;
			case 'D'://TODO: GetServerDate exemple //[Send] >> BD642|11|18
				/*
				 case "D":
                {
                    this.aks.Basics.onDate(sData.substr(2));
                    break;
                } 
				 */
				SM.Basics.BD(c.getSession());//[Send] >> BD642|11|18
				return true;
			case 'M'://BasicMessage  BMLeo|salut|
				return ChatParser.parseMessage(c, packet);
			case 'A'://Admin
				return ConsoleParser.parse(c, packet.trim().substring(2, packet.trim().length()));
		}
		return false;
	}
	
	
	
}
