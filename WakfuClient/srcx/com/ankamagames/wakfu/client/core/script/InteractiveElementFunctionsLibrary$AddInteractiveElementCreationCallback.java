package com.ankamagames.wakfu.client.core.script;

import bFB;
import bVl;
import bXf;
import bYE;
import bxT;
import cIG;
import cxI;
import dsg;
import org.keplerproject.luajava.LuaState;

public class InteractiveElementFunctionsLibrary$AddInteractiveElementCreationCallback extends dsg
{
  InteractiveElementFunctionsLibrary$AddInteractiveElementCreationCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addIECreationCallback";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("ie ID", null, bxT.gjb, false), new bYE("Function name", null, bxT.giZ, false), new bYE("Parameters", null, bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    bXf localbXf = cYS();
    int i = Br(0);
    String str = Bv(1);
    bFB[] arrayOfbFB = eT(2, paramInt);

    if (bVl.caZ().hb(i) != null) {
      localbXf.a(str, arrayOfbFB, new cIG[0]);
    }

    bVl.caZ().b(new cxI(this, i, localbXf, str, arrayOfbFB));
  }
}