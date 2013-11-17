package com.ankamagames.baseImpl.graphics.script;

import bYE;
import bxT;
import cmL;
import dsg;
import org.keplerproject.luajava.LuaState;

class EffectFunctionsLibrary$CreateBloomPostProcess extends dsg
{
  EffectFunctionsLibrary$CreateBloomPostProcess(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "createBloomPostProcess";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("startDuration", null, bxT.gjb, true), new bYE("midDuration", null, bxT.gjb, true), new bYE("endDuration", null, bxT.gjb, true), new bYE("minValue", null, bxT.gjb, true), new bYE("red", null, bxT.gjb, true), new bYE("green", null, bxT.gjb, true), new bYE("blue", null, bxT.gjb, true), new bYE("alpha", null, bxT.gjb, true), new bYE("blurX", null, bxT.gjb, true), new bYE("blurY", null, bxT.gjb, true) };
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
    float f4 = 0.7F;
    float f5 = 0.3F;
    float f6 = 0.3F;
    float f7 = 0.3F;
    float f8 = 1.0F;
    int i = 16;
    int j = 16;

    if (paramInt >= 1) {
      f1 = (float)Bs(0);
    }
    if (paramInt >= 2) {
      f2 = (float)Bs(1);
    }
    if (paramInt >= 3) {
      f3 = (float)Bs(2);
    }
    if (paramInt >= 4) {
      f4 = (float)Bs(3);
    }
    if (paramInt >= 5) {
      f5 = (float)Bs(4);
    }
    if (paramInt >= 6) {
      f6 = (float)Bs(5);
    }
    if (paramInt >= 7) {
      f7 = (float)Bs(6);
    }
    if (paramInt >= 8) {
      f8 = (float)Bs(7);
    }
    if (paramInt >= 9) {
      i = Br(8);
    }
    if (paramInt == 10) {
      j = Br(9);
    }

    Bz(cmL.hSc);

    throw new UnsupportedOperationException("TODO: post process Bloom");
  }
}