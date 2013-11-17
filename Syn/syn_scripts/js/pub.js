

importClass(Packages.Core.Syn);
importClass(Packages.SM.Messages);



function go(args, alo){

	Syn.w(alo[0]);
	//System.out.println("gotit");

}


function execute(objArgs, strArgs) {
	Syn.w(objArgs[0]);//habituellement un GServer ou null si c'est un script de défaut de syn
	//Syn.w(strArgs[0]);
	//Syn.w(strArgs[1]);
	
	if(objArgs[0] == null){
		//Syn.w("objArqwegs[0] == null");
		//Messages.MA(strArgs[0], strArgs[1], objArgs[0].getWorld()); works
	}
	
	/*
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
		Syn.w("objArgs[0] != null");
		Messages.MA(strArgs[0], strArgs[1], objArgs[0].getWorld());
	}*/
	
}		






