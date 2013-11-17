package IA;

import java.util.ArrayList;

import Interfaces.Executable;

public class NeuronContainer extends Neuron{

	
	public ArrayList<Neuron> neurons = null;
	public PatternEnum pattern = null;

	
	
	/*
	@Override
	public boolean check(PatternEnum p, ElectricalFlow ef){
		return check(ef);
	}
	
	public boolean check(ElectricalFlow ef){
		boolean check = true;
		switch(pattern){
			case AND:
				for(Neuron n : neurons){
					if(n.check(pattern, ef) == false){
						check = false;
						break;
					}
				}
				//ici, il faut que toutes les neurons soient déclanchables pour toutes les déclancher
			break;
			case OR:
			case UOR:
				check = false;
				for(Neuron n : neurons){
					if(n.check(pattern, ef) == true){
						check = true;
						break;
					}
				}
				//ici, il faut seulement qu'il y ai au moins une neurone de d�clanchable pour la d�clancher.
			break;
			case XOR:
				check = false;
				boolean trueCheck = false;
				boolean falseCheck = false;
				for(Neuron n : neurons){
					if(n.check(pattern, ef) == true){
						trueCheck = true;
					}else
					if(n.check(pattern, ef) == false){
						falseCheck = true;
					}
					if(trueCheck & falseCheck == true){
						check = true;
						break;
					}
				}
				
				//ici, il faut seulement qu'il y ai au moins une neurone de d�clanchable pour la d�clancher.
				//Si toutes les neurones sont d�clanchables, on ne d�clanche rien.
				//Si toutes les neurones sont pas d�clanchables, on ne d�clanche rien.
			break;
		}
		return false;
	}
	
	@Override
	public ElectricalFlow fire(ElectricalFlow ef){
		for(Neuron n : neurons){
			switch(pattern){
				case AND:
					n.fire(ef);// elles ont toutes déjà été checkées dans le check du pattern.
				break; 
				case OR:
					if(n.check(pattern, ef)){
						n.fire(ef);//juste les bonnes neurones sont déclanchées ici.
					}
				break;
				case XOR:
					n.fire(ef); // elles ont toutes déjà été checkées dans le check du pattern.
				break;
				case UOR:
					if(n.check(pattern, ef)){
						n.fire(ef);//juste les bonnes neurones sont déclanchées ici.
						n.fire(ef);
						n.updateFlow(pattern, ef);
						return ef;
					}
				break;
			}
			n.fire(ef);
			n.updateFlow(pattern, ef);
		}
		
		return ef;
	}
	
	*/
	
	
	
}
