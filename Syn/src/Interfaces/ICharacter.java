package Interfaces;


import ConfigurationObjects.Classe;
import Enums.CharacterType;

public interface ICharacter extends ISprite{


	/**Return le CharacterType du Character (Ex PLAYER, MONSTER, NPC,PRISM)*/
	public CharacterType getCharacterType();
	public Classe getClasse();
	//Pendant qu'jy pense, 
	//on pourrait appliquer un objet Classe aux Percepteurs et Prismes etc pour leur mettre leur sorts/stats. ?
	//Les monstres aussi c'pareil
	//Pareillement aux dragodindes pour leur stats, leurs pods (inventaire dd), les startitems quelles ont dans leur inventaire  
	//pour les pnj par contre cest inutile :/
	//Faudrait juste mettre un truc en config pour délimiter les ID des classes de personnage 
		//pour éviter les cheat à la création de perso. sinon ils pourraient envoyer un packet et avoir la classe prism sil veut
	
	public String getName();
	public byte getAlignementSpecialization();
	
	public int getColor1();
	public int getColor2();
	public int getColor3();
	public void setColor1(int color1);
	public void setColor2(int color2);
	public void setColor3(int color3);

	public String getAccessoriesPacket();
	
	/*
	public short getLevel();
	public void setLevel(short lvl);
	
	public PlayerState[] getStates();
	public PlayerState[] addState(PlayerState ps);
	/** Attention, ça return null si l'array[] ne contenait qu'un élément et qu'on l'enlève. 
	 * Peut mener à des NullPointerExceptions. * /
	public PlayerState[] removeState(PlayerState ps);
	public PlayerState[] setStates(PlayerState[] ps);
	public void setBuffs(ArrayList<GBuff> buffs);
	public ArrayList<GBuff> getBuffs();
	public GBuff getBuff(int effectID);
	public ArrayList<GBuff> addBuff(GBuff b);
	/** Attention, ça return null si l'array[] ne contenait qu'un élément et qu'on l'enlève. 
	 * Peut mener à des NullPointerExceptions. * /
	public ArrayList<GBuff> removeBuff(GBuff b);
	
	public GFight getFight();
	public GStatistiques getStatistique();
	*/
	
	
	
}
