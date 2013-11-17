package SM;

import java.util.ArrayList;

import Core.Exceptions;
import Core.Syn;
import Enums.SynActions.CommonAction;
import Threads.Factory.UtilityThread;
import Threads.Scheduling.Schedule;
import static Enums.SynActions.CommonAction.ADD;
import static Enums.SynActions.CommonAction.REMOVE;
import static Enums.SynActions.CommonAction.CLEAN;

public class SchedulingBuffer {
	//PARTIE Buffer Statique.  Management des buffers objets.  -------------------------------------------------------------
	public static final int tick1second = 1000;
	public static final int tick1minute = 60000;
	
	/**
	 * Les intervalles de temps possibles.
	 * <p>En gros, tu fais par exemple une new ScheduledTask avec une date d'exécution
	 * <p> et tu l'ajoute au buffer qui correspond au temps d'attente voulu.
	 */
	public static final int[] tickIntervals = {/*50,100,200,300,400,500,*/1000, 60000};
	/**
	 * Un buffer pour chaque tickInterval nécéssaire.
	 * <p>Attention que les actions utilisent pas plus de temps que l'intervale demandé
	 * <p>Sinon ca va crasher
	 */
	public static ArrayList<SchedulingBuffer> buffers = new ArrayList<SchedulingBuffer>(tickIntervals.length);
	
	static{
		for(int i = 0; i < tickIntervals.length; i++){
			buffers.add(i, new SchedulingBuffer(tickIntervals[i]));
		}
	}
	/**
	 * 
	 * @param tickInterval - Chq buffer a un temps d'interval 
	 *    à laquellle il doit envoyer/faire les task qui lui sont données. 
	 *    Ici on prend le buffer en fonction de ce temps d'interval.
	 * @return
	 */
	public static SchedulingBuffer getBuffer(int tickInterval){
		for(SchedulingBuffer sb : buffers){
			if(sb.tickInterval == tickInterval){
				return sb;
			}
		}
		Exceptions.throwNullPointerException("SchedulingBuffer. getBuffer return NULL pour argument :"+tickInterval+".");
		return null;
	}
	
	
	


	
	//PARTIE Buffer Objet  -------------------------------------------------------------
	
//Exemples des IACalculator et IASchedulePacker, 
	//à appliquer à tous les packets qui doivent 
	//etre retardés dans le temps au lieu des .sleep

	//ATTENTOIN: YA BEEEEAAAAUUUCCCOUP DE CONCCURENCE À GÉRER ICI
	
	
	/**
	 * //Dans combien de temps le packet sera envoyé: 100, 200, 500ms, 1s, etc
	 */
	private int tickInterval = 0;
	private UtilityThread UT = null;
	//private int maxBufferSize = 1000;//Metons un max de 1000 trucs par buffer
	public ArrayList<Schedule> list = new ArrayList<Schedule>();
	
	public SchedulingBuffer(int tickInterval){
		this.tickInterval = tickInterval;
		//this.maxBufferSize = maxSize;
	}
	
	/**
	 * Va exécuter toutes les schedules listées dans le buffer et clear la liste après.
	 */
	public void executeSchedules(){
		UT.pause();
		//Syn.d("[ENTRE] dans SchedulingBuffer.tick()");
		synchronized(list){
			//Syn.d("[SchedulingBuffer].tick() entre le synchronized: list.size = "+list.size());
			if(list.size() == 0){
				//Syn.d("[SORT]  [SchedulingBuffer].tick() en synchronized : list.size = 0 donc RETURN avant le FOR d'execution");
				return;
			}
			for(Schedule s : list){
				if(s != null){
					while(s.getDateOfExecution() > System.currentTimeMillis()){
						try {
							Thread.sleep(s.getDateOfExecution()-System.currentTimeMillis());
						} catch (InterruptedException e) {e.printStackTrace();}
					}
					s.execute();
					s = null;
				}
			}
			list.clear();
			//Syn.d("[SchedulingBuffer].tick() en synchronized : list.size = "+list.size());
		}
		//Syn.d("[SORT] de SchedulingBuffer.tick()");
	}
	
	/**
	 * 
	 * @param actionID - ADD,REMOVE ou CLEAN pour ajouter/delete une schedule dans la liste du buffer
	 * @param o - La schedule
	 */
	public void modifyBuffer(CommonAction actionID, Schedule o){
		synchronized(list){
			if(actionID == ADD){
				Syn.d("Dans SB: ajouté une schedule");
				o.setDateOfExecution(System.currentTimeMillis()+this.tickInterval);
				list.add(o);
				UT.restart();
			}else 
			if(actionID == REMOVE){
				list.remove(o);
			}else 
			if(actionID == CLEAN){
				list.clear();
			}
		}
	}

	public void setUtilityThread(UtilityThread ut) {
		this.UT = ut;
	}
	public UtilityThread getUtilityThread(){
		return this.UT;
	}
	public int getTickInterval(){
		return this.tickInterval;
	}
}
