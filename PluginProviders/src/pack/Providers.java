package pack;

import java.util.ArrayList;

import Game.GServer;
import Interfaces.IService;
import Interfaces.Injecter;
import Plugins.Managers.PluginsManager;

public class Providers implements IService {

	public PluginsManager pm = null;
	public GServer s = null;//n'est setté que si c'est un plugin spécifié dans un serveur et non le default
	
	//L'ai mit en commentaire pour ne pas overrider les Providers qui existent déjà dans l'ému de base
		//- Si tu veux injecter/overrider du code dans l'emu alors tu peux décommenter 
		//- ou créer de nouveaux Injecters/Overriders :)
	
	
	
	/*public GMonsterProviderInjecter monsters = null;
	public GPersonnageProviderInjecter personnages = null;
	public GMonsterGroupProviderInjecter monsterGroups = null;
	*/
	public ArrayList<Injecter> injecters = new ArrayList<Injecter>();
	
	
	public Providers(){
		/*monsters = new GMonsterProviderInjecter(this); 
		personnages = new GPersonnageProviderInjecter(this); 
		monsterGroups = new GMonsterGroupProviderInjecter(this);
		injecters.add(monsters);
		injecters.add(personnages);
		injecters.add(monsterGroups);*/
	}

	@Override
	public void boot() throws Exception {
		
		for(Injecter i : injecters){
			i.inject();
		}
		
	}


	@Override
	public void reboot() throws Exception {
		boot();		
	}
	
}
