package MacroScripting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Abstractions.AbstractCharacter;
import Core.Syn;
import Enums.Orientation;
import GameObjects.GAction;
import GameObjects.GEffect;
import GlobalObjects.EffectsShare;
import Misc.CodeInput;
import Plugins.Abstractions.AbstractFormulings.AbstractNode;
import Plugins.Abstractions.AbstractFormulings.AbstractPath;


public class Directive {

	public static enum DirectiveType{
		CALL_METHOD,
		CALL_CHAT,
		CALL_EMOTE,
		CALL_DIRECTION,
		CALL_VAR,
		CALL_GOTO,
		
		CALL_EFFET,
		CALL_MOVEMENT,
		
	}//End of Enum
	public static enum ScopeType{
		TO_MAP,
		TO_TARGET,
		TO_SUBZONE,
		TO_ZONE,
		TO_SUPERZONE,
		TO_ALL;
	}//End of Enum
	
	
	
	
	public DirectiveType type = null;
	public ScopeType scope = null;//pour l'envoie des packets
	public Bloc parent = null;//le bloc contenant cette directive
	//public ArrayList<Directive> insideDirectives = null;
	public String content = null;//la string contenue de cette directive
	public Object o = null;//l'objet créé en préloadant la directive
	
	public Directive(Bloc b){
		parent = b;
	}
	
	public void preload(String str){
		Syn.d("Directive.preload ("+str+")");
		String name = str.substring(0, str.indexOf(":"));
		type = DirectiveType.valueOf("CALL_"+name);
		content = str.substring(str.indexOf(":") + 1 , str.indexOf(";"));
		switch(type){
			case CALL_METHOD:
			{
				o = CodeInput.getMethod(content);
			}
			break;
			case CALL_GOTO:
			case CALL_EMOTE:
			{
				o = Integer.parseInt(content);
			}
			break;
			case CALL_CHAT:
			{
				o = content.replaceAll("\"", "");
			}
			break;
			case CALL_EFFET:
			{
				o = EffectsShare.getSimilarEffect(content, true, parent.parent.main.s.getWorld());
			}
			break;
			case CALL_DIRECTION:
			{
				o = Byte.parseByte(content);
			}
			break;
			case CALL_MOVEMENT:
			{
				//Syn.d("Preloading MOVE.  charID=("+getChar().getID()+")  targetID=("+getTarget().getID()+")");
				short newCellID = Short.parseShort(content);
				//AbstractNode start = parent.parent.main.pm.getFormulingManager().createNode(getChar().getOrientation(), getChar().getCellID());
				//AbstractNode end = parent.parent.main.pm.getFormulingManager().createNode(Orientation.getDefaultOrientation(), newCellID);
				//AbstractPath ap = parent.parent.main.pm.getFormulingManager().getPathUtils().parsePathFromTwoNodes(getChar().getMap(), start, end);
				//GAction action = new GAction(getChar().getWorld().getNextActionID(), parent.parent.main.pm.getActionsManager().getMovementActionID(), ap);
				//o = action;
				o = newCellID;
			}
			break;
		}
	}
	
	
	public void call(AbstractCharacter character, AbstractCharacter target){
		Syn.d("Calling Directive type("+type.name()+")");
		switch(type){
			case CALL_METHOD:
			{
				try {
					Method m = (Method) ((Object[]) o)[0];
					if(m.getParameterTypes().length > 0){
						Object[] params = new Object[((Object[]) o).length-1];
						for(int i = params.length-1; i >=0; i--){
							params[i] = ((Object[]) o)[i];
						}
						m.invoke(null, params);
					}
					m.invoke(null, (Object[])null);
				} catch (IllegalArgumentException e) {e.printStackTrace();
				} catch (IllegalAccessException e) {e.printStackTrace();
				} catch (InvocationTargetException e) {e.printStackTrace();}
			}
			break;
			case CALL_GOTO:
			{
				parent.parent.blocIndex = (Integer) o;
			}
			break;
			case CALL_VAR:
			{
				String varName = content.substring(0, content.indexOf("=")).trim();
				String varValue = content.substring(content.indexOf("=")+1).trim();
				parent.parent.vars.put(varName, varValue);
			}
			break;
			case CALL_CHAT:
			{
				try{
					Syn.d("Calling CHAT");
					SM.chat.cMK_Black(target, "alloTarget");
					SM.chat.cMK_Black(character, "alloChar");
					SM.chat.cMK_Black(character, (String)o);
				}catch(Exception e){e.printStackTrace();}
			}
			break;
			case CALL_EMOTE:
			{
				SM.chat.cS(character, (Integer) o);
			}
			break;
			case CALL_EFFET:
			{
				parent.parent.main.pm.getEffectsManager().applyEffect((GEffect) o, character, character, null);
			}
			break;
			case CALL_DIRECTION:
			{
				SM.emotes.eD(character.getMap(), character, (Byte) o);
			}
			break;
			case CALL_MOVEMENT:
			{
				short newCellID = Short.parseShort(content);
				AbstractNode start = parent.parent.main.pm.getFormulingManager().createNode(character.getOrientation(), character.getCellID());
				AbstractNode end = parent.parent.main.pm.getFormulingManager().createNode(Orientation.getDefaultOrientation(), newCellID);
				AbstractPath ap = parent.parent.main.pm.getFormulingManager().getPathUtils().parsePathFromTwoNodes(character.getMap(), start, end);
				GAction action = parent.parent.main.pm.getActionsManager().getFactory().newMovementAction(character, ap);
				
				
				//getChar() = celui qui bouge
				//getTarget() = celui qui voit. (S'il est seul genre, que le scope = TO_TARGET)
				Syn.d("Calling MOVE.  charID=("+character.getID()+")  targetID=("+target.getID()+")");
				//GAction action = (GAction) o;
				//AbstractPath ap = (AbstractPath) action.getSpecialArgs();
				//action.setSpecialArgs(getChar().getID()+";a"+Cells.encode(getChar().getCellID())+ap.toString());
		
				
				//		if(scope == TO_MAP){
					//TODO trouver le bon packet pour déplacer les npc, 
					//le GA peut pas marcher pour ça entk
					//SM.Game.GA_MAP(getChar(), action);
					 //for(ISprite z : getChar().getMap().getSpritesSynchroFull()){
					//	if(z.getCharacterType() == CharacterType.PLAYER){
					//		if(z == getChar()){
					//			Syn.d("z == getChar(), adding action to him.");
					//		}
					//		((GPersonnage)z).addAction(action);
				     //	}
				    // }
		//		}
				//if(scope == TO_TARGET){
					//TODO trouver le bon packet pour déplacer les npc, 
					//le GA peut pas marcher pour ça entk
	/*				if(getTarget() instanceof GPersonnage){
					//	SM.Game.GA((GPersonnage)getTarget() , action);
						((GPersonnage) getTarget() ).addAction(action);
					}
					if(getChar() instanceof GPersonnage){
						SM.Game.GA((GPersonnage)getChar() , action);
						//((GPersonnage) getChar() ).addAction(action);
					}
			*/	//}
				
				SM.Game.GA_LAYER(character, action);
				action.setSpecialArgs(ap);
				
				//ActionsManager.apply(null, targetSprite, newCellID, action);
			}
			break;
		}
	}
	
	//private AbstractCharacter getChar(){
	//	return parent.parent.character;
	//}
	//private AbstractCharacter getTarget(){
	//	return parent.parent.target;
	//}
	
	
	
	
	
}
