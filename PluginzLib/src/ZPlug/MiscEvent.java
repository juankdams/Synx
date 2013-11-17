package ZPlug;

import plugin.event.EventType;

public enum MiscEvent implements EventType{

	//DailyEvents:
	INITIATE_DE, //initialize
	UPDATE_DE,   //update si ca fait un jour
	CHANGE_DE,    //foce le changement d'event
	
	Set_PluginsManager,
	Set_GameServer,
	Set_GameClientStrategy,
	
	Load_Plugins_ActionListenersAlias,
	
	
	NO_EVENT;
	
	
	
}
