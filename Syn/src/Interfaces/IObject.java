package Interfaces;

import Game.GameServer;
import GameObjects.GWorld;

public interface IObject {

	public int getID();
	public short getServerID();
	
	public GameServer getServer();
	public GWorld getWorld();
	//public GlobalWorld getGlobalWorld();

	public void setID(int iD);
	public void setServer(GameServer s);
	
	public void terminate() throws Throwable;
}
