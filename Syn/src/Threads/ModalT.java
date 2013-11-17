package Threads;




public class ModalT implements Runnable{
	//private static final char bizarre = 'B';
	//private static final char cleaner = 'C';
	//private static final char fightThread = 'F';
	//private static final char iaThread = 'I';
	//private static final char craftingThread = 'J';//j pour job
	//private static final char gttThread = 'G';
	private static final char utilThread = 'U';
	//private static final char troupThread = 'T';
	
	
	private String canRun = new String("true");
	private String canRunHolder = new String("true");
	private Thread t = null;

	public ModalT(String name){
		
	}
	
	public void setThread(ModalT m, String name){
		this.setT(new Thread(m));
		this.getT().setName(name);
	}
	
	public void executeAbstractTask(){}
	/*
	private void executeTask(){
		//Syn.d("t.getName = "+t.getName());
		switch(t.getName().charAt(0)){
			case utilThread:
			//case fightThread:
			//case iaThread:
			//case craftingThread:
			//case gttThread:
			//case troupThread:
				this.executeAbstractTask();
				break;
		}
	}*/
	
    @Override
	public void run()
	{
		while(t.isInterrupted() == false){
			try {
				synchronized(this.canRun){
					this.canRun.wait();
				}
			} catch (InterruptedException e) {e.printStackTrace();}
			this.canRun = this.canRunHolder;
			if("true".equals(this.canRun)){            			
				//this.executeTask();
				this.executeAbstractTask();
			}
		} 														
	}
    
	private Thread getT() {
		return this.t;
	}
	private void setT(Thread t) {
		this.t = t;
	}
	public ModalT Start(){
		//if(this.t.isInterrupted()){
		//	this.t = new Thread(this);
		//}else
    	if(!t.isAlive()){
    		this.t.start();
    	}else{
    		this.restart();
    	}
    	return this;
    }
	public void tick(){
		//Syn.d("ModalT.tick");
		if("true".equals(this.canRunHolder)){							
			synchronized(this.canRun){
				this.canRun.notify();
			}
		}
	}
	public boolean isRunning(){
		//common.Zen.debug("t.isAlive() ="+t.isAlive());
		//common.Zen.debug("\"true\".equals(canRunHolder ="+"true".equals(canRunHolder));
		return (this.t.isAlive() && "true".equals(this.canRunHolder));
	}
	public boolean isAlive(){
		return this.t.isAlive();
	}
	public void pause(){
		this.canRunHolder = "false";
	}
	public void restart(){
		this.canRunHolder = "true";
	}
	public void terminate(){
		this.pause();
		this.tick();
		this.t.interrupt();
		this.t = null;
		this.canRun = null;
		this.canRunHolder = null;
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	
	
	
	
}




