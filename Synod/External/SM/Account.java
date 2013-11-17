package SM;

import static Enums.CharacteristicType.PA;
import static Enums.CharacteristicType.PM;
import static SM.Sender.send;

import org.apache.mina.core.session.IoSession;

import Constants.CWorld;
import Constants.Constants;
import Core.Syn;
import Enums.CharacteristicType;
import Game.DofusGameClient;
import Game.DofusGameServer;
import Game.GameServer;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques.CharacteristicColumn;
import Interfaces.IItemTemplate;
import Login.DofusLoginClient;
import Misc.Tests.Perfs;

//------------------------------------------------------------------------------------------------------------------ ACCOUNTS

/**
 * Contient tous les paquets envoyables concernant les Accounts
 */
public class Account{
	
	
	/**
	 *  this.aks.Account.onGiftsList(sData.substr(2));
	 */
	public static void Ag(DofusGameClient c) {
		StringBuilder str = new StringBuilder("Ag")
			.append(c.getAccount().getGift().getType()).append("|")//on sait pas le type de quoi
			.append(c.getAccount().getGift().getID()).append("|")//on sait pas l'id de quoi
			.append(c.getAccount().getGift().getTitle()).append("|")//TITLE
			.append(c.getAccount().getGift().getDescription()).append("|")//DESC
			.append(c.getAccount().getGift().getGfxURL()).append("|");//gfxURL
			String args[] = null;
			for(String item : c.getAccount().getGift().getItems()){
				args = item.split(",");
				if(args.length == 2){//TODO packet de liste de cadeaux pas fini
					IItemTemplate it = c.getWorld().getItemTemplate(Integer.parseInt(args[0], 16));
					if(it != null){
					//if(LWorld.itemTemplates.get(Integer.parseInt(args[0], 16)) != null){
						str.append("1~").append(Integer.parseInt(args[0], 16)) //ID en base 16
						.append("~").append(args[1]).append("~~")    //Quantité  
						.append(it.getTemplateEffects())
						.append(";");
					}
				}
			}
		send(c.getSession(),str.toString());
	}
	
	/**
	 *  this.aks.Account.onGiftStored(!bError);
	 */
	public static void AG(DofusGameClient c) {
		/*
		  _loc1.onGiftStored = function (bSuccess)
	//A:LJKNFJN	    {
		        this.api.ui.unloadUIComponent("WaitingMessage");
		        this.api.ui.getUIComponent("Gifts").checkNextGift();
		    };
		 */
		send(c.getSession(),"AG");
	}
	
