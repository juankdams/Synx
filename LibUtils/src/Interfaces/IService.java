package Interfaces;

public interface IService {

	
	/**
	 * Boots a service by Initialization.
	 * @throws Exception
	 */
	public void boot() throws Exception;
	/**
	 * Reboots a service by shutting it down and reinitializating it. <br>
	 * Some services may not reinitialize and just restart with the already initialized features.
	 * @throws Exception
	 */
	public void reboot() throws Exception;
	
	
}
