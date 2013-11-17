package LoginObjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Game.GameServer;
import GameObjects.GWorld;
import Interfaces.IObject;

public class LGift implements IObject{ 
	public static Logger log = LoggerFactory.getLogger(LGift.class);
	//-> un GIFT par compte, plusieurs items dans le gift. 
	//update le title et cie quand la liste des items est modifiée.

	private int ID = 1;
	private int type = 1;
	private String title = "";         
	private String description = "";
	private String gfxURL = "";
	private String items[];
	
	public LGift(int id, int type, String title, String desc, String gfxurl, String items){
		this.ID = id;
		this.type = type;
		this.title = title;
		this.description = desc;
		this.gfxURL = gfxurl;
		this.items = items.split(";");
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getID() {
		return ID;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setGfxURL(String gfxURL) {
		this.gfxURL = gfxURL;
	}

	public String getGfxURL() {
		return gfxURL;
	}

	public void setItems(String items[]) {
		this.items = items;
	}

	public String[] getItems() {
		return items;
	}


	@Override @Deprecated
	public short getServerID() { return 0; }
	@Override @Deprecated
	public GameServer getServer() { return null; }
	@Override @Deprecated
	public GWorld getWorld() { return null; }
	@Override @Deprecated
	public void setServer(GameServer s) { }

	@Override
	public void terminate() throws Throwable {
		this.description = null;
		this.gfxURL = null;
		this.items = null;
		this.title = null;
		this.finalize();
	}

	
	
	//public static class GiftItem
	
	
	
	
}

/*
loc1.onGiftsList = function (sExtraData)
    {
        var _loc3 = sExtraData.split("|");
        var _loc4 = Number(_loc3[0]);
        var _loc5 = Number(_loc3[1]);
        var _loc6 = _loc3[2];
        var _loc7 = _loc3[3];
        var _loc8 = _loc3[4];
        var _loc9 = _loc3[5];
        var _loc10 = new LoadVars();
        _loc10.decode("&text=" + _loc6);
        var _loc11 = _loc10.text;
        _loc10 = new LoadVars();
        _loc10.decode("&desc=" + _loc7);
        var _loc12 = _loc10.desc;
        _loc10 = new LoadVars();
        _loc10.decode("&gfxurl=" + _loc8);
        var _loc13 = _loc10.gfxurl;
        var _loc14 = new Array();//A:LJKNFJN
        var _loc15 = _loc9.split(";");
        var _loc16 = 0;
        
        while (++_loc16, _loc16 < _loc15.length)
        {
            if (_loc15[_loc16] != "")
            {
                var _loc17 = this.api.kernel.CharactersManager.getItemObjectFromData(_loc15[_loc16]);
                _loc14.push(_loc17);
            } // end if
        } // end while
        var _loc18 = new Object();
        _loc18.type = _loc4;
        _loc18.id = _loc5;
        _loc18.title = _loc11;
        _loc18.desc = _loc12;
        _loc18.gfxUrl = _loc13;
        _loc18.items = _loc14;
        this.api.datacenter.Basics.aks_gifts_stack.push(_loc18);
    };
*/