package Clients;


public interface Client {


	public void start();
	public void stop();
	public void restart();
	public void terminate();
	
	public void on();
	public void off(boolean terminate);
	
}
