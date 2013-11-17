package Tests;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;

import Objects.Inventory;

public class QuartzListener implements Job {
	
	public QuartzListener(){
		
	}
	

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDetail j = context.getJobDetail();
		Trigger t = context.getTrigger();
		System.out.println("job ["+j.getKey().getName()+"] should ["+j.getJobDataMap().get("should")+"]");
		System.out.println("trigger ["+t.getKey().getName()+"] should ["+t.getJobDataMap().get("should")+"]");
		
		if(t.getJobKey().getGroup().equals("caching")){
			Cache c = (Cache)t.getJobDataMap().get("cache");
			Element e = c.get(t.getJobDataMap().get("inventory"));
			Inventory i = (Inventory)e.getObjectValue();
			for(String s : i.items){
				System.out.println("quartz item : "+s);
			}
			i.items.add((String) t.getJobDataMap().get("newitem"));
		}
		
	}

}
