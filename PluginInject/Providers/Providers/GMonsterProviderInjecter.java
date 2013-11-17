package Providers;

import java.util.Map.Entry;

import pack.Providers;

import Game.GServer;
import GameObjects.GDrop;
import GameObjects.GMonster;
import GameObjects.GMonster.GMonsterProvider;
import GameObjects.GMonsterOverrider;
import GameObjects.GWorld;
import GlobalObjects.GlobalWorld;
import Interfaces.IProvider;
import Interfaces.Injecter;
import Misc.Utils;

public class GMonsterProviderInjecter extends GMonsterProvider implements IProvider, Injecter {
	
	
	private Providers parent = null;
	public GMonsterProviderInjecter(Providers p){
		this.parent = p;
	}
	
	
	/** Créé un objet de Monstre */
	public GMonster createNew(short templateID, String gfxID, String[] drops, String accessories, String[] colors, String[] spells, GServer s){
		GWorld gw = s == null? null : s.getWorld();
		
		GMonster m = new GMonsterOverrider();
		m.setServer(s);
		m.setTemplateID(templateID);
		m.setGfxID(Utils.isParsableInteger(gfxID) ? Integer.parseInt(gfxID) : 0);
		
		if(accessories.equals(",,,,")){
			accessories = null;
		}
		m.setAccessories(accessories);
		m.setColor1( "-1".equals(colors[0]) ? -1 : Integer.parseInt(colors[0], 16) );
		m.setColor2( "-1".equals(colors[1]) ? -1 : Integer.parseInt(colors[1], 16) );
		m.setColor3( "-1".equals(colors[2]) ? -1 : Integer.parseInt(colors[2], 16) );
		
		if(drops != null && drops.length > 0 && drops[0].equals("") == false){
			m.setDrops(new GDrop[drops.length]);
			for(int i = drops.length-1; i >= 0; i--){
				m.getDrops()[i] = GDrop.createNew(drops[i], false);
			}
		}
		if(spells != null && spells.length > 0 && spells[0].equals("") == false){
			for(int i = spells.length-1; i >= 0; i--){
				short spellID = Short.parseShort(spells[i].substring(0, spells[i].indexOf(",")));
				short level = Short.parseShort(spells[i].substring(spells[i].indexOf(",") + 1));
				m.setSpellByID(GlobalWorld.getSpell(gw, spellID)[level-1], spellID);
			}
		}
		return m;
	}

	
	@Override
	public void inject() {
		for(Entry<Short, GMonster[]> monsters : parent.s.getWorld().getMonsterTemplates().entrySet()){
			GMonster[] mons = monsters.getValue();
			for(int i = mons.length-1; i >= 0; i--){
				mons[i] = new GMonsterOverrider(mons[i]);
			}
			parent.s.getWorld().getMonsterTemplates().put(monsters.getKey(), mons);
		}
	}
	
	
	

}
