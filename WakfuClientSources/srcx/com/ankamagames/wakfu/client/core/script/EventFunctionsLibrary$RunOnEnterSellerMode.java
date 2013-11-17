package com.ankamagames.wakfu.client.core.script;

import bFB;
import bXf;
import bYE;
import bhD;
import bxT;
import dsg;
import ol;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$RunOnEnterSellerMode extends dsg
{
  public EventFunctionsLibrary$RunOnEnterSellerMode(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "runOnEnterSellerMode";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    ol localol = new ol();
    String str = Bv(0);
    bFB[] arrayOfbFB = eT(1, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localol, localbXf, str, arrayOfbFB, true);
  }
}