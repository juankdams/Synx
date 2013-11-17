package GameObjects.Fights.GameResults;

import static Enums.FightTeamEnum.ATTACKER;
import static Enums.FightTeamEnum.SPECTATOR;
import static Enums.FightType.PVM;
import static Enums.FightType.PVMA;
import static Enums.FightType.PVP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import Abstractions.CombativeCharacter;
import Core.Syn;
import Enums.CharacterType;
import Events.FightEndEvent;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GameObjects.GTaxCollector;
import GameObjects.Fights.FightTeam;
import GameObjects.Fights.FightTeam.FightTeamResultType;
import GameObjects.Fights.GFight;
import Plugins.Managers.FormulingManager;



public class GameResult {
	
	//Image d'un GameResult en PVM
	
	public static class Gain{
		private long xp[] = new long[]{0,0,0,0,0};//xp,guild,mount,honnor,dishonnor
		private long kamas = 0;
		private ArrayList<GItem> drops;
		public Gain(){

		}
		/** Returns the array of XPs containing the amount of experience gained for perso/honnor/guild/mount. */
		public long[] getXpsArray(){
			return xp;
		}
		public long getXp(){
			return xp[0];
		}
		public long getGuildXp(){
			return xp[1];
		}
		public long getMountXp(){
			return xp[2];
		}
		public long getHonnor(){
			return xp[3];
		}
		public long getDishonnor(){
			return xp[4];
		}
		/** Sets the array of XPs containing the amount of experience gained for perso/honnor/guild/mount. */
		public void setXpsArray(long Xp[]){
			xp = Xp;
		}
		public void setXp(long Xp){
			xp[0] = Xp;
		}
		public void setGuildXp(long guildXp){
			xp[1] = guildXp;
		}
		public void setMountXp(long mountXp){
			xp[2] = mountXp;
		}
		public void setHonnor(long honnor){
			xp[3] = honnor;
		}
		public void setDishonnor(long dishonnor){
			xp[4] = dishonnor;
		}
		public void setKamas(long kamas) {
			this.kamas = kamas;
		}
		public long getKamas() {
			return kamas;
		}
		public void setDrops(ArrayList<GItem> drops) {
			this.drops = drops;
		}
		public ArrayList<GItem> getDrops() {
			return drops;
		}
	}
	
	/*
	public static GameResultProvider provide(GServer s){
		return s.getProviders().provideGameResult();
	}
	public static class GameResultProvider implements IProvider {
		public GameResult createNew(FightEndEvent fee){
			switch(fee.getFight().getType()){
				case Challenge: return new GameResultChallenge(fee);
				case PVM: return new GameResultPvm(fee);
				//case PVP: return new GameResultPvp(fee);
				//case MVM: return new GameResultMvm(fee);
			}
			return null;
		}
	}*/
	
	
	
	protected FightEndEvent fee = null;
	protected HashMap<CombativeCharacter, Gain> gains = new HashMap<CombativeCharacter, Gain>();
	
	
	/* *
	 * GameResults are initialized via their GameResultProvider which can be accessed by : <br>
	 * <b>GServer.getPluginsManager().getProviders().provideGameResult().createNew(fee);</b> <br>
	 * or <br>
	 * <b>GameResult.provide(getServer()).createNew(fee);</b>
	 */
	public GameResult(FightEndEvent fee){
		this.fee = fee;
		FormulingManager fm = fee.getFight().getServer().getFormulingManager();
		FightTeam losers = fee.getFight().areAllPeopleFromATeamDead();
		losers.setFightTeamResultType(FightTeamResultType.Loser);
		
		for(FightTeam ft : fee.getFight().getTeams()){
			if(ft != losers && ft != fee.getFight().getTeams().get(SPECTATOR.get())){
				ft.setFightTeamResultType(FightTeamResultType.Winner);
				for(CombativeCharacter cc : ft){
					if(cc.getCharacterType() == CharacterType.TAX_COLLECTOR){
						ft.setFightTeamResultType(FightTeamResultType.TaxCollector);
					}
					Gain g = new Gain();
					g.drops = new ArrayList<GItem>();//TODO method de calcul des drops à créer dans Formulas
					long[] xps = fm.calculateXpGain(fee, cc);
					if(xps != null){
						g.setXpsArray(xps);
					}
					gains.put(cc, g);
				}
			}
		}
	}
	
	public GFight getFight(){
		return fee.getFight();
	}

