package Handlers;

import Core.Exceptions;
import Core.Syn;
import GameObjects.GPersonnage;
import Login.DofusLoginClient;
import Login.LoginServer;
import LoginObjects.LAccount;
import Misc.Crypter;
import XML.AccountsConfig;

public class LAuthentificationHandler extends LHandler {

	private int pos = serv.clients.size();//juste une position de base au lieu de mettre 0...
	
	
	public LAuthentificationHandler(LoginServer serv) {
		super(serv);
	}

	@Override
	public void parse(DofusLoginClient c, String packet) throws Exception{
		Syn.wD("[RECV] in [LAuthentificationHandler] << "+packet);
		/*if(packet.equals("Af")){
		 * //En faite c'est dans le LServerSelectHandler que ca se passe.
		 * //C'est Juste au cas ou le packet soit envoyer ici que je lavait laissé là, genre en cas d'erreur 
			Account.Af(c.getSession(), pos, LServer.numberOfPremiumClients, LServer.numberOfNonPremiumClients, c.getAccount().getPremiumTime()==0, -1);
			Syn.w("[INFOS]: Packet Af in LAuthentificationHandler");
			return;
		}*/
		
		//Syn.w("[RECV] in [AuthentificationHandler] << " + packet, Ansi.Color.GREEN);
		String[] args = packet.split("\n");
        if (args.length != 2){
        	Exceptions.throwException("AuthentificationHandler: Bad data received : args must have a length of 2 for nickname and password.");
        }else{
        	//Si compte déjà co
        	int accountID = serv.world.isAccountConnected(args[0]);
        	
        	if((accountID != 0 || serv.world.isAccountInQueue(args[0])) && serv.clientsToTerminate.get(accountID) == null){
        		GPersonnage p = serv.world.getAccount(accountID).getCurPerso();
        		if(p != null && p.getFight() != null){
        			//...
        		}else{
        			SM.Account.errorAlreadyConnectedInLogin(c.getSession());
        			c.kickWoAccount();
        			return; //Syn.d("Le Compte est déjà connecté  !", Ansi.Color.RED);
        		}
    		}
        	LAccount a = null;
        	if(accountID != 0 && serv.clientsToTerminate.get(accountID) != null){
        		Syn.d("En train d'enlever le compte de la liste à terminer et de setter a = LWorld.getAccount(id)");
        		serv.clientsToTerminate.remove(accountID).cancel(false);
        		a = serv.world.getAccount(accountID);
        	}else
        	if(accountID != 0 && serv.world.getAccount(accountID) != null){
        		a = serv.world.getAccount(accountID);
        	}
        	
    		a = isAccountOK(c, args[0], args[1], a);
    	    if(a != null){
    	    		if(a.isPremium()){
    	    			Syn.d("LServer.numberOfPremiumClients++;");
    	    			serv.numberOfPremiumClients++;
    					pos = serv.numberOfPremiumClients;
    				}else{
    					serv.numberOfNonPremiumClients++;
    					pos = serv.numberOfNonPremiumClients;
    				}
    	        	c.setAccount(a);
    	        	serv.world.addAccount(a);
    	        	SM.Account.Ad_Ac_AH_AlK_AQ(c, c.getAccount().getPseudo(), c.getAccount().hasGM(), c.getAccount().getSecretQuestion(), c.getAccount().getCommunity());
    	        	c.setHandler(new LServerSelectHandler(serv, pos));
    	    }else{
    	        //Syn.d("Le Compte n'existe pas  !", Ansi.Color.RED);
    	    }
        }
	}
	
	public static LAccount isAccountOK(DofusLoginClient c, String username, String password, LAccount a){
		if(a == null){
			//Comptes Admins ajoutés par config
			for(LAccount l : AccountsConfig.accounts){
				if(l.getUsername().equalsIgnoreCase(username)){
					a = l;
				}
			}
			//Sinon comptes normaux ajoutés par bdd
			if(a == null){
	    		Syn.d("AuthentificationHandler : a == null so need to do LOAD ACCOUNT");
				a = SQL.Accounts.load(c.getHandler().serv, username);
			}
		}else{
    		Syn.d("AuthentificationHandler : a != null so DONT load account !");
		}
        
		if(a != null){
        	if(a.isBanned()){
        		SM.Account.errorBanned(c.getSession());
        	}else 
        	if(!Crypter.CryptPassword(c.getHashKey(), a.getPassword()).equals(password)){
        		SM.Account.errorLogin(c.getSession());
        	}else{
            	return a;
        	}
        }
    	c.kick();
    	c = null;
    	return null;
		
	}
	  
	
	
}