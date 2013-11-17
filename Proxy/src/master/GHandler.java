package master;

import java.util.Random;


import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class GHandler extends IoHandlerAdapter{
	//public static Logger log = LoggerFactory.getLogger(GHandler.class);
	

	private static enum ParsingResult{
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
	
	public GServer gServ = null;
	
	public GHandler(GServer gServer){
		gServ = gServer;
	}
	public GHandler(){
		
	}
	
	//private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private static final String voyelles = "aeiouy";
	private static final String consonnes = "bcdfghjklmnpqrstvwxz";
	
	@Override
	public void exceptionCaught(IoSession session, Throwable arg1) throws Exception {
		if(((GClient)session.getAttribute("client")) != null){
			((GClient)session.getAttribute("client")).kick();
		}
		System.out.print("G exceptionCaught kicked GClient: ");
		arg1.printStackTrace();
	}

	
	@Override
	public void messageReceived(IoSession session, Object msg) throws Exception {
		if (!(msg instanceof String)) {
			//Exceptions.throwException("GHandler.[RECV] : le message recu n'est pas une string.");
			return;
		}
		
		//Syn.w("G [RECV] << "+msg, Ansi.Color.GREEN);
		String packet = msg.toString();
		GClient c = ((GClient)session.getAttribute("client"));
		
		if(gServ == null){
			//log.warn("GHANDLER.   SERV == NULL");
		}
		if(packet.charAt(0) != '@' && packet.charAt(packet.length()-1) != ']'){
			c.kick();
			return;
		}
		
		ParsingResult pr = (ParsingResult) c.getHandler().parse(c, packet);
		Sender.send(c.getSession(), "@10#"+pr.result);
		//Sont en ordre d'apparition. Faut vérifier, quand on recoit un packet, si celui d'avant a bien Ã©tÃ© acceptÃ©.
		
	}

	
	public Object parse(GClient c, String packet) throws Exception{
        //this.send("@00#M|Packet bien recu :)");

        //Personnage PersoConnect = null;// .getOnlinePersos();// _perso.;
        if (packet.substring(0, 1).equals("@")){
            int w_Action = Integer.parseInt(packet.substring(1, 3));
        	int idPerso = Integer.parseInt(packet.substring(packet.indexOf("#"), packet.indexOf("|")));
        	if(World.getPersonnage(idPerso) == null){
        		return ParsingResult.SUCCESS;
        	}
        	Personnage p = World.getPersonnage(idPerso);
            switch(w_Action) {
            
                case 4://@04#idPerso|trucs;DeLaction;ÀFaire]
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
             @10#idPerso|idItem|qty]
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
            	
               default: {
                   return ParsingResult.INVALID_ACTION;
               }
            }
        }
        return ParsingResult.FAIL;
	}
	
	@Override
	public void messageSent(IoSession arg0, Object packet) throws Exception {
		//Syn.w("G [SENT] >>> "+packet, Ansi.Color.GREEN);
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {
		//Syn.w("G sessionClosed id:"+session.getId(), Ansi.Color.GREEN);
		GClient c = ((GClient)session.getAttribute("client"));
		if(c != null){
			//Syn.d("sessionClosed c != null");
			c.kick();
		}
	}

	@Override
	public void sessionIdle(IoSession session, IdleStatus arg1) throws Exception {
		//Syn.w("G sessionIdle id:"+session.getId(), Ansi.Color.RED);
		GClient c = ((GClient)session.getAttribute("client"));
		if(c != null){
			//Syn.d("sessionIdle c != null");
			c.kick();
		}
	}

	@Override
	public void sessionOpened(IoSession session) throws Exception {
		//Syn.w("G sessionOpened id:"+session.getId(), Ansi.Color.RED);
		GClient c = new GClient(session);
		session.setAttribute("client", c);
		c.setHandler(this);
		gServ.clients.add(c);
	}
	
	
	
}