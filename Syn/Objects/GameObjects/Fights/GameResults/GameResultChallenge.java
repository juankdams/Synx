package GameObjects.Fights.GameResults; 


import Abstractions.CombativeCharacter;
import Enums.CharacterType;
import Events.FightEndEvent;
import GameObjects.Fights.FightTeam;
import Plugins.Managers.FormulingManager;

  

public class GameResultChallenge extends GameResult {


	GameResultChallenge(FightEndEvent fee){
		super(fee);
		FormulingManager fm = fee.getFight().getServer().getFormulingManager(); 
        FightTeam losers = fee.getFight().areAllPeopleFromATeamDead(); 
        for(FightTeam ft : fee.getFight().getTeams()){ 
            if(ft != losers){ 
                for(CombativeCharacter cc : ft){ 
                    if(cc.getCharacterType() == CharacterType.PLAYER){ 
                        Gain g = new Gain(cc); 
                        long[] xps = fm.calculateXpGain(fee, cc); 
                        if(xps != null){ 
                            g.setXpsArray(xps);
                        } 
                    } 
                } 
            } 
        } 
	}
	
	
	public void distribute(){
		
	}
	
    public String toPacket() { 
		StringBuilder sb = new StringBuilder(500); 
		sb.append(super.toPacket());
		return sb.toString();
	}
	
	

}