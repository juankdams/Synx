package GlobalObjects;

import java.util.ArrayList;
import java.util.List;

import GameObjects.Fights.GFight;
import Interfaces.ISprite;

public class MapLayer {

	public Map m = null;
	public GFight f = null;
	public ArrayList<ISprite> sprites = null;
	

	
	/* *
	 * TODO0 : liste des sprites sur la map 
	 *  (persos, dropedItems, monstres, prisms, poubelles, npc, percepteur, interactiveItem, etc)
	 * @exception - Throws NullPointerException if (sprites == null)
	 * @return
	 */
/*	public ArrayList<ISprite> getSpritesSynchroFull() {
		//TODO
		if(sprites == null){
			return null;
			//Exceptions.throwNullPointerException("Map.getSprites : liste nulle.  MapID:"+ID+".");
		}
		//Syn.d("accessed map.getSprites()");
		return updateSpriteList(GET_SPRITES, null);
	}
*/	
	public List<ISprite> getSpritesSynchroCopy() {//non modifiable
		if(sprites == null){
			return null;
		}
	    synchronized(sprites){
	    	ArrayList<ISprite> spritescopy = new ArrayList<ISprite>();
	    	spritescopy.addAll( sprites ); //Collections.unmodifiableList(sprites));
	    	return spritescopy;
	    }
	}
	/*
	 [12:24] Mathias: public List<ISprite> getSprites() {//non modifiable
    		return Collections.unmodifiableList(sprites);
		}
		non-modifiable dans le sens que la liste retournée est psa modifiable directement ou que l'arraylist sprites dans Map est pas modifiable le temps que l'autre liste 
	 */
	public ISprite getSprite(int spriteID){
		for(ISprite s : getSpritesSynchroCopy()){
			if(s.getID() == spriteID){
				return s;
			}
		}
		return null;
	}
	
	public void setSprites(ArrayList<ISprite> sprites){
		this.sprites = sprites;
	}
	
/*	public synchronized ArrayList<ISprite> updateSpriteList(MapAction action, ISprite c){
		if(action == ADD_SPRITE && c != null){
			if(sprites == null){
				sprites = new ArrayList<ISprite>(10);
			}
			sprites.add(c);
			c.onAddedToMap(this);
			Syn.d("In updateSpriteList Add: sprite.getID("+c.getID()+")");
		}else
		if(action == REMOVE_SPRITE && c != null){
			if(sprites != null){
				if(sprites.contains(c)){
					c.onRemovedFromMap(this);
					sprites.remove(c);
				}
				if(sprites.size() == 0){
					sprites = null;
				}
				Syn.d("In updateSpriteList Remove: sprite.getID("+c.getID()+")");
			}else{
				Syn.d("In updateSpriteList Remove mais liste nulle: sprite.getID("+c.getID()+")");
			}
		}
		return sprites;
	}
*/	
	
}
