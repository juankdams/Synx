package Plugins.Abstractions;

import Interfaces.IClient;


public abstract class AbstractPacketParser<T extends IClient, K> {

	
	public abstract boolean parse(T c, K packet);
	
	
}
