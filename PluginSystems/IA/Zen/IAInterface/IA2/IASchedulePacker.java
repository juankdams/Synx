package Zen.IAInterface.IA2;

import java.io.PrintWriter;
import java.util.ArrayList;

import objects.Fight;

import common.Zen;

import Threads.ModalT;

public class IASchedulePacker implements Runnable{

	/**
	 * Object[0] = une array de PrintWriter
	 * Object[1] = date (par currentMillis) � laquelle il faut envoyer les packets de larray
	 */
	private static ArrayList<ArrayList<Object[]>> pool = new ArrayList<ArrayList<Object[]>>();
	private static ArrayList<ArrayList<Object[]>> pool2 = new ArrayList<ArrayList<Object[]>>();
	//Les temps pour les taks ca va faire ca dans une timeline: (normalement)
	//pool1:  |||||      |||    ||||    |||| ....etc
	//pool2:       ||||||   ||||    ||||
	private static boolean oneOrTwo = true;
	
	public static int maxALSize = 1000;//Metons un max de 1000 <Object[]> par ArrayList
	
	
	
	
	public static void schedulePackets(PrintWriter[] pws, String[] packet){
		int nbrPackets = 0;
		Object[] packets = new Object[packet.length+2];
		packets[0] = pws;
		packets[1] = System.currentTimeMillis();
		for(int i = packet.length; i-- > 0;){
			Zen.debug("i = "+i);//TODO v�rifie le i-- > 0; dans les for
			packets[i+2] = packet[i];
		}
		IASchedulePacker.addPackets(packets);
	}
	
	public static synchronized boolean addPackets(Object packets[]){
		if(oneOrTwo){
			for(ArrayList<Object[]> a : pool){
				if(a.size() <= maxALSize){//Metons un max de 1000 <Object[]> par ArrayList
					a.add(packets);
					return true;
				}
			}
			ArrayList<Object[]> al = new ArrayList<Object[]>();
			al.add(packets);
			pool.add(al);
			return false;
		}else{
			for(ArrayList<Object[]> a : pool2){
				if(a.size() <= maxALSize){//Metons un max de 1000 <Object[]> par ArrayList
					a.add(packets);
					return true;
				}
			}
			ArrayList<Object[]> al = new ArrayList<Object[]>();
			al.add(packets);
			pool2.add(al);
			return false;
		}
		
	}
	
	
	private Thread t = null;
	
	public IASchedulePacker(){
		
	}
	
	public void setThread(IASchedulePacker m, String name){
		this.setT(new Thread(m));
		this.getT().setName(name);
		this.t.start();
	}
	
	
	@Override
	public void run() {
		while(!t.isInterrupted()){
			oneOrTwo = false;
			for(ArrayList<Object[]> al : pool){
				for(Object[] p : al){
					//Sleep le temps d'arriver � la bonne date
					if((Long)p[1] < System.currentTimeMillis()){
						try {
							//->Pour lui v faut un if au lieu d'un while
							Thread.sleep(System.currentTimeMillis()-(Long)p[1]);
							//->Pour lui v c'tun while pcq bon on attend l� x_x
							//Thread.sleep(15);
						} catch (NumberFormatException e) {e.printStackTrace();
						} catch (InterruptedException e) {e.printStackTrace();}
					}
					//Envoie les packets � tous les destinataires
					for(int i = p.length-1; i-- > 2;){
						Zen.debug("i = "+i);
						for(PrintWriter pw : (PrintWriter[])p[0]){
							SM.Sender.sendTest(pw, p[i]+"");
						}
					}
				}
				al.clear();
			}
			oneOrTwo = true;
			for(ArrayList<Object[]> al : pool2){
				for(Object[] p : al){
					//Sleep le temps d'arriver � la bonne date
					if((Long)p[1] < System.currentTimeMillis()){
						try {
							//->Pour lui v faut un if au lieu d'un while
							Thread.sleep(System.currentTimeMillis()-(Long)p[1]);
							//->Pour lui v c'tun while pcq bon on attend l� x_x
							//Thread.sleep(15);
						} catch (NumberFormatException e) {e.printStackTrace();
						} catch (InterruptedException e) {e.printStackTrace();}
					}
					//Envoie les packets � tous les destinataires
					for(int i = p.length-1; i-- > 2;){
						Zen.debug("i = "+i);
						for(PrintWriter pw : (PrintWriter[])p[0]){
							SM.Sender.sendTest(pw, p[i]+"");
						}
					}
				}
				al.clear();
			}
		}
	}
	
	
	private Thread getT() {
		return this.t;
	}
	private void setT(Thread t) {
		this.t = t;
	}
	
}
