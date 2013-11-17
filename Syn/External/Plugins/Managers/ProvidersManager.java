package Plugins.Managers;

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
import Providers.GameServerProvider;
import Providers.IAProvider;
import Providers.ItemSetProvider;
import Providers.LoginServerProvider;

public class ProvidersManager {
	

	//XXX ATTENTION : Les providers sont instanciés depuis le PluginProviders !!!
	
	protected LoginServerProvider loginServerProvider;
	protected GameServerProvider gameServerProvider;
	
	//protected GameResultProvider gameResults = new GameResultProvider();
	protected GMonsterProvider monsters = null; 
	protected GPersonnageProvider personnages = null; 
	protected GMonsterGroupProvider monsterGroups = null;
	protected GDropItemProvider dropItems = null;
	protected GItemProvider items = null;
	protected IAProvider intelligences = null;
	protected GBuffProvider buffs = null;
	protected GDropProvider drops = null;
	protected GEffectProvider effects = null;
	protected GSpellProvider spells = null;
	protected ItemSetProvider itemSets = null;
	protected GInventoryProvider inventories = null;
	protected GMountProvider mounts = null;

	
	//public GameResultProvider provideGameResult() {
	//	return gameResults;
	//}

	public GMonsterProvider provideMonster() {
		return monsters;
	}
	public GPersonnageProvider providePerso() {
		return personnages;
	}
	public GMonsterGroupProvider provideMonsterGroup() {
		return monsterGroups;
	}
	public GDropItemProvider provideDropItem() {
		return dropItems;
	}
	public GItemProvider provideItem(){
		return items;
	}
	public IAProvider provideIA(){
		return intelligences;
	}
	public GBuffProvider provideBuff(){
		return buffs;
	}
	public GDropProvider provideDrop() {
		return drops;
	}
	public GEffectProvider provideEffect() {
		return effects;
	}
	public GSpellProvider provideSpell(){
		return spells;
	}
	public ItemSetProvider provideItemSet(){
		return itemSets;
	}
	public GInventoryProvider provideInventory() {
		return inventories;
	}
	public GMountProvider provideMount() {
		return mounts;
	}
	public LoginServerProvider provideLoginServer() {
		return loginServerProvider;
	}
	public GameServerProvider provideGameServer(){
		return gameServerProvider;
	}
	
	
	public void setMonstersProvider(GMonsterProvider monsters){
		this.monsters = monsters;
	}
	public void setPersonnagesProvider(GPersonnageProvider personnages){
		this.personnages = personnages;
	}
	public void setMonsterGroupsProvider(GMonsterGroupProvider monsterGroups){
		this.monsterGroups = monsterGroups;
	}
	public void setDropItemsProvider(GDropItemProvider dropItems){
		this.dropItems = dropItems;
	}
	public void setItemsprovider(GItemProvider items){
		this.items = items;
	}
	public void setIAProvider(IAProvider ias){
		this.intelligences = ias;
	}
	public void setBuffsProvider(GBuffProvider buffs){
		this.buffs = buffs;
	}
	public void setDropsProvider(GDropProvider drops){
		this.drops = drops;
	}
	public void setEffectsProvider(GEffectProvider effects){
		this.effects = effects;
	}
	public void setSpellsProvider(GSpellProvider spells){
		this.spells = spells;
	}
	public void setItemSetsProvider(ItemSetProvider itemSets){
		this.itemSets = itemSets;
	}
	public void setInventoryProvider(GInventoryProvider inventories) {
		this.inventories = inventories;
	}
	public void setMountsProvider(GMountProvider mounts){
		this.mounts = mounts;
	}
	public void setLoginServerProvider(LoginServerProvider lServerProvider) {
		this.loginServerProvider = lServerProvider;
	}
	public void setGameServerProvider(GameServerProvider gServerProvider) {
		this.gameServerProvider = gServerProvider;
	}
	
	public void unload() {
		monsters = null; 
		personnages = null; 
		monsterGroups = null;
		dropItems = null;
		items = null;
		intelligences = null;
		buffs = null;
		drops = null;
		effects = null;
		spells = null;
		itemSets = null;
		inventories = null;
		mounts = null;
		loginServerProvider = null;
		gameServerProvider = null;
	}
	
	
	//XXX ATTENTION : Les providers sont instanciés depuis le PluginProviders !!!
	
}
