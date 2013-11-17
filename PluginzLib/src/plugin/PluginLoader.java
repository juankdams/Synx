package plugin;

import plugin.event.Event;

public interface PluginLoader {

    public void loadPlugins(String configName);
    public void loadPlugin(String url, String pluginName, String fileName, String mainClassName, String description, String version, boolean enable, Event[] buildEvents);
    public Plugin loadPlugin(PluginInformation information, boolean enable, Event[] buildEvents);
}
