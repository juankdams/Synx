package Enums;


/**
 * J'fais comme si on parlait d'une fille ici avec tous les EE 
 * à cause des accents 'é' qu'il devrait y avoir sur la plupart des états.
 * Exemple au lieu de dire GELÉ, j'dis GELEE. Mais les mots comme ENDORMI restent inchangés
 * Donc seulement quand il peut y avoir confusion.
 * @author Robyn
 */
public enum PlayerState {
	//On peut effectivement avoir plusieurs états en même temps actifs sur le personnage
	//Exemple: Chevauchant+Saoul+Flou+Corrompu en meme temps
	
	
	NORMAL(0),
	SOUL(1,1),
	CHERCHEUR_AME(2),
	PORTEUR(3,1),
	PEUREUX(4),
	DESORIENTE(5),
	ENRACINE(6),
	PESANTEUR(7),
	PORTEE(8),
	MOTIVATION_SYLVESTRE(9),
	APPRIVOISEMENT(10),
	CHEVAUCHANT(11),
	PAS_SAGE(12),
	VRAIMENT_PAS_SAGE(13),
	ENNEIGEE(14),
	EVEILLEE(15),
	FRAGILISEE(16),
	SEPAREE(17),
	GELEE(18,1),
	FISSUREE(19,1),
	//20 à 26 n'existent pas ...
	ENDORMI(26),
	LEOPARDO(27),
	LIBRE(28),
	
	GLYPHE_IMPAIRE(29),
	GLYPHE_PAIRE(30),
	
	ENCRE_PRIMAIRE(31),
	ENCRE_SECONDAIRE(32),
	ENCRE_TERTIAIRE(33),
	ENCRE_QUATERNAIRE(34),
	
	ENVIE_TUER(35),
	ENVIE_PARALYZER(36),
	ENVIE_MAUDIRE(37),
	ENVIE_EMPOISONENR(38),
	
	FLOU(39),
	CORROMPU(40),
	SILENCIEUX(41,1),
	AFFAIBLI(42),
	
	WAIT_OVNI(43),
	WAIT_PAS_CONTENTE(44),
	WAIT_CONTENTE(46),
	WAIT_MAUVAISE_HUMEUR(47),
	
	CONFUS(48),
	GOULIFIEE(49),
	ALTRUISTE(50),
	
	WIP_CHATIMENT_AGILE(51),
	WIP_CHATIMENT_OSE(52),
	WIP_CHATIMENT_SPIRITUEL(53),
	WIP_CHATIMENT_VITALESQUE(54),
	
	RETRAITEE(55),
	WIP_INVULNERABLE(56),
	COMPTE_A_REBOURS_2(57),
	COMPTE_A_REBOURS_1(58),
	DEVOUEE(60),
	BAGARREUR(61),
	
	
	
	
	InPvpChannelPreparing(100),
	InPvpChannelReady(101),
	InPvpChannelCombating(102),
	InPvpChannelLooting(103),
	
	InFightReady(104),
	
	
	;
	
	
	/*
	FILE_BEGIN = true;
	System.security.allowDomain(_parent._url);
	VERSION = 197;
	ST = new Object();
	ST[0] = {n: "Neutre", p: 0};
	ST[1] = {n: "Saoul", p: 1};
	ST[2] = {n: "Chercheur d\'âmes", p: 0};
	ST[3] = {n: "Porteur", p: 1};
	ST[4] = {n: "Peureux", p: 0};
	ST[5] = {n: "Désorienté ", p: 0};
	ST[6] = {n: "Enraciné ", p: 0};
	ST[7] = {n: "Pesanteur", p: 0};
	ST[8] = {n: "Porté ", p: 0};
	ST[9] = {n: "Motivation Sylvestre", p: 0};
	ST[10] = {n: "Apprivoisement", p: 0};
	ST[11] = {n: "Chevauchant", p: 0};
	ST[12] = {n: "Pas sage", p: 0};
	ST[13] = {n: "Vraiment pas sage", p: 0};
	ST[14] = {n: "Enneigé ", p: 0};
	ST[15] = {n: "Eveillé ", p: 0};
	ST[16] = {n: "Fragilisé ", p: 0};
	ST[17] = {n: "Séparé ", p: 0};
	ST[18] = {n: "Gelé ", p: 1};
	ST[19] = {n: "Fissuré ", p: 1};
	ST[26] = {n: "Endormi", p: 0};
	ST[27] = {n: "Léopardo", p: 0};
	ST[28] = {n: "Libre", p: 0};
	ST[29] = {n: "Glyphe impaire", p: 0};
	ST[30] = {n: "Glyphe paire", p: 0};
	ST[31] = {n: "Encre primaire", p: 0};
	ST[32] = {n: "Encre secondaire", p: 0};
	ST[33] = {n: "Encre tertiaire", p: 0};
	ST[34] = {n: "Encre quaternaire", p: 0};
	ST[35] = {n: "Envie de tuer", p: 0};
	ST[36] = {n: "Envie de paralyser", p: 0};
	ST[37] = {n: "Envie de maudire", p: 0};
	ST[38] = {n: "Envie d\'empoisonner", p: 0};
	ST[39] = {n: "Flou", p: 0};
	ST[40] = {n: "Corrompu", p: 0};
	ST[41] = {n: "Silencieux", p: 1};
	ST[42] = {n: "Affaibli", p: 0};
	ST[43] = {n: "[wait] OVNI", p: 0};
	ST[44] = {n: "[wait] Pas contente", p: 0};
	ST[46] = {n: "[wait] Contente", p: 0};
	ST[47] = {n: "[wait] Mauvaise humeur", p: 0};
	ST[48] = {n: "Confus", p: 0};
	ST[49] = {n: "Goulifié ", p: 0};
	ST[50] = {n: "Altruiste", p: 0};
	ST[51] = {n: "[wip]Châtiment agile", p: 0};
	ST[52] = {n: "[wip]Châtiment osé ", p: 0};
	ST[53] = {n: "[wip]Châtiment spirituel", p: 0};
	ST[54] = {n: "[wip]Châtiment vitalesque", p: 0};
	ST[55] = {n: "Retraité ", p: 0};
	ST[56] = {n: "[wip]Invulnérable", p: 0};
	ST[57] = {n: "Compte à rebours - 2", p: 0};
	ST[58] = {n: "Compte à rebours - 1", p: 0};
	ST[60] = {n: "Dévoué ", p: 0};
	ST[61] = {n: "Bagarreur", p: 0};
	FILE_END = true;
	 */
	

	public static enum StateRelation {
		EXIT_STATE(0),
		ENTER_STATE(1);
		private byte relation = 0;
		private StateRelation(int i){
			this.relation = (byte) i;
		}
		public byte get(){
			return relation;
		}
		public static StateRelation get(boolean hasState){
			return hasState ? ENTER_STATE : EXIT_STATE;
		}
	}
	
	
	private byte state = 0;
	private byte canBeForbiddenOrRequired = 0;
	
	private PlayerState(int... params){
		state = (byte)params[0];
		if(params.length == 2){
			canBeForbiddenOrRequired = (byte) params[1];
		}
	}
	public byte get() {
		return state;
	}
	/**
	 * S'il fait parti des États qui sont utilisables comme états de contrainte dans les sorts comme interdits ou requis.
	 * @return
	 */
	public byte getCanBeForbiddenOrRequired() {
		return canBeForbiddenOrRequired;
	}
	public static PlayerState getState(byte state){
		for(PlayerState ps : values()){
			if(ps.get() == state){
				return ps;
			}
		}
		return null;
	}
}
