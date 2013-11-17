package Maths;

import static Enums.CharacteristicType.AGILITE;
import static Enums.CharacteristicType.CHANCE;
import static Enums.CharacteristicType.COUP_CRITIQUE;
import static Enums.CharacteristicType.DOM;
import static Enums.CharacteristicType.DOM_FACTOR;
import static Enums.CharacteristicType.DOM_RENVOI;
import static Enums.CharacteristicType.ECHEC_CRITIQUE;
import static Enums.CharacteristicType.FORCE;
import static Enums.CharacteristicType.INITIATIVE;
import static Enums.CharacteristicType.INTELLIGENCE;
import static Enums.CharacteristicType.PROSPECTION;
import static Enums.CharacteristicType.RESISTANCE_DOM_MAGIQUE;
import static Enums.CharacteristicType.RESISTANCE_DOM_PHYSIQUE;
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
import static Enums.CharacteristicType.WEAPON_DAMAGES_PERCENT;
import static GameObjects.GStatistiques.CharacteristicColumn.BOOST;
import static GameObjects.GStatistiques.CharacteristicColumn.EQUIPEMENT;
import static GameObjects.GStatistiques.CharacteristicColumn.TOTAL;

import java.util.Comparator;

import Abstractions.CombativeCharacter;
import Constants.CItems;
import Constants.CPerso;
import Constants.Constants;
import Enums.CharacteristicType;
import Events.FightEndEvent;
import GameObjects.GBuff;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import GameObjects.GStatistiques.CharacteristicColumn;
import GameObjects.Fights.FightTeam;
import GameObjects.Fights.GFight;
import Misc.Randomizer;
import Plugins.Abstractions.AbstractFormulings.AbstractFormulas;
import Plugins.Managers.EffectsManager;
import collections.CollectionQuery;

public class Formulas extends AbstractFormulas{


	private CharacteristicType[] neutralResistances = {RESIST_NEUTRE_PERCENT, RESIST_NEUTRE};
	private CharacteristicType[] earthResistances = {RESIST_TERRE_PERCENT, RESIST_TERRE};
	private CharacteristicType[] fireResistances = {RESIST_FEU_PERCENT, RESIST_FEU};
	private CharacteristicType[] airResistances = {RESIST_AIR_PERCENT, RESIST_AIR};
	private CharacteristicType[] waterResistances = {RESIST_EAU_PERCENT, RESIST_EAU};
	
	private CharacteristicType[] neutralResistancesPvp = {RESIST_NEUTRE_PERCENT_PVP, RESIST_NEUTRE_PVP};
	private CharacteristicType[] earthResistancesPvp = {RESIST_TERRE_PERCENT_PVP, RESIST_TERRE_PVP};
	private CharacteristicType[] fireResistancesPvp = {RESIST_FEU_PERCENT_PVP, RESIST_FEU_PVP};
	private CharacteristicType[] airResistancesPvp = {RESIST_AIR_PERCENT_PVP, RESIST_AIR_PVP};
	private CharacteristicType[] waterResistancesPvp = {RESIST_EAU_PERCENT_PVP, RESIST_EAU_PVP};
	
	private CharacteristicType[] otherResistances = {RESISTANCE_DOM_MAGIQUE, RESISTANCE_DOM_PHYSIQUE};
	
