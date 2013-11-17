package SynBot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Bot implements Runnable{

	
	
	
	
	public void run(){
		try{
			//Socket mySkt = new Socket("IP", PORT);
			Socket mySkt = new Socket("127.0.0.1", 666);
			//
			PrintStream myPS = new PrintStream(mySkt.getOutputStream());
			
			myPS.println("&*|oauydsf");
			
			BufferedReader CLI_BR = new BufferedReader(new InputStreamReader
					(mySkt.getInputStream())     );
			String temp = "";
			
			
			while((temp = CLI_BR.readLine()) != null){
				System.out.println(temp);
				//if(temp.contains("A")){
					for(int i = 0; i < 800; i++){
						myPS.print("AKFJK:AJNSFKJNADKFJN");
					}
				//}
			}
			
			
		}catch(Exception e){
			
		}
	}
	
	
	
	
	
}
