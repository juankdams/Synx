package ActionListening;

import java.util.ArrayList;

import Abstractions.AbstractWorld;
import Constants.Constants;
import Core.Syn;
import Enums.ActionListenerType;
import Enums.Condition;
import Enums.SynActions;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GPersonnage;
import GlobalObjects.EffectsShare;
import Interfaces.IObject;
import Misc.ParameterHolder;
import Plugins.Abstractions.AbstractActionListener;
import Plugins.Managers.PluginsManager;

public class gActionListener extends AbstractActionListener {

	private int ID = 0;
	public ActionListenerType type = null;
	//public boolean isCompleted = false;
	public String conditions = "";//Les conditions à remplir pour que le isCompleted soit true.
	//public short param = 0; //(Peut par exemple être la cellID ou se trouve l'action contenue dans l'arraylist ) 
			//(Utile pour quand un joueur arrive sur une cell, faut vérifier les actionListener)
	
	public ArrayList<GAction> actions = null;
	public ArrayList<GEffect> effects = null;
	
	
	public gActionListener(int id, ActionListenerType type, String conditions, AbstractWorld w, String info){
		this.ID = id;
		this.type = type;
		this.conditions = conditions;
		//this.param = param;
		//this.actions = actions;
		//this.effects = effects;
		if(info != "" && w != null){
			parseActionsAndEffects(w, info);
		}
	}
	
	/**
	 * You know des methods sans l'identificateur public/private/protected,
	 * <br>ca veut dire "global" pis sont accessibles à toutes les classes du même package seulement.
	 * @param gw - GWorld pour pouvoir caller gw.getNextActionID() pour les actions du Listener
	 * @param info - String à parser en GActions et GEffects
	 */
	private void parseActionsAndEffects(AbstractWorld gw, String info){ 
		String effectAction[] = info.split("\\|");
		for(int i = effectAction.length-1; i >= 0; i--){
			//Syn.d("i="+i);
			if(effectAction[i].startsWith("E")){
				//Syn.d("e="+e);
				if(effects == null){
					effects = new ArrayList<GEffect>();
				}
				effects.add(EffectsShare.getSimilarEffect(effectAction[i].substring(2), false, gw));
			}else if(effectAction[i].startsWith("A")){
				//Syn.d("a="+a);
				if(actions == null){
					actions = new ArrayList<GAction>();
				}
				String ac = effectAction[i].substring(2);
				actions.add(
						new GAction(gw.getNextActionID(),  Short.parseShort(ac.substring(0,ac.indexOf(";"))),  ac.substring(ac.indexOf(";")+1)  )
				);
			}
		}
	}
	
	@Override
	public void actionPerformed(GPersonnage p, ParameterHolder ph) {
		Syn.d("gActionListener("+ID+").actionPerformed");
		PluginsManager pm = p.getServer().getPluginsManager();
		if(isCompleted(p, (IObject) (ph == null ? null : ph.condition))){
			if(ph == null){
				ph = new ParameterHolder();
			}
			if(actions != null && actions.size() > 0){
				for(GAction a : actions){
					Syn.d("gActionListener("+ID+").actionPerformed. action.ID="+a.getID());
					GAction copy = a.getCopy(p.getWorld().getNextActionID());
					if((copy.getSpecialArgs()+"").toLowerCase().contains("%addtopersoactionlist%")){
						p.getActions().add(copy);
					}
					if((copy.getSpecialArgs()+"").toLowerCase().contains("%iobject%")){
						copy.setSpecialArgs(ph);
					}
					pm.getActionsManager().apply(p, Constants.ZERO_SHORT, Constants.ZERO_SHORT, copy);
				}
			}
			if(effects != null && effects.size() > 0){
				for(GEffect e : effects){
					Syn.d("gActionListener("+ID+").actionPerformed. effect.getID="+e.getEffectID());
					if(e.getSpecialArg().indexOf("%mapID=") != -1){
						ph.mapID = Integer.parseInt(e.getSpecialArg().substring(e.getSpecialArg().indexOf("%mapID=")+1, e.getSpecialArg().indexOf("%", e.getSpecialArg().indexOf("%cellID="))));
					}else if(e.getSpecialArg().indexOf("%cellID=") != -1){
						ph.cellID = Short.parseShort(e.getSpecialArg().substring(e.getSpecialArg().indexOf("%cellID=")+1, e.getSpecialArg().indexOf("%", e.getSpecialArg().indexOf("%cellID="))));
					}
					pm.getEffectsManager().applyEffect(e, p, p, ph);
				}
			}
		}else{
			Syn.d("gActionListener("+ID+").actionPerformed.conditions Non Remplies");
		}
		// TODO Auto-generated method stub
		//Ici, par exemple pour l'ouverture de l'antre du kralamour, 
		//	chaque actionListener ferait la même action, cad ouvrir la porte.
		//  sauf que chaque actionListener doit voir ses conditions remplies 
		//	et ces dernieres ne sont pas les mêmes partout.
		//	Alors peu importe quelle action on active, faut juste bien vérifier les conditions de toutes les actions.
		
		//ptete mettre un objet GAction dans le listener, faudra voir aussi avec les packets de l'officiel c'quon est supposé faire
		
		/*
		 Si ce systeme n'est pas adéquat, faudra mettre une string conditions dans class GAction
		 	et faire un genre de wrapper "GroupedActions" pour mettre ensemble les actions qui sont reliées 
		 		(comme les dalles de lentrée du krala)
		 	
		 Même que jpense que jaime déjà mieux le concept de groupedactions, 
		 c'pas vraiment organisé et bien fait les gActionListener.
		 Sauf que c'quiest bien cest davoir un listener sur chaque dalle qui en a besoin.
		 */
	}

