package IA;

public class ElectricalFlow {

	public int amps = 0;
	public int volts = 0;
	
	
	public int getWatts(){
		return amps * volts;
	}
	public int getResistance(){
		return volts / amps;
	}
	
	
}
