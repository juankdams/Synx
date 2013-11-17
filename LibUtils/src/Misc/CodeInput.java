package Misc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;






public class CodeInput {
	
	public static String operators[] = {"+", "-", "=", "++", "--", "+=", "-=", "/", "/=", "*", "*=", "%", "%="};
	public static String verifiers[] = {"!", "!=","==", ">", "<", ">=", "<=", "|", "||", "&", "&&"};
	public static String keyWords[] = {"this", "if", "while", "for", "else", "elseif", "false", "true", "return", "break", "switch", "case"};
	public static String keyChars[] = {"{", "}", ";", ":", ".", ",", "[", "]", "(", ")", "\"", "\'"};
	public static String keyTitles[] = {"public", "private", "protected", "static", "void", "synchronized"};
	public static String identifiers[] = {"boolean", "int", "String", "short", "long", "char", "byte", "CharSequence", "Thread" , "Integer", "Long", "Short"};
	
	public static String others[] = {"System", "out", "println"};
	public static String stringMethods[] = {"charAt", "subString", "replace"};
	public static String integersMethods[] = {"parseInt", "toString"};
	public static String longMethods[] = {"parseLong", "toString"};
	public static String shortMethods[] = {"parseShort", "toString"};
	
	public static String ancestraClassesNames[] = {"Info", 
												         "Ancestra", "CodeInput", "Commands", "ConditionParser", "Constants", "CryptManager", "Formulas", "IA", "IAkanido", "PaliersStats", "PathFinding", "SendManager", "SocketManager", "SQLManager", "StringUtil", "World", 
														 "MasterServer", "MasterThread", 
														 "GameServer", "GameThread", 
														 "Achievements", "Action", "Animations", "Bandits", "Carte", "Challenge", "Compte", "Dragodinde", "Fight", "Guild", "HDV", "House", "Metier", "MobsWhoDropped", "Monstre", "NPC_tmpl", "Objet", "Percepteur", "Personnage", "PierreAme", "Prisme", "Quest", "Reinforcement", "Sort", "Speaking", "SpellEffect", "Statistiques", "Trunk", "Users", 
														 "RealmServer", "RealmThread", "Pending", 
														 };//TODO
//	public static Class<?>  synClasses[][] = {{Syn.class, CodeInput.class, Commands.class, ConditionParser.class, Constants.class, CryptManager.class, Formulas.class}, {GameServer.class, GameThread.class}, {} };//TODO
	//public static Class<?>  Classes[][] = {{int.class, java.lang.String.class, String.class, Constants.class, Formulas.class}, {GServer.class, GClient.class, GHandler.class, GGameHandler.class}, {} };//TODO
	public static String ancestraPackages[] = {"common", "Client", "colis�", "game", "Loader", "master", "objects", "realm"};
	public static String ancestraKeyVariables[] = {"_perso", "_compte", "_out"};
	
