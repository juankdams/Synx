package Enums;

import java.util.HashMap;
import java.util.regex.Pattern;

import Constants.Constants;
import Core.Exceptions;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques.CharacteristicColumn;
import Interfaces.IObject;
import Misc.Utils;

public enum Condition {

	
	/*
	 
	 //Trouvé ça dans  dofus.datacenter.Item et dans le lang au champs ITEM_CHARACTERISTICS.
	  * 
	 //ITEM_CHARACTERISTICS = "Force,Force de base,Vitalité,Vitalité de base,Agilité,Agilité de base,Intelligence,Intelligence de base,Sagesse,Sagesse de base,Chance,Chance de base,Alignement,Classe,Niveau de métier,Métier courant,Apparence,Alignement,Nom,Attitude,Objet,Sexe,Mariage,Niveau,Kamas,Don,Spécialisation,Alignement,Niveau d\'alignement,Grade,Abonné,PM";
      
      _loc12 = new ank.utils.ExtendedString(_loc12).replace(["CS", "Cs", "CV", "Cv", "CA", "Ca", "CI", "Ci", "CW", "Cw", "CC", "Cc", "CA", "PG", "PJ", "Pj", "PM", "PA", "PN", "PE", "<NO>", "PS", "PR", "PL", "PK", "Pg", "Pr", "Ps", "Pa", "PP", "PZ", "CM"], this.api.lang.getText("ITEM_CHARACTERISTICS").split(","));
	 
	 
	 http://dozenofelites.com/index.php?/topic/266-liste-des-conditions/page__hl__conditions
	 */
	
	//Conditions de charactéristiques
	FORCE("CS"),//(Strenght)
	FORCE_BASE("Cs"),
	VITALITE("CV"),
	VITALITE_BASE("Cv"),
	AGILITE("CA"),
	AGILITE_BASE("Ca"),
	INTELLIGENCE("CI"),
	INTELLIGENCE_BASE("Ci"),
	SAGESSE("CW"),//(Wisdom)
	SAGESSE_BASE("Cw"),
	CHANCE("CC"),
	CHANCE_BASE("Cc"),
//TODO CORRIGER	ALIGNMENT_CHARAC("CA"),
	PM("CM"),//Movement Points (Points de mouvement (PM))
	
	//Conditions de personnage
	CLASSE("PG"),
	JOB_LEVEL("PJ"),
	JOB_CURRENT("Pj"),
	APPARENCE("PM"),
	ALIGNMENT_PERSO("PA"),
	NAME("PN"),
	EMOTE("PE"),//Emotes a.k.a Attitues
	OBJECT("<NO>"),
	SEXE("PS"),//0 = Male, 1 = Femme
	MARIAGE("PR"),
	LEVEL("PL"),
	KAMAS("PK"),
	DON("Pg"),//TODO Ptete utile pour la colonne "Don" dans les characs avancées ?
	ALIGNMENT_SPECIALIZATION("Pr"),//Rang
	ALIGNMENT("Ps"),//Bontarien ou Brakmarien ou Mercenaire
	ALIGNMENT_LEVEL("Pa"),//Niveau
	ALIGNMENT_GRADE("PP"),//Grade (0 à 10)
	GM_LEVEL("PX"),//GmLevel du compte
	PREMIUM("PZ"),//Si abonné : 1. Sinon: 0
	
	GLOBAL_ACTION_LISTENER("GL"),//GL=1 -> 1 = l'ID du listener qui faut qui soit complété pour return true;
	MAP_ACTION_LISTENER("ML"),//ML=1 -> 1 = l'ID du listener qui faut qui soit complété pour return true;
	CELL_OCCUPIED("OC"),//OC=345 -> 345 = l'ID de la cell qui doit être occupée pour return true;
	CELL_OCCUPIED_BY("OY"),//OY=625 ->si la cellID du perso = la cellID de la condition (625)
	MAP_OCCUPIED_BY("MY"),//MY=625 ->si la mapID du perso = la mapID de la condition (625)
	AREA_OCCUPIED_BY("AY"),
	SUBAREA_OCCUPIED_BY("SY"),
	SUPERAREA_OCCUPIED_BY("SS"),
	ITEM_USED("IU"),//IU=7618  -> 7618 = ID d'item qui doit avoir été utilisé you know
	ITEM_TYPE_USED("TU"),//TU=12 -> 12 = le type d'item template qui doit avoir été utilisé you know
	;	
	

