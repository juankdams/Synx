package com.ankamagames.wakfu.client.core.script;

import bFB;
import bVl;
import bXf;
import bYE;
import bxT;
import cBa;
import dsg;
import org.keplerproject.luajava.LuaState;

public class InteractiveElementFunctionsLibrary$AddInteractiveElementDestructionCallback extends dsg
{
  InteractiveElementFunctionsLibrary$AddInteractiveElementDestructionCallback(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addIEDestructionCallback";
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

    bVl.caZ().b(new cBa(this, i, localbXf, str, arrayOfbFB));
  }
}