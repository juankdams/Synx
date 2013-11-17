package parsers.dofus;

import plugin.PluginManager;
import plugin.event.EventInformation;
import Core.Syn;
import Enums.i18n;
import Game.DofusGameClient;
import ZPlug.ConsoleEvent;

public class ConsoleParser{

	
	
	public static boolean parse(DofusGameClient c, String msg){
		//Syn.d("command = "+msg);
		//Mon nouveau systeme de commandes :)

		PluginManager pm = c.getServer().getPlugins().getPluginManager();
		if(pm.getPlugin("Console") == null && c.getServer().getConfig().isUseDefaultPlugins()){
			pm = c.getServer().getPluginsManager().plugins.getPluginManager();
		}
		if(pm.getPlugin("Console") != null && msg.length() >= 2 && c.getAccount().getGM() > 0){
			EventInformation information = new EventInformation();
			if(msg.indexOf(" ") != -1){
				information.set("command", msg.substring(0, msg.indexOf(" ")) );
				information.set("msg", msg.substring(msg.indexOf(" ")+1, msg.length()));
			}else{
				information.set("command", msg.substring(0, msg.length()));
				information.set("msg", "nullmsg");
			}
		    information.set("perso", c.getAccount().getCurPerso());
		   // information.set("servID", Syn.gameServers[0].getID());
	    	//Syn.d("dans ConsoleParser");
		    for(ConsoleEvent ce : ConsoleEvent.values()){
		    	if(ce.toString().endsWith("_"+c.getAccount().getGM())){
		    		Syn.d("ConsoleParser = "+ce.toString());
		    		pm.callEvent(ce, ConsoleParser.class, information);
					break;
				}
		    }
		    information = null;
		}else{
			//Syn.d("(" + c.getAccount().getGM() + "), pm.getPlugin(\"Console\") = "+pm.getPlugin("Console")+".");
			SM.Messages.MC(c.getSession(), i18n.GM_LVL_TOO_LOW.getValue(c.getHandler().gServ.getcWorld()) +" (" + c.getAccount().getGM() + "), pm.getPlugin(\"Console\") = "+pm.getPlugin("Console")+".");
		}
		return true;
	}
	
}