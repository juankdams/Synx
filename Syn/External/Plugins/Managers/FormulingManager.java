package Plugins.Managers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import Plugins.Abstractions.AbstractFormulings.AbstractFormulas;
import Plugins.Abstractions.AbstractFormulings.AbstractNode;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;
import Plugins.Abstractions.AbstractFormulings.AbstractPathUtils;

public class FormulingManager {
	public Logger log = LoggerFactory.getLogger(FormulingManager.class);

	
	private AbstractFormulas formulas = null;
	private AbstractPath path = null;
	private AbstractNode node = null;
	private AbstractPathUtils pathUtils = null;

	public void unload(){
		path = null;
		node = null;
		formulas = null;
		pathUtils = null;
	}

	
	
	
// PATHFINDING --------------------------------------------------------------------------------	
	
	public AbstractPath parsePath(String s){
		return path.parsePath(this, s);
	}
	public AbstractNode parseNode(String s){
		return node.parseNode(s);
	}
	public AbstractPath createPath(){
		return path.createNew();
	}
	public AbstractNode createNode(){
		return node.createNew();
	}
	public AbstractNode createNode(Orientation orientation, short cellID){
		return node.createNew(orientation, cellID);
	}
	public AbstractNode createNode(byte orientation, short cellID){
		return node.createNew(orientation, cellID);
	}
	public AbstractPath parsePathFromTwoNodes(Map m, AbstractNode start, AbstractNode end){
		return pathUtils.parsePathFromTwoNodes(m, start, end);
	}
	public ArrayList<CombativeCharacter> getTargetsInAreaStrings(Map m, String[] zoneTypes, short startCell, short targetCell){
		return pathUtils.getTargetsInAreaStrings(m, zoneTypes, startCell, targetCell);
	}
	public ArrayList<CombativeCharacter> getTargetsInAreaString(Map m, String zoneType, short startCell, short targetCell){
		return pathUtils.getTargetsInAreaString(m, zoneType, startCell, targetCell);
	}
	public boolean isInLineWith(Map m, short casterCell, short targetCell){
		return pathUtils.isInLineWith(m, casterCell, targetCell);
	}
	public boolean isInLineWith2(Map m, short startCell, short targetCell){
		return pathUtils.isInLineWith2(m, startCell, targetCell);
	}
	public short getFreeCellAround(ISprite c, boolean fight){
		return pathUtils.getFreeCellAround(c, fight);
	}
	public int[] getFreeCellsAround(ISprite c, boolean fight){
		return pathUtils.getFreeCellsAround(c, fight);
	}
	public short getFreeCellRandom(Map m){
		return pathUtils.getFreeCellRandom(m);
	}
	public short getFreeCellRandom(Map m, int minRange, int maxRange){
		return pathUtils.getFreeCellRandom(m, minRange, maxRange);
	}
	public int getCellIDinOrientation(Map m, Orientation o, short cell, boolean fight){
		return pathUtils.getCellIDinOrientation(m, o, cell, fight);
	}
	public Orientation getOrientationBetweenCellsInFight(Map m, short startCell, short targetCell){
		return pathUtils.getOrientationBetweenCellsInFight(m, startCell, targetCell);
	}
	public int getDistanceBetweenCellsInFight(Map m, short startCell, short targetCell){
		return pathUtils.getDistanceBetweenCellsInFight(m, startCell, targetCell);
	}
	
	
	
	
	
	
//    FORMULES CALCULS --------------------------------------------------------------------------------	
	
