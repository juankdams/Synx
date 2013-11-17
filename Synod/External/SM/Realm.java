package SM;

import static SM.Sender.send;

import org.apache.mina.core.session.IoSession;


//------------------------------------------------------------------------------------------------------------------ REALM

/**
 * Contient tous les paquets envoyables concernant le Realm
 */
public class Realm{
	/**
	 * Envoie le packet d'HelloConnection :  this.aks.onHelloConnectionServer(sData.substr(2));
	 */
	public static String HC(IoSession out)
	{
		String supp = Supplements.HC();
		send(out,"HC"+supp);
		return supp;
	}
	/**
	 * Envoie le packet d'HelloGame :  this.aks.onHelloGameServer(sData.substr(2));
	 */
	public static void HG(IoSession out)
	{
		send(out,"HG");
	}
	/**
	 * Envoie le packet d'HelloBye :    this.aks.disconnect(false, true);
	 * <p> En fait, Le packet H+n'importe quoi apres (sauf C et G) fait déconnecter le cliet
	 */
	public static void HB(IoSession out)
	{
		send(out,"HB");
	}
	/**
	 * Pong <p>
	 * Envoie "pong" <p>
	 */
	public static void pong(IoSession out)
	{
		send(out,"pong");
		//send(out,"p");  ca se peut quon aie juste besoin du "p" et non du "pong" au complet dans les sources du client
	}
	/**
	 * Quick Pong <p>
	 * Envoie "qpong" <p>
	 */
	public static void qPong(IoSession out)
	{
		send(out,"qpong");
		//send(out,"q");  ca se peut quon aie juste besoin du "q" et non du "qpong" au complet dans les sources du client
	}
	/**
	 * this.aks.send("rpong" + sData.substr(5), false);
	 */
	public static void rPing(IoSession out, String packet)
	{
		send(out,"r"+packet);
	}
	/**
	 * REALM_SEND_POLICY_FILE <p>
	 */
	public static void policyFile(IoSession out)
	{
		send(out,"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +   
	    		"<cross-domain-policy>"+  
	    	    "<allow-access-from domain=\"*\" to-ports=\"*\" secure=\"false\" />"+  
	    	    "<site-control permitted-cross-domain-policies=\"master-only\" />"+  
	    	    "</cross-domain-policy>");
	}
	
	
}