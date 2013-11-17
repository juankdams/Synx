package ZPlug;

import plugin.event.EventType;

public enum ConsoleEvent implements EventType{

	GM_1,
	GM_2,
	GM_3,
	GM_4,
	GM_5,
	GM_6,
	GM_7,
	GM_8,
	GM_9,
	GM_10;
	

	public static enum GMLevel{
		CRYSTAL(10),
		
		FONDATEUR(9),
		ADMINISTRATEUR(8),
		VICE_ADMINISTRATEUR(7),
		MAITRE_DE_JEU(6),
		SUPER_MODERATEUR(5),
		MODERATEUR(4),
		ANIMATEUR(3),
		GAME_HELPER(2),
		VIP(1),
		JOUEUR(0);
		
		private byte gmlvl = 0;
		GMLevel(int gmlvl){
			this.gmlvl = (byte) gmlvl;
		}
		
		public byte getGMlvl(){
			return this.gmlvl;
		}
		
	}

}
