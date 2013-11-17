package pack;

import plugin.event.Event;
import plugin.event.PluginListener;
import Constants.Constants;
import Core.Syn;
import GameObjects.GPersonnage;
import Plugins.Managers.PluginsManager;
import SM.Sender;
import ZPlug.ChatEvent;
import ZPlug.ConsoleEvent.GMLevel;
import ZPlug.MiscEvent;

public class ChatListener extends Chat implements PluginListener{
	
	public Chat main = null;
	public ChatListener(Chat main){
		this.main = main;
	}
	
	public void initiateActionListenersAlias(){
		//Exemple v
		//ActionsManager.putActionListenerAlias("OM", "ON_ITEM_MOVEMENT");
	}
	
	@Override
	public Event execute(Event event) {
		if(event.getEventType() == MiscEvent.Load_Plugins_ActionListenersAlias){
			this.initiateActionListenersAlias();	
			return event;
		}
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			main.pm = (PluginsManager) event.getSource();
			return event;
		}
		
		ChatCommands CC = null;
		String msg = null;
		GPersonnage perso = null;
		Syn.d("dans ChatListener");
		Syn.d("command = "+event.getInformation().get("command").toString()+"  msg = "+event.getInformation().get("msg"));
		
		try{
			if(event.getInformation().get("command") != null){
				for(ChatCommands cc : ChatCommands.values()){
					if(cc.toString().equalsIgnoreCase(event.getInformation().get("command").toString())){
						CC = cc;
						break;
					}
				}
			}
			if(event.getInformation().get("msg") != null){
				msg = event.getInformation().get("msg").toString();
				if(msg.equalsIgnoreCase("nullmsg")){
					msg = null;
				}
			}
			/*if(event.getInformation().get("servID") != null){
				for(GServer gs : Syn.gameServers){
					if((gs.getID()+"").equals(event.getInformation().get("servID"))){
						if(event.getInformation().get("persoID") != null){
							perso = gs.getWorld().getPerso(Integer.parseInt(event.getInformation().get("persoID")));
						}
					}
				}
			}*/
			if(event.getInformation().get("perso") != null){
				perso = (GPersonnage) event.getInformation().get("perso");
			}
		}catch(IllegalArgumentException e){}
		catch(NullPointerException e){}
		catch(Exception e){}
		//Fin settings
		
		
		//EventType
		if((ChatEvent)event.getEventType() == null){
			SM.Messages.M(perso, v.unrecognizedEvent, Constants.COLOR_BLUE2);
			return null;
		}
		switch((ChatEvent)event.getEventType()){
			case GENERAL_TALK:
				//ChatCommand
				if(CC == null){
					SM.Messages.M(perso, v.unrecognizedCommand, Constants.COLOR_BLUE2);
					break;
				}
				//Commandes Koli
			/*	if(Zen.KOLIZEUM == true && CC.toString().contains("KOLI")){
					switch(CC){
						case KOLI:
							SM.Messages.M(perso, Vars.koliCommands, Zen.CONFIG_MOTD_COLOR);
							break;
						case COMBATKOLI:
							if(perso.get_fight() != null){
								SM.Messages.M(perso, "Vous ne pouvez pas lancer de combat Kolizeum alors que vous �tes en combat.", Zen.koliMsgColor);
								break;
							}
							//Si le gars est d�j� dans un groupe koliseum inscrit
							if(perso.getKoliGroup() != null){
								Koliseum.Group opponents = Koliseum.searchForFight(perso.getKoliGroup());
					           	if(opponents != null){
						           	if(Koliseum.startFight(perso.getKoliGroup(), opponents) == true){
						           		Koliseum.deleteGroup(perso.getKoliGroup());
						           		Koliseum.deleteGroup(opponents);
						           	}
					           	}else{
					           		SM.Messages.M(perso, "Aucun groupe d'adversaire n'a �t� trouv�, veuillez r�essayer plus tard.", Zen.koliMsgColor);
					           	}
							}else{
								SM.Messages.M(perso, "Vous devez d'abord inscrire votre groupe au Koliz�um (avec le commande .inscrireKoli) avant de pouvoir y combattre.", Zen.koliMsgColor);
							}
							break;
						case INSCRIREKOLI:
							//Si le gars est d�j� dans un groupe koliseum inscrit
							 if(perso.getKoliGroup() != null){
								 SM.Messages.M(perso, "Vous �tes d�j� inscrit au Koliz�um. Faites .combatKoli pour lancer un combat Koliz�um ou .d�sinscrireKoli pour vous d�sinscrire du Koliz�um.", Zen.koliMsgColor);
				           		 break;
							 }
							 if(perso.getGroup() != null){
								 if(perso.getGroup().getPersosNumber() > 3){
									 SM.Messages.M(perso, "Vous devez poss�der un groupe du bon nombre de persos voulu (1,2 ou 3) pour vous inscrire au Kolis�um.", Zen.koliMsgColor);
									 break;
								 }
							 }
							 //Partie cr�ation du groupe kolis�um
					          Koliseum.Group gp;
					          if(perso.getGroup() != null){
					        	  Personnage[] pg = new Personnage[perso.getGroup().getPersosNumber()];
					           	  int i =0;
					           	  for(Personnage p : perso.getGroup().getPersos()){
					           		  pg[i++] = p;
					           	  }
					           	  gp = Koliseum.createGroup(pg);
					          }else{
					           	  gp = Koliseum.createGroup(perso);
					          }
					          if(gp != null){
					        	  Koliseum.setPersosGroup(gp, true); //on fout le group sur les persos juste pour pouvoir le retrouver
						          SM.Messages.MKG(gp, "Vous avez bien �t� inscrit au Koliz�um.");
						      }
							break;
						case DESINSCRIREKOLI:
							//Si le gars est d�j� dans un groupe koliseum inscrit
							 if(perso.getKoliGroup() != null){
									SM.Messages.MKG(perso.getKoliGroup(), "Votre groupe Kolizeum a bien �t� d�sinscrit.");
									Koliseum.deleteGroup(perso.getKoliGroup()); 
							 }else{
								 SM.Messages.M(perso, "Vous n'avez d�j� pas de groupe Koliz�um.", Zen.koliMsgColor);
							 }
							break;
					}
					break;
				}*/
				//TODO Commandes VIP accessible � tous les GM sauf GH -> change les gmLVL
				if(perso.getAccount().getGM() >= GMLevel.VIP.getGMlvl() && perso.getAccount().getGM() != GMLevel.GAME_HELPER.getGMlvl()){
					/*TODO if(CC == ChatCommands.CHANGENOM){
						while(msg.endsWith("|")){
							msg = msg.substring(0, msg.length()-1);
						}
						if(msg.length() <= 14){
							SM.Messages.M(perso, "Votre nouveau nom doit �tre d'une longeur minimale de 3 lettres.", Constants.COLOR_BLUE2);
						}else if(perso.getAccount().getGameThread().checkName(msg.substring(11), true)){
							if(perso.getAccount().getGameThread().getCommand() == null){
								perso.getAccount().getGameThread().setCommand(new Commands(perso));
							}
							perso.get_compte().getGameThread().getCommand().consoleCommand("..changenom "+perso.get_name()+" "+msg.substring(11));
						}
						break;
					}*/
				}
				//Commandes GM 4 (Modo) et +
				if(perso.getAccount().getGM() >= GMLevel.MODERATEUR.getGMlvl()){
					switch(CC){
						case SPAL:
							GPersonnage target = perso.getWorld().getPersoByName(msg.split(" ")[0]);
							if (target == null) {  SM.Messages.M(perso, "Le personnage cible n'existe pas.", Constants.COLOR_BLUE2);break;}
							//if (target.isOnline() == false) {  SM.Messages.M(perso, "Le personnage cible n'est pas connect�.", Constants.COLOR_BLUE2);break;}
							SM.chat.cMK_Black(target, msg.substring(msg.indexOf(" ")));
							target = null;
							break;
						case SETGH:
							GPersonnage target1 = perso.getWorld().getPersoByName(msg.split(" ")[0]);
							if (target1 == null) {  SM.Messages.M(perso, "Le personnage cible n'existe pas.", Constants.COLOR_BLUE2);break;}
							//if (target1.isOnline() == false) {  SM.Messages.M(perso, "Le personnage cible n'est pas connect�.", Constants.COLOR_BLUE2);break;}
							if(target1.getAccount().getGM() == 0){
								target1.getAccount().setGM(GMLevel.GAME_HELPER.getGMlvl());
								SM.Messages.M(perso, "GM du Compte sett� � GH.", Constants.COLOR_BLUE2);
							}else{
								target1.getAccount().setGM(GMLevel.JOUEUR.getGMlvl());
								SM.Messages.M(perso, "GM du compte enlev�.", Constants.COLOR_BLUE2);
							}
							target1 = null;
							break;	
					}
				}
				//Commandes GM 10 (moi)
				if(perso.getAccount().getGM() == GMLevel.CRYSTAL.getGMlvl()){
					switch(CC){
						/*case NATION:
							String params[] = msg.split(" ");
							params[0] = params[0].toUpperCase();
							if(params[0].contains("LEADER")){
								
								GPersonnage p = perso.getgWorld().getPersoByName(params[1]);
								Zen.debug("LEADER NAME :"+params[1]+"-Align :"+p.get_align());
								if(p != null){
									if(Heroes.getCities()[p.get_align()] == null){
										Heroes.setCities(new City[4]);
										for(City c : Heroes.getCities()){
											c = new City();
										}
										Heroes.cities[0] = null;
										if(Heroes.getCities()[p.get_align()] == null){
											Zen.debug("City nulle");
										}else{
											Zen.debug("City cr�es car �taient nulles");
										}
									}
									Heroes.getCities()[p.get_align()].setLeader(p);
									SM.Messages.M(perso, "Nouveau Leader de la cit� "+p.get_align()+" = "+params[1], Zen.CONFIG_CANALL_COLOR);
								}
							}else if(params[0].contains("NEWTROUP")){
								Heroes.cities[perso.get_align()].createTroup(params[1]);
								SM.Messages.M(perso, "New Troup cr��e et entrepos�e", Zen.CONFIG_CANALL_COLOR);
							}else if(params[0].contains("MOVETROUP")){
								
							}else if(params[0].contains("NEWINFRA")){
								Heroes.cities[perso.get_align()].createInfra(Integer.parseInt(params[1]), Integer.parseInt(params[2]));
								SM.Messages.M(perso, "New Infra cr��e", Zen.CONFIG_CANALL_COLOR);
							}else if(params[0].contains("LISTINFRA")){
								StringBuilder l = new StringBuilder();
								for(Infrastructure i : Heroes.cities[perso.get_align()].getInfras()){
									l.append("Action = "+(i.actionID)).append(" - ").append("Thing = "+i.productID).append(" - ").append(i.getTroups().size()+" troupes").append("\n");
								}
								SM.Messages.M(perso, l.toString(), Zen.CONFIG_CANALL_COLOR);
							}else if(params[0].contains("LISTTROUP")){
								StringBuilder l = new StringBuilder("<b>Troupes Dehors:</b>\n");
								for(Troup t : Heroes.cities[perso.get_align()].getOutTroups()){
									l.append("Mob : "+t.getMobName()).append(" CurMap : "+t.getCurMap().get_id()).append(" TargetMap : "+t.getTargetMap().get_id()).append("\n");
								}
								l.append("<b>Troupes En infra:</b>\n");
								for(Infrastructure i : Heroes.cities[perso.get_align()].getInfras()){
									if(i.getTroups() != null){
										if(i.getTroups().isEmpty() == false){
											for(Troup t : i.getTroups()){
												l.append("Mob : "+t.getMobName()).append(" CurMap : "+t.getCurMap().get_id()).append(" TargetMap : "+t.getTargetMap().get_id()).append("\n");
											}
										}
									}
								}
								SM.Messages.M(perso, l.toString(), Zen.CONFIG_CANALL_COLOR);
							}
						break;*/
						case GETBYTES://envoie le nbr de bytes dans une string
							SM.Messages.M(perso, new StringBuffer().append("Mémoire utilisée par : \"").append(msg).append("\" = ").append(msg.getBytes().length).append(" bytes.").toString(), Constants.COLOR_BLUE2);
							break;
						case PE://envoie packet à lemu
							try {
								perso.getClient().getHandler().parse(perso.getClient(), msg);
							} catch (Exception e) {e.printStackTrace();}
							break;
						case PC://envoie packet au client
							Sender.send(perso.getClient().getSession(), msg);
							break;
						case GETMEM:
							SM.Messages.M(perso, new StringBuffer().append("freeMemory: ").append(Runtime.getRuntime().freeMemory()/1024/1024).append(" Mo.   maxMemory: ").append(Runtime.getRuntime().totalMemory()/1024/1024).append(" Mo.   usedMemory: ").append(Runtime.getRuntime().totalMemory()/1024/1024 - Runtime.getRuntime().freeMemory()/1024/1024).toString(), Constants.COLOR_BLUE2);
							break;
						case LOAD:
							if(msg.equalsIgnoreCase("npcs")){
								//TODO SQLManager.LOAD_NPCS();
							}
							break;	
						case TRACE:
							if(msg.contains("method")){
								Runtime.getRuntime().traceMethodCalls(msg.contains("true"));
								SM.Messages.M(perso, "trace methods "+msg.contains("true"), Constants.COLOR_BLUE2);
							}else if(msg.contains("instruc")){
								Runtime.getRuntime().traceInstructions(msg.contains("true"));
								SM.Messages.M(perso, "trace instruction "+msg.contains("true"), Constants.COLOR_BLUE2);
							}
							break;	
						case GC:
							long before = Runtime.getRuntime().freeMemory()/1024/1024;
							System.runFinalization();
							System.gc();
							SM.Messages.M(perso, new StringBuffer().append("Memoire libérée par le gc : ").append(Runtime.getRuntime().freeMemory()/1024/1024 - before).append(" Mo.").toString(), Constants.COLOR_BLUE2);
							break;	
/*						case ADDTIME:
							if(msg.contains("day") || msg.contains("jour")){
								Zen.gameServer.set_startTime(Zen.gameServer.getStartTime()-Vars.oneDay);
							}else if(msg.contains("hour") || msg.contains("heure")){
								Zen.gameServer.set_startTime(Zen.gameServer.getStartTime()-Vars.oneHour);
							}
							break;	
						case REMTIME:
							if(msg.contains("day") || msg.contains("jour")){
								Zen.gameServer.set_startTime(Zen.gameServer.getStartTime()+Vars.oneDay);
							}else if(msg.contains("hour") || msg.contains("heure")){
								Zen.gameServer.set_startTime(Zen.gameServer.getStartTime()+Vars.oneHour);
							}
							break;	
						case DETIME:
							if(msg.contains("day") || msg.contains("jour")){
								DailyEvents.startTime -= Vars.oneDay;
							}else if(msg.contains("hour") || msg.contains("heure")){
								DailyEvents.startTime -= Vars.oneHour;
							}
							break;		
						//case FM:
						//	this.getPluginManager().callEvent(FMEvent.POTION_FM, this, new EventInformation().set("persoName", perso.get_name()).set("potion", "").set("objtoboost", ""));
						//	break;
						case SCRIPT:
							
							break;		
	*/				}
				}
				//Commandes accessibles à tous
/*				*/
				switch(CC){
					/*case COMMAND:
						SM.Messages.M(perso, Vars.commandList, Zen.CONFIG_MOTD_COLOR);
						break;
					case DC:
						//SM.Messages.M(perso, Vars.commandList, Zen.CONFIG_MOTD_COLOR);
						SM.Messages.M(perso, "Pour le challenge actif, vous devez <b>"+DailyChallenge.curAction+"</b> Fais .stats pour voir ton score\n!DCCadeau pour connaitre les commandes de r�compenses des DailyChallenges.", Zen.CONFIG_CANALL_COLOR);
						break;
					case DCCADEAU:
						if(msg.length() <= 0 || msg.equals("nullmsg")){
							SM.Messages.M(perso, "!DCcadeau 1 pour avoir 700ph.\n!DCcadeau 2 pour avoir le titre \"Challenge Accepted!\"\n!DCcadeau 3 pour le titre \"Challenger\"\n!DCcadeau 4 pour avoir 30 points boutique\nPS: L'espace entre !DCcadeau et le chiffre est important", Zen.CONFIG_CANALL_COLOR);
							break;
						}
						if(perso.hasWonDailyChallenge()){
							if(msg.equals("1")){
								perso.set_honor(perso.get_honor()+700);
								perso.buyDailyChallengeGift();
							}else if(msg.equals("2")){
								if(perso.get_fight() == null){
									SM.Game.GM_M(perso.get_curCarte(), perso);
								}
								perso.set_title(205);
								perso.buyDailyChallengeGift();
							}else if(msg.equals("3")){
								if(perso.get_fight() == null){
									SM.Game.GM_M(perso.get_curCarte(), perso);
								}
								perso.set_title(206);
								perso.buyDailyChallengeGift();
							}else if(msg.equals("4")){
								World.addPointsToAccount(perso.get_compte(), 30);
								SM.Messages.M(perso, "30 points vous ont �t� cr�dit�s", Zen.CONFIG_CANALL_COLOR);
								perso.buyDailyChallengeGift();
							}
						}else{
							SM.Messages.M(perso, "Vous devez avoir gagn� un DailyChallenge pour pouvoir acheter une de ces r�compenses.", Zen.CONFIG_CANALL_COLOR);
						}
						break;	
					case BOUTIQUE:
						if(perso.get_fight() == null){
							perso.teleport((short)Zen.MAP_BOUTIQUE, 214);//Zen.MAP_BOUTIQUE_CELL);
							SM.Messages.M(perso, "Vous avez ete teleporte a la map boutique", Zen.CONFIG_MOTD_COLOR);
						}
						break;	
					case INFOBOUTIQUE:
						SM.Messages.M(perso, Vars.achatsList, Zen.CONFIG_MOTD_COLOR);
						break;
					case ACHAT:
						if(msg.equals("1")){
							achatBoutique(World.getObjTemplate(80010), perso);//paracape
						}else if(msg.equals("2")){
							achatBoutique(World.getObjTemplate(80009), perso);//paracoiffe
						}else if(msg.equals("3")){
							achatBoutique(World.getObjTemplate(80014), perso);//rolicape
						}else if(msg.equals("4")){
							achatBoutique(World.getObjTemplate(80013), perso);//rolicoiffe
						}
						break;
					case RELOAD:
						perso.get_compte().getGameThread().kick();
						perso.get_compte().get_persos().clear();
						World.getComptes().remove(perso.get_compte().get_GUID());
						break;	
					case UNTITLE:
						perso.set_title(0);
						SM.Messages.M(perso, "Titre supprim�", Constants.COLOR_BLUE2);
						SQLManager.SAVE_TITLE(perso);
						if(perso.get_fight() == null){
							SM.Game.GM_M(perso.get_curCarte(), perso);
						}
						break;
					case TP:
						SM.Messages.M(perso, "Les commandes de teleportation sont les suivantes:\n.start\n.shop\n.goulta\n.event\n.pvp\n.go", Zen.CONFIG_MOTD_COLOR);
						break;
					case ALIGN:
		                SM.Messages.M(perso, "Les commandes d'alignement sont les suivantes:\n.bontarien\n.brakmarien\n.neutre", Zen.CONFIG_MOTD_COLOR);
						break;	
					case DE:
						SM.Messages.M(perso, "L'event du jour donne une bonus de "+DailyEvents.getCurrentEventBonus()+" % � la rate "+DailyEvents.getCurrentEventName(), Zen.CONFIG_MOTD_COLOR);
						//Sender.sendTest(perso, "BAIOHEventDuJour");
						break;
					case SHOP:
						if(perso.get_fight() == null){
							perso.teleport(Zen.CONFIG_SHOP_MAP, Zen.CONFIG_SHOP_CELL);
							SM.Messages.M(perso, "Vous avez ete teleporte a la map shop", Zen.CONFIG_MOTD_COLOR);
						}
						break;
					case PVP:
						if(perso.get_fight() == null){
							perso.teleport(Zen.CONFIG_PVP_MAP, Zen.CONFIG_PVP_CELL);
							SM.Messages.M(perso, "Vous avez ete teleporte a la map pvp", Zen.CONFIG_MOTD_COLOR);
						}
						break;	
					case START:
						if(perso.get_fight() == null){
							perso.teleport(Zen.CONFIG_START_MAP, Zen.CONFIG_START_CELL);
							SM.Messages.M(perso, "Vous avez ete teleporte a la map start", Zen.CONFIG_MOTD_COLOR);
						}
						break;	
					case DETENTE:
						if(perso.get_fight() == null){
							perso.teleport((short) 7411, 311);
							SM.Messages.M(perso, "Vous avez ete teleporte a la map detente", Zen.CONFIG_MOTD_COLOR);
						}
						break;	
					case EVENT:
						if(perso.get_fight() == null){
							 perso.teleport(Zen.CONFIG_EVENT_MAP, Zen.CONFIG_EVENT_CELL);
				         	 SM.Messages.M(perso, "Vous avez ete teleporte a la map event", Zen.CONFIG_MOTD_COLOR);
				        }
			            break;
					case GOULTA:
						if(perso.get_fight() == null){
							 perso.teleport(Zen.CONFIG_GOULTA_MAP, Zen.CONFIG_GOULTA_CELL);
				             SM.Messages.M(perso, "Vous avez ete teleporte a la map goulta", Zen.CONFIG_MOTD_COLOR);
						}
			            break;
					//case GO:
						
						//break; 
					case VOTE:
						SM.Messages.M(perso, "<b><a href=\"" + Zen.CONFIG_LINK_RPG + "\">Pour aller voter, cliquez sur ce message !</a></b>", Constants.COLOR_BLUE2);
						break;
					case SITE:
						 SM.Messages.M(perso, "<b><a href=\"" + Zen.CONFIG_LINK_SITE + "\">Pour aller sur le site et voter, cliquez sur ce message !</a></b>", Constants.COLOR_BLUE2);
						break;
					case FORUM://http://www.tictak-online.com/forum/index.php
						 SM.Messages.M(perso, "<b><a href=\"" + Zen.CONFIG_LINK_FORUM + "\">Pour aller sur le forum, cliquez sur ce message !</a></b>", Constants.COLOR_BLUE2);
						break;
					case BUG://http://zen6.webnode.fr/bugtracker/
						 SM.Messages.M(perso, "<b><a href=\"" + CONFIG_LINK_BUGTRACKER + "\">Pour aller sur le BugTracker, cliquez sur ce message !</a></b>", Constants.COLOR_BLUE2);
						break;
			//		case PORTAIL://href="http://www.elite-pvp.com/portail.html
			//			 SM.Messages.M(perso, "<b><a href=\"http://www.elite-pvp.com/portail.html\"> Pour rejoindre nos serveurs, cliquez sur ce message !</a></b>", Constants.COLOR_BLUE2);
			//			break;
					case VIE:
						//TODO commande .vie
						//if(perso.get_fight() == null){
						//	perso.set_PDV(perso.get_PDVMAX());
						//	SM.Accounts.As(perso);
						//	SM.Messages.M(perso, "Vie au max !", Zen.CONFIG_MOTD_COLOR);
						//}
						break;	
					case ALL:
						String[] infos = msg.split(" ",2);
						// TODO command .all
						 if(infos.length > 1){
							if(Parsers.ChatParser.containsForbiddenWords(msg) == 2){
								SM.Messages.M(perso, "Svp, n'ins�rez pas d'items dans le canal all ou autre canal qui ne les supporte pas.", Constants.COLOR_BLUE2);
								break;
							}else{
								long l;
								if((l = System.currentTimeMillis() - perso.get_compte().getGameThread().get_timeLastAllMsg()) < Zen.FLOOD_TIME)
								{
									l = (Zen.FLOOD_TIME  - l)/1000;//On calcul la diff�rence en secondes
									SM.Infos.Im(perso, "0115;"+((int)Math.ceil(l)+1));
									break;
								}
								perso.get_compte().getGameThread().set_timeLastAllMsg(System.currentTimeMillis());
								SM.Messages.MA("<b>"+perso.getName()+"</b>" +" : "+ infos[1], Constants.COLOR_BLUE, perso.getgWorld());
							}
						}
						break;
					case AIDE:
		                	SM.Messages.M(perso, Vars.helpMessage, Zen.CONFIG_MOTD_COLOR);
						break;
					case INFOS:
						long uptime = System.currentTimeMillis() - Zen.gameServer.getStartTime();
						StringBuilder str = new StringBuilder();
						str.append("===========\nUptime: ");
						str.append((int) (uptime/(1000*3600*24))).append("j "); 
						uptime %= (1000*3600*24);
						str.append((int) (uptime/(1000*3600))).append("h "); 
						uptime %= (1000*3600);
						str.append((int) (uptime/(1000*60))).append("m "); 
						uptime %= (1000*60);
						str.append((int) (uptime/(1000))).append("s")
						.append("\nJoueur(s) en ligne(s): ").append(Zen.gameServer.getPlayerNumber())
						.append("\nRecord de connexions: ").append(Zen.gameServer.getMaxPlayer())
						.append("\n<i>La Team TicTak est fi�re de vous pr�senter son �mulateur priv�: ").append(Zen.NOM_EMU+Zen.VERSION_EMU).append(" , dev par Crystal</i>\n===========\n");
						SM.Messages.M(perso, str.toString(), Zen.CONFIG_MOTD_COLOR);
						str = null;
						break;
					case BONTARIEN: case BONTA://fallthrought
						perso.modifAlignement((byte) 1);
						SM.Accounts.As(perso);
						SM.Messages.M(perso, "Tu es desormais Bontarien", Zen.CONFIG_MOTD_COLOR);
						break;
					case BRAKMARIEN: case BRAK://fallthrought
						perso.modifAlignement((byte) 2);
						SM.Accounts.As(perso);
						SM.Messages.M(perso, "Tu es desormais Brakmarien", Zen.CONFIG_MOTD_COLOR);
						break;
					case SERIANNE:
						perso.modifAlignement((byte) 3);
						SM.Accounts.As(perso);
						SM.Messages.M(perso, "Tu es desormais Serianne", Zen.CONFIG_MOTD_COLOR);
						break;
					case NEUTRE:
						perso.modifAlignement((byte) 0);
						SM.Accounts.As(perso);
						SM.Messages.M(perso, "Tu es desormais Neutre", Zen.CONFIG_MOTD_COLOR);
						break;
					case REFRESH:
						long l;
						if((l = System.currentTimeMillis() - perso.get_compte().getGameThread().get_timeLastAllMsg()) < Zen.FLOOD_TIME)
						{
							l = (Zen.FLOOD_TIME  - l)/1000;//On calcul la difference en secondes
							SM.Messages.M(perso, "Afin de pr�venir le lag, la commande de refresh a �t� restreinte. Vous pourrez maintenant refresh dans "+((int)Math.ceil(l)+1)+" secondes.", Zen.CONFIG_CANALL_COLOR);
							break;
						}
						perso.get_compte().getGameThread().set_timeLastAllMsg(System.currentTimeMillis());
						perso.get_curCarte().refreshSpawns();
						break;
					case DEMORPH:
						Personnage target = perso;
						if(target.get_isDead() == 1 || target._Humanity != 0){
							SM.Messages.M(perso, "Vous ne pouvez pas changer de morph lorsque vous etes dans cet �tat.", Zen.CONFIG_MOTD_COLOR);
						}else{
							target.set_gfxID((target.get_classe()*10 + target.get_sexe()));
							SM.Game.GM_M(perso.get_curCarte(), perso);
							SM.Messages.M(perso, "Transformation effectu�e", Zen.COLOR_VERT);
						}
						break;
					case STAFF:
						String staff = "";
						Compte c = null;
						List<Personnage> online = World.getOnlinePersos();
						for(Personnage a : online){
							if((c = a.get_compte()) != null){
								//pas de vips ds le staff merci. Ni de moi, trop de flood mp sinon.
								if(c.get_gmLvl() > 1 && c.get_pseudo().equals("[DEV][Co-Crea]Crystal") == false){
									staff += "- " + a.get_name() + " (";
							        switch(c.get_gmLvl()){
							        	case 2:staff += "Animateur)\n";break;
							            case 3:staff += "Moderateur)\n";break;
							            case 4:staff += "Maitre joueur)\n";break;
							            //case 5:break;
							            case 6:staff += "GameHelper)\n";break;
							            default:staff += "Unknown)\n";c.setGmLvl(0);c.setBanned(true);break;
						}	}	}	}	   
						if(!staff.isEmpty()){
							SM.Messages.M(perso, "Membres du staff connectes :\n"+staff, Zen.CONFIG_MOTD_COLOR);
						}else{
						    SM.Messages.M(perso, "Aucun membre du staff est present !", Zen.CONFIG_MOTD_COLOR);
						}
						break;
					*/
					case SAVE:
						if(perso.getFight() == null){
							//S'occupe du personnage lui même
							if(perso.getWorld().getPerso(perso.getID()) != null){
								SQL.Personnages.save(perso, perso.getServer());
							}
							//S'occupe de l'inventaire et des items du perso.
							if(perso.getWorld().getInventory(perso.getID()) != null){
								SQL.Items.saveStorageComplete(perso.getInventory(), perso.getServer());
							}
							//Soccupe des statistiques du perso
							if(perso.getWorld().getStatistisque(perso.getID()) != null){
								SQL.Personnages.saveStatistiques(perso, perso.getServer());
							}
							//Soccupe de la banque du compte de ce monde-ci
							if(perso.getWorld().getBank(perso.getAccountID()) != null){
								SQL.Banks.save(perso.getWorld().getBank(perso.getAccountID()), perso.getAccountID(), perso.getServer());
							}
							SM.Messages.M(perso, "Personnage "+perso.getName()+" sauvegardé!", Constants.COLOR_FLASH_GREEN);
						}else{
							SM.Messages.M(perso, "Personnage "+perso.getName()+" non-sauvegardable en combat!", Constants.COLOR_FLASH_GREEN);
						}
						break;
					/*case POINTS:
						long z;
						if((z = System.currentTimeMillis() - perso.get_compte().getGameThread().get_timeLastPointsMsg()) < Zen.FLOOD_TIME)
						{
							z = (Zen.FLOOD_TIME  - z)/1000;//On calcul la difference en secondes
							SM.Infos.Im(perso, "0115;"+((int)Math.ceil(z)+1));
							break;
						}
						perso.get_compte().getGameThread().set_timeLastPointsMsg(System.currentTimeMillis());
						SM.Messages.M(perso, "Vous avez " + SQLManager.LOAD_POINTS_BY_ACCOUNT(perso.get_compte().get_GUID()) + " points boutique.", Zen.CONFIG_MOTD_COLOR);
						break;
			*/	}
				
			break;
			case PRIVATE_TALK:break;
			case TEAM_TALK:break;
			case GROUP_TALK:break;
			case GUILD_TALK:break;
			case ALIGN_TALK:break;
			case TRADE_TALK:break;
			case RECRUIT_TALK:break;	
		}//*/
		if(perso != null){
			SM.Basics.BN(perso.getClient().getSession());
		}
		//ET = null;
		CC = null;
		msg = null;
		perso = null;
		return null;
	}
	
	
