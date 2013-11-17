package plugin;

import fr.inewemu.logger.Logger;
import fr.inewemu.logger.LoggerFactory;

public final class Plugins {

    private static Logger logger = LoggerFactory.getLogger("Plugins");
    private static Logger error = LoggerFactory.getLogger("Error_Plugins");

    private PluginManager manager = new PluginManagerImpl();
    private PluginLoader loader = new PluginLoaderImpl(this);

    public Plugins() {

    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        Plugins.logger = logger;
    }

    public static Logger getErrorLogger() {
        return error;
    }

    public static void setErrorLogger(Logger error) {
        Plugins.error = error;
    }

    public PluginManager getPluginManager() {
        return manager;
    }

    public PluginManager getPluginManager(Logger logger, Logger error) {
        return manager;
    }

    public void setPluginManager(PluginManager Manager) {
       manager = Manager;
    }

    public PluginLoader getPluginLoader() {
        return loader;
    }
    
    /** Same as Plugins.getPluginLoader().loadPlugins(configName) */
    public void loadPlugins(String configName) {
        loader.loadPlugins(configName);
    }

    public PluginLoader getPluginLoader(Logger logger, Logger error) {
        return loader;
    }

    public void setPluginLoader(PluginLoader loader) {
    	this.loader = loader;
    }

}
