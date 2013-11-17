package GameObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import Abstractions.AbstractWorld;
import Core.Syn;
import Misc.Randomizer;

public class GArea{
	
	// GSuperArea --------------------------------------------------------------------------------------------
	public static class GSuperArea{
		private short ID;
		//private StringBuilder areas = new StringBuilder(";");
		private ArrayList<GArea> areas = null;
		public GSuperArea(short id, ArrayList<GArea> areass){//, String areass){
			ID = id;
			//areas = new StringBuilder(areas);
			areas = areass;
		}
		public short getID(){
			return ID;
		}
		/*public void addArea(GArea a){
			areas.append(a.getID()).append(";");
		}
		public boolean containsArea(GArea a){
			if(areas.indexOf(";"+a.getID()+";") == -1){
				return false;
			}
			return true;
		}
		public void setAreas(String areass){
			areas = new StringBuilder(areass);
		}*/
		public ArrayList<GArea> getAreas() {
			return areas;
		}
		public void setAreas(ArrayList<GArea> areas) {
			this.areas = areas;
		}
		public GArea getArea(int areaID){
			for(GArea a : areas){
				if(a.getID() == areaID){
					return a;
				}
			}
			return null;
		}
	}
	
	// GSubArea --------------------------------------------------------------------------------------------
	public static class GSubArea{
		private short ID = 0;
		private GArea area = null;
		private short prisme = 0;
		public short maxMonsterGroupSize = 8;//TODO À mettre dans une colonne dans les subareas ou dans les maps
		public short maxNumberOfGroups = 4;//TODO À mettre dans une colonne dans les subareas ou dans les maps
		private HashMap<GMonster, Double> spawningMonsters = null;//[ (ID*10+grade) , spawnProbability ]
		
		public GSubArea(short id, AbstractWorld w, short maxMonsterGroupSize, short maxNumberOfGroups, String possibleMonsters){
			this.ID = id;
			this.maxMonsterGroupSize = maxMonsterGroupSize;
			this.maxNumberOfGroups = maxNumberOfGroups;
			
			String monsters[] = possibleMonsters.split(";");
			if(monsters.length > 0 && monsters[0].length() > 0){
				spawningMonsters = new HashMap<GMonster, Double>();
				for(int i = monsters.length-1; i >=0; i--){
					if(monsters[i].length() == 0 || monsters[i].indexOf(",") == -1){
						continue;
					}
					short monsterTemplateID = Short.parseShort( monsters[i].substring(0, monsters[i].indexOf(",")-1) );
					String grade = monsters[i].substring(monsters[i].indexOf(",")-1, monsters[i].indexOf(","));
					Double probability = Double.parseDouble( monsters[i].substring(monsters[i].indexOf(",")+1) );
					
					GMonster[] monster = w.getMonsterTemplate(monsterTemplateID);
					if(monster == null){
						Syn.w("GSubArea.construct -> GlobalWorld.getMonsterTemplate(subAreaMonstersIDs) == null;");
					}else
					if("x".equalsIgnoreCase(grade)){//Tous les grades du monstre
						for(GMonster m : monster){
							spawningMonsters.put(m, probability);
						}
					}else{//Un grade précis du monstre
						int gradeint = Integer.parseInt(grade);
						spawningMonsters.put(monster[gradeint], probability);
					}
				}
			}
		}
		
		public void setID(short iD){
			ID = iD;
		}
		public short getID(){
			return ID;
		}
		public void setPrismeID(short prismeID){
			prisme = prismeID;
		}
		public short getPrismeID(){
			return prisme;
		}
		//TODO: gérance des prismes dans les areas/subareas
		//public Prisme getPrisme(GWorld w){
		//	return w.getPrisme(prisme);
		//}
		
		/**
		 * 
		 */
		public GMonsterGroup generateRandomMonsterGroup(AbstractWorld w){
			if(spawningMonsters == null){
				return null;
			}
			short groupSize = (short) Randomizer.rand(1, maxMonsterGroupSize);
			if(w == null){
				Syn.d("generateRandomMonsterGroup.  w == null");
			}
			
			GMonsterGroup mg = GMonsterGroup.provide(w).createNew(w, groupSize);//GMonsterGroup.createNew(w, groupSize);
			
			int index = 0;
			@SuppressWarnings("unchecked")
			Entry<GMonster, Double>[] array = new Entry[spawningMonsters.size()];
			for(Entry<GMonster, Double> m  : spawningMonsters.entrySet()){
				array[index] = m;
				index++;
			}
			index = 0;
			while(groupSize > mg.size()){
				double probability = array[index].getValue();//(Double) spawningMonsters.values().toArray()[index];
				if(probability >= Randomizer.nextDouble()){
					Syn.d("generateRandomMonsterGroup. add Monster. index="+index+", mgSize="+mg.size()+", mgID="+mg.getID()+".");
					mg.add( array[index].getKey() );
				}
				index++;
				if(index == array.length){
					index = 0;
				}
				Syn.d("generateRandomMonsterGroup. while groupSize("+groupSize+") != mgSize("+mg.size()+")   index="+index+", mgID="+mg.getID()+".");
			}
			
			return mg;
		}

		public GArea getArea() {
			return area;
		}
		public void setArea(GArea area) {
			this.area = area;
		}
		
	}
	
	
	
	
	// GAREA --------------------------------------------------------------------------------------------
	
	private short ID = 0;
	private GSuperArea superArea = null;
	private ArrayList<GSubArea> subAreas = null;
	//private StringBuilder subAreas = new StringBuilder(";");
	public GArea(short id, ArrayList<GSubArea> subareass){//, String subAreass){
		ID = id;
		//subAreas = new StringBuilder(subAreass);
		subAreas = subareass;
	}

	public void setID(short iD){
		ID = iD;
	}
	public short getID(){
		return ID;
	}
	public GSuperArea getSuperArea() {
		return superArea;
	}
	public void setSuperArea(GSuperArea superArea) {
		this.superArea = superArea;
	}
	/*public void setSubAreas(String subAreass){
		subAreas = new StringBuilder(subAreass);
	}
	public void addArea(GArea a){
		subAreas.append(a.getID()).append(";");
	}
	public boolean containsArea(GArea a){
		if(subAreas.indexOf(";"+a.getID()+";") == -1){
			return false;
		}
		return true;
	}
	*/
	public ArrayList<GSubArea> getSubAreas() {
		return subAreas;
	}

	public void setSubAreas(ArrayList<GSubArea> subAreas) {
		this.subAreas = subAreas;
	}
	public GSubArea getSubArea(int areaID){
		for(GSubArea a : subAreas){
			if(a.getID() == areaID){
				return a;
			}
		}
		return null;
	}
	
	
	
	
}
