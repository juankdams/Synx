package pack;

import static Enums.ActionListenerType.ON_CELL_ARRIVE;
import static Enums.ImPackets.TropLourdBouge;
import static Enums.ImPackets.ImType.ERROR;
import static Enums.SynActions.MapAction.REMOVE_SPRITE;
import static pack.GameActionType.MOVEMENT;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import plugin.event.Event;
import Abstractions.AbstractWorld;
import ActionListening.gActionListener;
import Constants.CSpells;
import Constants.Constants;
import Core.Exceptions;
import Core.Syn;
import Enums.ActionListenerType;
import Enums.CharacterType;
import Enums.CharacteristicType;
import Enums.ImPackets;
import Enums.ImPackets.ImType;
import Enums.ItemType;
import Enums.SynActions;
import Enums.SynActions.MapAction;
import Events.FightMovementEvent;
import Events.FightSpellEvent;
import GameObjects.GAction;
import GameObjects.GBuff;
import GameObjects.GBuff.BuffApplicationType;
import GameObjects.GDropItem;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GMonsterGroup;
import GameObjects.GPersonnage;
import GameObjects.GSpell;
import GameObjects.GStatistiques.CharacteristicColumn;
import GameObjects.Fights.FightFactory;
import GameObjects.Fights.GFight;
import Handlers.GHandler;
import Interfaces.IMap.Trigger;
import Interfaces.ISprite;
import Misc.Jet;
import Misc.ParameterHolder;
import Misc.Utils;
import Moar.SpellApplication;
import Plugins.Abstractions.AbstractActionListener;
import Plugins.Abstractions.AbstractActionPluginListener;
import Plugins.Abstractions.AbstractFormulings.AbstractNode;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;
import Plugins.Managers.ActionsManager;
import Plugins.Managers.FormulingManager;
import Plugins.Managers.PluginsManager;
import Providers.GDropItemProvider;
import ZPlug.MiscEvent;

public class Application extends AbstractActionPluginListener{

	public static Logger log = LoggerFactory.getLogger(Application.class);
	private static ScriptEngineManager manager = new ScriptEngineManager();
	private static ScriptEngine engine = null;
	
	public ActionsMain main = null;
	public Application(ActionsMain main){
		this.main = main;
	}
	
	
	
	/**
	 * 		Ex: pour packet OU -> ON_ITEM_USE
	 * <br> Ex: parsersActionListenersAlias.put("OD", "ON_ITEM_DROP");
	 */
	public HashMap<String, ActionListenerType> actionListenersAlias = new HashMap<String, ActionListenerType>();
	
