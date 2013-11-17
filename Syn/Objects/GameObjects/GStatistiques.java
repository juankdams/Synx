package GameObjects;

import static Enums.CharacteristicType.AGILITE;
import static Enums.CharacteristicType.CHANCE;
import static Enums.CharacteristicType.COUP_CRITIQUE;
import static Enums.CharacteristicType.DISHONOR;
import static Enums.CharacteristicType.DOM;
import static Enums.CharacteristicType.DOM_FACTOR;
import static Enums.CharacteristicType.DOM_PERMANENT;
import static Enums.CharacteristicType.DOM_PHYSIQUE;
import static Enums.CharacteristicType.DOM_PIEGE;
import static Enums.CharacteristicType.DOM_PIEGE_PERCENT;
import static Enums.CharacteristicType.DOM_RENVOI;
import static Enums.CharacteristicType.ECHEC_CRITIQUE;
import static Enums.CharacteristicType.ENERGY;
import static Enums.CharacteristicType.ESQUIVE_PA;
import static Enums.CharacteristicType.ESQUIVE_PM;
import static Enums.CharacteristicType.FORCE;
import static Enums.CharacteristicType.HONOR;
import static Enums.CharacteristicType.INTELLIGENCE;
import static Enums.CharacteristicType.INVOCATIONS_MAX;
import static Enums.CharacteristicType.LEVEL;
import static Enums.CharacteristicType.LIFE_POINTS;
import static Enums.CharacteristicType.PA;
import static Enums.CharacteristicType.PM;
import static Enums.CharacteristicType.PORTEE;
import static Enums.CharacteristicType.RESIST_AIR;
import static Enums.CharacteristicType.RESIST_AIR_PERCENT;
import static Enums.CharacteristicType.RESIST_AIR_PERCENT_PVP;
import static Enums.CharacteristicType.RESIST_AIR_PVP;
import static Enums.CharacteristicType.RESIST_EAU;
import static Enums.CharacteristicType.RESIST_EAU_PERCENT;
import static Enums.CharacteristicType.RESIST_EAU_PERCENT_PVP;
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
import static Enums.CharacteristicType.SPELL_POINTS;
import static Enums.CharacteristicType.STATS_POINTS;
import static Enums.CharacteristicType.VITALITE;
import static Enums.CharacteristicType.WEAPON_DAMAGES_PERCENT;
import static GameObjects.GStatistiques.CharacteristicColumn.BASE;
import static GameObjects.GStatistiques.CharacteristicColumn.BOOST;
import static GameObjects.GStatistiques.CharacteristicColumn.DONS;
import static GameObjects.GStatistiques.CharacteristicColumn.EQUIPEMENT;
import static GameObjects.GStatistiques.CharacteristicColumn.FIGHT;
import static GameObjects.GStatistiques.CharacteristicColumn.TOTAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import Abstractions.CombativeCharacter;
import ConfigurationObjects.Classe;
import Constants.CItems;
import Constants.CPerso;
import Core.Syn;
import Enums.CharacteristicType;
import GlobalObjects.ItemSet;
import Plugins.Managers.EffectsManager;
import Plugins.Managers.FormulingManager;

/**
 * Les statistiques/caractéristiques d'un personnage
 * @author Robyn
 */
public class GStatistiques {
	
	//Base | Dons | Equip | Boosts | Total
	//Base y'a juste PA,PM,capital/spellpoint/pdvmax/les éléments
	//
	
	public static enum CharacteristicColumn{
		BASE(0),
		EQUIPEMENT(1000),
		DONS(2000),
		BOOST(3000),
		TOTAL(4000),
		FIGHT(5000);
		private short columnID = 0;
		private CharacteristicColumn(int v){
			columnID = (short) v;
		}
		public short get(){
			return columnID;
		}
	}
	
	
	/**
	 * Créé de nouvelles statistiques de base
	 * @param p
	 * @return
	 */
	public static GStatistiques createNew(GPersonnage p){
		GStatistiques stats = new GStatistiques();
		//stats.setStatsPoints((short) ((p.getLevel()-1)*CPerso.statsPointsPerLevel));
		//stats.setSpellPoints((short) ((p.getLevel()-1)*CPerso.spellPointsPerLevel));
		short lvl = p.getWorld().getStartLvl(p.getClassID());
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.LEVEL, lvl);
		
