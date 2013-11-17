package Enums;


public enum ActionListenerType implements SynActions {
	
	
	/*
	//On Fights
	ON_FIGHT_START,
	ON_FIGHT_END,
	ON_FIGHT_TURN_START,
	ON_FIGHT_TURN_END,
	ON_FIGHT_ROUND_START,
	ON_FIGHT_ROUND_END,
	ON_FIGHT_JOIN,
	ON_FIGHT_DIE,
	ON_FIGHT_DECONNECTED,
	ON_FIGHT_RECONNECTED,
	ON_FIGHT_QUIT,
	ON_FIGHT_SPELL_CAST, 
	ON_FIGHT_MOVE,
	*/
	
	//On Arrives
	ON_CELL_ARRIVE,
	ON_MAP_ARRIVE,
	ON_SUPER_AREA_ARRIVE,
	ON_AREA_ARRIVE,
	ON_SUB_AREA_ARRIVE,
	
	//On Items
	ON_ITEM_DROP,
	ON_ITEM_DELETE, 
	ON_ITEM_USE,
	ON_ITEM_MOVEMENT,
	ON_ITEM_DISSOCIATE,
	ON_ITEM_SETSKIN,
	ON_ITEM_FEED,

	//On Else
	ON_TALK, 
	
	;
	
	//n'immmmmporrrrrrrrrteeeeeee quoiiiiiiii
	//  + 1 pour presque chaque methode de parsing de packet :3
	
}