	/**
	 * Retourne l'initiative totale à (par Ex)  afficher dans le packet As 
	 * <p>et utiliser dans le début d'un combat pour l'ordre des joueurs
	 * <p>TODO: Manque le bonus d'alignement dans la formule de calcul 
	 * <p>(http://forums.jeuxonline.info/showthread.php?t=526481&page=2)(http://forums.jeuxonline.info/showthread.php?t=876422)
	 * @param stats - Les statistiques du joueur
	 * @param lvl - Le niveau du joueur
	 * @return - Le total d'initiative comprenant l'intel,l'agi, la force, la chance, la sagesse, l'init (equip), le niveau..
	 */
	@Override
	public int calculateTotalInitiative(GStatistiques stats, short lvl){
		short characs[] = {
				stats.getValue(INTELLIGENCE.get(), TOTAL),
				stats.getValue(AGILITE.get(), TOTAL),
				stats.getValue(FORCE.get(), TOTAL),
				stats.getValue(CHANCE.get(), TOTAL),
				stats.getValue(SAGESSE.get(), TOTAL),
				//Ici on prend l'init totale car elle peut venir des équips comme des boosts ou des bonbons
				stats.getValue(INITIATIVE.get(), TOTAL)
			};
		//Syn.d("Formulas.calculateInitiative : "+lvl+","+characs[0]+","+characs[1]+","+characs[2]+","+characs[3]+","+characs[4]+","+characs[5]);
		// On ne compte pas les valeures négatives
		for(int i = characs.length; i-- > 0;){	
			if(characs[i] < 0){
				characs[i] = 0;
			}
		}
		//Syn.d("Formulas.calculateInitiative : "+lvl+","+characs[0]+","+characs[1]+","+characs[2]+","+characs[3]+","+characs[4]+","+characs[5]);
		//L'Intel et l'Agi comptent pour fois 1.5
		characs[0] = (short)Math.floor(characs[0]*CPerso.gainedInitByIntelAndAgiPoints);//Intel * 1.5
		characs[1] = (short)Math.floor(characs[1]*CPerso.gainedInitByIntelAndAgiPoints);//Agilite * 1.5
		//On additionne le tout et voilà !  (TODO Manquerait juste d'ajouter le bonus d'alignement pour formule initiative)
		return (lvl+characs[0]+characs[1]+characs[2]+characs[3]+characs[4]+characs[5]);
	}
	
	/**
	 * 
	 * @return - La total de prospection du joueur en prenant compte de 
	 * 		sa chance et sa prospection de base ou des Ã©quipements, etc
	 */
	@Override
	public int calculateTotalProspection(GStatistiques stats){
		short chance = stats.getValue(CHANCE.get(), TOTAL);
		if(chance < 0){
			chance = 0;
		}
		chance *= CPerso.gaindProspecByChancePoints;
		//Ici on prend la prospec totale car elle peut venir des Ã©quips comme des boosts ou des bonbons
		return (chance + stats.getValue(PROSPECTION.get(), TOTAL));
	}
	
	/**
	 * TODO: Ajouter le total des niveaux des mÃ©tiers*5 et le nombre de mÃ©tiers niveau 100*1000
	 * <p>http://forums.jeuxonline.info/showthread.php?t=801243#Le nombre de Pods
	 * @param stats
	 * @param p
	 * @return
	 */
	@Override
	public int calculateMaxPods(GStatistiques stats, GPersonnage p){
		short force = stats.getValue(FORCE.get(), TOTAL);
		if(force < 0){
			force = 0;
		}
		force *= CPerso.gainedPodsByForcePoints;
		return CPerso.startPods+force+p.getInventory().getTotalBonusPods(p.getServer().getEffectsManager());//TODO +(totalLvlJobs*5)+(nbrLvl100Jobs*1000) <todo
	}
	
	/*
	@Override
	public short calculateBasePdvMax(GStatistiques s, GPersonnage p){
		return (short) (
				(p.getLevel()*CPerso.pdvMaxPointsPerLevel) +  //Pdvmax par niveau (5/lvl)
				CPerso.startPdv +   //Pdvmax de start (50)
				s.getValue(VITALITE.get(), CharacteristicColumn.BASE)//Vita de base+équipement
				);
	}*/
	
