package pack;

import static Enums.CharacteristicType.AGILITE;
import static Enums.CharacteristicType.BONUS_XP_DD;
import static Enums.CharacteristicType.CHANCE;
import static Enums.CharacteristicType.CHANCE_CAPTURE_DD;
import static Enums.CharacteristicType.CONFUSION_HORAIRE;
import static Enums.CharacteristicType.COUP_CRITIQUE;
import static Enums.CharacteristicType.DISHONOR;
import static Enums.CharacteristicType.DOM;
import static Enums.CharacteristicType.DOM_FACTOR;
import static Enums.CharacteristicType.DOM_PERMANENT;
import static Enums.CharacteristicType.DOM_PIEGE;
import static Enums.CharacteristicType.DOM_PIEGE_PERCENT;
import static Enums.CharacteristicType.DOM_RENVOI;
import static Enums.CharacteristicType.ECHEC_CRITIQUE;
import static Enums.CharacteristicType.ENERGY;
import static Enums.CharacteristicType.ESQUIVE_PA;
import static Enums.CharacteristicType.ESQUIVE_PM;
import static Enums.CharacteristicType.FORCE;
import static Enums.CharacteristicType.GFX;
import static Enums.CharacteristicType.HONOR;
import static Enums.CharacteristicType.INITIATIVE;
import static Enums.CharacteristicType.INTELLIGENCE;
import static Enums.CharacteristicType.INVOCATIONS_MAX;
import static Enums.CharacteristicType.LIFE_POINTS;
import static Enums.CharacteristicType.MOVEMENT;
import static Enums.CharacteristicType.PA;
import static Enums.CharacteristicType.PM;
import static Enums.CharacteristicType.PORTEE;
import static Enums.CharacteristicType.PROSPECTION;
import static Enums.CharacteristicType.RESISTANCE_DOM_MAGIQUE;
import static Enums.CharacteristicType.RESISTANCE_DOM_PHYSIQUE;
import static Enums.CharacteristicType.RESIST_AIR;
import static Enums.CharacteristicType.RESIST_AIR_PERCENT;
import static Enums.CharacteristicType.RESIST_AIR_PERCENT_PVP;
import static Enums.CharacteristicType.RESIST_AIR_PVP;
import static Enums.CharacteristicType.RESIST_EAU;
import static Enums.CharacteristicType.RESIST_EAU_PERCENT;
import static Enums.CharacteristicType.RESIST_EAU_PVP;
import static Enums.CharacteristicType.RESIST_FEU;
import static Enums.CharacteristicType.RESIST_FEU_PERCENT;
import static Enums.CharacteristicType.RESIST_FEU_PERCENT_PVP;
import static Enums.CharacteristicType.RESIST_FEU_PVP;
import static Enums.CharacteristicType.RESIST_NEUTRE;
import static Enums.CharacteristicType.RESIST_NEUTRE_PERCENT;
import static Enums.CharacteristicType.RESIST_NEUTRE_PERCENT_PVP;
import static Enums.CharacteristicType.RESIST_NEUTRE_PVP;
import static Enums.CharacteristicType.RESIST_TERRE;
import static Enums.CharacteristicType.RESIST_TERRE_PERCENT;
import static Enums.CharacteristicType.RESIST_TERRE_PERCENT_PVP;
import static Enums.CharacteristicType.RESIST_TERRE_PVP;
import static Enums.CharacteristicType.SAGESSE;
import static Enums.CharacteristicType.SOIN;
import static Enums.CharacteristicType.VITALITE;
import static Enums.CharacteristicType.WEAPON_DAMAGES_PERCENT;

import java.util.HashMap;

import Enums.CharacteristicType;
import Plugins.Interfaces.IEffectType;

public enum SpellEffectType implements IEffectType{
	
	NO_EFFECT(-1),
	
	TELEPORT_DISTANCE_X_CELLS_MAX(4,MOVEMENT),//E[4] = {d: "Téléporte à une distance de #1 cases maximum.", c: -1, o: ""};
	GO_BACK_X_CASE(5,MOVEMENT),//Recule de X cases
	GO_FORWARD_X_CASE(6,MOVEMENT),//Avance de X cases
	DIVORCE(7),
	EXCHANGE_PLACE(8),//Échange de places
	ESCAPE_HIT_BY_BACKING(9),//Recule de une case pour éviter un coup.
	PERMITS_USE_EMOTE(10),//Permet d'utiliser une emote
	CHANGE_GAME_TIME_PLAYER(13),
	LIFT_PLAYER(50),//Porte un joueur
	THROW_PLAYER(51),//Jete un joueur
	STEAL_X_PM(77,true),//Vole X PM
	ADD_X_PM(78,true),//Ajoute X PM
	PERCENTCHANCE_DAMAGE_TAKEN_xX_OR_HEAL_xX(79,LIFE_POINTS), //E[79] = {d: "#3% dommages subis x#1, sinon soigné de x#2", c: 0, o: ""};
	//Ya pas de 80
	REGIVEN_PDVS_X(81,LIFE_POINTS,true),//Redonne X PDV
	STEAL_X_PDV_FIX(82,LIFE_POINTS,true),//Vole X pdv fixe
	//Ya pas de 83  
	STEAL_X_PA(84,true),//Vole X PA
	DAMAGE_XPERCENT_OF_ATTAQUANTLIFE_WATER(85,LIFE_POINTS,true),//Dommages de X% de la vie de l'attaquant (eau)
	DAMAGE_XPERCENT_OF_ATTAQUANTLIFE_EARTH(86,LIFE_POINTS,true),//Dommages de X% de la vie de l'attaquant (terre)
	DAMAGE_XPERCENT_OF_ATTAQUANTLIFE_AIR(87,LIFE_POINTS,true),//Dommages de X% de la vie de l'attaquant (air)
	DAMAGE_XPERCENT_OF_ATTAQUANTLIFE_FIRE(88,LIFE_POINTS,true),//Dommages de X% de la vie de l'attaquant (feu)
	DAMAGE_XPERCENT_OF_ATTAQUANTLIFE_NEUTRAL(89,LIFE_POINTS,true),//Dommages de X% de la vie de l'attaquant (neutre)
	GIVE_XPERCENT_OF_HISLIFE(90,LIFE_POINTS,true),//Donne X% de sa vie
	
	//Les attaques élémentaires classiques de base
	STEAL_X_PDV_WATER(91,CHANCE,true),//Vole X PDV (eau)
	STEAL_X_PDV_EARTH(92,FORCE,true),//Vole X PDV (terre)
	STEAL_X_PDV_AIR(93,AGILITE,true),//Vole X PDV (air)
	STEAL_X_PDV_FIRE(94,INTELLIGENCE,true),//Vole X PDV (feu)
	STEAL_X_PDV_NEUTRAL(95,FORCE,true),//Vole X PDV (neutre)
	DAMAGE_X_WATER(96,CHANCE,true),//Dommages de X (eau)
	DAMAGE_X_EARTH(97,FORCE,true),//Dommages de X (terre)
	DAMAGE_X_AIR(98,AGILITE,true),//Dommages de X (air)
	DAMAGE_X_FIRE(99,INTELLIGENCE,true),//Dommages de X (feu)
	DAMAGE_X_NEUTRAL(100,FORCE,true),//Dommages de X (neutre)
	
	PA_LOST_ON_TARGET(101, PA, '/',true),//PA perdus à la cible
	//Ya pas de 102,103,104 :P
	DAMAGE_REDUCT_X(105,DOM,'+',true),     //E[105] = {d: "Dommages réduits de  #1{~1~2 à }#2", c: 16, o: "+", j: true};
	RETURN_SPELL_XLEVELMAX(106,CharacteristicType.ALIGNEMENT),//Renvoi un sort de niveau X maximum
	RETURN_DAMAGE_X(107,WEAPON_DAMAGES_PERCENT,true),//Renvoi X dommages. E[107] = {d: "Dommages retournés : #1{~1~2 à }#2", c: 31, o: "", j: true};
	REGIVEN_PDVS_XX(108,LIFE_POINTS,true),//TODO: revoir la définition de REGIVEN_PDVS_XX et REGIVEN_PDVS_X (Enums.EffectType)
	DAMAGE_X_FOR_CASTER(109,LIFE_POINTS,'-',true),//Dommage de X pour le lanceur
	PLUS_X_LIFE(110,LIFE_POINTS,'+',true),//+X PDV   //oppositeEffect = MINUS_X_LIFE setté depuis luimeme (voir son constructor et le setOppositeEffect)
	PLUS_X_PA(111,PA,'+',true),//+X PA   //oppositeEffect = MINUS_X_PA setté depuis luimeme (voir son constructor et le setOppositeEffect)
	PLUS_X_DAMAGE(112,DOM,'+',true),//+X dom
	DOUBLE_DAMAGE_OR_REGIVE_X_PDV(113,LIFE_POINTS,true),//Doubles les dommages ou redonne X PDV
	MULTIPLY_DOM(114,DOM_FACTOR,'+'),//Multiplie les dommages
	PLUS_X_CRITICAL_HITS(115,COUP_CRITIQUE,'+',true),//+X aux coups critiques
	MINUS_X_RANGE(116,PORTEE,'-',true),//-X portée  //opposite = PLUS_X_RANGE
	PLUS_X_RANGE(117,PORTEE,'+',true,MINUS_X_RANGE),//+X portée
	PLUS_X_FORCE(118,FORCE,'+',true),//+X force
	PLUS_X_AGILITE(119,AGILITE,'+',true),//+X agilite  //opposite MINUS_X_AGILITE
	ADD_X_PA(120,'+',true),//Ajoute +X PA
	PLUS_X_DAMAGES(121,DOM,'+',true),//+ X dommages
	PLUS_X_CRITICAL_FAILS(122,ECHEC_CRITIQUE,'-',true),//+ X aux coups critiques
	PLUS_X_CHANCE(123,CHANCE,'+',true),//+ X chance     //opposite MINUS_X_CHANCE
	PLUS_X_SAGESSE(124,SAGESSE,'+',true),//+ X sagesse  //opposite MINUS_X_SAGESSE
	PLUS_X_VITALITE(125,VITALITE,'+',true),//+ X Vitalite  //opposite MINUS_X_VITALITE
	PLUS_X_INTELLIGENCE(126,INTELLIGENCE,'+',true),//+ X intelligence //opposite MINUS_X_INTELLIGENCE
	
	PM_LOST_X(127,PM,'-',true),//PM perdus : X
	PLUS_X_PM(128,PM,'+',true),//Ajoute X PM  //opposite = MINUS_X_PM
	STEAL_X_KAMAS(130,MOVEMENT,true),//Vole X kamas 
	X_PA_USED_LOSE_X_PDV(131,LIFE_POINTS,'-'),//
	REMOVE_ENCHANTINGS(132,MOVEMENT),//Retire les enchantements
	PA_LOST_X_FOR_CASTER(133,PA,'-',true),//PA perdus pour le lanceur : X 
	PM_LOST_X_FOR_CASTER(134,PM,'-',true),//PM perdus pour le lanceur : X
	RANGE_OF_CASTER_REDUCTED_X(135,PORTEE,'-',true),//Réduit la portée du lanceur de X 
	RANGE_OF_CASTER_AUGMENTED_X(136,PORTEE,'+',true),//Augmente la portée du lanceur de X 
	DAMAGE_PHYSICAL_OFCASTER_AUGMENTED_X(137,DOM,'+',true),//Augmente les dommages physiques du lanceur de X
	AUGMENTS_DAMAGE_XFACTOR(138,DOM_FACTOR,'+',true),//Augmente les dommages de X%
	REGIVE_X_ENERGY(139,ENERGY,'+',true),//Redonne X énergie
	PASS_NEXT_TURN(140,MOVEMENT),//Fait passer le prochain tour
	KILL_TARGET(141,LIFE_POINTS),//Tue la cible   (doom)
	
