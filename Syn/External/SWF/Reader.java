package SWF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import Core.Syn;
import Misc.CodeInput;
import Misc.Utils;

public class Reader {

	public static void getMapsCoordinates(String path) throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File(path)));
		String line = "";
		HashMap<String, String> maps = new HashMap<String, String>();
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("MA.m[") == -1){
				continue;
			}
			String mapID = CodeInput.getStringRegion(line, "MA.m[", "] = ", true);
			String x = CodeInput.getStringRegion(line, ", x: ", ",", true);
			String y = CodeInput.getStringRegion(line, ", y: ", ",", true);
			String ep = CodeInput.getStringRegion(line, ", ep: ", ",", true);
			String p = CodeInput.getStringRegion(line, ", p: ", ",", true);
			//String music = CodeInput.getStringRegion(line, ", m: ", ",", true);
			//String adjacentSubAreas = CodeInput.getStringRegion(line, ", v: ", ",", true);	
			SQL.Maps.updateMapCoordinates();
		}

		//p: 
		//	[  [ [1029, 1030], 23, "BE>15"],  [ [1029, 1030], 231, "BE>15"]   ]
		System.exit(0);
	}
	
	public static void getSubAreaAreas(String path) throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File(path)));
		String line = "";
		HashMap<Integer, String> areas = new HashMap<Integer, String>();
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("MA.sa[") == -1){
				continue;
			}
			if(line.indexOf(", a:") == -1){
				continue;
			}
			String subAreaID = CodeInput.getStringRegion(line, "MA.sa[", "] = ", true);
			int areaID = Integer.parseInt( CodeInput.getStringRegion(line, ", a: ", ",", true) );
			if(areas.get(areaID) == null){
				areas.put(areaID, subAreaID);
			}else{
				areas.put(areaID,  (areas.get(areaID) + "," + subAreaID) );
			}
		}
		for(Entry<Integer, String> area : areas.entrySet()){
			Syn.w("Area ("+area.getKey()+") SubAreas ("+area.getValue()+") ");
		}
		
		System.exit(0);
	}
	
	
	/*
	 Type30 [NotCursed] I.u[7133] = {p: 1, w: 0, fm: true, wd: false, l: 1, g: 9, ep: 1, d: "N\'importe quel Wabbit vous le dira, si vous ne voulez pas voir la vie en rouge, évitez comme la peste la Mixomawose.", t: 30, n: "Mixomawose"};
	Type30 [NotCursed] I.u[7134] = {p: 1, w: 0, fm: true, wd: false, l: 1, g: 10, ep: 1, d: "On raconte que la rage transforme complètement les êtres atteints. Les personnes belliqueuses deviennent dociles, et les personnes calmes deviennent agressives. En revanche, celles qui bavaient déjà avant continueront de baver.", t: 30, n: "Rage"};
	Type30 [NotCursed] I.u[7135] = {p: 1, w: 0, fm: true, wd: false, l: 1, g: 11, ep: 1, d: "Maladie transmise par les Moskitos qui habitent les régions au climat tropical, la Maloria, est aussi appelée Molaria par certains indigènes, car la maladie semble se transmettre également par les crachats de Moskitos.", t: 30, n: "Maloria"};

	 */

	public static void getSpellsForbiddenStates() throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File("Syn_data/Lang/spells_fr_335.txt")));
		String line = "";
		StringBuilder sortes = new StringBuilder();
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("S[") == -1){// || line.indexOf("[18, 19, 3, 41]") != -1){
				continue;
			}
			String[] trucs = line.split(",");
			String towrite = "";
			for(int i = trucs.length-3; i >= 0; i--){
				towrite += trucs[i];
				if(trucs[i].contains("[")){
					break;
				}
			}
			if(sortes.indexOf(towrite) == -1){
				sortes.append("\n").append(towrite);
				Syn.w("{"+towrite.substring(1).replace("[", "").replace("]", "").replace(" ", ",")+"},");
			}
		}
		Syn.w("nombre = "+sortes.toString().split("\n").length);
	}
	
	public static void getSpellsRequiredStates() throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File("Syn_data/Lang/spells_fr_335.txt")));
		String line = "";
		StringBuilder sortes = new StringBuilder();
		for(byte[] b : Constants.CSpells.requiredStatesBytes){
			System.out.print("{"+b+"}, ");
		}
		/*
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("S[") == -1){// || line.indexOf("[18, 19, 3, 41]") != -1){
				continue;
			}
			for(String s : "27,9,3,13,12,14,15,16,19,28,8,30,39,31,33,34,35,36,37,38,43,44,46,47,58,60,61".split(",")){
				if(line.indexOf("["+s+"],") != -1){
					continue;
				}
			}
			if(line.indexOf("[]") == -1 && line.indexOf("[1]") == -1){
				line = line.split(", l")[1];
				for(int i = 10; i >= 0; i--){
					if(line.contains("true,")){
						line = line.split("true,", 2)[1];
					}else if(line.contains("false,")){
						line = line.split("false,", 2)[1];
					}
				}
				sortes.append("\n").append(line);
				Syn.w(line);
			}
			//27,9,3,13,12,14,15,16,19,28,8,30,39,31,33,34,35,36,37,38,43,44,46,47,58,60,61
			
			/*line = line.substring(line.indexOf("\", l")+2);
			for(String lvl : line.split(", l")){
				if(lvl.contains("true")){
					lvl = CodeInput.getStringRegion(lvl.split("true",2)[1], ", \\[", "\\],", true);
				}else if(lvl.contains("false")){
					lvl = CodeInput.getStringRegion(lvl.split("false",2)[1], ", \\[", "\\],", true);
				}
				if(sortes.indexOf(lvl) == -1){
					sortes.append("\n").append(lvl);
					Syn.w(""+lvl.substring(1).replace("[", "").replace("]", "").replace(" ", ",")+",");
				}
			}
			*/
		//}
		Syn.w("nombre = "+sortes.toString().split("\n").length);
	}
	
	public static void getCursedItems(String path) throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File(path)));
		String line = "";
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("I.u[") == -1){
				continue;
			}
			for(int i = 32; i >= 27; i--){
				if(line.indexOf(", t: "+i) != -1){//Si son type est: 27<=type<=32
					if(line.indexOf(", m: ") == -1){
						Syn.w("Type"+i+" [NotCursed] "+line);
					}
				}
			}
			if(line.indexOf(", m: ") != -1){
				
			}
			//Syn.w(line);
		}
	}
	
	
	
	public static void getUsableAndTargetableItems(String path) throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(new File(path)));
		//String areAllTargetableUseable = "";
		
		StringBuilder useable = new StringBuilder();
		StringBuilder targetable = new StringBuilder();
		StringBuilder both = new StringBuilder();
		
		String line = "";
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("I.u[") == -1 || line.indexOf(", t: ") == -1){
				continue;
			}
			

			if(line.indexOf(", t: 14,") != -1){
				if(line.indexOf("u: true") == -1){
				//	Syn.w("DONS_Non_Utilisable : "+line);
				}else{
				//	Syn.w("DONS_Utilisable : "+line);
				}
				if(line.indexOf("ut: true") == -1){
				//	Syn.w("DONS_Non_Targetable : "+line);
				}else{
					//Syn.w("DONS_Targetable : "+line);
				}
				if(line.indexOf("u: true") == -1 && line.indexOf("ut: true") == -1){
					//Syn.w("DONS_QuiChie : "+line);
					/*
					DONS_QuiChie : I.u[2346] = {p: 1, w: 10, fm: true, wd: true, l: 1, g: 27, ep: 1, d: "Non, ce n\'est pas le fameux costume du dragovamp, la célèbre chauve-souris volante. Ceci est l\'accoutrement d\'un habitant du cimetière, un Roublard en quelques sortes.", t: 14, n: "Costume Roublardesque"};
					DONS_QuiChie : I.u[9037] = {p: 10, w: 1, fm: true, wd: true, l: 1, g: 0, ep: 0, d: "Cette potion permet de dévoiler les personnages invisibles de votre entourage.", t: 14, n: "Potion de découverte"};
					 */
				}
			}

			if(line.indexOf(", t: 31,") != -1){
				if(line.indexOf("m: true") == -1){
					Syn.w("RP_BUFF_Non_Maudit : "+line);
				}else{
					Syn.w("RP_BUFF_Maudit : "+line);
				}
				if(line.indexOf("u: true") != -1){
					//Syn.w("RP_BUFF_Utilisable : "+line);
					/*
					RP_BUFF_Utilisable : I.u[2234] = {p: 1, u: true, m: true, w: 0, fm: true, wd: true, l: 1, g: 15, ep: 1, d: "Vous avez La Bonta attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Bonta Attitude"};
					RP_BUFF_Utilisable : I.u[2235] = {p: 1, u: true, m: true, w: 0, fm: true, wd: true, l: 1, g: 16, ep: 1, d: "Vous avez La Brâkmar attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Brâkmar Attitude"};
					RP_BUFF_Utilisable : I.u[2348] = {p: 1, u: true, m: true, w: 0, fm: true, wd: true, l: 1, g: 17, ep: 1, d: "Vous avez La Roublard attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Roublard Attitude"};
					RP_BUFF_Utilisable : I.u[9719] = {p: 1, u: true, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Vous gardez le passage, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Petite garde"};
					RP_BUFF_Utilisable : I.u[9722] = {p: 1, u: true, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Vous gardez le passage, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Moyenne garde"};
					RP_BUFF_Utilisable : I.u[9723] = {p: 1, u: true, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Vous gardez le passage, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Grande garde"};
					RP_BUFF_Utilisable : I.u[9901] = {p: 0, u: true, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Vous gardez le passage, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Puissante garde"};
					RP_BUFF_Utilisable : I.u[9902] = {p: 0, u: true, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Vous gardez le passage, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Impressionnante garde"};
					 */
				}else if(line.indexOf("ut: true") != -1){
					//Syn.w("RP_BUFF_Targetable : "+line);  Y'EN A PAS
				}else{
					//Syn.w("RP_BUFF_QuiChie : "+line);
					/*
					 RP_BUFF_QuiChie : I.u[2062] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 1, ep: 1, d: "Vous êtes camouflé au sein du décor, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Camouflage"};
RP_BUFF_QuiChie : I.u[2128] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 2, ep: 6, d: "Vous avez un pouvoir de clairvoyance, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Clairvoyance"};
RP_BUFF_QuiChie : I.u[2163] = {p: 1, c: "Ps=0", m: true, w: 0, fm: true, wd: true, l: 1, g: 3, ep: 1, d: "Vous êtes inattaquable, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Armistice"};
RP_BUFF_QuiChie : I.u[2214] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 4, ep: 1, d: "Vous avez la Iop attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Iop attitude"};
RP_BUFF_QuiChie : I.u[2215] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 5, ep: 1, d: "Vous avez la Xélor attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Xélor attitude"};
RP_BUFF_QuiChie : I.u[2216] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 6, ep: 1, d: "Vous avez la Sadida attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Sadida attitude"};
RP_BUFF_QuiChie : I.u[2218] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 7, ep: 1, d: "Vous avez la Féca attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Féca attitude"};
RP_BUFF_QuiChie : I.u[2220] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 8, ep: 1, d: "Vous avez l\'Eniripsa attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Eniripsa attitude"};
RP_BUFF_QuiChie : I.u[2222] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 9, ep: 1, d: "Vous avez l\'Enutrof attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Enutrof attitude"};
RP_BUFF_QuiChie : I.u[2224] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 10, ep: 1, d: "Vous avez la Sacrieur attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Sacrieur attitude"};
RP_BUFF_QuiChie : I.u[2226] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 11, ep: 1, d: "Vous avez la Sram attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Sram attitude"};
RP_BUFF_QuiChie : I.u[2228] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 12, ep: 1, d: "Vous avez l\'Osamodas attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Osamodas attitude"};
RP_BUFF_QuiChie : I.u[2230] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 13, ep: 1, d: "Vous avez l\'Ecaflip attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Ecaflip attitude"};
RP_BUFF_QuiChie : I.u[2232] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 14, ep: 1, d: "Vous avez la Crâ attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Crâ attitude"};
RP_BUFF_QuiChie : I.u[2356] = {p: 1, m: true, w: 0, fm: true, wd: true, l: 1, g: 19, ep: 13, d: "Vous avez un pouvoir miraculeux, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Miracle"};
RP_BUFF_QuiChie : I.u[7061] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 21, ep: 18, d: "L\'eau de la source jus-sang-ki-eau du Chacha vous a transformé temporairement en Chacha, le moindre choc vous fera redevenir normal.", t: 31, n: "Transformation Chacha"};
RP_BUFF_QuiChie : I.u[7356] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 22, ep: 18, d: "L\'eau de la source  maudite jus-sang-ki-eau du Bwak vous a transformé temporairement en Bwak, le moindre choc vous fera redevenir normal.", t: 31, n: "Transformation Bwak"};
RP_BUFF_QuiChie : I.u[7357] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 20, ep: 18, d: "L\'eau de la source maudite jus-sang-ki-eau du Marcassin vous a transformé temporairement en Marcassin, le moindre choc vous fera redevenir normal.", t: 31, n: "Transformation Marcassin"};
RP_BUFF_QuiChie : I.u[8547] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 19, ep: 1, d: "Lik nisittik miditik sint mivisik pir lik sintik.", t: 31, n: "Trinsfirmitik ik Nikiril"};
RP_BUFF_QuiChie : I.u[8548] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 19, ep: 8, d: "Les cawottes maudites sont mauwaises pouw la santé.", t: 31, n: "Twansfowmation en Wabbit"};
RP_BUFF_QuiChie : I.u[9904] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Pouflage"};
RP_BUFF_QuiChie : I.u[9905] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Toflage"};
RP_BUFF_QuiChie : I.u[9906] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Tombeflage"};
RP_BUFF_QuiChie : I.u[9907] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Rocheflage"};
RP_BUFF_QuiChie : I.u[9908] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Tabouflage"};
RP_BUFF_QuiChie : I.u[9909] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Souflage"};
RP_BUFF_QuiChie : I.u[9910] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Touflage"};
RP_BUFF_QuiChie : I.u[9911] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 1, ep: 0, d: "Si vous ne bougez pas, peut-être que personne ne vous repérera.", t: 31, n: "Camouflage immobile"};
RP_BUFF_QuiChie : I.u[9912] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 23, ep: 0, d: "Vous avez la Pandawa attitude, jusqu\'à ce que vous rentriez en combat.", t: 31, n: "Pandawa attitude"};
RP_BUFF_QuiChie : I.u[10063] = {p: 1, m: true, w: 0, fm: true, wd: false, l: 1, g: 13, ep: 0, d: "Une lotion de beauté très puissante vous a donné cette apparence... Vous voilà prête à faire fondre tous les matous ! Meow !", t: 31, n: "Le désir d\'être belle"};
RP_BUFF_QuiChie : I.u[10681] = {p: 0, m: true, w: 0, fm: true, wd: false, l: 1, g: 2, ep: 0, d: "Bien fait !", t: 31, n: "Transformation en Crapaud-mufle"};
RP_BUFF_QuiChie : I.u[10842] = {p: 0, c: "Sc=16", m: true, w: 0, fm: true, wd: false, l: 1, g: 21, ep: 0, d: "Voilà, il fallait bien que ça arrive ! Si vous recrachez des boules de poils, ne venez pas vous plaindre.", t: 31, n: "Transformation en chacha"};
RP_BUFF_QuiChie : I.u[10844] = {p: 1, m: true, w: 0, fm: false, wd: true, l: 1, g: 19, ep: 0, d: "Mmmmm mm mmmmmm mmmmm, mmm mmm mm mmmmmm mmmmm mmmmmmm mmmmmm mmm mmmm\'m mmmmm mmmm mmmmmmm.", t: 31, n: "Mmmmm"};

					 */
				}
				/*Conclucion sur les RP_BUFF:  
				 * TOUS LES RP_BUFF SONT MAUDITS (isCursed)
				 * Ils sont appliqués par le serveur pour la plupart,
				 * le joueur n'a pas bcp de controle sur ceux-ci 
				 * 		à part pour le désactiver en rentrant dans un combat
				 * 
				 * 
				 */
			}
			
			
			if(line.indexOf("u: true") != -1){
				if(line.indexOf(", t: 3,") != -1){
				//	Syn.w("BaguetteUseable : "+line);
				}
				if(line.indexOf(", t: 15,") != -1){
				//	Syn.w("RessourceUtilisable : "+line);
				}
				if(line.indexOf(", t: 14,") != -1){
				//	Syn.w("DONS_Utilisable : "+line);
				}
				//Syn.w("[USE] "+line);
				String name = Enums.ItemType.getItemType(Byte.parseByte(CodeInput.getStringRegion(line, ", t: " , ",", true))).name();
				if(useable.indexOf(","+name+",") == -1){
					useable.append(",").append(name).append(",\n");
					if(name.equalsIgnoreCase("ITEM_TYPE_QUETES")){
						//Syn.d("QuestUseable : "+line);
					}
				}
			}
			if(line.indexOf("ut: true") != -1){
				if(line.indexOf(", t: 3,") != -1){
				//	Syn.w("BaguetteTargetable : "+line);
				}
				if(line.indexOf(", t: 15,") != -1){
				//	Syn.w("RessourceTargetable : "+line);
				}
				if(line.indexOf(", t: 31,") != -1){
				//	Syn.w("RP_BUFF_Targetable : "+line);
				}
				if(line.indexOf(", t: 14,") != -1){
				//	Syn.w("DONS_Targetable : "+line);
				}
				String name = Enums.ItemType.getItemType(Byte.parseByte(CodeInput.getStringRegion(line, ", t: " , ",", true))).name();
				if(targetable.indexOf(","+name+",") == -1){
					targetable.append(",").append(name).append(",\n");
				}
				//Syn.w("[TARGET] "+line);
				if(line.indexOf("u: true") != -1){
					String name2 = Enums.ItemType.getItemType(Byte.parseByte(CodeInput.getStringRegion(line, ", t: " , ",", true))).name();
					if(both.indexOf(","+name2+",") == -1){
						both.append(",").append(name2).append(",\n");
					}
				}
			}
		}
		//Syn.d("\n"+useable.toString()+"\n----------");
		//Syn.d("\n"+targetable.toString()+"\n----------");
		//Syn.d("\n"+both.toString()+"\n----------");
		/*
		 UseableTypes    : [DEBUG]: ,42,,12,,37,,33,,13,,76,,75,,73,,25,,43,,72,,44,,45,,49,,69,,14,,80,,31,,89,,85,,86,,87,,88,,94,,3,,100,,24,,15,,79,,116,,112,,115,
		 TargetableTypes : [DEBUG]: ,42,,12,,37,,33,,14,,49,,69,,80,,74,,87,,93,,79,,94,
		 Both            : [DEBUG]: ,42,,12,,37,,33,,49,,69,,87,,14,,79,,94,
		 */
		/*
		 ,ITEM_TYPE_BONBON,
,ITEM_TYPE_POTION,
,ITEM_TYPE_BIERE,
,ITEM_TYPE_PAIN,
,ITEM_TYPE_PARCHO_EXP,
,ITEM_TYPE_PARCHEMIN_CARAC,
,ITEM_TYPE_PARCHEMIN_SORT,
,ITEM_TYPE_MAITRISE,
,ITEM_TYPE_DOCUMENT,
,ITEM_TYPE_POTION_OUBLIE,
,ITEM_TYPE_OEUF_FAMILIER,
,ITEM_TYPE_POTION_METIER,
,ITEM_TYPE_POTION_SORT,
,ITEM_TYPE_COMESTI_POISSON,
,ITEM_TYPE_VIANDE_COMESTIBLE,
,ITEM_TYPE_DONS,
,ITEM_TYPE_OBJET_MISSION,
,ITEM_TYPE_RP_BUFF,
,ITEM_TYPE_CADEAUX,
,ITEM_TYPE_PIERRE_AME_PLEINE,
,ITEM_TYPE_POPO_OUBLI_PERCEP,
,ITEM_TYPE_PARCHO_RECHERCHE,
,ITEM_TYPE_RUNES_MAGIQUE,
,ITEM_TYPE_OBJET_UTILISABLE,
,ITEM_TYPE_BAGUETTE,
,ITEM_TYPE_SAC_RESSOURCE,
,ITEM_TYPE_QUETES,
,ITEM_TYPE_RESSOURCE,
,ITEM_TYPE_BOISSON,
,ITEM_TYPE_POTION_FAMILIER,
,ITEM_TYPE_PRISME,
,ITEM_TYPE_FRAGM_AME_SHUSHU,

----------
[DEBUG]: 
,ITEM_TYPE_BONBON,
,ITEM_TYPE_POTION,
,ITEM_TYPE_BIERE,
,ITEM_TYPE_PAIN,
,ITEM_TYPE_DONS,
,ITEM_TYPE_COMESTI_POISSON,
,ITEM_TYPE_VIANDE_COMESTIBLE,
,ITEM_TYPE_OBJET_MISSION,
,ITEM_TYPE_FEE_ARTIFICE,
,ITEM_TYPE_PARCHO_RECHERCHE,
,ITEM_TYPE_OBJET_ELEVAGE,
,ITEM_TYPE_BOISSON,
,ITEM_TYPE_OBJET_UTILISABLE,

----------
[DEBUG]: 
,ITEM_TYPE_BONBON,
,ITEM_TYPE_POTION,
,ITEM_TYPE_BIERE,
,ITEM_TYPE_PAIN,
,ITEM_TYPE_COMESTI_POISSON,
,ITEM_TYPE_VIANDE_COMESTIBLE,
,ITEM_TYPE_PARCHO_RECHERCHE,
,ITEM_TYPE_DONS,
,ITEM_TYPE_BOISSON,
,ITEM_TYPE_OBJET_UTILISABLE,

		 */
		//Syn.d("areAllTargetableUseable = "+areAllTargetableUseable);
	}
	
	
	public static void getTwoHandsWeapons(String path) throws IOException{
		BufferedReader swfText = new BufferedReader(new FileReader(path));
		String line = "";
		while ((line=swfText.readLine())!=null)
		{
			if(line.indexOf("tw: true") == -1 || line.indexOf("I.u[") == -1){
				continue;  //Si c'est pas une arme à deux main ou que c'est pas un itemtemplate tout cours, skip.
			}
			line = line.trim();
			//Syn.d("line = ..."+line+"....");
			String strID = CodeInput.getStringRegion(line, "I.u[" , "]", true);
			Syn.d("strID = "+strID);
			if(Utils.isParsableInteger(strID)){
				int ID = Integer.parseInt(strID);
				//SQL.Items.updateTwoHandsWeapon(ID, Config.globalDBName);
			}
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
