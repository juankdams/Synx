package Observing;

import java.util.ArrayList;

import Events.FightEndEvent;
import Events.FightEvent;
import Events.FightReconnectionEvent;
import GameObjects.GChallenge;
import GameObjects.GChallenge.FightChallengeState;
import Misc.Randomizer;

public class ChallengesObserver extends Observer {
	
	/**
	 Système de challenge :
	 Lors de chaque combat contre des monstres, un challenge est proposé à l'ensemble des joueurs présents 
	 en combat. Si ces challenges sont réussis, ils octroient des bonus de fin de combat en augmentant 
	 les probabilités de récupérer des objets ainsi que la quantité d'expérience gagnée. 
	 Les récompenses associées à ces challenges sont liées à leur difficulté 
	 et au nombre de joueurs présents en combat. 
	 Lors des combats en groupe, les challenges sont partagés pour toute l'équipe 
	 et chaque joueur doit individuellement respecter les contraintes imposées par le challenge en cours 
	 pour que ce dernier soit validé. 
	 Tous les combats effectués dans les donjons proposent deux challenges simultanément, 
	 qui peuvent être accomplis indépendamment. 
	 Tous les challenges sont facultatifs, 
	 les personnages ne subissent aucune pénalité si les challenges ne sont pas réussis. 
	 Nous avons développé cette fonctionnalité afin de proposer de nouveaux défis aux joueurs, 
	 de casser la monotonie des combats en incitant les joueurs à diversifier leurs approches tactiques. 
	 Nous voulons également valoriser la prise de risques en combat grâce aux récompenses que procurent 
	 ces challenges. Nous avons préparé pour l'instant 12 challenges différents. 
	 D'autres challenges seront ajoutés dans les prochaines mises à jour de contenu.
	 
	 http://forum.dofus.com/fr/2-carnet-bord/199494-version-beta-1-26-0 (il y a le systeme d'invasion aussi là)
	 */


	private ArrayList<GChallenge> challenges = new ArrayList<GChallenge>();
	
	
	public ChallengesObserver(){
		
	}
	
	@Override
	public void update(Observable obs, Object obj) {
		if(obj instanceof FightEvent == false){
			return;
		}
		FightEvent fe = (FightEvent) obj;
		switch(fe.getType()){
			case ON_FIGHT_RECONNECTED:
				{
					FightReconnectionEvent fre = (FightReconnectionEvent) fe;
					SM.Game.Gd(fe.getFight(), fre.getPerso(), challenges);
				}
				break;
			case ON_FIGHT_END:
				{
					FightEndEvent fee = (FightEndEvent) fe;
					int challengesXpBonus = 0;
					int challengesDropBonus = 0;
					for(GChallenge c : challenges){
						if(c.getState() == FightChallengeState.Done){
							challengesXpBonus += c.getBonusXp() + c.getTeamBonusXp(fe.getFight());
							challengesDropBonus += c.getBonusDrop() + c.getTeamBonusDrop(fe.getFight());
						}
					}
					fee.setChallengesXpBonus(challengesXpBonus);
					fee.setChallengesDropBonus(challengesDropBonus);
					fe.getFight().getStateMachine().deleteObserver(this);
					terminate();
				}
				break;
			case ON_FIGHT_START:
				{
					int numberOfChallenges = Randomizer.rand(1, 4);//TODO ChallengesGenerationScript.js? au
					while(--numberOfChallenges > 0){
						challenges.add(fe.getFight().getWorld().getChallengeRandom());
					}
					SM.Game.Gd(fe.getFight(), null, challenges);
				}
				break;
			default :
				for(GChallenge c : challenges){
					if(c.getEventType() == fe.getType()){
						c.check(fe);
					}
				}
				break;
		}
		
	}


	public void terminate(){
		challenges.clear();
		challenges = null;
		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	
	
}