	@Override
	public boolean isCompleted(GPersonnage p, IObject o){
		//if(type == ON_CELL_ARRIVE && param != p.getCellID()){
		//	return false;
		//}
		//if(type == ON_MAP_ARRIVE && param != p.getMapID()){
		//	return false;
		//}
		if(Condition.parseConditions(conditions, p, o) == false){
			return false;
		}
		
		/*switch(type){
			case ON_START_FIGHT:
			case ON_END_FIGHT:
				break;
			case ON_CELL_ARRIVE:
				if(param != p.getCellID()){
					return false;
				}
				break;
			case ON_MAP_ARRIVE:
				if(param != p.getCellID()){
					return false;
				}
				break;
			case ON_SUPER_AREA_ARRIVE:
			case ON_AREA_ARRIVE:
			case ON_SUB_AREA_ARRIVE:
			case ON_DIE:
			case ON_TALK:
			case ON_ITEM_DROP:
			case ON_ITEM_DELETE:
				break;
		}
		//TODO Auto-generated method stub
		//verifie que les conditions soient remplies 
		*/
		return true;
	}

	@Override
	public ArrayList<GAction> getActions() {
		return actions;
	}

	@Override
	public ArrayList<GAction> setActions(ArrayList<GAction> actions) {
		this.actions = actions;
		return actions;
	}

	@Override
	public ArrayList<GAction> addAction(GAction a) {
		if(actions == null){
			actions = new ArrayList<GAction>();
		}
		this.actions.add(a);
		return actions;
	}

	@Override
	public boolean isContainer() {
		return false;
	}

	@Override
	public SynActions getType() {
		return type;
	}
	

	@Override
	public AbstractActionListener addListener(AbstractActionListener listener) {
		gActionListenerContainer galc = new gActionListenerContainer(ID, type, conditions, null, actions, effects, null);
		galc.addListener(listener);
		return galc;
	}

	@Override
	public ArrayList<AbstractActionListener> getListeners() {
		return null;
	}

	@Override
	public AbstractActionListener setListeners(ArrayList<AbstractActionListener> listeners) {
		gActionListenerContainer galc = new gActionListenerContainer(ID, type, conditions, null, actions, effects, listeners);
		return galc;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public ArrayList<GEffect> addEffect(GEffect e) {
		if(effects == null){
			effects = new ArrayList<GEffect>();
		}
		effects.add(e);
		return effects;
	}

	@Override
	public ArrayList<GEffect> getEffects() {
		return effects;
	}

	@Override
	public ArrayList<GEffect> setEffects(ArrayList<GEffect> e) {
		effects = e;
		return effects;
	}

	
	
}
