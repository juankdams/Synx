package GameClientStrategies;

import piou.scripts.ExecutableScript;
import piou.scripts.ScriptsService;
import Abstractions.AbstractSqlService;
import GlobalObjects.GlobalWorld;
import Interfaces.IService;
import Misc.Tests.Perfs;
import Plugins.Managers.PluginsManager;
import SQL.SConfig;
import SQL.SqlServiceMySql;

public abstract class GameClientStrategy implements IService {
	
	protected GameClientStrategies strategy;

	public String globalDBIP = "";
	public String globalDBName = "";
	public String globalDBUser = "";
	public String globalDBPass = "";
	
	public GlobalWorld globalWorld;
	public PluginsManager defaultPluginsManager;
	public ScriptsService<ExecutableScript> scripts;
	public AbstractSqlService sqlGlobalService;//Données de l'officiel
	
	protected GameClientStrategy(){
		globalWorld = new GlobalWorld(this);
	}
	
	public String getName(){
		return strategy.name();
	}
	
	void set(GameClientStrategies strategy) {
		this.strategy = strategy;
	}
	public GameClientStrategies get() {
		return strategy;
	}
	
	public void boot() throws Exception {
		bootSqlService();
		bootPluginsManager();
		bootScripts();
		globalWorld.boot();
	}
	public void reboot() throws Exception {
		sqlGlobalService.reboot();
		scripts.reboot();
		defaultPluginsManager.reboot();
	}
	
	private void bootSqlService() throws Exception {
		Perfs p = new Perfs();
		sqlGlobalService = new SqlServiceMySql(){
			@Override
			public void boot() throws Exception{
				c = createConnection(
						globalDBIP,
						globalDBName,
						globalDBUser,
						globalDBPass
						);
				//this.TIMER(false);
				c.setAutoCommit(true);
			}
		};
		sqlGlobalService.boot();
		p.stopTiming("Booted Global "+getName()+" SQL");
	}
	
	private void bootScripts()  throws Exception {
		this.scripts = new ScriptsService<ExecutableScript>(){
			private static final long serialVersionUID = 1L;
			@Override
			public void boot() throws Exception {
				SQL.SConfig.loadScripts(globalWorld, null);
			}
		};
		scripts.boot();
	}

	private void bootPluginsManager() throws Exception {
		this.defaultPluginsManager = new PluginsManager(null){
			@Override
			public void loadPlugins() {
				SConfig.loadPlugins(globalWorld, null);
				SConfig.loadMacros(globalWorld, null);
			}
		};
		defaultPluginsManager.boot();
	}
	
	
}