	//public enum GAPacketResponse{
	//	NONE,
	//	GA,
	//	GA_MAP
	//}
	
	
	@Override
	public boolean apply(GPersonnage p, short spriteTargetID, short targetCellID, GAction action/*ICharacter caster, short actionID, short spriteTargetID, short targetCellID*/) throws NullPointerException{
		Syn.d("hello dans l'apply");
		
		//GameActionType gat = pack.GameActionType.getGameAction(actionID);
		//if(gat == null){
		//	Core.Syn.d("Il manque l'action "+actionID+" dans le packet GA"+actionID+spriteTargetID+";"+targetCellID+" ");
		//}
		//GAction action = new GAction(caster.getWorld().getNextActionID(), gat.getType(), "");
		//if(p.getCharacterType() == CharacterType.PLAYER){ 
			//TODO JESPERE QUE CEST TJRS 1 PLAYER QUI FAIT DES GAction, CA SERAIT FKN PLUS SIMPLE
			//GPersonnage p = ((GPersonnage)caster);
		//}
		Object sArgs = action.getSpecialArgs();
		//GAPacketResponse response = GAPacketResponse.NONE;
		switch(pack.GameActionType.getGameAction(action.getType())){
			case MOVEMENT:
			{
				//Syn.w("in action plugin, on movement");
				if(p.getInventory().isOverweight(p)){
					SM.Infos.Im(p, ERROR, TropLourdBouge, "");//Envoie le message disant que l'inventaire du perso est plein/trop chargé
					applyOnCancel(p, action, Short.MIN_VALUE);//Cancelle l'action + l'enleve du stack
					break;
				}
				if(p.isSit()){
					p.sit();
				}
				AbstractPath path = main.pm.getFormulingManager().parsePath(sArgs.toString());
				if(path == null){
					GHandler.packetCantParse(p.getClient(), "Action.specialArgsString="+sArgs.toString(), "ParsingPath-Nodes : Impossible de parser la string en cellID + orientation. La string ne respecte pas le regex.");
				}

				int usedPM = 0;
				GFight f = p.getFight();
				if(f != null){
					FormulingManager fm = p.getServer().getFormulingManager();
					usedPM = fm.getDistanceBetweenCellsInFight(p.getMap(), p.getCellID(), path.first().cell);
					AbstractNode lastNode = null;
					for(AbstractNode an : path){
						if(lastNode != null && an != null){
							usedPM += fm.getDistanceBetweenCellsInFight(p.getMap(), lastNode.cell, an.cell);
						}
						lastNode = an;
					}
					if(p.getStatistique().getPM(p.getClasse()) < usedPM){
						SM.Messages.M(p, "Vous ne possédez pas assez de PM pour ce mouvement", Constants.COLOR_RED);
						return true;
					}
					SM.Game.GAS(p);
					//TODO retirer les PM : p.getStatistique().decrementValue(CharacteristicType.PM, arme.getTemplate().getPM(), CharacteristicColumn.BOOST);
					//GBuff b = GBuff.createNew(p.getServer().getEffectsManager().getAddPmEffect().getOppositeEffect(), null, new Jet((short) usedPM), (byte) 1, GBuff.BuffApplicationType.OneShot);
					//p.addBuff(b);
					//b.apply(p, p.getFight(), BuffApplicationType.OneShot);//Retire les PM dans les GStats du personnages 
					//b.decrementRemainingTurns();//Met le RemainingTurns à 0 pour qu'il soit debuff à fin du tour
					p.getStatistique().decrementValue(CharacteristicType.PM, (short) usedPM, CharacteristicColumn.FIGHT);
					
				}
				
				//path.add(0, new ShivasPF.Node(p.getOrientation(), p.getCellID()));
				action = main.pm.getActionsManager().getFactory().newMovementAction(p, path);
				p.addAction(action);
				SM.Game.GA_LAYER(p, action
						//anciennement : action.setSpecialArgs("a"+Cells.encode(p.getCellID())+path.toString())
						);
				action.setSpecialArgs(path);
				
				if(f != null){
					ActionsManager am = main.pm.getActionsManager();
					GAction pa = am.getFactory().newPmChangedAction(p, -usedPM);//new GAction(p.getWorld().getNextActionID(), GameActionType.PA_CHANGED.getType(), "-"+s.getPA());
					p.addAction(pa);
					SM.Game.GA_LAYER(p, pa);
					SM.Game.GAF(am.getMovementEndActionID(), p);
					f.getStateMachine().notifyObservers(new FightMovementEvent(f, action));
				}
				
				break;
			}
			case CINEMATIC:
			{
				if(sArgs instanceof Trigger){
					Trigger t = (Trigger)sArgs;
					//Enleve le perso de l'ancienne map
					p.getMap().updateSpriteList(SynActions.MapAction.REMOVE_SPRITE, p);
					
					p.setMapID(t.targetMap);//Set la map ID du perso
					p.setCellID(t.targetCell);//Ajoute le perso à la nouvelle map
					
					//GlobalWorld.getMap(p.getgWorld(), mapID).updateCharacterList(SynActions.MapAction.ADD_CHARACTER, p);
					SM.Game.GDM(p.getClient().getSession(), p.getMap());
					
					/*
					 * Leech sur Zen:
					Game: Recv << GA001fdEgdbfcfecd   //start le mouvement
					[Send] >> GA0;1;25;ad8fdEgdbfcfecd  //le perso bouge
					Recv << GKK0  //fin du mouvement, arrivée sur le trigger
					[Send] >> BN
					[Send] >> GA;2;25; //cinématique 2
					[Send] >> GM|-25   //enleve le perso de la map
					[Send] >> GDM|1158|0706131721|25323520732d7138734e6a4f2220594144627442263b4c6762737c4d373a6c4e382532426a267444714f51667a2a586c265e755976584d22514b6370767c4a7076652d5f57253242772c527b3b34253235313d4b5b78245e3146392164714e3c31637372536733495c5c563a4e47473631427d644641237d4d25323533755148655852537938782e6d322153695b3224656827612d704d572a665d28697958276b453322395b666531322e215d326f41285e513b452532423d6b44323772653143495a564c5f7b7c744f6a79705a70576974792352205f5758736f2532422e7e347921
					Game: Recv << GI  //la map a fini de charger, le client envoie GI.
					[Send] >> GM|+158;1;0;-108;1112;-10;8100^100;1;1;2     //affichage des sprites de la nouvelle map
					[Send] >> GM|+158;4;0;25;Sadiq;10;101^100;1;2,0,1,160;-1;-1;-1;1955,21b8,21c4,13888~18~3,;0;;;;;0;;;
					 */
				}else{
					Exceptions.throwIllegalArgumentException("ActionsPlugin.Application.apply.CINEMATIC : sArgs != instanceof Trigger.");
				}
				break;
			}
			case LANCER_SORT://300 
			{	
				GFight f = p.getFight();
				if(true){ //p.getFight() != null){// && p.getFight.getCurFighter == p){
					//todo
					if(spriteTargetID == 0 || targetCellID == 0){
						Syn.log.warn("ActionsPlugin.apply().case LANCER_SORT: if(spriteTargetID == 0 || targetCellID == 0)");
						return false;
					}
					GSpell s = p.getSpellByID(spriteTargetID);
					if(s == null){
						SM.Messages.M(p, "Vous ne possédez pas le sort demandé ("+spriteTargetID+") ", Constants.COLOR_RED);
						return false;
					}
					SM.Game.GAS(p);
					boolean success = new SpellApplication().applySpell(s, null, p, targetCellID);
					//TODO retirer les PA :p.getStatistique().decrementValue(CharacteristicType.PA, s.getPA(), CharacteristicColumn.BOOST);
					//GBuff b = GBuff.createNew(p.getServer().getEffectsManager().getAddPaEffect().getOppositeEffect(), null, new Jet((short) s.getPA()), (byte) 1, GBuff.BuffApplicationType.OneShot);
					//p.addBuff(b);
					//b.apply(p, p.getFight(), BuffApplicationType.OneShot);//Retire les PA dans les GStats du personnages 
					//b.decrementRemainingTurns();//Met le RemainingTurns à 0 pour qu'il soit debuff à fin du tour
					p.getStatistique().decrementValue(CharacteristicType.PA, s.getPA(), CharacteristicColumn.FIGHT);
					
					ActionsManager am = main.pm.getActionsManager();
					GAction pa = am.getFactory().newPaChangedAction(p, -s.getPA());//new GAction(p.getWorld().getNextActionID(), GameActionType.PA_CHANGED.getType(), "-"+s.getPA());
					p.addAction(pa);
					SM.Game.GA_LAYER(p, pa);
					SM.Game.GAF(am.getSpellEndActionID(), p);

					f.getStateMachine().notifyObservers(new FightSpellEvent(f, action));
				}
				break;
			}
			case LANCER_SORT_CAC://303 Corps à corps
			{
				GFight f = p.getFight();
				if(true){ //p.getFight() != null){// && p.getFight.getCurFighter == p){
					if(Utils.isParsableInteger(""+action.getSpecialArgs())){
						targetCellID = Short.parseShort(""+action.getSpecialArgs());
					}else{
						Syn.log.warn("ActionsPlugin.apply().case LANCER_SORTCAC: spellID non-parsable en chiffre.");
						return false;
					}
					GItem arme = p.getInventory().getItemByPosition(Enums.ItemPosition.POS_arme.get());
					boolean success = false;
					if(arme != null){
						success = new SpellApplication().applySpell(null, arme, p, targetCellID);
					}else{
						GSpell[] s = p.getWorld().getSpell(CSpells.specialSpell_CAC);//coup de poing (cac sans arme)
						if(s != null && s.length > 0 && s[0] != null){
							success = new SpellApplication().applySpell(s[0], null, p, targetCellID);
						}
					}
					SM.Game.GAS(p);
					//TODO retirer les PA : p.getStatistique().decrementValue(CharacteristicType.PA, arme.getTemplate().getPA(), CharacteristicColumn.BOOST);
					//GBuff b = GBuff.createNew(p.getServer().getEffectsManager().getAddPaEffect().getOppositeEffect(), null, new Jet((short) arme.getTemplate().getPA()), (byte) 1, GBuff.BuffApplicationType.OneShot);
					//p.addBuff(b);
					//b.apply(p, p.getFight(), BuffApplicationType.OneShot);//Retire les PA dans les GStats du personnages 
					//b.decrementRemainingTurns();//Met le RemainingTurns à 0 pour qu'il soit debuff à fin du tour
					p.getStatistique().decrementValue(CharacteristicType.PA, arme.getTemplate().getPA(), CharacteristicColumn.FIGHT);
					
					ActionsManager am = main.pm.getActionsManager();
					GAction pa = am.getFactory().newPaChangedAction(p, -arme.getTemplate().getPA());
					p.addAction(pa);
					SM.Game.GA_LAYER(p, pa);
					SM.Game.GAF(am.getSpellEndActionID(), p);
					f.getStateMachine().notifyObservers(new FightSpellEvent(f, action));
				}
				break;
			}
			case CHALLENGE:
			{
				//TODO
				
				/*	 Game: Recv << GA90034
					[Send] >> GA;900;25;34
					[Send] >> GA;900;25;34*/
				if(p.getFight() != null ){//|| p.isAway()){
					//SM.Game.GA(p, action.setType(ERROR_ON_JOIN_FIGHT.getType()).setSpecialArgs(ERROR_CANT_YOU_OCCUPED.getSpeArgs()));
					return false;
				}
				GPersonnage target = p.getWorld().getPerso(spriteTargetID);
				if(target != null && target.getFight() != null ){//|| target.isAway()){
					//SM.Game.GA(p, action.setType(ERROR_ON_JOIN_FIGHT.getType()).setSpecialArgs(ERROR_CANT_YOU_OPPONENT_OCCUPED.getSpeArgs()));
					return false;
				}
				action = main.pm.getActionsManager().getFactory().newChallengeAction(p);
				SM.Game.GA_LAYER(p, action);
				break;
			}	
			case ACCEPT_CHALLENGE://lance un combat de fif, easy
			{
				//TODO
				break;
			}
			case REFUSE_CHALLENGE://la vie est belle
			{
				//TODO
				break;
			}
			case JOIN_FIGHT:
			{
				//GA 903 1 ; 37  -> actionType 903, fightID 1, teamLeaderStarterCharacterID 37
				ArrayList<GFight> fights = p.getMap().updateFightsList(MapAction.GET_FIGHTS, null);
				for(GFight f : fights){
					if(f.getID() == spriteTargetID){
						int teamID = f.getTeamLeaderID(targetCellID);
						f.join(p, teamID);//targetCellID
					}
				}
				break;
			}
				
				
				
			
				
			case EXE_JAVASCRIPT:
			{
				try {
					engine = manager.getEngineByName("JavaScript");
					engine.eval(new java.io.FileReader("Syn_scripts/actionscript.js"));
					Invocable inv = (Invocable) engine;
					GPersonnage t = null;
					for(ISprite s : p.getMap().getSpritesSynchroFull()){
						if(s.getCellID() == targetCellID && s instanceof GPersonnage){
							t = ((GPersonnage)s);break;
							//prend lobjet caster pour stocker le target lol, 
							//fuck en créé un nouveau , jai déjà une copie dans la var "p" xd
						}
					}
			        inv.invokeFunction("exe", p, t, targetCellID, CharacteristicColumn.TOTAL);
			        engine = null;
				} catch (FileNotFoundException e1) {e1.printStackTrace();} catch (ScriptException e1) {e1.printStackTrace();} catch (NoSuchMethodException e1) {e1.printStackTrace();}
				break;
			}
			case ON_ITEM_USE://Utilisé par les ActionsListeners :)
			{
				if(action.getSpecialArgs() instanceof GItem){
					GItem i = ((GItem)action.getSpecialArgs());
					SM.Messages.M(p, "Yo, you just used an item of template "+i.getTemplate().getType()+".   Liste d'effets de l'item : "+i.getEffectsPacket(main.pm.getEffectsManager()), Constants.COLOR_BLUE2);
					
					if( main.pm.getEffectsManager().containsEffectObjetEnclos(i.getEffects()) &&
						i.getTemplate().getType() == Enums.ItemType.ITEM_TYPE_OBJET_ELEVAGE.getValue()){
						GDropItemProvider gdip = p.getServer().getProviders().provideDropItem();
						GDropItem gdi = gdip.createNew(i, p.getWorld(), targetCellID);//new GDropItem(i, targetCellID);
						//TODO - afficher le sprite de l'objet d'enclos avec la durabilité, etc.
						//- (dabord vérifier si la cell visée strouve bien dans un enclos)
						//- peut-être donner un paramètre "owner" au gdi 
						//   -pour que ce soit uniquement lui qui peut le retirer/reprendre
						
					}
					if(i.getTemplate().getType() == ItemType.ITEM_TYPE_BONBON.getValue()){
						GPersonnage target = p.getWorld().getPerso(spriteTargetID);
						if(target == null || target.getMap() != p.getMap() || spriteTargetID == 0){
							target = p;
						}
						for(GEffect e : i.getEffects()){
							String SA = e.getSpecialArg();// v c'est le paramètre entre les deux autres:  morph;turns;probabilité
							Byte tours = Byte.parseByte(e.getSpecialArg().substring(SA.indexOf(";")+1, SA.lastIndexOf(";")));
							GBuff b = GBuff.provideBuff(p.getWorld()).createNew(e, tours, BuffApplicationType.OneShot);
							target.addBuff(b);
							if(b.getParams().isDice() && b.getDice().getWorstShot() == b.getDice().getBestShot()){
								b.setJet(new Jet(b.getDice().getBaseBoost()));
							}
						}
					}
				}
				break;
			}

			default:
				log.debug("Manque l'action "+action.getType()+" "+GameActionType.getGameAction(action.getType())+" dans l'ActionsPlugin à Application.apply");
				SM.Messages.M(p, "L'action "+action.getType()+" "+GameActionType.getGameAction(action.getType())+" n'est pas encore ajouté aux applications !", Constants.COLOR_PINK);
				return false;
		}
		if(p.getCharacterType() == CharacterType.PLAYER){
			SM.Messages.M(p, "L'action "+action.getType()+" "+GameActionType.getGameAction(action.getType())+" a été appliqué !", Constants.COLOR_PINK);
		}
		
		return true;
	}

	
	
