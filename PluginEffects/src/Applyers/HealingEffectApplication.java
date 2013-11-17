package Applyers;

import pack.Application;
import pack.EffectsMain;
import Abstractions.AbstractCharacter;
import Abstractions.CombativeCharacter;
import Enums.CharacterType;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GPersonnage;
import Misc.ParameterHolder;
import Plugins.Interfaces.IEffectType;

public class HealingEffectApplication extends Application {

	public HealingEffectApplication(EffectsMain main) {
		super(main);
	}


	@Override
	public void apply(GEffect e, IEffectType et, AbstractCharacter caster, AbstractCharacter target, ParameterHolder ph, CombativeCharacter castercombat, CombativeCharacter targetcombat){
		
		if(targetcombat == null) return;
		int heal = main.pm.getFormulingManager().calculateHeal(e, castercombat, targetcombat);
		if(targetcombat.getStatistique().getPdv() <= heal){
			heal = targetcombat.getStatistique().getPdv();
		}
		targetcombat.getStatistique().incrementPdv(heal, targetcombat);

		GAction aPdv = main.pm.getActionsManager().getFactory().newPdvChangedAction(targetcombat, heal);
		if(caster.getCharacterType() == CharacterType.PLAYER){
			((GPersonnage)caster).addAction(aPdv);
		}
		SM.Game.GA_LAYER(caster, aPdv);
		//SM.Messages.MM(caster.getMap(), targetcombat.getName()+" a regagné "+heal+" pdv.", Constants.COLOR_GREEN);
		//TODO send packets...
		//et = SpellEffectType.NO_EFFECT;//permet de passer le switch jusqu'en bas.
	}
	
	

}
