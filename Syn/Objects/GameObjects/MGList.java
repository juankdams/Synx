package GameObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Abstractions.AbstractCharacter;
import ConfigurationObjects.Classe;
import Enums.CharacterType;
import GlobalObjects.Map;

public class MGList extends AbstractCharacter {
	
	public static enum MonsterGroupShape{
		CIRCLE(','),
		LINE(':');
		public char delimiterForSpritePacket = ' ';
		private MonsterGroupShape(char deli){
			delimiterForSpritePacket = deli;
		}
	}
	
	
	
	
	

	private ArrayList<GMonster> monsters = null;
	private ArrayList<GDrop> specialDrops = null;
	private short stars = 0;
	
	
	
	
	public MGList(int size){
		monsters = new ArrayList<GMonster>(size);
	}
	public MGList(int size, short stars, String drops[]){
		monsters = new ArrayList<GMonster>(size);
	}


	

	@Override
	public CharacterType getCharacterType() {
		return CharacterType.MONSTER_GROUP;
	}


	@Override
	public Classe getClasse() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public byte getAlignementSpecialization() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override @Deprecated
	public String getAccessoriesPacket() { return null; }

	@Override
	public String getSpritePacket(String prefix) {
		//Exemple de packet: GM|+369;2;1000;2;36,34;-3;11^150,1154^100;999,145;150,-1,-1;,2bf,,1d62,;-1,-1,-1;,,,,;
		/*
		   GM|+369;  //cellid
		   2;		//orientation
		   1000;	//bonus d'étoiles
		   2;		//id unique du groupesprite
		   36,34;	//templateID des monstres pour afficher leurs noms
		   -3;		//type de character: MONSTER_GROUP = -3
		   11^150,  1154^100;	//gfx1^size1 , gfx2^size2
		   999,145;  			//level1, level2
		   150,-1,-1;  ,2bf,,1d62,;	//colorsEnHex ; accessories (arme,coiffe,cape,familier,bouclier)->les ID des itemTemplates en Hex
		   -1,-1,-1;   ,,,,;  //colors et accessories du deuxieme monstre du groupe..
		 */
		StringBuilder sb = new StringBuilder(prefix)
		.append(this.getCellID())					.append(';')
		.append(this.getOrientation())				.append(';')
		.append(getStars())							.append(';')
		.append(this.getID())						.append(';')
		.append(this.getName())						.append(';')
		.append(this.getCharacterType().getType())	.append(';')
		.append(this.getGfxIDs())					.append(';')
		//.append(this.getSizeX() != DefaultCharacterSize ? "^"+this.getSizeX()+"x" : "")	.append(';')//scaleX
		//.append(this.getSizeY() != DefaultCharacterSize ? "^"+this.getSizeY() : "")		.append(';')//scaleY
		//.append(this.isNoFlip() ? "*" : "")			.append(';')
		.append(getLevels()).append(';')
		.append(getColorsAndAccessories())//.append(';')
		;
		return sb.toString();
	}
	

	@Override
	public String getName() {
		String str = "";
		for(GMonster m : this.monsters){
			if(str.length() > 0){
				str += ",";
			}
			str += m.getTemplateID();
		}
		return str;
	}
	
	public String getGfxIDs() {
		String str = "";
		for(GMonster m : this.monsters){
			if(str.length() > 0){
				str += ",";
			}
			str += m.getGfxID() + "^" + m.getSize();
		}
		return str;
	}
	
	public String getLevels() {
		String str = "";
		for(GMonster m : this.monsters){
			if(str.length() > 0){
				str += ",";
			}
			str += m.getLevel();
		}
		return str;
	}
	
	public String getColorsAndAccessories(){
		String str = "";
		for(GMonster m : this.monsters){
			if(str.length() > 0){
				str += ",";
			}
			str += (getColor1() == -1 ? "-1" : Integer.toHexString(getColor1()));
			str += ",";
			str += (getColor2() == -1 ? "-1" : Integer.toHexString(getColor2()));
			str += ",";
			str += (getColor3() == -1 ? "-1" : Integer.toHexString(getColor3()));
			str += ";";
			str += m.getAccessoriesPacket();
			str += ";";
		}
		return str;
	}
	
