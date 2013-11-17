/** Quentin Deligne Tout droits r&#232;server Kanido-Emulation **/
/** &#169; Kanido-Emulation 2010-2012 **/
/** Page de l'int&#232;ligence artificielle Inspirer de Ankama studio **/
/** Coder en java Jre 6 Avec simplification du code Caract&#232;re Iso-8859-1 **/
/** puissance du Proc&#233;sseur mise en charge 10000 Threads **/
//Thank you Quentin, Crystal.
package Zen.IAInterface.IA2;

import game.GameThread;
import game.GameThread.GameAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import common.CryptManager;
import common.Formulas;
import common.Pathfinding;
import common.World;
import common.Zen;

import Crystal.Perfs;

import objects.Carte;
import objects.Carte.Case;
import objects.Fight;
import objects.Fight.Fighter;
import objects.Sort;
import objects.Sort.SortStats;
import objects.SpellEffect;

public class IA{
	
		/*
		 * la 1 cest moveToAttack,attack,moveblabla
		 * la 2 commence par buf et bouge ensuite vers l'ami le plus pres SUPPORT
		 * la 3 commence par bouger vers ses amis et ensuite fait ses sorts SUPPORT 
		 * la 4 fuit et ensuite lance ses sorts SUPPORT 
		 * la 5 c'est l'ia de la bloqueuse BLOQUEUSE 
		 * la 6 heal, buff, buff, heal, attaque et ensuite fuit 
		 * 
		 * la 7 attack, moveToAttack, moveNear. un peu modifi� pour mieux marcher.
		 * la 8 attack, moveToAttack, moveFar (bon pour Tofu)
		 * la 9 : heal ami, buff ami, heal luimeme, buff luimeme, moveFar
		 * la 10 : 
		 * le perco attaque, fuit, heal/buff
		 */

		private Fight _fight = null;
		private Fight.Fighter _fighter = null;
		private boolean stop = false;
		private Thread _t = null;

		public IA(Fight.Fighter fighter, Fight fight, boolean createThread) {
			this._fighter = fighter;
			this._fight = fight;
		}

