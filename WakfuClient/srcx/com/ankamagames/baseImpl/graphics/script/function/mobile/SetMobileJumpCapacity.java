package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileJumpCapacity extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileJumpCapacity.class);
  private static final String NAME = "setMobileJumpCapacity";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("jumpCapacity", null, bxT.gja, false) };

  public SetMobileJumpCapacity(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileJumpCapacity";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    short s = (short)Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo != null) && ((localcUo instanceof dMM)))
      ((dMM)localcUo).eJ(s);
    else
      a(K, "le mobile " + l + " n'existe pas ou n'est pas un PathMobile");
  }
}