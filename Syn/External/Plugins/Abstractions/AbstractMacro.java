package Plugins.Abstractions;

import java.io.IOException;

import Abstractions.AbstractCharacter;
import Interfaces.IExecutable;
import Misc.Utils;

public abstract class AbstractMacro implements IExecutable {

	/*
	public static MacroProvider provide(GServer s, int macroID){
		if(s == null){
			return Syn.Services.defaultPluginsManager.providers.provideMacros();
		}
		return s.getProviders().provideMonster();
	}
	public static class MacroProvider implements IProvider{
		
	}
	*/
	
	protected short ID = 0;
	public short getID(){
		return ID;
	}
	public void setID(short id){
		this.ID = id;
	}

	public abstract AbstractMacro createMacro(String url, String fileName, String name, String version, String desc);
	public abstract AbstractMacro preload() throws IOException;
	public abstract boolean isLoaded();
	
	public abstract AbstractMacro execute(AbstractCharacter character, AbstractCharacter target);
	public abstract AbstractMacro execute(int fromBloc, int toBloc, AbstractCharacter character, AbstractCharacter target);
	public abstract AbstractMacro execute(int blocIDs[], AbstractCharacter character, AbstractCharacter target);

	
	public abstract AbstractMacro createAspectRecorder();
	
	@Override
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
	public void apply(Object[] objects){
		if(objects == null || objects.length < 2){
			return;
		}
		AbstractCharacter character = (AbstractCharacter) objects[0];
		AbstractCharacter target 	= (AbstractCharacter) objects[1];
		objects = (Object[]) Utils.removeElementFromArray(objects, character);
		objects = (Object[]) Utils.removeElementFromArray(objects, character);
		if(objects.length == 0){
			execute(character, target);
		}
		if(objects[0] instanceof int[]){
			execute((int[]) objects[0], character, target);
		}else
		if(objects.length == 2 
			&& Utils.isParsableInteger((String) objects[0])
			&& Utils.isParsableInteger((String) objects[1])){
			
			int from = Integer.parseInt((String) objects[0]);
			int to = Integer.parseInt((String) objects[1]);
			execute(from, to, character, target);
		}
	}
	
	
}
