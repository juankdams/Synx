package MacroScripting;

import java.util.Stack;

import Abstractions.AbstractCharacter;
import Core.Syn;
import MacroScripting.Language.DELIMITERS;

public class Bloc {
	
	
	public int ID = 0;
	public Macro parent = null;
	public Stack<Directive> directives = null;
	
	
	
	public Bloc(Macro m){
		parent = m;
		directives = new Stack<Directive>();
	}
	
	public void preload(String str) throws Exception{
		Syn.d("Bloc.preload ("+str+")");
		String id = str.substring( 0 , str.indexOf(DELIMITERS.BLOC_CONTENT_START.str));
		if(id.equals("onLoadBloc")){
			return;
			/*Syn.d("Bloc.preload : onLoadBloc");
			int startpoint = str.indexOf(" characterID=\" ");
			int endpoint = str.indexOf(" \" ", startpoint);
			String characterID = str.substring(startpoint, endpoint);
			Syn.d("characterID="+characterID);*/
		}else{
			ID = Integer.parseInt( id );
		}
		Syn.d("Bloc.preload.ID ("+ID+")");
		
		
		String directivestr = str.substring(str.indexOf(DELIMITERS.BLOC_CONTENT_START.str) + 1);
		Syn.d(DELIMITERS.BLOC_CONTENT_END.str + DELIMITERS.BLOC_CONTENT_END.str);
		if(directivestr.endsWith(DELIMITERS.BLOC_CONTENT_END.str + DELIMITERS.BLOC_CONTENT_END.str)){
			//Syn.w("comme un fou");
			//si la string du bloc finit par ";;", rapetisse à ";"
			//(ya un ; pour la fin de bloc et un pour la fin de la derniere directive).
			directivestr = directivestr.substring(0 , directivestr.length()-1);
		}
		String[] direcs = directivestr.split(DELIMITERS.DIRECTIVE_START.str);
		for(String direc : direcs){
			direc = direc.trim();
			if(direc.length() > 0){
				Directive d = new Directive(this);
				d.preload(direc);
				directives.push(d);
			}
		}
		
	}
	
	/**
	 * Call toutes les directives;
	 */
	public void call(AbstractCharacter character, AbstractCharacter target){
		if(directives != null && directives.size() != 0){
			for(Directive d : directives){
				if(parent.blocIndex == 0){
					d.call(character, target);
				}
			}
		}
	}
	

}
