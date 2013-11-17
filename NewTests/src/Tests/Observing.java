package Tests;

//import java.util.Observable;
//import java.util.Observer;
import Observing.Observable;
import Observing.Observer;

public class Observing {

	
	public static class Watchable extends Observable {
		public void change(){
			//this.setChanged();
		}
	}
	public static class Watcher extends Observer {
		private int id = 0;
		public Watcher(int id){
			this.id = id;
		}
		@Override
		public void update(Observable o, Object arg) {
			System.out.println("update Watcher . "+id);
		}
	}
	public static class Caster extends Observer {
		private int id = 0;
		public Caster(int id){
			this.id = id;
		}
		@Override
		public void update(Observable o, Object arg) {
			System.out.println("update Caster. "+id);
		}
	}
	
	public static void go(){
		Watchable w = new Watchable();
		w.addObserver(new Watcher(6));
		w.addObserver(new Watcher(4));
		w.addObserver(new Caster(9));
		w.addObserver(new Watcher(2));
		w.addObserver(new Watcher(1));
		w.addObserver(new Watcher(3));
		w.addObserver(new Watcher(5));
		w.notifyAllObservers(Watcher.class);
		W.w("\nDone notifying Watchers\n");
		w.notifyAllObservers(Caster.class);
		W.w("\nDone notifying Casters\n");

        W.w("done. ");
		/*
		 Output : Les Observers sont <TOUJOURS> et <TOUS> callés en <ORDRE INVERSE> d'ajout
		 	avant que le programme continue sa routine :
		 	
		 update. 5
		 update. 3
		 update. 1
		 update. 2
		 update. 4
		 update. 6
		 done. 0
		 
		 */
	}
	
	
}