	/**
	 * Calcule la valeur pour la charac ESQUIVE_PA/PM dans la colonne choisie des statistiques du personnage 
	 * @param s - Les stats du perso
	 * @return - L'esquive qu'il a 
	 */
	@Override
	public short calculateEsquivePAPM(GStatistiques s, CharacteristicType ct, CharacteristicColumn cc){
		return (short) (
				(s.getValue(SAGESSE.get(), cc) / CPerso.gainedEsquivePointsBySagessePoints)+
				s.getValue(ct.get(), cc)
				);
	}
	
	
	/**
	 * Retourne le nombre de dommages de bases infligés au target avec l'arme en comptant les résists et renvois
	 * @return   totalDommage = base - totalResisté - totalRenvoyé;<br>
				 return new int[]{totalDommage, totalResisté, totalRenvoyé};
	 */
	@Override
	public int[] calculateDamageOnTargetByWeaponWithResists(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique){
		int totalDommage = calculateDamageOnTargetByWeapon(arme, e, caster, target, coupCritique);
		int totalResisté = calculateResistances(e, caster, target, totalDommage);
		int totalRenvoyé = calculateRenvoi(e, caster, target);
		if(totalResisté > totalDommage){
			totalResisté = totalDommage;
			totalDommage = 0;
		}else{
			totalDommage -= totalResisté;
			if(totalRenvoyé > totalDommage){
				totalRenvoyé = totalDommage;
				totalDommage = 0;
			}else{
				totalDommage -= totalRenvoyé;
			}
		}
		return new int[]{totalDommage, totalResisté, totalRenvoyé};
	}
	
	/**
	 * Retourne le nombre de dommages de bases infligés au target avec l'effet de sort en comptant les résists et renvois
	 * @return   totalDommage = base - totalResisté - totalRenvoyé;<br>
				 return new int[]{totalDommage, totalResisté, totalRenvoyé};
	 */
	@Override
	public int[] calculateDamageOnTargetBySpellWithResists(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		int totalDommage = calculateDamageOnTargetBySpell(e, caster, target);
		int totalResisté = calculateResistances(e, caster, target, totalDommage);
		int totalRenvoyé = calculateRenvoi(e, caster, target);
		if(totalResisté > totalDommage){
			totalResisté = totalDommage;
			totalDommage = 0;
		}else{
			totalDommage -= totalResisté;
			if(totalRenvoyé > totalDommage){
				totalRenvoyé = totalDommage;
				totalDommage = 0;
			}else{
				totalDommage -= totalRenvoyé;
			}
		}
		return new int[]{totalDommage, totalResisté, totalRenvoyé};
	}
	
	/**
	 * Retourne le nombre de dommages de bases infligés au target avec l'arme sans compter les résists ni renvois.
	 */
	@Override
	public int calculateDamageOnTargetByWeapon(GItem arme, GEffect e, CombativeCharacter caster, CombativeCharacter target, boolean coupCritique){
		EffectsManager em = caster.getServer().getEffectsManager();
		int base = e.getParams().isJet() ? e.getJet().getValue() : 
				em.hasBrokle(target) ? e.getDice().getBestShot() :   //Brokle
				em.hasPoisse(caster) ? e.getDice().getWorstShot() :  //Poisse
			    e.getDice().getRandomShot();
		
		int maitrise = caster.getStatistique().getValue(WEAPON_DAMAGES_PERCENT.get(), BOOST);//maitrise
		int carac = Math.max(0, caster.getStatistique().getValue(e.getEffectType(em).getCharacType().get(), TOTAL));//stat
		int domPercent = Math.max(0, caster.getStatistique().getValue(DOM_FACTOR.get(), TOTAL)); //Les +dommages %
		int dom = Math.max(0, caster.getStatistique().getValue(DOM.get(), TOTAL)); //Les +dommages
		
		if(coupCritique){
			base += arme.getTemplate().getBonusCC();
		}
		base *= (1 + (maitrise / 100));  //maitrise étant un beau pourcent comme 10, 15, 20, 25, 30, 35%
		base *= caster.getClasse().getWeaponDamageMultiplicator(arme.getTemplate().getType()) / 100;
		base *= (1 + ((carac + domPercent)/ 100)); 
		base += dom;
		return base;
	}
	
