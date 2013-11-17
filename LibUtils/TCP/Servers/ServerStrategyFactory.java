package Servers;



/**
	Factory de stratgies/policies pour les types de serveurs disponibles.
	à placer dans la LibUtils sous TCP.Servers
	à l'avenir, on fera GServer serv = ServerStrategyFactory.newMinaServer();
		et on enlèvera le "extends MinaServer" pour mettre "extends Server"
		et on fera la classe GServer abstract. Ensuite c'pareil pour le LoginServer et ToolServer.
*/

public class ServerStrategyFactory {
	
	public static MinaServer newMinaServer(){ return new MinaServer(); }
	public static NettyServer newNettyServer(){ return new NettyServer();  }
	
	
}
