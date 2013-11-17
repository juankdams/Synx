package CMS;

public class SiteClient {
/*
	//FIXMe: met pas de r�f�rence directe � la config ici.
	//FIXMe: SiteClient > GServer > GConfig : Tout part des clients de Syn. Ce sont eux qui ont le contr�le.
	private IoSession session = null;
	private GConfigJDOM c = null;
	private GServer s = null;
	int failedConnexionTries = 0;
	
	/**
	 * @return - True = parsed, False = not parsed.
	 */
/*	public boolean parse(String packet){
		if(packet.charAt(0) == '@'){
			//Pour le socket avec l'application client des cr�ateurs de serveurs (client syn)
			parseForApp(packet);
			return true;
		}else if(packet.charAt(0) == '#'){
			//Pour les sites des memes gars
			parseForSite(packet);
			return true;
		}
		return false;
	}
	
	
	public void parseForApp(String packet){
		switch(packet.charAt(1)){
			case 0://Ex: @0robynz;qazwsx12
				boolean fail = false;
				//TODO Login avec ndc et mdp 
				
				if(fail){
					failedConnexionTries++;
					if(failedConnexionTries == 7){
						if(session != null && session.isConnected()){
							session.close(false);
						}
						
					}
				}
				break;
			case 1://Ex: @1- ou @1O ou @1S ou @1D ou @1A
				if(packet.charAt(2) == '-'){
					//Turn off the GServer
					s.off();
				}else if(packet.charAt(2) == 'O'){
					//Turn on the GServer
					s.start();
				}else if(packet.charAt(2) == 'S'){
					//Sauvegarde le serveur
					s.setState(CWorld.STATE_SAVING);
					s.getWorld().saveAll();
				}else if(packet.charAt(2) == 'D'){
					//FIXME Delete le server de la config et des array et la connexion sql de l'array "games" aussi (Voir class SQl)
					LServer.deleteGServ(s.getConfig().getWorldID());
				}else if(packet.charAt(2) == 'A'){
					//FIXME Ajoute un nouveau GServ � l'array, nouvelle config, nouvelle connexion sql, tout a mettre dans leurs array respectives
					if(s == null){
						LServer.addNewGServer(packet.split(";")[1], packet.substring(packet.lastIndexOf(";")));
					}
				}
				break;
			case 2:
				//Modify GConfig Attribute: Ex: @2ServerName@Scylla
				GConfigWriterJDOM.modifyGConfig(c.getServerName(), packet.substring(2, packet.indexOf("@")), packet.substring(packet.indexOf("@")+1));
				//Sender.send(null, "@M;CeciEstUnMessagePourVousDireQueLaModificationABien�t�Faite");
				break;	
			case 3:
				//Reset GConfig: Ex: @3;TicTak;14
				GConfigWriterJDOM.deleteGConfig(c.getServerName());
				c = GConfigWriterJDOM.writeNewGConfig(packet.split(";")[1], packet.substring(packet.lastIndexOf(";")));
				break;
			case 4://Execute une commande dans la console (noire,console linux)
				//Exemple faire une annonce
				break;
			case 5:
				//Get Complete Disponible CWorld List
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				break;
			default:
				break;
		}
	}
	
	public void parseForSite(String packet){
		switch(packet.charAt(1)){
			case 'A'://todo Ajoute de l'abonnement à qqn (via packet venant du site)
				int id = Integer.parseInt(packet.substring(2, packet.indexOf(";")));
				LAccount a = LWorld.getAccount(id);
				if(a != null){
					//blabdksjundfn
				}else{
					a = SQL.Accounts.load(id);
					if(a != null){
						
					}else{
						//Compte / ou Id de compte inexistant
					}
				}
				break;
		}
	}
	*/
}