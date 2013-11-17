/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Misc.StringUtils;

import common.World;
import common.Zen;
import objects.*;
//port com.sun.org.apache.xml.internal.security.utils.*;
/*
 *
 * @author Christophe
 */
/**
 *
 * @author Christophe
 */
public class MasterThread implements Runnable {

	private enum ParsingResult{
		SUCCESS(0),
		FAIL(1),
		INVALID_ACTION(2),
		EXCEPTION_CATCHED(3),
		
		PERSO_NOT_FOUND(4),
		ITEM_NOT_FOUND(5),
		X_NOT_FOUND(6),
		INVALID_QUANTITY(7),//genre qty < 0
		
		;
		private int result = -1;
		private ParsingResult(int i){
			result = i;
		}
	}
	
	
	private BufferedReader _in;
	private Thread _t;
    private PrintWriter _out;
	private Socket _s;

        /*Variables repr?sentant les champs de la base*/
		//        Personnage perso;
		//	Personnage _perso;
      //  int action;
       // int nombre;
       // int id;

       // String sortie;
        //String couleur = "DF0101"; //La couleur du message envoyer a l'utilisateur (couleur en code HTML)
       // Objet obj;
        /*FIN*/

        /**
         *
         * @param sock
         */
        public MasterThread(Socket sock) {
		try {
                    _s = sock;
                    _in = new BufferedReader(new InputStreamReader(_s.getInputStream()));
                    _out = new PrintWriter(_s.getOutputStream());
                    _t = new Thread(this);
                    _t.setName("Thread MasterThread");
                    _t.setDaemon(true);
                    _t.start();
		} catch (IOException e) {
			try {
                            if (!_s.isClosed())
                                _s.close();
			} catch (IOException e1) {}
		} finally {
		}
	}

    @Override
	public void run() {
            try {
                String packet = "";
                char charCur[] = new char[1];
                while (_in.read(charCur, 0, 1) != -1 && Zen.isInit) {
                    if (charCur[0] != '\u0000' && charCur[0] != '\n' && charCur[0] != '\r') {
                        packet += charCur[0];
                    } else if (!packet.isEmpty() && packet.endsWith("]")) {
                        packet = packet.substring(0, packet.length() - 1);
	                    try {
	                    	Zen.writeD("[Master Recv:] "+packet);
	                        int responseID = parsePacket(packet).result;
	                        send("@10#"+responseID);//Success!
	                    } catch (SQLException ex) {
	                        Logger.getLogger(MasterThread.class.getName()).log(Level.SEVERE, null, ex);
	                        send("@10#"+ParsingResult.EXCEPTION_CATCHED.result);//Exception catched!
	                    }
	                    packet = "";
                    }
                }
            } catch (IOException e) {
                try {
                        _in.close();
                        _out.close();
                        if (!_s.isClosed())
                            _s.close();
                        _t.interrupt();
                } catch (IOException e1) {}
            } finally {
                try {
                        _in.close();
                        _out.close();
                        if (!_s.isClosed())
                                _s.close();
                        _t.interrupt();
                } catch (IOException e1) {}
            }
	}
/*s
	private boolean persoOK() {
            boolean retour = false;
            if (_perso.isOnline()) {
                    retour = true;
            }
            return(retour);
        }

	private Personnage persoEnLigne() {
            Personnage retour = null;
            if (_perso.isOnline()) {
                    retour = _perso;
            }
            return(retour);
        }
*/
     /*   private static void closeResultSet(ResultSet RS) {
            try {
                RS.getStatement().close();
                RS.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
	}*/
    
    

	    public void send(String packet) {
	        if (!packet.equals("") && !packet.equals("" + (char) 0x00)) {
	            _out.print(packet+(char) 0x00);
	            _out.flush();
	        }
	    }

        
        public static void showTrace(String msg)
        {
            if (msg.length() > 0) Zen.write(msg);
            Zen.debug("Trace: " +
                "fichier " + new Throwable().getStackTrace()[1].getFileName() +
                " class " + new Throwable().getStackTrace()[1].getClassName() +
                " method " + new Throwable().getStackTrace()[1].getMethodName() +
                " ligne " + new Throwable().getStackTrace()[1].getLineNumber());
        }

