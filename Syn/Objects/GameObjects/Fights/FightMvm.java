package GameObjects.Fights;

import Enums.FightType;

public class FightMvm extends GFight{


	@Override
	public FightType getType() {
		return FightType.MVM;
	}

	@Override
	public boolean getShowCancelButtonOnJoin() {
		return false;
	}

	@Override
	public boolean getShowUIOnJoin() {
		return false;
	}

	@Override
	public byte getTeamAlignment(int teamIndex) {
		// TODO Auto-generated method stub
		return 0;
	}


}
