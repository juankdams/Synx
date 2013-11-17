package GameObjects.Fights;

import static Enums.FightTeamEnum.ATTACKER;
import static Enums.FightTeamEnum.DEFENDER;
import static Enums.FightTeamEnum.SPECTATOR;

import java.util.ArrayList;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.CharacterType;
import Enums.CharacteristicType;
import Enums.FightState;
import Enums.FightTeamType;
import Enums.FightType;
import Enums.PlayerState;
import Enums.SynActions.MapAction;
import Events.FightEndEvent;
import Events.FightEvent;
import Events.FightEventType;
import Game.GameServer;
import GameObjects.GAction;
import GameObjects.GBuff;
import GameObjects.GBuff.BuffApplicationType;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques.CharacteristicColumn;
import GameObjects.GWorld;
import GameObjects.Fights.GameResults.GameResult;
import GlobalObjects.Map;
import Interfaces.IObject;
import NewThreads.Task;
import NewThreads.FightSchedulingStrategies.FightSchedulingStrategies;
import Observing.ObservableState;


public abstract class GFight implements Delayed, IObject {

	public static Logger log = LoggerFactory.getLogger(GFight.class);

	/*
	public static aspect tru{
		//@After("call (* GFight.endTurn(..))")// Ici, si 
	    //public static void listen(JoinPoint joinPoint) {
			//GFight f = joinPoint.getSourceLocation().
	    //}
		pointcut greetings():
			 execution(* GFight.startTurn(..));
			 
			 after()returning: greetings(){
				System.out.println(" World !");
				return 1;
			 }
	}
	*/
	
	
	
	/*
	 Liste de packets à peut-être envoyer au démarrage d'un combat (sans ordre) :
	 
	 fC: fightCount, affiche l'oeil avec le nombre de combats présent sur la map. à envoyer aux sprites de la map originalle
	 
	 GTL: GameTimeLine : affiche la timeLine, à envoyer aux sprites du combat.
	 
	 GIC:  //this.aks.Game.onPlayersCoordinates(sData.substr(4));
	 
	 GS:
	 
	 GTM:  this.aks.Game.onTurnMiddle(sData.substr(4));
	 
	 GTS: this.aks.Game.onTurnStart(sData.substr(3));
	 
	 Gc: Challenges
	 
	 GJK: this.aks.Game.onJoin(sData.substr(3));
	 
	 GP: this.aks.Game.onPositionStart(sData.substr(2));
	 */
	
	
	protected int ID = 0;
	//private Map fightMap = null;
	private byte oldLayer = -1;
	protected byte state = FightState.INIT.get();//fight state (active, finish, init, place)
	protected ObservableState inState = new ObservableState(-1);
	protected long startedFightCurrentMillis = 0;
	protected long endTurnCurrentNanos = 0;//le temps auquel le tour actuel doit finir (.endTurn())
	//public ArrayList<ICharacter> fightersBlue = new ArrayList<ICharacter>();
	//public ArrayList<ICharacter> fightersRed = new ArrayList<ICharacter>();
	
	protected byte cursor = 0;//Position du curseur dans la timeLine, sers à déterminer le currentFighter.
	/** 
	 * index 0 = Spectator Team 
	 * index 1 = attacking team
	 * index 2 = defending team
	 * index x = other teams
	 * */
	protected ArrayList<GameObjects.Fights.FightTeam> teams = new ArrayList<GameObjects.Fights.FightTeam>();
	protected ArrayList<CombativeCharacter> timeLine = new ArrayList<CombativeCharacter>();
	//protected Sequencer<GAction> sequencer = null;
	//protected ArrayList<IListener> listeners = new ArrayList<IListener>();
	
	
	/** //Fights instanciés via la FightFactory.  */
	protected GFight(){
		
	}

	@Override
	public int compareTo(Delayed arg0) {
		return this == arg0 ? 0 : 1;
	}
	@Override
	public long getDelay(TimeUnit arg0) {
		//Returns delay in nanoseconds
		//Syn.w("GFight.getDelay = "+( (getEndTurnTime()-System.nanoTime()) )+" ns");
		return ( (getEndTurnTime()-System.nanoTime()) );
	}
	
	
	/**
	 * Envoie les packets de début de combat
	 */
	public void sendInitFightPackets(GPersonnage p){
		GAction a = p.getServer().getActionsManager().getFactory().newEnterFightAction(p);
		p.addAction(a);
		SM.Game.GA(p, a);
		SM.Game.GJK(p, this);
		SM.Game.GP(p, this);
	}
	
