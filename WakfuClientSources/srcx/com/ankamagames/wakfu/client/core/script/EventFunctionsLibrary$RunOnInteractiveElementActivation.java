package com.ankamagames.wakfu.client.core.script;

import bFB;
import bWX;
import bXf;
import bYE;
import bhD;
import bxT;
import dJO;
import dsg;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$RunOnInteractiveElementActivation extends dsg
{
  public EventFunctionsLibrary$RunOnInteractiveElementActivation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "runOnInteractiveElementActivation";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", null, bxT.giY, false), new bYE("actionType", null, bxT.giZ, false), new bYE("funcName", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    short s = dJO.valueOf(Bv(1)).dja();
    bWX localbWX = new bWX(l, s);
    String str = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localbWX, localbXf, str, arrayOfbFB, true);
  }
}