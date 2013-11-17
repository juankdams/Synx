package IA;

import java.util.ArrayList;

import IA.Networks.AggressiveNetwork;

public class IAFactory {

	
	
	public static Network createIANetwork(ArrayList<Byte> header){
		Network n = null;
		NetworkType type = NetworkType.getType( header.remove(0) );
		switch(type){
			case Agressive:
				AggressiveNetwork an = new AggressiveNetwork();
				//....
				n = an;
				break;
			
		}
		return n;
	}
	
	
}
