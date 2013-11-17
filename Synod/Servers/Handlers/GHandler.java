package Handlers;

import java.util.Random;
import java.util.regex.Pattern;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.fusesource.jansi.Ansi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Constants.CPerso;
import Constants.CWorld;
import Constants.Constants;
import Core.Exceptions;
import Core.Syn;
import Enums.SynActions.CommonAction;
import Game.DofusGameClient;
import Game.DofusGameServer;
import GameObjects.GBank;
import GameObjects.GPersonnage;
import LoginObjects.LAccount;
import SM.Account;


public class GHandler extends MinaHandler {
	
	public static Logger log = LoggerFactory.getLogger(GHandler.class);
	
	
	public DofusGameServer gServ = null;
	
	public GHandler(DofusGameServer gServer){
		gServ = gServer;
	}
	public GHandler(){
		
	}
	//private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private static final String voyelles = "aeiouy";
	private static final String consonnes = "bcdfghjklmnpqrstvwxz";
	
	@Override
	public void exceptionCaught(IoSession session, Throwable arg1) throws Exception {
		DofusGameClient c = ((DofusGameClient)session.getAttribute("client"));
		if(c != null){
			if(c.getHandler().gServ.getConfig().isKickOnExceptionCaught()){
				((DofusGameClient)session.getAttribute("client")).kick();
			}
			if(c.getHandler().gServ.getConfig().isBanOnExceptionCaught()){
				Syn.d("set banned because ExceptionCaught");
				c.getAccount().setBanned(true, true);
			}
		}
		Syn.w("GHandler exceptionCaught kicked GClient: ");
		//arg1.printStackTrace();
		//Syn.w("[MSG]"+arg1.getClass().getName()+"[MSG]");
		String stackTrace = "";
		for(StackTraceElement s : arg1.getStackTrace()){
			if(s.toString().contains("org.apache.mina") == false){//Ã§a prenait tellement trop de place dans la console ces logs lÃ  -.-
				stackTrace += "\n" + s.toString();
			}
		}
		Exceptions.write(arg1.getClass().getName(), stackTrace);
	}

	
	@Override
	public void messageReceived(IoSession session, Object msg) throws Exception {
		if (!(msg instanceof String)) {
			Exceptions.throwException("GHandler.[RECV] : le message recu n'est pas une string.");
			return;
		}
		
		String packet = msg.toString();
		DofusGameClient c = ((DofusGameClient)session.getAttribute("client"));
		if(c == null){
			session.close(true);
			return;
		}
		
		if(gServ == null){
			log.warn("GHANDLER.   SERV == NULL");
		}
		if(c.getPacketsRECV() == null){//Ca veut dire qu'il a fini avec le parsing des packets d'ici (de connexion u know)
			boolean nobug =  this.gServ.getParsingManager().parse(c, packet);//ParsingManager.parse(c, packet);
			//Syn.d("nobug ="+nobug+".");
			if(!nobug){
				packetCantParse(c, packet, "Raison inconnue, soit parseur non-cré soit erreur dans un des parseurs.");
			}
			return;
		}
		
		Syn.w("G [RECV] << "+msg, Ansi.Color.GREEN);
		
		if(packet.charAt(0) != 'A'){
			packetCantParse(c, packet, "Dans GHandler.messageReceived : packet.charAt(0) != 'A'");
			return;
		}
		//Sont en ordre d'apparition. Faut vÃ©rifier, quand on recoit un packet, si celui d'avant a bien Ã©tÃ© acceptÃ©.
		switch(packet.toString().charAt(1)){
			case 'T'://Set le compte au GClient par son compteID.  Exemple Ã  RECV: G [RECV] << AT3
				LAccount a  = (LAccount) gServ.queue.updateQueuedAccounts(CommonAction.REMOVE, null, Integer.parseInt(packet.substring(2)));
				
				if(a != null){
					//Syn.d("allo compte pas null. a.curIP =="+a.getCurIP()+"--");
					if(a.getCurIP().equals("127.0.0.1") || a.getCurIP().length() == 0 || a.getCurIP().equals(session.getRemoteAddress().toString().split(":")[0].substring(1)) == true ){
						//Syn.d("allo ip et tout parfait");
						gServ.getLoginServer().world.addAccount(a);
						c.getPacketsRECV().append(packet);
						c.setAccount(a);
						SM.Account.ATK0(session);
						break;
					}else{
						//TODO: Que faire en cas que quelqu'un se connecte 
						//  sur un compte avec une ip autre que la derniere IP marquÃ©e
						Syn.d("GHandler.messageRCV (AT) allo ip du compte ("+a.getID()+") et tout PAS parfait : session.remoteAddresse = ("+session.getRemoteAddress().toString().split(":")[0].substring(1)+"),   account.getCurIP = ("+a.getCurIP()+")");
					}
				}else{
					log.warn("Quelqu'un essaye de se co au game sans que son compte soit passÃ© par la queue du login.");
				}
				c.kick();
				break;
			case 'k'://ok
				if(c.getPacketsRECV().indexOf("AT") >= 0){
					c.getPacketsRECV().append(packet);
					SM.Sender.send(session, "BN");
					break;
				}
				c.kick();
				break;
			case 'V'://version
				if(c.getPacketsRECV().indexOf("Ak0") >= 0){
					c.getPacketsRECV().append(packet);
					SM.Account.AV0(session);
					break;
				}
				c.kick();
				break;
			case 'g'://List des gifts. Packet Agfr-> Accounts gift FRancais. ->  this.aks.send("Ag" + this.api.config.language);
				if(c.getPacketsRECV().indexOf("AV") >= 0){
					c.getPacketsRECV().append(packet);
					if(c.getAccount().getGift() == null){
						SM.Basics.BN(session);
					}else if(this.gServ.getcWorld().lang.equals(packet.substring(2))){
						SM.Account.Ag(c);//exemple "fr" dans la plupart des cas.
					}
					break;
				}
				c.kick();
				break;
			case 'i'://client key
				if(c.getPacketsRECV().indexOf("Agfr") >= 0){
					c.getPacketsRECV().append(packet);
					c.setClientkeyID(packet.substring(2));
					break;
				}
				c.kick();
				break;	
			case 'L':// character LIST
				if(c.getPacketsRECV().indexOf("Ai") >= 0){
					c.getPacketsRECV().append(packet);
					//
					if(c.getAccount().getPersos().length == 0){
						//c.setHandler(new GPersoCreationHandler(gServ));
						//	c.setScreenID(CServers.SCREEN_CREATECHAR);
					}else if(c.getAccount().getPersos()[0].getInventory() == null){
						//Si les inventaires des persos de ce compte n'ont pas dÃ©jÃ  Ã©tÃ© chargÃ©s
						SQL.Personnages.loadServerPersosList(c.getAccount().getPersos(), gServ);
						//c.setHandler(new GPersoSelectionHandler(gServ));
						//c.setScreenID(CServers.SCREEN_CHARLIST);
					}
					SM.Account.ALK(c, c.getAccount().getPersos());
					break;	
				}
				c.kick();
				break;
			case 'P'://get random name
				if(c.getPacketsRECV().indexOf("AL") >= 0){
					generateRandomName(c);
					break;
				}
				c.kick();
				break;
			case 'A'://Create perso
				if(c.getPacketsRECV().indexOf("AL") >= 0){
					createPerso(c, packet);
					break;
				}
				c.kick();
				break;
			case 'D'://Delete Perso 
				if(c.getPacketsRECV().indexOf("AL") >= 0){
					boolean error = false;
					int persoID = 0;
					try{
						persoID = Integer.parseInt(packet.substring(2, packet.lastIndexOf("|")));
					}catch(Exception e){
						e.printStackTrace();
						error = true;
					}
					String secretAnswer = null;
					if(packet.endsWith("|") == false){
						secretAnswer = packet.substring(packet.indexOf("|")+1, packet.length());//split.length>1?split[1]:"";
					}
					//Syn.d("persoID = "+persoID);
					//Syn.d("secretAnswer = "+secretAnswer);
					GPersonnage p = null;
					for(GPersonnage perso : c.getAccount().getPersos()){
						if(perso != null){
							if(perso.getID() == persoID){
								p = perso;
							}
						}
					}
					if(gServ.getWorld().getPerso(persoID) == null){
						//Syn.d("Perso est PAS co dans le monde.");
					}else{
						//Syn.d("Perso EST co dans le monde.");
						log.error("GHandler essaye de supprimer un perso alors qu'il est connectÃ©");
						error = true;
					}
					if(p == null){
						log.error("GHandler essaye de delete un perso qui n'appartient pas au compte");
						error = true;
					}
					if(error == false){
						if(p.getLevel() < this.gServ.getConfig().getMinLvlAskSecretForDelete()){
							deletePerso(c, p);
							break;
						}else if(secretAnswer.equals(p.getAccount().getSecretAnswer())){
							deletePerso(c, p);
							break;
						}
					}
				}
				SM.Account.errorDeletePersoFail(c.getSession());
				c.kick();
				break;
			case 'f': //waiting queue
				if(c.getPacketsRECV().indexOf("AL") >= 0){
					c.getPacketsRECV().append(packet);
					//(IoSession out, int position, int totalAbo, int totalNonAbo, boolean premium, int worldID)
					if(gServ.getConfig().ConnexionQueue){
						Account.Af(c.getSession(), 0, gServ.connexionQueue.getWaitingPremiumListSize(), gServ.connexionQueue.getWaitingListSize(), c.getAccount().isPremium(), this.gServ.getWorld().getID());
					}else{
						Account.Af(c.getSession(), 0, 0, 0, c.getAccount().isPremium(), this.gServ.getWorld().getID());
					}
					break;
				}
				c.kick();
				break;		
			case 'G'://TODO: assigner un cadeau Ã  un personnage
				if(c.getPacketsRECV().indexOf("Agfr") >= 0){
					if(c.getAccount().getGift().getItems()  != null){
						c.getPacketsRECV().append(packet);
						assignGiftToPerso(c, packet);
						break;
					}
				}
				SM.Sender.send(c.getSession(), "BN");
				c.kick();
				break;	
			case 'S'://set select perso
				//bvlablablablablablabla setHandler(new GGameHandler());
				boolean done = false;
				if(c.getPacketsRECV().indexOf("AL") >= 0){
					for(byte i = 0; i < c.getAccount().getPersos().length; i++){
						//Syn.d("byte i = "+i);
						if(packet.startsWith("AS"+c.getAccount().getPersos()[i].getID())){
							c.getAccount().setCurPerso(i);
							Syn.d("Setted CurPerso index : "+i);
							c.getAccount().getCurPerso().onSelected(c);
							done = true;
							c.setPacketsRECV(null);
							//c.setHandler(new GGameHandler(gServ));//, c, c.getAccount().getCurPerso()));
							break;
						}
					}
				}
				if(!done){
					Syn.d("set banned ghandler bugs");
					c.getAccount().setBanned(true, true);
					c.kick();
				}
				break;	
			default:
				Syn.d("set banned because gstats bugs 2");
				c.getAccount().setBanned(true, true);
				c.kick();
				break;
		}
		
	}

	
	public Object parse(DofusGameClient c, String packet) throws Exception{
		//,... to Override
		return null;
	}
	
