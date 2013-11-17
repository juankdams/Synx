package Constants;

import Enums.CharacteristicType;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques.CharacteristicColumn;


public class CPerso {

	public static final int nbrClass = 12;
	
	//Pour checker, à la création du perso, si l'id de classe et de sexe est valide
	public static final byte[] classesIDsBytes = {1,2,3,4,5,6,7,8,9,10,11,12};
	public static final String classesIDs = "-1-2-3-4-5-6-7-8-9-10-11-12-";
	public static final String[] classesNames = {"Feca","Osamodas","Enutrof","Sram","Xelor","Ecaflip","Eniripsa","Iop","Cra","Sadida","Sacrieur","Pandawa"};
	public static final String sexIDs = "-0-1-";
	public static final String channels = "i*#$%!:?p";
	public static final String emotes = "-0-1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-";
	
	
	public static final byte numberOfBasicClassSpells = 20;
	public static final byte CLASSE_FECA = 1;
	public static final byte CLASSE_OSAMODAS = 2;
	public static final byte CLASSE_ENUTROF = 3;
	public static final byte CLASSE_SRAM = 4;
	public static final byte CLASSE_XELOR = 5;
	public static final byte CLASSE_ECAFLIP = 6;
	public static final byte CLASSE_ENIRIPSA = 7;
	public static final byte CLASSE_IOP = 8;
	public static final byte CLASSE_CRA = 9;
	public static final byte CLASSE_SADIDA = 10;
	public static final byte CLASSE_SACRIEUR = 11;
	public static final byte CLASSE_PANDAWA = 12;
	//XXX On fera les nouvelles classes plus tard :)
	//public static final byte CLASSE_ZOBAL = 13;
	//public static final byte CLASSE_ROUBLARD = 14;
	//public static final byte CLASSE_STEAMER = 15;
	//public static final byte CLASSE_ELLIATROPE = 16;
	
	//Les index des parametres dans les arrays de GPersonnage
	//Les Bytes
	//public static final byte BYTES_SERVERID = 0;
	public static final byte BYTES_CLASS = 0;
	public static final byte BYTES_SEX = 1;
	public static final byte BYTES_ISDEAD = 2;
	public static final byte BYTES_NBRDEATHS = 3;
	public static final byte BYTES_ISINSELLINGMODE = 4;
	public static final byte BYTES_ALIGNMENT = 5;
	//public static final byte BYTES_ORIENTATION = 6;
	//Les Shorts
	//public static final byte SHORTS_LEVEL = 0;
	public static final byte SHORTS_MAXLEVELREACHED = 0;
	//public static final byte SHORTS_CELLID = 1;
	//public static final byte SHORTS_SIZE = 1;
	//Les Ints
	//public static final byte INTS_PERSOID = 0;
	//public static final byte INTS_GFXID = 1;
	//public static final byte INTS_COLOR1 = 2;
	//public static final byte INTS_COLOR2 = 3;
	//public static final byte INTS_COLOR3 = 4;
	public static final byte INTS_ACCOUNTID = 0;
	//public static final byte INTS_MAPID = 6;
	//Les Longs
	public static final byte LONGS_XP = 0;
	public static final byte LONGS_KAMAS = 1;
	//Les Strings
	public static final byte STRINGS_NAME = 0;
	public static final byte STRINGS_CHANNELS = 1;
	//Les Boolean
	public static final byte BOOLEANS_ISSIT = 0;
	
	
	/**Combien d'xp il faut pour monter le level d'alignement (Constante aussi présente dans GWorld)*/
	public static final byte xpForAlignmentLevel = 20; 
	
	/**TODO : incarnamStartMaps manque enutrof et panda*/
	//C.INCARNAM_CLASS_MAP = [10300, 10331, 10284, 10323, 10299, 10330, 10285, 10324, 10298, 10329, 10276, 10305, 10283, 10322, 10294, 10327, 10292, 10326, 10279, 10321, 10296, 10328, 10273, 10337];
	public static final short incarnamStartMaps[] = {10300,10299,7412,10285,10298,10276,10283,10294,10292,10279,10296,7412};
	/**TODO : astrubStartMaps*/
	public static final short astrubStartMaps[] = {7412,7412,7412,7412,7412,7412,7412,7412,7412,7412,7412,7412};
	
