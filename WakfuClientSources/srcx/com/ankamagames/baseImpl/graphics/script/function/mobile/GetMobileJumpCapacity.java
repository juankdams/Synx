package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileJumpCapacity extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileJumpCapacity.class);
  private static final String NAME = "getMobileJumpCapacity";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("jumpCapacity", null, bxT.gja, false) };

  public GetMobileJumpCapacity(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileJumpCapacity";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public final bYE[] cf()
  {
    return bxk;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo != null) && ((localcUo instanceof dMM))) {
      Bz(((dMM)localcUo).arG());
    } else {
      a(K, "le mobile " + l + " n'existe pas ou n'est pas un PathMobile");
      cYR();
    }
  }
}