	PLUS_X_DAMAGE_PHYSICAL(142,DOM,'+',true),//E[142] = {d: "+#1{~1~2 à }#2 aux dommages physiques", c: 16, o: "+", j: true};
	REGIVEN_PDVS(143,LIFE_POINTS,true),			//E[143] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "", j: true};
	DAMAGES_X_NOBOOSTED(144,true),		//E[144] = {d: "Dommages : #1{~1~2 à }#2 (non boostés)", c: 0, o: "-", j: true};
	MINUS_DAMAGES(145,DOM,true),			//E[145] = {d: "-#1{~1~2 à }#2 aux dommages", c: 16, o: "-", j: true};
	CHANGE_LYRICS(146,GFX),			//E[146] = {d: "Change les paroles", c: 38, o: ""};
	RESSUCITATE_ALLY(147,LIFE_POINTS),		//E[147] = {d: "Ressuscite un allié ", c: 0, o: ""};
	SOMEONES_FOLLOWING_YOU(148),	//E[148] = {d: "Quelqu\'un vous suit !", c: 0, o: ""};
	CHANGE_APPEARANCE(149,GFX),      //	E[149] = {d: "Change l\'apparence", c: 38, o: ""};
	MAKE_INVISIBLE(150,24,'+'),//E[150] = {d: "Rend le personnage invisible", c: 24, o: "+"};
	
	MINUS_X_CHANCE(152,CHANCE,'-',true,PLUS_X_CHANCE),//-X chance
	MINUS_X_VITALITE(153,VITALITE,'-',true,PLUS_X_VITALITE),//-X vitalite   //opposite = PLUS_X_VITALITY
	MINUS_X_AGILITE(154,AGILITE,'-',true,PLUS_X_AGILITE),//-X agilite
	MINUS_X_INTELLIGENCE(155,INTELLIGENCE,'-',true,PLUS_X_INTELLIGENCE),//-X intelligence
	MINUS_X_SAGESSE(156,SAGESSE,'-',true,PLUS_X_SAGESSE),//-X sagesse
	MINUS_X_FORCE(157,FORCE,'-',true,PLUS_X_FORCE),//-X force
	
	AUGMENTS_PODS_X(158,'+',true),//Augmente les pods de X
	REDUCE_PODS_X(159,'-',true),//Réduit les pods de X
	PLUS_XPERCENT_CHANCE_ESQUIVE_LOST_PA(160,ESQUIVE_PA,'+',true),//E[160] = {d: "+#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PA", c: 27, o: "+", j: true};
	PLUS_XPERCENT_CHANCE_ESQUIVE_LOST_PM(161,ESQUIVE_PM,'+',true),//E[161] = {d: "+#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PM", c: 28, o: "+", j: true};
	MINUS_XPERCENT_CHANCE_ESQUIVE_LOST_PA(162,ESQUIVE_PA,'-',true),//E[162] = {d: "-#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PA", c: 27, o: "-", j: true};
	MINUS_XPERCENT_CHANCE_ESQUIVE_LOST_PM(163,ESQUIVE_PM,'-',true),//E[163] = {d: "-#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PM", c: 28, o: "-", j: true};
	DAMAGE_REDUCED_OF_XPERCENT(164,MOVEMENT,'-'),//E[164] = {d: "Dommages réduits de #1%", c: -1, o: "-"};
	AUGMENTS_DAMAGES_X_OF_XPERCENT(165,DOM,'+'),//E[165] = {d: "Augmente les dommages (#1) de #2%", c: 16, o: "+"};
	
	RETURNED_PA(166,true), //E[166] = {d: "PA retournés : #1{~1~2 à }#2", c: 0, o: "", j: true};
	MINUS_X_PA(168,PA,'-',true,PLUS_X_PA), //E[168] = {d: "-#1{~1~2 à -}#2 PA", c: 1, o: "-", j: true};
	MINUS_X_PM(169,PM,'-',true,PLUS_X_PM), //E[169] = {d: "-#1{~1~2 à -}#2 PM", c: 23, o: "-", j: true};
	MINUS_X_CRITICAL_HITS(171,COUP_CRITIQUE,'-',true), //E[171] = {d: "-#1{~1~2 à }#2 aux coups critiques", c: 18, o: "-", j: true};
	REDUCTION_MAGICAL_REDUCED_OF_X(172,RESISTANCE_DOM_MAGIQUE,'-',true), //E[172] = {d: "Réduction magique diminué de #1{~1~2 à }#2", c: 20, o: "-", j: true};
	REDUCTION_PHYSICALL_REDUCED_OF_X(173,RESISTANCE_DOM_PHYSIQUE,'-',true),//E[173] = {d: "Réduction physique diminué de #1{~1~2 à }#2", c: 21, o: "-", j: true};

	PLUS_X_INITIATIVE(174,INITIATIVE,'+',true),//+ X initiative
	MINUS_X_INITIATIVE(175,INITIATIVE,'-',true),//- X initiative 
	PLUS_X_PROSPECTION(176,PROSPECTION,'+',true),//+ X prospection
	MINUS_X_PROSPECTION(177,PROSPECTION,'-',true),//- X prospection
	PLUS_X_SOIN(178,SOIN,'+',true),//+ X soin
	MINUS_X_SOIN(179,SOIN,'-',true),//- X soin
	
	
	/**Le client utilise celui-ci et SUMMONS_CREATURE (id 180 et 181) pour faire sa function searchIfSummons :P*/
	CREATE_DOUBLE_OFCASTER(180,MOVEMENT),//Créé un double du lanceur (double sram en combat)
	/**Le client utilise celui-ci et CREATE_DOUBLE_OFCASTER (id 181 et 180) pour faire sa function searchIfSummons :P*/
	SUMMONS_CREATURE(181,MOVEMENT),//E[181] = {d: "Invoque une créature", c: -1, o: ""};
	PLUS_X_CREATURES_SUMMONABLE(182,INVOCATIONS_MAX,'+',true),//E[182] = {d: "+#1{~1~2 à }#2 créatures invocables", c: 26, o: "+", j: true};
	REDUCTION_MAGICAL_OF_X(183,RESISTANCE_DOM_MAGIQUE,'/',true),//E[183] = {d: "Réduction magique de #1{~1~2 à }#2", c: 20, o: "/", j: true};
	REDUCTION_PHYSICAL_OF_X(184,RESISTANCE_DOM_PHYSIQUE,'/',true),//E[184] = {d: "Réduction physique de #1{~1~2 à }#2", c: 21, o: "/", j: true};
	SUMMONS_CREATURE_STATIC(185),//E[185] = {d: "Invoque une créature statique", c: 0, o: ""};
	REDUCE_DAMAGES_OF_XFACTOR(186,DOM_FACTOR,'-',true),//E[186] = {d: "Diminue les dommages de #1{~1~2 à }#2%", c: 17, o: "-", j: true};
	
	CHANGE_ALIGNMENT(188,'/'),//E[188] = {d: "Changer l\'alignement", c: 0, o: "/"};
	WIN_X_KAMAS(194,'+',true),//E[194] = {d: "Gagner #1{~1~2 à }#2 kamas", c: 0, o: "+", j: true};
	TRANSFORM_IN_X(197),//E[197] = {d: "Transforme en #1", c: 0, o: ""};
	DROP_ANOBJECT_ONFLOOR(201,MOVEMENT),//E[201] = {d: "Pose un objet au sol", c: -1, o: ""};
	REVEAL_INVISIBLE_THINGS(202,MOVEMENT),//E[202] = {d: "Dévoile tous les objets invisibles", c: -1, o: ""};
	RESSUCITATE_TARGET(206,LIFE_POINTS),//E[206] = {d: "Ressuscite la cible", c: 0, o: ""};
	
	 
	/*
	 * TODO: FINIR L'ENUM DES EFFECTS DE SPELLS ET CELLE DES ITEMS AUSSI
	 */
	
	//Les résistances/faiblesses élémentaires  en Pourcents normaux
	RESISTANCE_XPERCENT_EARTH(210,RESIST_TERRE_PERCENT,'+',true),//E[210] = {d: "#1{~1~2 à }#2 % de résistance à la terre", c: 33, o: "+", j: true};
	RESISTANCE_XPERCENT_WATER(211,RESIST_EAU_PERCENT,'+',true),//E[211] = {d: "#1{~1~2 à }#2 % de résistance à l\'eau", c: 35, o: "+", j: true};
	RESISTANCE_XPERCENT_AIR(212,RESIST_AIR_PERCENT,'+',true),//E[212] = {d: "#1{~1~2 à }#2 % de résistance à l\'air", c: 36, o: "+", j: true};
	RESISTANCE_XPERCENT_FIRE(213,RESIST_FEU_PERCENT,'+',true),//E[213] = {d: "#1{~1~2 à }#2 % de résistance au feu", c: 34, o: "+", j: true};
	RESISTANCE_XPERCENT_NEUTRAL(214,RESIST_NEUTRE_PERCENT,'+',true),//E[214] = {d: "#1{~1~2 à }#2 % de résistance neutre", c: 37, o: "+", j: true};
	
	FAIBLESSE_XPERCENT_EARTH(215,RESIST_TERRE_PERCENT,'-',true),//E[215] = {d: "#1{~1~2 à }#2 % de faiblesse face à la terre", c: 33, o: "-", j: true};
	FAIBLESSE_XPERCENT_WATER(216,RESIST_EAU_PERCENT,'-',true),//E[216] = {d: "#1{~1~2 à }#2 % de faiblesse face à l\'eau ", c: 35, o: "-", j: true};
	FAIBLESSE_XPERCENT_AIR(217,RESIST_AIR_PERCENT,'-',true),//E[217] = {d: "#1{~1~2 à }#2 % de faiblesse face à l\'air", c: 36, o: "-", j: true};
	FAIBLESSE_XPERCENT_FIRE(218,RESIST_FEU_PERCENT,'-',true),//E[218] = {d: "#1{~1~2 à }#2 % de faiblesse face au feu", c: 34, o: "-", j: true};
	FAIBLESSE_XPERCENT_NEUTRAL(219,RESIST_NEUTRE_PERCENT,'-',true),//E[219] = {d: "#1{~1~2 à }#2 % de faiblesse neutre", c: 37, o: "-", j: true};
	
	
	