	@Override
	public boolean applyOnDone(GPersonnage p, GAction a) {
		boolean removeSuccess = p.getActions().remove(a);
		switch(GameActionType.getGameAction(a.getType())){
			case MOVEMENT:
				//p.getMap().onMovementFinish(p, a);
				AbstractPath ap = null;
				if(a.getSpecialArgs() instanceof AbstractPath){
					ap = (AbstractPath) a.getSpecialArgs();
				}else{
					Exceptions.throwIllegalArgumentException("Map.onMovementFinish.action.getSpecialArgs instanceof Path == false !  Ca devrait etre un path !");
				}
				p.setCellID((ap).last().cell());//set la curCell à la nouvelle cell
				p.setOrientationID((ap).last().orientation());//set la curOrientation à la nouvelle orientation
				SM.Basics.BN(p.getClient().getSession());
				
				GFight f = p.getFight();
				if(f != null){
					//SM.Game.GTM_FIGHT(f, false);
					//TODO : Send packet d'affiche des PM utilisés
					return true;
				}
				
				GDropItem gdi = null;
				GMonsterGroup mgroup = null;
				ArrayList<ISprite> sprites = p.getMap().getSpritesSynchroFull();
				if(sprites != null && sprites.size() > 0){
					for(ISprite s : sprites){
						if(s.getCellID() == p.getCellID()){
							if(s instanceof GMonsterGroup){
								mgroup = (GMonsterGroup) s;
							}else
							if(s instanceof GDropItem){
								gdi = (GDropItem) s;
							} 
						}
					}
				}
				
				//Ramassage d'objets tombés par terre.
				if(gdi != null && p.getInventory().isOverweight(p) == false){
					//TODO Ajoute l'item au perso et enleve le de la liste d'ici
					p.getMap().updateSpriteList(REMOVE_SPRITE, gdi);//enleve de la liste et de l'affichage de sur la map
					p.getInventory().addItemWithPackets(p, gdi);//ajoute l'item au perso et envoie les packets d'affichage de l'inventaire
				}else if(gdi != null){
					SM.Infos.Im(p, ImType.ERROR, ImPackets.InventairePlein, "");
				}
				
				//S'occupe des triggers et autres actions
				ParameterHolder ph = new ParameterHolder();
				ph.mapID = p.getMapID();
				ph.cellID = p.getCellID();
				notifyListeners(ON_CELL_ARRIVE, p, ph);
				
				//Lance un combat s'il y a des monstres:
				if(mgroup != null){
					FightFactory.createNewPVM(p, mgroup);
				}
				
				/*Trigger t = p.getMap().getTrigger(p.getCellID());
				if(t != null){
					if(GlobalWorld.getMap(p.getWorld(), t.targetMap) != null){
						//Action de "cinématique" de "Chargement de la map" sur fond noir->(Action de changemet de map.)->Voir le case CINEMATIC ici dans .apply
						ActionsManager.apply(p, Constants.ZERO_SHORT, Constants.ZERO_SHORT, new GAction(p.getWorld().getNextActionID(), (short) 2, t)); //GAunicID;2;persoid;
					}
				}*/
				return true;
			default:
				//TODO: Ajouter les autres applyOnDone (GKK) des autres types d'actions :P
				return removeSuccess;
		}
	}
	