	/**
	 * XXX [Ã€ achever!] GGameHandler.packetCantParse(GClient c)   -> que faire si le packet Ã  pÃ¢rser n'existe pas.
	 * @param c
	 */
	public static void packetCantParse(DofusGameClient c, String packet, String additionnalInfo){
		if(c != null){
			if(c.getAccount() != null && c.getSession() != null){
				if(c.getSession().isConnected()){
					if(c.getAccount().getCurPerso() != null){
						//SM.Messages.M(perso, "Cette fonction n'est pas encore disponible, vous pouvez le signaler sur le DevBlog.", "color");
						//Si on a vraiment ajouté toutes les fonctions, et tout vérifié, 
						//		passé au peigne fin, qu'on est sur que ce packet ne devrait pas exister:
						//  on pourrait se permettre de faire :
								if(c.getHandler().gServ.getConfig().isKickOnPacketCantParse()){
									c.kick();
								}
								if(c.getHandler().gServ.getConfig().isBanOnPacketCantParse()){
									Syn.d("set banned because packetCantParse");
									c.getAccount().setBanned(true, true);
								}
						log.error("GHandler.packetCantParse : "+packet);
						Exceptions.throwException("GHandler.packetCantParse : "+packet+". "+additionnalInfo);
					}
				}
			}
		}
		
	}