	/**
	 * Retourne le nombre de dommages de bases infligés au target avec le sort sans compter les résists ni renvois.
	 */
	@Override
	public int calculateDamageOnTargetBySpell(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		EffectsManager em = caster.getServer().getEffectsManager();
		int base = e.getParams().isJet() ? e.getJet().getValue() : 
		      em.hasBrokle(target) ? e.getDice().getBestShot() :   //Brokle
		      em.hasPoisse(caster) ? e.getDice().getWorstShot() :  //Poisse
		      e.getDice().getRandomShot();
		int carac = Math.max(0, caster.getStatistique().getValue(e.getEffectType(em).getCharacType().get(), TOTAL));//stat
		int domPercent = Math.max(0, caster.getStatistique().getValue(DOM_FACTOR.get(), TOTAL)); //Les +dommages %
		int dom = Math.max(0, caster.getStatistique().getValue(DOM.get(), TOTAL)); //Les +dommages
		base *= (1 + ((carac + domPercent)/ 100)); 
		base += dom;
		/*
		 Pour brokle et poisse: 
		 D'abord c'est toujours l'effet brokle qui domine en premier.
		 Si le caster a poisse, le caster infligera le minimum de dommages au target
		 Si le target a brokle, le caster infligera le maximum de dommages au target
		 
		 Si le target a poisse, ils ne verront aucune différence.
		 Si le caster a brokle, ils ne verront aucune différence.
		 */
		
		return base;
	}
	
	
	/**
	 * Retourne le nombre de dommages qui seront à déduire (resists) du nombre de dommages de bases infligés au target.
	 * <br> Donc de combien il a résisté, réduit les dommages de base.
	 * @param dommages - Les dommages de base infligés au target 
	 */
	@Override
	public int calculateResistances(GEffect e, CombativeCharacter caster, CombativeCharacter target, int dommages){
		//Réduction par protection = Entier [ Réduction × (100 + Entier[Intelligence / 2] + Entier[Caractéristique / 2]) / 100 ]
		//  |-->  http://forum.dofus.com/fr/1028-sujets-fermes/412436-nouveau-calcul-armure&page=1
		EffectsManager em = caster.getServer().getEffectsManager();
		int base = dommages;
		int charac = Math.max(0, target.getStatistique().getValue(e.getEffectType(em).getCharacType().get(), TOTAL));
		int intel = Math.max(0, target.getStatistique().getValue(INTELLIGENCE.get(), TOTAL));
		boolean pvp = false;//TODO caster.getFight().type == FightType.PVP.get();
		CharacteristicType[] resists = null;
		switch(e.getEffectType(em).getCharacType()){
			case FORCE:
				resists = pvp ? earthResistancesPvp : earthResistances;
				break;
			case INTELLIGENCE:
				resists = pvp ? fireResistancesPvp : fireResistances;
				break;
			case CHANCE:
				resists = pvp ? waterResistancesPvp : waterResistances;
				break;
			case AGILITE:
				resists = pvp ? airResistancesPvp : airResistances;
				break;
			default:
				if(e.getEffectType(em).isNeutralAttack()){
					resists = pvp ? neutralResistancesPvp : neutralResistances;
					break;
				}
				return 0;
		} 
		int protectionSpellResisted = 0;
		/*int protectionSpellResisted = (int)Math.floor(
		(	
			target.getStatistique().getValue(resists[1].get(), BOOST) *
			(100 + (charac/2) + (intel/2))
		)
		/100);	*/
		if(target.getBuffs() != null){
			for(GBuff buff : target.getBuffs()){
				if(em.isElementalArmorEffect(buff)){
					int spellID = Integer.parseInt(buff.getSpecialArg());
					short characID = caster.getServer().getConfig().getArmorSpellCharacType(spellID);
					if(characID == 0) continue;
					charac = Math.max(0, target.getStatistique().getValue(characID, TOTAL));
					protectionSpellResisted += (int)Math.floor(buff.getJet().getValue() * (100 + (charac/2) + (intel/2)))/100;
				}else if(em.isNormalArmorEffect(buff)){
				
				}
			}
		}
		if(protectionSpellResisted != 0){
			SM.Messages.MM(caster.getMap(), target.getName()+" a réduit (par armures) les dommages de "+protectionSpellResisted+".", Constants.COLOR_GREEN);
		}
		
		base -= target.getStatistique().getValue(resists[1].get(), EQUIPEMENT);//resFixe
		if(e.getEffectType(em).getCharacType() == FORCE){//résistances physiques
			base -= target.getStatistique().getValue(RESISTANCE_DOM_PHYSIQUE.get(), EQUIPEMENT);	
		}else{//résistances magiques 
			base -= target.getStatistique().getValue(RESISTANCE_DOM_MAGIQUE.get(), EQUIPEMENT);		
		}
		base -= (base * (target.getStatistique().getValue(resists[0].get(), EQUIPEMENT) / 100));//res%
		base -= protectionSpellResisted;//résistance d'armures féca, momification, etc
		
		return dommages - base;//Dommages = originaux. Base = domréduits.  Différence = combien de résisté
	}
	
