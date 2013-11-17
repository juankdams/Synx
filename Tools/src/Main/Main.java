package Main;

import java.io.IOException;

import SynBot.Bot;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Bot b = new Bot();
		b.run();
		
		
		/*
		ArrayList<String> linesDicy = Reader.getDicys();
		ArrayList<String> linesTools = Reader.getTools();
		ArrayList<String> newspelllinesDicy= Reader.writeDicysInSpellEffects(linesDicy);
		
		for(String line : newspelllinesDicy){
			w(line);
		}
		for(String line : linesDicy){
			//w(line);
		}
		for(String line : linesTools){
			//w(line);
		}
		w("Size des linesDicy : "+linesDicy.size());
		w("Size des newspelllinesDicy : "+newspelllinesDicy.size());
		w("Size des linesTools : "+linesTools.size());
		
		
		/*Les "showInToolTip : ca veut juste dire que l'icone d'élément est afficher à coté de l'effet dans la description du sort
		 	E[91] = {d: "Vole #1{~1~2 à }#2 PDV (eau)", c: 0, o: "", t: true, j: true, e: "W"};
			E[92] = {d: "Vole #1{~1~2 à }#2 PDV (terre)", c: 0, o: "", t: true, j: true, e: "E"};
			E[93] = {d: "Vole #1{~1~2 à }#2 PDV (air)", c: 0, o: "", t: true, j: true, e: "A"};
			E[94] = {d: "Vole #1{~1~2 à }#2 PDV (feu)", c: 0, o: "", t: true, j: true, e: "F"};
			E[95] = {d: "Vole #1{~1~2 à }#2 PDV (neutre)", c: 0, o: "", t: true, j: true, e: "N"};
			E[96] = {d: "Dommages : #1{~1~2 à }#2 (eau)", c: 0, o: "", t: true, j: true, e: "W"};
			E[97] = {d: "Dommages : #1{~1~2 à }#2 (terre)", c: 0, o: "", t: true, j: true, e: "E"};
			E[98] = {d: "Dommages : #1{~1~2 à }#2 (air)", c: 0, o: "", t: true, j: true, e: "A"};
			E[99] = {d: "Dommages : #1{~1~2 à }#2 (feu)", c: 0, o: "", t: true, j: true, e: "F"};
			E[100] = {d: "Dommages : #1{~1~2 à }#2 (neutre)", c: 0, o: "", t: true, j: true, e: "N"};
			E[670] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
			E[671] = {d: "Dommages : #1{~1~2 à }#2% de la vie de l\'attaquant (neutre)", c: 0, o: "", t: true, j: true};
		 */
		
		
		
	}
	
	
	
	
	public static void w(String str){
		System.out.println(str);
	}
	public static void d(String str){
		System.out.println("[DEBUG] :"+str);
	}
	

}
