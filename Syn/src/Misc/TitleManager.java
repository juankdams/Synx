package Misc;


import GameObjects.GPersonnage;
import Enums.SynActions.CommonAction;
import static Enums.SynActions.CommonAction.ADD;
import static Enums.SynActions.CommonAction.REMOVE;
import static Enums.SynActions.CommonAction.CLEAN;

public class TitleManager {

	private int[] titles = null;
	private int[][] titledCharacters = new int[0][0];
	
	public TitleManager(){
		
	}
	
	public int getPersoTitle(GPersonnage p){
		for(int[] perso : titledCharacters){
			if(perso[0] == p.getID()){
				return perso[1];
			}
		}
		return 0;
	}
	
	public synchronized void modifyTitlesList(CommonAction a, GPersonnage p, int title){
		if(a == ADD){
			int copy[][] = new int[titledCharacters.length+1][1];
			int i = 0;
			for(int[] perso : titledCharacters){
				copy[i][0] = perso[0];
				copy[i][1] = perso[1];
				i++;
			}
			copy[i][0] = p.getID();
			copy[i][1] = title;
			titledCharacters = copy;
			copy = null;
		}else if(a == REMOVE){
			//if(this.contains(valeur) == true){
				int copy[][] = new int[titledCharacters.length+1][1];
				int indexCopy = 0;
				for(int[] perso : titledCharacters){
					if(perso[0] != p.getID()){
						copy[indexCopy] = perso;
					}else{
						indexCopy--;
					}
					indexCopy++;
				}
				titledCharacters = copy;
				copy = null;
			//}
		}else if(a == CLEAN){
			titledCharacters = new int[0][0];
		}
	}

	public void setTitledCharacters(int[][] titledCharacters) {
		this.titledCharacters = titledCharacters;
	}

	public int[][] getTitledCharacters() {
		return titledCharacters;
	}

	public void setTitles(int[] titles) {
		this.titles = titles;
	}

	public int[] getTitles() {
		return titles;
	}
	
	
}
