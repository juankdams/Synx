package pack;

import plugin.Plugin;
import Core.Syn;
import Plugins.Abstractions.AbstractEffectPluginListener;
import Plugins.Managers.PluginsManager;
import ZPlug.MiscEvent;
import ZPlug.Vars;

public class EffectsMain extends Plugin {
	
	public Vars v = new Vars();
	public Application a = null;
	public PluginsManager pm = null;
	
	@Override
	public void onLoad() {
		Syn.wD("   EffectsPlugin.onLoad");
		setGreatVars();
		registerEvents();
	}
	
	@Override
	public void onEnable() {
		Syn.wD("   EffectsPlugin.onEnable");
		a.initiateActionListenersAlias();
		a.fillApplyers();
		//Set le listerner dans l'emu
		pm.getAdapter().getEffectsManager().setEpli((AbstractEffectPluginListener) v.listener);
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   EffectsPlugin.onDisable");
	}
	
	@Override
	public void unload() {
		pm.getAdapter().getEffectsManager().unload();
		a = null;
		v = null;
	}
	
	private void setGreatVars() {
		v.unrecognizedCommand = this.getInformation().getName()+v.unrecognizedCommand+this.getInformation().getName()+"Plugin";
		v.unrecognizedEvent = this.getInformation().getName()+v.unrecognizedEvent+this.getInformation().getName()+"Plugin";
		v.pluginEnabled = this.getInformation().getName()+v.pluginEnabled;
		v.pluginDisabled = this.getInformation().getName()+v.pluginDisabled;
		a = new Application(this);
		v.listener = a;
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
