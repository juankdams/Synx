package Providers;

import pack.Providers;
import Constants.CPerso;
import Game.GServer;
import GameObjects.GInventory;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import Interfaces.IProvider;
import Interfaces.Injecter;
import LoginObjects.LAccount;


public class GPersonnageProviderInjecter implements IProvider, Injecter {
	

	private Providers parent = null;
	public GPersonnageProviderInjecter(Providers p){
		this.parent = p;
	}

	public GPersonnage createNew(int persoID, GServer gs, LAccount account, String name, byte classID, byte sexe, int color1, int color2, int color3){
		GPersonnage p = new GPersonnage(persoID, gs, account);
		p.initGPerso(name, classID, sexe, color1, color2, color3);
		//New Inventory avec les bons startItems de la gconfig du serveur :)
		GInventory.createNew(p.getID(), gs.getWorld().getStartItems(classID), gs.getWorld());
		//Des nouvelles statistiques prenant en compte le niveau de départ
		GStatistiques.createNew(p);
		//Ajoute les sorts de départ à sa spell list + les mets en position direct vu que ces les startSpells
		p.setSpells(gs.getWorld().getStartSpellsAsMapWithPositions(classID));
		//Set les trucs plus basiques
		p.setMapID(gs.getWorld().getStartMap(classID));
		p.setCellID(gs.getWorld().getStartCell(classID));
		p.setKamas(gs.getWorld().getStartKamas(classID));
		p.setXP(gs.getWorld().persoXPLevels[p.getLevel()]);
		p.setChannels(CPerso.channels);
		p.setEmotes(gs.getWorld().getClasse(classID).startEmotes);
		return p;
	}

	@Override
	public void inject() {
		// TODO Auto-generated method stub
		
	}


	

}
