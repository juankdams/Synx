package ConfigurationObjects;

import static Constants.Constants.ZERO_SHORT;
import Abstractions.AbstractCharacter;
import Enums.Condition;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GPersonnage;
import GameObjects.GWorld;
import GlobalObjects.EffectsShare;
import Interfaces.ISprite;
import Misc.ParameterHolder;
import Misc.StringUtils;
import Plugins.Managers.ActionsManager;
import Plugins.Managers.EffectsManager;

public class Command {

	private short ID = 0;
	private String name = "";
	private GEffect[] effects = null;
	private GAction[] actions = null;
	private String conditions = null;
	private String[] parameters = null;
	//private String[][] configuration = null;
	
	public static Command createNew(short ID, String name, String effectAction[], String conditions, String parameters[], GWorld gw){//, String configuration[][]){
		//Syn.d("Creating Command "+name);
		EffectsManager em = gw.getServer().getEffectsManager();
		Command c = new Command();
		c.setID(ID);
		c.setName(name);
		byte e = 0;
		byte a = 0;
		for(int w = 0; w <= 1; w++){
			//Syn.d("w="+w);
			for(int i = effectAction.length-1; i >= 0; i--){
				//Syn.d("i="+i);
				if(effectAction[i].startsWith("E") && e >= 0){
					//Syn.d("e="+e);
					if(w == 1){
						c.effects[--e] = EffectsShare.getSimilarEffect(effectAction[i].substring(2), false, gw);
					}else{
						e++;
					}
				}else if(effectAction[i].startsWith("A") && a >= 0){
					//Syn.d("a="+a);
					String ac = effectAction[i].substring(2);
					if(w == 1){
						c.actions[--a] = new GAction(gw.getNextActionID(),  Short.parseShort(ac.substring(0,ac.indexOf(";"))),  ac.substring(ac.indexOf(";")+1)  );
					}else{
						a++;
					}
				}
			}
			if(w == 0){
				c.effects = new GEffect[e];
				c.actions = new GAction[a];
			}
		}
		//Syn.d("Fini de créer la Command.");
		c.setConditions(conditions);
		c.setParameters(parameters);
		//c.setConfiguration(configuration);
		return c;
	}
	
	/**
	 * TODO: à refaire, c'pas assez modulable facilement et c'trop lourd. c'est vraiment laid et mauvais.
	 */
	public void apply(GPersonnage caster, String input){
		if(conditions.length() > 0 && Condition.parseConditions(conditions, caster, null)){
			return;
		}
		EffectsManager em = caster.getServer().getEffectsManager();
		ActionsManager am = caster.getServer().getActionsManager();
		ParameterHolder eap = new ParameterHolder();
		GWorld gw = caster.getWorld();
		GPersonnage target = null;
		int mapTarget = caster.getMapID();
		short cellTarget = 0;
		int nextIndex = 0;
		for(int i = parameters.length-1; i >= 0; i--){//Parametrages d'input ex: item [id] [qty]
			int truc = StringUtils.indexOf(input, " ", i);
			int endtruc = StringUtils.indexOf(input, " ", i+1);
			if(truc == endtruc){
				endtruc = input.length()-1;
			}
			if(parameters[i].equals("%targetName%")){//Euh TODO, le nom du perso a pas vrm rapport dans les specialArgs de l'effet ...
				target = gw.getPersoByName(input.substring(truc, endtruc));
			}else if(parameters[i].equals("%mapID%") || parameters[i].equals("%itemID%")){
				mapTarget = Integer.parseInt(input.substring(truc, endtruc));
			}else if(parameters[i].equals("%cellID%") || parameters[i].equals("%quantity%")){
				cellTarget = Short.parseShort(input.substring(truc, endtruc));
			}
		}
		eap.fight = caster.getFight();
		eap.mapID = mapTarget;
		eap.cellID = cellTarget;
		for(GEffect e : effects){//Parametrage interne style .shop qui envoit en (ex) 7411,311
			if(e.getSpecialArg().equals("0") && parameters[0].equals("")){
				em.applyEffect(e, caster, null, eap);
				continue;
			}
			String effParam = e.getSpecialArg();
			do{
				if(effParam.indexOf("%mapID%=") != -1){
					mapTarget = Integer.parseInt(effParam.substring(effParam.indexOf("%mapID%=")+1, effParam.indexOf("@")));
				}else if(effParam.indexOf("%cellID%=") != -1){
					cellTarget = Short.parseShort(effParam.substring(effParam.indexOf("%cellID%=")+1, effParam.indexOf("@")));
				}
				if(e.getSpecialArg().indexOf("@", nextIndex) != -1){
					effParam = e.getSpecialArg().substring(nextIndex, nextIndex = e.getSpecialArg().indexOf("@", nextIndex));
				}else if(nextIndex != e.getSpecialArg().length()){
					effParam = e.getSpecialArg().substring(nextIndex, nextIndex = e.getSpecialArg().length());
				}else{
					effParam = "";
				}
			}while(!effParam.equals(""));
			
			eap.cellID = cellTarget;
			eap.mapID = mapTarget;
			
			if(target == null && cellTarget != 0){
				for(ISprite is : caster.getMap().getSpritesAtCell(cellTarget)){
					if(is instanceof AbstractCharacter){
						em.applyEffect(e, caster, (AbstractCharacter)is, eap);
					}
				}
			}else if(target == null && cellTarget == 0){
				em.applyEffect(e, caster, caster, eap);
			}else{
				em.applyEffect(e, caster, target, eap);
			}
		}
		for(GAction a : actions){//Parametrage des GActions
			am.apply(caster, ZERO_SHORT, ZERO_SHORT, a);
		}
	}

	
	public void setID(short iD) {
		ID = iD;
	}

	public short getID() {
		return ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public GEffect[] getEffects() {
		return effects;
	}

	public void setEffects(GEffect[] effects) {
		this.effects = effects;
	}

	public GAction[] getActions() {
		return actions;
	}

	public void setActions(GAction[] actions) {
		this.actions = actions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getConditions() {
		return conditions;
	}

	public void setParameters(String[] parameters) {
		this.parameters = parameters;
	}

	public String[] getParameters() {
		return parameters;
	}

	
}
