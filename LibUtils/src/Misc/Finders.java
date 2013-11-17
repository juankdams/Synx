package Misc;

import java.util.regex.Matcher;


/**
 * But: Trouver et retourner sous forme de String[] les r�f�rences � X dans une String donn�e
 * @author Robyn
 *
 */
public class Finders{ 
	
	
	public static String operators[] = CodeInput.operators;
	public static String verifiers[] = CodeInput.verifiers;
	public static String keyWords[] = CodeInput.keyWords;
	public static String keyChars[] = CodeInput.keyChars;
	public static String keyTitles[] = CodeInput.keyTitles;
	public static String identifiers[] = CodeInput.identifiers;
	
	public static String others[] = CodeInput.others;
	public static String stringMethods[] = CodeInput.stringMethods;
	public static String integersMethods[] = CodeInput.integersMethods;
	public static String longMethods[] = CodeInput.longMethods;
	public static String shortMethods[] = CodeInput.shortMethods;
	
	public static String ancestraClassesNames[] = CodeInput.ancestraClassesNames;
	//public static Class<?>  ancestraClasses[][] = CodeInput.ancestraClasses;
	public static String ancestraPackages[] = CodeInput.ancestraPackages;
	public static String ancestraKeyVariables[] = CodeInput.ancestraKeyVariables;
	
	
	
	
	
	
	
	//TODO: ajouter des while � chaque finder 
	//pour permettre de trouver plusieurs fois un meme item dans une meme ligne
	//Aussi mettre qqc d'utile du genre l'index de l'item trouv� dans son array
	// ou plutot, faire les arrays en [][], le premier �tant le num de la ligne, 
	//  le deuxieme contient les r�f�rences dans lordre dapparition dans la ligne
	//TODO: aussi tout transformer en Object le plus t�t possible
		
		public static String[] findMethodsReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < ancestraClassesNames.length; y++){//cherche chaque nom de classe dans la ligne
					while(tempLine.contains(ancestraClassesNames[y]+".")){
						//pr�paration au tableau de methodes Ancestrales x)
						str += CodeInput.getStringRegion(tempLine, ancestraClassesNames[y]+".", "(", false).replace("(", "")+"###@@@###";
						tempLine = "("+CodeInput.removeStringRegion(tempLine, ancestraClassesNames[y]+".", "(", false);
					}
				}
			}
			String methods[] = str.split("###@@@###");
			return methods;
		}
		
		public static String[] findClassesReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < ancestraClassesNames.length; y++){//cherche chaque nom de classe dans la ligne
					//if(lines[i].contains(ancestraClassesNames[y])){
					// str += ancestraClassesNames[y]+"###@@@###";//pr�paration au tableau de classes Ancestrales x)
					//}
					while(tempLine.contains(ancestraClassesNames[y])){
						//pr�paration au tableau de methodes Ancestrales x)
						str += ancestraClassesNames[y]+"###@@@###";
						tempLine = Matcher.quoteReplacement(tempLine);
						tempLine = tempLine.replaceFirst(ancestraClassesNames[y], "");
					}
				}
			}
			String classes[] = str.split("###@@@###");
			return classes;
		}
		
		public static String[] findKeyWordsReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < keyWords.length; y++){
					//if(lines[i].contains(keyWords[y])){
					//	str += keyWords[y]+"###@@@###";//pr�paration au tableau de keyWords
					//}
					while(tempLine.contains(keyWords[y])){
						//pr�paration au tableau de keyWords Ancestrales x)
						str += keyWords[y]+"###@@@###";
						tempLine = Matcher.quoteReplacement(tempLine);
						tempLine = tempLine.replaceFirst(keyWords[y], "");
					}
				}
			}
			String Words[] = str.split("###@@@###");
			return Words;
		}
		
		public static String[] findKeyCharsReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < keyChars.length; y++){
					//if(lines[i].contains(keyChars[y])){
					//	str += keyChars[y]+"###@@@###";//pr�paration au tableau de keyChars
					//}
					while(tempLine.contains(keyChars[y])){
						//pr�paration au tableau de keyChars Ancestrales x)
						str += keyChars[y]+"###@@@###";
						tempLine = Matcher.quoteReplacement(tempLine);
						tempLine = tempLine.replaceFirst(keyChars[y], "");
					}
				}
			}
			String Chars[] = str.split("###@@@###");
			return Chars;
		}
		
		public static String[] findStringsReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				while(CodeInput.getStringRegion(tempLine, "\"", "\"", false) != null){
					str += CodeInput.getStringRegion(tempLine, "\"", "\"", false)+"###@@@###";//pr�paration au tableau de strings
					tempLine = Matcher.quoteReplacement(tempLine);
					tempLine = CodeInput.removeStringRegion(tempLine, "\"", "\"", false);
				}
			}
			String strings[] = str.split("###@@@###");
			return strings;
		}
		
		public static String[] findIdentifiersReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < identifiers.length; y++){
					//if(lines[i].contains(identifiers[y])){
					//	str += identifiers[y]+"###@@@###";//pr�paration au tableau de identifiers
					//}
					while(tempLine.contains(identifiers[y])){
						//pr�paration au tableau de identifiers
						str += identifiers[y]+"###@@@###";
						tempLine = Matcher.quoteReplacement(tempLine);
						tempLine = tempLine.replaceFirst(identifiers[y], "");
					}
				}
			}
			String identifierss[] = str.split("###@@@###");
			return identifierss;
		}
		
		public static String[] findOperatorsReferences(String lines[]){
			String str = "";
			String tempLine = "";
			for(int i = 0; i < lines.length; i++){//passe chaque ligne une a la fois
				tempLine = lines[i];
				for(int y = 0; y < operators.length; y++){
					//if(lines[i].contains(operators[y])){
					//	str += operators[y]+"###@@@###";//pr�paration au tableau de operators
					//}
					while(tempLine.contains(operators[y])){
						//pr�paration au tableau de operators 
						str += operators[y]+"###@@@###";
						tempLine = Matcher.quoteReplacement(tempLine);
						tempLine = tempLine.replaceFirst(operators[y], "");
					}
				}
			}
			String operatorss[] = str.split("###@@@###");
			return operatorss;
		}
		
		
	}
