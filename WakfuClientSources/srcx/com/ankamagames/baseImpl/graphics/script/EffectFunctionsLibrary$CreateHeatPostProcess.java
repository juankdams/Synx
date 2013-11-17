package com.ankamagames.baseImpl.graphics.script;

import bYE;
import bxT;
import cmL;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateHeatPostProcess extends dsg
{
  EffectFunctionsLibrary$CreateHeatPostProcess(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createHeatPostProcess";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("startDuration", null, bxT.gjb, true), new bYE("midDuration", null, bxT.gjb, true), new bYE("endDuration", null, bxT.gjb, true), new bYE("strength", null, bxT.gjb, true) };
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("effectId", null, bxT.gja, false) };
  }

  protected void S(int paramInt)
  {
    float f1 = 1000.0F;
    float f2 = 2000.0F;
    float f3 = 1000.0F;
    float f4 = 1.0F;

    if (paramInt >= 1) {
      f1 = (float)Bs(0);
    }
    if (paramInt >= 2) {
      f2 = (float)Bs(1);
    }
    if (paramInt >= 3) {
      f3 = (float)Bs(2);
    }
    if (paramInt == 4) {
      f4 = (float)Bs(3);
    }

    Bz(cmL.hSd);
    throw new UnsupportedOperationException("TODO: post process Heat");
  }
}