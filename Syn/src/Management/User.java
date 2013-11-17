package Management;

import java.util.ArrayList;
import Misc.Utils;

public class User {

	public int id = 0;
	public String name = "";
	public String pass = "";
	public String question = "";
	public String answer = "";
	public ArrayList<Integer> ownedLoginServers;
	
	public User(int id, String name, String pass, String question, String answer, String servs){
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.question = question;
		this.answer = answer;
		String[] servers = servs.split(",");
		this.ownedLoginServers = new ArrayList<Integer>(servers.length);
		for(String s : servers){
			if(s.length() > 0 && Utils.isParsableInteger(s)){
				ownedLoginServers.add(Integer.parseInt(s));
			}else{
				Core.Exceptions.throwDataFormatException("Impossible de parser l'ID ("+s+") d'un loginServer dans la liste de ceux contrôllés par le user ("+id+").  ");
			}
		}
	}
	
	public boolean ownsServer(int loginServerID){
		return ownedLoginServers.indexOf(loginServerID) != -1;
	}
	
}