	/**
	 * Distribut les lots gagnés/perdus à chaque CombativeCharacter en ayant obtenus. 
	 * CombativeCharacter pcq les MonsterGroups peuvent gagner des HeroicDrops sur le serveur Héroique.
	 */
	public void distribute(){
		for(Entry<CombativeCharacter, Gain> e : gains.entrySet()){
			CombativeCharacter cc = e.getKey();
			Gain g = e.getValue();
			GPersonnage p = null;
			GTaxCollector tc = null;
			if(cc.getCharacterType() == CharacterType.PLAYER) p =(GPersonnage) cc;
			if(cc.getCharacterType() == CharacterType.TAX_COLLECTOR) tc =(GTaxCollector) cc;
			if(p != null){
				p.addXP(g.getXp());
				p.setKamas(p.getKamas() + g.getKamas());
		//		p.getMount().addXP(g.getMountXp());
		//		p.getGuild().addXP(g.getGuildXp());
				for(GItem i : g.getDrops()){
					p.getInventory().addItemWithPackets(p, i);
				}
			}else
			if(tc != null){
		//		tc.addXp(g.getGuildXp());
		//		tc.addKamas(g.getKamas());
		//		tc.addItems(g.getDrops());
			}else{
				for(GItem i : g.getDrops()){
					//Les monstres du serv Héroique ??, 
					//sinon y'a aussi un GDrop[] specialDrops; dans GMonsterGroup...j'saispastrop...
		//			cc.getInventory().addItem(i);
				}
			}
			if(g.getHonnor() >= 0){
				cc.getStatistique().incrementHonor((short) g.getHonnor());
			}else{
				cc.getStatistique().decrementHonor((short) Math.abs(g.getHonnor()));
			}
			if(g.getDishonnor() >= 0){
				cc.getStatistique().incrementDishonor((short) g.getDishonnor());
			}else{
				cc.getStatistique().decrementDishonor((short) Math.abs(g.getDishonnor()));
			}
		}
	}
	
