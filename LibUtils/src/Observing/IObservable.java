package Observing;

public interface IObservable<O, A> {
	void addObserver(O observer);
	void removeObserver(O observer);
	
	void notifyObservers(A arg);
}