	/**
	 * Set les GDrops à partir des strings les représentant. (Drops qui ont été sauvegardés en bdd)
	 */
	public void setDrops(String[] drops) {
		if(drops != null && drops.length > 0 && drops[0].equals("") == false){
			specialDrops = new ArrayList<GDrop>(drops.length);
			for(int i = drops.length-1; i >= 0; i--){
				specialDrops.add(GDrop.createNew(drops[i], true));
			}
		}
	}
	
	/* *
	 *  À garder, pour set les drops aux monstres quand ils entrent en combat.
	 */
	/*public void setDrops(String[] drops) {
		if(monstersTemplates == null || monstersTemplates.size() == 0){
			return;
		}
		if(drops != null && drops.length > 0 && drops[0].equals("") == false){
			if(monstersTemplates.get(0).getDrops() == null || monstersTemplates.get(0).getDrops().length == 0){
				GDrop[] olddrops = monstersTemplates.get(0).getDrops();
				GDrop[] newdrops = new GDrop[drops.length + olddrops.length];
				for(int i = 0; i <= olddrops.length-1; i++){// 0 .... Old
					newdrops[i] = olddrops[i];
				}
				monstersTemplates.get(0).setDrops( newdrops );
			}else{
				monstersTemplates.get(0).setDrops( new GDrop[drops.length] );
			}
			
			for(int i = drops.length-1; i >= 0; i--){// New .... Old
				monstersTemplates.get(0).getDrops()[i] = GDrop.createNew(drops[i], true);
			}
		}
	}*/

	public void setStars(short stars) {
		this.stars = stars;
	}
	public short getStars() {
		return stars;
	}
	
	public void setSpecialDrops(ArrayList<GDrop> specialDrops) {
		this.specialDrops = specialDrops;
	}
	public ArrayList<GDrop> getSpecialDrops() {
		return specialDrops;
	}

	@Override
	public void onAddedToMap(Map m) {
		SM.Game.GM_ADD(this, m);
	}

	@Override
	public void onRemovedFromMap(Map m) {
		SM.Game.GM_REMOVE(m, getID());
	}

	@Override
	public void terminate() throws Throwable{
		// TODO Auto-generated method stub
		if(specialDrops != null){
			SQL.Monsters.saveInstance(this, getServer());
		}
		for(GMonster m : monsters){
			m.terminate();
		}
		monsters.clear();
		monsters = null;
		this.finalize();
	}


	
	
	
	
	
	
	
	// ==============     LIST   METHODS    ======================================================================
	

	public ArrayList<GMonster> get(){
		return monsters;
	}
	public GMonster getFirst(int ID, int grade){
		for(GMonster m : monsters){
			if(m.getTemplateID() == ID && m.getGrade() == grade){
				return m;
			}
		}
		return null;
	}
	public int indexOfFirst(int ID, int grade){
		for(int i = monsters.size()-1; i>=0; i--){
			if(monsters.get(i).getTemplateID() == ID && monsters.get(i).getGrade() == grade){
				return i;
			}
		}
		return -1;
	}
	public int indexOf(GMonster m){
		for(int i = monsters.size()-1; i>=0; i--){
			if(monsters.get(i).equals(m)){
				return i;
			}
		}
		return -1;
	}
	public ArrayList<GMonster> add(GMonster m){
		monsters.add(m);
		return monsters;
	}
	public ArrayList<GMonster> addAll(List<GMonster> m){
		monsters.addAll(m);
		return monsters;
	}
	public void clear(){
		monsters.clear();
	}
	public ArrayList<GMonster> set(List<GMonster> m){
		clear();
		addAll(m);
		return monsters;
	}
	public int size(){
		return monsters.size();
	}
	public GMonster remove(GMonster m){
		return monsters.remove( indexOf(m) );
	}
	public GMonster remove(int index){
		return monsters.remove( index );
	}
	
	// ===================  FIN LIST METHODS ====================================================================
	
	
}