		stats.setSpellPoints((short) ((lvl-1)*p.getClasse().getCharacBoostPerLevel(SPELL_POINTS)));
		stats.setSpellPoints((short) ((lvl-1)*p.getClasse().getCharacBoostPerLevel(STATS_POINTS)));
		
		//stats.setPdvMax((short) (CPerso.startPdv+(CPerso.pdvMaxPointsPerLevel*lvl)));
		//stats.setPdv(stats.getPdvMax());
		//stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.MAX_LIFE_POINTS, p.getServer().getFormulingManager().calculateBasePdvMax(stats, p));
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.LIFE_POINTS, (short) stats.getPdvMax(p));
		
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.ENERGY, CPerso.energyMax);
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PA, CPerso.startPA);
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PM, CPerso.startPM);
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PROSPECTION, p.getClassID() == CPerso.CLASSE_ENUTROF?CPerso.startEnutrofProspection : CPerso.startProspection);
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.INITIATIVE, CPerso.startInitiative);
		stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.INVOCATIONS_MAX, CPerso.startIncovationsMax);
		p.getWorld().addStatistique(p.getID(), stats);
		return stats;
	}
	
	
	// PARTIE OBJET -------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	/**
	 * < effectID+ColumnID , value >
	 */
	private HashMap<Short, Short> stats = null;
	//private short pdv = 50;//TODO Ya un characteristicType pour ca donc tu peux l'mettre dans l,hashmap
	//private short pdvMax = 50;
	
	public GStatistiques(){
		stats = new HashMap<Short, Short>(13);
		//TODO Set baseStats: capital,spellpoints,pdv,pdvmax,etc, intelligence,chance,vitalite,invocs,PA,PM,etc
	}

	public void putCharac(CharacteristicColumn column, CharacteristicType charac, short value){
		//TODO: Faire des vérifications que la valeur mise soit correcte? 
		//	Style ne pas avoir moins de 0 dans les characteristiques de base..
		stats.put(((short) (column.get()+charac.get())), value);
	}
	public void removeCharac(CharacteristicColumn column, CharacteristicType charac){
		stats.remove(column.get()+charac.get());
	}
	/**
	 * Retourne la valeur en fonction de la charac et de sa colonne demandée ou 0 si la valeur n'existe pas.
	 * @param characID - L'ID de l'enum CharacteristicType
	 * @param column - L'enum CharacteristicColumn trouvable dans cette meme class GStatistiques
	 * @return
	 */
	public short getValue(short characID, CharacteristicColumn column){
		if(column == TOTAL){
			short total = 0;
			for(CharacteristicColumn cc : CharacteristicColumn.values()){
				if(stats.get(((short)(characID+cc.get()))) != null){
					total += stats.get(((short)(characID+cc.get())));
				}
			}
			//Syn.d("stats.getValue.return total   KeyDemandée:"+(characID+column.get())+"   Value:"+total);
			return total;
		}
		if(stats.containsKey(((short)(characID+column.get())))){
			//Syn.d("stats.getValue.return get KeyDemandée:"+(characID+column.get())+"   Value:"+stats.get(((short)(characID+column.get()))));
			return stats.get(((short)(characID+column.get())));
		}else{
			//Syn.d("stats.getValue.return 0   KeyDemandée:"+(characID+column.get())+"   Value:"+stats.get(((short)(characID+column.get()))));
			return 0;
		}
	}
	/**
	 * Retourne les valeurs pour une charac dans chaque colonne 
	 * sous ce format:  Base, Equip, Dons, Boosts
	 * @param characID
	 * @return
	 */
	public String getLinePacket(short characID){
		String line = "";
		for(CharacteristicColumn cc : CharacteristicColumn.values()){
			if(cc == TOTAL){
				return line;
			}
			if(line.length() != 0){
				line += ',';
			}
			if(stats.containsKey(((short)(characID+cc.get())))){
				line += stats.get(((short)(characID+cc.get())));
			}else{
				line += '0';
			}
		}
		return line;
	}

	/**
	 * Retourne les valeurs pour les esquives
	 * sous ce format:  Base, Equip, Dons, Boosts
	 * @param characID
	 * @return
	 */
	public StringBuilder getEsquiveLinesPacket(FormulingManager fm, StringBuilder str){
		str.append(fm.calculateEsquivePAPM(this, ESQUIVE_PA, BASE)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PA, EQUIPEMENT)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PA, DONS)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PA, BOOST)).append(',')
			.append('|')
			
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PM, BASE)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PM, EQUIPEMENT)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PM, DONS)).append(',')
			.append(fm.calculateEsquivePAPM(this, ESQUIVE_PM, BOOST)).append(',')
			.append('|')
		;
		return str;
	}
	
	public StringBuilder getPacket(FormulingManager fm, StringBuilder str){
		 str
		.append(getLinePacket(FORCE.get())).append('|')
		.append(getLinePacket(VITALITE.get())).append('|')
		.append(getLinePacket(SAGESSE.get())).append('|')
		.append(getLinePacket(CHANCE.get())).append('|')
		.append(getLinePacket(AGILITE.get())).append('|')
		.append(getLinePacket(INTELLIGENCE.get())).append('|')
		.append(getLinePacket(PORTEE.get())).append('|')
		.append(getLinePacket(INVOCATIONS_MAX.get())).append('|')
		.append(getLinePacket(DOM.get())).append('|')
		.append(getLinePacket(DOM_PHYSIQUE.get())).append('|')
		.append(getLinePacket(WEAPON_DAMAGES_PERCENT.get())).append('|')
		.append(getLinePacket(DOM_FACTOR.get())).append('|')
		.append(getLinePacket(SOIN.get())).append('|')
		.append(getLinePacket(DOM_PIEGE.get())).append('|')
		.append(getLinePacket(DOM_PIEGE_PERCENT.get())).append('|')
		.append(getLinePacket(DOM_RENVOI.get())).append('|')
		.append(getLinePacket(COUP_CRITIQUE.get())).append('|')
		.append(getLinePacket(ECHEC_CRITIQUE.get())).append('|');

		return getEsquiveLinesPacket(fm, str)
		
		.append(getLinePacket(RESIST_NEUTRE.get())).append('|')
		.append(getLinePacket(RESIST_NEUTRE_PERCENT.get())).append('|')
		.append(getLinePacket(RESIST_NEUTRE_PVP.get())).append('|')
		.append(getLinePacket(RESIST_NEUTRE_PERCENT_PVP.get())).append('|')
		
		.append(getLinePacket(RESIST_TERRE.get())).append('|')
		.append(getLinePacket(RESIST_TERRE_PERCENT.get())).append('|')
		.append(getLinePacket(RESIST_TERRE_PVP.get())).append('|')
		.append(getLinePacket(RESIST_TERRE_PERCENT_PVP.get())).append('|')

		.append(getLinePacket(RESIST_EAU.get())).append('|')
		.append(getLinePacket(RESIST_EAU_PERCENT.get())).append('|')
		.append(getLinePacket(RESIST_EAU_PVP.get())).append('|')
		.append(getLinePacket(RESIST_EAU_PERCENT_PVP.get())).append('|')
		
		.append(getLinePacket(RESIST_AIR.get())).append('|')
		.append(getLinePacket(RESIST_AIR_PERCENT.get())).append('|')
		.append(getLinePacket(RESIST_AIR_PVP.get())).append('|')
		.append(getLinePacket(RESIST_AIR_PERCENT_PVP.get())).append('|')
		
		.append(getLinePacket(RESIST_FEU.get())).append('|')
		.append(getLinePacket(RESIST_FEU_PERCENT.get())).append('|')
		.append(getLinePacket(RESIST_FEU_PVP.get())).append('|')
		.append(getLinePacket(RESIST_FEU_PERCENT_PVP.get())).append('|')
		;
		//return str;
	}
	
	
	

	//public short getStatsPoints() {
	//	return capitalPoints;
	//}
	//public short getSpellPoints() {
	//	return spellPoints;
	//}
	public short getPdv() {
		return getValue(LIFE_POINTS.get(), BASE);
		//return getValue(LIFE_POINTS.get(), TOTAL);
	}
	public int getPdvMax(CombativeCharacter guy) {
		int pdvMax = getValue(VITALITE.get(), TOTAL) + getValue(DOM_PERMANENT.get(), FIGHT);
		if(guy.getClasse() != null){
			Syn.w("class != null, pdvmax base "+pdvMax+" , startVita = "+guy.getClasse().getStartStat(VITALITE));
			pdvMax += guy.getClasse().getStartStat(LIFE_POINTS) //50 de base
				   + (int)((getValue(LEVEL.get(), BASE) * guy.getClasse().getCharacBoostPerLevel(LIFE_POINTS)));//+5/lvl
			
		}else{
			Syn.w("class == null");
		}
		return pdvMax;
		//return getValue(MAX_LIFE_POINTS.get(), TOTAL);
	}
	/**
	 * Renvoi le nombre de PA (colonne TOTAL) controllé par le min/max PA de la classe mise en parametre.
	 * Peut mettre null si la personne n'a pas de classe, sauf que le min/max Pa ne sera pas controllé
	 */
	public short getPA(Classe c){
		short pa = getValue(PA.get(), TOTAL);
		return  c == null ? pa :
				pa > c.minMaxPaPm[1][0] ? c.minMaxPaPm[1][0] :  //Controle le max
				pa < c.minMaxPaPm[0][0] ? c.minMaxPaPm[0][0] :  //Controle le min
				pa; //Sinon renvoie la valeur réelle
	}
	/**
	 * Renvoi le nombre de PM (colonne TOTAL) controllé par le min/max PM de la classe mise en parametre.
	 * Peut mettre null si la personne n'a pas de classe, sauf que le min/max Pm ne sera pas controllé
	 */
	public short getPM(Classe c){
		short pm = getValue(PM.get(), TOTAL);
		return  c == null ? pm :
				pm > c.minMaxPaPm[1][1] ? c.minMaxPaPm[1][1] : //Controle le max
				pm < c.minMaxPaPm[0][1] ? c.minMaxPaPm[0][1] : //Controle le min
				pm; //Sinon renvoie la valeur réelle
	}
	public short getEnergy() {
		return getValue(ENERGY.get(), BASE);
	}
	public short getEnergyMax() {
		return CPerso.energyMax;
	}
	public short getHonor() {
		return getValue(HONOR.get(), BASE);
	}
	public short getDishonor() {
		return getValue(DISHONOR.get(), BASE);
	}
	/**
	 * Le grade (0 à 10) de l'alignement en fonction de l'honneur 
	 */
	public int getGrade(GWorld w){
		short honor = getHonor();
		for(int i = w.honorXPLevels.length-1; i >= 0; i--){
			if(honor >= w.honorXPLevels[i]){
				return i+1;
			}
		}
		return 0;
	}
	
	
	
	public void setStatsPoints(short capital){
		if(capital < 0){
			capital = 0;
		}
		this.putCharac(BASE, STATS_POINTS, capital);
	}
	public void setSpellPoints(short spellpoint){
		if(spellpoint < 0){
			spellpoint = 0;
		}
		this.putCharac(BASE, SPELL_POINTS, spellpoint);
	}
	
	/**
	 * Return true si la vie a bien été incrémentée. False si non.
	 * @param add
	 * @return
	 */
	public boolean incrementPdv(int add, CombativeCharacter guy){
		int pdv = getPdv();
		int pdvMax = getPdvMax(guy);
		if(add < 1 || pdv == pdvMax || (add+pdvMax) > Short.MAX_VALUE){
			return false;
		}else if((pdv+add) > pdvMax){
			add = (pdvMax-pdv);
		}
		//pdv += add;
		this.incrementValue(LIFE_POINTS, (short) add, BASE);
		return true;
	}
	
	public void decrementPdv(int remove, CombativeCharacter guy){
		int pdv = getPdv();
		if(remove >= pdv){
			remove = (pdv-1);
		}else if((pdv-remove) <= 0){
			remove = (pdv-remove-1);
		}
		//pdv -= remove;
		if(guy.getFight() != null){
			int permanentDamage = remove * guy.getServer().getConfig().getPermanentDamagePercent() / 100;
			this.decrementValue(DOM_PERMANENT, (short) permanentDamage, FIGHT);
			Syn.w("decrementing pdv in fight, permanent : "+permanentDamage);
		}
		this.decrementValue(LIFE_POINTS, (short) remove, BASE);
	}

	/**
	 * Utilisé quand on level up ou avec des commandes console du style PDVPER ou SETPDV. <br>
	 * Autrement on utilise les methods increment/decrementPdv
	 */
	public void setPdv(int pdv, CombativeCharacter guy){
		int pdvMax = getPdvMax(guy);
		if(pdv < 1){
			pdv = 1;
		}else if(pdv > pdvMax){
			pdv = pdvMax;
		}
		this.putCharac(BASE, LIFE_POINTS, (short) pdv);
		//this.pdv = pdv;
	}
	/*
	public void setPdvMax(short pdvMax){
		if(pdvMax < 1){
			pdvMax = 1;
		}
		if(pdv < pdvMax){
			pdv = pdvMax;
		}
		this.pdvMax = pdvMax;
	}*/
	/* *
	 * Augmente les PdvMax ()
	 * @param add
	 * @return
	 */
	/*public boolean incrementPdvMax(short add, CharacteristicColumn column){
		if(add < 1 || add > Short.MAX_VALUE){
			return false;
		}
		//pdvMax += add;
		this.incrementValue(MAX_LIFE_POINTS, (short) add, column);
		return true;
	}
	/**
	 * Diminue les Pdv Max
	 * @param remove - Valeur de pdvmax à enlever, doit être positive. 
	 * <br>Si pdv-remove < 1, pdvmax = 1;  sinon : pdv -= remove;
	 */
	/*public boolean decrementPdvMax(short remove, CharacteristicColumn column){
		if(remove <= 0 || remove > Short.MAX_VALUE){
			return false;
		}
		short pdvMax = getPdvMax();
		if(pdvMax-remove <= 0){
			//pdvMax = 1;
			this.decrementValue(MAX_LIFE_POINTS, (short) (pdvMax - 1), column);//sets pdvMax to 1
		}else{
			//pdvMax -= remove;
			this.decrementValue(MAX_LIFE_POINTS, (short) remove, column);
		}
		return true;
	}*/
	
	public void setEnergy(short energy){
		if(energy < 0){
			energy = 0;
		}
		this.putCharac(BASE, ENERGY, energy);
	}
	
	public void setHonor(short honor){
		if(honor < 0){
			honor = 0;
		}
		//this.honor = honor;
		this.putCharac(BASE, HONOR, honor);
	}
	public void incrementHonor(short add){
		short honor = getHonor();
		this.putCharac(BASE, HONOR, (short) (honor+add));
	}
	public void decrementHonor(short remove){
		short honor = getHonor();
		if(honor - remove < 0){
			this.putCharac(BASE, HONOR, Constants.Constants.ZERO_SHORT);
		}else{
			this.putCharac(BASE, HONOR, (short) (honor - remove));
		}
	}
	public void setDishonor(short Dishonor){
		if(Dishonor < 0){
			Dishonor = 0;
		}
		this.putCharac(BASE, DISHONOR, Dishonor);
	}
	/** Ajoute du déshonneur, donc empire l'état du joueur */
	public void incrementDishonor(short add){
		short dishonor = getDishonor();
		this.putCharac(BASE, DISHONOR, (short) (dishonor+add));
	}
	/** Enlève du déshonneur, donc le joueur s'améliore, il devient plus gentil :) */
	public void decrementDishonor(short remove){
		short dishonor = getDishonor();
		if(dishonor - remove < 0){
			this.putCharac(BASE, DISHONOR, Constants.Constants.ZERO_SHORT);
		}else{
			this.putCharac(BASE, DISHONOR, (short) (dishonor - remove));
		}
	}
	@Override
	public String toString(){
		if(stats.size() == 0){
			return "stats size 0";
		}
		String stat = "Stats : ";
		for(Entry<Short, Short> e : stats.entrySet()){
			stat += ("Key :"+e.getKey()+",Value :"+e.getValue()+"  ");
		}
		return stat;
	}

	///**
	// * Enleve la GStat du gworld et delete la ligne de la bdd
	// */
	//public void delete(GPersonnage p){
	//	p.getgWorld().removeStatistiques(p.getID());
	//	SQL.Personnages.deleteStats(p.getID(), p.getServer());
	//}
	
	/**
	 *	this.stats.clear();
	 *	this.stats = null;
	 *  this.finalize();
	 */
	public void terminate(){
		//w.removeStatistiques(p.getID());
		if(stats != null) stats.clear();
		stats = null;
		try {
			this.finalize();
		} catch (Throwable e) { e.printStackTrace(); }
	}

	/**
	 * Si la valeur à modifier est déjà présente dans les stats, elle est incrémentée. Sinon, elle est settée.
	 * @param toBoost - La characteristique à booster
	 * @param value - De combien on l'incrémente
	 * @param column - Danse quelle colonne on doit incrémenter
	 */
	public void incrementValue(CharacteristicType toBoost, short value, CharacteristicColumn column) {
		if(this.stats.get(((short)(column.get()+toBoost.get()))) != null){
			this.stats.put(((short) (column.get()+toBoost.get())), (short) (value+stats.get(((short)(column.get()+toBoost.get())))));
		}else{
			this.stats.put(((short) (column.get()+toBoost.get())), value);
		}
	}
	
	/**
	 * Si la valeur à modifier est déjà présente dans les stats, elle est decrémentée. Sinon, elle est settée.
	 * @param toDeboost - La characteristique à débooster
	 * @param value - De combien on décrémente
	 * @param column - Dans quelle colonne on doit décrémenter
	 */
	public void decrementValue(CharacteristicType toDeboost, short value, CharacteristicColumn column) {
		if(this.stats.get(((short)(column.get()+toDeboost.get()))) != null){
			this.stats.put(((short) (column.get()+toDeboost.get())), (short) (stats.get(((short)(column.get()+toDeboost.get()))) - value));
		}else{
			this.stats.put(((short) (column.get()+toDeboost.get())), (short) (0-value));//java de pd avec ses int pis ses cast. meme pas moyen de foutre en négatif
		}
	}

	/**
	 * Utilisé uniquement à la sélection du personnage
	 * @param inventory
	 */
	public void updateEquipmentStats(GInventory inventory, GPersonnage p) {
		String itemSets = "";
		for(GItem item : inventory.getItems()){
			//Seulement les items équipés/équipables
			if(item.isEquiped() == false || CItems.isEquipable(item.getTemplate().getType()) == false){
				continue;
			}
			if(item.getTemplate().getItemSetID() != 0 && itemSets.indexOf(";"+item.getTemplate().getItemSetID()+";") == -1){
				itemSets += ";"+item.getTemplate().getItemSetID()+";";
				updateItemSetStats(item, item.getPosition(), p);
			}
			if(item.isClassSet()){
				for(GEffect e : item.getEffects()){
					SM.Spells.SB(p.getClient().getSession(), e, "");
				}
			}
			EffectsManager em = p.getServer().getEffectsManager();
			if(item.getEffects() != null){
				for(GEffect e : item.getEffects()){
					if(em.isFixEffectBonus(e.getEffectID()) && e.getEffectType(em).getCharacType() != null){
						if(e.getEffectType(em).getOperator() == '+'){
							incrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), CharacteristicColumn.EQUIPEMENT);
						}else if(e.getEffectType(em).getOperator() == '-'){
							decrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), CharacteristicColumn.EQUIPEMENT);
						}
					}
				}
			}
		}
		////Pour éviter de le faire un million de fois, aussi bien le faire une seule fois inutile que 823 utiles
		//setPdvMax(p.getServer().getFormulingManager().calculatePdvMax(this, p));
	}
	/**
	 * Utilisé uniquement dans updateEquipmentStats pour updater les stats à la sélection du personnage.
	 */
	public void updateItemSetStats(GItem movingItem, byte newPos, GPersonnage p){
		if(movingItem.getTemplate().getItemSetID() != 0){
			//Bonus de panoplie
			ItemSet is = movingItem.getTemplate().getItemSet(p.getWorld());
			short[] equipedItems = p.getInventory().getItemSetEquipedItems(is);
			//Core.Syn.d("Grade Départ = "+equipedItems.length);
			ArrayList<GEffect> effects = movingItem.getTemplate().getItemSet(p.getWorld()).getBonuses(equipedItems.length);
			//Envoie le packet d'affichage des bonus de panoplie
			SM.Objects.OS(p.getClient().getSession(), is.getID(), equipedItems, effects);
			if(effects == null){Core.Syn.d("effects == null continue");return;}
			//Update les Gstatistiques du joueur
			EffectsManager em = p.getServer().getEffectsManager();
			for(GEffect e : effects){
				this.incrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), GStatistiques.CharacteristicColumn.EQUIPEMENT);
			}
		}
	}
	
	
	
	/**
	 * Prend un objet et si on l'équipe, ajoute les effets aux gstats. Sinon les enleve.
	 * <p>Prend aussi en compte les boosts par rapport aux panoplies.
	 * @param movingItem - L'objet en moouvement/délétion/drop
	 * @param newPos - La nouvelle position de l'objet
	 * @param p - Le personnage à qui l'objet appartient
	 */
	public synchronized void boostEquipmentStats(GItem movingItem, byte newPos, GPersonnage p){
		EffectsManager em = p.getServer().getEffectsManager();
		FormulingManager fm = p.getServer().getFormulingManager();
		if(movingItem.getEffects() != null && CItems.isEquipable(movingItem.getTemplate().getType())){
			for(GEffect e : movingItem.getEffects()){
				if(movingItem.isClassSet()){//Envoie des packets SB de boost de sorts par les items de classes
					SM.Spells.SB(p.getClient().getSession(), e, newPos==CItems.POS_notEquiped?"-":"");
				}
				if(e.getEffectType(em).getCharacType() == FORCE || em.isPodsEffect(e)){
					SM.Objects.Ow(p.getClient().getSession(), p);//Envoie l'affichage des pods modifiés
				}
				if(em.isFixEffectBonus(e.getEffectID()) && e.getEffectType(em).getCharacType() != null){
					//Incrémente la valeur de l'effet aux stats
					if(    (e.getEffectType(em).getOperator() == '+' && newPos != CItems.POS_notEquiped)//Équipe du positif
						|| (e.getEffectType(em).getOperator() == '-' && newPos == CItems.POS_notEquiped)){//Unequip du negatif
						this.incrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), EQUIPEMENT);
					}else{//Décrémente la veleur de l'effet aux stats
						this.decrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), EQUIPEMENT);
					}
					//if(e.getEffectType(em).getCharacType() == VITALITE){
						//this.setPdvMax(fm.calculateBasePdvMax(this, p));
					//}
				}
			}
		}
		boostItemSetStats(movingItem, newPos, p);
		SM.Account.As(p.getClient().getSession(), p);//Envoie l'affichage des stats modifiées
	}
	
	
	
	
	public synchronized void boostItemSetStats(GItem movingItem, byte newPos, GPersonnage p){
		EffectsManager em = p.getServer().getEffectsManager();
		if(CItems.isEquipable(movingItem.getTemplate().getType()) && movingItem.getTemplate().getItemSetID() != 0){
			//Bonus de panoplie
			ItemSet is = movingItem.getTemplate().getItemSet(p.getWorld());
			short[] itemsEquiped = p.getInventory().getItemSetEquipedItems(is);
			if(newPos != CItems.POS_notEquiped){
				newPos = 1;
			}
			//Core.Syn.d("Grade Départ = "+itemsEquiped.length);
			for(int i = 0; i <= 1; i++){
				ArrayList<GEffect> effects = movingItem.getTemplate().getItemSet(p.getWorld()).getBonuses(itemsEquiped.length+((-i)*newPos));
				//Core.Syn.d("Grade in for = "+(itemsEquiped.length+(-i*newPos))+"  i="+i);
				if(i == 0){
					SM.Objects.OS(p.getClient().getSession(), is.getID(), itemsEquiped, effects);
				}
				if(effects == null){
					//Core.Syn.d("effects == null continue");
					continue;
				}
				if(i == 0){
					//Update les Gstatistiques du joueur
					for(GEffect e : effects) this.incrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), EQUIPEMENT);
				}else{
					//Update les Gstatistiques du joueur
					for(GEffect e : effects) this.decrementValue(e.getEffectType(em).getCharacType(), e.getJet().getValue(), EQUIPEMENT);
				}
			}
		}
	}

	
	public GStatistiques copy() {
		GStatistiques s = new GStatistiques();
		//s.setPdv(this.getPdv());
		//s.setPdvMax(this.getPdvMax());
		for(Entry<Short, Short> e : this.stats.entrySet()){
			s.stats.put(e.getKey(), e.getValue());
		}
		return s;
	}
	
	
	
	
	
	
	
	
	
}