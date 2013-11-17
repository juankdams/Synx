package com.ankamagames.wakfu.client.core.script;

import acL;
import bFB;
import bXf;
import bYE;
import bif;
import bxT;
import cIG;
import dsg;
import org.keplerproject.luajava.LuaState;

public class ResourceFunctionsLibrary$AddResourceDestructionCallback extends dsg
{
  ResourceFunctionsLibrary$AddResourceDestructionCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addResourceDestructionCallback";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("Resource X", null, bxT.gjb, false), new bYE("Resource Y", null, bxT.gjb, false), new bYE("Function name", null, bxT.giZ, false), new bYE("Parameters", null, bxT.gje, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    bXf localbXf = cYS();
    int i = Br(0);
    int j = Br(1);
    String str = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);

    if (acL.apd().aP(i, j) != null) {
      localbXf.a(str, arrayOfbFB, new cIG[0]);
    }

    acL.apd().b(new bif(this, i, j, localbXf, str, arrayOfbFB));
  }
}