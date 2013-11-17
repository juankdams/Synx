package IA;

import Interfaces.Executable;

public class Network implements Executable{

	public NeuronContainer main = new NeuronContainer();
	
	/*
	private void ligtup(ElectricalFlow ef){
		if(main.check(ef) == false){
			return;
		}
		main.fire(ef);
	}
	*/
	

	@Override
	public void apply(Object[] arg0) {
	//	ElectricalFlow ef = (ElectricalFlow) arg0[0];
	//	ligtup( ef );
	}
	
	
	
	
}
