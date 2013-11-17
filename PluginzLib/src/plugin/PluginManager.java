package plugin;

import java.util.List;
import java.util.Map;

import plugin.event.Event;
import plugin.event.EventInformation;
import plugin.event.EventType;
import plugin.event.PluginListener;

public interface PluginManager {

    public void addPlugin(Plugin plugin);
    public boolean pluginExists(String name);
    public Plugin getPlugin(String name);
    public boolean pluginIsEnable(Plugin plugin);
    public boolean pluginIsDisable(Plugin plugin);
    public void enablePlugin(Plugin plugin);
    public void enablePlugin(String pluginName);
    public void disablePlugin(Plugin plugin);
    public void disablePlugin(String pluginName);
    public void disableAllPlugin();
    public void removePlugin(String pluginName);
    public void clearAllPlugins();
    public void registerEvent(EventType event, PluginListener listener);
    public void removeEvent(EventType event, PluginListener listener);
    public EventInformation callEvent(EventType event, Object source);
    public Event callEvent(EventType event, Object source, EventInformation information);
    public Map<String, Plugin> getEnablePlugins();
    public Map<String, Plugin> getDisablePlugins();
    public Map<EventType, List<PluginListener>> getEvents();
    public Event callEvent(Event event);
	public void enablePluginWithoutNotice(String pluginName);
    
}
