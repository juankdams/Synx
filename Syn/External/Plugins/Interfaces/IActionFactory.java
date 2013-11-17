package Plugins.Interfaces;

import Abstractions.AbstractCharacter;
import Abstractions.CombativeCharacter;
import Enums.PlayerState;
import Enums.PlayerState.StateRelation;
import GameObjects.GAction;
import GameObjects.GPersonnage;
import GameObjects.GSpell;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;

public interface IActionFactory {


	public GAction newMovementAction(AbstractCharacter caster, AbstractPath path);//1
	public GAction newCinematicAction(GPersonnage caster, boolean isChangingMap, int cinematicID);//2
	
	public GAction newCellChangedAction(AbstractCharacter caster, int newCellID);//4

	public GAction newPdvChangedAction(CombativeCharacter caster, int pdvLostOrGained);//100
	public GAction newPaChangedAction(CombativeCharacter caster, int paLostOrGained);//102
	public GAction newKillAction(CombativeCharacter killer, CombativeCharacter killed);//103
	public GAction newReduceDamageAction(CombativeCharacter target, int damageReduced);//105
		
	
	public GAction newPmChangedAction(CombativeCharacter caster, int pmLostOrGained);//129
	
	
	public GAction newInvisibilityAction(CombativeCharacter caster, boolean becomeinvisible);//150

	public GAction newAnimationAction(GPersonnage caster, int cellID, int animationID, 
			int area, int action, int size);//228


	public GAction newSpellAction(CombativeCharacter caster, GSpell s, int targetCellID);//300
	public GAction newSpellCCAction(CombativeCharacter caster, GSpell s, int targetCellID);//301
	public GAction newSpellECAction(CombativeCharacter caster, GSpell s);//302
	public GAction newSpellArmeAction(CombativeCharacter caster, int targetCellID);//303
	public GAction newSpellArmeCCAction(CombativeCharacter caster, int targetCellID);//304
	public GAction newSpellArmeECAction(CombativeCharacter caster);//305
	
	public GAction newPaEsquiveAction(CombativeCharacter caster, int paDodged);//308
	public GAction newPmEsquiveAction(CombativeCharacter caster, int pmDodged);//309

	public GAction newChallengeAction(GPersonnage caster);//900
	
	public GAction newEnterFightAction(GPersonnage caster);//905
	
	public GAction newStateAction(CombativeCharacter target, PlayerState ps, StateRelation sr);//950


}