	private static final char egal = '=';
	private static final char inegal = '!';
	private static final char stringEgal = '~';
	private static final char superieur = '>';
	private static final char inferieur = '<';
	private static final char et = '&';
	private static final char ou = '|';
	
	
	private static HashMap<String, Condition> conditions = new HashMap<String, Condition>(50);
	
	static{
		for(Condition c : values()){
			conditions.put(c.getSymbol(), c);
		}
	}
	
	
	//--------------------------------------------------------------------------------
	//OBJET ------------------------------------------------------------------------
	
	
	private String symbol = "";
	private Condition(String symbol){
		this.symbol = symbol;
	}
	public String getSymbol(){
		return symbol;
	}
	public boolean isCharacteristic(){
		return (symbol.startsWith("C"));
	}
	public CharacteristicColumn getCharacteristicColumn(){
		if(symbol.toUpperCase().equals(symbol)){ //Si le symbol est déjà tout en majuscules.
			return CharacteristicColumn.TOTAL;
		}else{//Si le symbol contient du minuscule (Ex une characteristique de base)
			return CharacteristicColumn.BASE;
		}
	}
	public CharacteristicType getCharacteristic(){
		if(symbol.toUpperCase().equals(symbol)){ //Si le symbol est déjà tout en majuscules.
			return CharacteristicType.valueOf(this.name());
		}else{//Si le symbol contient du minuscule (Ex une characteristique de base)
			return CharacteristicType.valueOf(this.name().substring(0, this.name().indexOf("_")));
		}
	}
	
	public static Condition getCondition(String symbol){
		return conditions.get(symbol);
	}
	
	
	
	
	
	//--------------------------------------------------------------------------------
	//STATIC ------------------------------------------------------------------------
	

	private static boolean operate(short valueCond, long valueCharac, char operator){
		switch(operator){
			case egal:
			case stringEgal:
				return valueCond == valueCharac; 
			case inegal:
				return valueCond != valueCharac;
			case superieur:
				return valueCond < valueCharac;
			case inferieur:
				return valueCharac > valueCond;
			case et:
				return (valueCond == 1 && valueCharac == 1); 
			case ou:
				return (valueCond == 1 || valueCharac == 1); 
			default: 
				return false;
		}
	}
	
