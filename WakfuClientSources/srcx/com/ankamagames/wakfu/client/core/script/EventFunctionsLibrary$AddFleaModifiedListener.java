package com.ankamagames.wakfu.client.core.script;

import bFB;
import bXf;
import bYE;
import bhD;
import bxT;
import clu;
import dsg;
import org.keplerproject.luajava.LuaState;

class EventFunctionsLibrary$AddFleaModifiedListener extends dsg
{
  public EventFunctionsLibrary$AddFleaModifiedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addFleaModifiedListener";
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
    clu localclu = new clu();
    String str = Bv(0);
    bFB[] arrayOfbFB = eT(1, paramInt);
    bXf localbXf = cYS();
    bhD.btQ().a(localclu, localbXf, str, arrayOfbFB, false);
  }
}