package com.ankamagames.baseImpl.graphics.script;

import bGL;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$SetPointLightRange extends dsg
{
  LightFunctionsLibrary$SetPointLightRange(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPointLightRange";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", null, bxT.gja, false), new bYE("range", null, bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    bGL localbGL = LightFunctionsLibrary.to(Br(0));
    if (localbGL != null)
      localbGL.aG(Bt(1));
    else
      a(LightFunctionsLibrary.gV(), "La lumière n'existe pas");
  }
}