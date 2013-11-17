package plugin;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.io.FileUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import plugin.event.Event;
import fr.inewemu.logger.utils.Color;
import fr.inewemu.utils.exception.ConfigurationNotFoundException;
import fr.inewemu.utils.exception.InvalidJarException;
import fr.inewemu.utils.exception.InvalidPluginException;

public class PluginLoaderImpl implements PluginLoader {

	private Plugins plugins = null;

	public PluginLoaderImpl(Plugins plugins){
		this.plugins = plugins;
	}
	
	
	@Override
	public void loadPlugins(String configName) {
		SAXBuilder builder = new SAXBuilder();
		if (configName == null || configName.isEmpty()) {
			return;
		}
		File config = new File(configName);
		if (!config.exists()) {
			throw new ConfigurationNotFoundException(configName);
		}
		Document document = null;
		try {
			document = builder.build(config);
		} catch (JDOMException ex) {
			throw new RuntimeException(ex);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		Element element = document.getRootElement();
		if (element == null) {
			System.exit(0);
		}
		List<?> plugs = element.getChildren("Plugin");
		for (Object plug : plugs) {
			if (!(plug instanceof Element)) {
				continue;
			}
			Element plugin = (Element) plug;

			String name = plugin.getAttributeValue("Name");
			//Zen.debug("Plugin Name:" + name);
			String version = plugin.getAttributeValue("Version");
			//Zen.debug("Plugin Version:" + version);
			File jar = new File(plugin.getAttributeValue("Jar"));
			//Zen.debug("Plugin Jar:" + jar.getName());
			String description = plugin.getAttributeValue("Description");
			//Zen.debug("Plugin Desc:" + description);
			String main = plugin.getAttributeValue("Main");
			if (name == null || name.isEmpty()) {
				throw new InvalidPluginException("Unnamed plugin");
			} else if (jar == null || !jar.exists()) {
				throw new InvalidJarException(name);
			} else if (main == null || main.isEmpty()) {
				throw new InvalidPluginException("Invalid boot file");
			}
			boolean enable = false;
			if (plugin.getAttributeValue("Enable") != null) {
				enable = plugin.getAttributeValue("Enable").equalsIgnoreCase("true");
			}
			loadPlugin(new PluginInformation(this, name, version, jar,
					description, main), enable, null);
		}
	}

	
	
	
	@Override
	public Plugin loadPlugin(PluginInformation information, boolean enable, Event[] buildEvents) {
		if (information.getJar() == null || !information.getJar().exists()) {
			throw new InvalidJarException(information.getName());
		}
		if (plugins.getPluginManager().pluginExists(information.getName())) {
			Plugins.getErrorLogger().error(
					Color.RED_LIGHT,
					"Plugin already loaded (plugin : \"{}\"",
					information.getName());
			return null;
		}
		File jarFile = information.getJar();
		URLClassLoader loader = null;
		Enumeration<JarEntry> enumeration;
		try {
			loader = new URLClassLoader(new URL[] { jarFile.toURI().toURL() });
		} catch (MalformedURLException ex) {
			throw new RuntimeException(ex);
		}
		JarFile jar = null;
		try {
			jar = new JarFile(jarFile.getAbsolutePath());
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		enumeration = jar.entries();
		Plugin plugin = null;
		while (enumeration.hasMoreElements()) {
			String tmp = enumeration.nextElement().toString();
			if (tmp.length() > 6 && tmp.substring(tmp.length() - 6).compareTo(".class") == 0) {
				tmp = tmp.substring(0, tmp.length() - 6);
				tmp = tmp.replaceAll("/", ".");
				Class<?> tmpClass = null;
				try {
					//System.out.println("tmp:"+tmp);
					//if(tmp.equals(information.getMain())){
						tmpClass = Class.forName(tmp, true, loader);
					//}
				} catch (ClassNotFoundException ex) {
					System.out.println("PluginLoaderImpl.loadPlugin.ClassNotFound: tmp="+tmp);
					throw new RuntimeException(ex);
				} catch(Exception e){
					System.out.println("PluginLoaderImpl.loadPlugin. le forName trew an exception so : className = tmp:"+tmp);
				}
				if (tmpClass != null && tmpClass.getName().toString().equals(information.getMain())) {
					//Zen.debug("if name = main");
					Object obj = null;
					try {
						obj = tmpClass.newInstance();
					} catch (InstantiationException ex) {
						throw new RuntimeException(ex);
					} catch (IllegalAccessException ex) {
						throw new RuntimeException(ex);
					}
					if (obj != null && obj instanceof Plugin) {
						//Zen.debug("obj:instanceof Plugin");
						plugin = (Plugin) obj;
					}
				}
			}
		}
		if (plugin != null) {
			plugin.setInformation(information);
			plugins.getPluginManager().addPlugin(plugin);
			plugin.setPluginManager(plugins.getPluginManager());
			plugin.onLoad();
			if(buildEvents != null && buildEvents.length != 0){
				for(Event e : buildEvents){
					plugins.getPluginManager().callEvent(e);
				}
			}
			if (enable) {
				plugins.getPluginManager().enablePlugin(plugin);
			}
			return plugin;
		}
		//Zen.debug("return NULL");
		return null;
	}


	@Override
	public void loadPlugin(String url, String pluginName, String fileName, String mainClassName, String description, String version, boolean enable, Event[] buildEvent) {
		File file = null;
		if(url.contains("http://")){
			try {
				file = new File("Temp_plugins/" +fileName);
				URL u = new URL(url + fileName);
				FileUtils.copyURLToFile(u, file);
			} catch (MalformedURLException e) { e.printStackTrace(); } 
			  catch (IOException e) { e.printStackTrace(); }
		}else{
			file = new File(url + fileName);
		}
		  
		if (pluginName == null || pluginName.isEmpty()) {
			throw new InvalidPluginException("Unnamed plugin");
		} else if (file == null || !file.exists()) {
			throw new InvalidJarException("Invalid plugin file");
		} else if (mainClassName == null || mainClassName.isEmpty()) {
			throw new InvalidPluginException("Invalid main class");
		}
		loadPlugin(new PluginInformation(this, pluginName, version, file,
				description, mainClassName), enable, buildEvent);
	}

	
	
	
	
	
	
	
}
