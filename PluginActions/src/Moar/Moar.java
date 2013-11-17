package Moar;

import java.util.ArrayList;

import Abstractions.CombativeCharacter;
import Core.Syn;
import Constants.*;
import Enums.CharacterType;
import GameObjects.GAction;
import GameObjects.GBuff;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.GSpell;
import Interfaces.ICharacter;
import Interfaces.ISprite;
import Misc.Dice;
import Misc.Jet;
import Misc.ParameterHolder;
import Misc.Utils;
import Plugins.Managers.ActionsManager;
import Plugins.Managers.EffectsManager;
import Plugins.Managers.FormulingManager;
import static Enums.CharacteristicType.*;
import static GameObjects.GStatistiques.CharacteristicColumn.*;
import GameObjects.GBuff.BuffApplicationType;



public class Moar {

	private GSpell s = null; 
	private GItem arme = null; 
	private CombativeCharacter caster = null; 
	private short targetCell = Short.MIN_VALUE;

	//private ArrayList<GBuff> maxLaunchByTurnByTargetBuffs = new ArrayList<GBuff>();
	private GBuff hasMaxLaunchByTurnBuff = null;
	private ArrayList<GEffect> effects = null;
	private ArrayList<CombativeCharacter> targets = null;
	
	
	/**
	 * True si le sort a pu être appliqué au complet, false sinon.
	 */
	public boolean applySpell(GSpell s, GItem arme, CombativeCharacter caster, short targetCell){
		this.s = s;
		this.arme = arme;
		this.caster = caster;
		this.targetCell = targetCell;
		
		if(s == null && arme == null){
			SM.Messages.M(((GPersonnage)caster), "applySpell. false  -- s == null && arme == null", Constants.COLOR_GREEN);
			//Syn.d("applySpell. false  -- s == null && arme == null");
			return false;
		}
		if(s != null ? (caster.getStatistique().getPA(caster.getClasse()) < s.getPA())//Assez de PA ?
			: (caster.getStatistique().getPA(caster.getClasse()) < arme.getTemplate().getPA())){
			//Syn.d("applySpell. false  -- not enough PA");
			SM.Messages.M((GPersonnage)caster, "Pas assez de PA pour lancer ce sort", Constants.COLOR_RED);
			return false;
		}
		if(targetCell == 0){
			//Syn.d("applySpell. false  -- if(targetCell == 0)");
			SM.Messages.M(((GPersonnage)caster), "applySpell. false  -- if(targetCell == 0)", Constants.COLOR_GREEN);
			return false;
		}
		boolean cc = FormulingManager.calculateCoupCritique(s == null ? arme.getTemplate().getCC() : s.getRateCC(), caster.getStatistique());
		
		if(doChecks(s, arme, caster, targetCell) == false){
			//Syn.d( "doChecks: impossible de lancer le sort.");
			SM.Messages.M(((GPersonnage)caster), "doChecks: impossible de lancer le sort.", Constants.COLOR_GREEN);
			return false;
		}
		effects = computeEffects(s, arme, cc);
		
		applyEffects(cc);
		
		incrementCooldownEffects(s, caster, targets);

		GAction a = null;
		if(cc){
			if(s != null){
				a = ActionsManager.getFactory().newSpellCCAction(caster, s, targetCell);
			}else if(arme != null){
				a = ActionsManager.getFactory().newSpellArmeCCAction(caster, targetCell);
			}
		}else{
			if(s != null){
				a = ActionsManager.getFactory().newSpellAction(caster, s, targetCell);
			}else if(arme != null){
				a = ActionsManager.getFactory().newSpellArmeAction(caster, targetCell);
			}
		}
		if(caster.getCharacterType() == CharacterType.PLAYER){
			((GPersonnage)caster).addAction(a);
		}
		SM.Game.GA_LAYER(caster, a);
		SM.Messages.M(((GPersonnage)caster), "Finit d'appliquer le sort (Moar.applyEffect return true)", Constants.COLOR_GREEN);
		return true;
	}
	
	
	
	
	
