package Enums;

import Core.Exceptions;
import Core.Syn;
import Misc.Randomizer;

public enum Orientation {

	
	EAST(0),
	SOUTH_EAST(1),
	SOUTH(2),
	SOUTH_WEST(3),
	WEST(4),
	NORTH_WEST(5),
	NORTH(6),
	NORTH_EAST(7);
	

	private static Orientation[] diagonals = new Orientation[]{SOUTH_EAST, SOUTH_WEST, NORTH_WEST, NORTH_EAST};
	private static Orientation[] orthogonals = new Orientation[]{EAST, SOUTH, WEST, NORTH};
	private static Orientation[] orientationsForCircleZone = new Orientation[]{NORTH_EAST, SOUTH, WEST, NORTH, EAST};
	
	private byte value;
	private Orientation(int value) {
		this.value = (byte)value;
	}
	public byte getValue() {
		return value;
	}

	public byte getNextOrientation(){
		if((value + 1) > NORTH_EAST.getValue()){
			Syn.log.error("Problem dans OrientationEnum.getNextOrientation: la direction de base + 1 est plus haut que 7, donc en haut de l'Orientation maximale. Ce qui fait un tour complet (ClockWise) et on renvoie EAST");
			return EAST.getValue();
		}
		return ++value;//Donc si on visait l'EAST, ca donne le SOUTH_EAST
	}
	public byte getPreviousOrientation(){
		if((value - 1) < EAST.getValue()){
			Syn.log.error("Problem dans OrientationEnum.getNextOrientation: la direction de base - 1 est plus bas que 0, donc en bas de l'Orientation minimale. Ce qui fait un tour complet (CounterClockWise) et on renvoie NORTH_EAST");
			return NORTH_EAST.getValue();
		}
		return --value;//Donc si on visait le SOUTH_EAST, ca donne l'EAST
	}
	public boolean isDiagonal(){
		if(SOUTH_EAST == this || SOUTH_WEST == this || NORTH_WEST == this || NORTH_EAST == this){
			return true;
		}
		return false;
	}
	public boolean isVertical(){
		if(SOUTH.getValue() == value || NORTH.getValue() == value){
			return true;
		}
		return false;
	}
	public boolean isHorizontal(){
		if(WEST.getValue() == value || EAST.getValue() == value){
			return true;
		}
		return false;
	}
	public Orientation toDiagonal(){
		if(isDiagonal()){
			return this;
		}
		return getOrientation(++value);//Donc si on visait l'EAST, ca donne le SOUTH_EAST
	}
	public Orientation toOrthogonal(){
		if(isVertical() || isHorizontal()){
			return this;
		}
		if(NORTH_EAST.value == value){
			return EAST;
		}
		return getOrientation(--value);//Donc si on visait l'EAST, ca donne le SOUTH_EAST
	}
	
	
	
	
	
	
//PARTIE STATIQUE ---------------------------------------------------------------------------------------------	
	
	
	
	
	
	public static Orientation getOrientation(byte orientation){
		for(Orientation ce : Orientation.values()){
			if(ce.value == orientation){
				return ce;
			}
		}
		Exceptions.throwNullPointerException("OrientationEnum.getOrientation(byte) : orientation non trouvée : orientation demandé: ("+orientation+") invalide.");
		return null;
	}

	public static byte getDefaultOrientation(){
		return SOUTH_EAST.getValue();
	}
	public static byte getNextOrientation(byte dir){
		if((dir + 1) > NORTH_EAST.getValue()){
			Syn.log.error("Problem dans OrientationEnum.getNextOrientation: la direction de base + 1 est plus haut que 7, donc en haut de l'Orientation maximale. Ce qui fait un tour complet (ClockWise) et on renvoie EAST");
			return EAST.getValue();
		}
		return ++dir;//Donc si on visait l'EAST, ca donne le SOUTH_EAST
	}
	public static byte getPreviousOrientation(byte dir){
		if((dir - 1) < EAST.getValue()){
			Syn.log.error("Problem dans OrientationEnum.getNextOrientation: la direction de base - 1 est plus bas que 0, donc en bas de l'Orientation minimale. Ce qui fait un tour complet (CounterClockWise) et on renvoie NORTH_EAST");
			return NORTH_EAST.getValue();
		}
		return --dir;//Donc si on visait le SOUTH_EAST, ca donne l'EAST
	}
	public static boolean isDiagonal(byte value){
		if(SOUTH_EAST.getValue() == value || SOUTH_WEST.getValue() == value || NORTH_WEST.getValue() == value || NORTH_EAST.getValue() == value){
			return true;
		}
		return false;
	}
	public static boolean isVertical(byte value){
		if(SOUTH.getValue() == value || NORTH.getValue() == value){
			return true;
		}
		return false;
	}
	public static boolean isHorizontal(byte value){
		if(WEST.getValue() == value || EAST.getValue() == value){
			return true;
		}
		return false;
	}
	
	public static Orientation getRandom(){
		int rand = Randomizer.nextInt(7);
		return getOrientation((byte) rand);
	}
	
	/**
	 * SOUTH_EAST, <br>SOUTH_WEST, <br>NORTH_WEST, <br>NORTH_EAST
	 */
	public static Orientation[] getDiagonals() {
		return diagonals;
	}
	/**
	 * EAST, <br>SOUTH, <br>WEST, <br>NORTH
	 */
	public static Orientation[] getOrthogonals() {
		return orthogonals;
	}
	/**
	 * NORTH_EAST, <br>SOUTH, <br>WEST, <br>NORTH, <br>EAST
	 */
	public static Orientation[] getCircleZoneOrientations(){
		return orientationsForCircleZone;
	}
	
}
