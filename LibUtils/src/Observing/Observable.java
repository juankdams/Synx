package Observing;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


/**
 * This class represents an observable object, or "data"
 * in the model-view paradigm. It can be subclassed to represent an 
 * object that the application wants to have observed. 
 * <p>
 * An observable object can have one or more observers. An observer 
 * may be any object that implements interface <tt>Observer</tt>. After an 
 * observable instance changes, an application calling the 
 * <code>Observable</code>'s <code>notifyObservers</code> method  
 * causes all of its observers to be notified of the change by a call 
 * to their <code>update</code> method. 
 * <p>
 * The order in which notifications will be delivered is unspecified.  
 * The default implementation provided in the Observable class will
 * notify Observers in the order in which they registered interest, but 
 * subclasses may change this order, use no guaranteed order, deliver 
 * notifications on separate threads, or may guarantee that their
 * subclass follows this order, as they choose.
 * <p>
 * Note that this notification mechanism is has nothing to do with threads 
 * and is completely separate from the <tt>wait</tt> and <tt>notify</tt> 
 * mechanism of class <tt>Object</tt>.
 * <p>
 * When an observable object is newly created, its set of observers is 
 * empty. Two observers are considered the same if and only if the 
 * <tt>equals</tt> method returns true for them.
 *
 * @author  Chris Warth
 * @version %I%, %G%
 * @see     java.util.Observable#notifyObservers()
 * @see     java.util.Observable#notifyObservers(java.lang.Object)
 * @see     java.util.Observer
 * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
 * @since   JDK1.0
 */
public class Observable {
	
	
    private Vector<Observer> obs;
   
    /** Construct an Observable with zero Observers. */

    public Observable() {
    	obs = new Vector<Observer>();
    }

    /**
     * Adds an observer to the set of observers for this object, provided 
     * that it is not the same as some observer already in the set. 
     * The order in which notifications will be delivered to multiple 
     * observers is not specified. See the class comment.
     *
     * @param   o   an observer to be added.
     * @throws NullPointerException   if the parameter o is null.
     */
    public synchronized void addObserver(Observer o) {
        if (o == null){
        	throw new NullPointerException();
        }
		if (!obs.contains(o)) {
		    obs.addElement(o);
		}
    }

    /**
     * Deletes an observer from the set of observers of this object. 
     * Passing <CODE>null</CODE> to this method will have no effect.
     * @param   o   the observer to be deleted.
     */
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    /**
     * If this object has changed, as indicated by the 
     * <code>hasChanged</code> method, then notify all of its observers 
     * and then call the <code>clearChanged</code> method to 
     * indicate that this object has no longer changed. 
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and <code>null</code>. In other 
     * words, this method is equivalent to:
     * <blockquote><tt>
     * notifyObservers(null)</tt></blockquote>
     *
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers() {
    	notifyObservers(null);
    }

    /**
     * If this object has changed, as indicated by the 
     * <code>hasChanged</code> method, then notify all of its observers 
     * and then call the <code>clearChanged</code> method to indicate 
     * that this object has no longer changed. 
     * <p>
     * Each observer has its <code>update</code> method called with two
     * arguments: this observable object and the <code>arg</code> argument.
     *
     * @param   arg   any object.
     * @see     java.util.Observable#clearChanged()
     * @see     java.util.Observable#hasChanged()
     * @see     java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void notifyObservers(Object arg) {
    	/*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
	    /* We don't want the Observer doing callbacks into
	     * arbitrary code while holding its own Monitor.
	     * The code where we extract each Observable from 
	     * the Vector and store the state of the Observer
	     * needs synchronization, but notifying observers
	     * does not (should not).  The worst result of any 
	     * potential race-condition here is that:
	     * 1) a newly-added Observer will miss a
	     *   notification in progress
	     * 2) a recently unregistered Observer will be
	     *   wrongly notified when it doesn't care
	     */
            arrLocal = obs.toArray();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    /**
     * Clears the observer list so that this object no longer has any observers.
     */
    public synchronized void deleteObservers() {
    	obs.removeAllElements();
    }

    /**
     * Returns the number of observers of this <tt>Observable</tt> object.
     *
     * @return  the number of observers of this object.
     */
    public synchronized int countObservers() {
    	return obs.size();
    }
    
    


	/**
	 * @author Crystal 
	 * Notifies only the first observer found that is an instance of Class c
	 * */
	public void notifyObserver(Class<?> c){
		getObserver(c).update(this, null);
	}
	/**
	 * @author Crystal 
	 * Notifies only the first observer found that is an instance of Class c
	 * */
	public void notifyObserver(Class<?> c, Object arg){
		getObserver(c).update(this, arg);
	}
	/**
	 * @author Crystal 
	 * Notifies all observers found that are an instance of Class c
	 * */
	public void notifyAllObservers(Class<?> c){
		for(Observer o : getObservers(c)){
			o.update(this, null);
		}
	}
	/**
	 * @author Crystal 
	 * Notifies all observers found that are an instance of Class c
	 * */
	public void notifyAllObservers(Class<?> c, Object arg){
		for(Observer o : getObservers(c)){
			o.update(this, arg);
		}
	}

	/**
	 * @author Crystal 
	 * Returns only the first observer found that is an instance of Class c
	 * */
	public Observer getObserver(Class<?> c){
		/*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;
        synchronized (this) {
	         arrLocal = obs.toArray();
        }
        for(Object o : arrLocal){
        	if(o.getClass() == c){
        		return (Observer) o;
        	}
        }
        return null;
	}
	/**
	 * @author Crystal 
	 * Returns all observers found that are an instance of Class c
	 * */
	public List<Observer> getObservers(Class<?> c){
		/*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;
        List<Observer> lisLocal = new ArrayList<Observer>();

        synchronized (this) {
	         arrLocal = obs.toArray();
        }
        for(Object o : arrLocal){
        	if(o.getClass() == c){
        		lisLocal.add((Observer) o);
        	}
        }
        return lisLocal;
	}
	

}