	RETURN_X_DAMAGES(220,DOM_RENVOI,'+'),//E[220] = {d: "Renvoie #1 dommages", c: 50, o: "+"};
	WHATS_UP_INTHERE(221),//E[221] = {d: "Qu\'y a-t-il là dedans ?", c: 0, o: ""};
	WHATS_UP_INTHERE2(222),//E[222] = {d: "Qu\'y a-t-il là dedans ?", c: 0, o: ""};
	PLUS_X_DAMAGES_TO_TRAPS(225,DOM_PIEGE,'+',true),//E[225] = {d: "+#1{~1~2 à }#2 de dommages aux pièges", c: 70, o: "+", j: true};
	PLUS_XPERCENT_DAMAGES_TO_TRAPS(226,DOM_PIEGE_PERCENT,'+',true),//E[226] = {d: "+#1{~1~2 à }#2% de dommages aux pièges", c: 69, o: "+", j: true};
	RETRIEVE_DRAGODINDE(229,'+'),//E[229] = {d: "Récupère une monture !", c: 0, o: "+"};
	PLUS_X_IN_LOSTENERGY(230,51,'/'),//E[230] = {d: "+#1 en énergie perdue", c: 51, o: "/"};
	
	
	//Les résistances élémentaires normales
	PLUS_X_RESISTANCE_EARTH(240,RESIST_TERRE,'+',true),// E[240] = {d: "+#1{~1~2 à }#2 de résistance à la terre", c: 54, o: "+", j: true};
	PLUS_X_RESISTANCE_WATER(241,RESIST_EAU,'+',true),
	PLUS_X_RESISTANCE_AIR(242,RESIST_AIR,'+',true),
	PLUS_X_RESISTANCE_FIRE(243,RESIST_FEU,'+',true),
	PLUS_X_RESISTANCE_NEUTRAL(244,RESIST_NEUTRE,'+',true),

	//Les résistances élémentaires normales (En négatif, c'est des '-')
	MINUS_X_RESISTANCE_EARTH(245,RESIST_TERRE,'-',true),//E[245] = {d: "-#1{~1~2 à }#2 de résistance à la terre", c: 54, o: "-", j: true};
	MINUS_X_RESISTANCE_WATER(246,RESIST_EAU,'-',true),
	MINUS_X_RESISTANCE_AIR(247,RESIST_AIR,'-',true),
	MINUS_X_RESISTANCE_FIRE(248,RESIST_FEU,'-',true),
	MINUS_X_RESISTANCE_NEUTRAL(249,RESIST_NEUTRE,'-',true),
	
	//Les résistances élémentaires PVP en pourcents
	XPERCENT_RESISTANCE_EARTH_PVP(250,RESIST_TERRE_PERCENT_PVP,'+',true),//E[250] = {d: "#1{~1~2 à }#2 % de res. terre face aux combattants ", c: 59, o: "+", j: true};
	XPERCENT_RESISTANCE_WATER_PVP(251,RESIST_NEUTRE,'+',true),
	XPERCENT_RESISTANCE_AIR_PVP(252,RESIST_AIR_PERCENT_PVP,'+',true),
	XPERCENT_RESISTANCE_FIRE_PVP(253,RESIST_FEU_PERCENT_PVP,'+',true),
	XPERCENT_RESISTANCE_NEUTRAL_PVP(254,RESIST_NEUTRE_PERCENT_PVP,'+',true),

	//Les faiblesses élémentaires PVP en pourcents
	XPERCENT_FAIBLESSE_EARTH_PVP(255,RESIST_TERRE_PERCENT_PVP,'-',true),//E[255] = {d: "#1{~1~2 à }#2 % de faiblesse terre face aux combattants", c: 59, o: "-", j: true};
	XPERCENT_FAIBLESSE_WATER_PVP(256,RESIST_NEUTRE,'-',true),
	XPERCENT_FAIBLESSE_AIR_PVP(257,RESIST_AIR_PERCENT_PVP,'-',true),
	XPERCENT_FAIBLESSE_FIRE_PVP(258,RESIST_FEU_PERCENT_PVP,'-',true),
	XPERCENT_FAIBLESSE_NEUTRAL_PVP(259,RESIST_NEUTRE_PERCENT_PVP,'-',true),
	
	//Les résistances élémentaires en PVP normales
	PLUS_X_RESISTANCE_EARTH_PVP(260,RESIST_TERRE_PVP,'+',true),//E[260] = {d: "+#1{~1~2 à }#2 de res. terre face aux combattants ", c: 64, o: "+", j: true};
	PLUS_X_RESISTANCE_WATER_PVP(261,RESIST_EAU_PVP,'+',true),
	PLUS_X_RESISTANCE_AIR_PVP(262,RESIST_AIR_PVP,'+',true),
	PLUS_X_RESISTANCE_FIRE_PVP(263,RESIST_FEU_PVP,'+',true),
	PLUS_X_RESISTANCE_NEUTRAL_PVP(264,RESIST_NEUTRE_PVP,'+',true),
	
	DAMAGE_REDUCED_OF_X(265,DOM,'+',true),// E[265] = {d: "Dommages réduits de #1{~1~2 à }#2", c: 16, o: "+", j: true};
	
	
	X_STEAL_CHANCE_CHARAC(266,CHANCE,true),		//E[266] = {d: "#1{~1~2 à -}#2 vol de chance", c: 13, o: "", j: true};
	X_STEAL_VITALITY_CHARAC(267,VITALITE,true),	//E[267] = {d: "#1{~1~2 à -}#2 vol de vitalité ", c: 11, o: "", j: true};
	X_STEAL_AGILITY_CHARAC(268,AGILITE,true),		//E[268] = {d: "#1{~1~2 à -}#2 vol d\'agilité ", c: 14, o: "", j: true};
	X_STEAL_INTELLIGENCE_CHARAC(269,INTELLIGENCE,true),//E[269] = {d: "#1{~1~2 à -}#2 vol d\'intelligence", c: 15, o: "", j: true};
	X_STEAL_SAGESSE_CHARAC(270,SAGESSE,true),		//E[270] = {d: "#1{~1~2 à -}#2 vol de sagesse", c: 12, o: "", j: true};
	X_STEAL_FORCE_CHARAC(271,FORCE,true),		//E[271] = {d: "#1{~1~2 à -}#2 vol de force", c: 12, o: "", j: true};
	
	DAMAGE_XPERCENT_OF_LOSTLIFE_OFATTAQUANT_WATER(275,LIFE_POINTS,true),//E[275] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (eau)", c: 0, o: "", j: true};
	DAMAGE_XPERCENT_OF_LOSTLIFE_OFATTAQUANT_EARTH(276,LIFE_POINTS,true),//E[276] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (terre)", c: 0, o: "", j: true};
	DAMAGE_XPERCENT_OF_LOSTLIFE_OFATTAQUANT_AIR(277,LIFE_POINTS,true),//E[277] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (air)", c: 0, o: "", j: true};
	DAMAGE_XPERCENT_OF_LOSTLIFE_OFATTAQUANT_FIRE(278,LIFE_POINTS,true),//E[278] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (feu)", c: 0, o: "", j: true};
	DAMAGE_XPERCENT_OF_LOSTLIFE_OFATTAQUANT_NEUTRAL(279,LIFE_POINTS,true),//E[279] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (neutre)", c: 0, o: "", j: true};
	
	
	// Les Effets Spéciaux des Items de Classe
	AUGMENTS_RANGE_SPELL_OF(281,'+'),//E[281] = {d: "Augmente la portée du sort #1 de #3", c: 0, o: "+"};
	MAKE_RANGE_OF_SPELL_MODIFICABLE(282,'+'),//E[282] = {d: "Rend la portée du sort #1 modifiable", c: 0, o: "+"};
	PLUS_X_DAMAGE_ON_SPELL_X(283,'+'),//E[283] = {d: "+#3 de dommages sur le sort #1", c: 0, o: "+"};
	PLUS_X_SOINS_ON_SPELL(284,'+'),//E[284] = {d: "+#3 de soins sur le sort #1", c: 0, o: "+"};
	REDUCE_PA_COST_BY_X_ONSPELL_X(285,'+'),//E[285] = {d: "Réduit de #3 le coût en PA du sort #1", c: 0, o: "+"};
	REDUCE_DELAY_RELANCE_BY_X_ONSPELL_X(286,'+'),//E[286] = {d: "Réduit de #3 le délai de relance du sort #1", c: 0, o: "+"};
	PLUS_X_CRITICAL_HITS_ONSPELL_X(287,'+'),//E[287] = {d: "+#3 aux CC sur le sort #1", c: 0, o: "+"};
	DISABLE_SHOT_IN_LIGN_ONSPELL_X(288,'+'),//E[288] = {d: "Désactive le lancer en ligne du sort #1", c: 0, o: "+"};
	DISABLE_LIGN_OF_SIGHT_ONSPELL_X(289,'+'),//E[289] = {d: "Désactive la ligne de vue du sort #1", c: 0, o: "+"};
	AUGMENTS_BY_X_MAX_NBR_SHOTS_BYTURN_ONSPELL_X(290,'+'),//E[290] = {d: "Augmente de #3 le nombre de lancer maximal par tour du sort #1", c: 0, o: "+"};
	AUGMENTS_BY_X_MAX_NBR_SHOTS_BYTARGET_ONSPELL_X(291,'+'),//E[291] = {d: "Augmente de #3 le nombre de lancer maximal par cible du sort #1", c: 0, o: "+"};
	FIX_DELAY_RELANCE_TO_X_ONSPELL_X(292,'+'),//E[292] = {d: "Fixe à #3 le délai de relance du sort #1", c: 0, o: "+"};
	AUGMENTS_BASE_DAMAGE_OF_X_ONSPELL_X(293,'+'),//E[293] = {d: "Augmente les dégâts de base du sort #1 de #3", c: 0, o: "+"};
	REDUCE_RANGE_OF_X_ONSPELL_X(294,'+'),//E[294] = {d: "Diminue la portée du sort #1 de #3", c: 0, o: "-"};
	//Rien ici entre les deux
	NULL(310,'/'), //E[310] = {d: "null", c: 0, o: "/"};
	STEAL_X_RANGEPOINTS(320,true),//E[320] = {d: "Vole #1{~1~2 à }#2 PO", c: 0, o: "", j: true};
	
	
	
	
	CHANGE_UNE_COULEUR(333,GFX),//E[333] = {d: "Change une couleur", c: 38, o: ""};
	CHANGE_APPEAREANCE(335),//E[335] = {d: "Change l\'apparence", c: 0, o: ""};
	/**Le client utilise celui-ci (id 400) pour faire sa function searchIfGlyph alors ca devrait être bon*/
	POSE_TRAP_RANG_X(400,MOVEMENT),//E[400] = {d: "Pose un piège de rang #2", c: -1, o: ""};
	/**Le client utilise celui-ci (id 401) pour faire sa function searchIfGlyph alors ca devrait être bon*/
	POSE_GLYPHE_RANG_X(401,MOVEMENT),//E[401] = {d: "Pose un glyphe de rang #2", c: -1, o: ""};
	POSE_GLYPHE_RANG_X2(402,MOVEMENT),//E[402] = {d: "Pose un glyphe de rang #2", c: -1, o: ""};
	KILL_AND_REPLACE_BY_INVOCATION(405),//E[405] = {d: "Tue et remplace par une invocation", c: 0, o: ""};
	POSE_PRISME(513),//E[513] = {d: "Pose un prisme", c: 0, o: ""};
	
	 
	TELEPORT_TO_SAVEPOINT(600),//E[600] = {d: "Téléporte au point de sauvegarde", c: 0, o: ""};
	NULL601(601,'+'),//E[601] = {d: "null", c: 0, o: "+"}; //Le jet = une mapID, Le texte ressemble à : "Sous-zone: X,Y" (x,y étant la coordonnée) 
	SAVE_POSITION(602),//E[602] = {d: "Enregistre sa position", c: 0, o: ""};
	LEARN_JOB(603),//E[603] = {d: "Apprend le métier #3", c: 0, o: ""};
	LEARN_SPELL(604),//E[604] = {d: "Apprend le sort #3", c: 0, o: ""};
	PLUS_X_XP_POINTS605(605,'+',true),//E[605] = {d: "+#1{~1~2 à }#2 points d\' XP", c: 0, o: "+", j: true};
	PLUS_X_SAGESSE606(606,SAGESSE,'+',true),//E[606] = {d: "+#1{~1~2 à }#2 en sagesse", c: 12, o: "+", j: true};
	PLUS_X_FORCE607(607,FORCE,'+',true),//E[607] = {d: "+#1{~1~2 à }#2 en force", c: 10, o: "+", j: true};
	PLUS_X_CHANCE608(608,CHANCE,'+',true),//E[608] = {d: "+#1{~1~2 à }#2 en chance", c: 13, o: "+", j: true};
	PLUS_X_AGILITE609(609,AGILITE,'+',true),//E[609] = {d: "+#1{~1~2 à }#2 en agilité ", c: 14, o: "+", j: true};
	PLUS_X_VITALITE610(610,VITALITE,'+',true),//E[610] = {d: "+#1{~1~2 à }#2 en vitalité ", c: 11, o: "+", j: true};
	PLUS_X_INTELLIGENCE611(611,INTELLIGENCE,'+'),//E[611] = {d: "+#1{~1~2 à }#2 en intelligence", c: 15, o: "+", j: true};
	PLUS_X_CAPITAL(612,'+'),//E[612] = {d: "+#1{~1~2 à }#2 points de caractéristique", c: 0, o: "+", j: true};
	PLUS_X_SPELLPOINTS(613,'+'),//E[613] = {d: "+#1{~1~2 à }#2 points de sort", c: 0, o: "+", j: true};
	PLUS_X_XP_IN_JOB_X(614,'+'),//E[614] = {d: "+ #1 d\'XP dans le métier #2", c: 0, o: "+"};
	FORGET_JOB_X(615),//E[615] = {d: "Fait oublier le métier de #3", c: 0, o: ""};
	FORGET_SPELL_LEVEL_ONE(616),//E[616] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
		//case 616: _loc3[2] = this.api.lang.getSpellText(this._nParam3).n;
	CONSULTE(620),//E[620] = {d: "Consulter #3", c: 0, o: ""};
	SUMMON_X_GRADE_X(621),//E[621] = {d: "Invoque : #3 (grade #1)", c: 0, o: ""};
	TELEPORT_HOME(622),//E[622] = {d: "Téléporte chez soi", c: 0, o: ""};
	SUMMON_X(623,MOVEMENT,'/'),//E[623] = {d: "Invoque : #3", c: -1, o: "/"};
		//case 623: _loc3[2] = this.api.lang.getMonstersText(this._nParam3).n;
	FORGET_SPELL_LEVEL_ONE624(624),//E[624] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
		//case 616: _loc3[2] = this.api.lang.getSpellText(this._nParam3).n;
	NULL625(625,'/'),//E[625] = {d: "null", c: 0, o: "/"};
	NULL626(626,'/'),//E[626] = {d: "null", c: 0, o: "/"};
	REPRODUCE_THE_ORIGINAL_MAP(627,'/'),//E[627] = {d: "Reproduit la carte d\'origine", c: 0, o: "/"};
	SUMMON_X628(628,'/'),//E[628] = {d: "Invoque : #3", c: 0, o: "/"};
	NULL631(631),//E[631] = {d: "null", c: 0, o: ""};

