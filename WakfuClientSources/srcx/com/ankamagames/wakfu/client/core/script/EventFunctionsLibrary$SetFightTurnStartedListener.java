package com.ankamagames.wakfu.client.core.script;

import aai;
import bFB;
import bXf;
import bYE;
import bhD;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$SetFightTurnStartedListener extends dsg
{
  public EventFunctionsLibrary$SetFightTurnStartedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setFightTurnStartedListener";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("playerId", null, bxT.giY, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    aai localaai = new aai(l);
    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localaai, localbXf, str, arrayOfbFB, false);
  }
}