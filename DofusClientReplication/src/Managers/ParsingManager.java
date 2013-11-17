package Managers;

import java.util.HashMap;

import Core.Dofus;
import Game.GClient;
import Login.LClient;
import Parsers.AbstractPacketParser;
import Parsers.AccountParser;
import Parsers.AreasParser;
import Parsers.BasicParser;
import Parsers.ChatParser;
import Parsers.EmotesParser;
import Parsers.FightsParser;
import Parsers.GameParser;
import Parsers.HelloParser;
import Parsers.InfosParser;
import Parsers.ObjectsParser;
import Parsers.SpellsParser;

public class ParsingManager {
	
	/**TODO: Vider les "packetToIgnore" pour ne justement pas les ignorer.*/
	private static final String[] packetsToIgnore = {};
	private static final String[] delimitersToIgnore = {"Ir", "@"};
	private static HashMap<Character, AbstractPacketParser> parsers = new HashMap<Character, AbstractPacketParser>();
	
	
	static{
		initiateParsers();
	}
	
	
	private static boolean isToIgnore(String packet){
		for(String s : packetsToIgnore){
			if(packet.equals(s)){
				Dofus.w("Packet ignoré par le ParsingManager :"+packet+"..");
				return true;
			}
		}
		for(String s : delimitersToIgnore){
			if(packet.startsWith(s)){
				//log.info("Packet ignoré par le ParsingManager :"+packet+"..");
				return true;
			}
		}
		return false;
	}
	
	public static boolean parse(LClient c, String packet){
		if(isToIgnore(packet)){
			return true;
		}
		Dofus.w("L [RECV] << "+packet);
		AbstractPacketParser ip = parsers.get(packet.charAt(0));
		if(ip != null){
			return ip.parse(c, packet);
		}else{
			Dofus.w("L Parser non-créé pour le char ("+packet.charAt(0)+")");
			return false;
		}
	}
	
	
	public static boolean parse(GClient c, String packet){
		if(isToIgnore(packet)){
			return true;
		}
		Dofus.w("G [RECV] << "+packet);
		AbstractPacketParser ip = parsers.get(packet.charAt(0));
		if(ip != null){
			return ip.parse(c, packet);
		}else{
			Dofus.w("G Parser non-créé pour le char ("+packet.charAt(0)+")");
			return false;
		}
	}
	
	public static HashMap<Character, AbstractPacketParser> getParsers(){
		return parsers;
	}
	public static AbstractPacketParser getParser(char a){
		return parsers.get(a);
	}
	public static HashMap<Character, AbstractPacketParser> setParser(char a, AbstractPacketParser iparser){
		parsers.put(a, iparser);
		return parsers;
	}
	public void unload() {
		parsers.clear();
		parsers = new HashMap<Character, AbstractPacketParser>();
	}
	
	
	
	public static void initiateParsers(){
		getParsers().clear();
		//setParser('@', new CrystalParser());
		setParser('A', new AccountParser());
		setParser('a', new AreasParser());

		setParser('B', new BasicParser());
		// y'a pas de 'b'
		
		//setParser('C', new ConquestParser());
		setParser('c', new ChatParser());
		
		//setParser('D', new DialogsParser());
		//setParser('d', new DocumentsParser());
		
		//setParser('E', new ExchangesParser());
		setParser('e', new EmotesParser());
		
		//setParser('F', new RelationsParser());
		setParser('f', new FightsParser());

		setParser('G', new GameParser());
		//setParser('g', new GuildsParser());

		setParser('H', new HelloParser());
		//setParser('h', new HousesParser());
		
		setParser('I', new InfosParser());
		setParser('i', getParser('F'));//reprend le même RelationsParser que pour les Friends
		
		//setParser('J', new JobsParser());
		// y'a pas de 'j'
		
		//setParser('K', new KeyParser());
		// y'a pas de 'k'
		//l, m, n 
		setParser('O', new ObjectsParser());
		//ya pas de 'o'
		
		//setParser('P', new PartyParser());
		//setParser('p', new PingParser());
		
		//setParser('Q', new QuestsParser());
		setParser('q', getParser('p'));//reprend le PingParser
		
		//setParser('R', new RidesParser());
		setParser('r', getParser('p'));
		
		setParser('S', new SpellsParser());
		//pas de 's'
		
		//setParser('T', new TutorialsParser());
		//pas de 't'
		
		//pas de 'u, 'U', 'v', 'V'
		
		//setParser('W', new WayPointsParser());
		//pas de 'w'
		
		//pas de 'x', 'X', 'y', 'Y', 'z', 'Z'
	}

	
	
	
}
