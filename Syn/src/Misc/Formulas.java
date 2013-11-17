package Misc;

import Constants.CPerso;
import Core.Syn;
import Enums.CharacteristicType;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import GameObjects.GStatistiques.CharacteristicColumn;

public class Formulas {

	
	/**
	 * Retourne l'initiative totale à (par Ex)  afficher dans le packet As 
	 * <p>et utiliser dans le début d'un combat pour l'ordre des joueurs
	 * <p>TODO: Manque le bonus d'alignement dans la formule de calcul 
	 * <p>(http://forums.jeuxonline.info/showthread.php?t=526481&page=2)(http://forums.jeuxonline.info/showthread.php?t=876422)
	 * @param stats - Les statistiques du joueur
	 * @param lvl - Le niveau du joueur
	 * @return - Le total d'initiative comprenant l'intel,l'agi, la force, la chance, la sagesse, l'init (equip), le niveau..
	 */
	public static int calculateTotalInitiative(GStatistiques stats, short lvl){
		short characs[] = {
				stats.getValue(CharacteristicType.INTELLIGENCE.get(), CharacteristicColumn.TOTAL),
				stats.getValue(CharacteristicType.AGILITE.get(), CharacteristicColumn.TOTAL),
				
				stats.getValue(CharacteristicType.FORCE.get(), CharacteristicColumn.TOTAL),
				stats.getValue(CharacteristicType.CHANCE.get(), CharacteristicColumn.TOTAL),
				stats.getValue(CharacteristicType.SAGESSE.get(), CharacteristicColumn.TOTAL),
				//Ici on prend l'init totale car elle peut venir des équips comme des boosts ou des bonbons
				stats.getValue(CharacteristicType.INITIATIVE.get(), CharacteristicColumn.TOTAL)
			};
		//Syn.d("Formulas.calculateInitiative : "+lvl+","+characs[0]+","+characs[1]+","+characs[2]+","+characs[3]+","+characs[4]+","+characs[5]);
		// On ne compte pas les valeures négatives  ÇA MARCHE PAS
		for(int i = characs.length; i-- > 0;){	
			if(characs[i] < 0){
				characs[i] = 0;
			}
		}
		//Syn.d("Formulas.calculateInitiative : "+lvl+","+characs[0]+","+characs[1]+","+characs[2]+","+characs[3]+","+characs[4]+","+characs[5]);
		//L'Intel et l'Agi comptent pour fois 1.5
		characs[0] = (short)Math.floor(characs[0]*CPerso.gainedInitByIntelAndAgiPoints);//Intel * 1.5
		characs[1] = (short)Math.floor(characs[1]*CPerso.gainedInitByIntelAndAgiPoints);//Agilite * 1.5
		//On additionne le tout et voilà !  (Manquerait juste d'ajouter le bonus d'alignement)
		return (lvl+characs[0]+characs[1]+characs[2]+characs[3]+characs[4]+characs[5]);
	}
	
	/**
	 * 
	 * @return - La total de prospection du joueur en prenant compte de 
	 * 		sa chance et sa prospection de base ou des équipements, etc
	 */
	public static int calculateTotalProspection(GStatistiques stats){
		short chance = stats.getValue(CharacteristicType.CHANCE.get(), CharacteristicColumn.TOTAL);
		if(chance < 0){
			chance = 0;
		}
		chance *= CPerso.gaindProspecByChancePoints;
		//Ici on prend la prospec totale car elle peut venir des équips comme des boosts ou des bonbons
		return (chance + stats.getValue(CharacteristicType.PROSPECTION.get(), CharacteristicColumn.TOTAL));
	}
	
	/**
	 * TODO: Ajouter le total des niveaux des métiers*5 et le nombre de métiers niveau 100*1000
	 * <p>http://forums.jeuxonline.info/showthread.php?t=801243#Le nombre de Pods
	 * @param stats
	 * @param p
	 * @return
	 */
	public static int calculateMaxPods(GStatistiques stats, GPersonnage p){
		short force = stats.getValue(CharacteristicType.FORCE.get(), CharacteristicColumn.TOTAL);
		if(force < 0){
			force = 0;
		}
		force *= CPerso.gainedPodsByForcePoints;
		return CPerso.startPods+force+p.getInventory().getTotalBonusPods();//+(totalLvlJobs*5)+(nbrLvl100Jobs*1000) <todo
	}
	
	
	public static short calculatePdvMax(GStatistiques s, GPersonnage p){
		return (short) (
				(p.getLevel()*CPerso.pdvMaxPointsPerLevel) +  //Pdvmax par niveau (5/lvl)
				CPerso.startPdv +   //Pdvmax de start (50)
				s.getValue(CharacteristicType.VITALITE.get(), CharacteristicColumn.TOTAL)//Vita de base+équipement
				);
	}
	
	/**
	 * Calcule la valeur pour la charac ESQUIVE_PA/PM dans la colonne choisie des statistiques du personnage 
	 * @param s - Les stats du perso
	 * @return - L'esquive qu'il a 
	 */
	public static short calculateEsquivePAPM(GStatistiques s, CharacteristicType ct, CharacteristicColumn cc){
		return (short) (
				(s.getValue(CharacteristicType.SAGESSE.get(), cc) / CPerso.gainedEsquivePointsBySagessePoints)+
				s.getValue(ct.get(), cc)
				);
	}
	
	
	
	
	
	
}
