package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import dps;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IsAnimatedElement extends dsg
{
  private static final Logger K = Logger.getLogger(IsAnimatedElement.class);
  private static final String NAME = "isAnimatedElement";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("isAnimatedElement", null, bxT.gjc, false) };

  public IsAnimatedElement(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "isAnimatedElement";
  }

  public bYE[] ce() {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt) {
    long l = Bu(0);

    if (bQK.bXG().gY(l) != null) {
      kl(true);
      return;
    }
    kl(dps.cXa().jR(l) != null);
  }
}