	private boolean doChecks(GSpell s, GItem arme, CombativeCharacter caster, short targetCell){
		//Setting des Variables
		boolean ec = FormulingManager.calculateEchecCritique(s == null ? arme.getTemplate().getEC() : s.getRateEC(), caster.getStatistique());
		boolean isEcEndTurn = true;
		boolean lineOfSight = true;
		boolean isLineLaunch = false;
		boolean isEmptyCell = false;
		hasMaxLaunchByTurnBuff = null;
		if(s != null){
			lineOfSight = s.isLineOfSight();
			isLineLaunch = s.isLineLaunch();
			isEmptyCell = s.isEmptyCell();
			isEcEndTurn = s.isEcEndTurn();
		}

		
		//Vérifications de ces variables
		if(ec && isEcEndTurn){
			GAction a = ActionsManager.getFactory().newSpellArmeECAction(caster);
			if(caster.getCharacterType() == CharacterType.PLAYER){
				((GPersonnage)caster).addAction(a);
			}
			SM.Game.GA_LAYER(caster, a);
			SM.Messages.M((GPersonnage)caster, "EC annule le lancement du sort et finit le tour !", Constants.COLOR_RED);
			//TODO : fight.passturn genre
			return false;
		}else if(ec && !isEcEndTurn){
			SM.Messages.M((GPersonnage)caster, "EC annule le lancement du sort !", Constants.COLOR_RED);
			return false;
		}
		
		//TODO if(lineOfSight && !PathFinding.hasLineOfSight(caster.getCellID, cellID)){
		//	return false;
		//}
		if(isLineLaunch && !FormulingManager.isInLineWith2(caster.getMap(), caster.getCellID(), targetCell)){
			SM.Messages.M(((GPersonnage)caster), "isLineLaunch && !isInLineWith2", Constants.COLOR_RED);
			return false;
		}
		if(isEmptyCell && caster.getMap().isCellOccupied(targetCell)){
			SM.Messages.M(((GPersonnage)caster), "isEmptyCell && isCellOccupied", Constants.COLOR_RED);
			return false;
		}
		if(s != null){
			//Vérifie les requiredStates et forbiddenStates si c'est un sort
			if(s.containsForbiddenStates(caster.getStates()) || false == s.containsRequiredStates(caster.getStates())){
				Syn.d("applySpell. false  -- requiredStates & forbiddenStates");
				SM.Messages.M((GPersonnage)caster, "L'état du personnage ne respecte pas ceux (interdits et requis) du sort", Constants.COLOR_RED);
				return false;
			}
			if( FormulingManager.getDistanceBetweenCellsInFight(caster.getMap(), caster.getCellID(), targetCell) 
				> (s.isModifPO() ? s.getRangeMax() + Math.max(0, caster.getStatistique().getValue(PORTEE.get(), TOTAL)) : s.getRangeMax())){
				SM.Messages.M(((GPersonnage)caster), "s != null: Le lanceur vise trop loin (maxPO) pour la portée possible.", Constants.COLOR_RED);
				return false;
			}
			if( FormulingManager.getDistanceBetweenCellsInFight(caster.getMap(), caster.getCellID(), targetCell) 
				< (s.isModifPO() ?  s.getRangeMin() - Math.min(0, caster.getStatistique().getValue(PORTEE.get(), TOTAL)) : s.getRangeMin())){
				SM.Messages.M(((GPersonnage)caster), "s != null: Le lanceur vise trop près (minPO) pour la portée possible.", Constants.COLOR_RED);
				return false;
			}

			if(s.getCooldown() != 0 || s.getMaxLaunchByTurn() != 0 || s.getMaxLaunchByTurnByTarget() != 0){
				if(caster.getBuffs() != null){
					ArrayList<ISprite> targets = caster.getMap().getSpritesAtCell(targetCell);
					Syn.d("Buffs:");
					for(GBuff b : caster.getBuffs()){
						Syn.d(b.toString());
						if(b.getEffectID() == EffectsManager.getCooldownEffect().getID()){
							if(b.getJet().getValue() == s.getID()){
								//Peut pas lancer le sort tant que le cooldown de ce sort n'est pas achevé ;p
								SM.Messages.M((GPersonnage) caster, "Il reste "+b.getRemainingTurns()+" tours de cooldown avant de pouvoir relancer ce sort.", Constants.COLOR_RED);
								return false;
							}
						}else if(b.getEffectID() == EffectsManager.getMaxLaunchByTurnEffect().getID()){
							if(b.getJet().getValue() == s.getID()){
								hasMaxLaunchByTurnBuff = b;
								if(b.getRemainingTurns() == 0){
									//Déjà utilisé le maximum de nombre de coups possibles ave ce sort.
									SM.Messages.M((GPersonnage) caster, "Vouz avez déjà utilisé tous vos coups possible par tour avec ce sort.", Constants.COLOR_RED);
									return false;
								}
							}
						}else if(b.getEffectID() == EffectsManager.getMaxLaunchByTurnByTargetEffect().getID()){
							//Vérifie qu'il soit lancable sur les targetCharacter de la targetCell
							
							if(b.getDice().getNumberOfDices() == s.getID()){
								for(ISprite target : targets){
									if(target.getID() == b.getDice().getNumberOfFaces() && b.getRemainingTurns() == 0){
										SM.Messages.M((GPersonnage) caster, "Vouz avez déjà utilisé tous vos coups possible par tour avec ce sort("+s.getID()+") sur ce character("+target.getID()+").", Constants.COLOR_RED);
										return false;
									}
								}
								//maxLaunchByTurnByTargetBuffs.add(b);
							}
						}
					}
				}
			}
		}
		if(arme != null){
			if( FormulingManager.getDistanceBetweenCellsInFight(caster.getMap(), caster.getCellID(), targetCell) 
				> (arme.getTemplate().getPOmax() + Math.max(0, caster.getStatistique().getValue(PORTEE.get(), TOTAL)))){
				SM.Messages.M(((GPersonnage)caster), "arme != null: Le lanceur vise trop près (minPO) pour la portée possible.", Constants.COLOR_RED);
				return false;
			}
			if( FormulingManager.getDistanceBetweenCellsInFight(caster.getMap(), caster.getCellID(), targetCell) 
				< (arme.getTemplate().getPOmin() - Math.min(0, caster.getStatistique().getValue(PORTEE.get(), TOTAL)))){
				SM.Messages.M(((GPersonnage)caster), "arme != null: Le lanceur vise trop près (minPO) pour la portée possible.", Constants.COLOR_RED);
				return false;
			}
		}
		return true;
	}
	
	
	private ArrayList<GEffect> computeEffects(GSpell s, GItem arme, boolean cc){
		ArrayList<GEffect> effects = null;
		if(s != null){
			//Copy l'AL pcq on la modifie après avec les probabilité
			effects = new ArrayList<GEffect>(cc ? s.getEffectsCC() : s.getEffects());
		}else if(arme != null){
			/*if(cc){
				effects = new ArrayList<GEffect>();
				for(GEffect i : arme.getEffects()){
					effects.add(i.copy());
				}
			}else{*/
				effects = arme.getEffects();//new ArrayList<GEffect>(arme.getEffects());
			//}
		}
		
		//Effet probables [FAIT]
		//Effets/Buffs à apliquer au lanceur  [à faire dans class Application]
		//Effets/Buffs à appliquer au autres  [à faire dans class Application]
		int chance = 100;
		
		//for(GEffect e : (arme == null ? s.getEffects() : arme.getEffects())){//Tri les effets particuliers
		for(int i = effects.size()-1; i >= 0; i--){	
			String SA = effects.get(i).getSpecialArg();
			Syn.d("SA=("+SA+")");
			if(SA.equals("-1;0;0") == false){//S'il y a des specialArgs comme 1 probabilité ou durée d'effet
				if(SA.startsWith("-1;") == false){//S'il possede une morph (le 1er parametre du début)
					//Morph	 ça ca sera appliqué dans le plugin d'effet dans classe Application ben normalement	
					//EffectsManager.applyEffect(caster, e, target, target.getCellID(), caster.getFight());
				}
				if(SA.contains(";0;") == false){//S'il possede une durée (le 2eme parametre du milieu)
					//new Buff   ça ca sera appliqué dans le plugin d'effet dans classe Application ben normalement
				}
				if(SA.endsWith(";0") == false){//S'il possède une probabilité (le 3eme parametre de la fin)
					if(chance == 0){
						effects.set(i, null); continue;
						//effects.remove(e); continue;
					}
					double cha = (Math.floor(Math.random()*100))+1;//random entre 1 et 100
					chance -= cha;
					if(cha <= Integer.parseInt(SA.substring(SA.lastIndexOf(";")+1))){
						chance = 0;
					}else{
						effects.set(i, null);
					}
				}
			}
		}
		return effects;
	}
	
