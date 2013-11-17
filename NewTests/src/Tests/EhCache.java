package Tests;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.Trigger;

import Objects.*;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.Configuration;

public class EhCache {

	private static CacheManager cm = CacheManager.newInstance("ehcache.xml");
	private static QuartzScheduler qs = QuartzScheduler.createNew();
	
	public static void go(){
		//for(String s : cm.getCacheNames()){
		//	System.out.println(s);
		//}

		write();

		JobDetail j = qs.newJob("hellojob", "caching", true, QuartzListener.class);
		Trigger t = qs.newTrigger("trigger1", j);
		t.getJobDataMap().put("cache", cm.getCache("sampleCache1"));
		t.getJobDataMap().put("inventory", "myinvent");
		t.getJobDataMap().put("newitem", "afraid");
		qs.execute(t);
		
		
		read();
		
	}
	
	public static void write(){
		Cache c = cm.getCache("sampleCache1");
		Inventory i = new Inventory();
		i.items.add("lp");
		i.items.add("eminem");
		c.put(new Element("myinvent", i));
		i.items.add("metallica"); 
	}
	
	public static void read(){
		Cache c = cm.getCache("sampleCache1");
		Element e = c.get("myinvent");
		Inventory i = (Inventory)e.getObjectValue();

		for(String s : i.items){
			System.out.println("item : "+s);
		}
		
		System.out.println("waiting");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ee) {
			ee.printStackTrace();
		}
		
		for(String s : i.items){
			System.out.println("item : "+s);
		}
		/*
		 results:
			item : lp
			item : eminem
			item : metallica  //on peut donc modifier un objet 
							  //après l'avoir mit dans le cache 
							  //et ça sera prit en compte partout
		 */
	}



}
