package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetLocalPlayerName extends dsg
{
  public GetLocalPlayerName(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getPlayerName";
  }

  public bYE[] ce() {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("localPlayerName", null, bxT.giZ, false) };
  }

  protected void S(int paramInt)
  {
    pP(byv.bFN().bFO().getName());
  }
}