	/*
	public static void parseMessage(LAccount compte, GPersonnage perso, String msg){
		debug("msg = "+msg);
		while(msg.contains("/*")){ //enleve les commentaires multi-lignes pos�s dans le code
			msg = msg.substring(0, searchStringIndex(msg, "/*")-1) + msg.substring(searchStringIndex(msg, "*/
/*           ")+1, msg.length());
			debug("msg = "+msg);
		}
		//msg.replace(" ", "");
		String lines[] = breakToLines(msg);
		//OperationsOrder[]....
		String methodsRef[] = Finders.findMethodsReferences(lines);
		String classesRef[] = Finders.findClassesReferences(lines);
		String keyWordsRef[] = Finders.findKeyWordsReferences(lines);
		String keyCharsRef[] = Finders.findKeyCharsReferences(lines);
		String identifiersRef[] = Finders.findIdentifiersReferences(lines);
		String operatorsRef[] = Finders.findOperatorsReferences(lines);
		//String stringsRef[] = Finders.findStringsReferences(lines);
		debug("Going into methodsRef for");
		for(int i = 0; i < methodsRef.length; i++){
			info(methodsRef[i]);
		}
		debug("Going into classesRef for");
		for(int i = 0; i < classesRef.length; i++){
			info(classesRef[i]);
		}
		debug("Going into keyWordsRef for");
		for(int i = 0; i < keyWordsRef.length; i++){
			info(keyWordsRef[i]);
		}
		debug("Going into keyCharsRef for");
		for(int i = 0; i < keyCharsRef.length; i++){
			info(keyCharsRef[i]);
		}
		debug("Going into identifiersRef for");
		for(int i = 0; i < identifiersRef.length; i++){
			info(identifiersRef[i]);
		}
		debug("Going into operatorsRef for");
		for(int i = 0; i < operatorsRef.length; i++){
			info(operatorsRef[i]);
		}
		//debug("Going into stringsRef for");
		//for(int i = 0; i < stringsRef.length; i++){
		//	info(stringsRef[i]);
		//}
		for(int i = 0; i<lines.length; i++){
			debug("line["+i+"] = "+lines[i]);
			if(lines[0].startsWith("")){//keyWords
				
			}else if(lines[0].startsWith("")){//keyChars
				
			}else if(lines[0].startsWith("")){//keyTitles
				
			}else if(lines[0].startsWith("")){//identifiers
				
			}else if(lines[0].startsWith("")){//others
				
			}else if(lines[0].startsWith("")){//ancestraClassesNames
				
			}
			
		}
		/* //exemple qui enleve le premier charactere "G" trouv� dans la string, 
		//mettre dans un while pour �liminer TOUS les char correspondants comme en haut le /*
		msg = msg.substring(0, searchStringIndex(msg, "G")) + msg.substring(searchStringIndex(msg, "G")+1, msg.length());
		debug("msg = "+msg);
		//Exemple expliquant d'ou vient les -1,+1,-X etc
		String toRemove = "blabla";
		msg = msg.substring(0, searchStringIndex(msg, toRemove)-toRemove.length()+1) + msg.substring(searchStringIndex(msg, toRemove)+1, msg.length());
		debug("msg = "+msg);
		//Exemple avec removeRegion
		msg = removeStringRegion(msg,"DOC","HOUSE", false);
		debug("msg = "+msg);*/
//	}
	
/*	public static Object evaluate(GPersonnage perso, String str, Object variables[], String variablesNames[]){
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		Object toReturn = null;
		//if(str.contains("SocketManager")){
		//	SocketManager sm = new SocketManager();
		//	engine.put("SocketManager", sm);
		//}
		if(perso != null){
			if(str.contains("_perso")){
				engine.put("_perso", perso);
				if(str.contains("_compte")){
					engine.put("_compte", perso.getAccount());
				}
			}
		}
		if(variables != null && variablesNames != null){
			for(int i = 0; i < variables.length; i++){
				if(variablesNames[i] != null){
					engine.put(variablesNames[i], (Object)variables[i]);
				}
			}
		}
		try {
			toReturn = engine.eval(str);
		} catch (ScriptException e) {e.printStackTrace();}
		
		return toReturn;
	}
	
	public static String[] breakToLines(String str){
		char temp = 'x';
		for(int i = 0; i < str.length(); i++){
			temp = str.charAt(i);
			if(temp == '{' || temp == '}' || temp == ';'){
				str = str.substring(0, i+1)+"###@@@###" + str.substring(i+1, str.length());
			}
		}
		String lines[] = str.split("###@@@###");
		for(int i = 0; i<lines.length; i++){
			info("line"+i+" = "+lines[i]);
		}
		return lines;
	}
*/	
	
	/**
	 * Retourne une method appel�e sous le format suivant: <p>
	 * "packageName.className.methodName(int 3, String allo, Long 19);" <p>
	 * (Les args pr�sent�s sont arbitraires et servent seulement d'exemples)
	 */
	public static Method getMethod(String input){
		try{
			//Nom de package/classe/method
			String patente = CodeInput.removeStringRegion(input, "(", ")", false);
			String path[] = new String[2];
			path[1] = patente.substring(patente.lastIndexOf(".")+1);
			path[0] = patente.substring(0, patente.lastIndexOf("."));
			
			Method m = CodeInput.getMethod(path[0], path[1], null);
			
			//Parametres
			if(CodeInput.getStringRegion(input, "(", ")", true).length() <= 1){//Aucun param�tres
				if(m != null){ //important
					return m;
				}
				return null;
			}
			String strParams[] = CodeInput.getStringRegion(input, "(", ")", true).split(", ");
			Object values[] = new Object[strParams.length];
			for(int i = 0; i<strParams.length; i++){
				values[i] = strParams[i].split(" ")[1];
			}
			Class<?> params[] = new Class<?>[strParams.length];

			
			for(int i = 0; i<strParams.length; i++){
				if(strParams[i].split(" ")[0].toLowerCase().contains("string")){
					params[i] = CodeInput.getClass("java.lang.String");
					values[i] = values[i].toString();
				}else
				if(strParams[i].split(" ")[0].toLowerCase().contains("int")){
					params[i] = int.class;
					values[i] = Integer.parseInt(values[i].toString());
				}else
				if(strParams[i].split(" ")[0].toLowerCase().contains("short")){
					params[i] = short.class;
					values[i] = Short.parseShort(values[i].toString());
				}else
				if(strParams[i].split(" ")[0].toLowerCase().contains("long")){
					params[i] = long.class;
					values[i] = Long.parseLong(values[i].toString());
				}else
				if(strParams[i].split(" ")[0].toLowerCase().contains("object")){
					params[i] = Object.class;
					values[i] = values[i];
				}else{
					params[i] = CodeInput.getClass(strParams[i].split(" ")[0]);
					values[i] = values[i];
				}
			}
			
			m = CodeInput.getMethod(path[0], path[1], params);
			if(m != null){ //important
				return m;
			}
		} catch (IllegalArgumentException e) {e.printStackTrace();}
		return null;
	}

