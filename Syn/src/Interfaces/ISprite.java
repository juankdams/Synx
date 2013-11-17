package Interfaces;

import Enums.CharacterType;
import Enums.Orientation;
import GlobalObjects.Map;
import Plugins.Managers.PluginsManager;

public interface ISprite extends IObject {

	/**Return null si le ISprite n'est pas un ICharacter*/
	public CharacterType getCharacterType();
	
	public int getGfxID();
	public Map getMap();
	public int getMapID();
	public short getCellID();
	public byte getOrientation();
	public short getSize();

	public void setGfxID(int gfxID);
	public void setMap(Map m);
	public void setMapID(int mapID);
	public void setCellID(short cellID);
	public void setOrientation(Orientation o);
	public void setOrientationID(byte o);
	public void setSize(short size);
	
	public byte getLayer();
	public void setLayer(byte layer);
	
	/** Utilisé dans la construction de packets d'affichage de sprites comme GM, GDO, ...
	 * @param prefix */
	public String getSpritePacket(String prefix);
	public String getSpritePacket(PluginsManager pm, String prefix);
	
	/** Utilisé uniquement dans Map.updateSpritesList*/
	public void onAddedToMap(Map m);
	/** Utilisé uniquement dans Map.updateSpritesList*/
	public void onRemovedFromMap(Map m);

}
