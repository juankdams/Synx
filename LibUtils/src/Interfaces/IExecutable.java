package Interfaces;


public interface IExecutable {

	
	
	/**
	 * 
	 * @param objects - Pour GEffets : { AbstractCharacterCaster, AbstractCharacterTarget, ParameterHolder };
	 * @param objects - Pour GActions : { GPersonnageCaster, targetSprite, targetCell };
	 * @param objects - Pour Network : { ElectricalFlow };
	 * @param objects - Pour ExecutableScript : { On donne souvent le GServer, mais ce sont les arguments qu'on veut donner au script sans compter les MainArgs qui sont des strings loadées en bdd };
	 * @param objects - Pour AbstractIA / SimpleIA : { GServer, GFight, CombativeCharacter curFighter };
	 * @param objects - Pour Macro : {AbstractCharacter charac, AbstractCharacter target, parametresMethodExecute=indexBlocsÀExécuterOuRienPourTout};
	 *
	 */
	public void apply(Object[] objects);
	
	
}
