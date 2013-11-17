package GameObjects.Fights.GameResults; 
  

import Abstractions.CombativeCharacter;
import Enums.CharacterType;
import Events.FightEndEvent;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.Fights.FightTeam;
  

public class GameResultPvm extends GameResult {

	
	GameResultPvm(FightEndEvent fee){
		super(fee);
	}

    public String toPacket() { 
		StringBuilder sb = new StringBuilder(500); 
		sb.append(super.toPacket());
		
		for(FightTeam team : fee.getFight().getTeams()){
			for(CombativeCharacter cc : team){
				sb
				.append("2").append(';')  //y'a genre 6, 0, 1, 2 ... jsais pas cest quoi ? 
				/*
				 switch (Number(_loc10[0]))
		        {
		            case 0:
		            {
		                oResults.loosers.push(_loc11);
		                break;
		            } 
		            case 2:
		            {
		                oResults.winners.push(_loc11);
		                break;
		            } 
		            case 5:
		            {
		                oResults.collectors.push(_loc11);
		                break;
		            } 
		            case 6:
		            {
		                eaFightDrop = eaFightDrop.concat(_loc11.items);
		            } 
		        } // End of switch
				 */
				.append(cc.getID()).append(';')
				.append(cc.getName()).append(';')
				.append(cc.getLevel()).append(';')
				.append(cc.getStatistique().getPdv() <= 0 ? 1 : 0).append(';');
				//
				if(true){//fight type = 0 = pvm/défis ...
					GPersonnage p = (GPersonnage) cc;
					sb
					.append(p.getWorld().persoXPLevels[p.getLevel()]).append(';')
					.append(p.getXP()).append(';')
					.append(p.getWorld().persoXPLevels[p.getLevel()+1]).append(';')
					.append(gains.get(p).getXp()).append(';')
					.append(gains.get(p).getGuildXp()).append(';')
					.append(gains.get(p).getMountXp()).append(';')
					.append(gains.get(p).getMountXp()).append(';');
					for(GItem i : gains.get(p).getDrops()){
						sb.append(i.getTemplate().getID()).append('~')
						.append(i.getQuantity()).append(',');
					}
					sb
					.append(gains.get(p).getKamas())
					;
				}else{//fight type = 1 = pvp/prismes...
					GPersonnage p = (GPersonnage) cc;
					sb
					.append(p.getWorld().honorXPLevels[p.getStatistique().getGrade(p.getWorld())]).append(';')
					.append(p.getStatistique().getHonor()).append(';')
					.append(p.getWorld().persoXPLevels[p.getStatistique().getGrade(p.getWorld())+1]).append(';')
					.append(gains.get(p).getHonnor()).append(';')
					.append(p.getStatistique().getGrade(p.getWorld())).append(';')
					.append(p.getStatistique().getDishonor()).append(';')
					.append(gains.get(p).getDishonnor()).append(';');
					for(GItem i : gains.get(p).getDrops()){
						sb.append(i.getTemplate().getID()).append('~')
						.append(i.getQuantity()).append(',');
					}
					sb
					.append(gains.get(p).getKamas())      
					.append(p.getWorld().persoXPLevels[p.getLevel()]).append(';')
					.append(p.getXP()).append(';')
					.append(p.getWorld().persoXPLevels[p.getLevel()+1]).append(';')
					.append(gains.get(p).getXp()).append(';')   
					;
				}
			}
		}
		
		return sb.toString();
	}
	
	


}