       /* public static boolean IfAccountMdpExist(String Name,String Mdp) {
		boolean exist = false;
		try {
			String query = "SELECT * FROM accounts WHERE Account='" + Name + "' AND pass ='" + Mdp + "';";
			ResultSet RS = SQLManager.executeQuery(query);
			boolean found = RS.first();
			if (found) {
        			exist = true;
			}
			closeResultSet(RS);
		} catch (SQLException e) {
                    showTrace(e.getMessage());
		}
		return(exist);
	}
        /**
         *
         * @param Name
         * @return
         */
  /*      public static boolean IfAccountExist(String Name) {
		boolean exist = false;
		try {
                    String query = "SELECT COUNT(*) AS exist FROM accounts WHERE Account LIKE '" + Name + "';";
                    ResultSet RS = SQLManager.executeQuery(query);
                    boolean found = RS.first();
                    if (found) {
                            if (RS.getInt("exist") != 0)
                                    exist = true;
                    }
                    closeResultSet(RS);
		} catch (SQLException e) {
                    showTrace(e.getMessage());
		}
		return(exist);
	}
        /**
         *
         * @param Pseudo
         * @return
         */
  /*      public static boolean IfPseudoExist(String Pseudo) {
		boolean exist = false;
		try {
                    String query = "SELECT COUNT(*) AS exist FROM accounts WHERE Pseudo LIKE '" + Pseudo + "';";
                    ResultSet RS = SQLManager.executeQuery(query);
                    boolean found = RS.first();
                    if (found) {
                            if (RS.getInt("exist") != 0)
                                    exist = true;
                    }
                    closeResultSet(RS);
		} catch (SQLException e) {
                    showTrace(e.getMessage());
		}
		return(exist);
	}                            */

        
	private ParsingResult parsePacket(String packet) throws SQLException {
           // String[] Temporaire1;
            //String[] Temporaire2;
           // String[] TempAcc;
           // int persoID;
           // int OC;
            //if (packet.substring(0, 1).equals("@")) {
            //   Debut de paquet # est OK
            //for(int i =0; i < Temporaire.length ; i++)
            //   System.out.println(Temporaire[i]);
            //perso = World.getPersonnage(1);

           // Zen.debug("MasterClient [RECV] :"+packet);
            this.send("@00#M|Packet bien recu :)");

            //Personnage PersoConnect = null;// .getOnlinePersos();// _perso.;
            if (packet.substring(0, 1).equals("@")){
                int w_Action = Integer.parseInt(packet.substring(1, 3));
            	int idPerso = Integer.parseInt(packet.substring(packet.indexOf("#"), packet.indexOf("|")));
            	if(World.getPersonnage(idPerso) == null){
            		return ParsingResult.SUCCESS;
            	}
            	Personnage p = World.getPersonnage(idPerso);
                switch(w_Action) {
                
	                case 4://@04#idPerso|trucs;DeLaction;ÀFaire
	                	try{
		                	String ac = packet.substring(packet.indexOf("|")+1);
		                	Action a = new Action(Short.parseShort(ac.substring(0,ac.indexOf(";"))), ac.substring(ac.indexOf(";")+1, ac.lastIndexOf(";")), ac.substring(ac.lastIndexOf(";")+1)  );
		                	a.apply(p, p, 0, 0);
		                	//send("@10#0");
		                	return ParsingResult.SUCCESS;
	                	}catch(Exception e){
	                		e.printStackTrace();
	                		return ParsingResult.EXCEPTION_CATCHED;
	                	}
	                //break;  break inutile vu que j'ai des return partout
                	
                	
	             //exemple:  @03#F|S|A|C|I!101]
                /*
                 alors on pourra faire
                 @10#idPerso|idItem|qty
				[14/02/2013 16:37:48] Robyn: et j'renvoie @10#0 si réussi, @10#1 sinon
                 */
	                case 10:
	                	try{
		                	//int idPerso = Integer.parseInt(packet.substring(packet.indexOf("#"), packet.indexOf("|")));
		                	int itemID = Integer.parseInt(packet.substring(packet.indexOf("|"), packet.lastIndexOf("|")));
		                	int qty = Integer.parseInt(packet.substring(packet.lastIndexOf("|")));
		                	
		                	if(World.getPersonnage(idPerso) != null){
		                		if(World.getObjTemplate(itemID) != null){
		                			if(qty > 0){
		                				Objet o = World.getObjTemplate(itemID).createNewItem(qty, false);
		                				World.getPersonnage(idPerso).addObjet(o, true);
		                				SM.Messages.M(World.getPersonnage(idPerso), "Tu viens de recevoir un nouvel item ("+o.getTemplate().getName()+" x "+qty+")!", Zen.koliMsgColor);
		                				return ParsingResult.SUCCESS;
		                			}else{
				                		// send("@10#3");
				                		 return ParsingResult.INVALID_QUANTITY;
		                			}
		                		}else{
			                		 //send("@10#2");
			                		 return ParsingResult.ITEM_NOT_FOUND;
		                		}
		                	}else{
		                		 //send("@10#1");
		                		 return ParsingResult.PERSO_NOT_FOUND;
		                	}
	                	}catch(Exception e){
	                		e.printStackTrace();
	                		return ParsingResult.EXCEPTION_CATCHED;
	                	}
	                	//break;  break inutile vu que j'ai des return partout
                	
                
                
                
                /*
                /////CASES PAR CRYSTAL ET DÉVELOPPEMENT UNIQUEMENT PAR MOI A PARTIR DICI
                	//case 1:
                		//nothing, i juste made this so the numbers parsed here are the same in the client
                 		//in the client, the number 1 is when the perso.OnJoinGame and the emu sends the persoID to the client
                	//break;	
	                case 2: //boutton achievements
	               	 Temporaire1 = Temporaire.split("#");
	               	 Temporaire2 = Temporaire1[1].split("!");
	               	 //debug:
	               	Zen.debug("Packet = "+packet+
	               			"\n Temporaire1[0] = "+Temporaire1[0]+
	               			"\n Temporaire1[1] = "+Temporaire1[1]+
	               	 		"\n Temporaire2[0] = "+Temporaire2[0]+
	               	 		"\n Temporaire2[1] = "+Temporaire2[1]);
	               	 if(World.getPersonnage(Integer.parseInt(Temporaire2[0])) == null){
	               		send("@99#ERROR|PERSOID"); 
	               	 }else{
	               		 persoID = Integer.parseInt(Temporaire2[0]);
		               	 OC = Integer.parseInt(Temporaire2[1]); //0 = Open, 1 = Close
		               	 if(OC == 0){
		               		 GAME_SEND_OPENACHIEV(World.getAchievements(persoID).getString());
		               	 }else if(OC == 1){
		               		 GAME_SEND_CLOSEACHIEV(); 
		               	 }else{
		               		 send("@99#ERROR|OC");
		               	 } 
	               	 }
	               break;
	               case 3:  //boutton statistiques
	               	 Temporaire1 = Temporaire.split("#");
	               	 Temporaire2 = Temporaire1[1].split("!");
	               	 persoID = Integer.parseInt(Temporaire2[0]);
	               	 OC = Integer.parseInt(Temporaire2[1]); //0 = Open, 1 = Close
	               	 if(OC == 0){
	               		 GAME_SEND_OPENSTATS(World.getAchievements(persoID).getString());
	               	 }else if(OC == 1){
	               		 GAME_SEND_CLOSESTATS(); 
	               	 }else{
	               		 send("@99#ERROR|OC");
	               	 }
	               break;
	               case 4: // boutonss Augmenteur de stats 
	               	 Temporaire1 = Temporaire.split("#");
	               	 Temporaire2 = Temporaire1[1].split("!");
	               	
	               	  // int persoID = Temporaire2[0];
	               	  // int statID = Temporaire2[1];
	               	  // int nbr = Temporaire2[2];
	               	 
	               	 World.getPersonnage(Integer.parseInt(Temporaire2[0])).boostStat(Integer.parseInt(Temporaire2[1]), Integer.parseInt(Temporaire2[2]));
	               	 //SocketManager.GAME_SEND_MESSAGE(World.getPersonnage(Integer.parseInt(Temporaire2[0])), "blabla vous avez boost blabla de bla ce qui donne bla", Ancestra.CONFIG_PUB_COLOR);
	               break;
	               case 5: //ping pong 
	            	   send("pong");
	               break;	
	               
	               case 6: //get .infos
	            	   long uptime = System.currentTimeMillis() - Zen.gameServer.getStartTime();
	            	   int jour = (int) (uptime/(1000*3600*24));
	            	   uptime %= (1000*3600*24);
	            	   int hour = (int) (uptime/(1000*3600));
	            	   uptime %= (1000*3600);
	            	   int min = (int) (uptime/(1000*60));
	            	   uptime %= (1000*60);
	            	   int sec = (int) (uptime/(1000));
						
	            	   String mess =	"===========\n"
	            		   +			"Uptime: "+jour+"j "+hour+"h "+min+"m "+sec+"s\n"
	            		   +			"Joueur(s) en ligne(s): "+Zen.gameServer.getPlayerNumber()+"\n"
	            		   +			"Record de connexions: "+Zen.gameServer.getMaxPlayer()+"\n"
	            		   +			"<i>"+Zen.NOM_EMU+" developpé par la Team Ying Yang</i>\n"
	            		   +			"===========\n";
	            	   send(mess);
	               break;	
	               */
                    
                   default: {
                       send("NOOKACT\n\r");
                       return ParsingResult.INVALID_ACTION;
                   }
                }
            }
            return ParsingResult.FAIL;
        }

        
        /*
	//packets statistiques et achievements   NEED DAJOUTER LENVOIE DES INFOS POUR DIRE LES STATS ET LES ACHIEV QUI ONT ÉTÉ RÉUSSIS et un parser dans le loader
	public static void GAME_SEND_OPENACHIEV(String packet){
		send("@02#"+packet);//ouverture du panneau d'achievements
	}
	public static void GAME_SEND_CLOSEACHIEV(){
		send("@02#");//fermeture du panneau d'achievements
	}
	public static void GAME_SEND_OPENSTATS(String packet){
		send("@03#"+packet);//ouverture du panneau de statistiques
	}
	public static void GAME_SEND_CLOSESTATS(){
		send("@03#");//fermeture du panneau de statistiques
	}
	*/
	
}