	/**
	 * Retourne de combien un target renvoi des dommages.
	 */
	@Override
	public int calculateRenvoi(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		//int base = e.getParams().isJet() ? e.getJet().getValue() : //Renvoi par les sorts (Contre)
		//      EffectsManager.hasBrokle(target) ? e.getDice().getBestShot() :   //Brokle
		//      EffectsManager.hasPoisse(caster) ? e.getDice().getWorstShot() :  //Poisse
		//      e.getDice().getRandomShot();
		int sort = Math.max(0, target.getStatistique().getValue(DOM_RENVOI.get(), BOOST));//Renvoi par les sorts (Contre)
		int equip = Math.max(0, target.getStatistique().getValue(DOM_RENVOI.get(), EQUIPEMENT));//Renvoi par les équips (Prespic pano)
		int sage = Math.max(0, target.getStatistique().getValue(SAGESSE.get(), TOTAL));//Sagesse
		return (sort * (1 + (sage / 100))) + equip;
	}
	
	@Override
	public int calculateHeal(GEffect e, CombativeCharacter caster, CombativeCharacter target){
		EffectsManager em = caster.getServer().getEffectsManager();
		int base = e.getParams().isJet() ? e.getJet().getValue() : 
		      em.hasBrokle(target) ? e.getDice().getBestShot() :   //Brokle
		      em.hasPoisse(caster) ? e.getDice().getWorstShot() :  //Poisse
		      e.getDice().getRandomShot();
		int soin = Math.max(0, target.getStatistique().getValue(SOIN.get(), TOTAL));//Les +soins
		int intel = Math.max(0, target.getStatistique().getValue(INTELLIGENCE.get(), TOTAL));//Intelligence
		return (base * (1 + (intel / 100))) + soin;
	}

