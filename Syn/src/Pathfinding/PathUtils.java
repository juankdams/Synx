package Pathfinding;

import java.util.ArrayList;
import java.util.Vector;

import Core.Syn;
import Enums.Orientation;
import Enums.ZoneType;
import GlobalObjects.Map;
import Interfaces.ICharacter;
import Interfaces.ISprite;
import Misc.StringUtils;
import GameObjects.GPersonnage;



public class PathUtils {

	
	public static ArrayList<ICharacter> getTargetsInAreaStrings(Map m, String[] zoneTypes, short startCell, short targetCell){
		ArrayList<ICharacter> list = new ArrayList<ICharacter>();
		for(String zt : zoneTypes){
			list.addAll(getTargetsInAreaString(m, zt, startCell, targetCell));
		}
		return list;
	}
	
	public static ArrayList<ICharacter> getTargetsInAreaString(Map m, String zoneType, short startCell, short targetCell){
		ArrayList<ICharacter> list = new ArrayList<ICharacter>();
		ArrayList<ISprite> mapSprites = m.getSpritesSynchroFull();
        int size = StringUtils.EXTENDED_ALPHABET.indexOf(zoneType.charAt(1));
		
		switch(ZoneType.valueOf(zoneType.charAt(0))){
			case POINT:
			{
				for(ISprite s : mapSprites){
					if(s instanceof ICharacter && s.getCellID() == targetCell){
						list.add((ICharacter) s);
					}
				}
				break;
			}
			case LINE:
			{
		        Orientation o = PathUtils.getOrientationBetweenCellsInFight(m, startCell, targetCell);
		        short lastCellID = targetCell;
		        for (int i = 0; i < size; ++i) {
		            short cellId = (short) getCellIDinOrientation(m, o, lastCellID, true);
		        	Syn.d("o=("+o.getValue()+"), i=("+i+"), cellid=("+cellId+").");
		            for(ISprite s : mapSprites){
		    			if(s instanceof ICharacter && s.getCellID() == cellId){
		    				list.add((ICharacter) s);
		    				Syn.d("added un character à partir de : o=("+o.getValue()+"), i="+i+", cellid="+cellId+".");
		    			}
		    		}
		            lastCellID = cellId;
		        }
				break;
			}
			case CROSS:
			{	
				for(Orientation o : Orientation.getDiagonals()){
			        short lastCellID = targetCell;
			        for (int i = 0; i < size; ++i) {
			            short cellId = (short) getCellIDinOrientation(m, o, lastCellID, true);
			            for(ISprite s : mapSprites){
			    			if(s instanceof ICharacter && s.getCellID() == cellId){
			    				list.add((ICharacter) s);
			    			}
			    		}
			            lastCellID = cellId;
			        }
				}
				break;
			}
			case CIRCLE:
			{
				
				break;
			}
		
		}
		return list;
	}
	
