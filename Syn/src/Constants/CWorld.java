package Constants;

import java.util.ArrayList;

import Game.DofusGameClient;
import Game.DofusGameServer;

public class CWorld {
	
//	public static ArrayList<CWorld> worlds = new ArrayList<CWorld>();//Liste des CWorlds
	public static final ArrayList<Community> communities = new ArrayList<Community>();//Liste des Communautés
	
	public static final byte STATE_OFFLINE = 0;
	public static final byte STATE_ONLINE = 1;
	public static final byte STATE_SAVING = 2;
	
	public static final byte WORLD_TYPE_NORMAL = 0;
	public static final byte WORLD_TYPE_HEROIC = 1;
	public static final byte WORLD_TYPE_TOURNOI = 2;
	
	
	
	
	public String name = "";
	public short id = 0;
	public String desc = "";
	public String lang = "";
	public byte population = 0;
	public byte type = 0; //normal/héroique
	public byte communityID = 0;
	public String date = "";
	public String otherLangs[] = {};
	
	public CWorld(){
		
	}
	public CWorld(String name, short id, String desc, String lang, byte population, byte type, byte communityID, String date, String otherLangs[]){
		this.name = name;
		this.id = id;
		this.desc = desc;
		this.lang = lang;
		this.population = population;
		this.type = type;
		this.communityID = communityID;
		this.date = date;
		this.otherLangs = otherLangs;
		
	}
	
	// 0-125,,  125-250,,, 250-375,, 375-500
	public void update(DofusGameServer g){
		if(g.clients.size() < (g.getConfig().getMaximumClients() / Population.IDs.length-1)){
			population = Population.IDs[0];
		}else if(g.clients.size() < ((g.getConfig().getMaximumClients()*2) / Population.IDs.length-1)){
			population = Population.IDs[1];
		}else if(g.clients.size() < ((g.getConfig().getMaximumClients()*3) / Population.IDs.length-1)){
			population = Population.IDs[2];
		}else if(g.clients.size() < ((g.getConfig().getMaximumClients()*4) / Population.IDs.length-1)){
			population = Population.IDs[4];
		}
		for(DofusGameClient c : g.clients){
			SM.Account.AH(c);
		}
	}
	
	
	
	
	
	
	public static class Community{
		public String name = "";
		public boolean debug = true;
		public byte id = 0;
		public String langs[] = {};
		public Community(String name, byte id, boolean debug, String[] langs){
			this.name = name;
			this.debug = debug;
			this.id = id;
			this.langs = langs;
		}
		
		/*
		SRC = new Object();
		SRC[0] = {n: "Francophone", d: true, i: 0, c: ["FR", "CH", "BE", "LU"]};
		SRC[1] = {n: "Royaume-Uni & Irlande", d: true, i: 1, c: ["UK", "IE", "GB"]};
		SRC[2] = {n: "Internationale", d: true, i: 2, c: ["XX"]};
		SRC[3] = {n: "Allemande", d: true, i: 3, c: ["DE", "AT", "LI"]};
		SRC[4] = {n: "Espagnole", d: true, i: 4, c: ["ES", "AD", "AR", "CK", "MX"]};
		SRC[5] = {n: "Russe", d: true, i: 5, c: ["RU"]};
		SRC[6] = {n: "Brésilienne", d: true, i: 6, c: ["PT", "BR"]};
		SRC[7] = {n: "Néerlandaise", d: true, i: 7, c: ["NL"]};
		SRC[9] = {n: "Italienne", d: true, i: 9, c: ["IT"]};
		SRC[10] = {n: "Japonaise", d: true, i: 10, c: ["JP"]};
		SRC[99] = {n: "Debug", d: false, i: 99, c: []};
		
		
		<Community n="Francophone" d="true" i="0" c="FR-CH-BE-LU"></Community>
		<Community n="Royaume-Uni & Irlande" d="true" i="1" c="UK-IE-GB"></Community>
		<Community n="Internationale" d="true" i="2" c="XX"></Community>
		<Community n="Allemande" d="true" i="3" c="DE-AT-LI"></Community>
		<Community n="Espagnole" d="true" i="4" c="ES-AD-AR-CK-MX"></Community>
		<Community n="Russe" d="true" i="5" c="RU"></Community>
		<Community n="Brésilienne" d="true" i="6" c="PT-BR"></Community>
		<Community n="Néerlandaise" d="true" i="7" c="NL"></Community>
		<Community n="Italienne" d="true" i="9" c="IT"></Community>
		<Community n="Japonaise" d="true" i="10" c="JP"></Community>
		<Community n="Debug" d="false" i="99" c=""></Community>
		 */
	}
	public static class Population{
		/*
		SRP = new Array();
		SRPW = new Array();
		SRP[0] = "Recommandé ";
		SRPW[0] = 1;
		SRP[1] = "Moyenne";
		SRPW[1] = 2;
		SRP[2] = "Elevée";
		SRPW[2] = 3;
		SRP[3] = "Coming soon";
		SRPW[3] = 99;
		SRP[4] = "Complet";
		SRPW[4] = 4;
		 */
		/** "Recommandé", "Moyenne", "Élevée", "Coming soon", "Complet" */
		public static final String names[] = {"Recommandée", "Moyenne", "Élevée", "Coming soon", "Complet"};
		/** 1, 2, 3, 99, 4 */
		public static final byte IDs[] = {1, 2, 3, 99, 4};
		
		
	}
	
	/*
	SRVT = new Object();
	SRVT[1] = {l: "MERCENARY_CLAN", d: "Clan des mercenaires"};
	SRVT[2] = {l: "MERCENARY_LEADER", d: "Marcel Heunair"};
	SRVT[4] = {l: "MERCENARY_SHORT_NAME", d: "Mercenaire"};
	SRVT[3] = {l: "MERCENARY_INTRONIZER", d: "Promotion vers"};
	SRVT[31] = {l: "EVENT_HOUSE_NAME", d: "étage à louer"};
	
	SRVC = new Object();
	SRVC["31|3"] = "Etage Zooooooornal";
	SRVC["2|2"] = "(Ne pas traduire)";
	SRVC["1|1"] = "Clan de Sériane-Kerm";
	SRVC["1|6"] = "Clan de N�dora Riem";
	SRVC["1|5"] = "Clan des Selenytes";
	SRVC["1|2"] = "Clan des Samoulailles";
	SRVC["1|3"] = "Clan des St�res";
	SRVC["4|6"] = "Nédora";
	SRVC["3|6"] = "Nédorisateur";
	SRVC["3|5"] = "Selenisateur";
	SRVC["4|5"] = "Selenyte";
	SRVC["2|1"] = "Kawet";
	SRVC["1|666"] = "SHADOW DOOM HELL��� ";
	SRVC["4|2"] = "Samoulaille";
	SRVC["3|2"] = "Samoulailliseur";
	SRVC["4|3"] = "St�re";
	SRVC["3|3"] = "Stérisateur";
	SRVC["4|1"] = "Sériane";
	SRVC["3|1"] = "Sérianiseur";
	SRVC["4|666"] = "de Nimaoh";
	SRVC["4|4"] = "Nephthys";
	SRVC["3|4"] = "Nephthysateur";
	SRVC["1|4"] = "La Caravane des Nephthys";
	 */
	
	
}