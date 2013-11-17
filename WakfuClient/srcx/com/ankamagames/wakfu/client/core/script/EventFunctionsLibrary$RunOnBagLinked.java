package com.ankamagames.wakfu.client.core.script;

import bFB;
import bXf;
import bYE;
import bhD;
import bxT;
import dsg;
import hl;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$RunOnBagLinked extends dsg
{
  public EventFunctionsLibrary$RunOnBagLinked(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "runOnBagLinked";
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
    hl localhl = new hl();
    String str = Bv(0);
    bFB[] arrayOfbFB = eT(1, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localhl, localbXf, str, arrayOfbFB, true);
  }
}