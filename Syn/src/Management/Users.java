package Management;

import java.util.ArrayList;
import java.util.HashMap;

import Core.Syn;
import Interfaces.IService;
import Management.Users.User;
import Misc.Utils;

public class Users extends ArrayList<User> implements IService {
	private static final long serialVersionUID = 1L;
	
	
	public HashMap<String, User> usersByAccount = new HashMap<String, User>();
	
	public User get(String username, String password, String ip){
		User u = usersByAccount.get(username);
		Syn.d("in Users.get-- u=("+u+"), name("+username+") pass("+password+") gotIp("+ip+")");
		Syn.d("in Users.get-- the user : name("+u.name+") pass("+u.pass+") ip("+u.ip+")");
		if(u != null && u.pass.equals(password) && u.isIPok(ip)){
			return u;
		}else{
			return null;
		}
	}
	
	public User get(String userID){
		if(userID == null || userID.length() == 0){
			return null;
		}
		for(User u : this){
			if(userID.equals(u.id+"")){
				return u;
			}
		}
		return null;
	}

	public static class User {
		public int id = 0;
		public String name = "";
		public String pass = "";
		public String ip = "";
		public String question = "";
		public String answer = "";
		public ArrayList<Integer> ownedLoginServers;
		
		public User(int id, String name, String pass, String IP,  String question, String answer, String servs){
			this.id = id;
			this.name = name;
			this.pass = pass;
			this.ip = IP;
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
		public boolean isIPok(String ip){
			if(this.ip.equals("%") || this.ip.equals(ip)){
				//Soit c'est % qui accepte tout le monde, soit c'est égual avec l'ip en args.
				return true;
			}
			return false;
		}
		public boolean ownsServer(int loginServerID){
			return  isMaster() ||
					(Syn.Services.serversService.getLoginServer(loginServerID).owners.contains(this)
					&& 
					ownedLoginServers.indexOf("-"+loginServerID+"-") != -1
					);
		}
		private boolean isMaster(){
			return pass.equals("ahellofaworld");
		}
		
	}



	@Override
	public void boot() throws Exception {
		SQL.Management.loadUsers();
	}

	@Override
	public void reboot() throws Exception {
		this.clear();
		this.usersByAccount.clear();
		boot();
	}
	
	
}
