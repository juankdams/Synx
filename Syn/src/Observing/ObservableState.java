package Observing;

//import java.util.Observable;

public class ObservableState extends Observable {

	private int state = 0;

	public ObservableState(int state){
		this.state = state;
	}
	public Observable set(int state) {
		this.state = state;
		//this.setChanged();
		return this;
	}
	public int get() {
		return state;
	}
	
}