	ADD_HONOR(640,HONOR,'+'),//Ajoute de l'honneur
	ADD_DISHONOR(641,DISHONOR,'-'),//Ajoute du déshonneur
	REMOVE_HONOR(642,HONOR,'-'),//Enleve de l'honneur
	REMOVE_DISHONOR(643,DISHONOR,'+'),//Enleve du déshonneur
	  
	RESSUCITATE_ALLIES_ON_MAP(645,LIFE_POINTS,'+'),//E[645] = {d: "Ressuscite les alliés présents sur la carte", c: 0, o: "+"};
	REGIVEN_PDV_X(646,LIFE_POINTS,'+'),//E[646] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "+", j: true};
	FREE_ALL_ENNEMY_SOULS(647,LIFE_POINTS,'+'),//E[647] = {d: "Libère les âmes des ennemis", c: 0, o: "+"};
	FREE_ONE_ENNEMY_SOUL(648,LIFE_POINTS,'+'),//E[648] = {d: "Libère une âme ennemie", c: 0, o: "+"};
	FAIRE_SEMBLANT_DETRE_X(649,'/'),//E[649] = {d: "Faire semblant d\'être #3", c: 0, o: "/"};
	NULL654(654,'+'),//E[654] = {d: "null", c: 0, o: "+"};
	NO_EFFECT_SUPPLEMENTARY(666,'/'),//E[666] = {d: "Pas d\'effet supplémentaire", c: 0, o: "/"};
	INCARNATION_LEVEL_X(669,'/'),//E[669] = {d: "Incarnation de niveau #3", c: 0, o: "/"};
	DAMAGE_XPERCENT_OF_ATTAQUANT_PDV(670),//	//E[670] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
	DAMAGE_XPERCENT_OF_ATTAQUANT_PDV671(671),//	//E[670] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
	DAMAGE_XPERCENT_OF_ATTAQUANT_PDV672(672),//	//E[670] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", j: true};
	
	LIER_METIER(699,'/'),//E[699] = {d: "Lier son métier : #1", c: 0, o: "/"};
		//case 699: _loc3[0] = this.api.lang.getJobText(this._nParam1).n; (vient de dofus.datacenter.Effect)
	CHANGE_ELEMENT_FRAPPE(700),//E[700] = {d: "Change l\'élément de frappe", c: 0, o: ""};  (Potion de FM Arme)
	PUISSANCE_X(701),//E[701] = {d: "Puissance : #1{~1~2 à }#2", c: 0, o: ""};
	PLUS_DURABILITE(702),//E[702] = {d: "+#1{~1~2 à }#2 point de durabilité ", c: 0, o: "", j: true};
	CAPTURE_AME_PUISSANCE_X(705,'/'),//E[705] = {d: "#1% capture d\'âme de puissance #3", c: 0, o: "/"};
	CAPTURE_MONTURE_PROBABILITE_X(706,'/'),//E[706] = {d: "#1% de proba de capturer une monture", c: 0, o: "/"};
	COUT_SUPPLEMENTAIRE(707,'/'),	//E[710] = {d: "Coût supplémentaire", c: 0, o: "/"};
	X_X715(715,'/'),//E[715] = {d: "#1 : #3", c: 0, o: "/"};
		//case 715:  _loc3[0] = this.api.lang.getMonstersSuperRaceText(this._nParam1).n; (vient de dofus.datacenter.Effect)
	X_X716(716,'/'),//E[716] = {d: "#1 : #3", c: 0, o: "/"};
		//case 716:  _loc3[0] = this.api.lang.getMonstersRaceText(this._nParam1).n; (vient de dofus.datacenter.Effect)
	X_X717(717,'/'),//E[717] = {d: "#1 : #3", c: 0, o: "/"};
		//case 717: _loc3[0] = this.api.lang.getMonstersText(this._nParam1).n; (vient de dofus.datacenter.Effect)

	NOMBRE_VICTIMES(720),// E[720] = {d: "Nombre de victimes : #2", c: 0, o: ""};
	DEBLOQUE_TITRE(724),//E[724] = {d: "Débloque le titre #3", c: 0, o: ""};
	RENOMME_GUILDE(725,'/'),//E[725] = {d: "Renommer la guilde : #4", c: 0, o: "/"};
	TELEPORT_NEAREST_ALLY_PRISM(730),//E[730] = {d: "Téléporte au prisme allié le plus proche", c: 0, o: ""};
	AGRESSE_ALIGNMENT_ENNEMY_AUTO(731),//E[731] = {d: "Agresse les joueurs de l\'alignement ennemi automatiquement", c: 0, o: ""};
	EMPTY_STRING740(740),//E[740] = {d: "", c: 0, o: ""};
	NULL741(741),//E[741] = {d: "null", c: 0, o: ""};
	NULL742(742),//E[742] = {d: "null", c: 0, o: ""};
	BONUS_CHANCE_CAPTURE(750,CHANCE_CAPTURE_DD,'/'),//E[750] = {d: "Bonus aux chances de capture : #1{~1~2 à }#2%", c: 72, o: "/", j: true};
	BONUS_XP_MOUNT(751,BONUS_XP_DD,'/'),//E[751] = {d: "Bonus à l\'xp de la dragodinde : #1{~1~2 à }#2%", c: 73, o: "/", j: true};
	DISPARAIT_EN_SE_DEPLACANT(760),//E[760] = {d: "Disparaît en se déplaçant", c: 0, o: ""};
	ECHANGE_PLACE_DEUX_JOUEUR(765),//E[765] = {d: "Echange les places de 2 joueurs", c: 0, o: ""};
	CONFUSION_HORAIRE_XDEGRE(770,CONFUSION_HORAIRE,'-'),//E[770] = {d: "Confusion horaire : #1{~1~2 à }#2 degrés", c: 74, o: "-", j: true};
	CONFUSION_HORAIRE_PI2(771,CONFUSION_HORAIRE,'-'),//E[771] = {d: "Confusion horaire : #1{~1~2 à }#2 Pi/2", c: 74, o: "-", j: true};
	CONFUSION_HORAIRE_PI4(772,CONFUSION_HORAIRE,'-'),//E[772] = {d: "Confusion horaire : #1{~1~2 à }#2 Pi/4", c: 74, o: "-", j: true};
	CONFUSION_CONTRE_HORAIRE_XDEGRE(773,CONFUSION_HORAIRE,'-'),//E[773] = {d: "Confusion contre horaire : #1{~1~2 à }#2 degrés", c: 74, o: "-", j: true};
	CONFUSION_CONTRE_HORAIRE_PI2(774,CONFUSION_HORAIRE,'-'),//E[774] = {d: "Confusion contre horaire : #1{~1~2 à }#2 Pi/2", c: 74, o: "-", j: true};
	CONFUSION_CONTRE_HORAIRE_PI4(775,CONFUSION_HORAIRE,'-'),//E[775] = {d: "Confusion contre horaire : #1{~1~2 à }#2 Pi/4", c: 74, o: "-", j: true};
	PLUS_XPERCENT_DEGAT_PERMANENT(776,DOM_PERMANENT,'-'),//E[776] = {d: "+#1{~1~2 à }#2% de dégâts subis permanents", c: 75, o: "-", j: true};

	//Effets des sorts spéciaux de classe.
	INVOQUE_DERNIER_ALLY_MORT(780,'+'),//E[780] = {d: "Invoque le dernier allié mort avec #1{~1~2 à }#2 % de ses PDV", c: 0, o: "+", j: true};
	MINIMISE_EFFET_ALEATOIRE(781,'-'),//E[781] = {d: "Minimise les effets aléatoires", c: 0, o: "-"};
	MAXIMISE_EFFET_ALEATOIRE(782,'/'),//E[782] = {d: "Maximise les effets aléatoires", c: 0, o: "/"};
	POUSSE_TO_TARGET_CELL(783,'/'),//E[783] = {d: "Pousse jusqu\'à la case visée", c: 0, o: "/"};
	RETOUR_POSITION_DEPART(784,'/'),//E[784] = {d: "Retour à la position de départ", c: 0, o: "/"};
	NULL785(785,'/'),//E[785] = {d: "null", c: 0, o: "/"};
	SOIGNE_SUR_ATTAQUE(786,'/'),//E[786] = {d: "Soigne sur attaque", c: 0, o: "/"};
	STRING787(787,'/'),//E[787] = {d: "#1", c: 0, o: "/"};
	
