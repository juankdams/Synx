package pack;

import plugin.Plugin;
import plugin.event.Event;
import plugin.event.PluginListener;
import Core.Syn;
import Game.GServer;
import Plugins.Managers.PluginsManager;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class InjectMain extends Plugin implements PluginListener {
	
	public Vars v = new Vars();
	public Providers p = null;
	
	@Override
	public void onLoad() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onLoad");
		setGreatVars();
		registerEvents();
		p = new Providers();
	}

	@Override
	public void onEnable() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onEnable");
		initiateActionListenersAlias();
		//initiateParsers();
		try {
			p.boot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onDisable");
	}

	@Override
	public void unload() {
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
		if(event.getEventType() == MiscEvent.Set_GameServer){
			p.s = (GServer) event.getSource();
		}
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			p.pm = (PluginsManager) event.getSource();
		}
		return event;
	}
	
	 
	public void initiateActionListenersAlias(){

	}
	
	

}