		public void startIA(){
			stop = false;
			if (_fighter.getMob() == null) {
				if (_fighter.isDouble()) {
					try {
						apply_type5(_fighter, _fight);
					} catch (Exception localException) {}
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException localInterruptedException) {}
					_fight.endTurn();
				} else if (_fighter.isPerco()) {
					apply_typePerco(_fighter, _fight);
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException localInterruptedException1) {
					}
					_fight.endTurn();
				}
				/*else if(Zen.CONFIG_PRISMES && _fighter.esPrisma()){ //AJOUTS PRISMES CONQUETES  CRYSTAL 
					tipo_Prisma(_fighter, _fight); 
					try { Thread.sleep(500); } catch (InterruptedException e) {}
					_fight.endTurn(); 
				}*/
				else {
					try {
						Thread.sleep(2000L);
					} catch (InterruptedException localInterruptedException2) {
					}
					_fight.endTurn();
				}
			} else if (_fighter.getMob() != null) {
				if(_fighter.getMob().getTemplate() == null){
					_fight.endTurn();
				}else{
					Zen.debug("\n\nIA_Type = "+_fighter.getMob().getTemplate().getIAType()+"\n");
					Perfs p1 = new Perfs();	
					switch (_fighter.getMob().getTemplate().getIAType()) {
						case 0:
							apply_type0(_fighter, _fight);
							break;
						case 1:
							try {
								apply_type1(_fighter, _fight);
							} catch (Exception localException1) {}
							break;
						case 2:
							try {
								apply_type2(_fighter, _fight);
							} catch (Exception localException2) {}
							break;
						case 3:
							try {
								apply_type3(_fighter, _fight);
							} catch (Exception localException3) {}
							break;
						case 4:
							try {
								apply_type4(_fighter, _fight);
							} catch (Exception localException4) {}
							break;
						case 5:
							try {
								apply_type5(_fighter, _fight);
							} catch (Exception localException5) {}
							break;
						case 6:
							try {
								apply_type6(_fighter, _fight);
							} catch (Exception localException6) {}
							break;
						
							
						
						case 7://bourrin: atta,moveToAttack,moveNear  (craqueleur)
							try {
								apply_type7(_fighter, _fight);
							} catch (Exception localException6) {}
							break;
						case 8://fuit: attaque, moveToAttack, moveFar  (tofu,prespic)
							try {
								apply_type8(_fighter, _fight);
							} catch (Exception localException6) {}
							break;
						case 9://support total et ensuite moveFar  (gonflable)
							try {
								apply_type9(_fighter, _fight);
							} catch (Exception localException6) {}
							break;	
						case 10://buff ennemi + moveNear   			(folle)
							try {
								apply_type10(_fighter, _fight);
							} catch (Exception localException6) {}
							break;	
						case 11://invocateur  + heal/buff + moveFar  (surpuissante)
							try {
								apply_type11(_fighter, _fight);
							} catch (Exception localException6) {}
							break;			
					}
					p1.stopTiming("SwitchIA ID "+_fighter.getMob().getTemplate().getIAType());
					p1 = null;
					try {
						if (_fighter.getMob().getTemplate().getIAType() == 0)
							Thread.sleep(250L);
						else
							Thread.sleep(2000L);
					} catch (InterruptedException localInterruptedException3) {
					}
					if (_fighter.isDead() == false) {
						_fight.endTurn();
					}
				}
			}
		}


		private void apply_type0(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15){
					return;
				}
				//int PDVPER = F.getPDV() * 100 / F.getPDVMAX();
				
				
				
			}
		}

		/**
		 * Mise en place de l'anti bug sur les fight IA monstre blocker en haut
		 * a gauche de la map et devien invincible
		 **/
		private void apply_type1(Fight.Fighter F, Fight fight) {
			Zen.debug("apply_type1");
			int noBoucle = 0;
			while ( (!stop) && (F.canPlay()) ) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15){
					return;
				}
				int PDVPER = F.getPDV() * 100 / F.getPDVMAX();
				Fight.Fighter T = getNearestEnnemy(fight, F);
				Fight.Fighter T2 = getNearestFriend(fight, F);
				if (T == null) {
					Zen.debug("ds apply_type1 : T == null : return");
					return;
				}
				if (PDVPER > 1) {
					int attack = attackIfPossible(fight, F);
					Zen.debug("ds apply_type1 : attack = "+attack);
					
					if (attack == 0)
						continue;
					if (attack == 5)
						stop = true;
					if (moveToAttackIfPossible(fight, F))
						continue;
					if (buffIfPossible(fight, F, F))
						continue;
					if (HealIfPossible(fight, F, false))
						continue;
					if (buffIfPossible(fight, F, T2))
						continue;
					if (moveNearIfPossible(fight, F, T))
						continue;
					if (invocIfPossible(fight, F))
						continue;
					stop = true;
				} else {
					if (HealIfPossible(fight, F, true))
						continue;
					int attack = attackIfPossible(fight, F);
					if (attack == 0)
						continue;
					if (attack == 5)
						stop = true;
					if (buffIfPossible(fight, F, F))
						continue;
					if (HealIfPossible(fight, F, false))
						continue;
					if (buffIfPossible(fight, F, T2))
						continue;
					if (invocIfPossible(fight, F))
						continue;
					if (!moveFarIfPossible(fight, F))
						stop = true;
				}
			}
		}

		private void apply_type2(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter T = getNearestFriend(fight, F);
				if (HealIfPossible(fight, F, false))
					continue;
				if (buffIfPossible(fight, F, T))
					continue;
				if (moveNearIfPossible(fight, F, T))
					continue;
				if (HealIfPossible(fight, F, true))
					continue;
				if (buffIfPossible(fight, F, F))
					continue;
				if (invocIfPossible(fight, F))
					continue;
				T = getNearestEnnemy(fight, F);
				int attack = attackIfPossible(fight, F);
				if (attack == 0)
					continue;
				if (attack == 5)
					stop = true;
				if (!moveFarIfPossible(fight, F))
					stop = true;
			}
		}

		private void apply_type3(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter T = getNearestFriend(fight, F);
				if (moveNearIfPossible(fight, F, T))
					continue;
				if (HealIfPossible(fight, F, false))
					continue;
				if (buffIfPossible(fight, F, T))
					continue;
				if (HealIfPossible(fight, F, true))
					continue;
				if (invocIfPossible(fight, F))
					continue;
				if (buffIfPossible(fight, F, F))
					continue;
				stop = true;
			}
		}

		private void apply_type4(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter T = getNearestEnnemy(fight, F);
				if (T == null)
					return;
				int attack = attackIfPossible(fight, F);
				if (attack == 0)
					continue;
				if (attack == 5)
					stop = true;
				if (moveFarIfPossible(fight, F))
					continue;
				if (HealIfPossible(fight, F, false))
					continue;
				if (buffIfPossible(fight, F, T))
					continue;
				if (HealIfPossible(fight, F, true))
					continue;
				if (invocIfPossible(fight, F))
					continue;
				if (buffIfPossible(fight, F, F))
					continue;
				stop = true;
			}
		}

		/**
		 * La bloqueuse -> moveNearEnnemy.
		 */
		private void apply_type5(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter T = getNearestEnnemy(fight, F);
				if (T == null)
					return;
				if(Pathfinding.getEnemyFighterArround2(F.get_fightCell().getID(), fight.get_map(), fight) != null){
					stop = true;
				}else
				if (moveNearIfPossible(fight, F, T)){
					continue;
				}
				stop = true;
			}
		}

		/**
		 * Support: invoque, Heal, buff friend, buff lui, heal lui, attack, moveFar
		 */
		private void apply_type6(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				if (invocIfPossible(fight, F))
					continue;
				Fight.Fighter T = getNearestFriend(fight, F);
				if (HealIfPossible(fight, F, false))
					continue;
				if (buffIfPossible(fight, F, T))
					continue;
				if (buffIfPossible(fight, F, F))
					continue;
				if (HealIfPossible(fight, F, true))
					continue;
				int attack = attackIfPossible(fight, F);
				if (attack == 0)
					continue;
				if (attack == 5)
					stop = true;
				if (!moveFarIfPossible(fight, F))
					stop = true;
			}
		}
		

		private void apply_typePerco(Fight.Fighter F, Fight fight) {
			try {
				int noBoucle = 0;
				do {
					noBoucle++;
					if (noBoucle >= 12)
						stop = true;
					if (noBoucle > 15)
						return;
					Fight.Fighter T = getNearestEnnemy(fight, F);
					if (T == null)
						return;
					int attack = attackIfPossiblePerco(fight, F);
					if (attack != 0) {
						if (attack == 5)
							stop = true;
						if (!moveFarIfPossible(fight, F)) {
							if (!HealIfPossiblePerco(fight, F, false)) {
								if (!buffIfPossiblePerco(fight, F, T)) {
									if (!HealIfPossiblePerco(fight, F, true)) {
										if (!buffIfPossiblePerco(fight, F, F)) {
											stop = true;
										}
									}
								}
							}
						}
					}
					if (stop)
						break;
				} while (F.canPlay());
			} catch (Exception e) {
				return;
			}
		}

		private boolean moveFarIfPossible(Fight fight, Fight.Fighter F) {
			int[] dist = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
			int[] cell = new int[10];
			for (int i = 0; i < 10; i++) {
				for (Fight.Fighter f : fight.getFighters(3)) {
					if ((f.isDead()) || (f == F) || (f.getTeam() == F.getTeam())){
						continue;
					}
					int cellf = f.get_fightCell().getID();
					if ((cellf != cell[0]) && (cellf != cell[1])
							&& (cellf != cell[2]) && (cellf != cell[3])
							&& (cellf != cell[4]) && (cellf != cell[5])
							&& (cellf != cell[6]) && (cellf != cell[7])
							&& (cellf != cell[8]) && (cellf != cell[9])) {
						int d = 0;
						d = Pathfinding.getDistanceBetween(fight.get_map(), F.get_fightCell().getID(), f.get_fightCell().getID());
						if (d != 0) {
							if (d < dist[i]) {
								dist[i] = d;
								cell[i] = cellf;
							}
							if (dist[i] != 1000)
								continue;
							dist[i] = 0;
							cell[i] = F.get_fightCell().getID();
						}
					}
				}
			}
			if (dist[0] == 0) {
				//Ancestra.debug("Dans moveFar, dist[0] == 0");
				return false;
			}
			int[] dist2 = new int[10];
			int PM = F.getCurPM(fight);
			int caseDepart = F.get_fightCell().getID();
			int destCase = F.get_fightCell().getID();
			for (int i = 0; i <= PM; i++) {
				if (destCase > 0)
					caseDepart = destCase;
				int curCase = caseDepart;
				curCase += 15;
				int infl = 0;
				int inflF = 0;
				for (int a = 0; (a < 10) && (dist[a] != 0); a++) {
					dist2[a] = Pathfinding.getDistanceBetween(fight.get_map(),
							curCase, cell[a]);
					if (dist2[a] > dist[a]) {
						infl++;
					}
				}
				if ((infl > inflF) && (curCase > 0) && (curCase < 478)
						&& (testCotes(destCase, curCase))) {
					inflF = infl;
					destCase = curCase;
				}
				curCase = caseDepart + 14;
				infl = 0;

				for (int a = 0; (a < 10) && (dist[a] != 0); a++) {
					dist2[a] = Pathfinding.getDistanceBetween(fight.get_map(),
							curCase, cell[a]);
					if (dist2[a] > dist[a]) {
						infl++;
					}
				}
				if ((infl > inflF) && (curCase > 0) && (curCase < 478)
						&& (testCotes(destCase, curCase))) {
					inflF = infl;
					destCase = curCase;
				}
				curCase = caseDepart - 15;
				infl = 0;
				for (int a = 0; (a < 10) && (dist[a] != 0); a++) {
					dist2[a] = Pathfinding.getDistanceBetween(fight.get_map(),
							curCase, cell[a]);
					if (dist2[a] > dist[a]) {
						infl++;
					}
				}
				if ((infl > inflF) && (curCase > 0) && (curCase < 478)
						&& (testCotes(destCase, curCase))) {
					inflF = infl;
					destCase = curCase;
				}

				curCase = caseDepart - 14;
				infl = 0;
				for (int a = 0; (a < 10) && (dist[a] != 0); a++) {
					dist2[a] = Pathfinding.getDistanceBetween(fight.get_map(),
							curCase, cell[a]);
					if (dist2[a] > dist[a]) {
						infl++;
					}
				}
				if ((infl <= inflF) || (curCase <= 0) || (curCase >= 478)
						|| (!testCotes(destCase, curCase)))
					continue;
				inflF = infl;
				destCase = curCase;
			}
			// System.out.println("Test MOVEFAR : cell = " + destCase);
			if ((destCase < 0) || (destCase > 478)
					|| (destCase == F.get_fightCell().getID())
					|| (!fight.get_map().getCase(destCase).isWalkable(false))){
				//Ancestra.debug("Dans moveFar, case != walkable || case=F.case");
				return false;
			}
			if (F.getPM() <= 0){
				//Ancestra.debug("Dans moveFar, pm <= 0");
				return false;
			}
			ArrayList<?> path = Pathfinding.getShortestPathBetween(
					fight.get_map(), F.get_fightCell().getID(), destCase, 0);
			if (path == null){
				//Ancestra.debug("Dans moveFar, path == null");
				return false;
			}
			ArrayList<Case> finalPath = new ArrayList<Case>();
			for (int a = 0; a < F.getPM(); a++) {
				if (path.size() == a)
					break;
				finalPath.add((Carte.Case) path.get(a));
			}
			String pathstr = "";
			try {
				int curCaseID = F.get_fightCell().getID();
				int curDir = 0;
				for (Carte.Case c : finalPath) {
					char d = Pathfinding.getDirBetweenTwoCase(curCaseID,
							c.getID(), fight.get_map(), true);
					if (d == 0){
						//Ancestra.debug("Dans moveFar, d == 0");
						return false;
					}
					if (curDir != d) {
						if (finalPath.indexOf(c) != 0)
							pathstr = pathstr
									+ CryptManager.cellID_To_Code(curCaseID);
						pathstr = pathstr + d;
					}
					curCaseID = c.getID();
				}
				if (curCaseID != F.get_fightCell().getID())
					pathstr = pathstr + CryptManager.cellID_To_Code(curCaseID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			GameThread.GameAction GA = new GameThread.GameAction(0, 1, "");
			GA._args = pathstr;
			boolean result = fight.fighterDeplace(F, GA);
			try {
				Thread.sleep(100L);
			} catch (InterruptedException localInterruptedException) {
			}
			//Ancestra.debug("Dans moveFar, return result = "+Boolean.toString(result));
			return result;
		}

		private boolean testCotes(int cell1, int cell2) {
			if ((cell1 == 15) || (cell1 == 44) || (cell1 == 73)
					|| (cell1 == 102) || (cell1 == 131) || (cell1 == 160)
					|| (cell1 == 189) || (cell1 == 218) || (cell1 == 247)
					|| (cell1 == 276) || (cell1 == 305) || (cell1 == 334)
					|| (cell1 == 363) || (cell1 == 392) || (cell1 == 421)
					|| (cell1 == 450)) {
				if ((cell2 == cell1 + 14) || (cell2 == cell1 - 15))
					return false;
			}
			if ((cell1 == 28) || (cell1 == 57) || (cell1 == 86)
					|| (cell1 == 115) || (cell1 == 144) || (cell1 == 173)
					|| (cell1 == 202) || (cell1 == 231) || (cell1 == 260)
					|| (cell1 == 289) || (cell1 == 318) || (cell1 == 347)
					|| (cell1 == 376) || (cell1 == 405) || (cell1 == 434)
					|| (cell1 == 463)) {
				if ((cell2 == cell1 + 15) || (cell2 == cell1 - 14))
					return false;
			}
			return true;
		}

		private boolean invocIfPossible(Fight fight,
				Fight.Fighter fighter) {
			Fight.Fighter nearest = getNearestEnnemy(fight, fighter);
			if (nearest == null)
				return false;
			int nearestCell = Pathfinding.getNearestCellAround(fight.get_map(),fighter.get_fightCell().getID(), nearest.get_fightCell().getID(), null);
			if (nearestCell == -1){
				return false;
			}
			Sort.SortStats spell = getInvocSpell(fight, fighter, nearestCell);
			if (spell == null)
				return false;
			int invoc = fight.tryCastSpell(fighter, spell, nearestCell, false);
			if (invoc != 0)
				return false;

			try {
				switch (Formulas.getRandomValue(1, 5)) {
				case 1:
					SM.chat.cS(fight, 7, fighter.getGUID(), 1);
					break;
				case 2:
					SM.chat.cS(fight, 7,
							fighter.getGUID(), 4);
					break;
				case 3:
					SM.chat.cS(fight, 7, fighter.getGUID(), 11);
				}
			} catch (Exception localException) {
			}
			return true;
		}

		/**
		 * Fin de la session debug monstre blocker en haut a gauche de la map
		 * cell xxx
		 **/
		private Sort.SortStats getInvocSpell(Fight fight,
				Fight.Fighter fighter, int nearestCell) {
			if (fighter.getMob() == null)
				return null;
			for (Entry<Integer, SortStats> SS : fighter.getMob().getSpells()
					.entrySet()) {
				if (!fight.CanCastSpell(fighter,
						(Sort.SortStats) SS.getValue(), fight.get_map()
								.getCase(nearestCell), -1))
					continue;
				for (SpellEffect SE : ((Sort.SortStats) SS.getValue())
						.getEffects()) {
					if (SE.getEffectID() == 181)
						return (Sort.SortStats) SS.getValue();
				}
			}
			return null;
		}

		private boolean HealIfPossible(Fight fight, Fight.Fighter f,boolean autoSoin) {
			//Ancestra.debug("Entr� HealIfPossible");
			//s'il devait s'autosoigner mais qu'il a >95% de vie, inutile.
			if ((autoSoin) &&   ((f.getPDV() * 100 / f.getPDVMAX() > 95) &&(f.getMob().getSpells().containsKey(587) == false))  ){
				//Ancestra.debug("HealIfPossible Entr� dans lpremier if");
				return false;
			}
			Fight.Fighter target = null;
			Sort.SortStats SS = null;
			if (autoSoin) {
				target = f;
				SS = getHealSpell(fight, f, target);
			} else {
				Fight.Fighter curF = null;
				int PDVPERmin = 100;
				Sort.SortStats curSS = null;
				for (Fight.Fighter F : fight.getFighters(3)) {
					if ((f.isDead()) || (F.isDead()))
						continue;
					if ((F == f) || (F.getTeam() != f.getTeam()))
						continue;
					int PDVPER = F.getPDV() * 100 / F.getPDVMAX();
					if ((PDVPER >= PDVPERmin) || (PDVPER >= 95))
						continue;
					int infl = 0;
					for (Entry<Integer, SortStats> ss : f.getMob().getSpells().entrySet()) {
						if ((infl >= calculInfluenceHeal((Sort.SortStats) ss.getValue()))
								|| (calculInfluenceHeal((Sort.SortStats) ss.getValue()) == 0)
								|| (!fight.CanCastSpell(f,(Sort.SortStats) ss.getValue(),F.get_fightCell(), -1)))
							continue;
						infl = calculInfluenceHeal((Sort.SortStats) ss.getValue());
						curSS = (Sort.SortStats) ss.getValue();
					}

					if ((curSS == SS) || (curSS == null))
						continue;
					curF = F;
					SS = curSS;
					PDVPERmin = PDVPER;
				}
				target = curF;
			}
			if (target == null){
				//Ancestra.debug("HealIfPossible target ==null");
				return false;
			}
			if (SS == null){
				//Ancestra.debug("HealIfPossible SS ==null");
				return false;
			}
			int heal = fight.tryCastSpell(f, SS, target.get_fightCell().getID(), false);
			//Ancestra.debug("HealIfPossible heal == "+heal);
			return heal == 0;
		}

		/**
		 * Mise en place de L'inteligence artifielle quand le monstre trouve
		 * qu'il devrez commencer a se soignier lui ou un alier
		 **/
		private boolean HealIfPossiblePerco(Fight fight,
				Fight.Fighter f, boolean autoSoin) {
			if ((autoSoin) && (f.getPDV() * 100 / f.getPDVMAX() > 95))
				return false;
			Fight.Fighter target = null;
			Sort.SortStats SS = null;
			if (autoSoin) {
				target = f;
				SS = getHealSpell(fight, f, target);
			} else {
				Fight.Fighter curF = null;
				int PDVPERmin = 100;
				Sort.SortStats curSS = null;
				for (Fight.Fighter F : fight.getFighters(3)) {
					if ((f.isDead()) || (F == f)
							|| (F.getTeam() != f.getTeam()))
						continue;
					int PDVPER = F.getPDV() * 100 / F.getPDVMAX();
					if ((PDVPER >= PDVPERmin) || (PDVPER >= 95))
						continue;
					int infl = 0;
					for (Entry<Integer, SortStats> ss : World
							.getGuild(F.getPerco().GetPercoGuildID())
							.getSpells().entrySet()) {
						if ((ss.getValue() == null)
								|| (infl >= calculInfluenceHeal((Sort.SortStats) ss
										.getValue()))
								|| (calculInfluenceHeal((Sort.SortStats) ss
										.getValue()) == 0)
								|| (!fight.CanCastSpell(f,
										(Sort.SortStats) ss.getValue(),
										F.get_fightCell(), -1)))
							continue;
						infl = calculInfluenceHeal((Sort.SortStats) ss
								.getValue());
						curSS = (Sort.SortStats) ss.getValue();
					}

					if ((curSS == SS) || (curSS == null))
						continue;
					curF = F;
					SS = curSS;
					PDVPERmin = PDVPER;
				}
				target = curF;
			}
			if (target == null)
				return false;
			if (SS == null)
				return false;
			int heal = fight
					.tryCastSpell(f, SS, target.get_fightCell().getID(), false);
			return heal == 0;
		}

		/**
		 * On regarde si un buff allier et possible si c le cas on active l'IA
		 * buff
		 **/
		private boolean buffIfPossible(Fight fight, Fight.Fighter fighter, Fight.Fighter target) {
			if (target == null){
				return false;
			}
			Sort.SortStats SS = getBuffSpell(fight, fighter, target);
			if (SS == null){
				return false;
			}
			int buff = fight.tryCastSpell(fighter, SS, target.get_fightCell().getID(), false);
			return buff == 0;
		}

		/** Fin de la function buff alier **/
		private boolean buffIfPossiblePerco(Fight fight,Fight.Fighter fighter, Fight.Fighter target) {
			if (target == null)
				return false;
			Sort.SortStats SS = getBuffSpellPerco(fight, fighter, target);
			if (SS == null)
				return false;
			int buff = fight.tryCastSpell(fighter, SS, target.get_fightCell().getID(), false);
			return buff == 0;
		}

		private Sort.SortStats getBuffSpell(Fight fight,Fight.Fighter F, Fight.Fighter T) {
			int infl = 0;
			Sort.SortStats ss = null;
			for (Entry<Integer, SortStats> SS : F.getMob().getSpells().entrySet()) {
				if ((infl >= calculInfluence((Sort.SortStats) SS.getValue(), F,T))
						|| (calculInfluence((Sort.SortStats) SS.getValue(), F, T) <= 0)
						|| (!fight.CanCastSpell(F,(Sort.SortStats) SS.getValue(), T.get_fightCell(), -1))){
					continue;
				}
				infl = calculInfluence((Sort.SortStats) SS.getValue(), F, T);
				ss = (Sort.SortStats) SS.getValue();
			}

			return ss;
		}

		private Sort.SortStats getBuffSpellPerco(Fight fight, Fight.Fighter F, Fight.Fighter T) {
			int infl = 0;
			Sort.SortStats ss = null;
			for (Entry<Integer, SortStats> SS : World .getGuild(F.getPerco().GetPercoGuildID()).getSpells() .entrySet()) {
				if ((SS.getValue() == null)
						|| (infl >= calculInfluence( (Sort.SortStats) SS.getValue(), F, T))
						|| (calculInfluence((Sort.SortStats) SS.getValue(), F, T) <= 0)
						|| (!fight.CanCastSpell(F, (Sort.SortStats) SS.getValue(), T.get_fightCell(), -1)))
					continue;
				infl = calculInfluence((Sort.SortStats) SS.getValue(), F, T);
				ss = (Sort.SortStats) SS.getValue();
			}

			return ss;
		}

		private Sort.SortStats getHealSpell(Fight fight, Fight.Fighter F, Fight.Fighter T) {
			int infl = 0;
			Sort.SortStats ss = null;
			for (Entry<Integer, SortStats> SS : F.getMob().getSpells().entrySet()) {
				if ((infl >= calculInfluenceHeal((Sort.SortStats) SS.getValue()))
						|| (calculInfluenceHeal((Sort.SortStats) SS.getValue()) == 0)
						|| (!fight.CanCastSpell(F,(Sort.SortStats) SS.getValue(),T.get_fightCell(), -1)))
					continue;
				infl = calculInfluenceHeal((Sort.SortStats) SS.getValue());
				ss = (Sort.SortStats) SS.getValue();
			}
			return ss;
		}

		public static boolean moveNearIfPossible(Fight fight, Fighter F,Fighter T) {
			//GameServer.addToLog("Tentative d'approche par "+F.getPacketsName()+" de "+T.getPacketsName()); -> se fait une fois quand il bouge, une fois quand il arrete son tour
			int cellID = Pathfinding.getNearestCellAround(fight.get_map(), T.get_fightCell().getID(), F.get_fightCell().getID(), null);
			// On demande le chemin plus court
			ArrayList<Case> path = Pathfinding.getShortestPathBetween(fight.get_map(), F.get_fightCell().getID(), cellID, 0);
			if (path == null || path.size() == 0) {
				return false;
			}
			ArrayList<Case> finalPath = new ArrayList<Case>();
			for (int a = 0; a < F.getPM(); a++) {
				if (path.size() == a)
					break;
				finalPath.add(path.get(a));
			}
			String pathstr = "";
			try {
				int curCaseID = F.get_fightCell().getID();
				int curDir = 0;
				for (Case c : finalPath) {
					char d = Pathfinding.getDirBetweenTwoCase(curCaseID,
							c.getID(), fight.get_map(), true);
					if (d == 0)
						return false;// Ne devrait pas arriver :o
					if (curDir != d) {
						if (finalPath.indexOf(c) != 0)
							pathstr += CryptManager.cellID_To_Code(curCaseID);
						pathstr += d;
					}
					curCaseID = c.getID();
				}
				if (curCaseID != F.get_fightCell().getID())
					pathstr += CryptManager.cellID_To_Code(curCaseID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			;
			// Cr�ation d'une GameAction
			GameAction GA = new GameAction(0, 1, "");
			GA._args = pathstr;
			boolean result = fight.fighterDeplace(F, GA);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			return result;
		}

		// //----ici

		/*
		 * private boolean moveNearIfPossible(Fight fight, Fight.Fighter
		 * F, Fight.Fighter T) { if(F.getCurPM(fight) <= 0) return false;
		 * if(Pathfinding.isNextTo(F.get_fightCell().getID(),
		 * T.get_fightCell().getID())) { return false; }
		 * if(Ancestra.CONFIG_DEBUG) {
		 * GameServer.addToLog("Tentative d'approche par " + F.getPacketsName()
		 * + " de " + T.getPacketsName()); } int cellID =
		 * Pathfinding.getNearestCellAround(fight.get_map(),
		 * T.get_fightCell().getID(), F.get_fightCell().getID(), null);
		 * if(cellID == -1) { Map<Integer,Fighter> ennemys =
		 * getLowHpEnnemyList(fight, F); for(Entry<Integer, Fighter> target :
		 * ennemys.entrySet()) { int cellID2 =
		 * Pathfinding.getNearestCellAround(fight.get_map(),
		 * ((Fight.Fighter)target.getValue()).get_fightCell().getID(),
		 * F.get_fightCell().getID(), null); if(cellID2 == -1) continue; cellID
		 * = cellID2; break; } }
		 * 
		 * 
		 * ArrayList<Case> path =
		 * Pathfinding.getShortestPathBetween(fight.get_map(),
		 * F.get_fightCell().getID(), cellID, 0); if((path == null) ||
		 * (path.isEmpty())) return false;
		 * 
		 * ArrayList<Case> finalPath = new ArrayList<Case>(); for(int a = 0; a <
		 * F.getCurPM(fight); a++) { if(path.size() == a) break;
		 * finalPath.add((Carte.Case)path.get(a)); } String pathstr = ""; try {
		 * int curCaseID = F.get_fightCell().getID(); int curDir = 0;
		 * for(Carte.Case c : finalPath) { char d =
		 * Pathfinding.getDirBetweenTwoCase(curCaseID, c.getID(),
		 * fight.get_map(), true); if(d == 0) return false; if(curDir != d) {
		 * if(finalPath.indexOf(c) != 0) pathstr = pathstr +
		 * CryptManager.cellID_To_Code(curCaseID); pathstr = pathstr + d; }
		 * curCaseID = c.getID(); } if(curCaseID != F.get_fightCell().getID())
		 * pathstr = pathstr + CryptManager.cellID_To_Code(curCaseID); } catch
		 * (Exception e) { e.printStackTrace(); } GameThread.GameAction GA = new
		 * GameThread.GameAction(0, 1, ""); GA._args = pathstr; boolean result =
		 * fight.fighterDeplace(F, GA); try { Thread.sleep(100L); } catch
		 * (InterruptedException localInterruptedException) { } return result; }
		 */

		private Fight.Fighter getNearestFriend(Fight fight,Fight.Fighter fighter) {
			int dist = 1000;
			Fight.Fighter curF = null;
			for (Fight.Fighter f : fight.getFighters(3)) {
				if ((f.isDead()) || (f == fighter)
						|| (f.getTeam2() != fighter.getTeam2()))
					continue;
				int d = Pathfinding.getDistanceBetween(fight.get_map(), fighter.get_fightCell().getID(), f.get_fightCell().getID());
				if (d >= dist)
					continue;
				dist = d;
				curF = f;
			}
			return curF;
		}

		private Fight.Fighter getNearestEnnemy(Fight fight, Fight.Fighter fighter) {
			int dist = 1000;
			Fight.Fighter curF = null;
			for (Fight.Fighter f : fight.getFighters(3)) {
				if ((f == null) || (f.isDead()) || (f.getTeam2() == fighter.getTeam2())){
					continue;
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

		private Map<Integer, Fight.Fighter> getLowHpEnnemyList(Fight fight, Fight.Fighter fighter) {
			Map<Integer, Fighter> list = new TreeMap<Integer, Fighter>();
			Map<Integer, Fighter> ennemy = new TreeMap<Integer, Fighter>();
			for (Fight.Fighter f : fight.getFighters(3)) {
				if ((f.isDead()) || (f == fighter) || (f.getTeam2() == fighter.getTeam2())){
					continue;
				}
				ennemy.put(Integer.valueOf(f.getPDV()), f);
			}

			int i = 0;
			int i2 = ennemy.size();
			int curHP = 10000;
			while (i < i2) {
				curHP = 200000;
				for (Entry<Integer, Fighter> t : ennemy.entrySet()) {
					if (((Fight.Fighter) t.getValue()).getPDV() < curHP){
						curHP = ((Fight.Fighter) t.getValue()).getPDV();
					}
				}
				Fight.Fighter test = (Fight.Fighter) ennemy.get(Integer.valueOf(curHP));
				list.put(Integer.valueOf(test.getPDV()), test);
				ennemy.remove(Integer.valueOf(curHP));
				i++;
			}
			return list;
		}

		private int attackIfPossible(Fight fight, Fight.Fighter fighter) {
			//v jimagine que ctune liste des ennemi en ordre du moins de pdv au plus de pdv
			Map<Integer, Fighter> ennemyList = getLowHpEnnemyList(fight, fighter);
			SortStats SS = null;
			Fighter target = null;
			//donc on essaye de taper celui qui a le moins de vie en premier
			for (Entry<Integer, Fighter> t : ennemyList.entrySet()) {
				SS = getBestSpellForTarget(fight, fighter, (Fight.Fighter) t.getValue());
				if (SS == null) {
					//Ancestra.debug("SS = getBestSpellForTarget == null");
					continue;
				}
				target = (Fight.Fighter) t.getValue();
				break;
			}
			int curTarget = 0;
			int cell = 0;
			Sort.SortStats SSzone = null;
			for (Entry<Integer, SortStats> S : fighter.getMob().getSpells().entrySet()) {
				if ((S.getValue().getPorteeType().charAt(0) == 'P') && (S.getValue().getPorteeType().charAt(1) == 'a')){
					//si ce nest pas un sort de zone
				}else{
					int targetVal = getBestTargetZone(fight, fighter,(Sort.SortStats) S.getValue(), fighter.get_fightCell().getID());
					if ((targetVal == -1) || (targetVal == 0)){
						continue;
					}
					//int nbTarget = targetVal / 1000;
					if (targetVal / 1000 <= curTarget){
						continue;
					}
					curTarget = targetVal / 1000;
					cell = targetVal - (targetVal / 1000) * 1000;
					SSzone = (Sort.SortStats) S.getValue();
				}
			}
			//v les sorts de zones en premier:
			if ((curTarget > 0) && (cell > 0) && (cell < 480) && (SSzone != null)) {
				int attack = fight.tryCastSpell(fighter, SSzone, cell, false);
				if (attack != 0){
					return attack;
				}
			} else {//ensuite les sorts � 1 target
				if ((target == null) || (SS == null)){
					return 666;
				}
				int attack = fight.tryCastSpell(fighter, SS, target.get_fightCell().getID(), false);
				if (attack != 0){
					return attack;
				}
			}
			return 0;
		}

		private int attackIfPossiblePerco(Fight fight, Fight.Fighter fighter) {
			Map<Integer, Fighter> ennemyList = getLowHpEnnemyList(fight, fighter);
			SortStats SS = null;
			Fighter target = null;
			for (Entry<Integer, Fighter> t : ennemyList.entrySet()) {
				SS = getBestSpellForTargetPerco(fight, fighter, (Fight.Fighter) t.getValue());
				if (SS == null)
					continue;
				target = (Fight.Fighter) t.getValue();
				break;
			}

			int curTarget = 0;
			int cell = 0;
			Sort.SortStats SS2 = null;
			for (Entry<Integer, SortStats> S : World
					.getGuild(fighter.getPerco().GetPercoGuildID()).getSpells()
					.entrySet()) {
				if (S.getValue() != null) {
					int targetVal = getBestTargetZone(fight, fighter,
							(Sort.SortStats) S.getValue(), fighter
									.get_fightCell().getID());
					if ((targetVal == -1) || (targetVal == 0))
						continue;
					int nbTarget = targetVal / 1000;
					int cellID = targetVal - nbTarget * 1000;
					if (nbTarget <= curTarget)
						continue;
					curTarget = nbTarget;
					cell = cellID;
					SS2 = (Sort.SortStats) S.getValue();
				}
			}
			if ((curTarget > 0) && (cell > 0) && (cell < 480) && (SS2 != null)) {
				int attack = fight.tryCastSpell(fighter, SS2, cell, false);
				if (attack != 0)
					return attack;
			} else {
				if ((target == null) || (SS == null))
					return 666;
				int attack = fight.tryCastSpell(fighter, SS, target.get_fightCell().getID(), false);
				if (attack != 0)
					return attack;
			}
			return 0;
		}

		private boolean moveToAttackIfPossible(Fight fight, Fight.Fighter fighter) {
			ArrayList<?> cells = Pathfinding.getListCaseFromFighter(fight, fighter);
			if (cells == null){
				//Ancestra.debug("Dans moveToAttackIfPossible if(cells == null){");
				return false;
			}
			int distMin = Pathfinding.getDistanceBetween(fight.get_map(), fighter.get_fightCell().getID(),getNearestEnnemy(fight, fighter).get_fightCell().getID());
			ArrayList<SortStats> sorts = getLaunchableSpell(fighter, fight, distMin);
			if (sorts == null){
				//Ancestra.debug("Dans moveToAttackIfPossible if(sorts == null){");
				return false;
			}
			ArrayList<Fighter> targets = getPotentialTarget(fight, fighter, sorts);
			if (targets == null) {
				//Ancestra.debug("Dans moveToAttackIfPossible if(targets == null){");
				return false;
			}
			int CellDest = 0;
			boolean found = false;
			for (Iterator<?> localIterator1 = cells.iterator(); localIterator1.hasNext();) {
				int i = ((Integer) localIterator1.next()).intValue();
				for (Sort.SortStats S : sorts) {
					for (Fight.Fighter T : targets) {
						if (fight.CanCastSpell(fighter, S, T.get_fightCell(), i)) {
							CellDest = i;
							found = true;
						}
						int targetVal = getBestTargetZone(fight, fighter, S, i);
						if (targetVal > 0) {
							int nbTarget = targetVal / 1000;
							int cellID = targetVal - nbTarget * 1000;
							if (fight.get_map().getCase(cellID) != null) {
								if (fight.CanCastSpell(fighter, S, fight.get_map().getCase(cellID), i)) {
									CellDest = i;
									found = true;
								}
							}
						}
						if (found)
							break;
					}
					if (found)
						break;
				}
				if (found)
					break;
			}
			if (CellDest == 0){
				//Ancestra.debug("Dans moveToAttackIfPossible if(CellDest == 0)");
				return false;
			}
			ArrayList<Case> path = Pathfinding.getShortestPathBetween(fight.get_map(), fighter.get_fightCell().getID(), CellDest,0);
			if (path == null){
				//Ancestra.debug("Dans moveToAttackIfPossible if(path == null)");
				return false;
			}
			String pathstr = "";
			try {
				int curCaseID = fighter.get_fightCell().getID();
				int curDir = 0;
				for (Case c : path) {
					char d = Pathfinding.getDirBetweenTwoCase(curCaseID,c.getID(), fight.get_map(), true);
					if (d == 0){
						//Ancestra.debug("Dans moveToAttackIfPossible if(d == 0)");
						return false;
					}
					if (curDir != d) {
						if (path.indexOf(c) != 0)
							pathstr = pathstr + CryptManager.cellID_To_Code(curCaseID);
						pathstr = pathstr + d;
					}
					curCaseID = c.getID();
				}
				if (curCaseID != fighter.get_fightCell().getID())
					pathstr = pathstr + CryptManager.cellID_To_Code(curCaseID);
			} catch (Exception e) {
				e.printStackTrace();
			}
			GameThread.GameAction GA = new GameThread.GameAction(0, 1, "");
			GA._args = pathstr;
			boolean result = fight.fighterDeplace(fighter, GA);
			try {
				Thread.sleep(100L);
			} catch (InterruptedException localInterruptedException) {
			}
			//Ancestra.debug("Dans moveToAttackIfPossible return result = "+Boolean.toString(result));
			return result;
		}

		private ArrayList<Sort.SortStats> getLaunchableSpell( Fight.Fighter fighter, Fight fight, int distMin) {
			ArrayList<SortStats> sorts = new ArrayList<SortStats>();
			if (fighter.getMob() == null){
				return null;
			}
			for (Entry<Integer, SortStats> S : fighter.getMob().getSpells().entrySet()) {
				if (((Sort.SortStats) S.getValue()).getPACost() > fighter.getCurPA(fight)) {
					continue;
				}
				if (!Fight.LaunchedSort.coolDownGood(fighter,((Sort.SortStats) S.getValue()).getSpellID())){
					continue;
				}
				if ((((Sort.SortStats) S.getValue()).getMaxLaunchbyTurn() - Fight.LaunchedSort.getNbLaunch(fighter,((Sort.SortStats) S.getValue()).getSpellID()) <= 0)
						&& (((Sort.SortStats) S.getValue()).getMaxLaunchbyTurn() > 0)){
					continue;
				}
				if (calculInfluence((Sort.SortStats) S.getValue(), fighter, fighter) >= 0){
					continue;
				}
				sorts.add((Sort.SortStats) S.getValue());
			}
			ArrayList<SortStats> finalS = TriInfluenceSorts(fighter, sorts);
			return finalS;
		}

		/* {debug true } */
		private ArrayList<Sort.SortStats> TriInfluenceSorts( Fight.Fighter fighter, ArrayList<Sort.SortStats> sorts) {
			if (sorts == null) {
				return null;
			}
			ArrayList<SortStats> finalSorts = new ArrayList<SortStats>();
			Map<Integer, SortStats> copie = new TreeMap<Integer, SortStats>();
			for (Sort.SortStats S : sorts) {
				copie.put(Integer.valueOf(S.getSpellID()), S);
			}

			int curInfl = 0;
			int curID = 0;
			while (copie.size() > 0) {
				curInfl = 0;
				curID = 0;
				for (Entry<Integer, SortStats> S : copie.entrySet()) {
					int infl = -calculInfluence((Sort.SortStats) S.getValue(),
							fighter, fighter);
					if (infl <= curInfl)
						continue;
					curID = ((Sort.SortStats) S.getValue()).getSpellID();
					curInfl = infl;
				}

				if ((curID == 0) || (curInfl == 0))
					break;
				finalSorts.add((Sort.SortStats) copie.get(Integer
						.valueOf(curID)));
				copie.remove(Integer.valueOf(curID));
			}

			return finalSorts;
		}

		/* {debug false} */

		private ArrayList<Fight.Fighter> getPotentialTarget(Fight fight,
				Fight.Fighter fighter, ArrayList<Sort.SortStats> sorts) {
			ArrayList<Fighter> targets = new ArrayList<Fighter>();
			int distMax = 0;
			for (Sort.SortStats S : sorts) {
				if (S.getMaxPO() > distMax)
					distMax = S.getMaxPO();
			}
			distMax += fighter.getCurPM(fight);
			// Map potentialsT = getLowHpEnnemyList(fight, fighter);
			Map<Integer, Fighter> potentialsT = getLowHpEnnemyList(fight,
					fighter);

			for (Entry<Integer, Fighter> T : potentialsT.entrySet()) {
				int dist = Pathfinding.getDistanceBetween(fight.get_map(),
						fighter.get_fightCell().getID(),
						((Fight.Fighter) T.getValue()).get_fightCell().getID());
				if (dist < distMax) {
					targets.add((Fight.Fighter) T.getValue());
				}
			}
			return targets;
		}

		private Sort.SortStats getBestSpellForTarget(Fight fight, Fight.Fighter F, Fight.Fighter T) {
			int inflMax = 0;
			Sort.SortStats ss = null;
			for (Entry<Integer, SortStats> SS : F.getMob().getSpells().entrySet()) {
				//TODO : changer ca en bas v
				if(SS.getValue().getSpellID() == 2005){//sort "�crasement" du craqueleur osa
					ss = (Sort.SortStats) SS.getValue();
					continue;
				}
				int curInfl = 0;
				int Infl1 = 0;
				int Infl2 = 0;
				int PA = F.getMob().getPA();
				int[] usedPA = new int[2];
				if (fight.CanCastSpell(F, (Sort.SortStats) SS.getValue(), T.get_fightCell(), -1)) {
					curInfl = calculInfluence((Sort.SortStats) SS.getValue(), F, T);
					if (curInfl != 0) {
						if (curInfl > inflMax) {
							ss = (Sort.SortStats) SS.getValue();
							usedPA[0] = ss.getPACost();
							Infl1 = curInfl;
							inflMax = Infl1;
						}

						for (Entry<Integer, SortStats> SS2 : F.getMob().getSpells().entrySet()) {
							if ((PA - usedPA[0] < ((Sort.SortStats) SS2.getValue()).getPACost())|| (!fight.CanCastSpell(F,(Sort.SortStats) SS2.getValue(),T.get_fightCell(), -1))){
								continue;
							}
							curInfl = calculInfluence((Sort.SortStats) SS2.getValue(), F, T);
							if (curInfl != 0) {
								if (Infl1 + curInfl > inflMax) {
									ss = (Sort.SortStats) SS.getValue();
									usedPA[1] = ((Sort.SortStats) SS2.getValue()).getPACost();
									Infl2 = curInfl;
									inflMax = Infl1 + Infl2;
								}
								for (Entry<Integer, SortStats> SS3 : F.getMob().getSpells().entrySet()) {
									if ((PA - usedPA[0] - usedPA[1] < ((Sort.SortStats) SS3.getValue()).getPACost())|| (!fight.CanCastSpell(F,(Sort.SortStats) SS3.getValue(), T.get_fightCell(),-1))){
										continue;
									}
									curInfl = calculInfluence((Sort.SortStats) SS3.getValue(), F,T);
									if ((curInfl == 0)|| (curInfl + Infl1 + Infl2 <= inflMax)){
										continue;
									}
									ss = (Sort.SortStats) SS.getValue();
									inflMax = curInfl + Infl1 + Infl2;
								}
							}
						}
					}
				}
			}
			return ss;
		}

		private Sort.SortStats getBestSpellForTargetPerco(Fight fight,
				Fight.Fighter F, Fight.Fighter T) {
			int inflMax = 0;
			Sort.SortStats ss = null;
			// System.out.println("SIZE SPELL : " +
			// World.getGuild(F.getPerco().GetPercoGuildID()).getSpells().size());
			for (Entry<Integer, SortStats> SS : World
					.getGuild(F.getPerco().GetPercoGuildID()).getSpells()
					.entrySet()) {
				if (SS.getValue() != null) {
					int curInfl = 0;
					int Infl1 = 0;
					int Infl2 = 0;
					int PA = 6;
					int[] usedPA = new int[2];
					if (fight.CanCastSpell(F, (Sort.SortStats) SS.getValue(),
							F.get_fightCell(), T.get_fightCell().getID())) {
						curInfl = calculInfluence(
								(Sort.SortStats) SS.getValue(), F, T);
						if (curInfl != 0) {
							if (curInfl > inflMax) {
								ss = (Sort.SortStats) SS.getValue();
								usedPA[0] = ss.getPACost();
								Infl1 = curInfl;
								inflMax = Infl1;
							}

							for (Entry<Integer, SortStats> SS2 : World
									.getGuild(F.getPerco().GetPercoGuildID())
									.getSpells().entrySet()) {
								if ((PA - usedPA[0] < ((Sort.SortStats) SS2
										.getValue()).getPACost())
										|| (!fight
												.CanCastSpell(F,
														(Sort.SortStats) SS2
																.getValue(),
														F.get_fightCell(),
														T.get_fightCell()
																.getID())))
									continue;
								curInfl = calculInfluence(
										(Sort.SortStats) SS2.getValue(), F, T);
								if (curInfl != 0) {
									if (Infl1 + curInfl > inflMax) {
										ss = (Sort.SortStats) SS.getValue();
										usedPA[1] = ((Sort.SortStats) SS2
												.getValue()).getPACost();
										Infl2 = curInfl;
										inflMax = Infl1 + Infl2;
									}
									for (Entry<Integer, SortStats> SS3 : World
											.getGuild(
													F.getPerco()
															.GetPercoGuildID())
											.getSpells().entrySet()) {
										if ((PA - usedPA[0] - usedPA[1] < ((Sort.SortStats) SS3
												.getValue()).getPACost())
												|| (!fight.CanCastSpell(F,
														(Sort.SortStats) SS3
																.getValue(),
														F.get_fightCell(),
														T.get_fightCell()
																.getID())))
											continue;
										curInfl = calculInfluence(
												(Sort.SortStats) SS3.getValue(),
												F, T);
										if ((curInfl == 0)
												|| (curInfl + Infl1 + Infl2 <= inflMax))
											continue;
										ss = (Sort.SortStats) SS.getValue();
										inflMax = curInfl + Infl1 + Infl2;
									}
								}
							}
						}
					}
				}
			}
			return ss;
		}

		private int getBestTargetZone(Fight fight, Fight.Fighter fighter, Sort.SortStats spell, int launchCell) {
			if ((spell.getPorteeType().charAt(0) == 'P') && (spell.getPorteeType().charAt(1) == 'a')){
				return 0;
			}
			ArrayList<Case> possibleLaunch = new ArrayList<Case>();

			int CellF = -1;
			char arg2;
			if (spell.getMaxPO() != 0) {
				char arg1 = 'a';
				if (spell.isLineLaunch()){
					arg1 = 'X';
				}else{
					arg1 = 'C';
				}
				char[] table = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
						'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
						'u', 'v' };
				arg2 = 'a';
				if (spell.getMaxPO() > 20){
					arg2 = 'u';
				}else{
					arg2 = table[spell.getMaxPO()];
				}
				String args = Character.toString(arg1) + Character.toString(arg2);
				possibleLaunch = Pathfinding.getCellListFromAreaString(fight.get_map(), launchCell, launchCell, args, 0, false);
			} else {
				possibleLaunch.add(fight.get_map().getCase(launchCell));
			}
			if (possibleLaunch == null){
				return -1;
			}
			int nbTarget = 0;
			for (Carte.Case cell : possibleLaunch)//cases ou on peut lancer le sort
				try {
					if (!fight.CanCastSpell(fighter, spell, cell, launchCell)){
						continue;
					}
					int num = 0;
					int curTarget = 0;
					ArrayList<SpellEffect> test = new ArrayList<SpellEffect>();
					// ArrayList test = new ArrayList();
					test.addAll(spell.getEffects());
					for (SpellEffect SE : test) { //foreach les effets
						try {
							if (SE == null){
								continue;
							}
							if (SE.getValue() == -1){
								continue;
							}
							int POnum = num * 2;
							ArrayList<Case> cells = Pathfinding.getCellListFromAreaString(fight.get_map(),	cell.getID(), launchCell,spell.getPorteeType(), POnum, false);
							// ArrayList cells =
							// Pathfinding.getCellListFromAreaString(fight.get_map(),
							// cell.getID(), launchCell, spell.getPorteeType(),
							// POnum, false);
							for (Carte.Case c : cells) { //trouve toutes les cibles � chaque effet
								if (c.getFirstFighter() == null){
									continue;
								}
								if (c.getFirstFighter().getTeam2() != fighter.getTeam2()){
									curTarget++;
								}
							}
						} catch (Exception localException) {}
						num++;
					}
					if (curTarget <= nbTarget){
						continue;
					}
					nbTarget = curTarget;
					CellF = cell.getID();
				} catch (Exception localException1) {}
			if ((nbTarget > 0) && (CellF != -1)) {
				return CellF + nbTarget * 1000;
			}
			return 0;
		}

		private int calculInfluenceHeal(Sort.SortStats ss) {
			int inf = 0;
			for (SpellEffect SE : ss.getEffects()) {
				if (SE.getEffectID() != 108){
					return 0;
				}
				inf += 100 * Formulas.getMiddleJet(SE.getJet());
			}
			return inf;
		}

		private int calculInfluence(Sort.SortStats ss, Fight.Fighter C, Fight.Fighter T) {
			int infTot = 0;
			for (SpellEffect SE : ss.getEffects()) {
				int inf = 0;
				switch (SE.getEffectID()) {
				case 5:
					inf = 500 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 89:
					inf = 200 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 91:
					inf = 150 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 92:
					inf = 150 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 93:
					inf = 150 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 94:
					inf = 150 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 95:
					inf = 150 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 96:
					inf = 100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 97:
					inf = 100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 98:
					inf = 100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 99:
					inf = 100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 100:
					inf = 100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 101:
					inf = 1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 127:
					inf = 1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 84:
					inf = 1500 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 77:
					inf = 1500 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 111:
					inf = -1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 128:
					inf = -1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 121:
					inf = -100 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 131:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 132:
					inf = 2000;
					break;
				case 138:
					inf = -50 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 150:
					inf = -2000;
					break;
				case 168:
					inf = 1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 169:
					inf = 1000 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 210:
					inf = -300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 211:
					inf = -300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 212:
					inf = -300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 213:
					inf = -300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 214:
					inf = -300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 215:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 216:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 217:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 218:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 219:
					inf = 300 * Formulas.getMiddleJet(SE.getJet());
					break;
				case 265:
					inf = -250 * Formulas.getMiddleJet(SE.getJet());
				}
				if (C.getTeam() == T.getTeam()){
					infTot -= inf;
				} else {
					infTot += inf;
				}
			}
			return infTot;
		}

		
		
		
		
		// AJOUTS PRISMES CONQUETES CRYSTAL
		// ----------------prism---------------- PRISMES CRYSTAL

		/*
		  private void tipo_Prisma(Fighter F, Fight pelea) { int veces =
		  0; while (!stop && F.canPlay()) { if (++veces >= 12) stop = true; if
		  (veces > 15) return; Fighter amigo = getNearestFriend(pelea, F); //
		  Amigos if (amigo != null) { if (!curaSiEsPosiblePrisma(pelea, F,
		  false)) {// cura aliada if (!buffeaSiEsPosiblePrisma(pelea, F,
		  amigo)) {// boost aliado if (!buffeaSiEsPosiblePrisma(pelea, F, F))
		  {// auto boost int ataque = atacaSiEsPosiblePrisma(pelea, F); while
		  (ataque == 0 && !stop) { if (ataque == 5) stop = true; ataque =
		  atacaSiEsPosiblePrisma(pelea, F); } stop = true; } } } } else { int
		  ataque = atacaSiEsPosiblePrisma(pelea, F); while (ataque == 0 &&
		  !stop) { if (ataque == 5) stop = true; ataque =
		  atacaSiEsPosiblePrisma(pelea, F); } stop = true; } } }
		  
		  
		  
		  private boolean curaSiEsPosiblePrisma(Fight pelea, Fighter
		  prisma, boolean autoCura) { if (autoCura && (prisma.getPDV() * 100) /
		  prisma.getPDVMAX() > 95) return false; Fighter objetivo = null; Sort
		  hechizo = World.getSort(124); SortStats SH =
		  hechizo.getStatsByLevel(6); if (autoCura) { objetivo = prisma; } else
		  { Fighter curado = null; int porcPDVmin = 100; for (Fighter blanco :
		  pelea.getFighters(3)) { if (blanco.isDead() || blanco == prisma)
		  continue; if (blanco.getTeam2() == prisma.getTeam2()) { int porcPDV =
		  (blanco.getPDV() * 100) / blanco.getPDVMAX(); if (porcPDV <
		  porcPDVmin && porcPDV < 95) { curado = blanco; porcPDVmin = porcPDV;
		  } } } objetivo = curado; } if (objetivo == null) return false; if (SH
		  == null) return false; int cura = pelea.tryCastSpell(prisma, SH,
		  objetivo.get_fightCell().getID()); if (cura != 0) return false;
		  return true; }
		  
		  
		  private boolean buffeaSiEsPosiblePrisma(Fight pelea, Fighter
		  lanzador, Fighter objetivo) { if (objetivo == null) return false;
		  SortStats SH = mejorBuffPrisma(pelea, lanzador); if (SH == null)
		  return false; int buff = 5; try { buff = pelea.tryCastSpell(lanzador,
		  SH, objetivo.get_fightCell().getID()); } catch (NullPointerException
		  e) { return false; } if (buff != 0) return false; return true; }
		  
		  private SortStats mejorBuffPrisma(Fight pelea, Fighter
		  lanzador) { Sort hechizo = World.getSort(153); SortStats hechizoStats
		  = hechizo.getStatsByLevel(6); return hechizoStats; } private static
		  int atacaSiEsPosiblePrisma(Fight pelea, Fighter lanzador) {
		  Map<Integer, Fighter> listaEnemigos = getLowHpEnnemyList(pelea,
		  lanzador); SortStats SH = null; Fighter objetivo = null;
		  for(Entry<Integer, Fighter> blanco : listaEnemigos.entrySet()){ //for
		  (Fighter blanco : listaEnemigos) { SH = mejorHechizoPrisma(pelea,
		  lanzador, (Fight.Fighter)blanco.getValue()); if (SH != null) {
		  //objetivo = blanco; objetivo = (Fight.Fighter)blanco.getValue();
		  break; } } if (objetivo == null || SH == null) return 666; int ataque
		  = pelea.tryCastSpell(lanzador, SH, objetivo.get_fightCell().getID());
		  if (ataque != 0) return ataque; return 0; } private SortStats
		  mejorHechizoPrisma(Fight pelea, Fighter lanzador, Fighter objetivo) {
		  SortStats sh = null; ArrayList<SortStats> posibles = new
		  ArrayList<SortStats>(); if (objetivo == null) return null; try { for
		  (Entry<Integer, SortStats> SH :
		  lanzador.getPrisma().getHechizos().entrySet()) { SortStats statsH =
		  SH.getValue(); if (!pelea.CanCastSpell(lanzador, statsH,
		  objetivo.get_fightCell(), -1)) continue; posibles.add(statsH); } }
		  catch (NullPointerException e) { return null; } if
		  (posibles.isEmpty()) return sh; if (posibles.size() == 1) return
		  posibles.get(0); sh = posibles.get(Formulas.getRandomValue(0,
		  posibles.size() - 1)); return sh; } //FIN PRISMES CONQUETES CRYSTAL
		//  ----------------fin---------------- PRISMES CRYSTAL
		// */
	
		
		
		
		
		
		
		
		
		//�MODIF, les methodes d'ia prennent BCP trop de temps et cpu � faire
		/**
		 * Craqueleur : attack, moveToAttack, moveNear.  Si(<5%pdv): attack, moveFar
		 */
		private void apply_type7(Fighter F, Fight fight) {
			String dispoSpells = "";
			for(SortStats ss : F.getMob().getSpells().values()){
				dispoSpells += ss.getSpellID()+",";
			}
			//Ancestra.debug("Sorts connus par le monstre : "+dispoSpells);
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				//Ancestra.debug("\nD�BUT Boucle "+noBoucle);
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15){
					return;
				}
				Fight.Fighter T = getNearestEnnemy(fight, F);
				if (T == null) {
					//Zen.debug("IAKanido.type7.getNearestEnnemy == null so return;");
					return;
				}
					//Perfs p1 = new Perfs();
					int attack = attackIfPossible(fight, F);
					//p1.stopTiming("IAKanido.type7.attackIfPossible");
					//Ancestra.debug("Boucle "+noBoucle+". attack == "+attack);
					if (attack == 0){
						//Ancestra.debug("Boucle "+noBoucle+". if (attack == 0)");
						continue;
					}
					if (attack == 5){
						//Ancestra.debug("Boucle "+noBoucle+". if (attack == 5)");
						stop = true;
					}
					//p1.restartTiming();
					if (moveToAttackIfPossible(fight, F)){
						//p1.stopTiming("IAKanido.type7.moveToAttackIfPossible");
						//Ancestra.debug("Boucle "+noBoucle+". moveToAttackIfPossible");
						continue;
					}
					//p1.stopTiming("IAKanido.type7.moveToAttackIfPossible");
					//p1.restartTiming();
					//if(F.get_fightCell().isNearOf(T.get_fightCell())){
					if(Pathfinding.getEnemyFighterArround2(F.get_fightCell().getID(), fight.get_map(), fight) != null){
						stop = true;
					}else
					if (moveNearIfPossible(fight, F, T)){
						//p1.stopTiming("IAKanido.type7.moveNearIfPossible");
						//Ancestra.debug("Boucle "+noBoucle+". moveNearIfPossible");
						continue;
					}
					//p1.stopTiming("IAKanido.type7.moveNearIfPossible||getEnemyFighterAround");
					stop = true;
				//Ancestra.debug("FIN Boucle "+noBoucle);
			}
		}
		
		/**
		 * Tofu/fuyard :  attack, moveToAttack, moveFar
		 */
		private void apply_type8(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				//Ancestra.debug("\nD�BUT Boucle"+noBoucle);
				if (noBoucle >= 12){
					stop = true;
				}
				if (noBoucle > 15){
					return;
				}
				Fight.Fighter FE = getNearestEnnemy(fight, F);
				if (FE == null){
					//Ancestra.debug("Boucle"+noBoucle+". FE == null");
					moveFarIfPossible(fight, F);
					stop = true;
					return;
				}
				//Ancestra.debug("Boucle"+noBoucle+".Avant int attack");
				int attack = attackIfPossible(fight, F);
				//Ancestra.debug("Boucle"+noBoucle+".Avant attack == 0");
				if (attack == 0){//quand le sort a march�
					//Ancestra.debug("Boucle"+noBoucle+". attack == 0");
					continue;
				}
				//Ancestra.debug("Boucle"+noBoucle+".Avant attack == 5");
				if (attack == 5){//quand le sort a fait un EC et que l'ec fini le tour
					//Ancestra.debug("Boucle"+noBoucle+". attack == 5");
					stop = true;
				}
				//Ancestra.debug("Boucle"+noBoucle+".Avant attack != 0");
				if (attack != 0){//quand le sort a pas march� ..... 
					//Ancestra.debug("Boucle"+noBoucle+". attack != 0");
					//Ancestra.debug("Boucle"+noBoucle+". En fait: attack = "+attack);
					if (moveToAttackIfPossible(fight, F)){
						//Ancestra.debug("Boucle"+noBoucle+". attack != 0.moveToAttackIfPossible");
						continue;
					}
				}
				//if (moveToAttackIfPossible(fight, F)){
				//	Ancestra.debug("Boucle"+noBoucle+". moveToAttackIfPossible");
				//	continue;
				//}
				//Ancestra.debug("Boucle"+noBoucle+".Avant moveFarIfPossible");
				if (moveFarIfPossible(fight, F)){
					//Ancestra.debug("Boucle"+noBoucle+". moveFarIfPossible");
					continue;
				}
				stop = true;
				//Ancestra.debug("FIN Boucle"+noBoucle);
			}
		}
		
		/**
		 * Support Fuyeur(Gonflable) :  buff/heal invocateur, heal/buff ami, heal/buff luimeme, moveFar
		 */
		private void apply_type9(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter FF = getNearestFriend(fight, F);
				if (FF == null)
					return;
				if(F.getInvocator() != null){
					if (buffIfPossible(fight, F, F.getInvocator())){//buff son invocateur en premier
						continue;
					}//else{
					//	if (moveNearIfPossible(fight, F, F.getInvocator()))// approche invocateur pour buff
					//		continue;
					//}
				}
				if (buffIfPossible(fight, F, FF)){//buff ami
					continue;
				}//else{
				//	if (moveNearIfPossible(fight, F, FF))// approche ami pour buff
				//		continue;
				//}	
				if (HealIfPossible(fight, F, true))//heal luimeme
					continue;
				if (buffIfPossible(fight, F, F))//buff luimeme
					continue;
				if (moveFarIfPossible(fight, F))// fuit :D
					continue;
				stop = true;
			}
		}
		
		/**
		 * Buffeur qui Avance vers Ennemi(Folle) :  buff ami, buff ennemi, moveNear
		 */
		private void apply_type10(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter FF = getNearestFriend(fight, F);
				Fight.Fighter FE = getNearestEnnemy(fight, F);
				if (FE == null)
					return;
				if (buffIfPossible(fight, F, FF)){//buff ami
					continue;
				}
				if (buffIfPossible(fight, F, FE)){//buff ennemi
					continue;
				}
				if(Pathfinding.getEnemyFighterArround2(F.get_fightCell().getID(), fight.get_map(), fight) != null){
					stop = true;
				}else
				if (moveNearIfPossible(fight, F, FE)){
					continue;
				}
				stop = true;
			}
		}
		
		/**
		 * Invocateur(Surpuissante) :  invoc, heal/buff invocateur, heal/buff ami, heal/buff luimeme, moveFar.
		 */
		private void apply_type11(Fight.Fighter F, Fight fight) {
			int noBoucle = 0;
			while ((!stop) && (F.canPlay())) {
				noBoucle++;
				if (noBoucle >= 12)
					stop = true;
				if (noBoucle > 15)
					return;
				Fight.Fighter FF = getNearestFriend(fight, F);
				if (FF == null)
					return;
				if (invocIfPossible(fight, F))//invoc les chiantes
					continue;
				if(F.getInvocator() != null){
					if (HealIfPossible(fight, F, false))//heal son invocateur en premier (bouture revitalisante sur la surpuissante)
						continue;
					if (buffIfPossible(fight, F, F.getInvocator()))//buff son invocateur en premier
						continue;
				}
				if (HealIfPossible(fight, F, false))//heal ami (bouture revitalisante sur la surpuissante)
					continue;
				if (buffIfPossible(fight, F, FF))//buff ami
					continue;
				if (HealIfPossible(fight, F, true))//heal luimeme
					continue;
				if (buffIfPossible(fight, F, F))//buff luimeme
					continue;
				if (moveFarIfPossible(fight, F))
					continue;
				stop = true;
			}
		}
		
		
		
		public boolean spellCanReach(Fight fight, Fighter caster, Fighter target, SortStats spell){
			int po = spell.getMaxPO();
			//int pm = caster.getCurPM(fight);
			boolean LdV = Pathfinding.checkLoS(fight.get_map(), caster.get_fightCell().getID(), target.get_fightCell().getID(), caster, false);
			//si pas besoin de ligne de vue:
			if(spell.hasLDV() == false){
				//si on se rend d�j�:
				if(Pathfinding.getDistanceBetween(fight.get_map(), caster.get_fightCell().getID(), target.get_fightCell().getID()) <= po){
					//attack
					return true;
				}else{
					//moveToAttack;
				}
			} 
			//si a besoin d'une ligne de vue et quelle est bloqu�e:
			else if(spell.hasLDV() && LdV == false){
					//besoin de bouger pour y arriver.
					//ArrayList<Case> path = Pathfinding.getShortestPathBetween(fight.get_map(), caster.get_fightCell().getID(), target.get_fightCell().getID(), pm);
				//moveToAttack;
				return false;
			}  
				//si ya rien qui bloque la vue
			else if(LdV == true){ 
				//si on se rend d�j�:
				if(Pathfinding.getDistanceBetween(fight.get_map(), caster.get_fightCell().getID(), target.get_fightCell().getID()) <= po){
					//attack
					return true;
				}else{
					//moveToAttack;
				}
			}
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		

	
}