package IA.Networks;

import static IA.PatternEnum.*;

import java.util.ArrayList;

import ConfigurationObjects.Classe;
import GameObjects.Fights.GFight;
import IA.ElectricalFlow;
import IA.Network;
import IA.Neuron;
import IA.NeuronContainer;

public class BasicDofusIANetwork extends Network{

	public GFight fight = null;
	
	public NeuronContainer main = new NeuronContainer();
	public NeuronContainer classes = new NeuronContainer();
	public NeuronContainer levels = new NeuronContainer();
	
	
	public BasicDofusIANetwork(GFight f){
		fight = f;
		initLevelsContainer();
		initClassesContainer();
		

		initMainContainer();
	}
	
	protected void initMainContainer(){
		main.name = "MainContainer";
		main.pattern = AND;

	}
	
	protected void initClassesContainer(){
		ArrayList<Classe> cs = null;//world.getClasses
		classes.name = "ClassesContainer";
		classes.pattern = UOR;
		classes.neurons = new ArrayList<Neuron>(cs.size());
		for(int i = cs.size()-1; i >= 0; i--){
			Neuron n = new Neuron();
			n.name = "Classe"+i;
			n.ohms = i;
			classes.neurons.add(n);
		}
	}
	
	protected void initLevelsContainer(){
		int interval = 0;
		int max_level = 0;
		
		
		levels.name = "LevelsContainer";
		levels.pattern = UOR;
		levels.neurons = new ArrayList<Neuron>(max_level/interval);
		for(int i = max_level-1; i>= 0; i -= interval){
			Neuron n = new Neuron();
			n.name = "Level"+i;
			n.ohms = i;
			levels.neurons.add(n);
			//L'ordre dans le quel on met entre les neurones dans la liste est importante.
			//C'est dans cet ordre qu'elles seront check+fire.
		}
	}
	
	public Neuron getClasseLevels(ElectricalFlow ef){
		for(Neuron n : classes.neurons){
			if(n.check(classes.pattern, ef)){
				return n;
			}
		}
		return null;
	}
	
	public Neuron getNeuronForLevel(ElectricalFlow ef){
		for(Neuron n : levels.neurons){
			if(n.check(levels.pattern, ef)){
				return n;
			}
		}
		return null;
	}
	
	
	public void run(){
		
		for(Neuron n : main.neurons){
			n.fire(ef);
		}
	}
	
	public void train(){
		
	}
	
	
	
}
