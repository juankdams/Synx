package Observing;


public class Observer {

	/**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
	public void update(Observable observable, Object arg) {
		
	}
	
	
   // void update(Observable o, Object arg);   // (as an interface)

}