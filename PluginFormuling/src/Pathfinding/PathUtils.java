package Pathfinding;

import java.util.ArrayList;

import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.Orientation;
import Enums.ZoneType;
import GlobalObjects.Map;
import Interfaces.ICharacter;
import Interfaces.ISprite;
import Misc.Randomizer;
import Misc.StringUtils;
import Plugins.Abstractions.AbstractFormulings.AbstractNode;
import Plugins.Abstractions.AbstractFormulings.AbstractPathUtils;
import ShivasPF.Node;
import ShivasPF.Path;
public class PathUtils extends AbstractPathUtils{

	
	@Override
	public ArrayList<CombativeCharacter> getTargetsInAreaStrings(Map m, String[] zoneTypes, short startCell, short targetCell){
		ArrayList<CombativeCharacter> list = new ArrayList<CombativeCharacter>();
		for(String zt : zoneTypes){
			list.addAll(getTargetsInAreaString(m, zt, startCell, targetCell));
		}
		return list;
	}

	@Override
	public ArrayList<CombativeCharacter> getTargetsInAreaString(Map m, String zoneType, short startCell, short targetCell){
		ArrayList<CombativeCharacter> list = new ArrayList<CombativeCharacter>();
		ArrayList<ISprite> mapSprites = m.getSpritesSynchroFull();
        int size = StringUtils.EXTENDED_ALPHABET.indexOf(zoneType.charAt(1));
		
		switch(ZoneType.valueOf(zoneType.charAt(0))){
			case POINT:
			{
				for(ISprite s : mapSprites){
					if(s instanceof CombativeCharacter && s.getCellID() == targetCell){
						list.add((CombativeCharacter) s);
					}
				}
				break;
			}
			case LINE:
			{
		        Orientation o = getOrientationBetweenCellsInFight(m, startCell, targetCell);
		        short lastCellID = targetCell;
		        for (int i = 0; i < size; ++i) {
		            short cellId = (short) getCellIDinOrientation(m, o, lastCellID, true);
		        	//Syn.d("o=("+o.getValue()+"), i=("+i+"), cellid=("+cellId+").");
		            for(ISprite s : mapSprites){
		    			if(s instanceof ICharacter && s.getCellID() == cellId){
		    				list.add((CombativeCharacter) s);
		    				//Syn.d("added un character à partir de : o=("+o.getValue()+"), i="+i+", cellid="+cellId+".");
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
			    			if(s instanceof CombativeCharacter && s.getCellID() == cellId){
			    				list.add((CombativeCharacter) s);
			    			}
			    		}
			            lastCellID = cellId;
			        }
				}
				break;
			}
			case CIRCLE:
			{
				//TODO: Zone d'effet en Cercle. (PathUtils.getTargetsInAreaString)
		        short lastCellID = targetCell;
		        short cellId = targetCell;
				for(ISprite s : mapSprites){
	    			if(s instanceof CombativeCharacter && s.getCellID() == targetCell){
	    				if(list.contains(s)) continue;
	    				list.add((CombativeCharacter) s);
	    			}
	    		}
				for (int i = 0; i < size; ++i) {
					for(Orientation o : Orientation.getCircleZoneOrientations()){
						for(int d = 0; d <= i; ++d){
							if(o == Orientation.NORTH_EAST && d == 0){
								lastCellID = targetCell;
								for(int n = 0; n <= i; ++n){
									lastCellID = (short) getCellIDinOrientation(m, o, lastCellID, false);
								}
								cellId = lastCellID;
							}else if(o != Orientation.NORTH_EAST){
					            cellId = (short) getCellIDinOrientation(m, o, lastCellID, false);
							}
							//Syn.d("Zone Cercle Size("+size+") Cell("+cellId+") LastCell("+lastCellID+") Orientation("+o.name()+") i("+i+") d("+d+").");
				            if((o != Orientation.EAST || d != i) && (o != Orientation.NORTH_EAST || d == 0)){
								for(ISprite s : mapSprites){
					    			if(s instanceof CombativeCharacter && s.getCellID() == cellId){
					    				if(list.contains(s)) continue;
					    				list.add((CombativeCharacter) s);
					    			}
					    		}
							}//else{
								//Syn.d("^ ignore ^");
							//}
				            lastCellID = cellId;
				            /*if(o == Orientation.NORTH && d == i){
				            	do{
				            		lastCellID = cellId = (short) getCellIDinOrientation(m, Orientation.EAST, lastCellID, false);
				            	}while(!isInLineWith(m, targetCell, cellId, Orientation.NORTH_EAST));
				            }*/
						}
					}
				}
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
	@Override
	public boolean isInLineWith(Map m, short casterCell, short targetCell){
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
	@Override
	public boolean isInLineWith2(Map m, short startCell, short targetCell){
		Point start = PathfindingDofus.getCaseCoordonnee(m, startCell);
		Point end = PathfindingDofus.getCaseCoordonnee(m, targetCell);
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
	@Override
	public short getFreeCellAround(ISprite c, boolean fight){
		Map m = c.getMap();
		if(m != null){
			for(Orientation o : Orientation.values()){
				//Syn.d("getFreeCellAround o = "+o.name());
				if(o.isDiagonal()){
					int cell = getCellIDinOrientation(m, o, c.getCellID(), fight);
					//Syn.d("getFreeCellAround o.diagonal = "+o.name()+",  cellID="+cell);
					if(m.isCellOccupied(cell) == false){
						return (short) cell;
					}
				}
			}
		}
		return 0;
	}
	
	@Override
	public short getFreeCellRandom(Map m){
		short celliD = (short) Randomizer.rand(1, 400);
		while( (m.isCellOccupied(celliD) == true || m.isCellWalkable(celliD) == false) ){
			celliD = (short) Randomizer.rand(1, 400);
		}
		return celliD;
	}
	
	@Override
	public short getFreeCellRandom(Map m, int minRange, int maxRange){
		short celliD = (short) Randomizer.rand(minRange, maxRange);
		while( (m.isCellOccupied(celliD) == true || m.isCellWalkable(celliD) == false) ){
			celliD = (short) Randomizer.rand(minRange, maxRange);
		}
		return celliD;
	}
	
	/**
	 * @return - Toutes les cases non-occupées adjacentes au ISprite.
	 */
	@Override
	public int[] getFreeCellsAround(ISprite c, boolean fight){
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

	@Override
	public int getCellIDinOrientation(Map m, Orientation o, short cell, boolean fight){
		switch(o){
			case EAST:
                return fight ? -1 : cell + 1;
            case SOUTH_EAST:
                return cell + m.getWidth();
            case SOUTH:
                return fight ? -1 : cell + ((m.getWidth() * 2) - 1);
            case SOUTH_WEST:
                return  cell + m.getWidth() - 1;
            case WEST:
                return fight ? -1 : cell - 1;
            case NORTH_WEST:
                return cell - m.getWidth();
            case NORTH:
                return fight ? -1 : cell - ((m.getWidth() * 2) - 1);
            case NORTH_EAST:
                return  cell - m.getWidth() + 1;
		}
		return cell;
	}
	

	@Override
	public Orientation getOrientationBetweenCellsInFight(Map m, short startCell, short targetCell){
		Point start = PathfindingDofus.getCaseCoordonnee(m, startCell);
		Point end = PathfindingDofus.getCaseCoordonnee(m, targetCell);
		int deltaX = end.x - start.x;
		int deltaY = end.y - start.y;
		boolean horizontalDominance = (Math.abs(deltaX) > Math.abs(deltaY));
		//Syn.d("deltaX =("+(deltaX)+"),  deltaY =("+(deltaY)+"), horizontalDominance=("+horizontalDominance+")");
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
	@Override
	public int getDistanceBetweenCellsInFight(Map m, short startCell, short targetCell){
		if(m == null){
			return 0;
		}
		Point start = PathfindingDofus.getCaseCoordonnee(m, startCell);
		Point end = PathfindingDofus.getCaseCoordonnee(m, targetCell);
		return Math.abs(start.x - end.x) + Math.abs(start.y - end.y);
	}
	
	/**
	 * Trouve le chemin le plus direct pour aller de A à Z sans contourner les obstacles.
	 * <br> Créé un path utilisable pour une GameAction de mouvement.
	 * @return
	 */
	@Override
	public Path parsePathFromTwoNodes(Map m, AbstractNode start, AbstractNode end) {
		Path path = new Path();
		AbstractNode cur = start;
		while(cur.cell != end.cell){
			path.push(cur);
			Orientation o = Syn.Services.dofusClientStrategy.defaultPluginsManager.getFormulingManager().getOrientationBetweenCellsInFight(m, cur.cell, end.cell);
			int cell = Syn.Services.dofusClientStrategy.defaultPluginsManager.getFormulingManager().getCellIDinOrientation(m, o, cur.cell, true);
			o = Syn.Services.dofusClientStrategy.defaultPluginsManager.getFormulingManager().getOrientationBetweenCellsInFight(m, (short) cell, end.cell);
			Node next = new Node(o, (short) cell);
			cur = next;
		}
		return path;
	}
	
	
}
