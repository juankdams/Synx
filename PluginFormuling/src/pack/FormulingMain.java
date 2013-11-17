package pack;

import plugin.Plugin;
import plugin.event.Event;
import plugin.event.PluginListener;
import Core.Syn;
import Maths.Formulas;
import Pathfinding.PathUtils;
import Plugins.Managers.PluginsManager;
import ShivasPF.Node;
import ShivasPF.Path;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class FormulingMain extends Plugin implements PluginListener{


	public Vars v = new Vars();
	public PluginsManager pm = null;
	public Formulas f = new Formulas();
	public Node n = new Node();
	public Path p = new Path();
	public PathUtils pu = new PathUtils();
	
	
	@Override
	public void onLoad() {
		Syn.wD("   FormulingPlugin.onLoad");
		setGreatVars();
		registerEvents();
		
		//initiateParsers();
		//initiateActionListenersAlias();
	}

	@Override
	public void onEnable() {
		Syn.wD("   FormulingPlugin.onEnable");
		pm.getAdapter().getFormulingManager().setFormulas(f);
		pm.getAdapter().getFormulingManager().setPath(p);
		pm.getAdapter().getFormulingManager().setNode(n);
		pm.getAdapter().getFormulingManager().setPathUtils(pu);
		initiateActionListenersAlias();
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   Formuling.onDisable");
	}

	@Override
	public void unload() {
		pm.getAdapter().getFormulingManager().unload();
		v = null;
	}
	
	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
	}

	@Override
	public void unRegisterEvents() {
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_PluginsManager, v.listener);
	}
	
	private void setGreatVars() {
		v.unrecognizedCommand = this.getInformation().getName()+v.unrecognizedCommand+this.getInformation().getName()+"Plugin";
		v.unrecognizedEvent = this.getInformation().getName()+v.unrecognizedEvent+this.getInformation().getName()+"Plugin";
		v.pluginEnabled = this.getInformation().getName()+v.pluginEnabled;
		v.pluginDisabled = this.getInformation().getName()+v.pluginDisabled;
		v.listener = this;
	}

	@Override
	public Event execute(Event event) {
		if(event.getEventType() == MiscEvent.Load_Plugins_ActionListenersAlias){
			initiateActionListenersAlias();	
		}
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			pm = (PluginsManager) event.getSource();
		}
		return event;
	}
	
	 
	public void initiateActionListenersAlias(){

	}


	
	

	
}
