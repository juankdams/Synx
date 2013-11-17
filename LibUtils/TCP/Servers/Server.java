package Servers;


public interface Server {
	
	
	public void start();
	public void stop();
	public void restart();
	public void terminate();
	
	public short getPort();
	public void setPort(short port);
	
	public void on();
	public void off(boolean terminate);
	
	
}
