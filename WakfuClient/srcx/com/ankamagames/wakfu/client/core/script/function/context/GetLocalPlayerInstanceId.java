package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetLocalPlayerInstanceId extends dsg
{
  public GetLocalPlayerInstanceId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getPlayerInstanceId";
  }

  public bYE[] ce() {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("localPlayerInstanceId", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    Bz(byv.bFN().bFO().Lk());
  }
}