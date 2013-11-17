package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class FightEventFunctionsLibrary extends hQ
{
  private static final FightEventFunctionsLibrary bjG = new FightEventFunctionsLibrary();
  private static final bYE[] bjH = { new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  private static final bYE[] bjI = { new bYE("mobileId", null, bxT.giY, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  private static final bYE[] bjJ = { new bYE("mobileId", null, bxT.giY, false), new bYE("spellElement", null, bxT.giY, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };

  public static FightEventFunctionsLibrary Eo()
  {
    return bjG;
  }

  public final String getName()
  {
    return "FightEvent";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new FightEventFunctionsLibrary.AddPlacementStartCallback(paramLuaState), new FightEventFunctionsLibrary.AddPlacementEndCallback(paramLuaState), new FightEventFunctionsLibrary.AddFightStartCallback(paramLuaState), new FightEventFunctionsLibrary.AddFightEndCallback(paramLuaState), new FightEventFunctionsLibrary.AddTableTurnStartCallback(paramLuaState), new FightEventFunctionsLibrary.AddTableTurnEndCallback(paramLuaState), new FightEventFunctionsLibrary.AddFighterTurnStartCallback(paramLuaState, null), new FightEventFunctionsLibrary.AddFighterTurnEndCallback(paramLuaState, null), new FightEventFunctionsLibrary.AddFighterJoinFightCallback(paramLuaState, null), new FightEventFunctionsLibrary.AddFighterLeaveFightCallback(paramLuaState, null), new FightEventFunctionsLibrary.AddFighterWinFightCallback(paramLuaState, null), new FightEventFunctionsLibrary.AddFighterLoseFightCallback(paramLuaState, null), new FightEventFunctionsLibrary.SpellCastCallback(paramLuaState, null) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}