	private void applyEffects(boolean cc){
		String[] lastZoneTypes = new String[]{""};
		ParameterHolder eap = new ParameterHolder(); 
		for(int i = effects.size()-1; i>= 0; i--){
			if(effects.get(i) != null){//Applique les effets restant
				 //Get l'Area de sort
				if(s != null){
					String[] zoneTypes = s.getZoneTypeAppropriate(cc, i);
					if(false == Utils.compareStringArrays(lastZoneTypes, zoneTypes, false)){
						targets = FormulingManager.getTargetsInAreaStrings(caster.getMap(), zoneTypes, caster.getCellID(), targetCell);
					}
					lastZoneTypes = zoneTypes;
				}else 
				//Get l'Area d'arme	
				if(arme != null){ 
					String zoneType = CItems.getZoneType(arme);
					if(lastZoneTypes[0].equals(zoneType) == false){
						targets = FormulingManager.getTargetsInAreaString(caster.getMap(), zoneType, caster.getCellID(), targetCell);
					}
					lastZoneTypes[0] = zoneType;
				}
				if(targets.size() > 0){
					
					//Applique
					for(CombativeCharacter target : targets){
						Syn.d("a Target="+target.getID());
						if(s != null){//pour les sorts
							/*boolean canHitTarget = true;
							for(GBuff b : maxLaunchByTurnByTargetBuffs){
								if(canHitTarget && b.getDice().getNumberOfFaces() == target.getID() && b.getRemainingTurns() >= 0){//characterID (target)
									Syn.d("Vous ne pouvez pas attaquer le joueur "+target.getName()+" avec ce sort, vous avez un cooldown de "+b.getRemainingTurns());
									SM.Messages.M(((GPersonnage)caster), "Vous ne pouvez pas attaquer le joueur "+target.getName()+" avec ce sort, vous avez un cooldown de "+b.getRemainingTurns(), Constants.COLOR_RED);
									canHitTarget = false; 
									continue;
								}
							}
							if(canHitTarget){*/
								eap.fight = caster.getFight(); eap.spell = s; 
								EffectsManager.applyEffect(effects.get(i), caster, target, eap);
							//}
						}else if(arme != null){//pour les armes
							eap.fight = caster.getFight(); eap.item = arme; eap.coupCritique = cc;
							EffectsManager.applyEffect(effects.get(i), caster, target, eap);
						}
					}
				}else{
					SM.Messages.M(((GPersonnage)caster), "Il n'y a aucun targets dans la zone d'effet !", Constants.COLOR_RED);
				}
			}
		}
	}
	
