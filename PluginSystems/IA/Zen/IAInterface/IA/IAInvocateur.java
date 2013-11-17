
package Zen.IAInterface.IA;

import objects.Fight;
import objects.Fight.Fighter;

public class IAInvocateur extends IAModel.StaticMethods implements IAModel{

	@Override
	public void load(Fight fight) {
		this.start(fight);
	}

	@Override
	public void start(Fight fight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminate() {
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	
	
}
