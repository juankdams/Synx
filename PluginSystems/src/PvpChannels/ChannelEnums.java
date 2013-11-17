package PvpChannels;

public class ChannelEnums {

	public enum ChannelStateType{
		NULL(0),
		Preparing(1),
		Active(2),
		Looting(3),
		;
		private byte value = 0;
		private ChannelStateType(int value){
			this.value = (byte)value;
		}
		public byte get(){
			return value;
		}
	}
	
	public enum ChannelFightType{
		NULL(0),
		//DeathMatch(4), dans le fond un deathmatch, c'est un free-for-all (I)
		TeamDeathMatch(1),
		FreeForAll(2)
		;
		private byte value = 0;
		private ChannelFightType(int value){
			this.value = (byte)value;
		}
		public byte get(){
			return value;
		}
	}
	public static enum ChannelRoundType{
		NULL(0),
		Time(1),
		Lives(2),
		Damage(3)
		;
		private byte value = 0;
		private ChannelRoundType(int value){
			this.value = (byte)value;
		}
		public byte get(){
			return value;
		}
	}
	public static enum ChannelLootType{
		NULL(0),
		LastAlive(1),
		KillDeathRate(2),//meilleur taux kill/death
		BestKills(3),//le plus de kills possible (sans prendre compte des deaths)
		LessDeaths(4),//le moins de death possible (sans prendre compte des kills)
		BestDamage(5)//le plus de dommages infligés possible
		;
		private byte value = 0;
		private ChannelLootType(int value){
			this.value = (byte)value;
		}
		public byte get(){
			return value;
		}
	}
	
	
	
}
