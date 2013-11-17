package GameObjects.Fights;

import java.util.ArrayList;

import Abstractions.CombativeCharacter;

public class FightTeam extends ArrayList<CombativeCharacter> {

	public static enum FightTeamResultType{
		Loser(0),
		Winner(2),
		TaxCollector(5),
		Else(6);
		private byte value = 6;
		private FightTeamResultType(int i){
			value = (byte) i;
		}
		public byte get(){
			return value;
		}
	}
	
	private static final long serialVersionUID = 1L;
	private boolean isClosed = false;//si complètement barré (icone de cadedans)
	private boolean isClosedGroup = false;//si on bloque à tout le monde sauf le groupe
	private boolean isAllowingSpectators = false;//si on les accepte ou si on bloque les spectateurs 
	private boolean isAskingHelp = false;
	private FightTeamResultType ftrt = FightTeamResultType.Else;
	
	
	
	public FightTeam(){
		super();
	}
	/**
	 * Constructs an empty list with the specified initial capacity.
	 * @param initialCapacity the initial capacity of the list
	 * @exception IllegalArgumentException - if the specified initial capacity is negative
	 * */
	public FightTeam(int initialCapacity){
		super(initialCapacity);
	}
	
	
	/* J'sais pas me décider entre garder le get(0) partout ou écrire getStarter partout vu que c'est plus long :S
	 * Mais getStarter c'est beaucoup plus facile à faire que get(0) , c'Est dans les conventions et 
	 * desfois on ne s'en rappelle pas que c'est le get(0) qui return le starter ou whatever...
	 * ce qui fait de la blackmagic :S
	 * TODO ouais, on devrait changer tous les get(0) par les getStarter :)
	*/
	/**
	 * Returns the first character of this team. Also known as its Starter (getStarter() = first())
	 * */
	public CombativeCharacter first(){
		return get(0);
	}
	/** See FightTeam.first(); */
	public CombativeCharacter getStarter(){
		return get(0);
	}
	 
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	public boolean isClosed() {
		return isClosed;
	}

	public void setClosedGroup(boolean isClosedGroup) {
		this.isClosedGroup = isClosedGroup;
	}
	public boolean isClosedGroup() {
		return isClosedGroup;
	}

	public void setAllowingSpectators(boolean isAllowingSpectators) {
		this.isAllowingSpectators = isAllowingSpectators;
	}
	public boolean isAllowingSpectators() {
		return isAllowingSpectators;
	}

	public void setAskingHelp(boolean isAskingHelp) {
		this.isAskingHelp = isAskingHelp;
	}
	public boolean isAskingHelp() {
		return isAskingHelp;
	}
	public byte getFightTeamResultType(){
		return ftrt.get();
	}
	public void setFightTeamResultType(FightTeamResultType ftrt){
		this.ftrt = ftrt;
	}
	public boolean hasWon(){
		return ftrt == FightTeamResultType.Winner;
	}
	public boolean hasLost(){
		return ftrt == FightTeamResultType.Loser;
	}
	public boolean hasTaxCollector(){
		return ftrt == FightTeamResultType.TaxCollector;
	}
	
	
}
