package Zen.IAInterface.IA;

import Crystal.Perfs;
import common.Pathfinding;
import common.Zen;

import objects.Fight;
import objects.Fight.Fighter;


public class IAAttaqueur extends IAModel.StaticMethods implements IAModel{

	
	@Override
	public void load(Fight fight) {
		//this.mob = fight.getCurFighter();
		//this.fight = fight;
		this.start(fight);
	}

	@Override
	public void start(Fight fight) {
		Perfs p = new Perfs();
		Fighter mob = null;
		//v parce que le curFighter pourrait changer nimporte quand � cause des bugs de task sur le gamethread
		if(fight.getCurFighter().getMob() != null || fight.getCurFighter().getPerco() != null || fight.getCurFighter().isDouble()){
			mob = fight.getCurFighter();
		}
		int targets[] = getReachableTargets(getUsuableSpells(mob, fight), mob, fight);
		String spells = getUsuableSpells(mob, fight);
		boolean isNextToAnEnnemy = false;
		
		debug("spells :"+spells);
			String targetss = "";
			for(int i : targets){ targetss += (i+";"); }
		debug("targets :"+targetss);
		
		
		//-> Probabilit� plus fr�quente darriver plac�e en premier 
		//    aide le cache prefetch � deviner ce qui s'en vient et 
		//     augmente la vitesse dex�cution
		if(targets != null && targets.length != 0){     
			//attack/moveToAttack
			int bestTarget = bestTarget(fight, spells, targets);
			//Si yes pas au cac du best, vas y
			if(Pathfinding.isNextTo(bestTarget, mob.get_fightCell().getID()) == false){
				moveForwardsTo(fight, bestTarget);
			}
			//Mtn qu'il est au cac, attack le bestTarget
			attack(fight, spells, fight.get_map().getCase(bestTarget).getFirstFighter());
			//update les spells dispo
			spells = getUsuableSpells(mob, fight);
			//update les targets dispo
			targets = getReachableTargets(spells, mob, fight);
		}else{
			//advance
			moveForwards(fight);
		}
		int i = 0;
		if(targets != null && targets.length != 0){    
			while((mob.getCurPA(fight) != 0 || mob.getCurPM(fight) != 0) && (targets != null && targets.length != 0)){    
				//tant qui peut faire dequoi...:
				//Si yes au cac avec un ennemi, qui bouge pas de l� � la fin.
				Zen.debug("while "+(++i));
				int bestTarget = bestTarget(fight, getUsuableSpells(mob, fight), targets);
				//Si yes pas au cac du best, vas y
				if(Pathfinding.isNextTo(bestTarget, mob.get_fightCell().getID()) == false){
					moveForwardsTo(fight, bestTarget);
				}
				//Mtn qu'il est au cac, attack le bestTarget
				attack(fight, spells, fight.get_map().getCase(bestTarget).getFirstFighter());
				//update les spells dispo
				spells = getUsuableSpells(mob, fight);
				//update les targets dispo
				targets = getReachableTargets(spells, mob, fight);
			}
			for(int cell : targets){
				if(Pathfinding.esSiguienteA(cell, mob.get_fightCell().getID(), fight.get_map())){
					isNextToAnEnnemy = true;
					break;
				}
			}
		}
		if(isNextToAnEnnemy == false && mob.getCurPM(fight) != 0){
			moveForwards(fight);
		}
		//*/
		//terminalisation
		spells = null;
		targets = null;
		p.stopTiming("IAAttaq mob : "+mob.getPacketsName());
		fight.endTurn();
		terminate();
		//*/
	}


	@Override
	public void terminate() {
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}


}
