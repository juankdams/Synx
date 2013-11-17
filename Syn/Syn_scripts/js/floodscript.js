


importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);





function hello(p) {
	for(i = 0; i < 9600; i++){
	     Messages.M(p.getClient().getSession(), "Hello from script " +
				"number 2fdggggggggggggggggggggggggggggggggggggggggggggg!"+
				"number 2fdggggggggggggggggggggggggggggggggggggggggggggg!"+
				"number 2fdggggggggggggggggggggggggggggggggggggggggggggg!"+
				"number 2fdggggggggggggggggggggggggggggggggggggggggggggg!"
				, Constants.COLOR_BLUE);
	}
}	