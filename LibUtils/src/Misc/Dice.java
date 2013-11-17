package Misc;

import Interfaces.IEffectParam;



public class Dice implements IEffectParam{

	private short numberOfDices = 1;
	private short numberOfFaces = 1;
	private short baseBoost = 1;
	
	public Dice(short numberOfDices, short numberOfFaces, short baseBoost){
		//Syn.d("Dice constructor params :"+numberOfDices+"d"+numberOfFaces+"+"+baseBoost);
		setNumberOfDices(numberOfDices);
		setNumberOfFaces(numberOfFaces);
		setBaseBoost(baseBoost);
	}

	/**
	 * Le premier chiffre dans le 0d0+0.  Le nombre de dés.
	 */
	public void setNumberOfDices(short numberOfDices) {
		this.numberOfDices = numberOfDices;
	}
	/**
	 * Le premier chiffre dans le 0d0+0.  Le nombre de dés.
	 */
	public short getNumberOfDices() {
		return numberOfDices;
	}
	/**
	 * Le deuxieme chiffre dans le 0d0+0.  Le nombre de faces sur les dés.
	 */
	public void setNumberOfFaces(short numberOfFaces) {
		this.numberOfFaces = numberOfFaces;
	}
	/**
	 * Le deuxieme chiffre dans le 0d0+0.  Le nombre de faces sur les dés.
	 */
	public short getNumberOfFaces() {
		return numberOfFaces;
	}
	/**
	 * Le troisieme chiffre dans le 0d0+0.  Le nombre de base qu'on ajoute au jet de dé.
	 */
	public void setBaseBoost(short baseBoost) {
		this.baseBoost = baseBoost;
	}
	/**
	 * Le troisieme chiffre dans le 0d0+0.  Le nombre de base qu'on ajoute au jet de dé.
	 */
	public short getBaseBoost() {
		return baseBoost;
	}
	/**
	 * Le troisieme chiffre dans le 0d0+0.  Le nombre de base qu'on ajoute au jet de dé. (En Hexadecimal)
	 */
	public String getBaseBoostHex() {
		return Integer.toHexString(baseBoost);
	}
	

	/**
	 * Envoie le pire jet qu'il pourrait arriver en Hexadecimal (JetMin)
	 */
	public String getWorstShotHex(){
		return Integer.toHexString(numberOfDices+baseBoost);
	}
	/**
	 * Renvoie le meilleur jet qu'il pourrait arriver en Hexadecimal (JetMax)
	 */
	public String getBestShotHex(){
		return Integer.toHexString((numberOfDices*numberOfFaces)+baseBoost);
	}
	/**
	 * Envoie le pire jet qu'il pourrait arriver (JetMin)
	 */
	public int getWorstShot(){
		return (numberOfDices+baseBoost);
	}
	/**
	 * Renvoie le meilleur jet qu'il pourrait arriver (JetMax)
	 */
	public int getBestShot(){
		return ((numberOfDices*numberOfFaces)+baseBoost);
	}
	/**
	 * Renvoie un jet complètement aléatoire.
	 */
	public int getRandomShot(){
		short total = 0;
		for(short i = numberOfDices; i-->0;){
			//Les trois marchent, mais j'aime plus la derniere solution
			total += (Math.floor(Math.random() * numberOfFaces)+1);
		}
		return (total + baseBoost);
	}

	/**
	 * Renvoie le jet de dé sous forme de string. Ex: 1d50+150  
	 * <p>KEEPEYE: Pourrait causer probleme si y'a une valeur négative :s . 
	 */
	@Override
	public String getString() {
		if(baseBoost >= 0){
			return getNumberOfDices()+"d"+getNumberOfFaces()+"+"+this.getBaseBoost();
		}else{
			return getNumberOfDices()+"d"+getNumberOfFaces()+"-"+this.getBaseBoost();
		}
	}

	public void incrementBaseBoost() {
		baseBoost++;
	}
	public void decrementBaseBoost() {
		baseBoost++;
	}

	@Override
	public boolean isDice() {
		return true;
	}

	@Override
	public boolean isJet() {
		return false;
	}

	@Override
	public Jet getJet() {
		return null;
	}

	@Override
	public Dice getDice() {
		return this;
	}
	
}
