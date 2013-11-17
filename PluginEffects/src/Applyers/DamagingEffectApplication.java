package Applyers;

import pack.Application;
import pack.EffectsMain;
import pack.SpellEffectType;
import Abstractions.AbstractCharacter;
import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.CharacterType;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import Misc.Jet;
import Misc.ParameterHolder;
import Plugins.Interfaces.IEffectType;

public class DamagingEffectApplication extends Application {

	public DamagingEffectApplication(EffectsMain main) {
		super(main);
	}

	@Override
	public void apply(GEffect e, IEffectType et, AbstractCharacter caster, AbstractCharacter target, ParameterHolder ph, CombativeCharacter castercombat, CombativeCharacter targetcombat){
		
		if(targetcombat == null) return;
		
		/** result[0] = damageDone */
		int[] result = (ph != null && ph.item != null) ?
					main.pm.getFormulingManager().calculateDamageOnTargetByWeaponWithResists((GItem)ph.item, e, castercombat, targetcombat, (Boolean)ph.coupCritique) 
					:
					main.pm.getFormulingManager().calculateDamageOnTargetBySpellWithResists(e, castercombat, targetcombat);

			boolean dead = false;
			//Syn.d("targetcombat.getStatistique() = "+(targetcombat.getStatistique()));
			if(targetcombat.getStatistique().getPdv() <= result[0]){
				Syn.d("passed effect, damage > target.pdv");
				dead = true;
				result[0] = targetcombat.getStatistique().getPdv();
				
			}
			//targetcombat.getStatistique().decrementPdv(result[0]);
			//targetcombat.getStatistique().decrementValue(CharacteristicType.LIFE_POINTS, (short) result[0], CharacteristicColumn.BASE);
			targetcombat.getStatistique().decrementPdv(result[0], targetcombat);
			
			//Syn.d("passed effect checks decremented pdv");
			if(result[1] > 0){
				Syn.d("passed effect going to reduce damages");
				//SM.Messages.MM(caster.getMap(), targetcombat.getName()+" a réduit (au total) les dommages de "+result[1]+".", Constants.COLOR_GREEN);
				GAction aReduce = targetcombat.getServer().getActionsManager().getFactory().newReduceDamageAction(targetcombat, result[1]);
				if(castercombat.getCharacterType() == CharacterType.PLAYER){
					((GPersonnage)castercombat).addAction(aReduce);
				}
				SM.Game.GA_LAYER(castercombat, aReduce);
			}
			if(result[2] > 0 && e.getEffectID() != SpellEffectType.RETURN_X_DAMAGES.getID()){
				//on peut pas renvoyer des renvois quand même ! :D
				//Syn.d("passed effect going to RETURN_X_DAMAGES");
				GEffect e2 = new GEffect();
				e2.setEffectID(SpellEffectType.RETURN_X_DAMAGES.getID());
				e2.setJet(new Jet((short) result[2]));
				apply(e2, targetcombat, caster, ph);
			}
			//Syn.d("passed effect going to newPdvChangedAction");
			
			GAction aPdv = main.pm.getActionsManager().getFactory().newPdvChangedAction(targetcombat, -result[0]);
			if(caster.getCharacterType() == CharacterType.PLAYER){
				((GPersonnage)caster).addAction(aPdv);
			}
			SM.Game.GA_LAYER(caster, aPdv);
			//SM.Messages.MM(caster.getMap(), targetcombat.getName()+" a subit une perte de "+result[0]+" pdv.", Constants.COLOR_GREEN);
			
			if(dead){
				//SM.Messages.MM(caster.getMap(), targetcombat.getName()+" est mort !", Constants.COLOR_GREEN);
				GAction aKill = caster.getServer().getActionsManager().getFactory().newKillAction(castercombat, targetcombat);
				if(caster.getCharacterType() == CharacterType.PLAYER){
					((GPersonnage)caster).addAction(aKill);
				}
				SM.Game.GA_LAYER(castercombat, aKill);
				GFight f = castercombat.getFight();
				f.onKilledCharacter();//si tout le monde est mort/teamvide : set le state à FINISHED
																		// : et .finish(f) le Scheduler
			}
			//TODO send packets...
			
	}
		
		
	
	
}