	//Sort de chatiment
	CHATIMENT(788,'+'),//E[788] = {d: "Châtiment de #2 sur #3 tour(s)", c: 0, o: "+"};
	NULL789(789,'/'),//E[789] = {d: "null", c: 0, o: "/"};
	NULL790(790,'/'),//E[790] = {d: "null", c: 0, o: ""};
	
	PREPARE_PARCHEMIN_MERCENAIRE(791,'/'),//E[791] = {d: "Prépare #1{~1~2 à }#2 parchemins pour mercenaire [wait]", c: 0, o: "/"};
	ARME_DE_CHASSE(795,'/'),//E[795] = {d: "Arme de chasse", c: 0, o: "/"};
	//Familiers
	POINTS_DE_VIE(800),//E[800] = {d: "Points de vie : #3", c: 0, o: ""};
	RECU_LE(805),//E[805] = {d: "Reçu le : #1", c: 0, o: ""};
	CORPULENCE(806),//E[806] = {d: "Corpulence : #1", c: 0, o: ""};
	DERNIER_REPAS(807),//E[807] = {d: "Dernier repas : #1", c: 0, o: ""};
	A_MANGE_LE(808),//E[808] = {d: "A mangé le : #1", c: 0, o: ""};
	TAILLE(810),//E[810] = {d: "Taille : #3 poces", c: 0, o: ""};
	
	TOURS_RESTANTS(811),//E[811] = {d: "Tour(s) restant(s) : #3", c: 0, o: ""};
	/**Armes éthérées*/
	DURABILITY(812),//E[812] = {d: "Résistance : #2 / #3", c: 0, o: ""};
	//Des nulls
	NULL813(813,'/'),//E[813] = {d: "null", c: 0, o: "/"};
	STRING814(814,'/'),//E[814] = {d: "#1", c: 0, o: "/"};
	NULL815(815),//E[815] = {d: "null", c: 0, o: ""};
	NULL816(816),//E[816] = {d: "null", c: 0, o: "/"};
	//Des actions
	TELEPORT(825,'+'),//E[825] = {d: "Téléporte", c: 0, o: "+"};
	LANCE_COMBAT_CONTRE_X(905,'/'),//E[905] = {d: "Lance un combat contre #2", c: 0, o: "/"};
	
	AUGMENTS_SERENITE(930,'/'),//E[930] = {d: "Augmente la sérénité, diminue l\'agressivité ", c: 0, o: "/"};//en hex:3a2
	AUGMENTS_AGRESSIVITE(931,'/'),//E[931] = {d: "Augmente l\'agressivité, diminue la sérénité ", c: 0, o: "/"};
	AUGMENTS_ENDURANCE(932,'+'),//E[932] = {d: "Augmente l\'endurance", c: 0, o: "+"};
	REDUCE_ENDURANCE(933,'-'),//E[933] = {d: "Diminue l\'endurance", c: 0, o: "-"};
	AUGMENTS_AMOUR(934,'+'),//E[934] = {d: "Augmente l\'amour", c: 0, o: "+"};
	REDUCE_AMOUR(935,'-'),//E[935] = {d: "Diminue l\'amour", c: 0, o: "-"};
	ACCELERE_MATURITE(936,'+'),//E[936] = {d: "Accelère la maturité ", c: 0, o: "+"};
	RALENTIT_MATURITE(937,'-'),//E[937] = {d: "Ralentit la maturité ", c: 0, o: "-"};
	
	AUGMENTS_CAPACITE_FAMILIER(939,'+'),//E[939] = {d: "Augmente les capacités d\'un familier #3", c: 0, o: "+"};
	CAPACITE_ACCRUES(940,'+'),//E[940] = {d: "Capacités accrues", c: 0, o: "+"};
	
	RETIRER_TEMP_OBJET_ELEVAGE(946,'/'),//E[946] = {d: "Retirer temporairement un objet d\'élevage", c: 0, o: "/"};
	RECUPERER_OBJET_ENCLOS(947,'/'),//E[947] = {d: "Récupérer un objet d\'enclos", c: 0, o: "/"};
	OBJET_ENCLOS(948,'/'),//E[948] = {d: "Objet pour enclos", c: 0, o: "/"};
	MONTER_DESCENDRE_MONTURE(949,'/'),//E[949] = {d: "Monter/Descendre d\'une monture", c: 0, o: "/"};
	
	ETAT(950,71,'/'),//E[950] = {d: "Etat #3", c: 71, o: "/"};
	ENLEVE_ETAT(951,71,'/'),//E[951] = {d: "Enlève l\'état \'#3\'", c: 71, o: "/"};
	
	ALIGNEMENT(960,'/'),//E[960] = {d: "Alignement : #3", c: 0, o: "/"};
	GRADE(961,'/'),//E[961] = {d: "Grade : #3", c: 0, o: "/"};
	NIVEAU(962,'/'),//E[962] = {d: "Niveau : #3", c: 0, o: "/"};
	CREE_DEPUIS_XJOUR(963,'/'),//E[963] = {d: "Créé depuis : #3 jour(s)", c: 0, o: "/"};
	NOM_X964(964,'/'),//E[964] = {d: "Nom : #4", c: 0, o: "/"};
	
	NULL970(970),//E[970] = {d: "null", c: 0, o: ""}; 
		//templateID d'une apparence à appliquer par dessus un item (du genre obvijevans ou mimibiot)
	NULL971(971),//E[971] = {d: "null", c: 0, o: ""};
	NULL972(972),//E[972] = {d: "null", c: 0, o: ""};
	NULL973(973),//E[973] = {d: "null", c: 0, o: ""};
	NULL974(974),//E[974] = {d: "null", c: 0, o: ""};

	ECHANGEABLE_LE_DATE(983,'/'),//E[983] = {d: "Échangeable dès le : #1", c: 0, o: "/"};
	
	NULL984(984,'/'),//E[984] = {d: "null", c: 0, o: "/"};
	
	MODIFIE_PAR(985,'/'),//E[985] = {d: "Modifié par : #4", c: 0, o: "/"};
	PREPARE_PARCHEMINS(986,'/'),//E[986] = {d: "Prépare #1{~1~2 à }#2 parchemins", c: 0, o: "/"};
	APPARTIENT_A_X987(987,'/'),//E[987] = {d: "Appartient à : #4", c: 0, o: "/"};
	FRABRIQUE_PAR(988,'/'),//E[988] = {d: "Fabriqué par : #4", c: 0, o: "/"};
	RECHERCHE(989,'/'),//E[989] = {d: "Recherche : #4", c: 0, o: "/"};
	STRING990(990,'/'),//E[990] = {d: "#4", c: 0, o: "/"};
	CERTIFICAT_INVALIDE(994,'-'),//E[994] = {d: "!! Certificat invalide !!", c: 0, o: "-"};
	CONSULTER_FICHE_MONTURE(995,'/'),//E[995] = {d: "Consulter la fiche de la monture", c: 0, o: "/"};
	APPARTIENT_A_X996(996,'/'),//E[996] = {d: "Appartient à : #4", c: 0, o: "/"};
	NOM_X997(997,'/'),//E[997] = {d: "Nom : #4", c: 0, o: "/"};
	VALIDITE(998,'/'),//E[998] = {d: "Validité : #1j #2h #3m", c: 0, o: "/"};
	NULL999(999,'+'),//E[999] = {d: "null", c: 0, o: "+"};
	
	
	
	
	
	
	
	
	MINUS_X_LIFE(1000,LIFE_POINTS,'-',PLUS_X_LIFE),//- PDV 
	EXE_JAVASCRIPT(1001),//Exécute un fichier javascript .js
	SEND_MESSAGE(1002),//Envoie un message au joueur
	COOLDOWN(1003),//Effet de cooldown utilisé sur les buffs qui réglementent les cooldowns. Voir ActionsPlugin.Moar.applySpell pour le code l'utilisant :)
	MAX_LAUNCH_BY_TURN(1004),//Effet de restriction du nombre de lancer du même sort durant un même tour. Voir ActionsPlugin.Moar.applySpell pour le code l'utilisant :)
	MAX_LAUNCH_BY_TURN_BY_TARGET(1005),//Effet de restriction du nombre de lancer du même sort durant un même tour sur la même cible. Voir ActionsPlugin.Moar.applySpell pour le code l'utilisant :)
	