	@Override
	public void sessionClosed(IoSession session) throws Exception {
		Syn.w("G sessionClosed id:"+session.getId(), Ansi.Color.GREEN);
		DofusGameClient c = ((DofusGameClient)session.getAttribute("client"));
		if(c != null){
			Syn.d("sessionClosed c != null");
			//if(c.getAccount() != null){
					//Threads.Timer.accountsToRemoveIfUnused.put(c.getAccount().getID(), c.getAccount());
				//LWorld.removeAccount(c.getAccount().getID());
			//}
			c.kick();
		}
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus arg1) throws Exception {
		Syn.w("G sessionIdle id:"+session.getId(), Ansi.Color.RED);
		DofusGameClient c = ((DofusGameClient)session.getAttribute("client"));
		if(c != null && c.getSession() != null){
			Syn.d("sessionIdle c != null && c.getSession() != null");
			//if(c.getAccount() != null){
				//Threads.Timer.accountsToRemoveIfUnused.put(c.getAccount().getID(), c.getAccount());
				//LWorld.removeAccount(c.getAccount().getID());
				//if(c.getSession() != null){
					SM.Messages.MS(c, "01|");
				//}
			//}
			c.kick();
		}
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		Syn.w("G sessionOpened id:"+session.getId(), Ansi.Color.RED);
		if(gServ.clients.size() >= gServ.getConfig().getMaximumClients()
			|| gServ.getState() != CWorld.STATE_ONLINE){
			return;
		}
		
		DofusGameClient c = new DofusGameClient(session);
		session.setAttribute("client", c);
		c.setHandler(this);
		SM.Realm.HG(session);
		gServ.clients.add(c);
		if(gServ.recordConnexion < gServ.clients.size()){
			gServ.recordConnexion = gServ.clients.size();
		}
	}
	
	
	

