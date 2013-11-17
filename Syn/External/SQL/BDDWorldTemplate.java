package SQL;

import java.lang.reflect.Method;
import java.util.HashMap;

import ConfigurationObjects.GConfig;
import Game.DofusGameServer;
import GameObjects.GWorld;
import GlobalObjects.Map;
import Plugins.Abstractions.AbstractActionListener;

public class BDDWorldTemplate {

	public static String tables[] = {
		"actions_listeners_world", "actions_listeners_npcs", "actions_listeners_maps", 
		"commands_config", "classes_config", "config", "experience", 
		"items", "item_sets", "item_templates", 
		"banks", "characteristiques_base", "titles", "personnages", 
		"spells", "maps", 
		"monsters", "monsters_statistiques", "monsters_groups", "monsters_groups_instances"
		};
	public static HashMap<String, Method> tableLoadingMethods = new HashMap<String, Method>();
	
	static{
		try {
			tableLoadingMethods.put("spells", Spells.class.getDeclaredMethod("loadAllSpells", DofusGameServer.class));
			tableLoadingMethods.put("actions_listeners", SConfig.class.getDeclaredMethod("loadActionListeners", GWorld.class, String.class, Map.class, AbstractActionListener.class));
			tableLoadingMethods.put("commands_config", SConfig.class.getDeclaredMethod("loadCommands", GWorld.class));
			tableLoadingMethods.put("classes_config", SConfig.class.getDeclaredMethod("loadClasses", GWorld.class));
			tableLoadingMethods.put("config", SConfig.class.getDeclaredMethod("load", GConfig.class));
			tableLoadingMethods.put("item_sets", Items.class.getDeclaredMethod("loadAllItemSets", DofusGameServer.class));
			tableLoadingMethods.put("item_templates", Items.class.getDeclaredMethod("reLoadAllItemTemplates", DofusGameServer.class, boolean.class));
			//banks
			//characteristic_base
			//titles
			//items
			//personnages
			//maps
			//config
			//expérience
			
			//TODO Continuer les methods de reloading des tables bdd gworld dans BDDWorldTemplate
			
		
		} catch (SecurityException e) {e.printStackTrace();
		} catch (NoSuchMethodException e) {e.printStackTrace();}
	}
	
	
	public static void createBDD(){
		
	}
	
	public static void createTable(){
		
	}
	
	public static void createColumn(){
		
	}
	
	
	
}
