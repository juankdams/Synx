package com.ankamagames.wakfu.client.core.script;

import anK;
import bYE;
import bxT;
import cIB;
import dsg;
import org.keplerproject.luajava.LuaState;
import sS;

class AmbianceFunctionLibrary$SetWeather extends dsg
{
  AmbianceFunctionLibrary$SetWeather(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setWeather";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("temperature", null, bxT.gjb, false), new bYE("rainIntensity", null, bxT.gjb, false), new bYE("wind", null, bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    float f1 = (float)Bs(0);
    float f2 = (float)Bs(1);
    float f3 = (float)Bs(2);
    cIB localcIB = new cIB();
    localcIB.a(f1, f1, f1, 0.0F, new float[] { f1 }, f2, 0, 0.0F, f3, 0.0F);

    sS.Al().a(localcIB);

    anK.drx.a(localcIB.cCC(), 100);
    anK.drx.az(localcIB.oz());
  }
}