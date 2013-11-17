package Enums;

public enum FightType {
	/*
	public static final int FIGHT_TYPE_CHALLENGE 	= 0;//Défies
	public static final int FIGHT_TYPE_AGRESSION 	= 1;//Aggros
	public static final int FIGHT_TYPE_PVMA			= 2;//?? //prismes
	public static final int FIGHT_TYPE_MXVM			= 3;//??
	public static final int FIGHT_TYPE_PVM			= 4;//PvM
	public static final int FIGHT_TYPE_PVT			= 5;//Percepteur
	public static final int FIGHT_TYPE_PVMU			= 6;//??         // Koliseum? j'penserais pas moi perso mais busta l'utilise comme ca...
	public static final int FIGHT_TYPE_KOLI			= 7;//cbts koliseum
	 */
	
	
	Challenge(0),//Défis
	PVP(1),//Player Versus Player
	PVMA(2),//PvM Alignement (Prisme)
	
	PVM(4),//Player Versus Monster
	PVT(5),//Player Versus TaxCollector (Guildes Percepteurs)
	
	
	PVPC(101), //PvP Channel
	MVM(101), //Monsters Versus Monsters
	
	;

	private byte value = 0;
	private FightType(int value){
		this.value = (byte)value;
	}
	public byte get(){
		return value;
	}
	
	
	
	
}
