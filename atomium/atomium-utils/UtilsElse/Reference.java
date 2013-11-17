package UtilsElse;

public interface Reference<T> {

	T get();
	void set(T o);
	
	boolean isNull();
	
}
