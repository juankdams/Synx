package Zen.IAInterface.IA2;

import java.io.PrintWriter;

import objects.Fight;
import objects.Fight.Fighter;

public class IACalculator {

	//Bon ici on calcule toutes les actions, on les applique, toute 
	//et on store les packets � envoyer avec schedulePackets() au lieu d'avoir des sleeps
	//le scheduler va s'occuper d'envoyer les packets au bon moment
	
	//Hm quand les calcul son finis, faut attendre que tous les packets aient �t� envoy�s.
	//Donc c'quon peut faire c'est de laisser le FightThread(timer des tours)
	//   passer le tour du mob au lieu que ca soit ce dernier qui call endTurn().
	//   Pour faire ca, on a juste � changer le temps de jeu que le timer doit
	//    attendre avant de endTurn();
	// 	Ici: if(System.currentTimeMillis() - fight.get_ticMyTimer_startTime() >= 28500){
	//     Changer le 28500 pour une variable et setter celle-l� � qqc comme
	//        la derniere date de packet � envoyer +300ms. :P
	
	
	
	
	public static void schedulePackets(){
		int nbrPackets = 0;
		Fight fight = null;
		Object[] packets = new Object[nbrPackets+2];
		packets[0] = fight.getPersosOuts();//pws;
		packets[1] = System.currentTimeMillis();
		//ajoute des packets � l'array ici.
		IASchedulePacker.addPackets(packets);
	}
}