	@Override
	/**
	 * mettre param == Short.MIN_VALUE pour hard-cancel l'action. ()enleve du stack+envoie GA0;0;; + return true;) 
	 */
	public boolean applyOnCancel(GPersonnage p, GAction a, short param) {
		p.getActions().remove(a);
		if(param == Short.MIN_VALUE){
			SM.Game.GA(p, a.setID2(0).setType(Constants.ZERO_SHORT).setSpecialArgs(""));//GA;0;0;
			return true;
		}
		switch(GameActionType.getGameAction(a.getType())){
			case MOVEMENT:
				//le param ici = une cellID.
				p.setCellID(param);//set la curCell à la nouvelle cell
				p.setOrientationID(((AbstractPath)a.getSpecialArgs()).last().orientation());//set la curOrientation à la nouvelle orientation
				break;
			default:
				//TODO IL N'Y A AUCUN AUTRE TYPE D'ACTION QUI SOIT CANCELLABLE PAR LE CLIENT OFFICIEL  [In ActionsPLugin]
				//ON POURRAIT BAN 
				GHandler.packetCantParse(p.getClient(), "a.SpecialArgs: "+a.getSpecialArgs()+".  a.toString:"+a.toString(), "ActionsPlugin.Application.applyOnCancel : mauvais argument : l'action n'a pas un type cancellable comme les mouvements. Son type est "+a.getType());
				return false;
		}
		SM.Basics.BN(p.getClient().getSession());
		return true;
	}
	
	
	


