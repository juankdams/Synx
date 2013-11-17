package GameObjects;

import Interfaces.IOverrider;

public class GMonsterOverrider extends GMonster implements IOverrider {
	
	public GMonsterOverrider(){
		super();
	}
	public GMonsterOverrider(GMonster base){
		super();
		setBuffs(base.getBuffs());
		setCellID(base.getCellID());
		setColor1(base.getColor1());
		setColor2(base.getColor2());
		setColor3(base.getColor3());
		setDrops(base.getDrops());
		
		//blabla, converti le GMonster de base en un GMonsterOverrider
		//peut ainsi overrider les methods du GMonster de l'émulateur 
		//et modifier leur behaviour
	}
	
	@Override
	public String getName(){
		return "OverridenMonster";
	}
	

	
	
	
}
