package Misc;

import java.util.Stack;

import GameObjects.GAction;

public class Sequencer<E> extends Stack<Object> { 
	private static final long serialVersionUID = 1L;

	private Class<?> type = null;
	private boolean isBlocked = false;
	
	public Sequencer(Class<?> type){
		this.type = type;
	}
	
	
	/**
	 * isBlocked veut dire qu'on ne peut plus ajouter de nouveaux éléments au Sequencer
	 */
	public boolean isBlocked(){
		return isBlocked;
	}
	/**
	 * isBlocked veut dire qu'on ne peut plus ajouter de nouveaux éléments au Sequencer
	 */
	public void setBlocked(boolean blocked){
		this.isBlocked = blocked;
	}
	
	/**
	 * Exécute tous les éléments restants dans le Sequencer.
	 * To Override
	 */
	public void flush(){
		//to override
	}
	
}
