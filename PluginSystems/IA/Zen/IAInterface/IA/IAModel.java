package Zen.IAInterface.IA;

import Abstractions.CombativeCharacter;
import GameObjects.GBuff;
import GameObjects.GEffect;
import GameObjects.GSpell;
import GameObjects.Fights.FightPvm;
import GameObjects.Fights.GFight;



public interface IAModel{

	
	public abstract void load(GFight fight);
	public abstract void start(GFight fight);
	public abstract void terminate();
	
	
	
	
	public static class StaticMethods{
		public static char dirs[] = {'b','d','f','h'};
		
		
		/**
		 * @param targets
		 * @return
		 */
		protected static int[] removeZerosFromArray(int[] targets){
			int num = 0;
			for(int i : targets){
				if(i != 0){
					num++;
				}
			}
			int targets2[] = new int[num];
			num = 0;
			for(int i : targets){
				if(i != 0){
					targets2[num++] = i;
				}
			}
			return targets2;
		}
		
		/**
		 * Bon pour trouver le best target et best spell (Trouve avec quel sort il fait le plus de dom total). 
		 * <p>C'est vraiment pour les mobs d'attaque. Met pas rien dautre l� dessus, y va heal/buff les ennemis
		 * @return - True si le fighter peut tuer le target, false sinon 
		 */
		protected static boolean canKillTarget(GFight fight, String spells, int targetCellID){
			int maxPossibleDmg = 0;
			int curPossibleDmg = 0;
			int bestSpell = 0;
			//SortStats spell = null;
			GSpell spell = null;
			
			for(String s : spells.split(";")){
				spell = fight.getCurrentFighter().getSpells().get(Integer.parseInt(s));
				if(isSpellUsuableOnTarget(fight.getCurrentFighter(), null, spell, fight)){
					
				}
				if(spell != null){
					for(GEffect se : spell.getEffects()){
						curPossibleDmg += FormulingManager.calculFinalDommage(fight, fight.getCurFighter(), fight.get_map().getCase(targetCellID).getFirstFighter(), se.getElement(), Formulas.getRandomJet(se.getArgs().split(";")[5]), false, false, Integer.parseInt(s));
					}
				}
				if(curPossibleDmg > maxPossibleDmg){
					maxPossibleDmg = curPossibleDmg;
				}
				curPossibleDmg = 0;
			}
			return true;
		}
		
		/**
		 * Retourne la cellID du best target � attaquer -> bon pour le moveForwardTo
		 */
		protected static int bestTarget(Fight fight, String spells, int targets[]){
			//Celui quil peut OS
			for(int target : targets){
				if(canKillTarget(fight, spells, target)){
					return target;
				}
			}
			//Sinon le plus proche
			int nearestTargetCell = 0;
			for(int target : targets){
				int dist = 1000;
				int d = Pathfinding.getDistanceBetween(fight.get_map(), fight.getCurFighter().get_fightCell().getID(), target);
				if (d >= dist){
					continue;
				}
				dist = d;
				nearestTargetCell = target;
			}
			return nearestTargetCell;
			//Au pire un au hasard
			//return Integer.parseInt(targets.split(";")[Formulas.getRandomValue(0, targets.split(";").length-1)]);
		}
		
		/**
		 * Avance vers la targetCell en param�tres (le meilleur ennemi � targeter)
		 */
		protected static void moveForwardsTo(Fight fight, int targetCell) {
			if(targetCell == -1){
				
			}
			IAkanido.moveNearIfPossible(fight, fight.getCurFighter(), fight.get_map().getCase(targetCell).getFirstFighter());
		}	
		
		
		/**
		 * Avance vers l'ennemi le plus pr�s
		 */
		protected static void moveForwards(Fight fight) {
			//getNearestEnnemy....style...
			//move to...
			Fighter f = getNearestEnnemy(fight, fight.getCurFighter());
			if(Pathfinding.isNextTo(f.get_fightCell().getID(), fight.getCurFighter().get_fightCell().getID())){
				//dont move
			}else{
				//move
				IAkanido.moveNearIfPossible(fight, fight.getCurFighter(), f);
			}
		}
		
		/**
		 * Essaie d'attaquer une cible
		 */
		protected static void attack(Fight fight, String spells, Fighter target){
			//Juste un spell dispo... ques tu veux faire dautre...
			if(spells.split(";").length == 1){
				fight.tryCastSpell(
						fight.getCurFighter(), 
						fight.getCurFighter().getMob().getSpells().get(Integer.parseInt(spells.split(";")[0])), 
						target.get_fightCell().getID(), false);
			}else{
				//RANDOM
				fight.tryCastSpell(
						fight.getCurFighter(), 
						fight.getCurFighter().getMob().getSpells().get(Integer.parseInt(spells.split(";")[Formulas.getRandomValue(0, spells.split(";").length-1)])), 
						target.get_fightCell().getID(), false);
			}
			
			//return "";
		}
		
		
		/**
		 * Retourne l'ennemi le plus pr�s du fighter
		 */
		protected static Fighter getNearestEnnemy(Fight fight, Fighter fighter) {
			int dist = 1000;
			Fighter curF = null;
			for (Fighter f : fight.getFighters(3)) {
				if ((f.isDead()) || (f.getTeam2() == fighter.getTeam2())){
					continue;
				}
				if(Pathfinding.isNextTo(f.get_fightCell().getID(), fighter.get_fightCell().getID())){
					return f;
				}
				int d = Pathfinding.getDistanceBetween(fight.get_map(), fighter.get_fightCell().getID(), f.get_fightCell().getID());
				if (d >= dist){
					continue;
				}
				dist = d;
				curF = f;
			}
			return curF;
		}
		
