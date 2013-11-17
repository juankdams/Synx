package pack;

import plugin.Plugin;
import plugin.event.Event;
import plugin.event.PluginListener;
import Core.Syn;
import Game.DofusGameServer;
import MacroScripting.Macro;
import Plugins.Managers.PluginsManager;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class SystemsMain extends Plugin implements PluginListener {


	public Vars v = new Vars();
	public DofusGameServer s = null;//n'est setté que si c'est un plugin spécifié dans un serveur et non le default
	public PluginsManager pm = null;
	public Macro baseMacro = null;
	public SystemsImpl systems = null;
	
	@Override
	public void onLoad() {
		Syn.wD("   SystemsPlugin.onLoad");
		setGreatVars();
		registerEvents();
	}

	@Override
	public void onEnable() {
		Syn.wD("   SystemsPlugin.onEnable");
		baseMacro = new Macro();
		pm.getAdapter().getSystemsManager().systems = systems;
		pm.getAdapter().getMacroManager().am = baseMacro;
		initiateActionListenersAlias();
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   Systems.onDisable");
	}

	@Override
	public void unload() {
		//SystemsManager.unload();
		pm.getAdapter().getMacroManager().unload();
		v = null;
	}
	
	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_GameServer, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
	}

	@Override
	public void unRegisterEvents() {
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_GameServer, v.listener);
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
			s = (DofusGameServer) event.getSource();
		}
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			pm = (PluginsManager) event.getSource();
		}
		return event;
	}
	
	 
	public void initiateActionListenersAlias(){

	}


}