	/**
	 * REALM_SEND_ALREADY_CONNECTED InLogin<p>
	 * AlEa <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorAlreadyConnectedInLogin(IoSession out)
	{
		send(out,"AlEa");
	}
	/**
	 * REALM_SEND_ALREADY_CONNECTED InGame<p>
	 * AlEc <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorAlreadyConnectedInGame(IoSession out)
	{
		send(out,"AlEc");
	}
	/**
	 * REALM_SEND_BANNED <p>
	 * AlEb <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorBanned(IoSession out)
	{
		send(out,"AlEb");
	}
	/**
	 * REALM_SEND_REQUIRED_VERSION <p>
	 * AlEv <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorVersion(IoSession out)
	{
		send(out,"AlEv" + Constants.CLIENT_VERSION);
	}
	/**
	 * REALM_SEND_LOGIN_ERROR <p>
	 * AlEf <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorLogin(IoSession out)
	{
		send(out,"AlEf");
	}
	/**
	 * REALM_SEND_TOO_MANY_PLAYER_ERROR<p>
	 * AlEw <p>
	 * this.aks.Account.onLogin(!bError, sData.substr(3));
	 */
	public static void errorTooMany(IoSession out)
	{
		send(out, "AlEw");
	}
	/**
	 * MULTI_SEND_Af_PACKET 
	 * <p>Envoie screen message "En attente de connexion sur le serveur... (Position dans la file d'attente: #1)" 
	 * <p> Ou :
	 * <p>this.aks.Account.onNewQueue(sData.substr(2));
	 */
	public static void Af(IoSession out,int position, int totalAbo, int totalNonAbo, boolean premium, int worldID)
	{
		//Ex: Af4|10|1|1|2
		//Le .format prend beaucoup plus de temps.
		//String.format("Af%d|%d|%d|%d|%d", position, totalAbo, totalNonAbo, (subscribe?0:1), worldID);
		send(out,new StringBuilder().append("Af").append(position).append("|").append(totalAbo).append("|").append(totalNonAbo).append("|").append(premium?0:1).append("|").append(worldID).toString());
	}
	/**
	 * Envoie screen message "Connexion au serveur... (Position dans la file d'attente: #1)"
	 * <p>this.aks.Account.onQueue(sData.substr(2));
	 */
	public static void Aq(IoSession session, int indexOf) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * REALM_SEND_Ad_Ac_AH_AlK_AQ_PACKETS <p>
	 * Ad : this.aks.Account.onDofusPseudo(sData.substr(2)); <p>
	 * Ac : this.aks.Account.onCommunity(sData.substr(2)); <p>
	 * AH : this.aks.Account.onHosts(sData.substr(2)); <p>
	 * Alk : this.aks.Account.onLogin(!bError, sData.substr(3)); <p>
	 * AQ : this.aks.Account.onSecretQuestion(sData.substr(2));
	 */
	public static void Ad_Ac_AH_AlK_AQ(DofusLoginClient c, String pseudo, int level, String question, byte community)
	{//modified for SYN
		StringBuilder packet = new StringBuilder();
		packet.append("Ad").append(pseudo).append((char)0x00);
		//Ac[ID][0x00]  -> comunnity
		packet.append("Ac").append(community).append((char)0x00);
		//AH[ID];[State];[Completion];[CanLog]  ->serveur
		packet.append("AH");
		for(GameServer serv : c.getHandler().serv.gameServers){
			//Syn.w(packet.length()+"= packet.length().......packet.lastIndexOf(AH) :"+packet.lastIndexOf("AH"));
			if(packet.toString().endsWith("AH") == false){
				packet.append("|");
			}
			packet.append(serv.getServerID()+";").append(serv.getState()).append(";").append(serv.getcWorld().population).append(";").append(serv.getcWorld().type);
		}
		packet.append((char)0x00);
		packet.append("AlK").append(level).append((char)0x00);
		packet.append("AQ").append(question.replace(" ", "+"));
		
		send(c.getSession(),packet.toString());
		packet = null;
	}
	
	public static void AH(DofusGameClient c){
		String packet = "AH";
		for(GameServer serv : c.getServer().getLoginServer().gameServers){//Liste des serveurs
			if(packet.length() > 2){
				packet += "|";
			}
			CWorld cw = serv.getcWorld();
			packet += cw.id+";"+serv.getState()+";"+cw.population+";"+cw.type;
		}
		send(c.getSession(), packet);
	}
	