	public void sendPlacementFightPackets(GPersonnage p){
		for(ArrayList<CombativeCharacter> team : teams){
			for(CombativeCharacter cc : team){
		/*		GAction etat_porte = p.getServer().getActionsManager().getFactory().newStateAction(cc, PlayerState.PORTEE, StateRelation.get(cc.hasState(PlayerState.PORTEE)));
				GAction etat_porteur = p.getServer().getActionsManager().getFactory().newStateAction(cc, PlayerState.PORTEUR, StateRelation.get(cc.hasState(PlayerState.PORTEUR)));
				etat_porte.setID(0);
				etat_porteur.setID(0);
				//p.addAction(etat_porteur);
				//p.addAction(etat_porte);
				
				SM.Game.GA_LAYER(p, etat_porte);
				SM.Game.GA_LAYER(p, etat_porteur);	*/
			}
		}
	}
	
	public void sendActiveFightPackets(GPersonnage p){
		SM.Game.GIC(p, this, false);
		SM.Game.GS(p);
		SM.Game.GTL(p, this);//XXX
		//SM.Game.Gd(p); //-> packet de challenges envoyé par le ChallengesObserver sur les event Start/Reconnect
	}
	
	
	/**
	 * TODO Fight.join 
	 */
	public void join(CombativeCharacter joiner, int teamID){
		/*
		 ERROR_ON_JOIN_FIGHT(903), 
		ERROR_CANT_BECAUSE_MAP(903,"p"),
		ERROR_CANT_BECAUSE_ON_RESPAWN(903,"r"),
		ERROR_CANT_YOU_OCCUPED(903,"o"),
		ERROR_CANT_YOU_OPPONENT_OCCUPED(903,"z"),
		ERROR_CANT_FIGHT(903,"h"),
		ERROR_CANT_FIGHT_NO_RIGHTS(903,"i"),
		ERROR_ERROR_21(903,"s"),
		ERROR_NO_ZOMBIE_ALLOWED(903,"d"),
		 */
		synchronized(teams){//lock les teams vs la concurrentModification
			GameObjects.Fights.FightTeam team = teams.get(teamID);
			CombativeCharacter starter = team.first();
			if(team.size() == 8){//getServer().getConfig().getMaxAlliesInFightTeam();
				//ERROR_CHALLENGE_FULL(903,"c"),
				//ERROR_TEAM_FULL(903,"f"),
				return;
			}
			if(team.isClosed() ){//TODO || (team.isClosedGroup() && starter.getGroup() != joiner.getGroup())){
				//ERROR_TEAM_CLOSED(903,"f"),
			}
			if(team.first().getAlignementSpecialization() != joiner.getAlignementSpecialization()
				&& this.getType() != FightType.PVM && this.getType() != FightType.Challenge){
				//ERROR_TEAM_DIFFERENT_ALIGNMENT(903,"a"),
			}
			if(this.getType() == FightType.PVT && teamID != DEFENDER.get()){
				//ERROR_CANT_DO_BECAUSE_GUILD(903,"g"),
			}
			if(this.getState() > FightState.PLACE.get() || this.getDelay(TimeUnit.NANOSECONDS)/1000L/1000L/1000L < 2){
				//Si le combat n'est plus en phase de placement (donc mtn actif) ou s'il reste moins de 2s...
				//ERROR_CANT_DO_TOO_LATE(903,"l"),
			}
			if(joiner.getCharacterType() == CharacterType.PLAYER){
				GPersonnage p = (GPersonnage) joiner;
				if(p.getGfxID() != ((p.getClasse().ID*10) + p.getSexe())){
					//ERROR_CANT_U_ARE_MUTANT(903,"m"),
				}
				//if(p.getMap().getSubArea(p.getWorld()).getArea().isPremium()){//TODO
					if(p.getAccount().isPremium() == false){
						/*
						 * if(wasPremium) -> ERROR_SUBSCRIPTION_EXPIRED
						 * else -> ERROR_SUBSCRIPTION_OUT
						 */
					}
					//ERROR_SUBSCRIPTION_EXPIRED(903,"s"), (TODO, il n'est pas dans ma liste, dans les GameActionType)
						//Action impossible car ton abonnement a expiré.  "s"
					//ERROR_SUBSCRIPTION_OUT(903,"n"),
						//Mode découverte   "n"
						//Pour accéder à la version complète : "n"  (ca vient avec l'autre ligne de "n")
					//ERROR_A_NOT_SUBSCRIB(903,"b"),
						//Action impossible ce joueur n'a pas un compte membre.  "b" 
						//ca cest genre quand on invite qqn à faire qqc qui a besoin d'etre premium.
				//}
			}
			
			
			//Enleve le perso de l'ancienne map
			joiner.onRemovedFromMap(getMap());
			joiner.setLayer(getLayer());
			team.add(joiner);
			//organizeTimeLine();
			
			if(joiner.getCharacterType() == CharacterType.PLAYER){
				GPersonnage p = (GPersonnage) joiner;
				this.sendInitFightPackets(p);
				SM.Game.showAllSprites(p, p.getMap());//Affiche les autres persos,monstres au gars qui se reconnecte.
				SM.Infos.ILF(p.getClient(), 0, true);
				this.sendPlacementFightPackets(p);
				SM.Game.GM_ADD(p, getMap());//réajoute le perso à la map après l'avoir changé de layer
				//this.sendActiveFightPackets(p);
			}else{
				SM.Game.GM_ADD(joiner, getMap());//réajoute le perso à la map après l'avoir changé de layer
			}
			
			//SM.Game.GTL_FIGHT(this);
			
			//Affiche le perso dans la liste des membres de la bonne équipe au dessus de l'épée de combat sur la map
			SM.Game.Gt_LAYER(this, true, starter, joiner);//Update l'affichage des membres de l'équipe au dessus de l'épée http://pbrd.co/15K6Fjf
			//...
		}
	}
	
	

