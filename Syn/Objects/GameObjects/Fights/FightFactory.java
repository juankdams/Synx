package GameObjects.Fights;

import static Enums.FightTeamEnum.ATTACKER;
import static Enums.FightTeamEnum.DEFENDER;
import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.FightState;
import Enums.FightType;
import Enums.SynActions.MapAction;
import GameObjects.GMonsterGroup;
import GameObjects.GPersonnage;
import GlobalObjects.Map;
import NewThreads.FightSchedulingStrategies.FightSchedulingStrategies;
import Observing.ChallengesObserver;
import Plugins.Managers.FormulingManager;

public class FightFactory {
	
	/**
	 * TODO FightFactory.createNewPVM
	 * @param starter
	 * @param mg
	 * @return
	 */
	public static GFight createNewPVM(CombativeCharacter starter, GMonsterGroup mg){
		//TODO refaire toutes les méthodes d'affichages de GM, 
		//	tout ce qui a un lien avec l'envoie de packets à la map ou à la fight.
		
		if(starter.getFight() != null || mg.getFight() != null){
			Syn.d("createNewPVM " +
					"starter.getFight() != null ("+(starter.getFight() != null)+") " +
					"|| mg.getFight() != null ("+(mg.getFight() != null)+")");
			return starter.getFight();	
		}
		FightPvm f = new FightPvm();
		mg.setFight(f);
		//Désaffiche les combattants de l'ancienne map normale
		Map normalMap = starter.getMap();
		mg.onRemovedFromMap(normalMap);//TODO à refaire
		//starter.onRemovedFromMap(normalMap);//TODO à refaire
		
		f.ID = starter.getWorld().getNextFightID();
		//f.state = (byte) FightState.INIT.get();
		f.state = FightState.PLACE.get();
		//Set les Teams de départ.
		f.teams.add(new GameObjects.Fights.FightTeam(1));//attackers
		f.teams.add(new GameObjects.Fights.FightTeam(mg.size()));//defenders
		f.teams.add(new GameObjects.Fights.FightTeam(0));//spectators
		f.teams.get(ATTACKER.get()).add(starter);
		f.teams.get(DEFENDER.get()).addAll(mg.getMonstersInstancesCopy());


		GPersonnage p = (GPersonnage) starter;
		f.sendInitFightPackets(p);
		
		//Layers
		f.setOldLayer(starter.getLayer());
		byte fightLayer = normalMap.getNextLayer();
		p.setLayer(fightLayer);
		mg.setLayer((byte) -fightLayer);//Cache le mobGroup dans les layers négatifs
		FormulingManager fm = p.getServer().getFormulingManager();
		for(int i = f.getTeams().size()-1; i >=0; i--){
			for(CombativeCharacter cc : f.getTeams().get(i)){
				cc.setLayer(fightLayer);//Tout le monde sur le même layer
				cc.setMap(normalMap);//Set la map aux monstres
				cc.setCellID(fm.getFreeCellRandom(normalMap, 200, 400));//PlaceRandomCell
				//Syn.d("randomCell="+cc.getCellID());
				if(cc == p){
					cc.setOrientation(fm.getOrientationBetweenCellsInFight(normalMap, p.getCellID(), f.getTeams().get(DEFENDER.get()).first().getCellID()).toDiagonal());
				}else{
					cc.setOrientation(fm.getOrientationBetweenCellsInFight(normalMap, cc.getCellID(), p.getCellID()).toDiagonal());
					normalMap.updateSpriteList(MapAction.ADD_SPRITE, cc);
				}
			}
		}

		normalMap.updateFightsList(MapAction.ADD_FIGHT, f);//Ajoute le combat à la map 
		
		SM.Game.showFightSwordTeams(f);
		
		//SM.Game.GDM(p.getClient().getSession(), p.getMap());//TODO à refaire
		SM.Messages.M(p, "Tu es mtn en combat", Constants.Constants.COLOR_BLUE2);
		SM.Infos.ILF(p.getClient(), 0, true);
		
		//f.state = (byte) FightState.PLACE.get();
		f.sendPlacementFightPackets(p);

		SM.Game.GM_ADD(p, p);//réajoute le perso à la map après l'avoir changé de layer
		//p.onAddedToMap(normalMap);
		
		
		f.getStateMachine().addObserver(new ChallengesObserver());
		FightSchedulingStrategies.getStrategy().schedule(f);
		return f;
	}
	
	/**
	 * TODO FightFactory.createNewPVP
	 * @param ft
	 * @param attacker
	 * @param defender
	 * @return
	 */
	public static GFight createNewPVP(FightType ft, CombativeCharacter attacker, CombativeCharacter defender){
		GFight f = new FightPvp();

		return f;
	}
	

	/**
	 * TODO FightFactory.createNewMVM
	 * @param ft
	 * @param attacker
	 * @param defender
	 * @return
	 */
	public static GFight createNewMVM(FightType ft, GMonsterGroup attacker, GMonsterGroup defender){
		GFight f = new FightMvm();

		return f;
	}
	
	

}