	/**
	 * Liste des personnages dans un serveur choisi <p>
	 * this.aks.Account.onCharactersList(!bError, sData.substr(3));
	 */
	public static void ALK(DofusGameClient c, GPersonnage persos[])
	{
		short worldID = c.getHandler().gServ.getWorld().getServerID();
		byte num = 0;
		StringBuilder packet = new StringBuilder();
		packet.append("ALK").append(c.getAccount().getPremiumTime()).append("|").append("%persoNumber%");
		//Syn.d("in ALK persos.length = "+persos.length);
		if(persos.length > 0){
			for(GPersonnage perso : persos)
			{
				//Syn.d("in for");
				if(perso != null){
					if(perso.getServerID() == worldID){
						//Syn.d("good");
						num++;
						packet.append(perso.getALKPacket());
					}
				}
			}
		}
		send(c.getSession(),packet.toString().replace("%persoNumber%", num+""));
		packet = null;
	}
	/**
	 * Liste des serveurs utilisés par le compte en prenant compte du nombre de persos dans chacun de ces serveurs <p>
	 * @param number - Nombre de persos sur le serveurID
	 * this.aks.Account.onServersList(!bError, sData.substr(3));
	 */
	public static void AxK(DofusLoginClient c)
	{//modified for SYN
		//Syn.d("AxK.account.listPerso length :"+c.getAccount().getPersos().length);
		/*for(GPersonnage  p : c.getAccount().getPersos()){
			if(p != null){
				Syn.d("p != null   ServID: "+p.getServerID());
			}else{
				Syn.d("p == null");
			}
		}*/
		StringBuffer packet = new StringBuffer("AxK").append(c.getAccount().getPremiumTime());//Temps d'abonnement
		
		for(GameServer gs : c.getHandler().serv.gameServers){
			int number = 0;
			for(GPersonnage  p : c.getAccount().getPersos()){
				if(p != null){
					if(p.getServerID() == gs.getServerID()){
						number++;
					}
				}
			}
			for(int i = number; i-- >0;){//Corrigé ici le 13dec12 à 1h11 du mat. c'était avant un if(number != 0)
				packet.append("|").append(gs.getServerID()).append(",").append(number);
			}
		}
		send(c.getSession(), packet.toString());
	}
	/**
	 * GAME_SEND_CREATE_OK <p>
	 * this.aks.Account.onCharacterAdd(!bError, sData.substr(3));
	 */
	public static void AAK(IoSession out)
	{
		send(out,"AAK");
	}
	/**
	 * GAME_SEND_NEW_LVL_PACKET <p>
	 *  this.aks.Account.onNewLevel(sData.substr(2));
	 */
	public static void AN(IoSession out, int lvl)
	{
		send(out,"AN"+lvl);
	}
	/**
	 * REALM_SEND_REQUIRED_APK <p>
	 * this.aks.Account.onCharacterNameGenerated(!bError, sData.substr(3))<p>
	 * Envoie un nom aléatoire pour quand on créer un perso
	 */
	public static void APK(IoSession out, StringBuilder name)
	{
		send(out, name.insert(0, "APK").toString());
	}
	/**
	 * GAME_SEND_RESTRICTION_MOVE <p>
	 * this.aks.Account.onRestrictions(sData.substr(2));
	 */
	public static void AR(IoSession out, String restric)
	{
		send(out,"AR"+restric);
	}
	/**
	 * REALM_SEND_GAME_SERVER_IP <p>
	 * this.aks.Account.onSelectServer(!bError, true, sData.substr(3));
	 */
	public static void AXK_AYK(IoSession out,int accountID, DofusGameServer serv)
	{
		
		/*TODO  dla marde c'pas bon ca. refais le (SM.Account.AXK_AYK)
		 if(Syn.CONFIG_USE_IP){
			String ip = Syn.CONFIG_IP_LOOPBACK && isHost?CryptManager.CryptIP("127.0.0.1")+CryptManager.CryptPort(Syn.CONFIG_GAME_PORT):Syn.GAMESERVER_IP;
			send(out,"AXK"+ip+guid);
			ip = null;
		}else{
			String ip = Syn.CONFIG_IP_LOOPBACK && isHost?"127.0.0.1":Syn.IP;
			send(out,"AYK"+ip+":"+Syn.CONFIG_GAME_PORT+";"+guid);
			ip = null;
		}
		*/
		
		//modified for SYN
		send(out, "AYK"+serv.getConfig().getIP()+':'+serv.getPort()+';'+accountID);
				//new StringBuffer("AYK").append(serv.getConfig().getIP()).append(":").append(serv.getConfig().getPort()).append(";").append(accountID).toString());
		
		/*
		 var _loc14 = sExtraData.split(";");
         var _loc15 = _loc14[0].split(":");
         _loc5 = _loc15[0];  //this.api.datacenter.Basics.aks_gameserver_ip = _loc5;
         _loc6 = _loc15[1];  //this.api.datacenter.Basics.aks_gameserver_port = _loc6;
         _loc7 = _loc14[1];  // this.api.datacenter.Basics.aks_ticket = _loc7;
         */
	}
	
	/**
	 * REALM_SEND_GAME_SERVER_IP <p>
	 * this.aks.Account.onSelectServer(!bError, true, sData.substr(3));
	 */
	public static void AYK(IoSession out,int accountID, GameServer serv)
	{
		//modified for SYN
		send(out, new StringBuffer("AYK").append(serv.getConfig().getIP()).append(":").append(serv.getPort()).append(";").append(accountID).toString());
	}
	