	/**
	 * Retun 0 ou 1 (False ou true)
	 * @param cond - La condition à évaluer. Ex: CA>10  (Agilité totale en haut de 10)
	 * @param p
	 * @return
	 */
	private static byte parseOneExpression(String cond, GPersonnage p, IObject param){
		Condition c = Condition.getCondition(cond.substring(0, 2));
		//Syn.d("cond.substring(0, 2) = "+cond.substring(0, 2));
		if(c == null){
			return 0;
		}
		//FIXME: Faire les conditions de métier et toutes les autres conditions qui contiennent des ","
		if(cond.indexOf(",") != -1){
			Exceptions.log.error("Dans Condition.parseOneExpression:  manque les expressions avec des virgules (Métiers..)");
			return 1;
		}
		short valueCond = -1;
		long valueCharac = -2;
		if(c == Condition.NAME){
			if(cond.substring(3).equals(p.getName())){
				valueCond = 0;
				valueCharac = 0;
			}
		}else
		if(c.isCharacteristic()){//Si on parse une condition sur les caractéristiques
			 if(Pattern.matches(Constants.isNumberPattern, cond.substring(3))){
					valueCond = Short.parseShort(cond.substring(3));
					valueCharac = p.getStatistique().getValue(c.getCharacteristic().get(), c.getCharacteristicColumn());
			}else{
				return 0;//Si le chiffre à droite de l'opérateur n'est pas parsable en int -> return false à cause d'une mauvaise valeur
			}
		}else{
			if(Utils.isParsableInteger(cond.substring(3))){
				valueCond = Short.parseShort(cond.substring(3));
			}
			switch(c){
				case CLASSE://PG
					valueCharac = p.getClassID();
					break;
				//case JOB_LEVEL://PJ.  Exemple sur l'item 1702: PJ>2,40|PJ>24,40|PJ>36,40|PJ>28,40|PJ>26,40|PJ>41,40  
					//valueCond1 = Short.parseShort(cond.substring(3).split(",")[0]);//JobID
					//valueCond2 = Short.parseShort(cond.substring(3).split(",")[1]);//JobLevel
					//valueCond1 = p.getJob(valueCond1)
					//valueCond2 = p.getJob(valueCond2)
					//	break;
				//case JOB_CURRENT:
				//	break;
				case APPARENCE://PM
					valueCharac = p.getGfxID();
					break;
				case ALIGNMENT_PERSO://Inexistant dans le item_432_fr.swf
					break;
				case EMOTE://Inexistant dans le item_432_fr.swf
					break;
				case OBJECT://S'il possede ou pas un certain template d'objet
					if(p.getInventory().getItemByID(valueCond) != null){
						valueCharac = valueCond;//dans ce cas il le possede bien
					}
					break;
				case SEXE:
					valueCharac = p.getSexe();
				case MARIAGE:
					//TODO valueCharac = p.isMarried()?1:0;
					break;
				case LEVEL:
					valueCharac = p.getLevel();
					break;
				case KAMAS:
					valueCharac = p.getKamas();
					break;
				case DON://todo Ex:  "Don = Art du Camouflage."  ou  "Don = Connaissance des potions."
					break;
				case ALIGNMENT_SPECIALIZATION://Inexistant dans le item_432_fr.swf
					break;
				case ALIGNMENT://Ps
					valueCharac = p.getAlignementSpecialization();
					break;
				case ALIGNMENT_LEVEL://Pa
					if(p.getAlignement() != null){
						valueCharac = p.getAlignement().getLevel();
					}
					break;
				case ALIGNMENT_GRADE:
					valueCharac = p.getStatistique().getGrade(p.getWorld());
					break;
				case GM_LEVEL:
					valueCharac = p.getAccount().getGM();
				case PREMIUM:
					valueCharac = p.getAccount().isPremium()?Constants.ONE_SHORT:Constants.ZERO_SHORT;
					break;
				case GLOBAL_ACTION_LISTENER:
					if(p.getWorld().getListener(valueCond).isCompleted(p, param)){
						valueCharac = valueCond;
					}
					break;
				case MAP_ACTION_LISTENER:
					if(p.getMap().getActionsListener(valueCond).isCompleted(p, param)){
						valueCharac = valueCond;
					}
					break;
				case CELL_OCCUPIED:
					if(p.getMap().isCellOccupied(valueCond)){
						valueCharac = valueCond;
					}
					break;
				case CELL_OCCUPIED_BY:
					//valueCond = Short.parseShort(cond.substring(3, cond.indexOf(",")));
					//valueCond1 = Short.parseShort(cond.substring(cond.indexOf(",")+1)); 
					//		| -> exemple l'ID d'un pnj ou monstre qui se promene sur la map :o
					//if(p.getMap().isCellOccupiedBy(valueCond,p.getID())){
					//	valueCharac = valueCond;
					//}
					valueCharac = p.getCellID();
					break;
				case MAP_OCCUPIED_BY:
					valueCharac = p.getMapID();
					break;
				case AREA_OCCUPIED_BY:
					valueCharac = valueCond;//TODO Conditions AREA_OCCUPIED_BY
					break;
				case SUBAREA_OCCUPIED_BY:
					valueCharac = valueCond;//TODO Conditions SUBAREA_OCCUPIED_BY
					break;
				case SUPERAREA_OCCUPIED_BY:
					valueCharac = valueCond;//TODO Conditions SUPERAREA_OCCUPIED_BY
					break;
				case ITEM_USED:
					valueCharac = ((GItem)param).getTemplate().getID();
					break;
				case ITEM_TYPE_USED:
					if(param instanceof GItem){
						valueCharac = ((GItem)param).getTemplate().getType();
					}
					break;
					
			}
		}
		//Si la condition est remplie
		if(Condition.operate(valueCond, valueCharac, cond.charAt(2))){
			return 1;
		}
		return 0;
	}
	
	
	private static byte parseTwoExpressions(byte comparativeResult, String newCond, char operator, GPersonnage p, IObject param){
		if(operator == ou){
			if(comparativeResult == 1 || parseOneExpression(newCond, p, param) == 1){
				return 1;
			}
		}else if(operator == et){
			if(comparativeResult == 1 && parseOneExpression(newCond, p, param) == 1){
				return 1;
			}
		}
		return 0;
	}
	
