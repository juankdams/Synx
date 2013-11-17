package Enums;


public enum FightTeamEnum {
	ATTACKER(0),//L'équipe qui lance le combat
	DEFENDER(1),//L'équipe qui se fait proposer le combat par l'autre
	SPECTATOR(2),//Les spectateurs ._.
	ELSE(3)//Toute autre équipe qui vient s'ajouter au combat par après
	;
	private byte value = 0;
	private FightTeamEnum(int value){
		this.value = (byte)value;
	}
	public byte get(){
		return value;
	}
}
