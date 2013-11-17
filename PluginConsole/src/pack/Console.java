package pack;

import plugin.Plugin;
import Core.Syn;
import Plugins.Managers.PluginsManager;
import ZPlug.ConsoleEvent;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class Console extends Plugin{
	
	public Vars v = new Vars();
	public PluginsManager pm = null;
	public ConsoleListener cl = null;


	@Override
	public void onLoad() {
		Syn.wD("   Console.onLoad");
		setGreatVars();
		registerEvents();
	}
	
	@Override
	public void onEnable() {
		Syn.wD("   Console.onEnable");
		cl.initiateActionListenersAlias();
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   Console.onDisable");
	}

	@Override
	public void unload() {
		v = null;
		cl = null;
	}
	

	private void setGreatVars() {
		v.unrecognizedCommand = this.getInformation().getName()+v.unrecognizedCommand+this.getInformation().getName()+"Plugin";
		v.unrecognizedEvent = this.getInformation().getName()+v.unrecognizedEvent+this.getInformation().getName()+"Plugin";
		v.pluginEnabled = this.getInformation().getName()+v.pluginEnabled;
		v.pluginDisabled = this.getInformation().getName()+v.pluginDisabled;
		v.listener = cl = new ConsoleListener(this);
	}

	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
		for(ConsoleEvent ce : ConsoleEvent.values()){
			this.getPluginManager().registerEvent(ce, v.listener);
		}
	}
	@Override
	public void unRegisterEvents(){
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_PluginsManager, v.listener);
		for(ConsoleEvent ce : ConsoleEvent.values()){
			this.getPluginManager().removeEvent(ce, v.listener);
		}
	}
	
	
}
