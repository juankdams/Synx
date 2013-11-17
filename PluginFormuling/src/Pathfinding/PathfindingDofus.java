package Pathfinding;

import GlobalObjects.Map;

/**
 * Toutes les methodes de pathfinding d'ici viennent du client et ont été convertie de l'AS2 au Java.
 * @author Robyn
 */
public class PathfindingDofus {

	public static class CellData{
		public Object groundLevel = null;
		public Object movement = null;
	}
	
	public static class CellPathParam2{
		public Object num = null;
        public Object g = null;
        public Object v = null;
        public Object h = null;
        public Object f = null;
        public Object l = null;
        public Object m = null;
        public Object parent = null;
	}
	public static class CellPathParam{
		public Object bAllDirections = null;
		public Object nMaxLength = null;
		public Object bIgnoreSprites = null;
		public Object bCellNumOnly = null;
		public Object bWithBeginCellNum = null;
	}
	
	

	/**
	 * Prit du client dans :  ank.battlefield.utils.Pathfinding
	 * @param m - La Map sur laquelle se trouve la cellule
	 * @param cellID - L'ID de la cellule dont on veut la coordonnée
	 * @return - Les coordonnée de la cellule
	 */
	public static Point getCaseCoordonnee(Map m, short cellID)
    {
        int larg = m.getWidth();
        int _loc5 = (int) Math.floor(cellID / (larg * 2 - 1));
        int _loc6 = cellID - _loc5 * (larg * 2 - 1);
        int _loc7 = _loc6 % larg;
        Point point = new Point();
        point.y = (short) (_loc5 - _loc7);
        point.x = (short) ((cellID - (larg - 1) * point.y) / larg);
        return (point);
    }
	
