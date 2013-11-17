package Enums;

import Core.Exceptions;

public enum CharacteristicType {
	//PODS,?
	
	MOVEMENT(-1),
	LIFE_POINTS(0),
	PA(1),
	KAMAS(2),
	STATS_POINTS(3),
	SPELL_POINTS(4),
	LEVEL(5),
	//-- 6
	//-- 7 
	//-- 8
	//-- 9
	FORCE(10),
	VITALITE(11),
	SAGESSE(12),
	CHANCE(13),
	AGILITE(14),
	INTELLIGENCE(15),
	DOM(16),
	/**Pourrait aussi être appelé DOM_MULTIPLY desfois*/
	DOM_FACTOR(17),
	COUP_CRITIQUE(18),
	PORTEE(19),
	RESISTANCE_DOM_MAGIQUE(20),
	RESISTANCE_DOM_PHYSIQUE(21),
	EXPERIENCE(22),
	PM(23),
	INVISIBILITE(24),
	DOM_PERCENT(25),
	INVOCATIONS_MAX(26),
	ESQUIVE_PA(27),
	ESQUIVE_PM(28),
	ENERGY(29),
	ALIGNEMENT(30),
	/**A.K.A MAITRISE*/
	WEAPON_DAMAGES_PERCENT(31),
	DOM_PHYSIQUE(32),
	
	RESIST_TERRE_PERCENT(33),
	RESIST_EAU_PERCENT(35),
	RESIST_AIR_PERCENT(36),
	RESIST_FEU_PERCENT(34),
	RESIST_NEUTRE_PERCENT(37),
	
	GFX(38),
	ECHEC_CRITIQUE(39),
	//-- 40
	//-- 41
	//-- 42
	//-- 43
	INITIATIVE(44),
	//-- 45
	//-- 46
	//-- 47
	PROSPECTION(48),
	SOIN(49),
	DOM_RENVOI(50),
	ENERGY_LOST(51),
	HONOR(52),
	DISHONOR(53),
	
	RESIST_TERRE(54),
	RESIST_EAU(56),
	RESIST_AIR(57),
	RESIST_FEU(55),
	RESIST_NEUTRE(58),
	
	RESIST_TERRE_PERCENT_PVP(59),
	RESIST_EAU_PERCENT_PVP(61),
	RESIST_AIR_PERCENT_PVP(62),
	RESIST_FEU_PERCENT_PVP(60),
	RESIST_NEUTRE_PERCENT_PVP(63),
	
	RESIST_TERRE_PVP(64),
	RESIST_EAU_PVP(66),
	RESIST_AIR_PVP(67),
	RESIST_FEU_PVP(65),
	RESIST_NEUTRE_PVP(68),

	DOM_PIEGE_PERCENT(69),
	DOM_PIEGE(70),
	ETAT(71),
	CHANCE_CAPTURE_DD(72),
	BONUS_XP_DD(73),
	CONFUSION_HORAIRE(74),
	DOM_PERMANENT(75),//= les dommages qu'on perd sur les pdvMax à cause de 10% des dommages reçus en combat
	

	
	
	
	XP_MAITRISE_EPEE(100),
	XP_MAITRISE_ARC(101),
	XP_MAITRISE_BATON(102),
	XP_MAITRISE_BAGUETTE(103),
	XP_MAITRISE_DAGUES(104),
	XP_MAITRISE_HACHE(105),
	XP_MAITRISE_MARTEAU(106),
	XP_MAITRISE_PELLE(107),
	//XP_MAITRISE_FAUX(108), 	  //pas de maitrise associée pour ceux-là.
	//XP_MAITRISE_ARBALETE(109), 
	//XP_MAITRISE_PIOCHE(110),
	//XP_MAITRISE_OUTIL(111),
	
	;
	
	private byte ID = 0;
	private CharacteristicType(int id){
		this.ID = (byte)id;
	}
	public byte get(){
		return this.ID;
	}
	public static CharacteristicType getCharacteristique(byte ID){
		
		for(CharacteristicType ct : values()){
			if(ct.ID == ID){
				return ct;
			}
		}
		Exceptions.throwNullPointerException("");
		return null;
	}
	
	
	/* Trouvé dans dofus.managers.CharacteristicsManager
	
	 ASSetPropFlags(_loc1, null, 1);
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).LIFE_POINTS = 0;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).ACTION_POINTS = 1;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).GOLD = 2;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).STATS_POINTS = 3;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).SPELL_POINTS = 4;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).LEVEL = 5;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).STRENGTH = 10;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).VITALITY = 11;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).WISDOM = 12;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).CHANCE = 13;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).AGILITY = 14;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).INTELLIGENCE = 15;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DAMAGES = 16;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DAMAGES_FACTOR = 17;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DAMAGES_PERCENT = 25;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).CRITICAL_HIT = 18;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).RANGE = 19;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DAMAGES_MAGICAL_REDUCTION = 20;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DAMAGES_PHYSICAL_REDUCTION = 21;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).EXPERIENCE_BOOST = 22;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).MOVEMENT_POINTS = 23;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).INVISIBILITY = 24;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).MAX_SUMMONED_CREATURES_BOOST = 26;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DODGE_PA_LOST_PROBABILITY = 27;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).DODGE_PM_LOST_PROBABILITY = 28;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).ENERGY_POINTS = 29;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).ALIGNMENT = 30;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).WEAPON_DAMAGES_PERCENT = 31;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).PHYSICAL_DAMAGES = 32;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).EARTH_ELEMENT_PERCENT = 33;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).FIRE_ELEMENT_PERCENT = 34;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).WATER_ELEMENT_PERCENT = 35;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).AIR_ELEMENT_PERCENT = 36;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).NEUTRAL_ELEMENT_PERCENT = 37;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).GFX = 38;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).CRITICAL_MISS = 39;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).INITIATIVE = 44;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).PROSPECTION = 48;
    (_global.dofus.managers.CharacteristicsManager = function (oSprite, oAPI)
    {
        super();
        this.initialize(oSprite, oAPI);
    }).STATE = 71;
	 */
}
