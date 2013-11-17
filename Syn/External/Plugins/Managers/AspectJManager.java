package Plugins.Managers;

import Plugins.Abstractions.AbstractAspectJ;


public class AspectJManager {

	
	private AbstractAspectJ aapl = null;
	
	
	public AbstractAspectJ getAapl() {
		return aapl;
	}
	public void setAapl(AbstractAspectJ aaapll) {
		aapl = aaapll;
	}
	public void unload() {
		aapl = null;
	}
	
}
