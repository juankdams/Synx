/**
 * @filename - GameActions Parsing and Applying
 * @author - Robyn
 * @Date - 24/01/2013
 */



importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);
importClass(Packages.Enums.CharacteristicType);
importClass(Packages.GameObjects.GStatistiques.CharacteristicColumn);//strange
importPackage(Packages.pack);



function exe(perso, caster, targetCellID, characColumn){
	Messages.M(perso.getClient().getSession(), 'Welcome to the GameActions JavaScript Plugin !', Constants.COLOR_BLUE);
	if(caster == null){
		//oui c'est possible so vérifie.
	}
	
	/*var life = 0;
	var stats = 0;
	var dice = 1;
		
	stats = caster.getStatistique().getValue(effectType.getCharacType().get(), column);  //La charac principale (Force, chance, intel, agi)
	stats += caster.getStatistique().getValue(CharacteristicType.DOM_FACTOR.get(), column); //Les +dommages %
	
	if(e.getParams().isDice()){
		dice = e.getDice().getRandomShot();
	}else if(e.getParams().isJet()){
		dice = e.getJet().getValue();
	}
	life = dice * ((stats/100)+1);
	life += caster.getStatistique().getValue(CharacteristicType.DOM.get(), column); //Les +dommages
	
	
	print('Affected '+effectType.name()+' with '+stats+' '+effectType.getCharacType().name()+' and '+life+' life !');
	
	Messages.M(caster.getClient().getSession(), 'Affected '+effectType.name()+' with '+stats+' '+effectType.getCharacType().name()+' and '+life+' life !', Constants.COLOR_BLUE);
	//Messages.M(caster.getClient().getSession(), 'Vous avez un nouveau message!', Constants.COLOR_BLUE);
	
	caster.getStatistique().decrementPdv(life);*/
}
