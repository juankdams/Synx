package plugin;

import java.io.File;

public final class PluginInformation {

    private final PluginLoader loader;
    private final String name;
    private final String version;
    private final File jar;
    private final String description;
    //private final PluginConfiguration config;
    private final String main;
    
    public PluginInformation(PluginLoader loader, String name, String version, File jar, String description, String main) {
        this.loader = loader;
        this.name = name;
        this.version = version;
        this.jar = jar;
        this.description = description;
        this.main = main;
        //this.config = new PluginConfiguration(this, config);
    }

    public PluginLoader getLoader() {
        return loader;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public File getJar() {
        return jar;
    }

    public String getDescription() {
        return description;
    }

    //public PluginConfiguration getConfig() {
    //    return config;
   // }

    public String getMain() {
        return main;
    }

}
