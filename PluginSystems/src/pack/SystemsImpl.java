package pack;

import Plugins.Abstractions.AbstractSystems;

public class SystemsImpl extends AbstractSystems {
	
	/*
	@Override
	public boolean checkFightChallenge(GChallenge c, FightEvent fe){
		GServer s =  fe.getFight().getServer();
		for(ExecutableScript es : s.getScripts()){
			if(es.getFileName() == c.getScript().getFileName()){
				es.apply(new Object[]{c, fe, s});
				return c.isFailed();
			}
		}
		
		for(ExecutableScript es : Syn.Services.scripts){
			if(es.getFileName() == c.getScript().getFileName()){
				es.apply(new Object[]{c, fe, s});
				return c.isFailed();
			}
		}
		
		_____READ_ME___ : 
		//J'ai fait cette method dans un plugin pcq avant je pensais faire un switch sur les challenges
		//mais finalement j'utilise des scripts pour chacun donc cette method étant plutôt petite et inutile à modifier en runtime,
		//on devrait la mettre directement dans GChallenge.check(); au lieu d'en plugin.
		
		return c.isFailed();
	}*/
	

}
