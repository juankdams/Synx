package Tests;


import java.io.IOException;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.ConnectionFactoryBuilder;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.johm.JOhm;
import Objects.Human;
import Objects.Inventory;
import Objects.World;

public class Redis {


	public static Jedis jedis;
	public static JedisPool jp;
	public static MemcachedClient memcachedClient;
	public static int keepTime = 1200;//20 minutes, c'est en secondes
	public static int iterations = 20000;
	
	public static void setup(){
		jedis = new Jedis("localhost");
		jp = new JedisPool("localhost");
		JOhm.setPool(jp);
		connectToLocalMemcachedServer();
	}
	public static void go(){
		setup();
		String value = jedis.get("allo");
		jedis.set("foo", "bar");
		jedis.set("allo", "waza");
		String value1 = jedis.get("foo");
		W.w("Before = "+value+".   After = "+value1);
		goWorld();
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		W.w("Done waiting");
		
	}
	
	public static World getWorld(){
		return (World) memcachedClient.get("World");//JOhm.get(World.class, 0);
	}
	public static void testWorld(){
		World w = getWorld();
		for(Human h : w.humans.values()){
			W.w(h.name);
		}
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		W.w("30 secondes");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		W.w("Temps écoulé : ");
		for(Human h : w.humans.values()){
			W.w("w."+h.name);
		}
		
	}
	
	public static int getNextHumanID(){
		Object ido = memcachedClient.get("Human.nextID");
		W.w("id = "+ido);
		if(ido == null){
			setNextHumanID();
			return 0;
		}
		int id = (Integer) ido;
		return id;
	}
	public static void setNextHumanID(){
		W.w("Setting nextID > "+Human.nextID);
		memcachedClient.set("Human.nextID", keepTime, Human.nextID);
	}
	public static void goWorld(){
		Human.nextID = getNextHumanID();
		//createWorld();
		//storeWorldHumans();
		long time = System.nanoTime();
		testHumans();
		W.w("total test "+(System.nanoTime()-time)+"ns  ou "+((System.nanoTime()-time)/iterations));
		//modifyWorld();
		//testWorld();
		setNextHumanID();
	}
	public static void createWorld(){
		World w = new World();
		for(int i = iterations; i >= 0; i--){
			w.humans.put("H"+i, new Human("H"+i, 19, 190, 130, new Inventory()));
			w.humans.get("H"+i).inventory.items.add("Coeur");
		}
		//w.humans.put("Robyn", new Human("Robyn", 19, 190, 130, new Inventory()));
		//w.humans.put("Sam", new Human("Sam", 17, 170, 120, new Inventory()));
		//w.humans.get("Robyn").inventory.items.add("Ordi");
		//w.humans.get("Robyn").inventory.items.add("Coeur");
		//w.humans.get("Sam").inventory.items.add("Coeur");
		//JOhm.save(w);
		OperationFuture<Boolean> of = memcachedClient.set("World", keepTime, w);
	}
	public static void storeWorldHumans(){
		World w = getWorld();
		if(w == null){
			createWorld();
			w = getWorld();
		}
		for(Human h : w.humans.values()){
			memcachedClient.set("World.humans."+h.ID, keepTime, h);
		}
	}
	public static void testHumans(){
		//for(int i = Human.nextID-1; i >= 0; i--){
		for(int i = iterations; i >= 0; i--){
			//long time = System.nanoTime();
			Human h = (Human) memcachedClient.get("World.humans."+i);
			//W.w(System.nanoTime()-time+"ns  World.humans."+i+" = "+h.name);
		}
	}
	public static void modifyWorld(){
		World w = (World) memcachedClient.get("World");//JOhm.get(World.class, 0);
		w.humans.put("Nex", new Human("Nex", 19, 190, 130, new Inventory()));
		OperationFuture<Boolean> of = memcachedClient.set("World", keepTime, w);
	}
	public static void deleteWorld(){
		memcachedClient.delete("World");
	}
	
	
	
	
	

	private static final String LOCK_STRING = "LOCK_STRING";

	public static MemcachedClient connectToLocalMemcachedServer(){
		if (memcachedClient == null) {
			synchronized(LOCK_STRING) {
				if (memcachedClient == null) {
					String address = "127.0.0.1" + ":" + "11211";
					try {
						memcachedClient = new MemcachedClient(
						new ConnectionFactoryBuilder()
						.setDaemon(true)
						.build(),
						AddrUtil.getAddresses(address));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return memcachedClient;
	}

	
	
	
	
	
}