	@Override
	public short getMovementActionID() {
		return MOVEMENT.getType();
	} 
	@Override
	public boolean actionTypeExists(short actionTypeID) {
		return GameActionType.getGameAction(actionTypeID) != null;
	}


	@Override
	public boolean isMovementAction(short actionTypeID){
		return GameActionType.getGameAction(actionTypeID) == MOVEMENT;
	}



	@Override
	public void notifyListeners(SynActions type, GPersonnage p, ParameterHolder o){
		ArrayList<AbstractActionListener> actions = new ArrayList<AbstractActionListener>();
		AbstractActionListener t = null;
		if((t = p.getWorld().getListener(type)) != null){
			actions.add(t);
		}
		if((t = p.getMap().getActionsListener(type)) != null){
			actions.add(t);
		}
		if(actions.size() > 0){
			for(AbstractActionListener aal : actions){
				aal.actionPerformed(p, o);//le isCompleted est callé à l'intérieur du actionPerformed :P
			}
		}
	}
	
	
	@Override
	public void notifyListeners(String typ, GPersonnage p, ParameterHolder o, boolean alias){
		ActionListenerType type = null;
		if(alias){
			if((type = actionListenersAlias.get(typ)) == null){
				Syn.d("Dans ActionsPlugin.Application.notifyListeners, la string d'actionListenerType en paramètre (ALIAS) est invalide: type introuvable dans l'HashMap :("+typ+")");
				//Exceptions.throwIllegalArgumentException("Dans ActionsPlugin.Application.notifyListeners, la string d'actionListenerType en paramètre (alias) est invalide: type introuvable dans l'hashMap :("+typ+")");
				return;
			}
		}else{
			if((type = ActionListenerType.valueOf(typ)) == null){
				Syn.d("Dans ActionsPlugin.Application.notifyListeners, la string d'actionListenerType en paramètre (Non-Alias) est invalide: type introuvable dans l'enum :("+typ+")");
				//Exceptions.throwIllegalArgumentException("Dans ActionsPlugin.Application.notifyListeners, la string d'actionListenerType en paramètre (non-alias) est invalide: type introuvable dans l'enum :("+typ+")");
				return;
			}
		}
		ArrayList<AbstractActionListener> actions = new ArrayList<AbstractActionListener>();
		AbstractActionListener t = null;
		if((t = p.getWorld().getListener(type)) != null){
			actions.add(t);
		}
		if((t = p.getMap().getActionsListener(type)) != null){
			actions.add(t);
		}
		if(p.getInteraction() != null && (t = p.getInteraction().getActionsListener(type)) != null){
			actions.add(t);  //prend les listeners du PNJ actuellement en interaction avec le personnage
		}
		if(actions.size() > 0){
			for(AbstractActionListener aal : actions){
				aal.actionPerformed(p, o);//le isCompleted est callé à l'intérieur du actionPerformed :P
			}
		}
		actions = null;
	}
	
	
	@Override
	public AbstractActionListener createListener(int ID, String type, String conditions, AbstractWorld w, String effectsActions) {
		return new gActionListener(ID, ActionListenerType.valueOf(type), conditions, w, effectsActions);
	}

