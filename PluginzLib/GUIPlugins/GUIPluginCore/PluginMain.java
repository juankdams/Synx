package GUIPluginCore;

import plugin.Plugin;

public abstract class PluginMain extends Plugin{

	
	public abstract PluginDatacenter getDatacenter();
	public abstract PluginUIFactory getUIFactory();
	
	
}
