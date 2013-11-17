package Misc;

import java.util.HashMap;

import GameObjects.GPersonnage;

public class LifeRegenerator {

	private HashMap<GPersonnage, Long> persos = null;

	//private HashMap<GPersonnage, ScheduledFuture> persolist = null;
	
	/**
	 * Ajoute un perso à l'HashMap et set son temps de départ à System.currentTimeMillis();
	 * @param p
	 */
	public void addPerso(GPersonnage p){
		if(persos == null){
			persos = new HashMap<GPersonnage, Long>();
		}
		persos.put(p, System.currentTimeMillis());
	}
	/**
	 * Ajoute un perso à l'HashMap et set son temps de départ à System.currentTimeMillis();
	 * @param p
	 * /
	public void addPerso2(GPersonnage p){
		if(persos == null){
			persolist = new HashMap<GPersonnage, ScheduledFuture>();
		}
		persos.put(p, System.currentTimeMillis());
	}*/
	
	/**
	 * Renvoie le nombre de pdv gagnés (2/s) ou 0 si le perso n'était pas dans l'HashMap 
	 */
	public short removePerso(GPersonnage p){
		if(persos == null){
			persos = new HashMap<GPersonnage, Long>();
			return 0;
		}
		if(persos.get(p) == null){
			return 0;
		}
		long life = persos.remove(p);
		if(persos.size() == 0){
			persos = null;
		}
		return (short) ((System.currentTimeMillis()-life)/500);
	}
	/*
	public void regenerate(){
		if(persos != null){
			if(persos.size() == 0){
				persos = null;
			}else{
				for(Entry<GPersonnage, Long> e : persos.entrySet()){
					if(e.getKey().getStatistique().incrementPdv(1)){
						e.setValue(e.getValue()+1);
						Envoie un dernier packet As s'il est rendu au max.
						if(e.getKey().getStatistique().getPdv() == e.getKey().getStatistique().getPdvMax()){
							SM.Account.As(e.getKey().getClient().getSession(), e.getKey());
						}
					}
				}
			}
		}
	}*/
	
	
}
