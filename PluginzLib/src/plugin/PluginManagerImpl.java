package plugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import plugin.event.Event;
import plugin.event.EventInformation;
import plugin.event.EventType;
import plugin.event.PluginListener;
import ZPlug.MiscEvent;
import fr.inewemu.logger.Logger;
import fr.inewemu.logger.LoggerFactory;
import fr.inewemu.logger.utils.Color;


public final class PluginManagerImpl implements PluginManager {

    private static Logger logger = LoggerFactory.getLogger("PluginLoader");
    private static Logger error = LoggerFactory.getLogger("PluginLoader_Error");

    
    private Map<String, Plugin> enablePlugins = new HashMap<String, Plugin>(20);
    private Map<String, Plugin> disablePlugins = new HashMap<String, Plugin>(20);

    private Map<EventType, List<PluginListener>> events = new HashMap<EventType, List<PluginListener>>(10);

    public PluginManagerImpl() {

    }

    public PluginManagerImpl(PluginManager manager) {

    }
    
    

    @Override
    public void addPlugin(Plugin plugin) {
        if (enablePlugins.containsValue(plugin) || disablePlugins.containsValue(plugin)) {
            error.error(Color.RED_LIGHT, "Plugin already loaded (plugin : \"{}\"", plugin.getInformation().getName());
            return;
        }
        disablePlugins.put(plugin.getInformation().getName(), plugin);
    }

    @Override
    public boolean pluginExists(String name) {
        return enablePlugins.containsKey(name) || disablePlugins.containsKey(name);
    }

    @Override
    public Plugin getPlugin(String name) {
        if (enablePlugins.containsKey(name)) {
            return enablePlugins.get(name);
        } else if (disablePlugins.containsKey(name)) {
            return disablePlugins.get(name);
        }
        return null;
    }

    @Override
    public boolean pluginIsEnable(Plugin plugin) {
        return enablePlugins.containsValue(plugin);
    }

    @Override
    public boolean pluginIsDisable(Plugin plugin) {
        return disablePlugins.containsValue(plugin);
    }

    @Override
    public void enablePlugin(Plugin plugin) {
        if (enablePlugins.containsValue(plugin)) {
            error.error(Color.RED_LIGHT, "Plugin already enabled (plugin : \"{}\"", plugin.getInformation().getName());
            return;
        }
        enablePlugins.put(plugin.getInformation().getName(), plugin);
        disablePlugins.remove(plugin.getInformation().getName());
        plugin.onEnable();
    }


	@Override
	public void enablePlugin(String pluginName) {
		if (enablePlugins.containsValue(getPlugin(pluginName))) {
            error.error(Color.RED_LIGHT, "Plugin already enabled (plugin : \"{}\"", getPlugin(pluginName).getInformation().getName());
            return;
        }
        enablePlugins.put(getPlugin(pluginName).getInformation().getName(), getPlugin(pluginName));
        disablePlugins.remove(getPlugin(pluginName).getInformation().getName());
        getPlugin(pluginName).onEnable();
	}

	@Override
	public void enablePluginWithoutNotice(String pluginName) {
		if (enablePlugins.containsValue(getPlugin(pluginName))) {
            error.error(Color.RED_LIGHT, "Plugin already enabled (plugin : \"{}\"", getPlugin(pluginName).getInformation().getName());
            return;
        }
        enablePlugins.put(getPlugin(pluginName).getInformation().getName(), getPlugin(pluginName));
        disablePlugins.remove(getPlugin(pluginName).getInformation().getName());
        //getPlugin(pluginName).onEnable(); -> this is the notice I remove.
	}
    
    @Override
    public void disablePlugin(Plugin plugin) {
        if (disablePlugins.containsValue(plugin)) {
            error.error(Color.RED_LIGHT, "Plugin already disabled (plugin : \"{}\"", plugin.getInformation().getName());
            return;
        }
       // if(plugin == null){
        //	Zen.debug("disablePlugin - plugin == null");
        //}
        disablePlugins.put(plugin.getInformation().getName(), plugin);
        enablePlugins.remove(plugin.getInformation().getName());
        plugin.onDisable();
    }
    
