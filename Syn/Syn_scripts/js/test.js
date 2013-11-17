

importClass(Packages.Core.Syn);



function go(args, alo){
	
	if(objArgs[0] == null){
		Syn.w("objArgs[0] == null");
		for(LServer ls : Syn.Services.serversService.loginServers.values()){
			Syn.w("objArgs[0] == null --  login");
			for(GServer gs : ls.gameServers){
				Syn.w("objArgs[0] == null --  game");
				Messages.MA(strArgs[0], strArgs[1], gs.getWorld());
			}
		}
	}else{
		Messages.MA(strArgs[0], strArgs[1], objArgs[0].getWorld());
	}
	Syn.w(alo[0]);
}
