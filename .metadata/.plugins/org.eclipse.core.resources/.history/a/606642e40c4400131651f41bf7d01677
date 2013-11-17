package pack;

import static pack.GameActionType.CELL_CHANGED;
import static pack.GameActionType.ENTER_FIGHT;
import static pack.GameActionType.ETAT;
import static pack.GameActionType.KILL_UNIT;
import static pack.GameActionType.LANCER_SORT;
import static pack.GameActionType.LANCER_SORT_CAC;
import static pack.GameActionType.LANCER_SORT_CAC_CC;
import static pack.GameActionType.LANCER_SORT_CAC_EC;
import static pack.GameActionType.LANCER_SORT_CC;
import static pack.GameActionType.LANCER_SORT_EC;
import static pack.GameActionType.MOVEMENT;
import static pack.GameActionType.PA_CHANGED;
import static pack.GameActionType.PDV_CHANGED;
import static pack.GameActionType.PM_CHANGED;
import static pack.GameActionType.REDUCE_DAMAGE;
import Abstractions.AbstractCharacter;
import Abstractions.CombativeCharacter;
import Enums.PlayerState;
import Enums.PlayerState.StateRelation;
import GameObjects.GAction;
import GameObjects.GPersonnage;
import GameObjects.GSpell;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;
import Plugins.Interfaces.IActionFactory;
import ShivasPF.Cells;

public class ActionFactory implements IActionFactory {

	
	public GAction newMovementAction(AbstractCharacter caster, AbstractPath path){
		return new GAction(caster.getWorld().getNextActionID(), MOVEMENT.getType(), "a"+Cells.encode(caster.getCellID())+path.toString());
	}

	//Spells + armes
	public GAction newSpellAction(CombativeCharacter caster, GSpell s, int targetCellID){
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT.getType(), s.getID()+","+targetCellID+","+s.getSpellSprite()+","+s.getLevel(caster.getWorld())+","+s.getDisplayType()+","+s.getSpriteAnimationID()+","+(s.isShowInFrontOf() ? "1" : "0"));
	}
	public GAction newSpellCCAction(CombativeCharacter caster, GSpell s, int targetCellID){
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT_CC.getType(), s.getID()+","+targetCellID+","+s.getSpellSprite()+","+s.getLevel(caster.getWorld())+","+s.getDisplayType()+","+s.getSpriteAnimationID()+","+(s.isShowInFrontOf() ? "1" : "0"));
	}
	public GAction newSpellECAction(CombativeCharacter caster, GSpell s){
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT_EC.getType(), s.getID());
	}
	public GAction newSpellArmeAction(CombativeCharacter caster, int targetCellID) {
		//",,0,1");//espace vide = spellSprite, 0=displayType, 1=showInFrontOf
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT_CAC.getType(), targetCellID+",,0,1");
	}
	public GAction newSpellArmeCCAction(CombativeCharacter caster, int targetCellID){
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT_CAC_CC.getType(), targetCellID+",,0,1");
	}
	public GAction newSpellArmeECAction(CombativeCharacter caster){
		return new GAction(caster.getWorld().getNextActionID(), LANCER_SORT_CAC_EC.getType(), "");
	}
	


	public GAction newPaChangedAction(CombativeCharacter caster, int pa){//102
		return new GAction(caster.getWorld().getNextActionID(), PA_CHANGED.getType(), caster.getID()+","+pa);
	}
	public GAction newPdvChangedAction(CombativeCharacter caster, int pdv){//100
		return new GAction(caster.getWorld().getNextActionID(), PDV_CHANGED.getType(), caster.getID()+","+pdv);
	}
	public GAction newPmChangedAction(CombativeCharacter caster, int pm) {//129
		return new GAction(caster.getWorld().getNextActionID(), PM_CHANGED.getType(), caster.getID()+","+pm);
	}
	
	public GAction newCellChangedAction(AbstractCharacter caster, int newCell) {//4
		//GA41;4;25;25,259 -> 41=l'ID unique de l'action. 4=type, 25=perso, 25=perso, 259=newCellID
		return new GAction(caster.getWorld().getNextActionID(), CELL_CHANGED.getType(), caster.getID()+","+newCell);
	}
	

	public GAction newKillAction(CombativeCharacter killer, CombativeCharacter killed){//103
		//KILL_UNIT(103),//GA;103;42;37 -> 42 = killerCharacter, 37 = killedCharacter
		return new GAction(killer.getWorld().getNextActionID(), KILL_UNIT.getType(), killed.getID());
	}
	public GAction newReduceDamageAction(CombativeCharacter target, int damageReduced){//105
		//GA;105;-2;1776617,9 -> -2 = caster, 1776617= target, 9 = dommages réduits
		return new GAction(target.getWorld().getNextActionID(), REDUCE_DAMAGE.getType(), target.getID()+","+damageReduced);
	}


	public GAction newAnimationAction(GPersonnage arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	public GAction newChallengeAction(GPersonnage arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public GAction newCinematicAction(GPersonnage arg0, boolean arg1, int arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public GAction newInvisibilityAction(CombativeCharacter arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public GAction newPaEsquiveAction(CombativeCharacter arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public GAction newPmEsquiveAction(CombativeCharacter arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public GAction newEnterFightAction(GPersonnage target){
		return new GAction(target.getWorld().getNextActionID(), ENTER_FIGHT.getType(), "");
	}
	
	public GAction newStateAction(CombativeCharacter target, PlayerState ps, StateRelation arg2){
		return new GAction(target.getWorld().getNextActionID(), ETAT.getType(), target.getID()+","+ps.get()+","+arg2.get());
	}

	
	
}
