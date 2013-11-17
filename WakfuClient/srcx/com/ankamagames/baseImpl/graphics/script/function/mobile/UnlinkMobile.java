package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class UnlinkMobile extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileNext4Direction.class);
  private static final String NAME = "unlinkMobile";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };

  public UnlinkMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "unlinkMobile";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt) {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.cJE();
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}