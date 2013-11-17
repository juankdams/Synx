package com.ankamagames.wakfu.client.core.script.function.context;

import bAF;
import bYE;
import bxT;
import byv;
import byz;
import dRM;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetLocalPlayerPetId extends dsg
{
  public GetLocalPlayerPetId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getPlayerPetId";
  }

  public bYE[] ce() {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("localPlayerPetId", null, bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    dRM localdRM = byv.bFN().bFO().bRF();
    if (localdRM != null)
      kg(localdRM.dsz().getId());
    else
      kg(0L);
  }
}