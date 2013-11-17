package Providers;

import Abstractions.AbstractWorld;
import ConfigurationObjects.SimpleIA;
import Interfaces.IProvider;
import Misc.MiscUtils;


public class IAProvider implements IProvider {
	
	/** Créé un objet de SimpleIA 
	 * @param s */
	public SimpleIA createNew(AbstractWorld w, short ID, String name, String executables){
		SimpleIA ia = new SimpleIA();
		ia.setID(ID);
		ia.addAll(MiscUtils.parseStringToExecutables(w, executables));
		return ia;
	}
	
}