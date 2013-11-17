package IA;

import Interfaces.IExecutable;
import Plugins.Abstractions.AbstractIA;


public class SimpleIA extends AbstractIA {
	
	
	@Override
	/**
	 * 
	 * @param objects - Pour GEffets : { AbstractCharacterCaster, AbstractCharacterTarget, ParameterHolder };
	 * @param objects - Pour GActions : { GPersonnageCaster, targetSprite, targetCell };
	 * @param objects - Pour Network : { ElectricalFlow };
	 * @param objects - Pour ExecutableScript : { On donne souvent le GServer, mais ce sont les arguments qu'on veut donner au main method du script sans compter les MainArgs qui sont des strings loadées en bdd };
	 * @param objects - Pour AbstractIA / SimpleIA : { GServer, GFight, CombativeCharacter curFighter };
	 * 
	 */
	public void apply(Object[] objects) {
		for(IExecutable e : exes){
			e.apply(objects);
		}
	}
	

}
