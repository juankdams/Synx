package com.ankamagames.baseImpl.graphics.script;

import bGL;
import bYE;
import bxT;
import cEi;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$SetPointLightPosition extends dsg
{
  LightFunctionsLibrary$SetPointLightPosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPointLightPosition";
  }

  public String getDescription()
  {
    return "Repositionne une lumière pmonctuelle";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", "Id de lumière", bxT.gja, false), new bYE("x", "Position x", bxT.gjb, false), new bYE("y", "Position y", bxT.gjb, false), new bYE("z", "Position z", bxT.gjb, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    bGL localbGL = LightFunctionsLibrary.to(Br(0));
    if (localbGL != null) {
      cEi localcEi = localbGL.bDo();
      localcEi.m(Bt(1), Bt(2), Bt(3));
    }
    else {
      a(LightFunctionsLibrary.gV(), "La lumière n'existe pas");
    }
  }
}