	;
	
	
	
	
	
	
	/*
 	FILE_BEGIN = true;
	System.security.allowDomain(_parent._url);
	VERSION = 259;
	E = new Object();
	
	E[4] = {d: "Téléporte à une distance de #1 cases maximum.", c: -1, o: ""};
	E[5] = {d: "Fait reculer de #1 case(s)", c: -1, o: ""};
	E[6] = {d: "Fait avancer de #1 case(s)", c: 0, o: ""};
	E[7] = {d: "Divorcer le couple", c: 0, o: ""};
	E[8] = {d: "Echange les places de 2 joueurs", c: 0, o: ""};
	E[9] = {d: "Esquive #1% des coups en reculant de #2 case(s)", c: 0, o: ""};
	E[10] = {d: "Permet d\'utiliser l\'émoticon #3", c: 0, o: ""};
	E[13] = {d: "Change le temps de jeu d\'un joueur", c: 0, o: ""};
	E[50] = {d: "Porter un joueur", c: 0, o: ""};
	E[51] = {d: "Jeter un joueur", c: 0, o: ""};
	E[77] = {d: "Vole #1{~1~2 à }#2 PM", c: 0, o: "", j: true};
	E[78] = {d: "Ajoute +#1{~1~2 à }#2 PM", c: 0, o: "+", j: true};
	E[79] = {d: "#3% dommages subis x#1, sinon soigné de x#2", c: 0, o: ""};
	E[81] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "", j: true};
	E[82] = {d: "Vole #1{~1~2 à }#2 PDV (fixe)", c: 0, o: "", j: true};
	E[84] = {d: "Vole #1{~1~2 à }#2 PA", c: 0, o: "", j: true};
	E[85] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (eau)", c: 0, o: "", j: true, e: "W"};
	E[86] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (terre)", c: 0, o: "", j: true, e: "E"};
	E[87] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (air)", c: 0, o: "", j: true, e: "A"};
	E[88] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (feu)", c: 0, o: "", j: true, e: "F"};
	E[89] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", j: true, e: "N"};
	E[90] = {d: "Donne #1{~1~2 à }#2 % de sa vie", c: 0, o: "", j: true};
	E[91] = {d: "Vole #1{~1~2 à }#2 PDV (eau)", c: 0, o: "", t: true, j: true, e: "W"};
	E[92] = {d: "Vole #1{~1~2 à }#2 PDV (terre)", c: 0, o: "", t: true, j: true, e: "E"};
	E[93] = {d: "Vole #1{~1~2 à }#2 PDV (air)", c: 0, o: "", t: true, j: true, e: "A"};
	E[94] = {d: "Vole #1{~1~2 à }#2 PDV (feu)", c: 0, o: "", t: true, j: true, e: "F"};
	E[95] = {d: "Vole #1{~1~2 à }#2 PDV (neutre)", c: 0, o: "", t: true, j: true, e: "N"};
	E[96] = {d: "Dommages : #1{~1~2 à }#2 (eau)", c: 0, o: "", t: true, j: true, e: "W"};
	E[97] = {d: "Dommages : #1{~1~2 à }#2 (terre)", c: 0, o: "", t: true, j: true, e: "E"};
	E[98] = {d: "Dommages : #1{~1~2 à }#2 (air)", c: 0, o: "", t: true, j: true, e: "A"};
	E[99] = {d: "Dommages : #1{~1~2 à }#2 (feu)", c: 0, o: "", t: true, j: true, e: "F"};
	E[100] = {d: "Dommages : #1{~1~2 à }#2 (neutre)", c: 0, o: "", t: true, j: true, e: "N"};
	E[101] = {d: "PA perdus à la cible : #1{~1~2 à }#2", c: 1, o: "/", j: true};
	E[105] = {d: "Dommages réduits de  #1{~1~2 à }#2", c: 16, o: "+", j: true};
	E[106] = {d: "Renvoie un sort de niveau #2 maximum", c: 30, o: ""};
	E[107] = {d: "Dommages retournés : #1{~1~2 à }#2", c: 31, o: "", j: true};
	E[108] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "", j: true};
	E[109] = {d: "Dommages pour le lanceur : #1{~1~2 à }#2", c: 0, o: "-", j: true};
	E[110] = {d: "+#1{~1~2 à }#2 en vie", c: 0, o: "+", j: true};
	E[111] = {d: "+#1{~1~2 à }#2 PA", c: 1, o: "+", j: true};
	E[112] = {d: "+#1{~1~2 à }#2 de dommages", c: 16, o: "+", j: true};
	E[113] = {d: "Double les dommages ou rend  #1{~1~2 à }#2 PDV", c: 0, o: "", j: true};
	E[114] = {d: "Multiplie les dommages par #1", c: 17, o: "+"};
	E[115] = {d: "+#1{~1~2 à }#2 aux coups critiques", c: 18, o: "+", j: true};
	E[116] = {d: "-#1{~1~2 à -}#2 à la portée", c: 19, o: "-", j: true};
	E[117] = {d: "+#1{~1~2 à }#2 à la portée", c: 19, o: "+", j: true};
	E[118] = {d: "+#1{~1~2 à }#2 en force", c: 10, o: "+", j: true};
	E[119] = {d: "+#1{~1~2 à }#2 en agilité ", c: 14, o: "+", j: true};
	E[120] = {d: "Ajoute +#1{~1~2 à }#2 PA", c: 0, o: "+", j: true};
	E[121] = {d: "+#1{~1~2 à }#2 de dommages", c: 16, o: "+", j: true};
	E[122] = {d: "+#1{~1~2 à }#2 aux échecs critiques", c: 39, o: "-", j: true};
	E[123] = {d: "+#1{~1~2 à }#2 à la chance", c: 13, o: "+", j: true};
	E[124] = {d: "+#1{~1~2 à }#2 en sagesse", c: 12, o: "+", j: true};
	E[125] = {d: "+#1{~1~2 à }#2 en vitalité ", c: 11, o: "+", j: true};
	E[126] = {d: "+#1{~1~2 à }#2 en intelligence", c: 15, o: "+", j: true};
	E[127] = {d: "PM perdus : #1{~1~2 à }#2", c: 23, o: "-", j: true};
	E[128] = {d: "+#1{~1~2 à }#2 PM", c: 23, o: "+", j: true};
	E[130] = {d: "Vole  #1{~1~2 à }#2 d\'or", c: -1, o: "", j: true};
	E[131] = {d: "#1 PA utilisés font perdre #2 PDV", c: 0, o: "-"};
	E[132] = {d: "Enlève les envoûtements", c: -1, o: ""};
	E[133] = {d: "PA perdus pour le lanceur : #1{~1~2 à }#2", c: 1, o: "-", j: true};
	E[134] = {d: "PM perdus pour le lanceur : #1{~1~2 à }#2", c: 23, o: "-", j: true};
	E[135] = {d: "Portée du lanceur réduite de : #1{~1~2 à }#2", c: 19, o: "-", j: true};
	E[136] = {d: "Portée du lanceur augmentée de : #1{~1~2 à }#2", c: 19, o: "+", j: true};
	E[137] = {d: "Dommages physiques du lanceur augmentés de : #1{~1~2 à }#2", c: 16, o: "+", j: true};
	E[138] = {d: "Augmente les dommages de #1{~1~2 à }#2%", c: 17, o: "+", j: true};
	E[139] = {d: "Rend #1{~1~2 à }#2 points d\'énergie", c: 29, o: "+", j: true};
	E[140] = {d: "Fait passer le tour suivant", c: -1, o: ""};
	E[141] = {d: "Tue la cible", c: 0, o: ""};
	E[142] = {d: "+#1{~1~2 à }#2 aux dommages physiques", c: 16, o: "+", j: true};
	E[143] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "", j: true};
	E[144] = {d: "Dommages : #1{~1~2 à }#2 (non boostés)", c: 0, o: "-", j: true};
	E[145] = {d: "-#1{~1~2 à }#2 aux dommages", c: 16, o: "-", j: true};
	E[146] = {d: "Change les paroles", c: 38, o: ""};
	E[147] = {d: "Ressuscite un allié ", c: 0, o: ""};
	E[148] = {d: "Quelqu\'un vous suit !", c: 0, o: ""};
	E[149] = {d: "Change l\'apparence", c: 38, o: ""};
	E[150] = {d: "Rend le personnage invisible", c: 24, o: "+"};
	E[152] = {d: "-#1{~1~2 à -}#2 en chance", c: 13, o: "-", j: true};
	E[153] = {d: "-#1{~1~2 à -}#2 en vitalité ", c: 11, o: "-", j: true};
	E[154] = {d: "-#1{~1~2 à -}#2 en agilité ", c: 14, o: "-", j: true};
	E[155] = {d: "-#1{~1~2 à -}#2 en intelligence", c: 15, o: "-", j: true};
	E[156] = {d: "-#1{~1~2 à -}#2 en sagesse", c: 12, o: "-", j: true};
	E[157] = {d: "-#1{~1~2 à -}#2 en force", c: 10, o: "-", j: true};
	E[158] = {d: "Augmente le poids portable de #1{~1~2 à }#2 pods", c: 0, o: "+", j: true};
	E[159] = {d: "Réduit le poids portable de #1{~1~2 à }#2 pods", c: 0, o: "-", j: true};
	E[160] = {d: "+#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PA", c: 27, o: "+", j: true};
	E[161] = {d: "+#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PM", c: 28, o: "+", j: true};
	E[162] = {d: "-#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PA", c: 27, o: "-", j: true};
	E[163] = {d: "-#1{~1~2 à }#2 % de chance d\'esquiver les pertes de PM", c: 28, o: "-", j: true};
	E[164] = {d: "Dommages réduits de #1%", c: -1, o: "-"};
	E[165] = {d: "Augmente les dommages (#1) de #2%", c: 16, o: "+"};
	E[166] = {d: "PA retournés : #1{~1~2 à }#2", c: 0, o: "", j: true};
	E[168] = {d: "-#1{~1~2 à -}#2 PA", c: 1, o: "-", j: true};
	E[169] = {d: "-#1{~1~2 à -}#2 PM", c: 23, o: "-", j: true};
	E[171] = {d: "-#1{~1~2 à }#2 aux coups critiques", c: 18, o: "-", j: true};
	E[172] = {d: "Réduction magique diminué de #1{~1~2 à }#2", c: 20, o: "-", j: true};
	E[173] = {d: "Réduction physique diminué de #1{~1~2 à }#2", c: 21, o: "-", j: true};
	E[174] = {d: "+#1{~1~2 à }#2 en initiative", c: 44, o: "+", j: true};
	E[175] = {d: "-#1{~1~2 à }#2 en initiative", c: 44, o: "-", j: true};
	E[176] = {d: "+#1{~1~2 à }#2 en prospection", c: 48, o: "+", j: true};
	E[177] = {d: "-#1{~1~2 à }#2 en prospection", c: 48, o: "-", j: true};
	E[178] = {d: "+#1{~1~2 à }#2 de soins", c: 49, o: "+", j: true};
	E[179] = {d: "-#1{~1~2 à }#2 de soins", c: 49, o: "-", j: true};
	E[180] = {d: "Crée un double du lanceur de sort", c: -1, o: ""};
	E[181] = {d: "Invoque une créature", c: -1, o: ""};
	E[182] = {d: "+#1{~1~2 à }#2 créatures invocables", c: 26, o: "+", j: true};
	E[183] = {d: "Réduction magique de #1{~1~2 à }#2", c: 20, o: "/", j: true};
	E[184] = {d: "Réduction physique de #1{~1~2 à }#2", c: 21, o: "/", j: true};
	E[185] = {d: "Invoque une créature statique", c: 0, o: ""};
	E[186] = {d: "Diminue les dommages de #1{~1~2 à }#2%", c: 17, o: "-", j: true};
	E[188] = {d: "Changer l\'alignement", c: 0, o: "/"};
	E[194] = {d: "Gagner #1{~1~2 à }#2 kamas", c: 0, o: "+", j: true};
	E[197] = {d: "Transforme en #1", c: 0, o: ""};
	E[201] = {d: "Pose un objet au sol", c: -1, o: ""};
	E[202] = {d: "Dévoile tous les objets invisibles", c: -1, o: ""};
	E[206] = {d: "Ressuscite la cible", c: 0, o: ""};
	E[210] = {d: "#1{~1~2 à }#2 % de résistance à la terre", c: 33, o: "+", j: true};
	E[211] = {d: "#1{~1~2 à }#2 % de résistance à l\'eau", c: 35, o: "+", j: true};
	E[212] = {d: "#1{~1~2 à }#2 % de résistance à l\'air", c: 36, o: "+", j: true};
	E[213] = {d: "#1{~1~2 à }#2 % de résistance au feu", c: 34, o: "+", j: true};
	E[214] = {d: "#1{~1~2 à }#2 % de résistance neutre", c: 37, o: "+", j: true};
	E[215] = {d: "#1{~1~2 à }#2 % de faiblesse face à la terre", c: 33, o: "-", j: true};
	E[216] = {d: "#1{~1~2 à }#2 % de faiblesse face à l\'eau ", c: 35, o: "-", j: true};
	E[217] = {d: "#1{~1~2 à }#2 % de faiblesse face à l\'air", c: 36, o: "-", j: true};
	E[218] = {d: "#1{~1~2 à }#2 % de faiblesse face au feu", c: 34, o: "-", j: true};
	E[219] = {d: "#1{~1~2 à }#2 % de faiblesse neutre", c: 37, o: "-", j: true};
	E[220] = {d: "Renvoie #1 dommages", c: 50, o: "+"};
	E[221] = {d: "Qu\'y a-t-il là dedans ?", c: 0, o: ""};
	E[222] = {d: "Qu\'y a-t-il là dedans ?", c: 0, o: ""};
	E[225] = {d: "+#1{~1~2 à }#2 de dommages aux pièges", c: 70, o: "+", j: true};
	E[226] = {d: "+#1{~1~2 à }#2% de dommages aux pièges", c: 69, o: "+", j: true};
	E[229] = {d: "Récupère une monture !", c: 0, o: "+"};
	E[230] = {d: "+#1 en énergie perdue", c: 51, o: "/"};
	E[240] = {d: "+#1{~1~2 à }#2 de résistance à la terre", c: 54, o: "+", j: true};
	E[241] = {d: "+#1{~1~2 à }#2 de résistance à l\'eau", c: 56, o: "+", j: true};
	E[242] = {d: "+#1{~1~2 à }#2 de résistance à l\'air", c: 57, o: "+", j: true};
	E[243] = {d: "+#1{~1~2 à }#2 de résistance au feu", c: 55, o: "+", j: true};
	E[244] = {d: "+#1{~1~2 à }#2 de résistance neutre", c: 58, o: "+", j: true};
	E[245] = {d: "-#1{~1~2 à }#2 de résistance à la terre", c: 54, o: "-", j: true};
	E[246] = {d: "-#1{~1~2 à }#2 de résistance à l\'eau", c: 56, o: "-", j: true};
	E[247] = {d: "-#1{~1~2 à }#2 de résistance à l\'air", c: 57, o: "-", j: true};
	E[248] = {d: "-#1{~1~2 à }#2 de résistance au feu", c: 55, o: "-", j: true};
	E[249] = {d: "-#1{~1~2 à }#2 de résistance neutre", c: 58, o: "-", j: true};
	E[250] = {d: "#1{~1~2 à }#2 % de res. terre face aux combattants ", c: 59, o: "+", j: true};
	E[251] = {d: "#1{~1~2 à }#2 % de res. eau face aux combattants", c: 61, o: "+", j: true};
	E[252] = {d: "#1{~1~2 à }#2 % de res. air face aux combattants", c: 62, o: "+", j: true};
	E[253] = {d: "#1{~1~2 à }#2 % de res. feu face aux combattants", c: 60, o: "+", j: true};
	E[254] = {d: "#1{~1~2 à }#2 % de res. neutre face aux combattants", c: 63, o: "+", j: true};
	E[255] = {d: "#1{~1~2 à }#2 % de faiblesse terre face aux combattants", c: 59, o: "-", j: true};
	E[256] = {d: "#1{~1~2 à }#2 % de faiblesse eau face aux combattants", c: 61, o: "-", j: true};
	E[257] = {d: "#1{~1~2 à }#2 % de faiblesse air face aux combattants", c: 62, o: "-", j: true};
	E[258] = {d: "#1{~1~2 à }#2 % de faiblesse feu face aux combattants", c: 60, o: "-", j: true};
	E[259] = {d: "#1{~1~2 à }#2 % de faiblesse neutre face aux combattants", c: 63, o: "-", j: true};
	E[260] = {d: "+#1{~1~2 à }#2 de res. terre face aux combattants ", c: 64, o: "+", j: true};
	E[261] = {d: "+#1{~1~2 à }#2 de res. eau face aux combattants ", c: 66, o: "+", j: true};
	E[262] = {d: "+#1{~1~2 à }#2 de res. air face aux combattants", c: 67, o: "+", j: true};
	E[263] = {d: "+#1{~1~2 à }#2 de res. feu aux combattants", c: 65, o: "+", j: true};
	E[264] = {d: "+#1{~1~2 à }#2 de res. neutre aux combattants", c: 68, o: "+", j: true};
	E[265] = {d: "Dommages réduits de #1{~1~2 à }#2", c: 16, o: "+", j: true};
	E[266] = {d: "#1{~1~2 à -}#2 vol de chance", c: 13, o: "", j: true};
	E[267] = {d: "#1{~1~2 à -}#2 vol de vitalité ", c: 11, o: "", j: true};
	E[268] = {d: "#1{~1~2 à -}#2 vol d\'agilité ", c: 14, o: "", j: true};
	E[269] = {d: "#1{~1~2 à -}#2 vol d\'intelligence", c: 15, o: "", j: true};
	E[270] = {d: "#1{~1~2 à -}#2 vol de sagesse", c: 12, o: "", j: true};
	E[271] = {d: "#1{~1~2 à -}#2 vol de force", c: 12, o: "", j: true};
	E[275] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (eau)", c: 0, o: "", j: true};
	E[276] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (terre)", c: 0, o: "", j: true};
	E[277] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (air)", c: 0, o: "", j: true};
	E[278] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (feu)", c: 0, o: "", j: true};
	E[279] = {d: "Dommages : #1{~1~2 à }#2% de la vie manquante de l\'attaquant (neutre)", c: 0, o: "", j: true};
	E[281] = {d: "Augmente la portée du sort #1 de #3", c: 0, o: "+"};
	E[282] = {d: "Rend la portée du sort #1 modifiable", c: 0, o: "+"};
	E[283] = {d: "+#3 de dommages sur le sort #1", c: 0, o: "+"};
	E[284] = {d: "+#3 de soins sur le sort #1", c: 0, o: "+"};
	E[285] = {d: "Réduit de #3 le coût en PA du sort #1", c: 0, o: "+"};
	E[286] = {d: "Réduit de #3 le délai de relance du sort #1", c: 0, o: "+"};
	E[287] = {d: "+#3 aux CC sur le sort #1", c: 0, o: "+"};
	E[288] = {d: "Désactive le lancer en ligne du sort #1", c: 0, o: "+"};
	E[289] = {d: "Désactive la ligne de vue du sort #1", c: 0, o: "+"};
	E[290] = {d: "Augmente de #3 le nombre de lancer maximal par tour du sort #1", c: 0, o: "+"};
	E[291] = {d: "Augmente de #3 le nombre de lancer maximal par cible du sort #1", c: 0, o: "+"};
	E[292] = {d: "Fixe à #3 le délai de relance du sort #1", c: 0, o: "+"};
	E[293] = {d: "Augmente les dégâts de base du sort #1 de #3", c: 0, o: "+"};
	E[294] = {d: "Diminue la portée du sort #1 de #3", c: 0, o: "-"};
	E[310] = {d: "null", c: 0, o: "/"};
	E[320] = {d: "Vole #1{~1~2 à }#2 PO", c: 0, o: "", j: true};
	E[333] = {d: "Change une couleur", c: 38, o: ""};
	E[335] = {d: "Change l\'apparence", c: 0, o: ""};
	E[400] = {d: "Pose un piège de rang #2", c: -1, o: ""};
	E[401] = {d: "Pose un glyphe de rang #2", c: -1, o: ""};
	E[402] = {d: "Pose un glyphe de rang #2", c: -1, o: ""};
	E[405] = {d: "Tue et remplace par une invocation", c: 0, o: ""};
	E[513] = {d: "Pose un prisme", c: 0, o: ""};
	E[600] = {d: "Téléporte au point de sauvegarde", c: 0, o: ""};
	E[601] = {d: "null", c: 0, o: "+"};
	E[602] = {d: "Enregistre sa position", c: 0, o: ""};
	E[603] = {d: "Apprend le métier #3", c: 0, o: ""};
	E[604] = {d: "Apprend le sort #3", c: 0, o: ""};
	E[605] = {d: "+#1{~1~2 à }#2 points d\' XP", c: 0, o: "+", j: true};
	E[606] = {d: "+#1{~1~2 à }#2 en sagesse", c: 12, o: "+", j: true};
	E[607] = {d: "+#1{~1~2 à }#2 en force", c: 10, o: "+", j: true};
	E[608] = {d: "+#1{~1~2 à }#2 en chance", c: 13, o: "+", j: true};
	E[609] = {d: "+#1{~1~2 à }#2 en agilité ", c: 14, o: "+", j: true};
	E[610] = {d: "+#1{~1~2 à }#2 en vitalité ", c: 11, o: "+", j: true};
	E[611] = {d: "+#1{~1~2 à }#2 en intelligence", c: 15, o: "+", j: true};
	E[612] = {d: "+#1{~1~2 à }#2 points de caractéristique", c: 0, o: "+", j: true};
	E[613] = {d: "+#1{~1~2 à }#2 points de sort", c: 0, o: "+", j: true};
	E[614] = {d: "+ #1 d\'XP dans le métier #2", c: 0, o: "+"};
	E[615] = {d: "Fait oublier le métier de #3", c: 0, o: ""};
	E[616] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
	E[620] = {d: "Consulter #3", c: 0, o: ""};
	E[621] = {d: "Invoque : #3 (grade #1)", c: 0, o: ""};
	E[622] = {d: "Téléporte chez soi", c: 0, o: ""};
	E[623] = {d: "Invoque : #3", c: -1, o: "/"};
	E[624] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
	E[625] = {d: "null", c: 0, o: "/"};
	E[626] = {d: "null", c: 0, o: "/"};
	E[627] = {d: "Reproduit la carte d\'origine", c: 0, o: "/"};
	E[628] = {d: "Invoque : #3", c: 0, o: "/"};
	E[631] = {d: "null", c: 0, o: ""};
	E[640] = {d: "Ajoute #3 points d\'honneur", c: 52, o: "+"};
	E[641] = {d: "Ajoute #3 points de déshonneur", c: 53, o: "-"};
	E[642] = {d: "Retire #3 points d\'honneur", c: 52, o: "-"};
	E[643] = {d: "Retire #3 points de déshonneur", c: 53, o: "+"};
	E[645] = {d: "Ressuscite les alliés présents sur la carte", c: 0, o: "+"};
	E[646] = {d: "PDV rendus : #1{~1~2 à }#2", c: 0, o: "+", j: true};
	E[647] = {d: "Libère les âmes des ennemis", c: 0, o: "+"};
	E[648] = {d: "Libère une âme ennemie", c: 0, o: "+"};
	E[649] = {d: "Faire semblant d\'être #3", c: 0, o: "/"};
	E[654] = {d: "null", c: 0, o: "+"};
	E[666] = {d: "Pas d\'effet supplémentaire", c: 0, o: "/"};
	E[669] = {d: "Incarnation de niveau #3", c: 0, o: "/"};
	E[670] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
	E[671] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
	E[672] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", j: true};
	E[699] = {d: "Lier son métier : #1", c: 0, o: "/"};
	E[700] = {d: "Change l\'élément de frappe", c: 0, o: ""};
	E[701] = {d: "Puissance : #1{~1~2 à }#2", c: 0, o: ""};
	E[702] = {d: "+#1{~1~2 à }#2 point de durabilité ", c: 0, o: "", j: true};
	E[705] = {d: "#1% capture d\'âme de puissance #3", c: 0, o: "/"};
	E[706] = {d: "#1% de proba de capturer une monture", c: 0, o: "/"};
	E[710] = {d: "Coût supplémentaire", c: 0, o: "/"};
	E[715] = {d: "#1 : #3", c: 0, o: "/"};
	E[716] = {d: "#1 : #3", c: 0, o: "/"};
	E[717] = {d: "#1 : #3", c: 0, o: "/"};
	E[720] = {d: "Nombre de victimes : #2", c: 0, o: ""};
	E[724] = {d: "Débloque le titre #3", c: 0, o: ""};
	E[725] = {d: "Renommer la guilde : #4", c: 0, o: "/"};
	E[730] = {d: "Téléporte au prisme allié le plus proche", c: 0, o: ""};
	E[731] = {d: "Agresse les joueurs de l\'alignement ennemi automatiquement", c: 0, o: ""};
	E[740] = {d: "", c: 0, o: ""};
	E[741] = {d: "null", c: 0, o: ""};
	E[742] = {d: "null", c: 0, o: ""};
	E[750] = {d: "Bonus aux chances de capture : #1{~1~2 à }#2%", c: 72, o: "/", j: true};
	E[751] = {d: "Bonus à l\'xp de la dragodinde : #1{~1~2 à }#2%", c: 73, o: "/", j: true};
	E[760] = {d: "Disparaît en se déplaçant", c: 0, o: ""};
	E[765] = {d: "Echange les places de 2 joueurs", c: 0, o: ""};
	E[770] = {d: "Confusion horaire : #1{~1~2 à }#2 degrés", c: 74, o: "-", j: true};
	E[771] = {d: "Confusion horaire : #1{~1~2 à }#2 Pi/2", c: 74, o: "-", j: true};
	E[772] = {d: "Confusion horaire : #1{~1~2 à }#2 Pi/4", c: 74, o: "-", j: true};
	E[773] = {d: "Confusion contre horaire : #1{~1~2 à }#2 degrés", c: 74, o: "-", j: true};
	E[774] = {d: "Confusion contre horaire : #1{~1~2 à }#2 Pi/2", c: 74, o: "-", j: true};
	E[775] = {d: "Confusion contre horaire : #1{~1~2 à }#2 Pi/4", c: 74, o: "-", j: true};
	E[776] = {d: "+#1{~1~2 à }#2% de dégâts subis permanents", c: 75, o: "-", j: true};
	E[780] = {d: "Invoque le dernier allié mort avec #1{~1~2 à }#2 % de ses PDV", c: 0, o: "+", j: true};
	E[781] = {d: "Minimise les effets aléatoires", c: 0, o: "-"};
	E[782] = {d: "Maximise les effets aléatoires", c: 0, o: "/"};
	E[783] = {d: "Pousse jusqu\'à la case visée", c: 0, o: "/"};
	E[784] = {d: "Retour à la position de départ", c: 0, o: "/"};
	E[785] = {d: "null", c: 0, o: "/"};
	E[786] = {d: "Soigne sur attaque", c: 0, o: "/"};
	E[787] = {d: "#1", c: 0, o: "/"};
	E[788] = {d: "Châtiment de #2 sur #3 tour(s)", c: 0, o: "+"};
	E[789] = {d: "null", c: 0, o: "/"};
	E[790] = {d: "null", c: 0, o: ""};
	E[791] = {d: "Prépare #1{~1~2 à }#2 parchemins pour mercenaire [wait]", c: 0, o: "/"};
	E[795] = {d: "Arme de chasse", c: 0, o: "/"};
	E[800] = {d: "Points de vie : #3", c: 0, o: ""};
	E[805] = {d: "Reçu le : #1", c: 0, o: ""};
	E[806] = {d: "Corpulence : #1", c: 0, o: ""};
	E[807] = {d: "Dernier repas : #1", c: 0, o: ""};
	E[808] = {d: "A mangé le : #1", c: 0, o: ""};
	E[810] = {d: "Taille : #3 poces", c: 0, o: ""};
	E[811] = {d: "Tour(s) restant(s) : #3", c: 0, o: ""};
	E[812] = {d: "Résistance : #2 / #3", c: 0, o: ""};
	E[813] = {d: "null", c: 0, o: "/"};
	E[814] = {d: "#1", c: 0, o: "/"};
	E[815] = {d: "null", c: 0, o: ""};
	E[816] = {d: "null", c: 0, o: "/"};
	E[825] = {d: "Téléporte", c: 0, o: "+"};
	E[905] = {d: "Lance un combat contre #2", c: 0, o: "/"};
	E[930] = {d: "Augmente la sérénité, diminue l\'agressivité ", c: 0, o: "/"};
	E[931] = {d: "Augmente l\'agressivité, diminue la sérénité ", c: 0, o: "/"};
	E[932] = {d: "Augmente l\'endurance", c: 0, o: "+"};
	E[933] = {d: "Diminue l\'endurance", c: 0, o: "-"};
	E[934] = {d: "Augmente l\'amour", c: 0, o: "+"};
	E[935] = {d: "Diminue l\'amour", c: 0, o: "-"};
	E[936] = {d: "Accelère la maturité ", c: 0, o: "+"};
	E[937] = {d: "Ralentit la maturité ", c: 0, o: "-"};
	E[939] = {d: "Augmente les capacités d\'un familier #3", c: 0, o: "+"};
	E[940] = {d: "Capacités accrues", c: 0, o: "+"};
	E[946] = {d: "Retirer temporairement un objet d\'élevage", c: 0, o: "/"};
	E[947] = {d: "Récupérer un objet d\'enclos", c: 0, o: "/"};
	E[948] = {d: "Objet pour enclos", c: 0, o: "/"};
	E[949] = {d: "Monter/Descendre d\'une monture", c: 0, o: "/"};
	E[950] = {d: "Etat #3", c: 71, o: "/"};
	E[951] = {d: "Enlève l\'état \'#3\'", c: 71, o: "/"};
	E[960] = {d: "Alignement : #3", c: 0, o: "/"};
	E[961] = {d: "Grade : #3", c: 0, o: "/"};
	E[962] = {d: "Niveau : #3", c: 0, o: "/"};
	E[963] = {d: "Créé depuis : #3 jour(s)", c: 0, o: "/"};
	E[964] = {d: "Nom : #4", c: 0, o: "/"};
	E[970] = {d: "null", c: 0, o: ""};
	E[971] = {d: "null", c: 0, o: ""};
	E[972] = {d: "null", c: 0, o: ""};
	E[973] = {d: "null", c: 0, o: ""};
	E[974] = {d: "null", c: 0, o: ""};
	E[983] = {d: "Échangeable dès le : #1", c: 0, o: "/"};
	E[984] = {d: "null", c: 0, o: "/"};
	E[985] = {d: "Modifié par : #4", c: 0, o: "/"};
	E[986] = {d: "Prépare #1{~1~2 à }#2 parchemins", c: 0, o: "/"};
	E[987] = {d: "Appartient à : #4", c: 0, o: "/"};
	E[988] = {d: "Fabriqué par : #4", c: 0, o: "/"};
	E[989] = {d: "Recherche : #4", c: 0, o: "/"};
	E[990] = {d: "#4", c: 0, o: "/"};
	E[994] = {d: "!! Certificat invalide !!", c: 0, o: "-"};
	E[995] = {d: "Consulter la fiche de la monture", c: 0, o: "/"};
	E[996] = {d: "Appartient à : #4", c: 0, o: "/"};
	E[997] = {d: "Nom : #4", c: 0, o: "/"};
	E[998] = {d: "Validité : #1j #2h #3m", c: 0, o: "/"};
	E[999] = {d: "null", c: 0, o: "+"};
	
	EDMG = new Array();
	EDMG[0] = 100;
	EDMG[1] = 95;
	EDMG[2] = 97;
	EDMG[3] = 92;
	EDMG[4] = 98;
	EDMG[5] = 93;
	EDMG[6] = 96;
	EDMG[7] = 91;
	EDMG[8] = 99;
	EDMG[9] = 94;
	EDMG[10] = 80;
	
	EHEL = new Array();
	EHEL[0] = 108;
	EHEL[1] = 81;
	
	FILE_END = true;
	*/
	
	
	
