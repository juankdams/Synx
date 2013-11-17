package pack;

import static Constants.Constants.isNumberPattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.mina.core.session.IoSession;

import piou.script.Script;
import piou.scripts.ExecutableScript;
import plugin.Plugin;
import plugin.event.Event;
import plugin.event.PluginListener;
import Abstractions.AbstractCharacter;
import Constants.CWorld;
import Core.Syn;
import Enums.CharacteristicType;
import Enums.SynActions;
import Enums.SynActions.MapAction;
import Enums.SynActions.SchedulingA;
import Enums.i18n;
import Game.DofusGameClient;
import Game.GameServer;
import GameClientStrategies.GameClientStrategies;
import GameObjects.GAction;
import GameObjects.GItem;
import GameObjects.GMonsterGroup;
import GameObjects.GMonsterGroup.MonsterGroupType;
import GameObjects.GPersonnage;
import GameObjects.GSpell;
import GameObjects.GStatistiques.CharacteristicColumn;
import GameObjects.GWorld;
import GlobalObjects.Map;
import Interfaces.IMap.Trigger;
import Interfaces.ISprite;
import Login.LoginServer;
import LoginObjects.LAccount;
import Misc.CodeInput;
import Misc.Utils;
import NewThreads.Task;
import Plugins.Abstractions.AbstractMacro;
import Plugins.Managers.PluginsManager;
import SQL.SConfig;
import ZPlug.ConsoleEvent;
import ZPlug.MiscEvent;


public class ConsoleListener implements PluginListener{

	public Console main = null;
	public ConsoleListener(Console main){
		this.main = main;
	}
	
	public void initiateActionListenersAlias(){
		//Exemple v
		//ActionsManager.putActionListenerAlias("OM", "ON_ITEM_MOVEMENT");
	}
	
	@Override
	public Event execute(Event event) {
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			main.pm = (PluginsManager) event.getSource();
			return event;
		}
		if(event.getEventType() == MiscEvent.Load_Plugins_ActionListenersAlias){
			this.initiateActionListenersAlias();	
			return event;
		}
		
		GMCommand gmc = null;
		String msg = "";
		GPersonnage p = null;
		Syn.d("dans ConsoleListener");
		Syn.d("command = "+event.getInformation().get("command").toString()+"  msg = "+event.getInformation().get("msg"));
		
