package Objects;

import java.io.Serializable;

public class Human implements Serializable {
	public static int nextID = 0;
	
	public int ID = 0;
	public String name = "";
	public int age = -1;
	public int heigth = -1;
	public int weigth = -1;
	public Inventory inventory = null;
	
	public Human(String name, int age, int heigth, int weigth, Inventory inventory){
		this.ID = nextID++;
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
		this.inventory = inventory;
	}
	
	
	
}