    public void disablePlugin(String pluginName) {
    	if (disablePlugins.containsValue(getPlugin(pluginName))) {
            error.error(Color.RED_LIGHT, "Plugin already disabled (plugin : \"{}\"", getPlugin(pluginName).getInformation().getName());
            return;
        }
       // if(getPlugin(pluginName) == null){
        //	Zen.debug("disablePlugin - plugin == null");
        //}
        disablePlugins.put(getPlugin(pluginName).getInformation().getName(), getPlugin(pluginName));
        enablePlugins.remove(getPlugin(pluginName).getInformation().getName());
        getPlugin(pluginName).onDisable();
    }

    @Override
    public void disableAllPlugin() {
        for (Plugin plugin : enablePlugins.values()) {
            plugin.onDisable();
        }
        disablePlugins.putAll(enablePlugins);
        enablePlugins.clear();
    }

    @Override
    public void registerEvent(EventType event, PluginListener listener) {
    	//Zen.debug("aliskrjgujneargu");
    	//for(EventType et : this.getEvents().keySet()){
		//	Zen.debug("this.registerEvent AVANT : "+et.toString());
		//}
        if (!events.containsKey(event)) {//cr�e la key mapping
            events.put(event, new ArrayList<PluginListener>(10));
        }
        if (!events.get(event).contains(listener)) {//met le listener dans le mapping pr�c�dent
            events.get(event).add(listener);
        }
       // for(EventType et : this.getEvents().keySet()){
		//	Zen.debug("this.registerEvent APRES : "+et.toString());
		//}
    }

    @Override
    public void removeEvent(EventType event, PluginListener listener) {
        if (!events.containsKey(event)) {
            return;
        }
        if (events.get(event).contains(listener)) {
            events.get(event).remove(listener);
        }
    }

    @Override
    public EventInformation callEvent(EventType event, Object source) {
        EventInformation information = new EventInformation();
        callEvent(event, source, information);
        return information;
    }

    @Override
    public Event callEvent(EventType eventType, Object source, EventInformation information) {
    	if (!events.containsKey(eventType)) {
            return new Event(MiscEvent.NO_EVENT, null, null);
        }
        for (PluginListener listener : events.get(eventType)) {
            if (information.isCancel()) {
                return new Event(MiscEvent.NO_EVENT, null, null);
            }
            return listener.execute(new Event(eventType, source, information));
        }
		return null;
    }
    
    @Override
    public Event callEvent(Event event){
    	if (!events.containsKey(event.getEventType())) {
            //System.out.println("go no event");
            return new Event(MiscEvent.NO_EVENT, null, null);
        }
        for (PluginListener listener : events.get(event.getEventType())) {
            if (event.getInformation().isCancel()) {
                //System.out.println("go is cancel");
                return new Event(MiscEvent.NO_EVENT, null, null);
            }
           // System.out.println("go execute "+listener.toString());
            listener.execute(event);
        }
       // System.out.println("go return null");
        return null;
    }

    @Override
    public Map<String, Plugin> getEnablePlugins() {
        return new HashMap<String, Plugin>(enablePlugins);
    }

    @Override
    public Map<String, Plugin> getDisablePlugins() {
        return new HashMap<String, Plugin>(disablePlugins);
    }

    @Override
    public Map<EventType, List<PluginListener>> getEvents() {
        return new HashMap<EventType, List<PluginListener>>(events);
    }

    
    
    public static Logger getLogger() {
        return logger;
    }

    public static Logger getErrorLogger() {
        return error;
    }

    public static void setLogger(Logger logger) {
        PluginManagerImpl.logger = logger;
    }

    public static void setErrorLogger(Logger error) {
        PluginManagerImpl.error = error;
    }

	@Override
	public void removePlugin(String pluginName) {
		 if (enablePlugins.containsKey(pluginName)) {
			 enablePlugins.remove(pluginName);
	     } else if (disablePlugins.containsKey(pluginName)) {
	    	 disablePlugins.remove(pluginName);
	     }
	}

	@SuppressWarnings("unused")
	@Override
	public void clearAllPlugins() {
		for(Plugin  p: enablePlugins.values()){
			p = null;
		}
		for(Plugin  p2: disablePlugins.values()){
			p2 = null;
		}
		for(List<PluginListener>  e: events.values()){
			e = null;
		}
		events.clear();
		enablePlugins.clear();
		disablePlugins.clear();
	}

}
