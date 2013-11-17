package piou.scripts;

import piou.script.Scripts;
import Interfaces.IService;

public abstract class ScriptsService<E extends ExecutableScript> extends Scripts<E> implements IService {
	private static final long serialVersionUID = 1L;

	@Override
	public abstract void boot() throws Exception;

	@Override
	public void reboot() throws Exception {
		clear();
		boot();
	}
	
	/**
	 * @param name - The ExecutableScript's name
	 * @return - An ExecutableScript
	 */
	public E get(String name){
		E element = null;
		for(E e : this){
			if(e.getName().equals(name)){
				element = e;
				break;
			}
		}
		return element;
	}
	
	
}
