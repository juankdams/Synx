package Threads;


import org.apache.mina.core.session.IoSession;

import Core.Exceptions;
import Core.Syn;
import Enums.ChannelEnum;
import Enums.SynActions.ChatBufferA;
import Enums.SynActions.CommonAction;
import Enums.SynActions.SchedulingA;
import Game.Queue;
import GameObjects.GWorld;
import LoginObjects.LAccount;
import Parsers.ChatParser;
import Login.*;
import static Enums.SynActions.SchedulingA.REMOVE_WAITING_ACCOUNT;
import static Enums.SynActions.SchedulingA.REMOVE_FLOODER;

public class Scheduling {
		
	
	public static interface Schedule {
		/**Exécute la tâche de la Schedule.*/
		public void execute();
		public long getDateOfExecution();
		public SchedulingA getActionID();
		public void setDateOfExecution(long l);
	}
	
	public static class ScheduledTask implements Schedule{
		//La date en millisecondes à laquelle il faut exécuter la task
		public long dateOfExecution = 0;
		public Object obj[] = null;
		public SchedulingA actionID = null;
		
		public ScheduledTask(SchedulingA action, Object... obj){
			this.obj = obj;
			this.actionID = action;
			if(actionID == REMOVE_FLOODER && obj.length < 2){
				Exceptions.throwIllegalArgumentException("[CODE_ERROR] ScheduledTask.construct: Besoin de deux objets pour un schedule de REMOVE_FLOODER: {String, GWorld}");
			}
		}
		@Override
		public void execute() {
			//Syn.d("ScheduledTask.execute");
			if(actionID == REMOVE_WAITING_ACCOUNT){
				Syn.d("ScheduledTask.execute REMOVE_WAITING_ACCOUNT");
				Object removed = ((Queue)obj[1]).updateQueuedAccounts(CommonAction.REMOVE, ((LClient)obj[0]).getAccount(), 0);
				if(removed == null){
					//Kick d'inactivité 1min apres avoir choisi son serveur,
					//le gars est pas encore à l'écran de sélection du perso. genre
					((LClient)obj[0]).kick();
				}
				this.obj = null;
				this.actionID = null;
			}else
			if(actionID == REMOVE_FLOODER){
				Syn.d("ScheduledTask.execute REMOVE_FLOODER. ChannelPrefix : -"+((String)obj[0]).charAt(0)+"-");
				ChatParser.modifyFloodLists(ChannelEnum.getChannel(((String)obj[0]).charAt(0)), ChatBufferA.REMOVE_FLOODER, ((String)obj[0]).substring(1), ((GWorld)obj[1]));
				this.obj = null;
				this.actionID = null;
			}
		}
		@Override
		public long getDateOfExecution() {
			return dateOfExecution;
		}
		@Override
		public void setDateOfExecution(long date) {
			this.dateOfExecution = date;
		}
		@Override
		public SchedulingA getActionID() {
			return actionID;
		}
	}
	
	public static class ScheduledPacket implements Schedule{
		//La date en millisecondes à laquelle il faut exécuter la task
		public long dateOfExecution = 0;
		public String packets[] = null;
		public IoSession sessions[] = null;
		public SchedulingA action = null;//Soit envoyer un packet à des clients, soit à une fight, etc
		
		/**
		 * 
		 * @param dateForExecution - /La date en millisecondes à laquelle il faut envoyer les packets
		 * @param packets - Les packets à envoyer
		 * @param iosessions - Les sessions des clients à qui il faut envoyer les packets.
		 */
		public ScheduledPacket(String[] packets, IoSession[] iosessions, SchedulingA action){
			this.sessions = iosessions;
			this.packets = packets;
			this.action = action;
		}
		@Override
		public void execute(){
			dateOfExecution = -1;
			for(String p : packets){//Envoie chaque packet
				for(IoSession s : sessions){//À chaque Session
					SM.Sender.send(s, p);
				}
				p = null;
			}
			//for(IoSession s : sessions){
			//	s = null;
			///}
			packets = null;
			sessions = null;
			action = null;
			//Scheduling.remove(this);
			//try {
			//	this.finalize();
			//} catch (Throwable e) {e.printStackTrace();}
		}
		@Override
		public long getDateOfExecution() {
			return dateOfExecution;
		}
		@Override
		public void setDateOfExecution(long date) {
			this.dateOfExecution = date;
		}
		@Override
		public SchedulingA getActionID() {
			return action;
		}
	}
	
	
	
	
}