	/**
	 * Trouve l'ID de l'équipe du leader character ( = premier charac de sa team = team.get(0) ), si ce dernier est bien dans le combat. Sinon return -1;
	 */
	public int getTeamLeaderID(int characterID){
		for(int i = teams.size()-1; i >= 0; i--){
			if(teams.get(i).size() > 0){
				if(teams.get(i).first().getID() == characterID){
					return i;
				}
			}
		}
		return -1;
	}
	/**
	 * Trouve l'ID de l'équipe du personnage (index), si ce dernier est bien dans le combat. Sinon return -1;
	 */
	public int getCharacterTeamID(CombativeCharacter character){
		for(int i = teams.size()-1; i >= 0; i--){
			for(CombativeCharacter c : teams.get(i)){
				if(c.equals(character)){
					return i;
				}
			}
		}
		return -1;
	}
	/**
	 * Trouve l'ID de l'équipe du personnage (index), si ce dernier est bien dans le combat. Sinon return -1;
	 */
	public GameObjects.Fights.FightTeam getCharacterTeam(CombativeCharacter character){
		for(int i = teams.size()-1; i >= 0; i--){
			for(CombativeCharacter c : teams.get(i)){
				if(c.equals(character)){
					return teams.get(i);
				}
			}
		}
		return null;
	}
	
	
	/** Voir getCharacterTeamID(CombativeCharacter character) */
	public int getCharacterTeamID(int characterID){
		for(int i = teams.size()-1; i >= 0; i--){
			for(CombativeCharacter c : teams.get(i)){
				if(c.getID() == characterID){
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Regarde pour voir si le Character est 
	 *    présent dans les listes de combattants de ce combat.
	 * <br><code><i>return getCharacterTeamID(character) != -1;</i></code>
	 * @param characterID - Le character recherché
	 * @return - True si le character est dans ce combat, false s'il n'y est pas
	 */
	public boolean isCharacterInFight(CombativeCharacter character){
		return getCharacterTeamID(character) != -1;
	}
	
	/** Voir isCharacterInFight(CombativeCharacter character) */
	public boolean isCharacterInFight(int characterID){
		return getCharacterTeamID(characterID) != -1;
	}
	
	public boolean isSpectator(CombativeCharacter p){
		if(teams.get(SPECTATOR.get()).size() == 0){
			return false;
		}
		for(CombativeCharacter cc : teams.get(SPECTATOR.get())){
			if(cc.equals(p)){
				return true;
			}
		}
		return false;
	}
	
	public boolean isEveryoneReady(){
		for(int i = teams.size()-1; i >= 0; i--){
			if(i == SPECTATOR.get()){
				continue;
			}
			for(CombativeCharacter cc : teams.get(i)){
				if(cc.getCharacterType() == CharacterType.PLAYER 
					&& !cc.hasState(PlayerState.InFightReady)
					){
						return false;
					}
			}
		}
		return true;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int ID){
		this.ID = ID;
	}
	
	@Override
	/**
	 * Peut return 0 si aucun des combattants n'a de serverID
	 */
	public short getServerID() {
		for(ArrayList<CombativeCharacter> fighters : teams){
			for(CombativeCharacter c : fighters){
				if(c.getServerID() != 0){
					return c.getServerID();
				}
			}
		}
		return 0;
	}

	@Override
	/**
	 * Peut return null si aucun des combattants n'a de Server
	 */
	public GameServer getServer() {
		for(ArrayList<CombativeCharacter> fighters : teams){
			for(CombativeCharacter c : fighters){
				if(c.getServer() != null){
					return c.getServer();
				}
			}
		}
		return null;
	}

	@Override
	/**
	 * Peut return null si aucun des combattants n'a de World
	 */
	public GWorld getWorld() {
		for(ArrayList<CombativeCharacter> fighters : teams){
			for(CombativeCharacter c : fighters){
				if(c.getServer() != null){
					return c.getWorld();
				}
			}
		}
		return null;
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
	}
	
	
	/**
	 * Pour setup la TimeLine, l'ordre des combattants par leur initiative.
	 */
	public void organizeTimeLine(){
		int lastTeam = 0;
		int lastInitiative = 0;
		CombativeCharacter lastGuy = null;
		ArrayList<ArrayList<CombativeCharacter>> copy = new ArrayList<ArrayList<CombativeCharacter>>(this.teams.size());
		
		int timeLineSize = 0;
		for(int i = 0; i <= teams.size()-1; i++){//For...each Team : copy
			if(i != SPECTATOR.get()){
				copy.add(new ArrayList<CombativeCharacter>(teams.get(i)));
				timeLineSize += this.teams.get(i).size();
			}
		}
		
		for(int t = timeLineSize-1; t >= 0; t--){ //For...each tant que la TimeLine n'est pas remplie au maximum.
			for(int i = copy.size()-1; i >= 0; i--){//For...each Team
				//Syn.w("enter  i = "+i);
				if(lastTeam == 9999 || (i != lastTeam && i != this.getCharacterTeamID(lastGuy))){
					for(CombativeCharacter c : copy.get(i)){//For...each Character
						int init = c.getServer().getFormulingManager().calculateTotalInitiative(c.getStatistique(), c.getLevel());
						//Syn.d("init="+init+"  id="+c.getID()+";");
						if(init >= lastInitiative){
							if(lastGuy == null || lastGuy.getID() != c.getID()){
								//Syn.w("got one char");
								lastInitiative = init;
								lastGuy = c;
								lastTeam = i;
							}
						}
					}
				}
			}
			boolean removed = copy.get(lastTeam).remove(lastGuy);
			//Syn.d("removed ? = "+removed+".");
			if(copy.get(lastTeam).size() == 0){
				copy.remove(lastTeam);//Enleve l'équipe lorsqu'elle est vide de fighters.
			}
			if(copy.size() == 1){
				//Syn.d("lastTeam = 9999");
				lastTeam = 9999;
				//S'il ne reste que des fighters d'une équipe à parser, 
				//  j'massure de débloquer le if(i != lastTeam).
			}
			if(removed){
				//Syn.d("timeLineAdded . name("+lastGuy.getName()+")");
				this.timeLine.add(lastGuy);//le 1er = le + d'ini.
				lastInitiative = 0;
			}
		}
		//Syn.d("timeLine.size="+timeLine.size()+". or "+timeLineSize);
		copy = null;
		lastGuy = null;
		// */
	}
	
	/** return timeLine.get(cursor); */
	public CombativeCharacter getCurrentFighter(){
		//Syn.d("cursor("+cursor+") timeLine("+timeLine.size()+")");
		return timeLine.get(cursor);
	}
	
	/**
	 * Commence le combat complet quand tous les joueurs sont prêts 
	 * ou que le temps de placement des joueurs est écoulé.
	 */
	public void startFight(){
		//blabla
		SM.Game.Gc_LAYER(this, false);
		organizeTimeLine();
		for(CombativeCharacter cc : timeLine){
			cc.removeState(PlayerState.InFightReady);
		}
		
		//inState.set(ON_FIGHT_START.ordinal()).notifyObservers(this);
		inState.notifyObservers(new FightEvent(this, FightEventType.ON_FIGHT_START));
		// ^ cet event instancie les challenges et envoie leurs packets Gd
		
		/*
		 * send quelques packets dont:
		 * GIC (GamePlayersCoordinates), 
		 * GS (GameStart),
		 * GTL (GameTurnList->TimeLine), 
		 * TODO Gd (Gamedefi->challenges), 
		 * GTM (GameTurnMiddle)
		 */
		for(CombativeCharacter cc : timeLine){
			if(cc.getCharacterType() == CharacterType.PLAYER){
				this.sendActiveFightPackets((GPersonnage)cc);
			}
		}
		
		startedFightCurrentMillis = System.currentTimeMillis();
		this.setState(FightState.ACTIVE.get());

		startRound();
	}

	/**
	 * Fini le combat complet quand il ne reste qu'une équipe vivante sur le jeu.
	 */
	public void endFight(){
		
		FightEndEvent fee = new FightEndEvent(this);
		inState.notifyObservers(fee);//va chercher les bonus xp/drop des challenges pour le GameResult
		
		GameResult gr = new GameResult(fee);//GameResult.provide(getServer()).createNew(fee);//  interesting idea ...
		gr.distribute();
		SM.Game.GE(gr);
		
		this.getMap().updateFightsList(MapAction.REMOVE_FIGHT, this);
		
		//then reput the people on the map again
		for(ArrayList<CombativeCharacter> team : teams){
			for(CombativeCharacter cc : team){
				cc.setLayer(this.getOldLayer());
				if(cc.getCharacterType() == CharacterType.PLAYER){
					GPersonnage p = (GPersonnage)cc;
					//SM.Game.GDM(p.getClient().getSession(), p.getMap());
					SM.Game.GV(p);
				}else if(cc.getCharacterType() == CharacterType.MONSTER){
					cc.getMap().updateSpriteList(MapAction.REMOVE_SPRITE, cc);
					try {
						cc.terminate();
					} catch (Throwable e) { e.printStackTrace(); }
					cc = null;
				}else if(cc.getCharacterType() == CharacterType.MONSTER_GROUP){
					Syn.w("MonsterGroup in endFight !");
					cc.onAddedToMap(getMap());
				}
			}
		}
	}
	
	
	/** Commence un tour complet de combat. 
	 * (Quand tous les joueurs sur la timeLine ont passé leur tour et qu'on en commence de noueaux) */
	public void startRound(){
		Syn.d("in GFight.startRound");
		//blabla
		startTurn();
	}
	/** Fini un tour complet de combat. 
	 * (Quand tous les joueurs sur la timeLine ont passé leur tour) */
	public void endRound(){
		Syn.d("in GFight.endRound");
		//blabla
		//cursor = 0;
		startRound();
	}
	
	/** Commence le tour d'une personne */
	public void startTurn(){
		Syn.d("in GFight.startTurn");
		
		if(getCurrentFighter().getBuffs() != null){
			ArrayList<GBuff> copy = new ArrayList<GBuff>();
			copy.addAll(getCurrentFighter().getBuffs());
			for(GBuff buff : copy){
				Syn.w("in startTurn, going to apply buff");
				buff.apply(getCurrentFighter(), this, BuffApplicationType.TurnBegin);
			}
		}
		
		//ArrayList<CombativeCharacter> deadTeam = areAllPeopleFromATeamDead();//TODO: créer method areAllPeopleFromATeamDead() pour le call à endFight dans le endTurn
		//if(deadTeam != null){ 
		//	endFight(); return;
		//}
		
		SM.Game.GTM_FIGHT(this, false); //Affiche correctement les PA/PM/PDV/PDVMAX 
										//et clear toutes les gameactions qu'il y aurait encore dans les clients
		SM.Game.GTS_FIGHT(getCurrentFighter(), this);
		
		FightSchedulingStrategies.getStrategy().schedule(this);

		//blabla, laisse jouer le joueur
		
		if(getCurrentFighter().getCharacterType() != CharacterType.PLAYER){
			try { //TODO: for debugging purposes only, waits a certain time before passing the mobs
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(getCurrentFighter().getIA() != null){
				Syn.d("ia found");
				Task<Object> task = this.getServer().threadsManager.getTaskFactory().newFightIATask(getCurrentFighter().getIA(), this.getServer(), this, getCurrentFighter());
				this.getServer().threadsManager.executeDirectTask(task);
			}else{
				endTurn();
			}
		}else{
			//inState.set(ON_FIGHT_TURN_START.ordinal()).notifyObservers(getCurrentFighter());
			inState.notifyObservers(new FightEvent(this, FightEventType.ON_FIGHT_TURN_START));
		}
	}
	
	
	/** Fini le tour d'une personne */
	public void endTurn(){
		Syn.d("in GFight.endTurn");

		//ArrayList<CombativeCharacter> deadTeam = areAllPeopleFromATeamDead();
		//if(deadTeam != null){ 
		//	endFight(); return;
		//}

		SM.Game.GTF_FIGHT(getCurrentFighter(), this);
		SM.Game.GTR_FIGHT(getCurrentFighter(), this);
		//inState.set(ON_FIGHT_TURN_END.ordinal()).notifyObservers(getCurrentFighter());
		inState.notifyObservers(new FightEvent(this, FightEventType.ON_FIGHT_TURN_END));
		
		if(getCurrentFighter().getBuffs() != null){
			ArrayList<GBuff> copy = new ArrayList<GBuff>();
			copy.addAll(getCurrentFighter().getBuffs());
			for(GBuff buff : copy){
				Syn.w("in endTurn, going to apply buff");
				buff.apply(getCurrentFighter(), this, BuffApplicationType.TurnEnd);
				buff.decrementRemainingTurns();
			}
		}
		
		//deadTeam = areAllPeopleFromATeamDead();
		//if(deadTeam != null){ 
		//	endFight(); return;
		//}
		
		//Reset les PA/PM utilisés pendant le tour
		getCurrentFighter().getStatistique().putCharac(CharacteristicColumn.FIGHT, CharacteristicType.PA, (short) 0);
		getCurrentFighter().getStatistique().putCharac(CharacteristicColumn.FIGHT, CharacteristicType.PM, (short) 0);
		
		//blabla, termine la round si c'était le dernier joueur, sinon commence le prochain tour.

		incrementCursor();
		if(cursor == 0){
			endRound();
		}else{
			startTurn();
		}
	}
	
	private void incrementCursor(){
		boolean first = true;
		//Passe par-dessus ceux qui sont morts ou qui ont quitté le combat
		while(first || getCurrentFighter().getStatistique().getPdv() == 0 || getCurrentFighter().getLayer() != getLayer()){
			first = false;
			cursor++;
			if(cursor == timeLine.size()){
				cursor = 0;
			}else{
			}
		}
	}
	
	/**
	 * TODO À caller lorsqu'un combattant meurt. 
	 */
	public void onKilledCharacter(){
		/*GameObjects.Fights.FightTeam deadTeam = areAllPeopleFromATeamDead();//TODO: créer method areAllPeopleFromATeamDead() pour le call à endFight dans le endTurn
		if(deadTeam != null){ 
			endFight();
		}*/
		GameObjects.Fights.FightTeam ft = areAllPeopleFromATeamDead();
		if(ft != null){
			setState(FightState.FINISHED.get());
			FightSchedulingStrategies.getStrategy().finish(this);
		}
	}
	
	/**
	 * Verifies if all people from a team is dead and returns that dead team
	 */
	public GameObjects.Fights.FightTeam areAllPeopleFromATeamDead(){
		int teamID = 0;
		GameObjects.Fights.FightTeam deadTeam = null;
		for(GameObjects.Fights.FightTeam team : this.teams){
			if(teamID == SPECTATOR.get()){
				continue;
			}
			Syn.w("Checking if team ("+teamID+") is dead");
			teamID++;
			boolean dead = team.isEmpty();
			//if(dead){//la team est vide. peut arriver souvent avec les spectateur donc on vérifie ici:
			//	dead = (teamID-1 != FightTeam.SPECTATOR.get());
			//}
			if(!dead){//la team contient encore des gens
				dead = true;
				for(CombativeCharacter cc :team){
					Syn.w("Checking if character ("+cc.getID()+") is dead");
					if(cc.getStatistique().getPdv() > 1){
						Syn.w("teamID not dead");
						dead = false;
						break;
					}
				}
			}
			if(dead){
				Syn.w("Team is dead ! : "+team);
				deadTeam = team;
				break;
			}
		}
		teamID--;
		Syn.w("done deadTeam ("+teamID+") = "+deadTeam+"");
		return deadTeam;
	}



	//private void incrementCursor() {
	//	cursor++;
	//	if(cursor == timeLine.size()){
	//		cursor = 0;
	//	}
	//}

	@Override @Deprecated
	public void setServer(GameServer s) { }

	/**
	 * La map originale du combat.
	 */
	public Map getMap() {
		if(teams != null && teams.size() > 0 ){
			if(teams.get(ATTACKER.get()).size() > 0){
				return teams.get(ATTACKER.get()).first().getMap();
			}else if(teams.get(DEFENDER.get()).size() > 0){
				return teams.get(DEFENDER.get()).first().getMap();
			}
		}
		//return GlobalWorld.getMap(getWorld(), getFightMap().getID());
		return null;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public byte getState() {
		return state;
	}
	public ArrayList<CombativeCharacter> getTimeLine(){
		return timeLine;
	}
	public ArrayList<GameObjects.Fights.FightTeam> getTeams(){
		return teams;
	}
	/** Return la durée du combat en millisecondes jusqu'à maintenant. */
	public long getDuration() {
		if(startedFightCurrentMillis == 0){
			return 0;
		}
		return System.currentTimeMillis()-startedFightCurrentMillis;
	}
	public byte getTeamType(int teamIndex){
		if(this.teams.get(teamIndex) == null || this.teams.get(teamIndex).size() == 0){
			return FightTeamType.NORMAL.get();
		}
		return FightTeamType.get(this.teams.get(teamIndex).first().getCharacterType());
	}
	public ObservableState getStateMachine(){
		return inState;
	}

	/** @return le temps auquel le tour actuel doit finir (.endTurn()) */
	public long getEndTurnTime(){
		return endTurnCurrentNanos;
	}
	/** 
	 * Set le getEndTurnTime à : System.nanoTime() + (delayMillis*1000L*1000L);  
	 * @param delayMillis - Le temps avant le prochain .endTurn() en millisecondes.  Le delay quoi.  
	 * 								Au début du combat c'est 45secondes et ensuite30secondes par tour.
	 */
	public void setDelay(long delayMillis){
		this.endTurnCurrentNanos = System.nanoTime() + (delayMillis*1000L*1000L);
	}
	
	/*pointcut great():
		execution(* GFight.endTurn(..))
	    //call(void FigureElement.setXY(int,int)) ||
	    //call(void Point.setX(int))              ||
	   // call(void Point.setY(int))              ||
	    //call(void Line.setP1(Point))            ||
	    //call(void Line.setP2(Point));
		before(): great() {
		    System.out.println("about to move");
		}*/
		
		//pointcut greetings():
		//	 execution(* HelloWorld.sayHello(..));
			 
		//	 after()returning: greetings(){
		//		 System.out.println(" World !");
		//	 }

	/*
	@After("execution (* " +
			"GFight.startFight(..) ||  " +
			"GFight.endFight(..) ||  " +
			"GFight.startRound(..) ||  " +
			"GFight.endRound(..) ||  " +
			"GFight.startTurn(..) ||  " +
			"GFight.endTurn(..) || " +
			")")
    public void listen(JoinPoint joinPoint) {
		fireListeners();
	}
	*/
	
	
	
	/*public void fireListenersTyped(ActionListenerType alt){
		for(IListener l : listeners){
			if(l.getType() == alt){
				l.fire();
			}
		}
	}
	public void fireListenersAll(){
		for(IListener l : listeners){
			l.fire();
		}
	}
	*/

	
	public abstract FightType getType();
	public abstract boolean getShowCancelButtonOnJoin();
	public abstract boolean getShowUIOnJoin();
	public abstract byte getTeamAlignment(int teamIndex);
	
	
	/**
	 * Le layer personnel au combat.
	 * @return
	 */
	public byte getLayer() {
		if(teams.get(0).first() == null){
			return teams.get(1).first().getLayer();
		}
		return teams.get(0).first().getLayer();
	}
	/**
	 * Le layer de la map ou a lieu le combat.
	 */
	public void setOldLayer(byte layer){
		oldLayer = layer;
	}
	/**
	 * Le layer de la map ou a lieu le combat.
	 */
	public byte getOldLayer() {
		return oldLayer;
	}
	
	
	
	
}