	public String toPacket() {
		//screen du panel : http://pbrd.co/1asHFyO ..  Crystal (id=1) étant le starter du cbt
		//[DEBUG] :Game: Send >> GE102586;0|1|0|2;1;Crystal;101;0;99823000;99823072;103885000;72;;;287~6;107|2;2;uwaste;101;0;99823000;99823072;103885000;72;;;6897~1,6900~1,6902~1;102|0;-4;491;2;1;0;0;0;;;;|0;-3;493;4;1;0;0;0;;;;|0;-2;490;4;1;0;0;0;;;;|0;-1;489;4;1;0;0;0;;;;|
		//[DEBUG] :Game: Send >> GE102586;0|1|0|2;1;Crystal;101;0;99823000;99823072;103885000;72;;;287~6;107|2;2;uwaste;101;0;99823000;99823072;103885000;72;;;6897~1,6900~1,6902~1;102|0;-4;491;2;1;0;0;0;;;;|0;-3;493;4;1;0;0;0;;;;|0;-2;490;4;1;0;0;0;;;;|0;-1;489;4;1;0;0;0;;;;|
		
		boolean pvp = fee.getFight().getType() == PVP || fee.getFight().getType() == PVMA;
		
		StringBuilder sb = new StringBuilder("GE");
		sb
		.append(fee.getFight().getDuration())
		.append(fee.getFight().getType() == PVM ? ";"+fee.getStarsBonus() : "").append('|')
		.append(fee.getFight().getTeams().get(ATTACKER.get()).first().getID()).append('|')
		.append(pvp ? 1 : 0).append('|');//.append(fee.getFight().getType().get()).append('|');

		for(FightTeam team : fee.getFight().getTeams()){
			for(CombativeCharacter cc : team){
				//if(gains.get(cc) == null){
				//	continue;
				//}
				if(team.getFightTeamResultType() == FightTeamResultType.Else.get()){
					sb.append(team.getFightTeamResultType()).append(';');
					if(gains.get(cc) != null){
						for(GItem i : gains.get(cc).getDrops()){
							sb.append(i.getTemplate().getID()).append('~')
							.append(i.getQuantity()).append(',');
						}
					}
					sb.append(gains.get(cc) == null ? "" : gains.get(cc).getKamas())
					.append('|');
					continue;
				}
				
				GPersonnage p = null;
				if(cc.getCharacterType() == CharacterType.PLAYER) p =(GPersonnage) cc;
				
				sb
				.append(team.getFightTeamResultType()).append(';')  //y'a genre 6, 0, 1, 2 ... jsais pas cest quoi ? 
				.append(cc.getID()).append(';')
				.append(cc.getName()).append(';')
				.append(cc.getLevel()).append(';')
				.append(cc.getStatistique().getPdv() <= 0 ? 1 : 0).append(';');
				//
				if(pvp == false){//fight type = 0 = pvm/défis ...
					sb
					.append(p == null ? "" : p.getWorld().persoXPLevels[p.getLevel()]).append(';')
					.append(p == null ? "" : p.getXP()).append(';')
					.append(p == null ? "" : p.getWorld().persoXPLevels[p.getLevel()+1]).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getXp()).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getGuildXp()).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getMountXp()).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getMountXp()).append(';');
					if(gains.get(cc) != null){
						for(GItem i : gains.get(cc).getDrops()){
							sb.append(i.getTemplate().getID()).append('~')
							.append(i.getQuantity()).append(',');
						}
					}
					sb
					.append(gains.get(cc) == null ? "" : gains.get(cc).getKamas())
					.append('|');
				}else{//fight type = 1 = pvp/prismes...
					sb
					.append(cc.getWorld().honorXPLevels[cc.getStatistique().getGrade(cc.getWorld())]).append(';')
					.append(cc.getStatistique().getHonor()).append(';')
					.append(cc.getWorld().persoXPLevels[cc.getStatistique().getGrade(cc.getWorld())+1]).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getHonnor()).append(';')
					.append(cc.getStatistique().getGrade(cc.getWorld())).append(';')
					.append(cc.getStatistique().getDishonor()).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getDishonnor()).append(';');
					if(gains.get(cc) != null){
						for(GItem i : gains.get(cc).getDrops()){
							sb.append(i.getTemplate().getID()).append('~')
							.append(i.getQuantity()).append(',');
						}
					}
					sb
					.append(gains.get(cc) == null ? "" : gains.get(cc).getKamas())
					.append(p == null ? "" : p.getWorld().persoXPLevels[p.getLevel()]).append(';')
					.append(p == null ? "" : p.getXP()).append(';')
					.append(p == null ? "" : p.getWorld().persoXPLevels[p.getLevel()+1]).append(';')
					.append(gains.get(cc) == null ? "" : gains.get(cc).getXp()).append(';')   
					.append('|');
				}
			}
		}
		
		Syn.d("returning GE.toPacket");
		return sb.toString();
	}
	
	
	
	/*
	 _loc1.onEnd = function (sExtraData)
    {
        if (this.api.kernel.MapsServersManager.isBuilding)
        {
            this.addToQueue({object: this, method: this.onEnd, params: [sExtraData]});
            return;
        } // end if
        this._bIsBusy = true;
        var _loc3 = (dofus.graphics.gapi.ui.FightChallenge)((dofus.graphics.gapi.ui.FightChallenge)(this.api.ui.getUIComponent("FightChallenge")));
        this.api.kernel.StreamingDisplayManager.onFightEnd();
        var _loc4 = {winners: [], loosers: [], collectors: [], challenges: _loc3.challenges.clone()};
        this.api.datacenter.Game.results = _loc4;
        _loc3.cleanChallenge();
        var _loc5 = sExtraData.split("|");
        var _loc6 = -1;
        if (!_global.isNaN(Number(_loc5[0])))
        {
            _loc4.duration = Number(_loc5[0]);
        }
        else
        {
            var _loc7 = _loc5[0].split(";");
            _loc4.duration = Number(_loc7[0]);
            _loc6 = Number(_loc7[1]);
        } // end else if
        this.api.datacenter.Basics.aks_game_end_bonus = _loc6;
        var _loc8 = Number(_loc5[1]);
        var _loc9 = Number(_loc5[2]);
        _loc4.fightType = _loc9;
        var _loc10 = new ank.utils.ExtendedArray();
        var _loc11 = 0;
        this.parsePlayerData(_loc4, 3, _loc8, _loc5, _loc9, _loc11, _loc10);
    };
    
    _loc1.parsePlayerData = function (oResults, nStartIndex, nSenderID, aTmp, nFightType, nKamaDrop, eaFightDrop)
    {
        var _loc9 = nStartIndex;
        var _loc10 = aTmp[_loc9].split(";");
        var _loc11 = new Object();
        if (Number(_loc10[0]) != 6)
        {
            _loc11.id = Number(_loc10[1]);
            if (_loc11.id == this.api.datacenter.Player.ID)
            {
                if (Number(_loc10[0]) == 0)
                {
                    this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_FIGHT_LOST);
                }
                else
                {
                    this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_FIGHT_WON);
                } // end if
            } // end else if
            var _loc13 = this.api.kernel.CharactersManager.getNameFromData(_loc10[2]);
            _loc11.name = _loc13.name;
            _loc11.type = _loc13.type;
            _loc11.level = Number(_loc10[3]);
            _loc11.bDead = _loc10[4] == "1" ? (true) : (false);
            switch (nFightType)
            {
                case 0:
                {
                    _loc11.minxp = Number(_loc10[5]);
                    _loc11.xp = Number(_loc10[6]);
                    _loc11.maxxp = Number(_loc10[7]);
                    _loc11.winxp = Number(_loc10[8]);
                    _loc11.guildxp = Number(_loc10[9]);
                    _loc11.mountxp = Number(_loc10[10]);
                    var _loc12 = _loc10[11].split(",");
                    if (_loc11.id == this.api.datacenter.Player.ID && _loc12.length > 10)
                    {
                        this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_GREAT_DROP);
                    } // end if
                    _loc11.kama = _loc10[12];
                    break;
                } 
                case 1:
                {
                    _loc11.minhonour = Number(_loc10[5]);
                    _loc11.honour = Number(_loc10[6]);
                    _loc11.maxhonour = Number(_loc10[7]);
                    _loc11.winhonour = Number(_loc10[8]);
                    _loc11.rank = Number(_loc10[9]);
                    _loc11.disgrace = Number(_loc10[10]);
                    _loc11.windisgrace = Number(_loc10[11]);
                    _loc11.maxdisgrace = this.api.lang.getMaxDisgracePoints();
                    _loc11.mindisgrace = 0;
                    _loc12 = _loc10[12].split(",");
                    if (_loc11.id == this.api.datacenter.Player.ID && _loc12.length > 10)
                    {
                        this.api.kernel.SpeakingItemsManager.triggerEvent(dofus.managers.SpeakingItemsManager.SPEAK_TRIGGER_GREAT_DROP);
                    } // end if
                    _loc11.kama = _loc10[13];
                    _loc11.minxp = Number(_loc10[14]);
                    _loc11.xp = Number(_loc10[15]);
                    _loc11.maxxp = Number(_loc10[16]);
                    _loc11.winxp = Number(_loc10[17]);
                    break;
                } 
            } // End of switch
        }
        else
        {
            _loc12 = _loc10[1].split(",");
            _loc11.kama = _loc10[2];
            nKamaDrop = nKamaDrop + Number(_loc11.kama);
        } // end else if
        _loc11.items = new Array();
        var _loc14 = _loc12.length;
        while (--_loc14 >= 0)
        {
            var _loc15 = _loc12[_loc14].split("~");
            var _loc16 = Number(_loc15[0]);
            var _loc17 = Number(_loc15[1]);
            if (_global.isNaN(_loc16))
            {
                break;
            } // end if
            if (_loc16 == 0)
            {
                continue;
            } // end if
            var _loc18 = new dofus.datacenter.Item(0, _loc16, _loc17);
            _loc11.items.push(_loc18);
        } // end while
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
        ++_loc9;
        if (_loc9 < aTmp.length)
        {
            this.addToQueue({object: this, method: this.parsePlayerData, params: [oResults, _loc9, nSenderID, aTmp, nFightType, nKamaDrop, eaFightDrop]});
        }
        else
        {
            this.onParseItemEnd(nSenderID, oResults, eaFightDrop, nKamaDrop);
        } // end else if
    };
    
    _loc1.onParseItemEnd = function (nSenderID, oResults, eaFightDrop, nKamaDrop)
    {
        if (eaFightDrop.length)
        {
            var _loc6 = Math.ceil(eaFightDrop.length / oResults.winners.length);
            var _loc7 = 0;
            
            while (++_loc7, _loc7 < oResults.winners.length)
            {
                var _loc8 = eaFightDrop.length;
                oResults.winners[_loc7].kama = Math.ceil(nKamaDrop / _loc6);
                if (_loc7 == oResults.winners.length - 1)
                {
                    _loc6 = _loc8;
                } // end if
                var _loc9 = _loc8 - _loc6;
                
                while (++_loc9, _loc9 < _loc8)
                {
                    oResults.winners[_loc7].items.push(eaFightDrop.pop());
                } // end while
            } // end while
        } // end if
        if (nSenderID == this.api.datacenter.Player.ID)
        {
            this.aks.GameActions.onActionsFinish(String(nSenderID));
        } // end if
        this.api.datacenter.Game.isRunning = false;
        var _loc10 = this.api.datacenter.Sprites.getItemAt(nSenderID).sequencer;
        this._bIsBusy = false;
        if (_loc10 != undefined)
        {
            _loc10.addAction(false, this.api.kernel.GameManager, this.api.kernel.GameManager.terminateFight);
            _loc10.execute(false);
        }
        else
        {
            ank.utils.Logger.err("[AKS.Game.onEnd] Impossible de trouver le sequencer");
            ank.utils.Timer.setTimer(this, "game", this.api.kernel.GameManager, this.api.kernel.GameManager.terminateFight, 500);
        } // end else if
        this.api.kernel.TipsManager.showNewTip(dofus.managers.TipsManager.TIP_FIGHT_ENDFIGHT);
    };
    
	 */
	
	
	

}