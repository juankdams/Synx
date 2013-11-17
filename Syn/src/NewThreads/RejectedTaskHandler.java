package NewThreads;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RejectedTaskHandler implements RejectedExecutionHandler{

	Logger log = LoggerFactory.getLogger(RejectedTaskHandler.class);
	
	
	@Override
	public void rejectedExecution(Runnable arg0, ThreadPoolExecutor arg1) {
		// TODO Auto-generated method stub
		log.error("RejectedTaskHandler : A TaskExecution has been rejected because of the pool being at full max size.");
	}

	
	
	
}


