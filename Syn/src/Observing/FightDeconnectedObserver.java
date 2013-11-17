package Observing;

//import java.util.Observable;
//import java.util.Observer;
import Abstractions.CombativeCharacter;
import Enums.CharacterType;
import Enums.FightState;
import Enums.SynActions.MapAction;
import Events.FightEvent;
import Events.FightEventType;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import NewThreads.FightSchedulingStrategies.FightSchedulingStrategies;

public class FightDeconnectedObserver extends Observer {

	/**
	 Système de reconnexion en combat : 
	 Le système de reconnexion en combat est désormais déployé sur l'ensemble des serveurs de jeu. 
	 Il permet aux personnages de revenir en combat après une déconnexion en jeu (logicielle ou matérielle). 
	 Les personnages déconnectés ont 10 minutes pour se reconnecter en combat après une déconnexion. 
	 Un personnage qui est déconnecté en combat au sein d'un groupe, 
	 passera automatiquement son tour tant qu'il est déconnecté afin de ne pas perturber 
	 le bon déroulement du combat. Un personnage déconnecté qui jouait seul, 
	 attend automatiquement 30 secondes avant de passer son tour, 
	 afin de laisser un maximum de temps au joueur pour établir de nouveau une connexion en jeu 
	 et revenir en combat.
	 http://forum.dofus.com/fr/2-carnet-bord/199494-version-beta-1-26-0 (il y a le systeme d'invasion aussi là)
	 */

	private GPersonnage p = null;
	private GFight f = null;
	private byte turnsDeco = 20;
	
	
	public FightDeconnectedObserver(GPersonnage p){
		this.p = p;
		this.f = p.getFight();
		SM.Messages.MO("Le personnage "+p.getName()+" s'est déconnecté du combat. Il sera mis hors-combat s'il ne est reconnecte pas en jeu d'ici 20 tours.", Constants.Constants.COLOR_PINK, p.getWorld());
	}
	
	@Override
	public void update(Observable obs, Object obj) {
		if(obj instanceof FightEvent == false){
			return;
		}
		FightEvent fe = (FightEvent) obj;
		//if(p.equals(obj) == false){
		//	return;
		//}
		if(fe.getType() == FightEventType.ON_FIGHT_TURN_START){
		//if(f.getStateMachine().get() == ActionListenerType.ON_FIGHT_TURN_START.ordinal()){
			
			if(turnsDeco == 0){//TODO: ajouter le nombre de tours pour déconnecter dans la gconfig
				//TODO f.kick(p) + p.getClient().kick();  			donc retire le gars du combat + déconnecte et terminate
				
				//send Im Message : Le personnage Y ne s'est pas reconnecté, il est kické blabla
				SM.Messages.MO("Le personnage "+p.getName()+" est déconnecté du combat car il ne s'est pas reconnecté en jeu depuis 20 tours.", Constants.Constants.COLOR_PINK, p.getWorld());
				f.getStateMachine().deleteObserver(this);

				p.getMap().updateSpriteList(MapAction.REMOVE_SPRITE, p);
				f.onKilledCharacter();//si tout le monde est mort/teamvide : set le state à FINISHED
																		// : et .finish(f) le Scheduler
				if(f.getState() != FightState.FINISHED.get()){
					FightSchedulingStrategies.getStrategy().finish(f);
					p.setLayer(f.getOldLayer());
					//SM.Game.GV(p); normalement on en a pas besoin puisqu'il est déco ? :o
				}
				p.getClient().kick();//oui la session est déjà kickée, mais ya dautres choses à terminate
				terminate();
				
			}else{
				turnsDeco--;
				//send Im Message :  Il reste X tours avant la déconnection totale de MonsieurLPerso.
				SM.Messages.MO("Il reste "+turnsDeco+" avant la déconnection complète de "+p.getName()+".", Constants.Constants.COLOR_PINK, p.getWorld());
				//f.endTurn();
				boolean alone = true;
				for(CombativeCharacter cc : f.getCharacterTeam(p)){
					if(cc.getCharacterType() == CharacterType.PLAYER){
						alone = false;
						break;
					}
				}
				if(alone == false){
					NewThreads.FightSchedulingStrategies.FightSchedulingStrategies.getStrategy().finish(f);
				}
			}
		}else
		if(fe.getType() == FightEventType.ON_FIGHT_RECONNECTED){
		//if(f.getStateMachine().get() == ActionListenerType.ON_FIGHT_RECONNECTED.ordinal()){
			SM.Messages.MO("Le joueur "+p.getName()+" s'est reconnecté en combat!", Constants.Constants.COLOR_PINK, p.getWorld());
			f.getStateMachine().deleteObserver(this);
			//Reconnection du personnage : 
			f.sendInitFightPackets(p);
			SM.Game.showAllSprites(p, p.getMap());//Affiche les autres persos,monstres au gars qui se reconnecte.
			SM.Infos.ILF(p.getClient(), 0, true);//Stop le timer de régénération
			f.sendPlacementFightPackets(p);//
			SM.Game.GM_ADD(p, p.getMap());//Affiche le gars qui se reconnecte aux autres gens dans le combat.
			f.sendActiveFightPackets(p);

			terminate();
		}
	}

	public void terminate(){
		p = null;
		f = null;
		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	

}
