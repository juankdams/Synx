package Tests;


import java.util.concurrent.TimeUnit;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzScheduler {
	
	public static QuartzScheduler createNew(){
		try {
			return new QuartzScheduler();
		} catch (SchedulerException e) {
			e.printStackTrace();
			return null;
		}
	}
	

    // Grab the Scheduler instance from the Factory
    private Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
    
	private QuartzScheduler() throws SchedulerException {
        // and start it off
        scheduler.start();
	}
	
	
	public void execute(JobDetail j, Trigger t){
		try {
			scheduler.scheduleJob(j, t);
		} catch (SchedulerException e) { e.printStackTrace(); }
	}
	/**
	 * You need to add a durable Job to the Scheduler before if you want to 
	 * schedule this Trigger with the Job identified by the Trigger's settings.<p>
	 * The only way to get a job to be durable is via the QuartzScheduler.newJob() method 
	 * that will also automatically add it to the scheduler.
	 * @param t - Trigger 
	 */
	public void execute(Trigger t){
		try {
			scheduler.scheduleJob(t);
		} catch (SchedulerException e) { e.printStackTrace(); }
	}

	
	public JobDetail newJob(String name, String group, boolean durable, Class<? extends Job> listenerClass){
        JobDetail job = JobBuilder.newJob(listenerClass)
            .withIdentity(name, group)
            .storeDurably(durable)
            .build();
        if(durable){
			try {
				scheduler.addJob(job, true);
			} catch (SchedulerException e) {
				e.printStackTrace();
			}
        }
        return job;
	}
	
	public Trigger newTrigger(String name, JobDetail j){
        Trigger trigger = TriggerBuilder.newTrigger()
            .withIdentity(name, j.getKey().getGroup())
            .forJob(j)
            .startNow()
            .build();
        return trigger;
	}
	
	public Trigger newScheduledTrigger(String name, JobDetail j, int interval, TimeUnit tu, int cycles){
		SimpleScheduleBuilder ssb = SimpleScheduleBuilder.simpleSchedule()
		.withIntervalInMilliseconds(tu.toMillis(interval));
		if(cycles == -1){
    		ssb.repeatForever();
		}else{
			ssb.withRepeatCount(cycles);
		}
		
        Trigger trigger = TriggerBuilder.newTrigger()
            .withIdentity(name, j.getKey().getGroup())
            .forJob(j)
            .withSchedule(ssb)
            .startNow()
            .build();
        return trigger;
	}

	
	
	

	/// tests- ----------------------------------------
	public static void goTest(){
		QuartzScheduler qs = QuartzScheduler.createNew();
		
		JobDetail j = qs.newJob("hellojob", "group1", true, QuartzListener.class);
		j.getJobDataMap().put("should", "never!");

		Trigger t = qs.newTrigger("trigger1", j);
		t.getJobDataMap().put("should", "not!");
		
		Trigger t2 = qs.newTrigger("trigger2", j);
		t2.getJobDataMap().put("should", "totally!");
		
		qs.execute(t);
		qs.execute(t2);
	}
	

}