	private static void generateRandomName(DofusGameClient c) {
		//EX: Game: Recv << AP  .[Send] >> APKdobhr .... Game: Recv << AP  .[Send] >> APKbckrh
		StringBuilder name = new StringBuilder();
		Random rand = new Random();
		boolean voyel = rand.nextBoolean();
		if(voyel){
			name.append((voyelles.charAt(rand.nextInt(voyelles.length()))+"").toUpperCase());
		}else{
			name.append((consonnes.charAt(rand.nextInt(consonnes.length()))+"").toUpperCase());
		}
		voyel = !voyel;
		for(int i = 3+rand.nextInt(10); i > 0; i--){
			if(voyel){
				name.append(voyelles.charAt(rand.nextInt(voyelles.length())));
			}else{
				name.append(consonnes.charAt(rand.nextInt(consonnes.length())));
			}
			voyel = !voyel;
		}
		SM.Account.APK(c.getSession(), name);
	}
	
	private boolean createPerso(DofusGameClient c, String packet){
		//Syn.d("creating");
		// --------- ex1: 
		// Ã  recevoir : AAMohitori|10|1|-1|-1|-1..
		// Ã  renvoyer: AAK.      (Creation OK)
		// envoyer (liste des persos du serv actuel)  ALK0|2|1400152;Instigator;10;91;ffffff;ffffff;ffffff;,2035,,,;0;601;;;|1518401;Mohitori;1;101;-1;-1;-1;null;0;601;;;
		//recevoir (selection du perso ID)   AS1518401..
		// --------- ex2: 
		//G [RECV] << AANom de votrejhlikj|8|0|9175040|-1|-1
		
		//AA name|classID|sexe|color1|color2|color3
		/*
		 To Check : TODO
		 x si a dÃ©jÃ  5 perso ?
		 x nom prit?
		 - nom respectant les normes?
		 - gfx correspond Ã  la classe?
		 - couleurs Ã  l'intÃ©rieur d'un chiffe "normal" (boundaries, ex: pas plus que 1435987) ?
		 x sexe E[0,1] ?
		 x classe E[1,12]?
		 */
		String infos[] = packet.substring(2).split("\\|");
		//Syn.d("gServ.getDBName() : "+gServ.getDBName()); synworld0
		//Syn.d("gServ.GWorld.CWorld.name  : "+gServ.getWorld().getcWorld().name); Jiva
		
		//VÃ©rifie nbrPersos
		if(c.getAccount().getPersos().length >= gServ.getConfig().getMaxPersoPerAccount()){
			SM.Account.errorFivePerso(c.getSession());
			return false;
		}
		//VÃ©rifie la validitÃ© des numÃ©ros de couleur.
		int couleurIndex = 3;
		for(int i = infos[couleurIndex].length(); i > 0; i--){
			if(infos[couleurIndex].equals("-1") == false){
				//Syn.d("Color.sub : "+infos[couleurIndex].substring(i-1, i));
				if(Constants.numbers.contains(infos[couleurIndex].substring(i-1, i)) == false){
					SM.Account.errorCreatePersoFail(c.getSession());
					//c.getAccount().setBanned(true);
					return false;
				}
			}else{
				i = 1;
			}
			if(i == 1){
				couleurIndex++;
				if(couleurIndex > 5){
					break;
				}
				i = infos[couleurIndex].length()+1;
				//Syn.d("-");
			}
		}
		
		//VÃ©rifie si class/sexe est valide (Pas en bas de 1 ou en haut de 12 pour la classe et pas autre chose que 0 ou 1 pour le sexe)
		if(CPerso.classesIDs.contains("-"+infos[1]+"-")  == false || CPerso.sexIDs.contains("-"+infos[2]+"-") == false){
			SM.Account.errorCreatePersoFail(c.getSession());
			Syn.d("set banned because cheat at perso creation");
			c.getAccount().setBanned(true, true);
			return false;
		}

		//VÃ©rifie si le nom est valide
		if(verifyName(infos[0], c, gServ) == false){
			SM.Account.errorNameTaken(c.getSession());
			return false;
		}
		
		//Met la 1ere lettre en majuscule si Ã©tait minuscule.
		if(Character.isUpperCase(infos[0].charAt(0)) == false){
			infos[0] = infos[0].substring(0,1).toUpperCase() + infos[0].substring(1);
			SM.Account.APK(c.getSession(), new StringBuilder(infos[0]));
		}
		
		//Syn.d("WORKS");
		//Syn.d("Name : "+infos[0]);
		//CrÃ©Ã©/Initialise le personnage et ses variables
		//+ CrÃ©Ã© un nouveau GInventory avec les items de dÃ©part dedans
		//+ CrÃ©Ã© un nouveau GStatistiques avec les items de dÃ©part dedans
		GPersonnage newPerso = gServ.getProviders().providePerso()	//GPersonnage
						.createNew(gServ.getWorld().getNextPersoID(), gServ, c.getAccount(), 
				infos[0], Byte.parseByte(infos[1]), Byte.parseByte(infos[2]), Integer.parseInt(infos[3]), Integer.parseInt(infos[4]), Integer.parseInt(infos[5]));
				
		
		
		boolean hasOther = false;
		for(GPersonnage p : c.getAccount().getPersos()){
			if(p.getServerID() == newPerso.getServerID() && p != newPerso){
				hasOther = true;
			}
		}
		
		//Ajoute le personnage dans l'array de perso du compte
		GPersonnage[] copy = new GPersonnage[c.getAccount().getPersos().length+1];
		for(int i = c.getAccount().getPersos().length-1; i >= 0; i--){//Commence au dernier index de l'array dorigine et va jusquÃ  0
			copy[i] = c.getAccount().getPersos()[i];
		}
		copy[copy.length-1] = newPerso;
		c.getAccount().setPersos(copy);
		copy = null;
		//c.getAccount().setPersos((GPersonnage[]) Utils.addElementToArray(c.getAccount().getPersos(), newPerso));
		
		//Ajoute la nouvelle ligne sql du personnage dans la bdd et 
		// update la liste de perso du comtpe aussi dans la bdd
		//+ CrÃ©Ã© une nouvelle banque dans ce monde s'il n'y avait pas de persos dans ce dernier auparavant.
		//+ Envoie les packets d'une crÃ©ation rÃ©ussie
		//Syn.w("going on");
		//Syn.d("acc.perso.length"+c.getAccount().getPersos().length);
		if(hasOther == false){
			GBank gb = new GBank(0);//0 = kamas dans la banque
			c.getAccount().setBanks(c.getAccount().getBanks()+newPerso.getServerID()+",");//Ajoute la banque Ã  la liste de banques du compte
			newPerso.getWorld().addBank(newPerso.getAccountID(), gb);//Ajoute la banque au World
			SQL.Banks.create(gb, newPerso);//CrÃ©Ã© la banque dans la BDD
		}
		try{
			SQL.Personnages.create(newPerso, gServ);
			SQL.Personnages.createStatistiquesBase(newPerso);
			SQL.Accounts.updatePersos(c.getAccount());
			SM.Account.AAK(c.getSession());
			SM.Account.ALK(c, c.getAccount().getPersos());
			SM.Tutorials.TB(c.getSession());  // animation crÃ©ation personnage
		}catch(Exception e){
			deletePerso(c, newPerso);
			SM.Account.errorCreatePersoFail(c.getSession());
		}
		return true;
	}
	
