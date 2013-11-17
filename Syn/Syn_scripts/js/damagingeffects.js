/**
 * @filename - Damaging Effects Parsing and Applying
 * @author - Robyn
 * @Date - 21/01/2013
 */



importClass(Packages.SM.Messages);
importClass(Packages.GameObjects.GPersonnage);
importClass(Packages.Game.GClient);
importClass(Packages.Constants.Constants);
importClass(Packages.Enums.CharacteristicType);
importClass(Packages.GameObjects.GStatistiques.CharacteristicColumn);//strange
importClass(Packages.Interfaces.ICharacter);
importClass(Packages.SM.Account);
importPackage(Packages.pack);


//function hit(){
//	print('Welcome to the DamagingEffects JavaScript Plugin !');
//}

function exe(effectType, e, caster, target, column, isWeapon){
	Messages.M(caster.getClient().getSession(), 'Welcome to the DamagingEffects JavaScript Plugin !', Constants.COLOR_BLUE);
	var life = 0;
	var stats = 0;
	var dice = 1;
		/*
		STEAL_X_PDV_WATER(91,13,true),
		STEAL_X_PDV_EARTH(92,10,true),
		STEAL_X_PDV_AIR(93,14,true),
		STEAL_X_PDV_FIRE(94,15,true),
		STEAL_X_PDV_NEUTRAL(95,10,true),
		DAMAGE_X_WATER(96,13,true),
		DAMAGE_X_EARTH(97,10,true),
		DAMAGE_X_AIR(98,14,true),
		DAMAGE_X_FIRE(99,15,true),
		*/
	stats = caster.getStatistique().getValue(effectType.getCharacType().get(), column);  //La charac principale (Force, chance, intel, agi)
	stats += caster.getStatistique().getValue(CharacteristicType.DOM_FACTOR.get(), column); //Les +dommages %
	
	if(e.getParams() == null){
		dice = 1;
	}else if(e.getParams().isDice()){
		dice = e.getDice().getRandomShot();
	}else if(e.getParams().isJet()){
		dice = e.getJet().getValue();
	}
	
	if(isWeapon == false){
		life = dice * ((stats/100)+1);
	}else{
		//TODO, AJOUTER LES MAITRISE ET METTRE LA VRAIE FORMULE DE DOM POUR LES ARMES
		life = dice * ((stats/100)+1);
	}
	
	life += caster.getStatistique().getValue(CharacteristicType.DOM.get(), column); //Les +dommages
	
	print('Affected '+effectType.name()+' with '+stats+' '+effectType.getCharacType().name()+' and '+life+' life !');
	Messages.M(caster.getClient().getSession(), 'Affected '+effectType.name()+' with '+stats+' '+effectType.getCharacType().name()+' and '+life+' life !', Constants.COLOR_BLUE);
	
	target.getStatistique().decrementPdv(life);
	
	
	
	/*
	switch(effectType.getID()){
		case 96:{
			var chance = caster.getStatistique().getValue(CharacteristicType.CHANCE.get(), column);
			if(e.getParams().isDice()){
				life = e.getDice().getRandomShot()*chance;
			}
			print('Affected Damage_X_Water with '+chance+' chance and '+life+' life !');
			break;
		}
		case DAMAGE_X_EARTH:{
			var force = caster.getStatistique().getValue(CharacteristicType.FORCE.get(), column);
			if(e.getParams().isDice()){
				life = e.getDice().getRandomShot()*force;
			}
			print('Affected Damage_X_Earth with '+force+' force and '+life+' life !');
			break;
		}
		case DAMAGE_X_AIR:{
			var agilite = caster.getStatistique().getValue(CharacteristicType.AGILITE.get(), column);
			if(e.getParams().isDice()){
				life = e.getDice().getRandomShot()*agilite;
			}
			print('Affected Damage_X_Air with '+agilite+' agility and '+life+' life !');
			break;
		}
		case DAMAGE_X_FIRE:{
			var intel = caster.getStatistique().getValue(CharacteristicType.INTELLIGENCE.get(), column);
			if(e.getParams().isDice()){
				life = e.getDice().getRandomShot()*intel;
			}
			print('Affected Damage_X_Fire with '+intel+' intel and '+life+' life !');
			break;
		}
		case DAMAGE_X_NEUTRAL:{
			var force = caster.getStatistique().getValue(CharacteristicType.FORCE.get(), column);
			if(e.getParams().isDice()){
				life = e.getDice().getRandomShot()*force;
			}
			print('Affected Damage_X_Neutral with '+force+' force and '+life+' life !');
			break;
		}
	}*/
}
