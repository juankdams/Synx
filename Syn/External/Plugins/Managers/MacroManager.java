package Plugins.Managers;

import java.io.IOException;
import java.util.HashMap;

import Plugins.Abstractions.AbstractMacro;

public class MacroManager {

	
	public AbstractMacro am = null;
	public AbstractMacro aspectMacroRecorder = null;
	
	private HashMap<Short, AbstractMacro> macros = new HashMap<Short, AbstractMacro>();	
	
	public AbstractMacro createAspectRecorder(){
		return aspectMacroRecorder.createAspectRecorder();
	}
	/**
	 * Charge un macro avec les AbstractCharacter qu'il utilisera lors du execute();
	 * @param fileName - Nom du fichier du macro.  (Exemple grozilla.macro)
	 * @param casterCharacter - L'AbstractCharacter qui exécute le macro
	 * @param targetCharacter - L'AbstractCharacter qui peut être targeté par le caster. (Question de scope pour l'envoie des packets)
	 * @return - Le nouveau AbstractMacro chargé et prêt à être exécuté();
	 */
	public AbstractMacro createMacro(String url, String fileName, String name, String version, String desc){
		return am.createMacro(url, fileName, name, version, desc);
	}
	/** Voir la doc de createMacro(); Le créé et le preload après, juste avant de le return; */
	public AbstractMacro createAndpreloadMacro(String url, String fileName, String name, String version, String desc){
		AbstractMacro am = this.am.createMacro(url, fileName, name, version, desc);
		try {
			am.preload();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return am;
	}
	


	public void setMacros(HashMap<Short, AbstractMacro> macros) {
		this.macros = macros;
	}
	public HashMap<Short, AbstractMacro> getMacros() {
		return macros;
	}
	
	
	public void unload() {
		am = null;
	}

	
	
}