	/**
	 * 
	 * @param input - La String contenant l'appelation complete de la methode
	 * @return - Retourne l'objet retourné par la method, ou null si elle ne retourne rien.
	 */
	public static Object callMethod(String input){
		try{
			//Nom de package/classe/method
			String patente = CodeInput.removeStringRegion(input, "(", ")", false);
			String path[] = new String[2];
			path[1] = patente.substring(patente.lastIndexOf(".")+1);
			path[0] = patente.substring(0, patente.lastIndexOf("."));
			
			//Parametres
			if(CodeInput.getStringRegion(input, "(", ")", true).length() <= 1){//Aucun paramètres
				if(CodeInput.getMethod(path[0], path[1], null) != null){ //important
					//Syn.d("TRYING to invoke Method");
					if(CodeInput.getMethod(path[0], path[1], null).getReturnType() == null){
						//Syn.d("invokingMethod");
						CodeInput.getMethod(path[0], path[1], null).invoke(null, (Object[])null);
					}else{
						//Syn.d("invokingMethod");
						return CodeInput.getMethod(path[0], path[1], null).invoke(null, (Object[])null);
					}
				}else{
					//Syn.d("FAILED to invoke Method ->"+input);
				}
				return null;
			}
			String strParams[] = CodeInput.getStringRegion(input, "(", ")", true).split(", ");
			Object values[] = new Object[strParams.length];
			for(int i = 0; i<strParams.length; i++){
				values[i] = strParams[i].split(" ")[1];
			}
			Class<?> params[] = new Class<?>[strParams.length];

			
			
			for(int i = 0; i<strParams.length; i++){
				if(strParams[i].split(" ")[0].contains("String")){
					params[i] = CodeInput.getClass("java.lang.String");
					values[i] = values[i].toString();
				}else
				if(strParams[i].split(" ")[0].contains("int")){
					params[i] = int.class;
					values[i] = Integer.parseInt(values[i].toString());
				}else
				if(strParams[i].split(" ")[0].contains("short")){
					params[i] = short.class;
					values[i] = Short.parseShort(values[i].toString());
				}else
				if(strParams[i].split(" ")[0].contains("long")){
					params[i] = long.class;
					values[i] = Long.parseLong(values[i].toString());
				}else
				/*if(strParams[i].split(" ")[0].contains("Personnage")){
					params[i] = GPersonnage.class;
					values[i] = perso;
				}else	
				if(strParams[i].split(" ")[0].contains("Compte")){
					params[i] = LAccount.class;
					values[i] = perso.getAccount();
				}else*/{
					params[i] = CodeInput.getClass(strParams[i].split(" ")[0]);
				}
			}
			
			if(CodeInput.getMethod(path[0], path[1], params) != null){ //important
				if(CodeInput.getMethod(path[0], path[1], params).getReturnType() == null){
					CodeInput.getMethod(path[0], path[1], params).invoke(null, values);
				}else{
					return CodeInput.getMethod(path[0], path[1], params).invoke(null, values);
				}
			}
		} catch (IllegalArgumentException e) {e.printStackTrace();
		} catch (IllegalAccessException e) {e.printStackTrace();
		} catch (InvocationTargetException e) {	e.printStackTrace();}
		return null;
	}
	
	
	
	/**
	 * PS: la classe prise est trouv�e en statique,... pas d'objet, donc variables statiques aussi, mais t'as des get/setters ;)
	 * <p>UPPER and lower cases are important. The returned value may be null if it doesn't exist.. 
	 * @param className - The package + class name of the class where the field is declared. Ex: common.Ancestra
	 * @param fieldName - Le nom de la variable
	 * @return - La valeur de la variable
	 */
	public static Object getClassField(String className, String fieldName){
		try {
			Class<?> classe = getClass(className);
			Field[] fields = classe.getDeclaredFields();
	        
	        //Loop through the variables and print out their types + names + values
	        for (Field field : fields) {
				if(field.getName() == fieldName){
					return field.get(field);
				}
			}
		} catch (IllegalArgumentException e) {e.printStackTrace();
		} catch (IllegalAccessException e) {e.printStackTrace();}
		return null;
	}
	