	public static boolean verifyName(String name, DofusGameClient c, DofusGameServer gs){
		if(Pattern.matches(Constants.isAlpha, name) == false){
			return false;
		}
		//VÃ©rifie si le nom est valide
		if(		name.length() >= 3 && name.length() < 25
				&& name.contains(" ") == false
				&& name.startsWith("-") == false
				&& name.endsWith("-") == false
				&& name.contains("mj") == false
				&& name.contains("modo") == false
				&& name.contains("admin") == false
				&& name.contains("caca") == false
				&& name.contains("pipi") == false
				&& name.contains("cul") == false
				&& name.contains("ass") == false
				&& name.contains("crÃ©a") == false
				&& SQL.Personnages.exists(name, gs.getSqlService()) == false
		){
			short nbrTraits = 0;// nbr de : "-"
			short majuscules = 0;// nbr de : mAj
			char lastChar = ' ';
			char lastLastChar = ' ';
			for(int i = name.length()-1;  i >=0 ;  i--){
				//Multiples traits d'unions
				if(name.charAt(i) == '-' || name.charAt(i) == '-'){
					if(nbrTraits >= 2){
						return false;
					}
					nbrTraits++;
				}
				//Multiples Majuscules
				if(Character.isUpperCase(name.charAt(i))){
					if(majuscules >= 1 && (lastChar != '-' || lastChar != '_')){
						return false;
					}
					majuscules++;
				}
				//3 fois la meme lettre d'affilÃ©.
				if(name.charAt(i) == lastChar && lastChar == lastLastChar){
					return false;
				}
				lastLastChar = lastChar;
				lastChar = name.charAt(i);
			}
		}else{
			return false;
		}
		
		return true;
	}
	
