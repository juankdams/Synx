package Enums;

public interface SynActions{

	
	
	public enum UtilityThreadA implements SynActions{
		DAILY,//(1),
		MOVE_MOBS;//,//(2),
		//MOVE_TROUPS,//(3),
		//SCHEDULED_BUFFER,//(4),
		//REGENERATE_LIFE;//(5);
	}
	public enum SchedulingA implements SynActions{
		//LES ACTIONS POSSIBLES comme task en scheduling
		/**Enlever un compte en attente dans la queue*/
		REMOVE_WAITING_ACCOUNT,
		SEND_CLIENT_PACKET,
		SEND_FIGHT_PACKET,
		REMOVE_FLOODER, 
		TERMINATE_CLIENT,
		SERVER_PUB,
		EVALUATE,
		INVOKE,
		EXE_SCRIPT,
		FIGHT_TIMER, 
		IA;
	}
	
	public enum CommonAction implements SynActions{
		/**Pour ajouter un truc à une liste de trucs*/
		ADD,
		/**Pour enlever un truc d'une liste de trucs*/
		REMOVE,
		/**Pour clean la liste de trucs*/
		CLEAN,
		/**Pour prendre un truc d'une liste de trucs*/
		GET,
		/**Pour prendre toute les valeurs de liste de trucs*/
		GETVALUES;
	}
	
	public enum ChatBufferA implements SynActions{
		ADD_FLOODER,
		REMOVE_FLOODER,
		CLEAN_FLOODERS;
	}
	
	public enum MapAction implements SynActions{
		GET_SPRITES,
		ADD_SPRITE,
		REMOVE_SPRITE,
		MOVE_SPRITE,
		
		GET_FIGHTS,
		ADD_FIGHT,
		REMOVE_FIGHT;
	}
	
	
	
}
