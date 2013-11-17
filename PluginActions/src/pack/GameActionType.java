package pack;

import java.util.HashMap;

import Enums.PlayerState;

public enum GameActionType {
	/*
	 					De Shivas v !
	MOVEMENT(1),
    MAP_CHANGEMENT(2),
    CELL_CHANGEMENT(4),
    CELL_SLIDE(5),
    LIFE_CHANGEMENT(100),
    AP_CHANGEMENT(102),
    KILL_UNIT(103),
    BLOCKED_DAMAGE(105),
    MP_CHANGEMENT(129),
    CLEAR_BUFFS(132),
    INVISIBLE(150),
    SUMMONED(181),
    CAST_SPELL(300),
    SPELL_CRITICAL(301),
    SPELL_FAILURE(302),
    MELEE_ATACK(303),
    INTERACTIVE_OBJECT(500),
    ASK_FIGHT(900),
    ACCEPT_FIGHT(901),
    DECLINE_FIGHT(902),
    JOIN_FIGHT(903),
    FIGHT_AGGRESSION(906),
    FIGHTER_STATE(950),
    TURN_LIST(999);
	 */
	
	
					//Les exemples de packets mis ici, c'est des packets emu ->> client.  et non le contraire ;)
	NOTHING(0),
	MOVEMENT(1),//Bouger sur la map  GA unicActionID ; 1 ; movementPath
	CINEMATIC(2),//GA unicActionID ; 2 ; (isChangingMap ? "" : cinematicID)
	//pas de 3 on dirait ;o
	CELL_CHANGED(4),//GA41;4;25;25,259 -> 41=l'ID unique de l'action. 4=type, 25=perso, 25=perso, 259=newCellID.  �a change juste l'affichage, �a fait juste que tu apparait qqpart dautre, sauf quen fait t'es toujours � la meme place u know vu que l'emu le sait pas.
	
	PDV_CHANGED(100),
    PA_CHANGED(102),
    KILL_UNIT(103),//GA1;103;42;37 -> 42 = killerCharacter, 37 = killedCharacter
    REDUCE_DAMAGE(105),//GA;105;-2;1776617,9 -> -2 = caster, 1776617= target, 9 = dommages réduits
    PM_CHANGED(129),
	
	INVISIBILITE(150),//packetclient GA0;150;37;37,1 (37=persoID) dernier param: si > 0 : deviens invisible, sinon: redeviens visible
	
	ANIMATION(228),//packetclient GA0;228;37;122,101,11,1,6 ->  GA0;228;perso;cell,animID,area(11),action(1),size(6)
	
	LANCER_SORT(300),
	LANCER_SORT_CC(301),//n'existe pas en RCV, juste en SEND vers -> client
	LANCER_SORT_EC(302),//n'existe pas en RCV, juste en SEND vers -> client
	LANCER_SORT_CAC(303),//arme
	LANCER_SORT_CAC_CC(304),//arme en CC
	LANCER_SORT_CAC_EC(305),//arme en EC
	LANCER_SORT_PIEGE(306),
	LANCER_SORT_GLYPHE(307),
	
	ESQUIVE_PA(308),//packetclient GA0;308;37;37,96  -> Leo a esquivé la perte de 96 PA.  (37 = persoID
	ESQUIVE_PM(309),//packetclient GA0;309;37;37,96  -> Leo a esquivé la perte de 96 PM.  (37 = persoID
	
	
	CHALLENGE(900),//Pour envoyer une demande de challenge (défi) à un joueur
	ACCEPT_CHALLENGE(901),//Pour accepter une demande de challenge (défi) venant d'un autre joueur
	REFUSE_CHALLENGE(902),//Pour refuser une demande de challenge (défi) venant d'un autre joueur
	
	JOIN_FIGHT(903),
	//ERROR_ON_JOIN_FIGHT(903), 
	ERROR_CHALLENGE_FULL(903,"c"),
	ERROR_TEAM_FULL(903,"f"),
	ERROR_TEAM_DIFFERENT_ALIGNMENT(903,"a"),
	ERROR_CANT_DO_BECAUSE_GUILD(903,"g"),//getSpeArgs
	ERROR_CANT_DO_TOO_LATE(903,"l"),
	ERROR_CANT_U_ARE_MUTANT(903,"m"),
	ERROR_CANT_BECAUSE_MAP(903,"p"),
	ERROR_CANT_BECAUSE_ON_RESPAWN(903,"r"),
	ERROR_CANT_YOU_OCCUPED(903,"o"),
	ERROR_CANT_YOU_OPPONENT_OCCUPED(903,"z"),
	ERROR_CANT_FIGHT(903,"h"),
	ERROR_CANT_FIGHT_NO_RIGHTS(903,"i"),
	ERROR_ERROR_21(903,"s"),
	ERROR_SUBSCRIPTION_OUT(903,"n"),
	ERROR_A_NOT_SUBSCRIB(903,"b"),
	ERROR_TEAM_CLOSED(903,"f"),
	ERROR_NO_ZOMBIE_ALLOWED(903,"d"),
	/*
	Action impossible sur cette carte. "p"
	Action impossible lorsque vous êtes transformé en monstre.  "m"
	Impossible de rentrer en combat avec ce joueur car il n'est pas prêt.  "r"
	Action impossible car ton abonnement a expiré.  "s"
	Ton alignement ne te permet pas de faire cette action.  "a"
	Impossible de combattre avec ce joueur car il est occupé.   "z"
	Partie pleine  "c"
	Il est trop tard pour rejoindre ce combat.  "l"
	Equipe pleine   "t"
	Action impossible ce joueur n'a pas un compte membre.  "b"
	Ta guilde ne te le permet pas.   "g"
	Mode découverte   "n"
	Pour accéder à la version complète : "n"  (ca vient avec l'autre ligne de "n")
	Vous ne pouvez pas rejoindre un combat JCJ avec plus d'un compte sur ce serveur.  "h"  (style héroique)
	 */
	
	ENTER_FIGHT(905),//case 905:this.api.ui.loadUIComponent("CenterText", "CenterText", {text: this.api.lang.getText("YOU_ARE_ATTAC"), background: true, timer: 2000}, {bForceLoad: true});
	
	ETAT(950),
	ETAT_PORTEUR(950, PlayerState.PORTEUR.get()+""),//porteur = 3
	ETAT_PORTE(950, PlayerState.PORTEE.get()+""),//porté = 8
	
	
	
	EXE_JAVASCRIPT(1000),
	ON_ITEM_USE(1002)
	;
	
	private static HashMap<Short, GameActionType> actionTypes = new HashMap<Short, GameActionType>();
	static{
		for(GameActionType gat : values()){
			if(gat.specialArgs == null){
				actionTypes.put(gat.getType(), gat);
			}
		}
	}
	
	private short type = 0;
	private String specialArgs = null;
	
	private GameActionType(int type){
		this.type = (short) type;
	}
	private GameActionType(int type, String specialArgs){
		this.type = (short) type;
		this.specialArgs = specialArgs;
	}

	public void setType(short type) {
		this.type = type;
	}
	public short getType() {
		return type;
	}

	public String getSpeArgs(){
		if(specialArgs == null){
			return "";
		}
		return specialArgs;
	}
	public void setSpeArgs(String specialArgs){
		this.specialArgs = specialArgs;
	}
	
	

	
	public static GameActionType getGameAction(short actionID){
		return actionTypes.get(actionID);
		/*for(GameActionType gat : values()){
			if(gat.getType() == actionID){
				return gat;
			}
		}
		return null;*/
	}

	
}
