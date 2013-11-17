package Interfaces;

public interface Injectable {

	public void set(Object o);
	public void set(int ordinal, Object o);
	public void set(String name, Object o);
	//public Injectable getInstance();
}
