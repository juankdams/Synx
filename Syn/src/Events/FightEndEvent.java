package Events;

import GameObjects.Fights.GFight;

public class FightEndEvent extends FightEvent {

	
	private int challengesXpBonus;
	private int challengesDropBonus;
	private int starsBonus;
	private int alignmentXpBonus;//(conquest bonuses uknow)
	private int alignmentDropBonus;//(conquest bonuses uknow)
	private int alignmentKamasBonus;//(conquest bonuses uknow)
	
	public FightEndEvent(GFight fight) {
		super(fight, FightEventType.ON_FIGHT_END);
		
	}

	public void setChallengesXpBonus(int challengesXpBonus) {
		this.challengesXpBonus = challengesXpBonus;
	}

	public int getChallengesXpBonus() {
		return challengesXpBonus;
	}

	public void setChallengesDropBonus(int challengesDropBonus) {
		this.challengesDropBonus = challengesDropBonus;
	}

	public int getChallengesDropBonus() {
		return challengesDropBonus;
	}

	public void setStarsBonus(int starsBonus) {
		this.starsBonus = starsBonus;
	}

	public int getStarsBonus() {
		return starsBonus;
	}

	public void setAlignmentXpBonus(int alignmentXpBonus) {
		this.alignmentXpBonus = alignmentXpBonus;
	}

	public int getAlignmentXpBonus() {
		return alignmentXpBonus;
	}

	public void setAlignmentDropBonus(int alignmentDropBonus) {
		this.alignmentDropBonus = alignmentDropBonus;
	}

	public int getAlignmentDropBonus() {
		return alignmentDropBonus;
	}

	public void setAlignmentKamasBonus(int alignmentKamasBonus) {
		this.alignmentKamasBonus = alignmentKamasBonus;
	}

	public int getAlignmentKamasBonus() {
		return alignmentKamasBonus;
	}

}
