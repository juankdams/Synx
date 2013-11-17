package IA;

import java.util.ArrayList;
import java.util.Random;

import Core.Syn;
import Misc.Randomizer;


public class Tests {

	
	
	public static ArrayList<Integer[][]> oldThresholdsGenerations = new ArrayList<Integer[][]>();
	public static ArrayList<Integer> oldOutputErrors = new ArrayList<Integer>();

	public static int[] random = new int[]{2,2};
	
	
	public static Network n = new Network();
	public static Integer[][] thresholds = new Integer[][]{  {1, 2, 3, 4}, {1, 2}, {1, 2, 3}  };
	public static int[][] inputs = new int[][]{  {2, 6, 7, -2}, {1, 7}, {100, -12, 3}  };

	public static int numberOfRunsTodo = 10000;
	public static int numberOfRunsDone = 0;
	public static long time = 0;
	public static boolean win = false;
	
	public static void main(final String[] args){ 
		time = System.currentTimeMillis();
		setup( );
		
		while(numberOfRunsDone != numberOfRunsTodo){
			run( );
			if(win){
				break;
			}
			numberOfRunsDone++;
		}
		if(!win){
			Syn.d("FAIL !  Time : "+(System.currentTimeMillis()-time)+"ms");
		}
	}
	
	
	public static void setup(){
		n.main.neurons = new ArrayList<Neuron>();
		for(int l = 0; l <= thresholds.length-1; l++){
			NeuronContainer nc = new NeuronContainer();
			nc.neurons = new ArrayList<Neuron>();
			for(int i = 0; i <= thresholds[l].length-1; i++){
				Neuron n = new Neuron();
				n.threshold = thresholds[l][i];
				nc.neurons.add(n);
			}
			n.main.neurons.add(nc);
		}
	}
	
	public static void run(){
		int[][] result = new int[][]{  {0, 0, 0, 0}, {0, 0}, {0, 0, 0}  };
		for(int l = 0; l <= n.main.neurons.size()-1; l++){//iterate layers
			int output = Integer.MIN_VALUE;
			if(n.main.neurons.get(l) instanceof NeuronContainer){
				NeuronContainer nc = ((NeuronContainer)n.main.neurons.get(l));
				//Syn.d("nc.neurons.size = "+nc.neurons.size()+"  l="+l+".");
				for(int i = 0; i <= nc.neurons.size()-1; i++){
					//Syn.d("nc.neurons.size = "+nc.neurons.size()+"  l="+l+".  i="+i+".");
					output = testFunction(inputs[l][i], nc.neurons.get(i).threshold);
					result[l][i] = output;
					if(output != 0){
						writeResult(result);
						error(output);
						thresholds[l][i] = getRandomNewThresholdValue(true);
						setup();
						return;
					}
				}
			}else{
				output = testFunction(inputs[l][0], n.main.neurons.get(l).threshold);
				result[l][0] = output;
				writeResult(result);
				error(output);
				thresholds[l][0] = getRandomNewThresholdValue(true);
				setup();
				return;
			}
		}
		writeResult(result);
		win = true;
		Syn.d("WIN ! Tries : "+numberOfRunsDone+" Time : "+(System.currentTimeMillis()-time)+"ms");
	}
	
	public static int testFunction(int input, int threshold){
		return input - threshold;
	}
	
	public static void writeResult(int[][] result){
		String total = "";
		for(int l = 0; l <= result.length-1; l++){
			total += "[";
			for(int i = 0; i <= result[l].length-1; i++){
				total += ""+result[l][i];
				if(i != result[l].length-1){
					total += ",";
				}
			}
			total += "] ";
		}
		Syn.d(total);
	}
	
	public static void error(int outputError){
		oldThresholdsGenerations.add(thresholds);
		oldOutputErrors.add(outputError);
		Syn.d("Error ("+outputError+")");
		//throw new NullPointerException();
	}
	
	public static int getRandomNewThresholdValue(boolean mod){
		int last = oldOutputErrors.size() == 0 ? 0 :
			oldOutputErrors.get(oldOutputErrors.size()-1);
		int lastlast = oldOutputErrors.size() <= 1 ? 0 :
			oldOutputErrors.get(oldOutputErrors.size()-2);
		
		if(mod == false){
			int rand = Randomizer.rand(random[0], random[1]);
			Syn.d("Randomizer rand="+rand+".  last="+last+". lastlast="+lastlast+". nomod[0]="+random[0]+".  nomod[1]="+random[1]+". ");
			return rand;
		}
		
		
		if(last > 0){//si last est positif
			random[0]++;
			random[1]++;
			if(lastlast == 0){
				Syn.d("1.1");
				random[1]--;
				if(random[1] < random[0]){
					random[0] = random[1];
				}
			}else
			if(lastlast < 0){//si lastlast est négatif
				if(last > lastlast){
					random[1]--;
					Syn.d("1.2.1");
				}else{
					random[1]++;
					Syn.d("1.2.2");
				}
			}else if(lastlast > 0){
				Syn.d("1.3.1");
				
			}
		}else{
			random[0]--;
			random[1]--;
			/*if(lastlast == 0){
				Syn.d("1.5");
				random[1]--;
				if(random[1] < random[0]){
					random[0] = random[1];
				}
			}else
			if(lastlast < 0){//si lastlast est négatif
				if(last > lastlast){
					random[1]--;
					Syn.d("3");
				}else{
					random[1]++;
					Syn.d("4");
				}
			}else if(lastlast > 0){
				
			}*/
		}
		int rand = Randomizer.rand(random[0], random[1]);
		Syn.d("Randomizer rand="+rand+".  last="+last+". lastlast="+lastlast+". new[0]="+random[0]+".  new[1]="+random[1]+". ");
		return rand;
	}
	
	
	
	
	
}
