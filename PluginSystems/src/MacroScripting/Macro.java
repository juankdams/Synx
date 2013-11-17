package MacroScripting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import pack.SystemsMain;
import Abstractions.AbstractCharacter;
import Core.Exceptions;
import Core.Syn;
import MacroScripting.Language.DELIMITERS;
import Misc.Utils;
import Plugins.Abstractions.AbstractMacro;

public class Macro extends AbstractMacro {

	public SystemsMain main = null;

	//De base
	public File script = null;
	public String name = "";
	public String version = "";
	public String description = "";
	//public AbstractCharacter character = null;//Celui qui doit exécuter le macro ;o Un Pnj, Monstre, perso, etc.
	//public AbstractCharacter target = null;//Un target utilisable par le character. 
										   //Ex pour lui donner un objet ou lui envoyer des packets tout seul (voir ScopeType)
	public AbstractMacro aspectMacroRecorder = null;
	
	//Préloadé
	public HashMap<Integer, Bloc> blocs = null;
	public HashMap<String, Object> vars = null;
	
	//on Runtime
	public int blocIndex = 0;
	
	
	
	public Macro(SystemsMain main, String url, String fileName, String name, String version, String desc) {
		Syn.d("Load Macro:  "+name+" v"+version+".  "+desc);
		this.main = main;
		this.name = name;
		this.version = version;
		this.description = desc;
		setFile(url, fileName);
		//this.aspectMacroRecorder = createAspectRecorder();
	}

	@Deprecated
	/** Utilisé seulement pour avoir une copie 'statique' dans le SystemsManager */
	public Macro() {}
	
	private void setFile(String url, String fileNameWithExtension){
		if(url.contains("http://")){ //download .micro file
			script = Utils.download(url, fileNameWithExtension, "Temps_macros/", fileNameWithExtension);
		}else{
			script = new File(url + fileNameWithExtension);
		}
	}
	
	
	@Override
	public Macro preload() throws IOException{
		if(script == null){
			Exceptions.throwInterruptedException("ScriptFile null dans Macro");
		}
		preloadBlocs();
		return this;
	}
	
	/**
	 * Exécute tout le script du début à la fin.
	 * @return 
	 */
	public AbstractMacro execute(AbstractCharacter character, AbstractCharacter target){
		return execute(0, getMaxBlocID(), character, target);
	}

	/**
	 * Exécute le script à partir d'un certain bloc jusqu'à un autre certain bloc en se servant de leurs ID.
	 */
	public AbstractMacro execute(int fromID, int toID, AbstractCharacter character, AbstractCharacter target){
		if(fromID < 0 || fromID > toID){
			Exceptions.throwIllegalArgumentException("Macro.execute from/to: invalid \'fromLine\' argument. Soit < 0, soit > toLine");
		}
		if(toID > getMaxBlocID()){
			Exceptions.throwIllegalArgumentException("Macro.execute from/to: invalid \'toLine\' argument. toLine >= blocs.size()");
		}
		ArrayList<Bloc> myblocs = new ArrayList<Bloc>(this.blocs.values());
		for(int i = 0; i <= myblocs.size()-1; i++){
			if(myblocs.get(i).ID < fromID || myblocs.get(i).ID > toID){
				continue;
			}
			myblocs.get(i).call(character, target);
			if(blocIndex != 0){
				if(blocIndex < 0){
					Exceptions.throwIllegalArgumentException("Macro.execute : invalid \'blocIndex\' argument. < 0");
				}
				if(blocIndex >= myblocs.size()){
					Exceptions.throwIllegalArgumentException("Macro.execute : invalid \'blocIndex\' argument. >= blocs.size");
				}
				i = blocIndex;
				blocIndex = 0;
			}
		}
		return this;
	}
	
	/**
	 * Exécute seulement certains blocs par leurs IDs dans une array.
	 */
	public AbstractMacro execute(int[] blocIDs, AbstractCharacter character, AbstractCharacter target){
		if(blocIDs == null || blocIDs.length == 0){
			Exceptions.throwIllegalArgumentException("Macro.execute: invalid \'fromLine\' argument. Soit < 0, soit > toLine");
		}
		for(int i = 0; i <= blocIDs.length-1; i++){
			if(blocs.get(blocIDs[i]) == null){
				Exceptions.throwIllegalArgumentException("Macro.execute blocs[]: Bloc ID inexistant");
			}
			blocs.get(blocIDs[i]).call(character, target);
			while(this.blocIndex != 0){
				Bloc b = this.blocs.get(blocIndex);
				if(b == null){
					Exceptions.throwIllegalArgumentException("Macro.execute blocs[]: GOTO directive : Bloc ID inexistant ("+blocIndex+") ");
				}
				blocIndex = 0;
				b.call(character, target);
			}
		}
		return this;
	}
	
	
	
	
	private void preloadBlocs() throws IOException{
		BufferedReader br = new BufferedReader( new FileReader(script) );
		char[] chars = new char[(int) script.length()];  
		br.read(chars);

		boolean isInString = false;
		char lastChar = ' ';
		
		StringBuilder total = new StringBuilder("");
		for(int i = 0; i < chars.length; i++){
			if(chars[i] == '\"' && lastChar != '\\'){
				isInString = !isInString;
			}
			if(	isInString == false && 
				Character.isWhitespace(chars[i])//(chars[i] == ' ' || chars[i] == '\b' || chars[i] == '\r' || chars[i] == '\n')
				){
				
			}else{
				total.append(chars[i]);
			}
		}
		//Syn.w("[ TotalStringOfMacro: ]" + total.toString());

		String blocs[] = total.toString().split(DELIMITERS.BLOC_START.str);
		if(blocs.length > 0){
			this.blocs = new HashMap<Integer, Bloc>();
			this.vars = new HashMap<String, Object>();
			for(String bloc : blocs){
				if(bloc.length() > 0){
					parseBloc(bloc);
				}
			}
		}
	}
	
	
	private void parseBloc(String str){
		Bloc bloc = new Bloc(this);
		try{
			bloc.preload(str);
		}catch(Exception e){
			Syn.log.error("Problem in the parsing-preloading of a macrobloc. FileName=("+script.getAbsolutePath()+") ");
			e.printStackTrace();
			return;
		}
		blocs.put(bloc.ID, bloc);
	}
	
	
	public int getLinesSize(){
		if(blocs == null){
			try {
				preload();
			} catch (IOException e) { e.printStackTrace(); }
		}
		return blocs.size();
	}
	
	public int getMaxBlocID(){
		int max = 0;
		for(Bloc b : this.blocs.values()){
			if(b.ID > max){
				max = b.ID;
			}
		}
		return max;
	}



	
	@Override
	public AbstractMacro createAspectRecorder(){
		return main.pm.getMacroManager().createAspectRecorder();
	}

	@Override
	public AbstractMacro createMacro(String url, String fileName, String name, String version, String desc) {
		return new Macro(main, url, fileName, name, version, desc);
	}

	@Override
	public boolean isLoaded() {
		return blocs != null;
	}
	
	
	
	
	
	
	
	
	
	
	
}
