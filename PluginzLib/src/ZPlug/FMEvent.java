package ZPlug;
import plugin.event.EventType;

public enum FMEvent implements EventType{

	POTION_FM,
	RUNE_FM,
	SIGNATURE_FM,

	CRITICAL_SUCCESS,	//ajoute la stats sans rien perdre ds les autre stats
	SUCCESS,         	//ajoute la stats mais diminue les jets des autres stats
	FAIL,				//fait rien
	CRITICAL_FAIL		//diminue les autres stats
	
	;
}
