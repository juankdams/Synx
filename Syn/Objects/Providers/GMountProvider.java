package Providers;

import GameObjects.GMount;
import Interfaces.IProvider;

public class GMountProvider implements IProvider {
	
	
	
	public GMount createNew(){
		GMount m = new GMount();
		
		return m;
	}
	

}