	public static enum DamagingEffect implements IEffectType{
		STEAL_X_PDV_WATER(91,CHANCE),
		STEAL_X_PDV_EARTH(92,FORCE),
		STEAL_X_PDV_AIR(93,AGILITE),
		STEAL_X_PDV_FIRE(94,INTELLIGENCE),
		STEAL_X_PDV_NEUTRAL(95,FORCE),
		DAMAGE_X_WATER(96,CHANCE),
		DAMAGE_X_EARTH(97,FORCE),//dafuq
		DAMAGE_X_AIR(98,AGILITE),
		DAMAGE_X_FIRE(99,INTELLIGENCE),
		DAMAGE_X_NEUTRAL(100,FORCE);
		
		private short ID = 0;
		private CharacteristicType CT = null;
		private DamagingEffect(int id, CharacteristicType characteristicTypeID){
			ID = (short)id;
			CT = characteristicTypeID;//CharacteristicType.getCharacteristique((byte)characteristicTypeID);
		}
		public short getID(){
			return this.ID;
		}
		public CharacteristicType getCharacType(){
			return this.CT;
		}
		public static IEffectType getEffect(short effectID) {
			for(IEffectType et : DamagingEffect.values()){
				if(et.getID() == effectID){
					return et;
				}
			}
			return null;
		}
		@Override
		public char getOperator() {
			return '-';
		}
		@Override
		public boolean isNegative() {
			return false;
		}
		@Override
		public boolean isPositive() {
			return false;
		}
		@Override
		public boolean isNeutralAttack(){
			return (this == STEAL_X_PDV_NEUTRAL || this == DAMAGE_X_NEUTRAL);
		}
		@Override
		public boolean hasDice(){
			return true;
		}
		@Override
		public IEffectType getOppositeEffect() {
			return null;
		}
	}
	