	@Override
	public boolean calculateCoupCritique(double tauxCC, GStatistiques stats){
		/*Formule de l'officiel dans le client dans le GameManager:
		 _loc1.getCriticalHitChance = function (nDice)
	    {
	        if (nDice == 0)
	        {
	            return (0);
	        } // end if
	        var _loc3 = Math.max(0, this.api.datacenter.Player.CriticalHitBonus);
	        var _loc4 = Math.max(0, this.api.datacenter.Player.AgilityTotal);
	        nDice = nDice - _loc3;
	        if (_loc4 != 0)
	        {
	            nDice = Math.min(nDice, Number(nDice * (Math.E * 1.100000E+000 / Math.log(_loc4 + 12))));
	        } // end if
	        return (Math.floor(Math.max(nDice, 2)));
	    };
		 */
		int agi = Math.max(0, stats.getValue(AGILITE.get(), TOTAL));
		int cc = Math.max(0, stats.getValue(COUP_CRITIQUE.get(), TOTAL));
		tauxCC -= cc;
		tauxCC = Math.min(tauxCC, tauxCC * Math.E * 1.100000E+000 / Math.log(agi + 12) );
		if(1 + (int)( Randomizer.nextInt() * tauxCC ) == 1){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean calculateEchecCritique(double tauxEC, GStatistiques stats){
		int ec = Math.max(0, stats.getValue(ECHEC_CRITIQUE.get(), TOTAL));
		tauxEC -= ec;
		if(1 + (int)( Randomizer.nextInt() * tauxEC ) == 1){
			return true;
		}
		return false;
	}

	@Override  //Donne le niveau de maitrise en fonction de l'xp
	public int calculateMaitriseLevel(GPersonnage p){
		GItem arme = p.getInventory().getItemByPosition(Enums.ItemPosition.POS_arme.get());
		CharacteristicType ct = CItems.getWeaponMaitriseType(arme);
		if(ct == null){
			return 0;
		}
		short xp = p.getStatistique().getValue(ct.get(), CharacteristicColumn.BASE);
		//Short.MAX_VALUE == 32767
		//TODO faire une formule quadratique pour les paliers d'xp des matrises.
		//-> Trouvé une pas pire formule pour l'xp des maîtrises: xp = (lvl^2 + 6*lvl + 9) / 0,09
		//-> pareil que : lvl = 0.3*(xp^0.5)-3
		int lvl = (int) ((Math.sqrt(xp)*0.3)-3);
		lvl = Math.max(0, lvl);
		lvl = Math.min(lvl, 50);
		return lvl;
	}
	
	/**
	 * Calcule l'Xp gagnée en combat {xp,guild,mount,honnor,dishonnor} 
	 */
	public long[] calculateXpGain(FightEndEvent fee, CombativeCharacter c){
		GFight f = c.getFight();
		if(f == null){
			return null;
		}
		double xp = 0;
		double guildXp = 0;
		double mountXp = 0;
		double honnor = 0;
		double dishonnor = 0;
		double teamBonus = calculateTeamXpCoefficient(fee.getFight().getCharacterTeam(c));
		
		
		return new long[]{(long) xp,(long) guildXp,(long) mountXp,(long) honnor,(long) dishonnor};
	}
	
	/**
	 * Coefficient bonus d'XP quand on est en groupe. 
	 */
	private double calculateTeamXpCoefficient(FightTeam ft){
		double bonus = 0.0;
		int nbrSign = ft.size();//Nombre significatif de joueur dans le calcul du bonus http://forums.jeuxonline.info/showthread.php?t=754473#Coefficient d’XP en groupe
		Comparator <CombativeCharacter> co = new Comparator<CombativeCharacter>(){
			@Override
			public int compare(CombativeCharacter o1, CombativeCharacter o2) {
				if(o1.getLevel() > o2.getLevel()){
					return 1;
				}
				return 0;
			}
		};
		CombativeCharacter best = CollectionQuery.from(ft).best(co);
		for(CombativeCharacter cc : ft){
			if(cc.getLevel() < Math.floor( 1 + ( best.getLevel() / 3 ) ) ){
				nbrSign--;
			}
		}
		switch(nbrSign){
			case 0: bonus = 0.5; break;
			case 1: bonus = 1.0; break;
			case 2: bonus = 1.1; break;
			case 3: bonus = 1.5; break;
			case 4: bonus = 2.3; break;
			case 5: bonus = 3.1; break;
			case 6: bonus = 3.6; break;
			case 7: bonus = 4.2; break;
			case 8: bonus = 4.7; break;
		}
		return bonus;
	}
	
	
	
	/*  De Shivas, Thx Blackrush, dans package org.shivas.core.core.castables.effects :
	 [DamageEffect]
	 public static int computeDamage(Dice dice, Statistics statistics, SpellEffectTypeEnum effect){
        int base       = dice.roll(),
            charac     = statistics.get(effect.toCharacteristicType()).safeTotal(),
            domPercent = statistics.get(CharacteristicType.DamagePer).safeTotal(),
            dom        = statistics.get(CharacteristicType.Damage).safeTotal();

        return base * (100 + charac + domPercent) / 100 + dom;
    }

    public static int computeResistance(Statistics statistics, SpellEffectTypeEnum effect){
        int resNeutral = statistics.get(CharacteristicType.ResistanceNeutral).total(),
            res = effect == SpellEffectTypeEnum.DamageNeutral ? 0 : statistics.get(effect.toResistanceCharacteristicType()).total(),
            charac = statistics.get(effect.toCharacteristicType()).safeTotal(),
            characInt = statistics.get(CharacteristicType.Intelligence).safeTotal();

        return (resNeutral + res) * Math.max(1 + charac / 100, 1 + charac / 200 + characInt / 200);
    }
		
	 
	[HealEffect]
	public static int computeRegen(Dice dice, Statistics statistics){
        return dice.roll() *
                (100 + statistics.get(CharacteristicType.Intelligence).safeTotal()) / 100 +
                statistics.get(CharacteristicType.HealPoints).safeTotal();
    }
	 */
	
	
	
	
}
