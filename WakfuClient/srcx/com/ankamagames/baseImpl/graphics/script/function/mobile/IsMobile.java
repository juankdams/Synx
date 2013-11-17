package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class IsMobile extends dsg
{
  private static final Logger K = Logger.getLogger(IsMobile.class);
  private static final String NAME = "isMobile";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("isMobile", null, bxT.gjc, false) };

  public IsMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "isMobile";
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

    cUo localcUo = bQK.bXG().gY(l);
    kl(localcUo != null);
  }
}