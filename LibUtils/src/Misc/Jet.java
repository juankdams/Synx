package Misc;

import Interfaces.IEffectParam;

public class Jet implements IEffectParam{

	
	private short value = 0;

	public Jet(short value){
		this.value = value;
	}
	
	
	public void setValue(short value) {
		this.value = value;
	}

	public short getValue() {
		return value;
	}
	
	public String getValueHex(){
		return Integer.toHexString(value);
	}

	@Override
	public String getString() {
		return Integer.toHexString(value);
	}

	@Override
	public boolean isDice() {
		return false;
	}

	@Override
	public boolean isJet() {
		return true;
	}
	
	@Override
	public Jet getJet(){
		return this;
	}

	@Override
	public Dice getDice() {
		return null;
	}
	
	
}
