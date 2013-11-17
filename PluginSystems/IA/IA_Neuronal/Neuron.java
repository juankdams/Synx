package IA;

import java.util.ArrayList;

import IA.PatternEnum;
import static IA.PatternEnum.*;
import Interfaces.Executable;

public class Neuron {

	public String name = "";
	public int threshold = 0;
	
	/*
	public int ohms = 0;//minimum threshold to fire.
	public ArrayList<Executable> executables = null;
	public ArrayList<Object[]> params = null;
	
	
	
	
	public boolean check(PatternEnum pattern, ElectricalFlow ef){
		if(pattern == OR){
			return ef.volts >= (ohms * ef.amps); 
		}else if(pattern == AND){
			return ef.amps >= (ohms / ef.volts); 
		}
		return false;
	}
	public ElectricalFlow updateFlow(PatternEnum pattern, ElectricalFlow ef){
		if(pattern == OR){
			ef.volts -= (ohms * ef.amps); 
		}else if(pattern == AND){
			ef.amps -= (ohms / ef.volts); 
		}
		return ef;
	}
	
	
	public ElectricalFlow fire(ElectricalFlow ef){
		if(executables.size() == 0){
			executables = null;
		}
		if(executables != null){
			for(int i = executables.size()-1; i >= 0; i--){
				executables.get(i).apply( params.get(i) );
			}
		}
		
		return ef;
	}
	
	*/
	
	
}
