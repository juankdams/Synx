package plugin;

import javax.swing.JFrame;

public abstract class Plugin {

    private PluginInformation information;
    private PluginManager pluginManager;

    public Plugin() {

    }

    public abstract void onLoad();
    public abstract void onEnable();
    public abstract void onDisable();
    public abstract void unload();
    public abstract void registerEvents();
    public abstract void unRegisterEvents();
    /**
     * @return - La mainFrame d'une mainWindow dans une application GUI (Par exemple mon C-Tools ;) ) 
     */
    public JFrame getMainUIFrame(){
    	return null;
    }
    //public abstract void reloadPlugin();

    public final PluginInformation getInformation() {
        return information;
    }

    final void setInformation(PluginInformation information) {
        this.information = information;
    }

    public final PluginManager getPluginManager() {
        return pluginManager;
    }

    final void setPluginManager(PluginManager pluginManager) {
        this.pluginManager = pluginManager;
    }

}