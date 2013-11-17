
importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);



function exe(p) {
	  Messages.M(p.getClient().getSession(), "L'effet n'a pas de nom de script à exécuter (SpecialArg=0)", Constants.COLOR_BLUE);
}