		/**
		 *TODO  Retourne l'ennemi le plus près du fighter //voulait faire genre, regarde sur toute les cells une à une autour du fighter, des qu'on trouve un ennemi on return
		 */
		protected static CombativeCharacter getNearestEnnemy2(GFight fight, CombativeCharacter fighter) {
			String cells = fighter.getCellID()+"%";
			
			/*Case cell = null;
			for(int a = 0; a < 70;a++)
			{
				for(String id : cells.split(";"))
				{
					for(char d : dirs)
					{
						cell = fight.getFightMap().getCase(Pathfinding.GetCaseIDFromDirrection(Integer.parseInt(id), d, fight.get_map(), true));
						if(cell == null || cells.contains(cell.getID()+"%")){
							continue;
						}
						if(cell.getFighters().isEmpty() == false){
							cells = null;
							return cell.getFirstFighter();
						}
						cells += cell.getID()+"%";
					}
				}
			}*/
			return null;
		}
		
		
		/**
		 * FIXME: CETTE METHODE EST PAS FINIE DETRE COD�E
		 * @return - Une String contenant les id des spells utilisables par le mob 
		 */
		protected static String getUsuableSpells(CombativeCharacter mob, GFight fight){
			String spells = "";
			for(GSpell SS : mob.getSpells().values()){
				if(SS.getPA() <= mob.getStatistique().getPA(null)){
					//for(int i = 0; i < mob.getLaunchedSorts().size() + 1; i++ ){
						boolean cooldownok = false;
						boolean maxlaunchbyturnok = false;
						for(GBuff b : mob.getBuffs()){
							//if(b.is cooldown buff de ce sort (spellID) ){   TODO
							//	if(b.is ok){
									cooldownok = true;
							//	}
							//}
							//if(b.is launch buff de ce sort (spellID) ){   TODO
							//	if(b.get number of launch < spell.getmaxlaunchbyturn){   TODO
									maxlaunchbyturnok = true;
							//	}
							//}
						}
						if(cooldownok & maxlaunchbyturnok){
							spells += SS.getID()+";";
						}
						/*if(LaunchedSort.coolDownGood(mob, SS.getID())){
							if(SS.getMaxLaunchbyTurn() <= 0 || LaunchedSort.getNbLaunch(mob, SS.getSpellID()) < SS.getMaxLaunchbyTurn()){
								//v � d�placer � un autre endroit plus tard dans les �tapes 
								//if(SS.getMaxLaunchbyTurn() <= 0 || mob.getLaunchedSorts().get(i).getNbLaunchTarget(fighter, target, id)){
								spells += SS.getSpellID()+";";
								//}
							}
						}*/
					//}
				}
			}
			return spells;
		}

		/**
		 * FIXME: CETTE METHODE EST PAS FINIE DETRE COD�E
		 * @return - Une String contenant les id des spells utilisables par le mob 
		 */
		protected static boolean isSpellUsuableOnTarget(CombativeCharacter mob, CombativeCharacter target, GSpell spell, GFight fight){
			if(spell.getPA() <= mob.getStatistique().getPA(null)){
				boolean cooldownok = false;
				boolean maxlaunchbyturnok = false;
				boolean maxlaunchbytargetbyturnok = false;
				for(GBuff b : target.getBuffs()){
					//if(b.is cooldown buff de ce sort (spellID) ){   TODO
					//	if(b.is ok){
							cooldownok = true;
					//	}
					//}
					//if(b.is launch buff de ce sort (spellID) ){   TODO
					//	if(b.get number of launch < spell.getmaxlaunchbyturn){   TODO
							maxlaunchbyturnok = true;
					//	}
					//}
					//if(b.is launch buff de ce sort (spellID) on target (mob.getID()) ){   TODO
					//	if(b.get number of launch < spell.getmaxlaunchbytargetbyturn){
							maxlaunchbytargetbyturnok = true;
					//	}
					//}
				}
				if((cooldownok & maxlaunchbyturnok & maxlaunchbytargetbyturnok) == true){
					return true;
				}
				return false;
				//if(LaunchedSort.coolDownGood(mob, spell.getID())){
				//	if(spell.getMaxLaunchByTurn() <= 0 || LaunchedSort.getNbLaunch(mob, spell.getID()) < spell.getMaxLaunchByTurn()){
				//		if(spell.getMaxLaunchByTurnByTarget() <= 0 || LaunchedSort.getNbLaunchTarget(mob, target, spell.getID()) < spell.getMaxLaunchByTurnByTarget()){
				//			return true;
				//		}
				//	}
				//}
			}
			return false;
		}
		
		
		/**
		 * Ca renvoie les targets qui sont atteignables en prenant compte des pm du mob et de sa port�e
		 * @param spells - La string retourn�e par la methode getUsuableSpells
		 */
		protected static int[] getReachableTargets(String spells, CombativeCharacter mob, GFight fight){
			if(spells == ""){
				return null;//comment tu veux atteindre qqn avec un spell si ten a pas -.-
			}
			int targetCells[] = new int[20];//oui plus que 8 puisque il peut y avoir des invocs
			byte i = 0;
			for(CombativeCharacter f : fight.getFighters(3)){
				if ((f.isDead()) || (f.getTeam2() == mob.getTeam2())){
					continue;
				}
				for(String spellID : spells.split(";")){
					if(Pathfinding.getDistanceBetween(fight.get_map(), f.get_fightCell().getID(), mob.get_fightCell().getID()) <= mob.getCurPM(fight) + (mob.getMob().getSpells().get(Integer.parseInt(spellID))).getMaxPO() ){
						targetCells[i] = f.get_fightCell().getID();
						i++;
					}
				}
			}
			return removeZerosFromArray(targetCells);
		}
		
		
		
		//Fin StaticMethods
	}
	
	
	//Fin IAModel
}
