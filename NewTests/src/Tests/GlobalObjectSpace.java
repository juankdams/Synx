package Tests;

public class GlobalObjectSpace {
	
	public static GlobalObjectSpace create(){
		return new GlobalObjectSpace();
	}
	public static GlobalObjectSpace open(String name){
		return new GlobalObjectSpace(name);
	}
	
	
	
	private GlobalObjectSpace(){
		//shm_open  (create)
		//shm_alloc
	}
	private GlobalObjectSpace(String name){
		//shm_open  (open already created)
		//
	}
	
	
	public void put(String name, Object o){
		//shm_allocate ? (name, o);
	}
	public Object get(String name){
		Object o = null; //shm_get ? (name)
		
		return o;
	}
	
	public void close(){
		//shm_close ?
	}
	
	

}