	/**
	 * PS: Desfois ca utilise pas la bonne methode donc ce n'est pas fiable a 100%
	 * <p>UPPER and lower cases are important.The returned method may be null if it doesn't exist.. 
	 * @param className - The package + class name of the class where the method is invoked from. Ex: common.Ancestra
	 * @param methodName - The name of the method.
	 * @param parameterTypes - Une array contenant les classes des types de parametres de la methode recherch�e. Dans l'ordre.
	 * @return - The method 
	 */
	public static Method getMethod(String className, String methodName, Class<?> parameterTypes[]){
		Class<?> classe = getClass(className);
		try {
			if(classe != null){
				//Syn.d("FOUND CLASS");
				if(parameterTypes == null){
					Method[] methods = classe.getDeclaredMethods();
			        //Loop through the methods and sets
			        for(Method method : methods) {
			        	if(method.getName().equals(methodName)){//non fiable
			        		return method;
			        	}
			        }
				}else{ 
					//pour retourner EXACTEMENT la bonne m�thode 
					//en fonction des types de parametres fournis
					//le return type n'est pas pris en compte et peut se tromper sur ce point
					/** Attempt pour prendre en compte le returnType ici v
					 * while(classe.getDeclaredMethod(methodName, parameterTypes).getReturnType() != returnType){
						classe.getDeclaredMethod(methodName, parameterTypes).getNext...
					}*/
					return classe.getDeclaredMethod(methodName, parameterTypes);
				}
			}else{
				//Syn.d("NO CLASS");
				return null;
			}
		} catch (SecurityException e) {e.printStackTrace();
		} catch (NoSuchMethodException e) {e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * UPPER and lower cases are important. The returned class may be null if it doesn't exist.. 
	 * @param className - The package + class name of the class where the method is invoked from. Ex: common.Ancestra
	 * @return - The Class 
	 */
	public static Class<?> getClass(String className){
		if(className.equals("System")){
			return System.class;
		}
		if(className.equals("int")){
			return int.class;
		}
		if(className.equals("short")){
			return short.class;
		}
		if(className.equals("long")){
			return long.class;
		}
		if(className.equals("Object")){
			return Object.class;
		}
		if(className.equals("String")){
			return CodeInput.getClass("java.lang.String");
		}
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		return null;
	}
	
	/**
     * Lists the methods of a class using the Reflection api.
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
     */
	public static void getClassVariablesList(Class<?> classe){
        
    	Field[] fields = classe.getDeclaredFields();
        
        //Loop through the variables and print out their types + names + values
        for (Field field : fields) {
			try {
				Utils.wD(field.getType().getSimpleName()+" "+field.getName()+" = "+field.get(field));
			} catch (IllegalArgumentException e) {e.printStackTrace();
			} catch (IllegalAccessException e) {e.printStackTrace();}
		}
    }
	
	/**
     * Lists the methods of a class using the Reflection api.
     */
	public static void getClassMethodsList(Class<?> classe) {
        
        //Get the methods
        Method[] methods = classe.getDeclaredMethods();
        
        //Loop through the methods and print out their names + parameter types
        for (Method method : methods) {
        	String params = "(";
        	for(Class<?> param : method.getParameterTypes()){
        		if(params == "("){
        			params += param.getSimpleName();
        		}else{
        			params += ", "+param.getSimpleName();
        		}
        	}
        	Utils.wD(method.getName()+params+")");
        }
    }
    
    /**
     * Lists the classes of a package using the Reflection api.
     * bof...pas mal replaced par Class.forName(packagerName.className); (getClass en l'occurence)
     */
   /* @SuppressWarnings("rawtypes")
	public static void getPackageClassList(Package pack) {
        
        //Get the methods
        Class[] classes = pack.;
        
        //Loop through the methods and print out their names
        for (Method method : methods) {
        	String params = "(";
        	for(Class<?> param : method.getParameterTypes()){
        		if(params == "("){
        			params += param.getSimpleName();
        		}else{
        			params += ", "+param.getSimpleName();
        		}
        	}
            System.out.println(method.getName()+params+")");
        }
    }*/
	
	
	/**
	 * @param str - La String de base.
	 * @param start - String correspondant au d�part de la r�gion � enlever. Exemple: /*
	 * @param end - String correspondant � la fin de la r�gion � enlever. Exemple:   * /
	 * @param loop - Si on loop � travers la String de base pour delete toutes les r�gions qui matchent ou juste la premi�re
	 * @return - La String modifi�e (sans la r�gion sp�cifi�e).
	 */
	public static String removeStringRegion(String str, String start, String end, boolean loop){
		if(loop == false){
			str = str.substring(0, searchStringIndex(str, start)-start.length()+1) + str.substring(searchStringIndex(str, end)+1, str.length());
			return str;
		}else{
			while(str.contains(start) && str.contains(end)){
				str = str.substring(0, searchStringIndex(str, start)-start.length()+1) + str.substring(searchStringIndex(str, end)+1, str.length());
			}
		}
		return str;
	}
	
	/**
	 * @param str - La String de base.
	 * @param start - String correspondant au départ de la région à enlever. Exemple: /*
	 * @param end - String correspondant à la fin de la ràgion à enlever. Exemple:   * /
	 * @return - La première région de la string correspondante aux critères
	 */
	public static String getStringRegion(String str, String start, String end, boolean removeStartAndEnd){
		if(removeStartAndEnd){
			int startIndex = searchStringIndex(str, start)+1;
			return str.substring(
				startIndex, 
				searchStringIndex(str.substring(startIndex), end)-end.length()+startIndex+1
				);
		}else{
			int startIndex = searchStringIndex(str, start)-start.length()+1;
			try{
				return str.substring(
					startIndex, 
					searchStringIndex(str, end)+startIndex+1
					);
			}catch(Exception e){
				e.printStackTrace();
				Utils.wD("startIndex = "+startIndex+"  str = "+str);
				return end;
			}
		}
	}
	
	/**
	 * trouve l'index d'une suite de charactere dans une string
	 * <p>exemple d'application: enlever un commentaire avec des /* * / dans une string
	 * @param msg�- String de base
	 * @param cs - Suite de charact�re � chercher
	 * @return l'index du dernier charactere de la sequence
	 */
	public static int searchStringIndex(String msg, CharSequence cs){
		char charsMatching[] = new char[cs.length()];
		int index = -1;
		for(int i = 0; i < msg.length(); i++){
			//info("enter i for");
			if(msg.charAt(i) == cs.charAt(0)){
				index = i;
				if(cs.length() > 1){
					for(int y = 0; y < cs.length(); y++){
						//info("[y]enter y for");
						if(msg.charAt(i+y) == cs.charAt(y)){
							//info("[y]char is equal. i="+i+"....y="+y);
							index = i+y;
							charsMatching[y] = cs.charAt(y);
						}else{
							//info("[y]char is NOT equal");
							index = -1;
							break;
						}
					}
				}
				if(index != -1){
					//debug("TRUE");
					//debug("allo, on l'a trouvé. index = "+index+" = "+msg.charAt(index));
					return index;
				}
			}
		}
		//debug("FALSE");
		return -1;
	}
	
	
	//exemple de code � input: 
	/*
	 if (_perso.get_fight() != null) {
         SocketManager.GAME_SEND_BN(_out);
     }else{
		 //Carte map = _perso.get_curCarte();
         // Case cell = _perso.get_curCell();
         boolean found = false;
         for(Case cases : _perso.get_curCarte().GetCases().values()){
            if(cases.getPersos().isEmpty() == false){
                 for(Personnage perso : cases.getPersos().values()){
                     if(perso.isOnline() == false && perso.get_GUID() == _perso.get_GUID()){
                     	found = true;
                         cases.removePlayer(perso.get_GUID());
                         SocketManager.GAME_SEND_ERASE_ON_MAP_TO_MAP(perso.get_curCarte(), perso.get_GUID());
                         _perso.teleport(perso.get_curCarte().get_id(), perso.get_curCell().getID());
                         SocketManager.GAME_SEND_MESSAGE(_perso, "Votre double a bien �t� supprim�", Ancestra.COLOR_BLEU);
                         break;
                     }
                 }
             }
         }          
        // _perso.teleport(map.get_id(), cell.getID());
         if(found == false){
         	 SocketManager.GAME_SEND_MESSAGE(_perso, "Votre double n'a pas �t� trouv�, peut-�tre est-il sur une autre map. Veuillez vous placer sur la m�me map que votre double", Ancestra.COLOR_BLEU);
         }
     }
	
	*/
	
	public static String reverseString(String str){
		String str1 = "";
		for(int i = str.length()-1; i >= 0; i--){
			str1 += str.charAt(i);
		}
		return str1;
	}
	
}