		if(event.getInformation().get("command") != null){
			for(GMCommand cc : GMCommand.values()){
				if(cc.toString().equalsIgnoreCase(event.getInformation().get("command").toString())){
					gmc = cc;
					break;
				}
			}
		}
		if(event.getInformation().get("msg") != null){
			msg = event.getInformation().get("msg").toString().trim();
			if(msg.equalsIgnoreCase("nullmsg")){
				msg = null;
			}
		}
		if(event.getInformation().get("perso") != null){
			p = (GPersonnage) event.getInformation().get("perso");
		}
		boolean done = false;
		if(p != null){
			if(gmc == null){
				SM.Basics.BAT_FAIL(p.getClient().getSession(), i18n.COMMAND_NOT_EXISTS.getValue(p.getServer().getcWorld()));
				done = true;
			}else if(p.getAccount().getGM() < gmc.getGMlvl()){
				SM.Basics.BAT_FAIL(p.getClient().getSession(), i18n.GM_LVL_TOO_LOW.getValue(p.getServer().getcWorld()) +" (" + p.getAccount().getGM() + ")");
				done = true;
			}
			if(done){
				gmc = null;
				msg = null;
				p = null;
				return null;
			}
		}
		
		
		switch((ConsoleEvent)event.getEventType()){
			case GM_10:
				switch(gmc){
					case SETLAYER:{
							if(msg == null){
								SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ layerID ]");
							}else{
								if(Pattern.matches(isNumberPattern, msg)){
									byte newlayer = Byte.parseByte(msg);
									//Enleve le perso de l'ancienne map
									p.getMap().updateSpriteList(SynActions.MapAction.REMOVE_SPRITE, p);
									p.setLayer(newlayer);
									//Ajoute le perso à la nouvelle map
									//GlobalWorld.getMap(p.getgWorld(), mapID).updateCharacterList(SynActions.MapAction.ADD_CHARACTER, p);
									SM.Game.GDM(p.getClient().getSession(), p.getMap());
								}
							}
						}
						done = true;
						break;
					case KICK:
						GPersonnage t = p.getWorld().getPersoByName(msg);
						if(t == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), "Personnage null");
						}else{
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "ID du perso visé : "+t.getID());
							t.getClient().kick();
						}
						done = true;
						break;
					case LAYER:{
							String strid = msg;
							int layer = Integer.MAX_VALUE;
							if(strid == null){
								layer = p.getLayer();
								strid = "Ton layer = ";
							}else if(Pattern.matches(isNumberPattern, strid)){
								ISprite s = p.getMap().getSprite(Integer.parseInt(strid));
								if(s != null){
									layer = s.getLayer();
									strid = "Le layer de ("+s.getID()+") = ";
								}
							}
							if(layer != Integer.MAX_VALUE){
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), strid+layer);
							}else{
								SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ spriteID ]");
							}
						}
						done = true;
						break;
					case RESPAWN:
						{
							Map m = p.getMap();
							GWorld w = p.getWorld();
							ArrayList<GMonsterGroup> instances = new ArrayList<GMonsterGroup>();
							//ArrayList<ISprite> sprites = m.updateSpriteList(MapAction.GET_SPRITES, null);//m.updateSpriteList(MapAction.GET_SPRITES, null);
							//ArrayList<ISprite> newsprites = new ArrayList<ISprite>(sprites.size());//m.updateSpriteList(MapAction.GET_SPRITES, null);
							List<ISprite> spritesCopy = m.getSpritesSynchroCopy();
							for(ISprite s : spritesCopy){
								if(s instanceof GMonsterGroup){
									GMonsterGroup mg = (GMonsterGroup) s;
									if(mg.getType() != MonsterGroupType.SUBAREA_GENERATED){
										instances.add(mg);
									}else{
										m.updateSpriteList(MapAction.REMOVE_SPRITE, mg);
									}
								}
							}
							//sprites.clear();
							//sprites.addAll(instances);
							//sprites.addAll(newsprites);
							
							//Génération / Spawn des groupes de monstres aléatoires par subareas.
							for(int i = m.getSubArea(w).maxNumberOfGroups-1; i >= instances.size(); i--){
								GMonsterGroup mg = m.getSubArea(w).generateRandomMonsterGroup(w);
								mg.attachToMap(m, main.pm.getFormulingManager().getFreeCellRandom(m));
								m.updateSpriteList(MapAction.ADD_SPRITE, mg);
							}
						}
						done = true;
						break;
					case MACRO:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ characterID , targetCharacterID , macroName ]");
						}else{
							String[] args = msg.split(" ");
							if(args.length == 3 && Pattern.matches(isNumberPattern, args[0]) && Pattern.matches(isNumberPattern, args[1])){
								int charid = Integer.parseInt(args[0]);
								int targetcharid = Integer.parseInt(args[1]);
								short macroID = Short.parseShort(args[2]);
								AbstractCharacter ac = (AbstractCharacter) p.getMap().getSprite(charid);
								AbstractCharacter tac = (AbstractCharacter) p.getMap().getSprite(targetcharid);
								AbstractMacro am = main.pm.getMacroManager().getMacros().get(macroID);
								if(am != null) am.execute(ac, tac);
								else Syn.d("AbstractMacro null à l'exécution, ID non-trouvé dans l'hashmap de macros.");
							}else{
								SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ characterID , targetCharacterID , macroName ]");
							}
						}
						done = true;
						break;
					case TERMINATE_PERSO_CLIENT:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ persoID ]");
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								short id = Short.parseShort(msg);
								if(id != p.getID()){
									try {
										DofusGameClient c = p.getWorld().getPerso(id).getClient();
										c.terminate();
										c = null;
										SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Client terminaté!");
									} catch (Throwable e) {
										e.printStackTrace(); 
										SM.Basics.BAT_FAIL(p.getClient().getSession(), "Une exception a été levée pendant la terminatisation. Terminatisation annulé.");
									}
								}else{
									SM.Basics.BAT_FAIL(p.getClient().getSession(), "Vous ne pouvez vous terminater vous-même.");
								}
							}
						}
						done = true;
						break;
					case DEBUFF:
						p.setBuffs(null);
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Tu es complètement débuffé.");
						done = true;
						break;
					case LAUNCHSPELL:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ spellID cellID ]");
						}else{
							String[] args = msg.split(" ");
							if(Pattern.matches(isNumberPattern, args[0]) && Pattern.matches(isNumberPattern, args[1])){
								short spellid = Short.parseShort(args[0]);
								short cellid = Short.parseShort(args[1]);
								boolean success = main.pm.getActionsManager().apply(p, spellid, cellid, new GAction(p.getWorld().getNextActionID(), (short) 300, new Object()));
								if(success){
									SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Tu as lancé le sort "+spellid+" sur la cellule "+cellid+".");
								}else{
									SM.Basics.BAT_NEUTRAL(p.getClient().getSession(), "Impossible de lancer ce sort sur cette cellule.");
								}
							}
						}
						done = true;
						break;
					case LEARNSPELL:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ spellToLearnID ]");
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								short id = Short.parseShort(msg);
								if(p.getSpellByID(id) == null){
									GSpell[] ss = p.getWorld().getSpell(id);
									p.setSpellByID(ss[0], id);
									SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Tu as apprit le sort ID=("+id+")");
								}else{
									SM.Basics.BAT_NEUTRAL(p.getClient().getSession(), "Tu connais déjà ce sort.");
								}
							}
						}
						done = true;
						break;
					case CREATEDEFAULTACCOUNTS:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [ nombreDeComptesÀCréer ]");
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								int nbr = Integer.parseInt(msg);
								//p.getWorld().getNextPersoID()
								
								int min = SQL.Accounts.loadLastAccountID(p.getServer().getLoginServer().world);
								for(int i = nbr; i > 0; i--){
									//public LAccount(int id, String username, String password, String pseudo, String secretQuestion, String secretAnswer, byte gmlvl, byte community, String curIP, boolean isBanned, long premiumTime, int giftID, GPersonnage persoss[], String bankss, String friendsIDs[], String ennemiesIDs[], String ignoredIDs[]){
									LAccount a = new LAccount(p.getServer().getLoginServer(), min+i, "test"+(min+i), "test"+(min+i), "test"+(min+i), "test"+(min+i), "test"+(min+i), (byte) 10, CWorld.communities.get(0).id, "", false, Long.MAX_VALUE, 0, null, "", null, null, null);
									SQL.Accounts.create(a);
								}
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "X ("+nbr+") Comptes créés à partir de l'ID ("+(min+1)+") jusqu'à ("+(min+nbr)+").");
							}
						}
						done = true;
						break;
					case TEMPTRIGGER:
						if(p.getMap().getTrigger(p.getCellID()) != null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), "Il y a déjà un trigger sur cette cell");
						}else{
							Trigger tr = new Trigger();
							tr.cell = p.getCellID();
							tr.map = p.getMapID();
							tr.ID = p.getWorld().getNextActionID();//TODO juste en attendant,, trigger.ID = p.getWorld().getNextActionID();
							tr.targetMap = Integer.parseInt(msg.substring(0, msg.indexOf(" ")));
							tr.targetCell = Short.parseShort(msg.substring(msg.indexOf(" ")+1));
							if(p.getMap().getTriggers() == null){
								p.getMap().setTriggers(new ArrayList<Trigger>());
							}
							p.getMap().getTriggers().add(tr);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Trigger temporaire ajouté ! TargetMap ="+tr.targetMap+".  TargetCell="+tr.targetCell+".");
						}
						done = true;
						break;
					case EXE:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [  Package.Class.method(ParamClass param, Param2Class param2) ]");
						}else{
							Object o = CodeInput.callMethod(msg);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "----MethodInvoking done----");
							if(o == null){
								SM.Basics.BAT_FAIL(p.getClient().getSession(), "AUCUN RÉSULTAT: ");
							}else if(o.getClass() != null){
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "RÉSULTAT: "+o.getClass().getName()+"="+o);
							}else{
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "RÉSULTAT: "+o);
							}
						}
						done = true;
						break;
					case SENDMULT:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [packet1 packet2 packet3 ...  (Pour envoyer de multiples packets en un)]");
						}else{
							String[] packets = msg.split(" ");
							StringBuilder total = new StringBuilder();
							for(String s : packets){
								if(total.length() != 0){
									total.append('\u0000');
								}
								total.append(s);
							}
							SM.Sender.send(p.getClient().getSession(), total.toString());
						}
						done = true;
						break;
					case EXIT:
						ExecutableScript exitScript = null;
						for(ExecutableScript s : p.getServer().getScripts()){
							if(s.getName().equals("Exit")){
								exitScript = s;
							}else if(exitScript != null){
								continue;
							}
						}
						if(exitScript != null){
							Syn.w("Commande exit : lance une Task lancant le script d'Exit");
							Task<Object> task = p.getServer().threadsManager.getTaskFactory().newScriptingTask(exitScript, p.getServer());
							p.getServer().threadsManager.executeDirectTask(task);
						}else{
							Syn.w("Commande exit : System.exit(0);");
							System.exit(0);
						}
						//Syn.closeAll(true);
						//try {
						//	Syn.main(null);
						//} catch (Exception e2) { e2.printStackTrace(); }
						done = true;
						break;
					case REBOOT:
						try {
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Reboot lancé!");
							p.getServer().reboot();
						} catch (Exception e2) { e2.printStackTrace(); }
						done = true;
						break;
					case GETSCRIPTINFOS:
						String out = "Script List Size : "+p.getServer().getScripts().size();
						for(Script s : p.getServer().getScripts()){
							out += "\n";
							out += "Name: " + s.getName() + ". Desc:" + s.getDescription();
						}
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), out);
						done = true;
						break;
					case STOPALLSCRIPTS:
						for(ExecutableScript s : p.getServer().getScripts()){
							s.getFuture().cancel(true);
							Syn.d("isCancelled("+s.getFuture().isCancelled()+")  isDone("+s.getFuture().isDone()+")");
							s = null;
						}
						p.getServer().getScripts().clear();
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Scripts tous cancellés et nullifiés et clearés !");
						done = true;
						break;
					case RELOADSCRIPT:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else
						if(msg.equalsIgnoreCase("ALL")){
							for(ExecutableScript s : p.getServer().getScripts()){
								if(s.getFuture() != null){
									s.getFuture().cancel(true);
									Syn.d("isCancelled("+s.getFuture().isCancelled()+")  isDone("+s.getFuture().isDone()+")");
								}
								s = null;
							}
							p.getServer().getScripts().clear();
							SConfig.loadScripts(p.getWorld(), null);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Scripts tous rechargés !");
						}else{
							boolean worked = SConfig.loadScripts(p.getWorld(), msg);
							if(worked){
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Scripts "+msg+" rechargé !");
							}
							if(worked == false){
								SM.Basics.BAT_FAIL(p.getClient().getSession(), "Script introuvable.");
							}
						}
						done = true;
						break;
					case REEVALSCRIPT:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else
						if(msg.equalsIgnoreCase("default.ALL")){
							for(GameClientStrategies gcs : GameClientStrategies.values()){
								for(ExecutableScript s : gcs.get().scripts){
									s.reEval();
								}
							}
							//for(ExecutableScript s : Syn.Services.scripts){
							//	s.reEval();
							//}
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Scripts par défaut de Syn tous ré-évalués !");
						}else
						if(msg.equalsIgnoreCase("game.ALL")){
							for(ExecutableScript s : p.getServer().getScripts()){
								s.reEval();
							}
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Scripts du GameServer tous ré-évalués !");
						}
						done = true;
						break;
					case RELOADPLUG:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else
						if(msg.equalsIgnoreCase("default.ALL")){
							for(GameClientStrategies gcs : GameClientStrategies.values()){
								for(Plugin plug : gcs.get().defaultPluginsManager.plugins.getPluginManager().getEnablePlugins().values()){
									plug.unload();
								}
								for(Plugin plug : gcs.get().defaultPluginsManager.plugins.getPluginManager().getDisablePlugins().values()){
									plug.unload();
								}
								gcs.get().defaultPluginsManager.plugins.getPluginManager().clearAllPlugins();
							}
							//for(Plugin plug : Syn.Services.defaultPluginsManager.plugins.getPluginManager().getEnablePlugins().values()){
							//	plug.unload();
							//}
							//for(Plugin plug : Syn.Services.defaultPluginsManager.plugins.getPluginManager().getDisablePlugins().values()){
							//	plug.unload();
							////}
							//Syn.Services.defaultPluginsManager.plugins.getPluginManager().clearAllPlugins();
							System.gc();
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins déchargés !");
							SConfig.loadPlugins(null, null);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins chargés !");
						}else
						//if(Syn.Services.defaultPluginsManager.plugins.getPluginManager().getPlugin("default."+msg) != null){
						//	Syn.Services.defaultPluginsManager.plugins.getPluginManager().getPlugin(msg).unRegisterEvents();
						//	Syn.Services.defaultPluginsManager.plugins.getPluginManager().getPlugin(msg).unload();
						//	Syn.Services.defaultPluginsManager.plugins.getPluginManager().removePlugin(msg);
						//	System.gc();
						//	SConfig.loadPlugins(null, msg);
						//	SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins "+msg+" rechargé !");
						//}else
						if(msg.equalsIgnoreCase("game.ALL")){
							for(Plugin plug : p.getServer().getPlugins().getPluginManager().getEnablePlugins().values()){
								plug.unload();
							}
							for(Plugin plug : p.getServer().getPlugins().getPluginManager().getDisablePlugins().values()){
								plug.unload();
							}
							p.getServer().getPlugins().getPluginManager().clearAllPlugins();
							System.gc();
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins déchargés !");
							SConfig.loadPlugins(p.getWorld(), null);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins chargés !");
						}else
						if(p.getServer().getPlugins().getPluginManager().getPlugin("game."+msg) != null){
							p.getServer().getPlugins().getPluginManager().getPlugin(msg).unRegisterEvents();
							p.getServer().getPlugins().getPluginManager().getPlugin(msg).unload();
							p.getServer().getPlugins().getPluginManager().removePlugin(msg);
							System.gc();
							SConfig.loadPlugins(p.getWorld(), msg);
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Plugins "+msg+" rechargé !");
						}else{
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.PLUGIN_NOT_EXISTS.getValue(p.getServer().getcWorld())+" Veuillez spécifier \"default.\" ou \"game.\" suivit de \"ALL\" ou le nom d'un plugin précis à recharger");
						}
						done = true;
						break;
					case GETMEM:
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), new StringBuffer().append("freeMemory: ").append(Runtime.getRuntime().freeMemory()/1024/1024).append(" Mo.   maxMemory: ").append(Runtime.getRuntime().totalMemory()/1024/1024).append(" Mo.   usedMemory: ").append(Runtime.getRuntime().totalMemory()/1024/1024 - Runtime.getRuntime().freeMemory()/1024/1024).append(" Mo").toString());
						done = true;
						break;
					case GC:
						long before = Runtime.getRuntime().freeMemory()/1024/1024;
						System.runFinalization();
						System.gc();
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), new StringBuffer().append("Memoire libérée par le gc : ").append(Runtime.getRuntime().freeMemory()/1024/1024 - before).append(" Mo.").toString());
						done = true;
						break;	
					case LOAD:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
							done = true;
							break;
						}
						if(msg.equalsIgnoreCase("gconf") || msg.equalsIgnoreCase("gconfig")){
							SConfig.load(p.getServer());
						}else if(msg.toLowerCase().startsWith("table:")){
							Syn.d("loading G Table .  nameParam = ("+   msg.substring(6, msg.indexOf("("))  +").");
							Syn.d("loading G Table .  paramsParam = ["+  msg.substring(msg.indexOf("(")+1, msg.indexOf(")"))   +"].");
							for(String table : SQL.BDDWorldTemplate.tables){
								if(msg.substring(6, msg.indexOf("(")).equalsIgnoreCase(table)){
									String paramClassesNames = "";
									try{
										Method m = SQL.BDDWorldTemplate.tableLoadingMethods.get(table);
										if(m == null){
											SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" tableName(params à mettre) -> La table demandée ("+msg.substring(1, msg.indexOf("("))+") n'a pu être trouvée");
											done = true; break;
										}
										for(Class<?> c : m.getParameterTypes()){
											if(paramClassesNames.length() > 0){
												paramClassesNames += ",";
											}
											paramClassesNames += (c.getName());
										}
										
										String params[] = msg.substring(msg.indexOf("(")+1, msg.indexOf(")")).split(",");
										Object objects[] = new Object[params.length];
									
										for(int i = params.length-1; i >= 0; i--){
											params[i] = params[i].trim();
											if(m.getParameterTypes()[i].getName().toLowerCase().contains("gworld") 
												   && params[i].equalsIgnoreCase("gworld")){
												objects[i] = p.getWorld();
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("gserver") 
													   && params[i].equalsIgnoreCase("gserver")){
												objects[i] = p.getServer();
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("short")){
												objects[i] = Short.parseShort(params[i]);
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("int")){
												objects[i] = Integer.parseInt(params[i]);
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("bool")){
												objects[i] = Boolean.parseBoolean(params[i]);
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("map")){
												objects[i] = null;
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("map")){
												if(params[i].equalsIgnoreCase("null")){
													objects[i] = null;
												}else{
													objects[i] = p.getWorld().getMap(Integer.parseInt(params[i]));
												}
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("string")){
												objects[i] = params[i];
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("abstractactionlistener")){
												objects[i] = null;
											}else if(m.getParameterTypes()[i].getName().toLowerCase().contains("config")){
												objects[i] = p.getServer().getConfig();
											}else if(params[i].equalsIgnoreCase("null")){
												objects[i] = null;
											}
										}
										try {
											//ex: load gitem_templates(null, true) 
											m.invoke(null, objects);
										} catch (IllegalArgumentException e) {e.printStackTrace();
										} catch (IllegalAccessException e) {e.printStackTrace();
										} catch (InvocationTargetException e) {e.printStackTrace();}
									}catch(Exception e){
										e.printStackTrace();
										SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" tableName("+paramClassesNames+")");
									}
								}
							}
						}
						done = true;
						break;
					/*case DELGSERV:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
							done = true;
							break;
						}
						int worldID = Integer.parseInt(msg);
						GServer g = null;
						for(GServer gs : Syn.gameServers){
							if(gs.getConfig().getWorldID() == worldID){
								g = gs;
								break;
							}
						}
						
						if(g != null){
							ArrayList<GServer>  copy= new ArrayList<GServer>(Syn.gameServers.size()-1);
							GServer gs = null;
							int indexCopy = 0;
							for(GServer gso : Syn.gameServers){
								if(gso.getConfig().getWorldID() != worldID){
									copy.set(indexCopy, gso);
								}else{
									gs = gso;
									indexCopy--;
								}
								indexCopy++;
							}
							Syn.gameServers = copy;
							copy = null;
							gs.terminate();
							gs = null;
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Serveur ID : "+worldID+" supprimé.");
						}else{
							SM.Basics.BAT_FAIL(p.getClient().getSession(), "Serveur non trouvé.");
						}
						done = true;
						break;
					case NEWGSERV:
						SM.Basics.BAT_FAIL(p.getClient().getSession(), "TODO");
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
							done = true;
							break;
						}
						int worldID2 = Integer.parseInt(msg);
						ConfigurationObjects.Config c = null;
						for(GServer gs : Syn.gameServers){
							if(gs.getConfig().getWorldID() == worldID2){
								SM.Basics.BAT_FAIL(p.getClient().getSession(), "Il y a déjà un serveur qui utilise ce worldID");
								done = true;
								break;
							}
						}
						if(!done){
							ArrayList<GServer>  copy= new ArrayList<GServer>(Syn.gameServers.size()+1);
							for(int i = Syn.gameServers.size()-1; i >= 0; i--){
								copy.set(i, Syn.gameServers.get(i));
							}
							for(ConfigurationObjects.Config conf : GConfig.configs){
								if(conf.getWorldID() == worldID2){
									c = conf;
								}
							}
							GServer gs;
							try {
								gs = new GServer(c);
								copy.set(copy.size()-1, gs);
								Syn.gameServers = copy;
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Serveur Créé : "+new StringBuilder().append("GServeur IP = ").append(gs.getConfig().getIP()).append(" Port = ").append(gs.getConfig().getPort()).append(" DB = ").append(gs.getConfig().getDBName()).append(" WorldID = ").append(gs.getConfig().getWorldID()).toString());
							} catch (Exception e) {
								e.printStackTrace();
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Création du serveur échouée.");
							}
							
						}
						done = true;
						break;*/
					case ONGSERV:
						done = true;
						break;
					case OFFGSERV:
						p.getServer().off(true);
						done = true;
						break;
					
					case SET:
						done = true;
						break;
					case GET:
						done = true;
						break;
				}
				if(done){
					break;
				}
			case GM_9:
				switch(gmc){
					case SETGM:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else if(msg.indexOf(" ") == -1){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else{
							String args[] = msg.split(" ");
							if(Pattern.matches(isNumberPattern, args[0]) //Chiffre valide
									&& p.getWorld().getPersoByName(args[1]) != null){//Personnage demandé valide
								byte gm = Byte.parseByte(msg);
								if(gm >= 0 && gm < 10){
									//SETGM doit être de 0 à 9 inclusivement. 
									//Le 10 est réservé à moi
									p.getAccount().setGM(gm);
									SQL.Accounts.save(p.getAccount());
									SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "GM set à "+gm);
								}else{
									SM.Basics.BAT_FAIL(p.getClient().getSession(), "GMLevel demandé invalide.");
								}
							}else{
								SM.Basics.BAT_FAIL(p.getClient().getSession(), "GMLevel ou Personnage demandé invalide.");
							}
						}	
						done = true;
						break;
					case GETSERVINFOS:
						StringBuilder str = new StringBuilder();
						for(LoginServer ls : Syn.Services.serversService.loginServers.values()){
							str.append("\n\nLoginWorld. ID = "+ls.ID+" Port = "+ls.getPort()+" accounts.Size = "+ls.clients.size());
							str.append(ls.ID);
							str.append(" Port = ").append(ls.getPort());
							str.append("clients.size = ").append(ls.clients.size());
							str.append(" DB = ").append(ls.DB_USERNAME).append("@").append(ls.DB_HOSTIP);
							
							for(GameServer gs : p.getServer().getLoginServer().gameServers){
								str.append("\nGameWorld. ID = ").append(gs.getID()).append(" State : ").append(gs.getState());
								str.append(" DB = ").append(gs.getConfig().getDBName()).append("@").append(gs.getConfig().getDBIP());
								str.append(" clients.size = ").append(gs.clients.size());
							}
						}
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), str.toString());
						done = true;
						break;
					case SETSIZE:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								p.setSize(Short.parseShort(msg));
								SM.Game.GM_MODIFY(p, p.getMap());
							}
						}	
						done = true;
						break;
					case SETCELL:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								p.setCellID(Short.parseShort(msg));
								SM.Game.GM_MODIFY(p, p.getMap());
							}
						}
						done = true;
						break;
					case SETMAP:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								short mapID = Short.parseShort(msg);
								if(p.getWorld().getMap(mapID) != null){
									//Enleve le perso de l'ancienne map
									p.getMap().updateSpriteList(SynActions.MapAction.REMOVE_SPRITE, p);
									p.setMapID(mapID);//Set la nouvelle map du perso
									//Ajoute le perso à la nouvelle map
									//GlobalWorld.getMap(p.getgWorld(), mapID).updateCharacterList(SynActions.MapAction.ADD_CHARACTER, p);
									SM.Game.GDM(p.getClient().getSession(), p.getMap());
								}
							}
						}
						done = true;
						break;
					case ADDSTAT:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [characName count]");
						}else if(msg.indexOf(" ") == -1){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [characName count]");
						}else{
							CharacteristicType ct = CharacteristicType.valueOf(msg.split(" ")[0]);
							if(ct == null){
								SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [characName count]");
							}else{
								if(Pattern.matches(isNumberPattern, msg.split(" ")[1])){
									short count = Short.parseShort(msg.split(" ")[1]);
									p.getStatistique().incrementValue(ct, count, CharacteristicColumn.BASE);
									SM.Account.As(p.getClient().getSession(), p);
									if(ct == CharacteristicType.FORCE){
										SM.Objects.Ow(p.getClient().getSession(), p);
									}
									SM.Basics.BAT_SUCCESS(p.getClient().getSession(), ct.name()+" augmenté de "+count+".");
								}
							}
						}
						done = true;
						break;
					case PERSOID:
						GPersonnage t = p.getWorld().getPersoByName(msg);
						if(t == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), "Personnage null");
						}else{
							SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "ID du perso visé : "+t.getID());
						}
						done = true;
						break;
					case MYID:
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Mon ID de sprite/perso : "+p.getID());
						done = true;
						break;
					case GETMAPSPRITE:
						String str1 = "";
						ArrayList<ISprite> sprites = p.getMap().getSpritesSynchroFull();
						for(ISprite i : sprites){
							str1 += "\n"+i.getCharacterType().name()+"  id"+i.getID()+"  cellID:"+i.getCellID()+ " layer:"+i.getLayer();
							if(i instanceof AbstractCharacter){
								str1 += " nom:"+((AbstractCharacter)i).getName();
							}
						}
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "MapSpriteListe : "+str1);
						done = true;
						break;
					case PACKETEMU:
					case PE:
						try {
							main.pm.getParsingManager().parse(p.getClient(), msg);
							//p.getClient().getHandler().parse(p.getClient(), msg);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						done = true;
						break;
					case PACKETCLIENT:
					case PC:
						SM.Sender.send(p.getClient().getSession(), msg);
						done = true;
						break;
					case SCHEDULEDPACKET:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [SCHEDULEDPACKET délaiSecondes$packet1@packet2@alleluia@OW@OM@packetTrouzeMille] ");
						} 
						String[] msgs = msg.split("\\$");
						if(!Utils.isParsableInteger(msgs[0])){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [SCHEDULEDPACKET délaiSecondes$packet1@packet2@alleluia@OW@OM@packetTrouzeMille] ");
						}else{
							long delai = Long.parseLong(msgs[0]);
							p.getServer().threadsManager.executeScheduledTask(SchedulingA.SEND_CLIENT_PACKET, delai, TimeUnit.SECONDS,  new Object[]{ msgs[1].split("\\@"), new IoSession[]{p.getClient().getSession()} } );
							
							//ScheduledPacket sp = new ScheduledPacket(msg.split("@"), new IoSession[]{p.getClient().getSession()}, SchedulingA.SEND_CLIENT_PACKET);
							//SchedulingBuffer.getBuffer(1000).modifyBuffer(CommonAction.ADD, sp);
						}
						done = true;
						break;
						
				}
				
				if(done){
					break;
				}
			case GM_8:
				if(done){
					break;
				}
			case GM_7:
				switch(gmc){
					case SAVE:
						p.getServer().getLoginServer().save();
						p.getServer().save();
						//for(GServer gs : Syn.gameServers){
						//	gs.getWorld().saveAll();
						//}
						//LWorld.saveAll();
						done = true;
						break;
				}
				if(done){
					break;
				}
			case GM_6:
				if(done){
					break;
				}
			case GM_5:
				switch(gmc){
					case ITEM:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [itemID persoName qty max?]");
						}else if(msg.indexOf(" ") == -1){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld())+" [itemID persoName qty max?]");
						}else{
							String args[] = msg.trim().split(" ");
							GPersonnage target = p.getWorld().getPersoByName(args[1]);
							if(Pattern.matches(isNumberPattern, args[0]) //Chiffre valide
										&& target != null){//Personnage demandé valide
								short itemID = Short.parseShort(args[0]);
								if(itemID >= 0 && itemID < Short.MAX_VALUE && p.getWorld().getItemTemplate(itemID) != null){
									short qty = 1;
									if(args.length >= 3 && Pattern.matches(isNumberPattern, args[2])){
										qty = Short.parseShort(args[2]);
									}
									
									GItem item = GItem.provide(p.getWorld()).createNew(p.getWorld().getNextItemID(), p.getWorld().getItemTemplate(itemID), qty, msg.endsWith("max") || msg.endsWith("MAX"), p.getWorld());
									/*GItem stacker = target.getInventory().getCanStack(item);
									if(stacker == null){
										target.getInventory().addItem(item);
										SQL.Items.create(item, p.getWorld());
										SM.Objects.OAKO(target.getClient().getSession(), item);
									}else{
										stacker.incrementQuantity(qty);
										SM.Objects.OQ(target.getClient().getSession(), stacker);
									}
									SM.Objects.Ow(p.getClient().getSession(), p);
									SM.Account.As(p.getClient().getSession(), p);*/
									p.getInventory().addItemWithPackets(p, item);
									SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "Item "+itemID+" donné à "+args[1]+(args.length == 3?" "+args[2]+" fois.":"."));
								}else{
									SM.Basics.BAT_FAIL(p.getClient().getSession(), "ItemID demandé invalide.");
								}
							}else{
								SM.Basics.BAT_FAIL(p.getClient().getSession(), "ItemID ou Personnage demandé invalide.");
							}
						}
						
						done = true;
						break;
				}
				if(done){
					break;
				}
			case GM_4:
				switch(gmc){
					case LEVEL:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else if(Pattern.matches(isNumberPattern, msg)){
							short level = Short.parseShort(msg);
							if(p.getLevel() < level){
								for(short i = p.getLevel(); i <= level; i++){
									GSpell s = p.getClasse().getSpellLearningAtLevel(i);
									if(s != null){
										p.setSpellByID(s, s.getID());//Apprend les sorts.
									}
								}
							}else if(p.getLevel() > level){
								for(short i = p.getLevel(); i <= level; i++){
									GSpell s = p.getClasse().getSpellLearningAtLevel(i);
									if(s != null){
										p.removeSpellByID(s.getID());//Oublie les sorts.
									}
								}
							}
							for(Entry<CharacteristicType, Double> entry : p.getClasse().gainedStatsPerLevel.entrySet()){
								p.getStatistique().decrementValue(entry.getKey(), (short) (p.getLevel()*entry.getValue()), CharacteristicColumn.BASE);
								p.getStatistique().incrementValue(entry.getKey(), (short) (level*entry.getValue()), CharacteristicColumn.BASE);
							}
							p.getStatistique().setPdv(p.getStatistique().getPdvMax(p), p);
							p.setLevel(level);
							p.setXP(p.getWorld().persoXPLevels[level]);
							SM.Account.As(p.getClient().getSession(), p);
							SM.Account.AN(p.getClient().getSession(), p.getLevel());
							SM.Spells.SL(p);//update les spell gagnés
							//update guilde, groupe, mariage, amis ?
						}
						break;
					case SETPDV:
						if(msg == null){
							SM.Basics.BAT_FAIL(p.getClient().getSession(), Enums.i18n.SPECIFY_PARAMETER.getValue(p.getServer().getcWorld()));
						}else{
							if(Pattern.matches(isNumberPattern, msg)){
								p.getStatistique().setPdv(Short.parseShort(msg), p);
								SM.Account.As(p.getClient().getSession(), p);
								SM.Basics.BAT_SUCCESS(p.getClient().getSession(), "PDV set! ("+msg+")");
							}
						}
						done = true;
						break;
				}
				if(done){
					break;
				}
			case GM_3:
				if(done){
					break;
				}
			case GM_2:
				if(done){
					break;
				}
			case GM_1:
				switch(gmc){
					case GETCOMMANDS:
						String commands = "Les commandes sont :\n";
						for(GMCommand c : GMCommand.values()){
							if(p.getAccount().getGM() >= c.getGMlvl()){
								if(commands.lastIndexOf(""+(c.getGMlvl())) == -1){
									commands += "\n";
								}
								commands += c.name()+"("+c.getGMlvl()+")\n";
							}
						}
						commands += "Fin des commandes.";
						SM.Basics.BAT_SUCCESS(p.getClient().getSession(), commands);
						break;
				}
				if(done){
					break;
				}
			
		}
		p = null;
		msg = null;
		event = null;
		return null;
	}
	
	
}
