package Tests;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

public class Quartz implements Job {
	
	
	 public static void go() {
		 try {
	            // Grab the Scheduler instance from the Factory
	            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

	            // and start it off
	            scheduler.start();
	            
	            
	         // define the job and tie it to our HelloJob class
	            JobDetail job = newJob(Quartz.class)
	                .withIdentity("job1", "group1")
	                .build();

	            // Trigger the job to run now, and then repeat every 1000 milliseconds
	            Trigger trigger = newTrigger()
	                .withIdentity("trigger1", "group1")
	                .startNow()
	                .withSchedule(
	                		simpleSchedule()
	                		.withIntervalInMilliseconds(1000)
	                		.repeatForever()
	                ).build();

	            // Tell quartz to schedule the job using our trigger
	            scheduler.scheduleJob(job, trigger);
	            
	            Thread.sleep(60000);

	            scheduler.shutdown();

	        } catch (SchedulerException se) {
	            se.printStackTrace();
	        } catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("executed!");
	}


}