	public static enum HealingEffect implements IEffectType{
		REGIVEN_PDVS_XX(108,LIFE_POINTS),
		REGIVEN_PDVS_X(81,LIFE_POINTS);
		private short ID = 0;
		private CharacteristicType CT = null;
		private HealingEffect(int id, CharacteristicType characteristicTypeID){
			ID = (short)id;
			CT = characteristicTypeID;// CharacteristicType.getCharacteristique((byte)characteristicTypeID);
		}
		public short getID(){
			return this.ID;
		}
		public CharacteristicType getCharacType(){
			return this.CT;
		}
		public static IEffectType getEffect(short effectID) {
			for(IEffectType et : HealingEffect.values()){
				if(et.getID() == effectID){
					return et;
				}
			}
			return null;
		}		
		@Override
		public char getOperator() {
			return '+';
		}
		@Override
		public boolean isNegative() {
			return false;
		}
		@Override
		public boolean isPositive() {
			return true;
		}
		@Override
		public boolean isNeutralAttack(){
			return false;
		}
		@Override
		public boolean hasDice() {
			return true;
		}
		@Override
		public IEffectType getOppositeEffect() {
			return null;
		}
	}
	
	
	
	
	private static HashMap<Short, IEffectType> effects = new HashMap<Short, IEffectType>();
	
	static{
		for(IEffectType et : SpellEffectType.values()){
			effects.put(et.getID(), et);
		}
	}
	
	
	
	private short ID = 0;
	private CharacteristicType CT = null;
	private char operator = ' ';
	private boolean hasDice = false;
	private SpellEffectType oppositeEffect = null;
	
	private SpellEffectType(int id, Object... others){
		ID = (short)id;
		for(Object o : others){
			if(o instanceof CharacteristicType){
				CT = (CharacteristicType) o;
			}else 
			if(o instanceof Integer){
				CT = CharacteristicType.getCharacteristique(((Integer) o).byteValue());
			}else 
			if(o instanceof Character){
				operator = (Character) o;
			}else
			if(o instanceof Boolean){
				setHasDice((Boolean) o);
			}else
			if(o instanceof SpellEffectType){
				setOppositeEffect((SpellEffectType) o);
			}
		}
	}

	@Override
	public short getID(){
		return this.ID;
	}
	@Override
	public CharacteristicType getCharacType(){
		return this.CT;
	}
	@Override
	public char getOperator(){
		return this.operator;
	}
	public static IEffectType getEffect(short ID){
		return effects.get(ID);
	}
	
	
	public static IEffectType getEffectByHexStringID(String hexID) {
		try{
			return effects.get(Short.parseShort(hexID, 16));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean isPositive() {
		return (operator == '+');
	}
	@Override
	public boolean isNegative() {
		return (operator == '-');
	}
	@Override
	public boolean hasDice() {
		return hasDice;
	}
	public void setHasDice(boolean hasDice) {
		this.hasDice = hasDice;
	}
	@Override
	public SpellEffectType getOppositeEffect() {
		return oppositeEffect;
	}
	public void setOppositeEffect(SpellEffectType oppositeEffect) {
		this.oppositeEffect = oppositeEffect;
		if(oppositeEffect.getOppositeEffect() == null){
			oppositeEffect.setOppositeEffect(this);
		}
	}
	@Override
	public boolean isNeutralAttack(){
		return (this == STEAL_X_PDV_NEUTRAL || this == DAMAGE_X_NEUTRAL);
	}


	
}
