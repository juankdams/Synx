package GameObjects;

import Abstractions.CombativeCharacter;

public class GInvocation extends GMonster {

	private CombativeCharacter owner = null; //Le combattant qui a invoqué cette invoquation. Soit un perso ou un monstre, etc.

	public void setOwner(CombativeCharacter owner) {
		this.owner = owner;
	}
	public CombativeCharacter getOwner() {
		return owner;
	}
	



}