	@Override
	public SynActions getActionListenerType(String type) {
		return ActionListenerType.valueOf(type);
	}

	public HashMap<String, ActionListenerType> getActionListenersAlias() {
		return actionListenersAlias;
	}
	public void setActionListenersAlias(HashMap<String, ActionListenerType> actionListenersAliass) {
		actionListenersAlias = actionListenersAliass;
	}
	@Override
	public boolean putActionListenerAlias(String alias, String actionListenerType) {
		ActionListenerType type = ActionListenerType.valueOf(actionListenerType);
		if(type != null){
			actionListenersAlias.put(alias, type);
			return true;
		}else{
			return false;
		}
	}
	@Override
	public void clearActionListenersAlias(){
		actionListenersAlias.clear();
	}

	

/*	/ **
	 * <b>Vérifie et actionne toutes les actions (dont le type == celui en parametre) qui peuvent être actionner</b>
	 * <p>Exemple 1: les dalles pour ouvrir la porte du donjon d'Incarnam ou la porte du donjon du Kralamour
	 * <br>Il va donc vérifier tous les actionListener qui ont le même type, sont associés à des cells et dont les conditions sont remplies pour être 
	 * <p>Exemple 2: on peut mettre le type "endFightAction" en parametre et exécuter cette method à la fin du combat 
	 *    pour par exemple téléporter le joueur (donjon), lui donner un item récompense, etc
	 * <p>Exemple 3: on peut mettre le type "onArriveOnMap" pour par exemple démarrer des animations de PNJs dynamiques
	 * 	  lorsque le joueur arrive sur la map ou encore lui donner une récompense, achievement, quête(l'objectif "découvrir la carte")...  
	 * /
	public void notifyListeners(ArrayList<AbstractActionListener> actionsListeners, ActionListenerType typeToCheck, GPersonnage p){
		boolean areAllCompleted = true;
		AbstractActionListener master = null;
		ArrayList<AbstractActionListener> actions = new ArrayList<AbstractActionListener>(actionsListeners);
		
		while(actions.isEmpty() == false){
			while(master == null || master.isCompleted(p) == false /*&& master.getType() != typeToCheck* /){
				master = actions.remove(0);//Prend un bon master déjà completed avec le bon type et l'enleve de la copiedlist
			}
			for(int i = actionsListeners.size()-1; i >= 0; i--){
				//Check toutes les actionListeners qui ont le meme type que le master sans être le master lui meme
				if(actionsListeners.get(i) != master /*&& actionsListeners.get(i).getType() == master.getType()* /){
					if(actionsListeners.get(i).isCompleted(p) == false){
						areAllCompleted = false;
						i = -1;
					}
					actions.remove(actions.get(i));
				}
			}
			//Si toutes les actions du même type que le master sont complétées, on active l'action à exécuter (style ouvrir une porte)
			if(areAllCompleted){
				master.actionPerformed(p);
			}
		}
	}
*/


