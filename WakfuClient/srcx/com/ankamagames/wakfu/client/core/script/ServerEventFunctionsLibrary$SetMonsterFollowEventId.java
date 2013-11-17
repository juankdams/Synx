package com.ankamagames.wakfu.client.core.script;

import aiI;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;
import pt;

class ServerEventFunctionsLibrary$SetMonsterFollowEventId extends dsg
{
  ServerEventFunctionsLibrary$SetMonsterFollowEventId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMonsterFollowEventId";
  }

  public bYE[] ce()
  {
    bYE[] arrayOfbYE = new bYE[1];
    arrayOfbYE[0] = new bYE("Id de l'évènement", null, bxT.gja, false);
    return arrayOfbYE;
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    pt localpt = (pt)aiI.dfQ.avu();
    localpt.cb(i);
  }
}