	/**
	 * GAME_SEND_ATTRIBUTE_FAILED <p>
	 * this.aks.Account.onTicketResponse(!bError, sData.substr(3));
	 */
	public static void ATE(IoSession out)
	{
		send(out,"ATE");
	}
	/**
	 * GAME_SEND_ATTRIBUTE_SUCCESS <p>
	 * this.aks.Account.onTicketResponse(!bError, sData.substr(3));
	 */
	public static void ATK0(IoSession out)
	{
		send(out,"ATK0");
	}
	/**
	 * GAME_SEND_AV0 <p>
	 * this.aks.Account.onRegionalVersion(sData.substr(2));
	 */
	public static void AV0(IoSession out)
	{
		send(out,"AV0");
	}
	/**
	 * GAME_SEND_HIDE_GENERATE_NAME <p>
	 * this.aks.Account.onCharacterNameGenerated(!bError, sData.substr(3));
	 */
	public static void GAME_SEND_HIDE_GENERATE_NAME(IoSession out)
	{
		send(out,"APE2");
	}
	/**
	 * GAME_SEND_NAME_ALREADY_EXIST <p>
	 * AAEa <p>
	 * this.aks.Account.onCharacterAdd(!bError, sData.substr(3));
	 */
	public static void errorNameTaken(IoSession out)
	{
		send(out,"AAEa");
	}
	/**
	 * GAME_SEND_CREATE_PERSO_FULL <p>
	 * AAEf <p>
	 * this.aks.Account.onCharacterAdd(!bError, sData.substr(3));
	 */
	public static void errorFivePerso(IoSession out)
	{
		send(out,"AAEf");
	}
	/**
	 * GAME_SEND_DELETE_PERSO_FAILED <p>
	 * ADE <p>
	 * this.aks.Account.onCharacterDelete(!bError, sData.substr(3));
	 */
	public static void errorDeletePersoFail(IoSession out)
	{
		send(out,"ADE");
	}
	/**
	 * GAME_SEND_CREATE_FAILED <p>
	 * AAEF <p>
	 * @param out
	 */
	public static void errorCreatePersoFail(IoSession out)
	{
		send(out,"AAEF");
	}
	/**
	 * GAME_SEND_PERSO_SELECTION_FAILED <p>
	 * ASE <p>
	 * this.aks.Account.onCharacterSelected(!bError, sData.substr(4));
	 */
	public static void errorSelectPersoFail(IoSession out)
	{
		send(out,"ASE");
	}

