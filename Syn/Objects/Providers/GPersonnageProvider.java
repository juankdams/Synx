package Providers;

import Constants.CPerso;
import Core.Syn;
import Game.GameServer;
import GameObjects.GInventory;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import Interfaces.IProvider;
import LoginObjects.LAccount;


public class GPersonnageProvider implements IProvider {
	
	/**
	 * Créé un nouveau personnage et l'initiate avec initGPerso.
	 * <br> Et ensuite set sa mapID, cellID, Kamas, XP, Channels, startSpells...tout ce qui est 'start' genre :P
	 * <br>Créé aussi son nouvel GInventory et GStatistiques  */
	public GPersonnage createNew(int persoID, GameServer gs, LAccount account, String name, byte classID, byte sexe, int color1, int color2, int color3){
		GPersonnage p = createBase(persoID, gs, account);
		p.initGPerso(name, classID, sexe, color1, color2, color3);
		//New Inventory avec les bons startItems de la gconfig du serveur :)
		GInventory.provide(gs.getWorld()).createNew(p.getID(), gs.getWorld().getStartItems(classID), gs.getWorld());
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
	

	/**
	 * Pour quand on charge les persos dans le LAccount à la connexion.
	 * En gros cest utile à l'écran de sélection du serveur. quand on veut savoir combien de persos il y a de créer dans un serveur.
	 */
	public GPersonnage createBase(int persoID,  GameServer server, LAccount account){
		Syn.d("new GPersonnage persoID =("+persoID+") serverID =["+server.getID()+"] )");
		GPersonnage p = new GPersonnage();
		p.setID(persoID);
		p.setServer(server);
		p.setAccount(account);
		return p;
	}
	
	
}

