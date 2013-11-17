package GameObjects.Fights;

import static Enums.FightType.PVM;

import java.util.ArrayList;
import java.util.List;

import Enums.FightType;
import GameObjects.GDrop;
import GameObjects.GMonsterGroup;
import GameObjects.GMonsterGroup.MonsterGroupType;
import Interfaces.ISprite;


public class FightPvm extends GFight{

	
	
	public FightPvm(){
		super();
	}
	
	/**
	 * Commence le combat complet quand tous les joueurs sont prêts 
	 * ou que le temps de placement des joueurs est écoulé.
	 */
	//@Override
	//public void startFight(){
		//blabla
	//	startRound();
	//}

	/**
	 * Fini le combat complet quand tous les joueurs sont prêts 
	 * ou que le temps de placement des joueurs est écoulé.
	 */
	@Override
	public void endFight(){
		//blabla
		super.endFight();
		if(true){
			return;//for debugging purposes
		}
		
		ArrayList<Integer> winningTeams = null;
		ArrayList<Integer> losingTeams = null;
		
		ArrayList<GDrop> drops = null;
		ArrayList<Long> kamas = null;
		ArrayList<Long> xp = null;
		
		
		List<ISprite> sprites = getMap().getSpritesSynchroCopy();
		for(ISprite s : sprites){
			if(s instanceof GMonsterGroup){
				GMonsterGroup m = (GMonsterGroup)s;
				if(m.getFight() == this){
					//ArrayList<CombativeCharacter> team = null;
					//int teamID = 0;
					boolean won = false;
					for(int i = 0; i <= teams.size()-1; i++){
						if(m.compareWithFightTeam(teams.get(i))){
							//team = teams.get(i);
							won = winningTeams.contains(i);
							break;
						}
					}
					if(m.getType() == MonsterGroupType.STATIC_INSTANCE){
						if(won == false){
							m.setStars(Constants.Constants.ZERO_SHORT);
							m.setDrops(null);
						}
						m.onAddedToMap(getMap());
						//juste si le groupe gagne quil respawn dans les HEROIC_INSTANCE et SUBAREA_GENERATE
					}else 
					if(won){
						m.onAddedToMap(getMap());
						if(m.getType() == MonsterGroupType.HEROIC_INSTANCE){
							//TODO m.addDrops();
						}
					}
				}
			}
		}
		//TODO: Si héroique: Ajouter les drops au monsterGroup 
		
		/*for(ArrayList<CombativeCharacter> team : teams){
			for(CombativeCharacter cc : team){
				if(cc.getCharacterType() == CharacterType.MONSTER && cc instanceof GInvocation == false){
					
					if(getServer().getWorld().getcWorld().type == Constants.CWorld.WORLD_TYPE_HEROIC){
						
					}
					GMonsterGroup mg = GMonsterGroup.createNewInstance(list, null, getServer());
					//TODO: Si on est en héroique : ajouter les drops à ce nouveau GMonsterGroup
				}
			}
		}*/
	}
	
	

	@Override
	public FightType getType() {
		return PVM;
	}
	
	@Override
	public boolean getShowCancelButtonOnJoin() {
		return false;
	}

	@Override
	public boolean getShowUIOnJoin() {
		return true;
	}

	@Override
	public byte getTeamAlignment(int teamIndex) {
		return 0;
	}

	
	
}
