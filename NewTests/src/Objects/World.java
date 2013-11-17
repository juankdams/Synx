package Objects;

import java.io.Serializable;
import java.util.HashMap;


//@Model
public class World implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Id
	public int id = 0;
	//@Attribute
	//@CollectionMap(key = String.class, value = Human.class)
	public HashMap<String, Human> humans = new HashMap<String, Human>();
	
	
	
	
}
