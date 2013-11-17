package pack;

import plugin.Plugin;
import Core.Syn;
import Plugins.Abstractions.AbstractActionPluginListener;
import Plugins.Managers.PluginsManager;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class ActionsMain extends Plugin{
	
	public Vars v = new Vars();
	public PluginsManager pm = null;
	public Application a = null;
	public ActionFactory af = null;
	
	@Override
	public void onLoad() {
		Syn.w("   ActionsPlugin.onLoad");
		setGreatVars();
		registerEvents();
	}

	@Override
	public void onEnable() {
		Syn.w("   ActionsPlugin.onEnabled");
		a.initiateActionListenersAlias();
		//Load tous les ActionsListenerAlias en callant le initiateActionListenerAlias dans tous les plugins.
		this.getPluginManager().callEvent(MiscEvent.Load_Plugins_ActionListenersAlias, this.getClass());
		//Set le listener dans l'emu
		pm.getAdapter().getActionsManager().setAapl((AbstractActionPluginListener) v.listener);
		pm.getAdapter().getActionsManager().setFactory(af);
	}

	@Override
	public void onDisable() {
		Syn.w("   ActionsPlugin.onDisable");
	}

	@Override
	public void unload() {
		pm.getAdapter().getActionsManager().unload();
		v = null;
		a = null;
	}
	
	
	private void setGreatVars() {
		v.unrecognizedCommand = this.getInformation().getName()+v.unrecognizedCommand+this.getInformation().getName()+"Plugin";
		v.unrecognizedEvent = this.getInformation().getName()+v.unrecognizedEvent+this.getInformation().getName()+"Plugin";
		v.pluginEnabled = this.getInformation().getName()+v.pluginEnabled;
		v.pluginDisabled = this.getInformation().getName()+v.pluginDisabled;
		v.listener = a = new Application(this);
		af = new ActionFactory();
	}
	
	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
	}
	@Override
	public void unRegisterEvents(){
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_PluginsManager, v.listener);
	}

	
	

}
