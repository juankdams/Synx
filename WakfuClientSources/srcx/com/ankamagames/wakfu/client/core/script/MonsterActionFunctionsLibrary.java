package com.ankamagames.wakfu.client.core.script;

import bMV;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class MonsterActionFunctionsLibrary extends hQ
{
  private final bMV cgV;

  public final String getName()
  {
    return "MonsterAction";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public MonsterActionFunctionsLibrary(bMV parambMV)
  {
    this.cgV = parambMV;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new MonsterActionFunctionsLibrary.GetMonster(this, paramLuaState), new MonsterActionFunctionsLibrary.GetPlayer(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}