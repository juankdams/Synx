package Main;


public class Syn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start le ProxyServer
		//Des clients dofus se connectent � ce serveur
		//Des PClient sont cr��s
		//Ceux-l� se cr�ent un SynClient
		//Le PClient recoit des packets
		//Il ajoute l'id du client au d�but du packet
		//Le SynClient envoit le packet modifi� � l'emu
		//L'emu recoit le packet, 
		//L'emu cherche le GClient ou LClient � qui correspond l'ID
		//Le G/LClient parse le packet
		//L'emu renvoit des packets au SynClient
		//Le SC donne ses packets � son parant PClient
		//Le PClient envoit les packets au client dofus.
		//Fin.
		
		
		
	}
	
	
	public static void d(String str){
		//if(Config.debugMode){
			System.out.println("[DEBUG]: "+str);
		//}
	}
	public static void w(String str){
		System.out.println(str);
	}
	
	public static void wD(String str){
		//if(Config.debugMode){
			System.out.println(str);
		//}
	}

}
