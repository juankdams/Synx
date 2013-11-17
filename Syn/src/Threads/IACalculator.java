package Threads;

public class IACalculator {

	//Bon ici on calcule toutes les actions, on les applique, toute 
	//et on store les packets à envoyer avec schedulePackets() au lieu d'avoir des sleeps
	//le scheduler va s'occuper d'envoyer les packets au bon moment
	
	//Hm quand les calcul son finis, faut attendre que tous les packets aient été envoyés.
	//Donc c'quon peut faire c'est de laisser le FightThread(timer des tours)
	//   passer le tour du mob au lieu que ca soit ce dernier qui call endTurn().
	//   Pour faire ca, on a juste � changer le temps de jeu que le timer doit
	//    attendre avant de endTurn();
	// 	Ici: if(System.currentTimeMillis() - fight.get_ticMyTimer_startTime() >= 28500){
	//     Changer le 28500 pour une variable et setter celle-là qqc comme
	//        la derniere date de packet à envoyer +300ms. :P
	
	
	
	
	public static void schedulePackets(){
		int nbrPackets = 0;
		Object fight = null;
		Object[] packets = new Object[nbrPackets+2];
		//(les sessions auxquelles faut envoyer les packet;)
		packets[0] = fight;//.getPersosSessions();
		//La date à laquelle faut envoyer le packet. Ici dans 200ms
		packets[1] = System.currentTimeMillis()+200;
		
		IASchedulePacker.addPackets(packets);
	}
}