	private void incrementCooldownEffects(GSpell s, CombativeCharacter caster, ArrayList<CombativeCharacter> targets){

		//Ajout de l'effet de cooldown
		if(s != null && s.getCooldown() != 0){
			GBuff b = new GBuff();
			b.setEffectID(EffectsManager.getCooldownEffect().getID());
			b.setApplicationMode((byte) BuffApplicationType.Never.ordinal());
			b.setRemainingTurns(s.getCooldown());
			b.setJet(new Jet(s.getID()));
			caster.addBuff(b);
			SM.Messages.M((GPersonnage) caster, "Vous lancez un sort et gagnez un buff de cooldown ("+s.getCooldown()+" tours) sur celui-ci.", Constants.COLOR_GREEN);
		}
		//Ajout de l'effet de cnombre de coup maximal par tour
		if(s != null && s.getMaxLaunchByTurn() != 0){
			if(hasMaxLaunchByTurnBuff != null){
				hasMaxLaunchByTurnBuff.decrementRemainingTurns();
			}else{
				GBuff b = new GBuff();
				b.setEffectID(EffectsManager.getMaxLaunchByTurnEffect().getID());
				//TurnEnd pcq faut le débuffer à la fin du tour
				b.setApplicationMode((byte) BuffApplicationType.TurnEnd.ordinal());
				b.setRemainingTurns((byte) (s.getMaxLaunchByTurn()-1));//-1 pcq j'fais de X jusqu'à 0 donc ça ajoute un chiffre de plus à décrémenter
				//Ex, si le sort a un MaxLaunchByTurn de 1, bah ca le met à 0 et il pourra pas frapper une 2eme fois :P
				b.setJet(new Jet(s.getID()));
				caster.addBuff(b);
				SM.Messages.M((GPersonnage) caster, "Vous lancez un sort et gagnez un buff de maxLaunchByTurn ("+s.getMaxLaunchByTurn()+" coups) sur celui-ci.", Constants.COLOR_GREEN);
			}
		}
		if(s != null && s.getMaxLaunchByTurnByTarget() != 0 && targets.size() > 0){
			
				GBuff buff = null;
				//Soit le target était déjà dans la liste des buffs et on décrémente
				//boolean alreadyHadHitGuy = false;
				ArrayList<ISprite> sometargets = caster.getMap().getSpritesAtCell(targetCell);
				for(ISprite t : sometargets){
					GBuff targetbuff = null;
					if(caster.getBuffs() != null){
						for(GBuff b : caster.getBuffs()){
							if(targetbuff != null) continue;
							if(b.getDice().getNumberOfFaces() == t.getID() &&//Si le buff vise bien le bon target
								b.getDice().getNumberOfDices() == s.getID() && //Si le buff est bien du bon sort
								b.getEffectID() == EffectsManager.getMaxLaunchByTurnByTargetEffect().getID()
								){
									
								if(b.getRemainingTurns() > 0){ 
									SM.Messages.M((GPersonnage) caster, "Vous lancez un sort et décrémentez votre buff de maxLaunchByTurnByTarget ("+s.getMaxLaunchByTurnByTarget()+" coups) sur celui-ci.", Constants.COLOR_GREEN);
									b.decrementRemainingTurns();//tant que le remaining > 0, on décrémente jusquà 0. J'debuf à fin du tour.
								}
								targetbuff = b;
							}
						}
					}
					if(targetbuff == null){
						//Soit on ajoute le buff pour ce nouveau target
						GBuff b = new GBuff();
						b.setEffectID(EffectsManager.getMaxLaunchByTurnByTargetEffect().getID());
						//TurnEnd pcq faut le débuffer à la fin du tour
						b.setApplicationMode((byte) BuffApplicationType.TurnEnd.ordinal());
						b.setRemainingTurns((byte) (s.getMaxLaunchByTurnByTarget()-1)); //-1 pcq j'fais de X jusqu'à 0 donc ça ajoute un chiffre de plus à décrémenter
						//Ex, si le sort a un MaxLaunchByTurnByTarget de 1, bah ca le met à 0 et il pourra pas frapper une 2eme fois :P
						b.setDice(new Dice(s.getID(), (short)t.getID(), (short)0));
						caster.addBuff(b);
						SM.Messages.M((GPersonnage) caster, "Vous lancez un sort et gagnez un buff de maxLaunchByTurnByTarget ("+b.getRemainingTurns()+" coups) sur celui-ci avec le targetCaracter("+t.getID()+").", Constants.COLOR_GREEN);
					}
					
				}
				
				
				if(caster.getBuffs() != null){
					
				}
				if(buff == null){
					for(ISprite t : sometargets){
						//Soit on ajoute le buff pour ce nouveau target
						GBuff b = new GBuff();
						b.setEffectID(EffectsManager.getMaxLaunchByTurnByTargetEffect().getID());
						//TurnEnd pcq faut le débuffer à la fin du tour
						b.setApplicationMode((byte) BuffApplicationType.TurnEnd.ordinal());
						b.setRemainingTurns((byte) (s.getMaxLaunchByTurnByTarget()-1)); //-1 pcq j'fais de X jusqu'à 0 donc ça ajoute un chiffre de plus à décrémenter
						//Ex, si le sort a un MaxLaunchByTurnByTarget de 1, bah ca le met à 0 et il pourra pas frapper une 2eme fois :P
						b.setDice(new Dice(s.getID(), (short)t.getID(), (short)0));
						caster.addBuff(b);
						SM.Messages.M((GPersonnage) caster, "Vous lancez un sort et gagnez un buff de maxLaunchByTurnByTarget ("+b.getRemainingTurns()+" coups) sur celui-ci avec le targetCaracter("+t.getID()+").", Constants.COLOR_GREEN);
					}
				}
			//}
		}
	}
	
	
}
