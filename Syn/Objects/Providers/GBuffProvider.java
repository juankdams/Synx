package Providers;

import GameObjects.GBuff;
import GameObjects.GBuff.BuffApplicationType;
import GameObjects.GEffect;
import Interfaces.IProvider;
import Misc.Dice;
import Misc.Jet;
import Plugins.Interfaces.IEffectType;

public class GBuffProvider implements IProvider {
	

	/**
	 * Créé un buff à partir d'un effet.
	 */
	public GBuff createNew(GEffect e, byte remainingTurns, byte applicationMode){
		GBuff b = new GBuff();
		b.setEffectID(e.getEffectID());
		b.setSpecialArg(new String(e.getSpecialArg()));
		if(e.getParams().isDice()){
			b.setDice(new Dice(e.getDice().getNumberOfDices(), e.getDice().getNumberOfFaces(), e.getDice().getBaseBoost()));
		}else if(e.getParams().isJet()){
			b.setJet(new Jet(e.getJet().getValue()));
		}
		b.setApplicationMode(applicationMode);
		b.setRemainingTurns(remainingTurns);
		b.setNumberOfTurns(b.getRemainingTurns());
		return b;
	}
	/**
	 * Créé un buff à partir d'un effet (Pareil que l'autre createNew(geffect..), mais en utilisant une enum au lieu d'un byte).
	 */
	public GBuff createNew(GEffect e, byte remainingTurns, BuffApplicationType applicationMode){
		return createNew(e, remainingTurns, (byte)applicationMode.ordinal());
	}
	
	/**
	 * Pour créer un nouveau GBuff avec des stats précises (Du genre enlever 1 PA pour un tour lorsqu'on en utilise...)
	 */
	public GBuff createNew(IEffectType iet, Dice dice, Jet jet, byte remainingTurns, byte applicationMode){
		GBuff b = new GBuff();
		if(dice != null) b.setParams(dice);
		if(jet != null) b.setParams(jet);
		b.setEffectID(iet.getID());
		b.setSpecialArg(null);
		b.setApplicationMode(applicationMode);
		b.setRemainingTurns(remainingTurns);
		b.setNumberOfTurns(b.getRemainingTurns());
		return b;
	}
	/**
	 * Pour créer un nouveau GBuff avec des stats précises (Du genre enlever 1 PA pour un tour lorsqu'on en utilise...) 
	 * <br>
	 * (Pareil que l'autre createNew(effectType..), mais en utilisant une enum au lieu d'un byte).
	 */
	public GBuff createNew(IEffectType iet, Dice dice, Jet jet, byte remainingTurns, BuffApplicationType applicationMode){
		return createNew(iet, dice, jet, remainingTurns, (byte)applicationMode.ordinal());
	}
	

}
