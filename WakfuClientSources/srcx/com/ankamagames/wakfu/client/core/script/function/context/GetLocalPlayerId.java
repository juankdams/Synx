package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetLocalPlayerId extends dsg
{
  public GetLocalPlayerId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getPlayer";
  }

  public String getDescription()
  {
    return "Fournit l'id du localPlayer";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("localPlayerId", "Id du joueur local", bxT.giY, false) };
  }

  protected void S(int paramInt)
  {
    kg(byv.bFN().bFO().getId());
  }
}