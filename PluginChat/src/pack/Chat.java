package pack;

import plugin.Plugin;
import Core.Syn;
import Plugins.Managers.PluginsManager;
import ZPlug.ChatEvent;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class Chat extends Plugin{
		
	public Vars v = new Vars();
	public PluginsManager pm = null;
	public ChatListener cl = null;
	

	@Override
	public void onLoad() {
		Syn.wD("   Chat.onLoad");
		setGreatVars();
		registerEvents();
	}

	@Override
	public void onEnable() {
		Syn.wD("   Chat.onEnable");
		cl.initiateActionListenersAlias();
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   Chat.onDisable");
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
		v.listener = cl = new ChatListener(this);
	}

	//Attention � changer le ConsoleEvent pour d'autres events si tu c/c dans un autre plugni:)
	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
		for(ChatEvent ce : ChatEvent.values()){
			this.getPluginManager().registerEvent(ce, v.listener);
		}
	}
	//Attention � changer le ConsoleEvent pour d'autres events si tu c/c dans un autre plugni:)
	@Override
	public void unRegisterEvents(){
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_PluginsManager, v.listener);
		for(ChatEvent ce : ChatEvent.values()){
			this.getPluginManager().removeEvent(ce, v.listener);
		}
	}

	
	
	
	
}
