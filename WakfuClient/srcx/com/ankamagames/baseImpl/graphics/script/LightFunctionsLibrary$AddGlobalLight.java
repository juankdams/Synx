package com.ankamagames.baseImpl.graphics.script;

import aAa;
import bYE;
import btL;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$AddGlobalLight extends dsg
{
  LightFunctionsLibrary$AddGlobalLight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addGlobalLight";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("red", null, bxT.gjb, false), new bYE("green", null, bxT.gjb, false), new bYE("blue", null, bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("lightId", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    aAa localaAa = new aAa();
    localaAa.l(Bt(0), Bt(1), Bt(2));
    btL.gcv.a(localaAa);
    int i = LightFunctionsLibrary.bUn();
    LightFunctionsLibrary.b(i, localaAa);
    Bz(i);
  }
}