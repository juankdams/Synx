package IA;

public enum PatternEnum{
	AND, //Ex: les deux neurones ont un check true ou les deux false : les deux sont fire
	
	
	OR,  //Ex: toutes celles qui check true sont fired, celles qui check false sont ignorées.
	
	
	XOR, //Ex: Si les deux neurones sont true ou les deux false, ca fait rien. 
		 //Faut quelles soient différentes pour fire.
	
	
	UOR  //Dès qu'une neurone check true, elle est fire et les autres restantes sont toutes ignorées.
	
	;
}

