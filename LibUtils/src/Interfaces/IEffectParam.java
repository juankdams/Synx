package Interfaces;

import Misc.Dice;
import Misc.Jet;

public interface IEffectParam {

	public String getString();
	
	public boolean isDice();
	public boolean isJet();

	public Jet getJet();
	public Dice getDice();
	
}
