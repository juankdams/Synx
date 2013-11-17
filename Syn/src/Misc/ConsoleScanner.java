package Misc;

import java.util.Scanner;

import org.fusesource.jansi.Ansi;

import Core.Syn;
import Interfaces.IService;


public class ConsoleScanner implements Runnable, IService{

	public Thread t = null;
	Scanner input = null;
	boolean scanning = false;
	public String question = "";
	

	@Override
	public void boot() throws Exception {
		input = new Scanner(System.in);
		scanning = true;
		t = new Thread(this);
		t.setName("Console Reader");
		t.start();
	}
	
	@Override
	public void reboot() throws Exception {
		scanning = false;
		input.close();
		t.interrupt();
		boot();
	}
	

	@Override
	public void run() {
		String in = null;
		while(scanning){
			try{
				in = input.nextLine();
			}catch(java.util.NoSuchElementException e){e.printStackTrace();}
//juste une idée pour que les clients de Syn puissent faire des commandes console à partir de leur ptite app
			//if(externalIn.lenght != 0){
			//	in = externalIn;
			//}
			Syn.d("CS: input: "+in, Ansi.Color.YELLOW);
			//Commandes normales
			if(in.startsWith("@@")){
				if(in.equals("@@exit")){
					System.exit(0);
				}else
				if(in.equals("@@stopscan")){
					Syn.w("Scanner stopped", null);
					break;
				}
			}else
			//Commandes de réponse à une question (Ex pour créer une nouvelle table sql)
			if(in.startsWith("!!") && question.length() > 0){
				if(in.equals("yes")){
					answerYes();
				}else
				if(in.equals("no")){
					answerNo();
				}	
			}
		}
		t.interrupt();
	}
	
	
	public void answerYes(){
		if(question.contains("CREATE_MISSING_TABLE")){
			//create bdd
		}
		//else, do something else if the question is something else.
		Syn.w("Reponse prise en compte!");
	}
	
	public void answerNo(){
		if(question.contains("CREATE_MISSING_TABLE")){
			
		}
		Syn.w("Reponse prise en compte!");
	}

	
	
	
}