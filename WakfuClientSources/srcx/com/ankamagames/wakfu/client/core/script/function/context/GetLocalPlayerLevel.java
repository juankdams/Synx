package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetLocalPlayerLevel extends dsg
{
  public GetLocalPlayerLevel(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getPlayerLevel";
  }

  public bYE[] ce() {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("localPlayerLevel", null, bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    Bz(byv.bFN().bFO().nU());
  }
}