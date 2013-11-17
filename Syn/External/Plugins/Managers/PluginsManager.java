package Plugins.Managers;

import plugin.Plugins;
import Interfaces.IService;

public abstract class PluginsManager implements IService {
	
	public static class PluginsManagerAdapter {
		private PluginsManager pm = null;
		private PluginsManagerAdapter(PluginsManager pm){
			this.pm = pm;
		}
		public ActionsManager getActionsManager(){ return pm.am; }
		public AspectJManager getAspectJManager(){ return pm.ajm; }
		public EffectsManager getEffectsManager(){ return pm.em; }
		public FormulingManager getFormulingManager(){ return pm.fm; }
		public MacroManager getMacroManager(){ return pm.mm; }
		public ParsingManager getParsingManager(){ return pm.pm; }
		public SystemsManager getSystemsManager(){ return pm.sm; }
		public ProvidersManager getProviders(){ return pm.p; }
	}
	
	private PluginsManagerAdapter adapter;
	private PluginsManager defaultPluginsManager;

	public Plugins plugins;
	
	private ProvidersManager p;
	private ActionsManager am;
	private AspectJManager ajm;
	private EffectsManager em;
	private FormulingManager fm;
	private MacroManager mm;
	private ParsingManager pm;
	private SystemsManager sm;
	

	public PluginsManager(PluginsManager defaultPluginsManager){
		this.defaultPluginsManager = defaultPluginsManager;
	}
	
	@Override
	public void boot() throws Exception {
		plugins = new Plugins();
		//p = new ProvidersManager();
		//p.boot();
		instance();
		loadPlugins();
	}
	@Override
	public void reboot() throws Exception {
		boot();
	}
	
	public abstract void loadPlugins();//call SQL.SConfig.loadPlugins();
	
	private void instance(){
		p = new ProvidersManager();
		am = new ActionsManager();
		ajm = new AspectJManager();
		em = new EffectsManager();
		fm = new FormulingManager();
		mm = new MacroManager();
		pm = new ParsingManager();
		sm = new SystemsManager();
	}
	
	
	public ActionsManager getActionsManager(){
		return (am != null && am.getAapl() != null) ? am : defaultPluginsManager.am;
	}
	public AspectJManager getAspectJManager(){
		return (ajm != null && ajm.getAapl() != null) ? ajm : defaultPluginsManager.ajm;
	}
	public EffectsManager getEffectsManager(){
		return (em != null && em.getEpli() != null) ? em : defaultPluginsManager.em;
	}
	public FormulingManager getFormulingManager(){
		return (fm != null && fm.getFormulas() != null) ? fm : defaultPluginsManager.fm;
	}
	public MacroManager getMacroManager(){
		return (mm != null && mm.am != null) ? mm : defaultPluginsManager.mm;
	}
	public ParsingManager getParsingManager(){
		return (pm != null && !pm.getParsers().isEmpty()) ? pm : defaultPluginsManager.pm;
	}
	public SystemsManager getSystemsManager(){
		return (sm != null && sm.systems != null) ? sm : defaultPluginsManager.sm;
	}
	public ProvidersManager getProviders(){
		//v juste prit un des providers au hasard pour vérifier que le manager soit instancié
		return (p != null && p.loginServerProvider != null) ? p : defaultPluginsManager.p;
	}
	
	public PluginsManagerAdapter getAdapter(){
		if(adapter == null) adapter = new PluginsManagerAdapter(this);
		return adapter;
	}
	
	public PluginsManager getDefaultPluginsManager() {
		return defaultPluginsManager;
	}
	

}
