package Plugins.Abstractions;

import java.util.ArrayList;

import Abstractions.CombativeCharacter;
import Enums.CharacteristicType;
import Enums.Orientation;
import Events.FightEndEvent;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import GameObjects.GStatistiques.CharacteristicColumn;
import GlobalObjects.Map;
import Interfaces.ISprite;
import Plugins.Managers.FormulingManager;

public class AbstractFormulings {

	public static abstract class AbstractPathUtils{
		public abstract ArrayList<CombativeCharacter> getTargetsInAreaStrings(Map m, String[] zoneTypes, short startCell, short targetCell);
		public abstract ArrayList<CombativeCharacter> getTargetsInAreaString(Map m, String zoneType, short startCell, short targetCell);
		public abstract boolean isInLineWith(Map m, short casterCell, short targetCell);
		public abstract boolean isInLineWith2(Map m, short startCell, short targetCell);
		public abstract short getFreeCellAround(ISprite c, boolean fight);
		public abstract int[] getFreeCellsAround(ISprite c, boolean fight);
		public abstract short getFreeCellRandom(Map m);
		public abstract short getFreeCellRandom(Map m, int minRange, int maxRange);
		public abstract int getCellIDinOrientation(Map m, Orientation o, short cell, boolean fight);
		public abstract Orientation getOrientationBetweenCellsInFight(Map m, short startCell, short targetCell);
		public abstract int getDistanceBetweenCellsInFight(Map m, short startCell, short targetCell);
		public abstract AbstractPath parsePathFromTwoNodes(Map m, AbstractNode start, AbstractNode end);
	}

	public static abstract class AbstractFormulas {
		//public abstract short calculateBasePdvMax(GStatistiques s, GPersonnage p);
		public abstract int calculateTotalInitiative(GStatistiques stats, short lvl);
		public abstract int calculateTotalProspection(GStatistiques stats);
		public abstract int calculateMaxPods(GStatistiques stats, GPersonnage p);
		public abstract short calculateEsquivePAPM(GStatistiques s, CharacteristicType ct, CharacteristicColumn cc);
		public abstract int[] calculateDamageOnTargetByWeaponWithResists(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique);
		public abstract int[] calculateDamageOnTargetBySpellWithResists(GEffect e, CombativeCharacter caster, CombativeCharacter target);
		public abstract int calculateDamageOnTargetByWeapon(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique);
		public abstract int calculateDamageOnTargetBySpell(GEffect e, CombativeCharacter caster, CombativeCharacter target);
		public abstract int calculateResistances(GEffect e, CombativeCharacter caster, CombativeCharacter target, int dommages);
		public abstract int calculateRenvoi(GEffect e, CombativeCharacter caster, CombativeCharacter target);
		public abstract int calculateHeal(GEffect e, CombativeCharacter caster, CombativeCharacter target);
		public abstract boolean calculateCoupCritique(double tauxCC, GStatistiques stats);
		public abstract boolean calculateEchecCritique(double tauxEC, GStatistiques stats);
		public abstract int calculateMaitriseLevel(GPersonnage p);
		public abstract long[] calculateXpGain(FightEndEvent fee, CombativeCharacter cc);
	}
	
	public static abstract class AbstractPath extends ArrayList<AbstractNode> {
		/** */
		private static final long serialVersionUID = 1L;
		public abstract AbstractPath parsePath(FormulingManager fm, String string);

		public abstract AbstractPath createNew();
		public abstract AbstractPath push(AbstractNode n);
		public abstract AbstractNode first();
		public abstract AbstractNode last();
		@Override
		public abstract String toString();
	}
	
	public static abstract class AbstractNode {
		public abstract AbstractNode parseNode(String string);
		
		public byte orientation;
		public short cell;

		public abstract AbstractNode createNew();
		public abstract AbstractNode createNew(byte orientation, short cell);
		public abstract AbstractNode createNew(Orientation orientation, short cell);
		
		public AbstractNode(){}
		public AbstractNode(Orientation orientation, short cell) {
			this.setOrientation((byte) orientation.ordinal());
			this.setCell(cell);
		}
		public AbstractNode(byte orientation, short cell){
			this.setCell(cell);
			this.setOrientation(orientation);
		}
		public abstract AbstractNode setOrientation(Orientation orientation);
		public abstract AbstractNode setOrientation(byte orientation);
		public abstract byte orientation();
		public abstract AbstractNode setCell(short cell);
		public abstract short cell();
		@Override
		public abstract String toString();
	}
	
	
	
	
	
	
	
	
}
