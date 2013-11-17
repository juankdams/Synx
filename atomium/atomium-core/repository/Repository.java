package repository;

import exception.LoadingException;

public interface Repository {

	/**
	 * load the repository
	 * @return number of entities loaded
	 */
	int load() throws LoadingException;
	
	/**
	 * return true if the load() function has been called
	 * @return boolean
	 */
	boolean loaded();
	
}
