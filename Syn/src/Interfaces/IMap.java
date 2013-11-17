package Interfaces;

public interface IMap{
	/*
	int ID = 0;
	String key = null;
	String date = null;
	int height = 15;
	int width = 15;
	*/

	public int getID();
	
	public void setID(int id);

	public boolean isPremium();

	public void setHeight(int height);

	public int getHeight();

	public void setWidth(int width);

	public int getWidth();

	public void setDate(String date);

	public String getDate();

	public void setKey(String key);

	public String getKey();
	
	
	public static class Trigger{
		public int ID = 0;
		public int map = 0, targetMap = 0;
		public short cell = 0, targetCell = 0;
	}
	
	public static class Cell{
		public int ID = 0;
		public int map = 0;
	}
	
	
	
}