	private static byte parseAndsExpressions(String[] ands, GPersonnage p, IObject param){
		byte firstResult = Condition.parseOneExpression(ands[0], p, param);//Pas besoin de vérifier si ==0, le parseTwoExpressoin s'en occupe
		if(ands.length > 1){
			for(int i = ands.length-1; i >= 0; i--){
				if(Condition.parseTwoExpressions(firstResult, ands[i], et, p, param) == 0){
					return 0;
				}
			}
		}else if(firstResult == 0){
			return 0;
		}
		return 1;
	}
	
	/**
	 * Parse toutes les expressions dans la string, 
	 * 		qu'elles soient séparées par des | ou de & sans probleme. 
	 * <br>On doit enlever les () avant de caller cette method
	 * <br> Donc ici on peut parse, par exemple, ceci:  CS>10 & CS<100 | CA > 5 | CW>10 & CE>10
	 * @param expressions
	 * @param p
	 * @return
	 */
	private static byte parseAllExpressions(String expressions, GPersonnage p, IObject param){
		byte toReturn = 0;
		String ors[] = expressions.split("\\|");
		if(ors.length > 1){//Exemple   CS>10 & CS<100 | CA > 5 | CW>10 & CE>10
						   //Ca donne:	
						   //	split0 =   CS>10 & CS<100
						   //	split1 =   CA > 5
						   //   split2 =   CW>10 & CE>10
			//Syn.d("checkAllCondition  1er if: les ors");
			for(String or : ors){
				if(or.contains("&")){
					//Syn.d("checkAllCondition  1er if: les ors. for(ors).or.contains(&) ");
					toReturn = Condition.parseAndsExpressions(or.split("&"), p, param);
				}else{
					toReturn = Condition.parseOneExpression(or, p, param);
				}
			}
			//Syn.d("toReturn 0= "+toReturn);
		}else if(ors[0].contains("&")){
			//Syn.d("checkAllCondition  2eme if : les ands");
			toReturn = Condition.parseAndsExpressions(expressions.split("&"), p, param);
			//Syn.d("toReturn 1= "+toReturn);
		}else{
			toReturn = Condition.parseOneExpression(expressions, p, param);
			//Syn.d("toReturn 2= "+toReturn);
		}
		//Syn.d("toReturn 3= "+toReturn);
		return toReturn;
	}
	
	/**
	 * Parse absolument toutes les expressions dans les conditions de l'item, y comprit les ()
	 * <br>Exemple: CS>10 & (CS<100 | CA > 5 | CW>10) & CE>10
	 * @param conditions
	 * @param p
	 * @param param - En ce moment, seulement un GItem peut être mit dans ce param. C'est le seul qui sera utilisé lors du parsing de conditions.
	 * @return
	 */
	public static boolean parseConditions(String conditions, GPersonnage p, IObject param){
		boolean toReturn = true;
		if(conditions.contains("(")){
			toReturn = false;
			String a[] = conditions.split("(");
			String b[] = a[1].split(")");
			byte b0 = Condition.parseAllExpressions(b[0], p, param);//L'intérieur
			boolean firstResult = false;//firstResult = le parsing de la gauche avec l'intérieur
			if(a[0].length() > 0){
				byte a0 = Condition.parseAllExpressions(a[0], p, param);//L'extérieur gauche
				firstResult = Condition.operate(a0, b0, conditions.charAt(conditions.indexOf("(")-1));
			}else{
				//Si y'a pas d'expression à gauche de l'intérieur, 
					//prend juste l'intérieur en compte pour le firstResult
				firstResult = (b0 == 1);
			}
			
			if(b[1].length() > 0){
				if(firstResult){
					byte b1 = Condition.parseAllExpressions(b[1], p, param);//L'extérieur droite
					boolean secondResult = Condition.operate(b0, b1, conditions.charAt(conditions.indexOf(")")+1));
					if(secondResult == true){
						toReturn = true;
					}
				}
			}else{
				if(firstResult){
					toReturn = true;
				}
			}
		}else{
			toReturn = (1 == Condition.parseAllExpressions(conditions, p, param));
		}
		return toReturn;
	}
	
	
	
}