	/**
	 * GAME_SEND_STATS_PACKET 
	 * <p>As (Pour le game)
	 * <p>this.aks.Account.onStats(sData.substr(2));
	 */
	public static void As(IoSession session, GPersonnage p)
	{
		Perfs timer = new Perfs();
		StringBuilder str = new StringBuilder(500).append("As")
		.append(p.getXP()).append(',')
		.append(p.getWorld().persoXPLevels[p.getLevel()]).append(',')
		.append(p.getWorld().persoXPLevels[p.getLevel()+1]).append('|')
		.append(p.getKamas()).append('|')
		
		.append(p.getStatistique().getValue(CharacteristicType.STATS_POINTS.get(), CharacteristicColumn.BASE)).append('|')
		.append(p.getStatistique().getValue(CharacteristicType.SPELL_POINTS.get(), CharacteristicColumn.BASE)).append('|')
		
		//align~align,aLvl,aGrade,honor,dishonor,active|
		.append(p.getAlignementSpecialization()).append('~')
		.append(p.getAlignementSpecialization()).append(',')
		.append(p.getAlignement() == null ? '0' : p.getAlignement().getLevel()).append(',')//.append(p.getAlignLevel()).append(',')
		.append(p.getStatistique().getGrade(p.getWorld())).append(',')//.append(p.getAlignGrade()).append(',')
		.append(p.getStatistique().getHonor()).append(',')
		.append(p.getStatistique().getDishonor()).append(',')
		.append(p.getAlignement() == null ? "0|" : (p.getAlignement().isActive() ? "1|" : "0|"));
		
			
		str.append(p.getStatistique().getPdv()).append(',')
		.append(p.getStatistique().getPdvMax(p)).append('|')
		.append(p.getStatistique().getValue(CharacteristicType.ENERGY.get(), CharacteristicColumn.BASE)).append(',')
		.append(p.getStatistique().getEnergyMax()).append('|')
		.append(p.getServer().getFormulingManager().calculateTotalInitiative(p.getStatistique(), p.getLevel())).append('|')
		.append(p.getServer().getFormulingManager().calculateTotalProspection(p.getStatistique())).append('|')
		
		.append(p.getStatistique().getLinePacket(PA.get())).append(',').append(p.getStatistique().getPA(p.getClasse())).append('|')
		.append(p.getStatistique().getLinePacket(PM.get())).append(',').append(p.getStatistique().getPM(p.getClasse())).append('|');
		//Append le reste des charactéristiques à la string str.
		p.getStatistique().getPacket(p.getServer().getFormulingManager(), str);
		
        send(session, str.toString());
        Syn.w("Longeur du packet As: "+str.length());
        timer.stopTiming("Envoie du packet As (SM.Account().As())");
	}
	/**
	 * GAME_SEND_ASK (CHARACTER_SELECTION_KORRECT)<p>
	 * ASK <p>
	 * this.aks.Account.onCharacterSelected(!bError, sData.substr(4));
	 */
	public static void ASK(IoSession out,GameObjects.GPersonnage perso)
	{
		send(out, 
			new StringBuilder()
			.append("ASK|").append(perso.getID()).append("|")
			.append(perso.getName()).append("|")
			.append(perso.getLevel()).append("|")
			.append(perso.getClassID()).append("|")
			.append(perso.getSexe()).append("|")
			.append(perso.getGfxID()).append("|")
			.append((perso.getColor1()==-1?"-1":Integer.toHexString(perso.getColor1()))).append("|")
			.append((perso.getColor2()==-1?"-1":Integer.toHexString(perso.getColor2()))).append("|")
			.append((perso.getColor3()==-1?"-1":Integer.toHexString(perso.getColor3()))).append("|")
			.append(perso.getASKItemsPacket()).toString()
		);
	}
	/*
	 * case "A":
        {
            switch (sAction)
            {
                case "c":   FAIT
                {
                    this.aks.Account.onCommunity(sData.substr(2));
                    break;
                } 
                case "d":   FAIT
                {
                    this.aks.Account.onDofusPseudo(sData.substr(2));
                    break;
                } 
                case "l":   FAIT pas au complet
                {
                    this.aks.Account.onLogin(!bError, sData.substr(3));
                    break;
                } 
                case "L":   FAIT pas au complet?
                {
                    this.aks.Account.onCharactersList(!bError, sData.substr(3));
                    break;
                } 
                case "x": FAIT 
                {
                    this.aks.Account.onServersList(!bError, sData.substr(3));
                    break;
                } 
                case "A": FAIT
                {
                    this.aks.Account.onCharacterAdd(!bError, sData.substr(3));
                    break;
                } 
                case "T": FAIT
                {
                    this.aks.Account.onTicketResponse(!bError, sData.substr(3));
                    break;
                } 
                case "X": FAIT
                {
                    this.aks.Account.onSelectServer(!bError, true, sData.substr(3));
                    break;
                } 
                case "Y": FAIT
                {
                    this.aks.Account.onSelectServer(!bError, false, sData.substr(3));
                    break;
                } 
                case "S": FAIT
                {
                    this.aks.Account.onCharacterSelected(!bError, sData.substr(4));
                    break;
                } 
                case "s": FAIT
                {
                    this.aks.Account.onStats(sData.substr(2));
                    break;
                } 
                case "N": FAIT
                {
                    this.aks.Account.onNewLevel(sData.substr(2));
                    break;
                } 
                case "R": FAIT
                {
                    this.aks.Account.onRestrictions(sData.substr(2));
                    break;
                } 
                case "H":   FAIT
                {
                    this.aks.Account.onHosts(sData.substr(2));
                    break;
                } 
                case "r": //TODO SM.Accounts.onRescue
                {
                    this.aks.Account.onRescue(!bError);
                    break;
                } 
                case "g": FAIT
                {
                    this.aks.Account.onGiftsList(sData.substr(2));
                    break;
                } 
                case "G": FAIT
                {
                    this.aks.Account.onGiftStored(!bError);
                    break;
                } 
                case "q": FAIT
                {
                    this.aks.Account.onQueue(sData.substr(2));
                    break;
                } 
                case "f": FAIT
                {
                    this.aks.Account.onNewQueue(sData.substr(2));
                    break;
                } 
                case "V": FAIT
                {
                    this.aks.Account.onRegionalVersion(sData.substr(2));
                    break;
                } 
                case "P": FAT
                {
                    this.aks.Account.onCharacterNameGenerated(!bError, sData.substr(3));
                    break;
                } 
                case "K": //TODO SM.Accounts.onKey
                {
                    this.aks.Account.onKey(sData.substr(2));
                    break;
                } 
                case "Q":   FAIT
                {
                    this.aks.Account.onSecretQuestion(sData.substr(2));
                    break;
                } 
                case "D": FAIT
                {
                    this.aks.Account.onCharacterDelete(!bError, sData.substr(3));
                    break;
                } 
                case "M": //TODO    MIGRATION DE SERVEUR
                {
                    switch (sData.charAt(2))
                    {
                        case "?":
                        {
                            this.aks.Account.onCharactersMigrationAskConfirm(sData.substr(3));
                            break;
                        } 
                        default:
                        {
                            this.aks.Account.onCharactersList(!bError, sData.substr(3), true);
                            break;
                        } 
                    } // End of switch
                    break;
                } 
                case "F": //TODO SM.Account.onFriendServerList
                {
                    this.aks.Account.onFriendServerList(sData.substr(2));
                    break;
                } 
                case "m": //TODO SM.Account.onMiniClipInfo 
                {
                    if (!_global.CONFIG.isStreaming)
                    {
                        this.aks.Account.onMiniClipInfo();
                    }
                    else
                    {
                        var _loc6 = _global.parseInt(sData.charAt(2), 10);
                        if (_global.isNaN(_loc6))
                        {
                            _loc6 = 3;
                        } // end if
                        getURL("FSCommand:" add "GoToCongratulation", _loc6);
                    } // end else if
                    break;
                } 
            } // End of switch
            break;
        } 
	 */