	private static void assignGiftToPerso(DofusGameClient c, String packet){
		String str[] = packet.substring(2).split("\\|");
		int giftID = Integer.parseInt(str[0]);
		int persoID = Integer.parseInt(str[1]);
		GameObjects.GPersonnage perso = null;
		if(c.getAccount().getGift().getID() == giftID){//Si l'ID de gift correspond bien au gift de l'account
			for(GPersonnage p : c.getAccount().getPersos()){
				if(persoID == p.getID()){//str[1] = p.getID()
					perso = p;
				}
			}
			if(perso != null){//Si le perso choisi appartient bien Ã  ce compte
				for(String item : c.getAccount().getGift().getItems()){
					//TODO/FIXME assignGiftToPerso 
					//lets go, donne les items du gift au perso 
					// et enleve le gift du compte.
					//+ update l'interface de cadeau en enlevant celui qui a Ã©tÃ© donnÃ©
					//perso.addItem(new Item(item));
				}
				SM.Account.AG(c);
				SQL.Gifts.delete(perso.getServer().getLoginServer(), giftID);
				SQL.Accounts.updateGift(c.getAccount(), 0);
			}
		}
	}
	
	/**
	 * TODO: deletePerso: jamais fini ! Ã  updater !
	 * @param c
	 * @param p
	 */
	private void deletePerso(DofusGameClient c, GPersonnage p){
		p.getAccount().setCurPerso(Constants.ZERO_BYTE);
		//Enleve le perso de l'array dans le compte
		GPersonnage[] copy = new GPersonnage[p.getAccount().getPersos().length-1];
		int indexCopy = 0;
		for(GPersonnage b : p.getAccount().getPersos()){
			if(b != p){
				copy[indexCopy] = b;
			}else{
				indexCopy--;
			}
			indexCopy++;
		}
		p.getAccount().setPersos(copy);
		copy = null;
		//p.getAccount().setPersos((GPersonnage[]) Utils.removeElementFromArray(p.getAccount().getPersos(), p));
		
		//VÃ©rifie Si y'a dautres persos dans le meme monde 
		boolean hasOther = false;
		for(GPersonnage perso : p.getAccount().getPersos()){
			if(perso.getServerID() == p.getServerID() && perso.getID() != p.getID()){
				hasOther = true;
				break;
			}
		}
		//FIXME Si il reste aucun autre perso dans le meme monde: delete bank
		//TODO  Delete la banque, les gifts, ....
		if(hasOther == false){
			//XXX Devrait pas arriver..normalement y'a une banque par serveur..
			//devrait etre impossible de ne pas en avoir. 
			//Ã€ moins qu'on en mette pas quand la personnage fout absolument rien dedans: 
			//	0kamas, 0items. LÃ  ok.
			if(p.getWorld().getBank(p.getAccountID()) != null){
				p.getWorld().getBank(p.getAccountID()).delete(p);
			}
			
		}
		
		//Continue les delete
		//Delete l'inventory/items du world + de la bdd
		p.getInventory().delete(p);
		//Supprime la ligne de stats dans la bdd
		SQL.Personnages.deleteStatistiques(p.getID(), p.getServer());
		//Supprime la ligne du perso dans la bdd
		SQL.Personnages.delete(p.getID(), p.getServer());
		//Update la liste de personnages du compte dans la bdd
		SQL.Accounts.updatePersos(p.getAccount());
		
		//Envoie le packet pour voir la liste de persos sur le serveur
		SM.Account.ALK(c, p.getAccount().getPersos());
		//Fini de supprimer le personnage en terminant tous les objets inutiles dans l'emu qui lui sont reliÃ©s
		try {
			p.terminate();
		} catch (NullPointerException e) {e.printStackTrace();
		} catch (Throwable e) {e.printStackTrace();}
		p = null;
	}
	
	
}