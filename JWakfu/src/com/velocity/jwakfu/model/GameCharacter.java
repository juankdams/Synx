package com.velocity.jwakfu.model;


public class GameCharacter {
	
	private long id;
	private int idType;
	private long owner;
	private Breed breed;
	private Appearance appearance;
	private long xp;
	private Nation nation;
	private String name;
	
	public GameCharacter(String name, long id, int idType, long owner, Breed breed, long xp, Nation nation, Appearance appearance) {
		this.name = name;
		this.id = id;
		this.idType = idType;
		this.owner = owner;
		this.breed = breed;
		this.xp = xp;
		this.nation = nation;
		this.appearance = appearance;
	}
	
	public String getName() {
		return name;
	}
	
	public long getId() {
		return id;
	}
	
	public int getIdType() {
		return idType;
	}
	
	public long getOwner() {
		return owner;
	}
	
	public Breed getBreed() {
		return breed;
	}
	
	public long getXP() {
		return xp;
	}
	
	public Nation getNation() {
		return nation;
	}

	public Appearance getAppearance(){
		return appearance;
	}
}