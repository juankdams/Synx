package Abstractions;

import ConfigurationObjects.Classe;
import Enums.CharacterType;
import Enums.Orientation;
import Game.GameServer;
import GameObjects.GMonster;
import GameObjects.GWorld;
import GlobalObjects.Map;
import Interfaces.ISprite;
import Plugins.Managers.PluginsManager;

public abstract class AbstractCharacter implements ISprite {

	
	private static class BasicAbstractCharacter extends AbstractCharacter{
		@Override public CharacterType getCharacterType() { return null; }
		@Override public Classe getClasse() { return null; }
		@Override public String getName() { return null; }
		@Override public byte getAlignementSpecialization() { return 0; }
		@Override public String getAccessoriesPacket() { return null; }
		@Override public String getSpritePacket(String prefix) { return null; }
		@Override public void onAddedToMap(Map m) { }
		@Override public void onRemovedFromMap(Map m) { }
		@Override public byte getLayer() { return 0; }
		@Override public void setLayer(byte layer) { }
		//@Override public void setServerID(int serverID) { }
		@Override public String getSpritePacket(PluginsManager pm, String prefix) { return null; }
	}

	
	protected int ID = 0;
	protected int gfxID = 0;
	protected byte orientation = 0;
	protected int color1 = -1;
	protected int color2 = -1;
	protected int color3 = -1;
	protected Map map = null;
	protected short cellID = 0;
	protected short size = 100;
	protected byte layer = 0;
	protected GameServer server = null;
	protected AbstractInteraction inter = null;
	

	/**Return le CharacterType du Character (Ex PLAYER, MONSTER, NPC,PRISM)*/
	public abstract CharacterType getCharacterType();
	public abstract Classe getClasse();
	public abstract String getName();
	public abstract byte getAlignementSpecialization();
	public abstract String getAccessoriesPacket();
	
	
	@Override
	public void setID(int id) {
		this.ID = id;
	}

	@Override
	public int getID() {
		return ID;
	}
	
	@Override
	public int getGfxID() {
		return gfxID;
	}

	@Override
	public byte getLayer(){
		return layer;
	}
	
	public int getColor1() {
		return color1;
	}

	public int getColor2() {
		return color2;
	}

	public int getColor3() {
		return color3;
	}

	@Override
	public int getMapID() {
		return map.getID();
	}

	@Override
	public short getCellID() {
		return cellID;
	}

	@Override
	public byte getOrientation() {
		return orientation;
	}

	@Override
	public short getSize() {
		return size;
	}

	@Override
	public Map getMap() {
		return map;
	}

	@Override
	public void setGfxID(int gfxID) {
		this.gfxID = gfxID;
	}

	@Override
	public void setLayer(byte layer) {
		this.layer = layer;
	}
	
	@Override
	public void setMap(Map m) {
		this.map = m;
	}

	@Override
	public void setMapID(int mapID) {
		this.map = getWorld().getMap(mapID);
	}

	@Override
	public void setCellID(short cellID) {
		this.cellID = cellID;
		//Syn.d("charac = "+this.getName()+", settingCellID = "+cellID);
	}

	@Override
	public void setOrientation(Orientation o) {
		this.orientation = o.getValue();
	}

	@Override
	public void setOrientationID(byte o) {
		this.orientation = o;
	}

	@Override
	public void setSize(short size) {
		this.size = size;
	}
	
	public void setColor1(int color1) {
		this.color1 = color1;
	}

	public void setColor2(int color2) {
		this.color2 = color2;
	}

	public void setColor3(int color3) {
		this.color3 = color3;
	}

	@Override
	public short getServerID() {
		return server.getServerID();
	}
	@Override
	public GameServer getServer() {
		return server;
	}
	@Override
	public GWorld getWorld() {
		return server == null ? null : server.getWorld();
	}
	@Override
	public void setServer(GameServer server){
		this.server = server;
	}

	/*@Override
	public void setServerID(int serverID){
		
		for(GServer s : Syn.gameServers){
			if(s.getID() == serverID){
				this.server = s;
			}
		}
	}*/

	public AbstractInteraction getInteraction() {
		return inter;
	}
	public void setInteraction(AbstractInteraction inter) {
		this.inter = inter;
	}
	
	
	public AbstractCharacter copy(GameServer newServ) {
		AbstractCharacter ac = null;
		switch(this.getCharacterType()){
			case CREATURE: break;
			case MONSTER:
				ac = new GMonster();
				break;
			case MONSTER_GROUP:
				ac = newServ.getProviders().provideMonsterGroup().createNew(newServ.getWorld(), size);//GMonsterGroup.createNew(newServ.getWorld(), size);
				break;
			case NPC: break;
			case OFFLINE_CHARACTER: break;
			case TAX_COLLECTOR: break;
			case MUTANT: break;
			case MUTANT2: break;
			case PARKED_MOUNT: break;
			case PRISM: break;
			case PLAYER: break;
			default:
					ac =  this instanceof CombativeCharacter ? 
							new CombativeCharacter.BasicCombativeCharacter():
							new BasicAbstractCharacter();
			break;
		}
		ac.setServer(newServ);
		ac.setCellID(this.getCellID());
		ac.setMap(this.getMap());
		ac.setColor1(this.getColor1());
		ac.setColor2(this.getColor2());
		ac.setColor3(this.getColor3());
		ac.setGfxID(this.getGfxID());
		ac.setSize(this.getSize());
		ac.setOrientationID(this.getOrientation());
		return ac;
	}
	
	

	@Override
	public void terminate() throws Throwable{
		server = null;
		map = null;
		this.finalize();
	}

	
	
}
