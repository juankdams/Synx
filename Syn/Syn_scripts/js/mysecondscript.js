/**
 * @filename - My Second Script
 * @author - Robyn
 * @Date - 21/01/2013
 */



importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);

function hello(p) {
	Messages.M(p.getClient().getSession(), "Hello from script " +
			"number 2!", Constants.COLOR_BLUE);
	
	var x = 'a';
	print('Hehehhehe '+x);
	x += 1;
	print('Hehehhehe '+x);
}