	@Override
	public Event execute(Event event) {
		if(event.getEventType() == MiscEvent.Set_PluginsManager){
			main.pm = (PluginsManager) event.getSource();
		}else
		if(event.getEventType() == MiscEvent.Load_Plugins_ActionListenersAlias){
			this.initiateActionListenersAlias();	
		}else{
			Syn.log.error("ActionsPlugin.Application.execute ne devrait jamais être appelé sauf pour initier les ActionsListenersAlias");
		}
		return null;
	}

	public void initiateActionListenersAlias(){
		//Exemples v
		//ActionsManager.putActionListenerAlias("OM", "ON_ITEM_MOVEMENT");
		//ActionsManager.putActionListenerAlias("OD", "ON_ITEM_DROP");
		//ActionsManager.putActionListenerAlias("Od", "ON_ITEM_DELETE");
		//ActionsManager.putActionListenerAlias("OU", "ON_ITEM_USE");//no Confirmation required.
		//ActionsManager.putActionListenerAlias("Ou", "ON_ITEM_USE");//askConfirmation
		//ActionsManager.putActionListenerAlias("Ox", "ON_ITEM_DISSOCIATE");
		//ActionsManager.putActionListenerAlias("Os", "ON_ITEM_SETSKIN");
		//ActionsManager.putActionListenerAlias("Of", "ON_ITEM_FEED");
	}




	/**
	 * Type d'end action pour le packet GAF à envoyer à la fin d'un mouvement.
	 * @return - 0
	 */
	public byte getMovementEndActionID(){
		return GameActionEndType.MOVEMENT.get();
	}
	/**
	 * Type d'end action pour le packet GAF à envoyer à la fin du lancement d'un sort.
	 * @return - 2
	 */
	public byte getSpellEndActionID(){
		return GameActionEndType.SPELL.get();
	}



	@Override
	public boolean endActionTypeExists(byte arg0) {
		return GameActionEndType.get(arg0) != null;
	}
	



	
	
	
}
