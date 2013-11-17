package com.ankamagames.wakfu.client.core.script;

import aai;
import bYE;
import bhD;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$RemoveFightTurnStartedListener extends dsg
{
  public EventFunctionsLibrary$RemoveFightTurnStartedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeFightTurnStartedListener";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("playerId", null, bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    aai localaai = new aai(i);
    bhD.btQ().c(localaai);
  }
}