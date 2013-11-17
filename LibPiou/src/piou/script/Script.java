package piou.script;

import java.io.File;
import java.io.FileReader;
import java.net.URL;

import javax.script.CompiledScript;

import org.apache.commons.io.FileUtils;

import com.sun.script.javascript.RhinoScriptEngine;

public class Script {

	private File file = null;
	private String url = "";
	private String fileName = "";
	private String name = "";
	private String main = "";
	private String[] mainArgs = {""};
	private String version = "";
	private String description = "";
	private CompiledScript preloadScript = null;
	
	public Script(String url, String fileName, String name, String main, String[] mainArgs, String version, String description, boolean precompile){
		this.setUrl(url);
		this.setFileName(fileName);
		this.setName(name);
		this.setMain(main);
		this.setMainArgs(mainArgs);
		this.setVersion(version);
		this.setDescription(description);
		
		try {
			File file = new File(url + fileName);
			if(url.contains("http://")){
				file = new File("Temps_scripts/" + fileName);
				URL u = new URL(url + fileName);
				FileUtils.copyURLToFile(u, file);
			}
			this.setFile(file);
			if(precompile){
				RhinoScriptEngine rse = (RhinoScriptEngine) InterpreterFactory.getFactory().getScript(fileName).getEngine();
				preloadScript = rse.compile(new FileReader(this.file));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Impossible de charger le script: "+name+" à cet endroit: "+url+fileName+".");
		}
	}
	

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getMain() {
		return main;
	}
	public void setMainArgs(String[] mainArgs) {
		this.mainArgs = mainArgs;
	}
	public String[] getMainArgs() {
		return mainArgs;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public File getFile() {
		return file;
	}
	public void setCompiledScript(CompiledScript preloadScript) {
		this.preloadScript = preloadScript;
	}
	public CompiledScript getCompiledScript() {
		return preloadScript;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersion() {
		return version;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public String getExtension(){
		return getFileName().substring(getFileName().indexOf(".")+1);
	}
	
	
	
}