	//
	public static final short minimalLevelForAlignmentChat = 3;
	//Les valeurs de départ
	public static final String startEmotes = "-0-1-";
	public static final byte startPdv = 50;
	public static final byte startPA = 6;
	public static final byte startPM = 3;
	public static final short startPods = 1000;
	public static final byte startProspection = 100;
	public static final byte startEnutrofProspection = 120;
	public static final byte startInitiative = 0;
	public static final byte startIncovationsMax = 1;
	//Les gains par niveau, par boost, ou autre etc
	public static final byte spellPointsPerLevel = 1;
	public static final byte statsPointsPerLevel = 5;
	public static final byte pdvMaxPointsPerLevel = 5;
	public static final byte gainedPodsByForcePoints = 5;
	public static final double gainedInitByIntelAndAgiPoints = 1.5;
	public static final double gaindProspecByChancePoints = 0.1;
	public static final short gainedEsquivePointsBySagessePoints = 4;
	/**De combien on boost une charac chaque fois qu'on pese sur le bouton '+' de boost.*/
	public static final short characPointsByBoost = 1;
	
	//Les limites
	public static final short energyMax = 10000;
	
	/**Classe > Charac > palier, cout*/
	public static final short[][][][] paliers = {
												{},//Classe RIEN NULL
												{//Classe Feca
													{{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}}//Intelligence
												},
												{//Classe Osamodas
													{{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Intelligence
												},
												{//Classe Enutrof
													{{0, 1}, {50, 2}, {150, 3}, {250, 4}, {350, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {100, 2}, {150, 3}, {230, 4}, {330, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {20, 2}, {60, 3}, {100, 4}, {150, 5}},//Intelligence
												},
												{//Classe Sram
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Agilite
													{{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Intelligence
												},
												{//Classe Xelor
													{{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Intelligence                                                   
												},//b10: [[0, 1], [100, 2], [200, 3], [300, 4], [400, 5]],
												//b11: [[0, 1]],
												//b12: [[0, 3]], 
												//b13: [[0, 1], [20, 2], [40, 3], [60, 4], [80, 5]], 
												//b14: [[0, 1], [50, 2], [100, 3], [150, 4], [200, 5]], 
												//b15: [[0, 1], [20, 2], [40, 3], [60, 4], [80, 5]]};
												{//Classe Ecaflip
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {50, 2}, {100, 3}, {150, 4}, {200, 5}},//Agilite
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Intelligence
												},
												{//Classe Eniripsa
													{{0, 2}, {50, 3}, {150, 4}, {250, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Intelligence
												},
												{//Classe Iop
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Intelligence                                              
												},
												{//Classe Cra
													{{0, 1}, {50, 2}, {150, 3}, {250, 4}, {350, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Chance
													{{0, 1}, {50, 2}, {100, 3}, {150, 4}, {200, 5}},//Agilite
													{{0, 1}, {50, 2}, {150, 3}, {250, 4}, {350, 5}},//Intelligence
												},
												{//Classe Sadi
													{{0, 1}, {50, 2}, {250, 3}, {300, 4}, {400, 5}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Chance
													{{0, 1}, {20, 2}, {40, 3}, {60, 4}, {80, 5}},//Agilite
													{{0, 1}, {100, 2}, {200, 3}, {300, 4}, {400, 5}},//Intelligence
												},
												{//Classe Sacrieur
													{{0, 3}, {100, 4}, {150, 5}},//Force
													{{0, 1, 2}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 3}, {100, 4}, {150, 5}},//Chance
													{{0, 3}, {100, 4}, {150, 5}},//Agilite
													{{0, 3}, {100, 4}, {150, 5}}//Intelligence
												},
												{//Classe Pandara
													{{0, 1}, {50, 2}, {200, 3}},//Force
													{{0, 1}},//Vitalite
													{{0, 3}},//Sagesse
													{{0, 1}, {50, 2}, {200, 3}},//Chance
													{{0, 1}, {50, 2}, {200, 3}},//Agilite
													{{0, 1}, {50, 2}, {200, 3}},//Intelligence
												},
											};
	
	

	/**
	 * int[] = {coutCapitalPourUnBoost, NombreDePointsDonnéDansCharacParBoost};  Ex la vie des sacris serait: {1,2}
	 * @param p
	 * @param ct
	 * @return - Le cout en capital pour booster une charac et de combien on la boost.
	 */
	public static short[] getBoostCostAndCountForCharacteristic(GPersonnage p, CharacteristicType ct){
		int indexCharac = ct.get()-10;//Ca donne direct le bon index au lieu de faire un switch pour l'avoir ><
		if(indexCharac >= 0 && indexCharac <= 5){
			short coutEtNombre[] = {1,1};
			for(int i = 0; i < paliers[p.getClassID()][indexCharac].length; i++){
				if(p.getStatistique().getValue(ct.get(), CharacteristicColumn.BASE) >= paliers[p.getClassID()][indexCharac][i][0]){
					//Le cout en capital pour booster de un.
					coutEtNombre[0] = paliers[p.getClassID()][indexCharac][i][1];
					//Le nombre de fois qu'on boost.
					if(paliers[p.getClassID()][indexCharac][i].length == 3){//Vitalite des sacrieurs
						coutEtNombre[1] = paliers[p.getClassID()][indexCharac][i][2];
					}
				}
			}
			return coutEtNombre;
		}
		return null;
	}
	
	//Class > charac > method
	/*public static final Method[][][] paliers2 = {
		{},//Classe RIEN NULL
		{//Classe Feca
			
			{PaliersStats.class.getMethod("Palier1c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Osamodas
			{PaliersStats.class.getMethod("Palier1c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Enutrof
			{PaliersStats.class.getMethod("Palier4c", Short.class, Short.class)},//Sagesse},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{{0, 1}, {100, 2}, {150, 3}, {230, 4}, {330, 5}},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{{0, 1}, {20, 2}, {60, 3}, {100, 4}, {150, 5}}//Intelligence
		},
		{//Classe Sram
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier1c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Xelor
			{PaliersStats.class.getMethod("Palier1c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)}//Intelligence                                                   
		},
		{//Classe Ecaflip
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier6c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Eniripsa
			{PaliersStats.class.getMethod("Palier1c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Iop
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)}//Intelligence                                              
		},
		{//Classe Cra
			{PaliersStats.class.getMethod("Palier4c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier6c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier4c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Sadi
			{{0, 1}, {50, 2}, {250, 3}, {300, 4}, {400, 5}},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier5c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier2c", Short.class, Short.class)}//Intelligence
		},
		{//Classe Sacrieur
			{{0, 3}, {100, 4}, {150, 5}},//Force
			{PaliersStats.class.getMethod("Palier11c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{{0, 3}, {100, 4}, {150, 5}},//Chance
			{{0, 3}, {100, 4}, {150, 5}},//Agilite
			{{0, 3}, {100, 4}, {150, 5}}//Intelligence
		},
		{//Classe Pandawa
			{PaliersStats.class.getMethod("Palier3c", Short.class, Short.class)},//Force
			{PaliersStats.class.getMethod("Palier8c", Short.class, Short.class)},//Vitalite
			{PaliersStats.class.getMethod("Palier7c", Short.class, Short.class)},//Sagesse
			{PaliersStats.class.getMethod("Palier3c", Short.class, Short.class)},//Chance
			{PaliersStats.class.getMethod("Palier3c", Short.class, Short.class)},//Agilite
			{PaliersStats.class.getMethod("Palier3c", Short.class, Short.class)}//Intelligence
		}
	};*/

	
	/*
	_loc1.getBoostCostAndCountForCharacteristic = function (nCharacID)
    {
        var _loc3 = this.api.lang.getClassText(this._nGuild)["b" + nCharacID];
        var _loc4 = 1;
        var _loc5 = 1;
        var _loc6 = 0;
        switch (nCharacID)
        {
            case 10:
            {
                _loc6 = this._nForce;
                break;
            } 
            case 11:
            {
                _loc6 = this._nVitality;
                break;
            } 
            case 12:
            {
                _loc6 = this._nWisdom;
                break;
            } 
            case 13:
            {
                _loc6 = this._nChance;
                break;
            } 
            case 14:
            {
                _loc6 = this._agility;
                break;
            } 
            case 15:
            {
                _loc6 = this._intelligence;
                break;
            } 
        } // End of switch
        var _loc7 = 0;
        
        while (++_loc7, _loc7 < _loc3.length)
        {
            var _loc8 = _loc3[_loc7][0];
            if (_loc6 >= _loc8)
            {
                _loc4 = _loc3[_loc7][1];
                _loc5 = _loc3[_loc7][2] == undefined ? (1) : (_loc3[_loc7][2]);
                continue;
            } // end if
            break;
        } // end while
        return ({cost: _loc4, count: _loc5});
    };
	 */

	
	
}
