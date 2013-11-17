package pack;

import plugin.Plugin;
import plugin.event.Event;
import plugin.event.PluginListener;
import Core.Syn;
import Game.DofusGameServer;
import Game.GameServer;
import GameClientStrategies.GameClientStrategies;
import Plugins.Managers.PluginsManager;
import Plugins.Managers.PluginsManager.PluginsManagerAdapter;
import Providers.GBuffProvider;
import Providers.GDropItemProvider;
import Providers.GDropProvider;
import Providers.GEffectProvider;
import Providers.GInventoryProvider;
import Providers.GItemProvider;
import Providers.GMonsterGroupProvider;
import Providers.GMonsterProvider;
import Providers.GMountProvider;
import Providers.GPersonnageProvider;
import Providers.GSpellProvider;
import Providers.IAProvider;
import Providers.ItemSetProvider;
import ZPlug.MiscEvent;
import ZPlug.Vars;
import Providers.LoginServerProvider.DofusLServerProvider;
import Providers.LoginServerProvider.WakfuLServerProvider;
import Providers.GameServerProvider.DofusGameServerProvider;
import Providers.GameServerProvider.WakfuGameServerProvider;

public class ProvidingMain extends Plugin implements PluginListener {
	
	public Vars v = new Vars();
	//public Providers p = null;
	public PluginsManager pm = null;
	public GameServer s = null;//n'est setté que si c'est un plugin spécifié dans un serveur et non le default
	public GameClientStrategies gameClientStrategy;
	
	@Override
	public void onLoad() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onLoad");
		setGreatVars();
		registerEvents();
		//p = new Providers();
	}

	@Override
	public void onEnable() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onEnable");
		initiateActionListenersAlias();
		initiateProviders();
	}
	
	@Override
	public void onDisable() {
		Syn.wD("   "+this.getInformation().getName()+"Plugin"+".onDisable");
	}

	@Override
	public void unload() {
		pm.getAdapter().getProviders().unload();
		v = null;
	}
	
	@Override
	public void registerEvents() {
		this.getPluginManager().registerEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_GameServer, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_PluginsManager, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_GameClientStrategy, v.listener);
	}

	@Override
	public void unRegisterEvents() {
		this.getPluginManager().removeEvent(MiscEvent.Load_Plugins_ActionListenersAlias, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_GameServer, v.listener);
		this.getPluginManager().removeEvent(MiscEvent.Set_PluginsManager, v.listener);
		this.getPluginManager().registerEvent(MiscEvent.Set_GameClientStrategy, v.listener);
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
			s = (GameServer) event.getSource();
		}
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			pm = (PluginsManager) event.getSource();
		}
		if(event.getEventType() == MiscEvent.Set_GameClientStrategy){
			gameClientStrategy = (GameClientStrategies) event.getSource();
			initiateProviders();
		}
		return event;
	}
	
	public void initiateActionListenersAlias(){

	}
	
	public void initiateProviders(){
		PluginsManagerAdapter pma = pm.getAdapter();
		if(gameClientStrategy == GameClientStrategies.DofusClientStrategy){
			pma.getProviders().setLoginServerProvider(new DofusLServerProvider());
			pma.getProviders().setGameServerProvider(new DofusGameServerProvider());
			
			pma.getProviders().setBuffsProvider(new GBuffProvider());
			pma.getProviders().setDropItemsProvider(new GDropItemProvider());
			pma.getProviders().setDropsProvider(new GDropProvider());
			pma.getProviders().setEffectsProvider(new GEffectProvider());
			pma.getProviders().setIAProvider(new IAProvider());
			pma.getProviders().setItemsprovider(new GItemProvider());
			pma.getProviders().setMonsterGroupsProvider(new GMonsterGroupProvider());
			pma.getProviders().setMonstersProvider(new GMonsterProvider());
			pma.getProviders().setPersonnagesProvider(new GPersonnageProvider());
			pma.getProviders().setSpellsProvider(new GSpellProvider());
			pma.getProviders().setItemSetsProvider(new ItemSetProvider());
			pma.getProviders().setInventoryProvider(new GInventoryProvider());
			pma.getProviders().setMountsProvider(new GMountProvider());
		}else 
		if(gameClientStrategy == GameClientStrategies.WakfuClientStrategy){
			//TODO : Wakfu Providers
			pma.getProviders().setLoginServerProvider(new WakfuLServerProvider());
			pma.getProviders().setGameServerProvider(new WakfuGameServerProvider());
		}
		
	}
	

}
