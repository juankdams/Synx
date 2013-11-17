package com.ankamagames.baseImpl.graphics.script;

import aAa;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$SetGlobalLightColor extends dsg
{
  LightFunctionsLibrary$SetGlobalLightColor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setGlobalLightColor";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", null, bxT.gja, false), new bYE("red", null, bxT.gjb, false), new bYE("green", null, bxT.gjb, false), new bYE("blue", null, bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    aAa localaAa = LightFunctionsLibrary.tq(Br(0));
    if (localaAa != null)
      localaAa.l(Bt(1), Bt(2), Bt(3));
    else
      a(LightFunctionsLibrary.gV(), "La lumière n'existe pas");
  }
}