/*	
	public void achatBoutique(objects.Objet.ObjTemplate template, Personnage perso){
		//VENTE DE LOBJET PAR POINTS PAR LE NPC (si l'objet vient de la boutique donc)
		long ptsCompte = SQLManager.LOAD_POINTS_BY_ACCOUNT(perso.get_compte().get_GUID());
		long prixpoints = 0;
		
		if(Zen.SERVEUR_ELITE_PVP == true && (int)perso.get_curCarte().get_id() == Zen.MAP_BOUTIQUE){
			prixpoints = ((long)(template.getLevel()/2));// * 1; //1 = qty
		}else{
			prixpoints = template.get_pointsobj();// * 1; //1 = qty
		}
		if(ptsCompte < prixpoints)//Si le joueur n'a pas assez de points
		{
			SM.Messages.M(perso, "Vous n'avez pas les points necessaires a l'achat de cet objet boutique. Ce dernier co�te "+prixpoints+" points boutique.", Zen.CONFIG_CANALL_COLOR);
			SM.Exchange.GAME_SEND_BUY_ERROR_PACKET(perso.get_compte().getGameThread().get_out());
			return;
		}
		Objet newObj = null;
		if(Zen.SERVEUR_ELITE_PVP == true && (int)perso.get_curCarte().get_id() == Zen.MAP_BOUTIQUE){
			newObj = template.createNewItem(1, true);//boutique jet parfait.
		}else{
			newObj = template.createNewItem(1,false);
		}
		long newPointscompte = ptsCompte - prixpoints;
		//user.setPoints(newPointscompte);
		SQLManager.SAVE_USER_POINTS(newPointscompte, perso.get_compte().get_GUID());
		if(perso.addObjet(newObj,true)){//Return TRUE si c'est un nouvel item 
			World.addObjet(newObj,true);
		}	
		SM.Exchange.GAME_SEND_BUY_OK_PACKET(perso.get_compte().getGameThread().get_out());
		SM.Accounts.As(perso);
		//SM.Objets.Ow(perso);
		SocketManager.GAME_SEND_Ow_PACKET(perso);
		SQLManager.SAVE_PERSONNAGE_INVENTAIRE(perso);
		SM.Messages.M(perso, "Achat effectue "+prixpoints+" points ont ete retires de votre compte.", Zen.CONFIG_CANALL_COLOR);
		//Zen.addToShopLog("Personnage: ("+perso.get_name()+"). ItemTempID: ("+newObj.getTemplate().getID()+"). PrixPoints: ("+prixpoints+"). Par commande !achat");
	}
	*/

}