	public static double goalDistEstimate(Map m, short nCell1, short nCell2)
    {
        Point point1 = getCaseCoordonnee(m, nCell1);
        Point point2 = getCaseCoordonnee(m, nCell2);
        int _loc7 = Math.abs(point1.x - point2.x);
        int _loc8 = Math.abs(point1.y - point2.y);
        return (Math.sqrt(Math.pow(_loc7, 2) + Math.pow(_loc8, 2)));
    }
	
	
	/*
	public static Object pathFind(Map mapHandler, short nCellBegin, short nCellEnd, CellPathParam oParams)
    {
        if (nCellBegin == -1)
        {
            return (null);
        } // end if
        if (nCellEnd == -1)
        {
            return (null);
        } // end if
        boolean _loc6 = (Boolean) (oParams.bAllDirections == null ? (true) : (oParams.bAllDirections));
        int _loc7 = (Integer) (oParams.nMaxLength == null ? (500) : (oParams.nMaxLength));
        boolean _loc8 = (Boolean) (oParams.bIgnoreSprites == null ? (false) : (oParams.bIgnoreSprites));
        boolean _loc9 = (Boolean) (oParams.bCellNumOnly == null ? (false) : (oParams.bCellNumOnly));
        boolean _loc10 = (Boolean) (oParams.bWithBeginCellNum == null ? (false) : (oParams.bWithBeginCellNum));
        int larg = mapHandler.getWidth();
        
        int _loc12 = 0;//nombre de directions utilisables
        int _loc13[] = {1, larg, larg * 2 - 1, larg - 1, -1, -larg, -larg * 2 + 1, -(larg - 1)};//loc11 = mapHandler.getWidth();
        double _loc14[] = {1.500000E+000, 1, 1.500000E+000, 1, 1.500000E+000, 1, 1.500000E+000, 1};//4 chiffres pour 4 directions
        
        if (_loc6)
        {
            _loc12 = 8;//nombre de directions utilisables
            _loc13 = new int[]{1, larg, larg * 2 - 1, larg - 1, -1, -larg, -larg * 2 + 1, -(larg - 1)};//loc11 = mapHandler.getWidth();
            _loc14 = new double[]{1.500000E+000, 1, 1.500000E+000, 1, 1.500000E+000, 1, 1.500000E+000, 1};//4 chiffres pour 4 directions
        }
        else
        {
            _loc12 = 4;//nombre de directions utilisables
            _loc13 = new int[]{larg, larg - 1, -larg, -(larg - 1)};//_loc11 = mapHandler.getWidth();
            _loc14 = new double[]{1, 1, 1, 1};//4 chiffres pour 4 directions
        } // end else if
        CellData[] _loc15 = new CellData[1];//TODO mapHandler.getCellsData(); 
        Object[] _loc16 = new Object[1];
        Object _loc17 = new Object();
        boolean _loc18 = false;
        CellPathParam2 _loc19 = _loc16["oCell" + nCellBegin] = new CellPathParam2();
        _loc19.num = nCellBegin;
        _loc19.g = 0;
        _loc19.v = 0;
        _loc19.h = goalDistEstimate(mapHandler, nCellBegin, nCellEnd);
        _loc19.f = _loc19.h;
        _loc19.l = _loc15[nCellBegin].groundLevel;
        _loc19.m = _loc15[nCellBegin].movement;
        _loc19.parent = null;
        while (!_loc18)
        {
            Object _loc20 = null;
            int _loc21 = 500000;
            for (int k = _loc16.length; k >= 0; k--)
            {
                if (_loc16[k].f < _loc21)
                {
                    _loc21 = _loc16[k].f;
                    _loc20 = k;
                } // end if
            } // end of for...in
            var _loc22 = _loc16[_loc20];
            delete _loc16[_loc20];
            if (_loc22.num == nCellEnd)
            {
                var _loc23 = new Array();
                while (_loc22.num != nCellBegin)
                {
                    if (_loc22.m == 0)
                    {
                        _loc23 = new Array();
                    }
                    else if (_loc9)
                    {
                        _loc23.splice(0, 0, _loc22.num);
                    }
                    else
                    {
                        _loc23.splice(0, 0, {num: _loc22.num, dir: ank.battlefield.utils.Pathfinding.getDirection(mapHandler, _loc22.parent.num, _loc22.num)});
                    } // end else if
                    _loc22 = _loc22.parent;
                } // end while
                if (_loc10)
                {
                    if (_loc9)
                    {
                        _loc23.splice(0, 0, nCellBegin);
                    }
                    else
                    {
                        _loc23.splice(0, 0, {num: nCellBegin, dir: ank.battlefield.utils.Pathfinding.getDirection(mapHandler, _loc22.parent.num, nCellBegin)});
                    } // end if
                } // end else if
                return (_loc23);
            } // end if
            var _loc24 = false;
            var _loc25 = 0;
            
            while (++_loc25, _loc25 < _loc12)
            {
                var _loc26 = _loc22.num + _loc13[_loc25];
                if (Math.abs(_loc15[_loc26].x - _loc15[_loc22.num].x) <= 53)
                {
                    var _loc27 = _loc15[_loc26];
                    var _loc28 = _loc27.groundLevel;
                    var _loc29 = _loc8 ? (true) : (_loc27.spriteOnID != undefined ? (false) : (true));
                    _loc24 = _loc26 == nCellEnd && _loc27.movement == 1 ? (true) : (false);
                    var _loc30 = _loc22.l == undefined || Math.abs(_loc28 - _loc22.l) < 2;
                    if (_loc30 && (_loc27.active && _loc29))
                    {
                        var _loc31 = "oCell" + _loc26;
                        var _loc32 = _loc22.v + _loc14[_loc25] + (_loc27.movement == 0 || _loc27.movement == 1 ? (1000 + (_loc25 % 2 == 0 ? (3) : (0))) : (0)) + (_loc27.movement == 1 && _loc24 ? (-1000) : ((_loc25 != _loc22.d ? (5.000000E-001) : (0)) + (5 - _loc27.movement) / 3));
                        var _loc33 = _loc22.g + _loc14[_loc25];
                        var _loc34 = null;
                        if (_loc16[_loc31])
                        {
                            _loc34 = _loc16[_loc31].v;
                        }
                        else if (_loc17[_loc31])
                        {
                            _loc34 = _loc17[_loc31].v;
                        } // end else if
                        if ((_loc34 == null || _loc34 > _loc32) && _loc33 <= _loc7)
                        {
                            if (_loc17[_loc31])
                            {
                                delete _loc17[_loc31];
                            } // end if
                            var _loc35 = new Object();
                            _loc35.num = _loc26;
                            _loc35.g = _loc33;
                            _loc35.v = _loc32;
                            _loc35.h = ank.battlefield.utils.Pathfinding.goalDistEstimate(mapHandler, _loc26, nCellEnd);
                            _loc35.f = _loc35.v + _loc35.h;
                            _loc35.d = _loc25;
                            _loc35.l = _loc28;
                            _loc35.m = _loc27.movement;
                            _loc35.parent = _loc22;
                            _loc16[_loc31] = _loc35;
                        } // end if
                    } // end if
                } // end if
            } // end while
            _loc17["oCell" + _loc22.num] = {v: _loc22.v};
            _loc18 = true;
            for (var k in _loc16)
            {
                _loc18 = false;
                break;
            } // end of for...in
        } // end while
        return (null);
    }
	*/
	
}