	/**
	 * 
	 */
	public static void AF(IoSession session, String persoList) {
		send(session, "AF"+persoList);
	}

	
	
	
	
	/*CADEAUX : //XXX CADEAUX onGiftsList
	 * _loc1.onGiftsList = function (sExtraData)
        {
                var _loc3 = sExtraData.split("|");
                var _loc4 = Number(_loc3[0]);
                var _loc5 = Number(_loc3[1]);
                var _loc6 = _loc3[2];
                var _loc7 = _loc3[3];
                var _loc8 = _loc3[4];
                var _loc9 = _loc3[5];
                var _loc10 = new LoadVars();
                _loc10.decode("&text=" + _loc6);
                var _loc11 = _loc10.text;
                _loc10 = new LoadVars();
                _loc10.decode("&desc=" + _loc7);
                var _loc12 = _loc10.desc;
                _loc10 = new LoadVars();
                _loc10.decode("&gfxurl=" + _loc8);
                var _loc13 = _loc10.gfxurl;
                var _loc14 = new Array();
                var _loc15 = _loc9.split(";");
                var _loc16 = 0;

                while (++_loc16, _loc16 < _loc15.length)
                {
                        if (_loc15[_loc16] != "")
                        {
                                var _loc17 = this.api.kernel.CharactersManager.getItemObjectFromData(_loc15[_loc16]);
                                _loc14.push(_loc17);
                        } // end if
                } // end while
                var _loc18 = new Object();
                _loc18.type = _loc4;
                _loc18.id = _loc5;
                _loc18.title = _loc11;
                _loc18.desc = _loc12;
                _loc18.gfxUrl = _loc13;
                _loc18.items = _loc14;
                this.api.datacenter.Basics.aks_gifts_stack.push(_loc18);
        };
        _loc1.onGiftStored = function (bSuccess)
        {
                this.api.ui.unloadUIComponent("WaitingMessage");
                this.api.ui.getUIComponent("Gifts").checkNextGift();
        };

	 * 
	 */
	
	
}