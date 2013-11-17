package GameObjects;

import java.util.concurrent.ScheduledFuture;

import Abstractions.GExchangeBag;
import Game.GameServer;
import Interfaces.IExecutable;
import Interfaces.IObject;

public class GAction implements IObject, IExecutable{


	private int ID = 0;
	private short type = 0;
	private ScheduledFuture<?> sf = null;
	private Object specialArgs = null;
	
	public GAction(int ID, short type, Object specialArgs){
		this.ID = ID;
		this.type = type;
		this.specialArgs = specialArgs;
	}
	
	
	/*
	 case "A":
      {
          switch (sData.charAt(2))
           {
                            case "S":
                            {
                                this.aks.GameActions.onActionsStart(sData.substr(3));
                                break;
                            } 
                            case "F":
                            {
                                this.aks.GameActions.onActionsFinish(sData.substr(3));
                                break;
                            } 
                            default:
                            {
                                this.aks.GameActions.onActions(sData.substr(2));
                            } 
                        } // End of switch
                        break;
            } 
	 */
	
	
	/*public void accept(){
		send GKK
		 _loc1.actionAck = function (nActionID)
		    {
		        this.aks.send("GKK" + nActionID, false);
		    };
		 
	}*/
	
	/**
	 * TODO GAction.onStart<p>
	 * send GAS optionnel dans le onStart (Ca doit être pour les craft répétés genre?)
	 * <p>
	 * Les onStart et onFinish seront appelés à partir du ActionsPlugin.apply();
	 * <p>
	 * 
	 * C'Pour les actions qui ont un début et une fin au lieu d'être juste une action simple.
	 * <br>Ex de simple: Donner un item.
	 * <br>Ex de début+fin: Commencer à bouger sur la map + s'arreter sur une cellule de la map.
	 * <p><br>
	 * À ce moment là, faut mettre l'action dans l'arrayList 
	 * 		d'actions en cours du joueur et l'enlever quand on fait onFinish.
	 * 		On peut alors se servir de l'action stockée dans l'arrayList pour certaines vérifications ou autre.
	 * <p>
	 * Exemple avec une demande de défi: 
	 * on l'ajoute dans la liste 
	 * et tout le temps qu'il est en genre d'état d'attente de demande de défi,,, 
	 * bin il peut rien faire d'autre.
	 */
	public void onStart(){
		
		//send GAS
	}
	/**
	 * TODO GAction.onFinish<p>
	 * send GAF optionnel dans le onFinish quand la ScheduledFuture de l'action se termine (Ca doit être pour les craft répétés genre?)
	 * <p>
	 * Voir la doc de GAction.onStart.
	 */
	public void onFinish(){
		//à exécuter quand la ScheduledFuture de l'action se termine
		//send GAF
	}
	
	
	/**
	 * Action d'échange ici?
	 */
	public GExchangeBag getExchangeBag(){
		return null;
	}
	
	/**
	 * TODO GAction.terminate !
	 */
	@Override
	public void terminate(){
		this.sf = null;
		this.specialArgs = null;
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}
	
	@Override
	public void setID(int iD) {
		ID = iD;
	}
	
	/** Exactement pareil que setID, sauf qu'il renvoie return this; */
	public GAction setID2(int iD) {
		ID = iD;
		return this;
	}
	
	@Override
	public int getID() {
		return ID;
	}
	public GAction setType(short type) {
		this.type = type;
		return this;
	}
	public short getType() {
		return type;
	}


	public Object getSpecialArgs() {
		if(specialArgs == null){
			return "";
		}
		return specialArgs;
	}
	public GAction setSpecialArgs(Object specialArgs){
		this.specialArgs = specialArgs;
		return this;
	}

	public GAction getCopy(int newUnicID){
		return new GAction(newUnicID, type, specialArgs);
	}

	@Override @Deprecated
	public short getServerID() { return 0; }
	@Override @Deprecated 
	public GameServer getServer() { return null; }
	@Override @Deprecated
	public GWorld getWorld() { return null; }
	@Override  @Deprecated
	public void setServer(GameServer s) {  }

	@Override
	/**
	 * @param objects - { GPersonnageCaster, targetSprite, targetCell };
	 */
	public void apply(Object[] objects) {
		((GPersonnage)objects[0]).getServer().getActionsManager()
		.apply((GPersonnage)objects[0], (Short)objects[1], (Short)objects[2], this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