	/**
	 * Retourne le niveau de maitrise de l'arme équipée par le joueur. (Maitrises xp-ables comme dans disgaea :3)
	 */
	public int calculateMaitriseLevel(GPersonnage p){
		return formulas.calculateMaitriseLevel(p);
	}
	/**
	 * Retourne l'initiative totale à (par Ex)  afficher dans le packet As 
	 * <p>et utiliser dans le début d'un combat pour l'ordre des joueurs
	 * <p>TODO: Manque le bonus d'alignement dans la formule de calcul 
	 * <p>(http://forums.jeuxonline.info/showthread.php?t=526481&page=2)(http://forums.jeuxonline.info/showthread.php?t=876422)
	 * @param stats - Les statistiques du joueur
	 * @param lvl - Le niveau du joueur
	 * @return - Le total d'initiative comprenant l'intel,l'agi, la force, la chance, la sagesse, l'init (equip), le niveau..
	 */
	public int calculateTotalInitiative(GStatistiques stats, short lvl){
		return formulas.calculateTotalInitiative(stats, lvl);
	}
	/**
	 * 
	 * @return - La total de prospection du joueur en prenant compte de 
	 * 		sa chance et sa prospection de base ou des équipements, etc
	 */
	public int calculateTotalProspection(GStatistiques stats){
		return formulas.calculateTotalProspection(stats);
	}
	/**
	 * TODO: Ajouter le total des niveaux des mÃ©tiers*5 et le nombre de mÃ©tiers niveau 100*1000
	 * <p>http://forums.jeuxonline.info/showthread.php?t=801243#Le nombre de Pods
	 * @param stats
	 * @param p
	 * @return
	 */
	public int calculateMaxPods(GStatistiques stats, GPersonnage p){
		return formulas.calculateMaxPods(stats, p);
	}
	//public short calculateBasePdvMax(GStatistiques s, GPersonnage p){
	//	return formulas.calculateBasePdvMax(s, p);
	//}
	/**
	 * Calcule la valeur pour la charac ESQUIVE_PA/PM dans la colonne choisie des statistiques du personnage 
	 * @param s - Les stats du perso
	 * @return - L'esquive qu'il a 
	 */
	public short calculateEsquivePAPM(GStatistiques s, CharacteristicType ct, CharacteristicColumn cc){
		return formulas.calculateEsquivePAPM(s, ct, cc);
	}
	
	public int[] calculateDamageOnTargetByWeaponWithResists(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique){
		return formulas.calculateDamageOnTargetByWeaponWithResists(arme, e, caster, target, coupCritique);
	}
	public int[] calculateDamageOnTargetBySpellWithResists(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		return formulas.calculateDamageOnTargetBySpellWithResists(e, caster, target);
	}
	public int calculateDamageOnTargetByWeapon(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique){
		return formulas.calculateDamageOnTargetByWeapon(arme, e, caster, target, coupCritique);
	}
	public int calculateDamageOnTargetBySpell(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		return formulas.calculateDamageOnTargetBySpell(e, caster, target);
	}
	public int calculateResistances(GEffect e, CombativeCharacter caster, CombativeCharacter target, int dommages){
		return formulas.calculateResistances(e, caster, target, dommages);
	}
	public int calculateRenvoi(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		return formulas.calculateRenvoi(e, caster, target);
	}
	public int calculateHeal(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		return formulas.calculateHeal(e, caster, target);
	}
	public boolean calculateCoupCritique(double tauxCC, GStatistiques stats){
		return formulas.calculateCoupCritique(tauxCC, stats);
	}
	public boolean calculateEchecCritique(double tauxEC, GStatistiques stats){
		return formulas.calculateEchecCritique(tauxEC, stats);
	}
	/** {xp,honnor,guild,mount} */
	public long[] calculateXpGain(FightEndEvent fee, CombativeCharacter cc) {
		return formulas.calculateXpGain(fee, cc);
	}
	
	
	

	
	
	
// Getters & Setters Pour Les Variables du FormulingManager ----------------------------------
	//(Instances des classes chargées dans le plugin) ---------------------------------------
	

	public void setFormulas(AbstractFormulas formulass) {
		formulas = formulass;
	}
	public AbstractFormulas getFormulas() {
		return formulas;
	}

	public AbstractPath getPath() {
		return path;
	}
	public void setPath(AbstractPath pathl) {
		path = pathl;
	}

	public AbstractNode getNode() {
		return node;
	}
	public void setNode(AbstractNode nodel) {
		node = nodel;
	}

	public void setPathUtils(AbstractPathUtils pathUtilsl) {
		pathUtils = pathUtilsl;
	}
	public AbstractPathUtils getPathUtils() {
		return pathUtils;
	}




	
	
}
