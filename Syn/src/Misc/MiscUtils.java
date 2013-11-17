package Misc;

import java.util.ArrayList;

import piou.scripts.ExecutableScript;
import piou.scripts.ScriptsService;
import Abstractions.AbstractWorld;
import GameObjects.GAction;
import GlobalObjects.EffectsShare;
import Interfaces.IExecutable;
import Plugins.Managers.PluginsManager;

public class MiscUtils {

	
	/** @param source - GServer utile entre autres pour connaître la source des Scripts qu'il peut y avoir à exécuter dans l'IA  */
	public static ArrayList<IExecutable> parseStringToExecutables(AbstractWorld w, String str){
		if(str == null || str.length() == 0){
			return null;
		}
		String[] executables = str.split("\\|");
		ArrayList<IExecutable> exes = new ArrayList<IExecutable>();
		
		PluginsManager pm = w.getStrategy().defaultPluginsManager;
		if(w.getServer() != null){
			w.getServer().getPluginsManager();
		}
		
		//PluginsManager pmSource = source == null ? Syn.Services.defaultPluginsManager : source.getPluginsManager();
		for(int i = executables.length-1; i >= 0; i--){
			IExecutable e = null;
			switch(executables[i].charAt(0)){
				case 'E':
					e = EffectsShare.getSimilarEffect(executables[i].substring(2), false, w);
					break;
				case 'A':
					String ac = executables[i].substring(2);
					e = new GAction(w.getServer().getWorld().getNextActionID(),  Short.parseShort(ac.substring(0,ac.indexOf(";"))),  ac.substring(ac.indexOf(";")+1)  );
					break;
				case 'S':
					ScriptsService<ExecutableScript> scripts;
					if(w.getServer() == null){
						scripts = w.getStrategy().scripts;//Syn.Services.scripts; 
					}else{
						scripts = w.getServer().getScripts();// source.getScripts();
					}
					for(ExecutableScript ss : scripts){
						if(ss.getName().equals(executables[i].substring(2))){
							e = ss;
							break;
						}
					}
					break;
				case 'M':
					short id = Short.parseShort(executables[i].substring(2));
					e = pm.getMacroManager().getMacros().get(id);
					break;
			}
			if(e != null){
				exes.add(e);
			}
		}
		return exes;
	}
	
	
	
	
	
	
}
