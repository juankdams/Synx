package com.ankamagames.wakfu.client.core.script.fightLibrary.effectArea;

import aAZ;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public final class EffectAreaFunctionsLibrary extends hQ
{
  private final aAZ Vv;

  public EffectAreaFunctionsLibrary(aAZ paramaAZ)
  {
    this.Vv = paramaAZ;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new GetTarget(paramLuaState, this.Vv), new GetAreaPosition(paramLuaState, this.Vv), new GetAreaId(paramLuaState, this.Vv) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "EffectArea";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}