	/**
	 * Vérifie si une cell est dans la même ligne qu'une autre cell. (Codé avec un for(60--))
	 * @param m - Map ou sont les cells (Important pour avoir la mapWidth+Height)
	 * @param casterCell - Cell à partir de laquelle on démarre l'itération / la recherche.
	 * @param targetCell - Cell qu'on recherche
	 * @return
	 */
	public static boolean isInLineWith(Map m, short casterCell, short targetCell){
		//En gros ce pattern vise toutes les cells alignées par itération en spirale autour du caster
		//Dessin disponible dans les data (isInLineWithPattern.jpg)
		for(int i = 60; i >= 0; i--){
			if(casterCell + (i*m.getWidth()) == targetCell){
				return true;
			}
			if(casterCell - (i*m.getWidth()) == targetCell){
				return true;
			}
			if(casterCell + (i*m.getHeight()) == targetCell){
				return true;
			}
			if(casterCell - (i*m.getHeight()) == targetCell){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Vérifie si une cell est dans la même ligne qu'une autre cell. (Codé avec un delta entre deux points)
	 * @param m - Map ou sont les cells 
	 * @param casterCell - Cell à partir de laquelle on démarre l'itération / la recherche.
	 * @param targetCell - Cell qu'on recherche
	 * @return
	 */
	public static boolean isInLineWith2(Map m, short startCell, short targetCell){
		Point start = PathfindingD.getCaseCoordonnee(m, startCell);
		Point end = PathfindingD.getCaseCoordonnee(m, targetCell);
		int deltaX = end.x - start.x;
		int deltaY = end.y - start.y;
		if(deltaX == 0 || deltaY == 0){
			return true;
		}
		return false;
	}

	/**
	 * @return - La première case non-occupée adjacente au ISprite.
	 */
	public static short getFreeCellAround(ISprite c, boolean fight){
		Map m = c.getMap();
		if(m != null){
			for(Orientation o : Orientation.values()){
				Syn.d("getFreeCellAround o = "+o.name());
				if(o.isDiagonal()){
					int cell = getCellIDinOrientation(m, o, c.getCellID(), fight);
					Syn.d("getFreeCellAround o.diagonal = "+o.name()+",  cellID="+cell);
					if(m.isCellOccupied(cell) == false){
						return (short) cell;
					}
				}
			}
		}
		return 0;
	}
	
	/**
	 * @return - Toutes les cases non-occupées adjacentes au ISprite.
	 */
	public static int[] getFreeCellsAround(ISprite c, boolean fight){
		int[] cells = null;
		byte count = 0;
		Map m = c.getMap();
		if(m != null){
			for(int i = 0; i < 1; i++){
				for(Orientation o : Orientation.values()){
					if(o.isDiagonal()){
						if(m.isCellOccupied(getCellIDinOrientation(m, o, c.getCellID(), fight)) == false){
							count++;
							if(cells != null){
								cells[count] = getCellIDinOrientation(m, o, c.getCellID(), fight);
							}
						}
					}
				}
				if(cells == null){
					cells = new int[count+1];
					count = 0;
				}
			}
			
			return cells;
		}
		return null;
	
	}
	
	public static int getCellIDinOrientation(Map m, Orientation o, short cell, boolean fight){
		switch(o){
			case EAST:
                return fight ? -1 : cell + 1;
            case SOUTH_EAST:
                return cell + m.getWidth();
            case SOUTH:
                return fight ? -1 : cell + (m.getWidth() * 2) - 1;
            case SOUTH_WEST:
                return  cell + m.getWidth() - 1;
            case WEST:
                return fight ? -1 : cell - 1;
            case NORTH_WEST:
                return cell - m.getWidth();
            case NORTH:
                return fight ? -1 : cell - (m.getWidth() * 2) - 1;
            case NORTH_EAST:
                return  cell - m.getWidth() + 1;
		}
		return cell;
	}
	
	
	public static Orientation getOrientationBetweenCellsInFight(Map m, short startCell, short targetCell){
		Point start = PathfindingD.getCaseCoordonnee(m, startCell);
		Point end = PathfindingD.getCaseCoordonnee(m, targetCell);
		int deltaX = end.x - start.x;
		int deltaY = end.y - start.y;
		boolean horizontalDominance = (Math.abs(deltaX) > Math.abs(deltaY));
		Syn.d("deltaX =("+(deltaX)+"),  deltaY =("+(deltaY)+"), horizontalDominance=("+horizontalDominance+")");
		if(horizontalDominance){//Si c'estl le deltaX qui est le plus grand (donc plus horizontal que vertical)
			if(deltaX >> 31 != 0){//S'il est négatif
				return Orientation.NORTH_WEST;
			}else{//Si positif
				return Orientation.SOUTH_EAST;
			}
		}else{
			if(deltaY >> 31 != 0){//S'il est négatif
				return Orientation.NORTH_EAST;
			}else{//Si positif
				return Orientation.SOUTH_WEST;
			}
		}
	}
	
	/**
	 * @return - La distance en nombre de cells entre la startCell et la targetCell en comptant la targetCell dans le path.
	 * <br>
	 */
	public static int getDistanceBetweenCellsInFight(Map m, short startCell, short targetCell){
		Point start = PathfindingD.getCaseCoordonnee(m, startCell);
		Point end = PathfindingD.getCaseCoordonnee(m, targetCell);
		return Math.abs(start.x - end.x) + Math.abs(start.y - end.y);
	}
	
	
	
}
