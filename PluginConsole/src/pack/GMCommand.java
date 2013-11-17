package pack;

public enum GMCommand {
	
	SET(10),
	GET(10),
	
	EXE(10),
	SENDMULT(10),
	EXIT(10),//Ferme tout: LServer ET tous les GSserver
	REBOOT(10),//Reboot tous les services.
	ONGSERV(10),
	OFFGSERV(10), 
	LOAD(10),//Pour loader une config, une table sql blabla
	//NEWGSERV(10), 
	//DELGSERV(10),
	RELOADPLUG(10), 
	RELOADSCRIPT(10),
	REEVALSCRIPT(10),
	STOPALLSCRIPTS(10),
	GETSCRIPTINFOS(10),
	GC(10),
	GETMEM(10),
	
	TEMPTRIGGER(10),
	
	CREATEDEFAULTACCOUNTS(10),
	LEARNSPELL(10),
	LAUNCHSPELL(10),
	DEBUFF(10),
	TERMINATE_PERSO_CLIENT(10),
	MACRO(10),
	RESPAWN(10),
	LAYER(10),
	SETLAYER(10),
	KICK(10),
	
	
	
	//Créateur/Fondateur
	//TODO COMMAND ADDNPC(9),
	//TODO COMMAND REMOVENPC(9),
	//TODO COMMAND SETGM(9), (SETGEM: avec minimum 0 et maximum 9. Le 10 étant réservé à uniquement moi)
	SETGM(9),
	
	SETMAP(9),
	SETCELL(9),
	SETSIZE(9),
	ADDSTAT(9),
	GETSERVINFOS(9), 
	MYID(9),
	PERSOID(9),
	GETMAPSPRITE(9),
	PACKETEMU(9),
	PACKETCLIENT(9),
	PE(9),//same as PACKETEMU
	PC(9),//same as PACKETCLIENT
	SCHEDULEDPACKET(9),
	
	//Administrateur
	//TODO COMMAND SCHEDULEREBOOT(8),
	//TODO COMMAND BAN(8),
	
	//Vice-Administrateur
	SAVE(7),//Save tout: LWorld ET tous les GWorld
	
	//Maitre de Jeu
	//
	
	//Super Modérateur
	ITEM(5),
	
	//Modérateur
	LEVEL(4),
	//TODO COMMAND ANNOUNCE(4)   mais non-restreintev (+NAMEANNOUNCE qui est dispo en bas, mais sans contrainte)
	//TODO COMMAND KICK(4)
	//TODO COMMAND GIFT(4) mais restreinte à 3 par jour.  en gros, la meme commande que anim, mais a droit à 3 fois au lieu de 1
	SETPDV(4), 
	
	//Animateur
	//TODO COMMAND NAMEANNOUNCE(3)   mais restreinte de flood genre 1 fois par 1min
	//TODO COMMAND TELEPORT(3)
	//TODO COMMAND MUTE(3)
	//TODO COMMAND GIFT(3) mais restreinte à 1 par jour
	
	
	//GameHelper
	//TODO COMMAND NAMEANNOUNCE(2)   mais restreinte de flood genre 1 fois par 2min
	
	//VIP
	//TODO COMMAND COULEUR(1),
	GETCOMMANDS(1), 
	
	//JOUEUR
	//TODO COMMAND INFOS(0)
	;
	
	
	private byte gmlvl = 10;
	GMCommand(int gmlvl){
		this.gmlvl = (byte) gmlvl;
	}
	
	public byte getGMlvl(){
		return this.gmlvl;
	}
	
}
