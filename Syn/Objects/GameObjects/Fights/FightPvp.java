package GameObjects.Fights;

import Enums.FightType;

public class FightPvp extends GFight{

	
	

	@Override
	public FightType getType() {
		return Enums.FightType.PVP;
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
		if(this.teams.get(teamIndex) == null || this.teams.get(teamIndex).size() == 0){
			return 0;
		}
		return this.teams.get(teamIndex).get(0).getAlignementSpecialization();
	}

	
	
}
