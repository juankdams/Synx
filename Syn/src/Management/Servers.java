package Management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;

import Core.Syn;
import Game.GameServer;
import Interfaces.IService;
import Login.LoginServer;
import Tool.TServer;


public class Servers implements IService {

	public ArrayList<TServer> toolServers;
	public HashMap<Short, LoginServer> loginServers;
	
	@Override
	public void boot() throws Exception {
		
		toolServers = new ArrayList<TServer>();
		loginServers = new HashMap<Short, LoginServer>();

		//Syn.Services.globalThreadsManagerService.newDirectTask(
		//		SchedulingA.INVOKE, 
		//		new Object[]{this.getClass().getMethod("bootToolServers"), 
		//		Syn.Services.serversService});
		bootToolServers();

		//Syn.Services.globalThreadsManagerService.newDirectTask(
		//		SchedulingA.INVOKE, 
		//		new Object[]{this.getClass().getMethod("bootLoginServers"), 
		//		Syn.Services.serversService});
		bootLoginServers();
	}
	
	public void bootToolServers() throws Exception{
		//ToolServers 
		HashMap<TServer, Boolean> tools = SQL.Management.loadToolServers();
		for(Entry<TServer, Boolean> tool : tools.entrySet()){
			toolServers.add(tool.getKey());
			tool.getKey().boot();
			if(tool.getValue()){
				tool.getKey().on();
			}
		}
		Syn.d("Finit les ToolServers");
	}
	
	public void bootLoginServers() throws Exception{
		//LoginServers
		HashMap<LoginServer, Boolean> logins = SQL.Management.loadLoginServers();
		for(Entry<LoginServer, Boolean> login : logins.entrySet()){
			loginServers.put(login.getKey().ID, login.getKey());
			if(login.getValue()){
				login.getKey().boot();
				login.getKey().on();
				bootGameServers(login);
				//Syn.Services.globalThreadsManagerService.newDirectTask(
				//		SchedulingA.INVOKE, 
				//		new Object[]{this.getClass().getMethod("bootGameServers", Entry.class), 
				//		Syn.Services.serversService, login});
			}
		}
		Syn.d("Fini les LoginServers");
	}
	
	public void bootGameServers(Entry<LoginServer, Boolean> login) throws Exception{
		//GamesServers
		HashMap<GameServer, Boolean> games = SQL.Management.loadGameServers(login.getKey());
		for(Entry<GameServer, Boolean> game : games.entrySet()){
			login.getKey().gameServers.add(game.getKey());
			if(game.getValue()){
				game.getKey().boot();
				game.getKey().on();
			}
		}
		Syn.d("Finit les GameServers d'un des Logins.  TempsTotal="+(System.currentTimeMillis()-Syn.time));
	}
	
	public static long perfTick(String task, long i){
		System.out.println(Ansi.ansi().fg(Color.YELLOW).a(task+" = "+(System.currentTimeMillis() - i)+" ms").reset());
		return System.currentTimeMillis();
	}
	
	@Override
	public void reboot() throws Exception {
		for(TServer s : toolServers){
			s.save();
			s.off(true);
		}
		for(LoginServer s: loginServers.values()){
			for(GameServer gs : s.gameServers){
				gs.save();
				gs.off(true);
				gs = null;
			}
			s.gameServers.clear();
			s.save();
			s.off(true);
			s = null;
		}
		loginServers.clear();
		boot();
	}


	public LoginServer getLoginServer(int id) {
		return loginServers.get(id);
	}
	public TServer getToolServer(int id) {
		for(TServer s : this.toolServers){
			if(s.getID() == id){
				return s;
			}
		}
		return null;
	}

}
