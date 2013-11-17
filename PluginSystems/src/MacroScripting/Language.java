package MacroScripting;

public class Language {

	
	public static enum KEYWORDS{
		METHOD,
		COMMAND,
		CHAT,
		EMOTE,
		EFFET,
		MOVEMENT,
		DIRECTION,
		
		//todo:
		IF,//ben un if quoi.
		GOTO,//pour sauter à une ligne par son ID
		VAR,//pour créer une variable
		
	}
	
	public static enum DELIMITERS{
		ONLOAD_BLOC("onLoadBloc"),
		
		BLOC_START("#"),
		BLOC_END("#"),

		BLOC_CONTENT_START(":"),
		BLOC_CONTENT_END(";"),
		
		DIRECTIVE_START("\\$"),
		DIRECTIVE_END(";"),

		ARGUMENT_START("("),
		ARGUMENT_END(")");
		public String str = "";
		private DELIMITERS(String c){
			str = c;
		}
	}
	
	
	
}
