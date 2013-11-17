package SM;

import java.util.Random;

//------------------------------------------------------------------ SUPPLEMENTS

/**
 * Ici on retrouve les codes supplémentaires à chaque packets qui en a vrm besoin. 
 * Chaque methode de cette classe porte le nom du packet qui en a besoin.  (Ex: HC)
 */
public class Supplements{
	/**
	 * Prépare une hashkey pour envoyer le packet de connexion HC
	 * @return - L'HashKey à envoyer
	 */
	public static String HC(){
		StringBuilder hashkey = new StringBuilder();
        Random rand = new Random();
        for (int i=32; i > 0; i--)
        {
               hashkey.append("abcdefghijklmnopqrstuvwxyz".charAt(rand.nextInt("abcdefghijklmnopqrstuvwxyz".length())));
        }
        return hashkey.toString();
	}
	
	
}