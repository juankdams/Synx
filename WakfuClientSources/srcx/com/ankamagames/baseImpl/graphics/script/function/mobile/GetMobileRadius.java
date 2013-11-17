package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileRadius extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileRadius.class);
  private static final String NAME = "getMobileRadius";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("radius", null, bxT.gjb, false) };

  public GetMobileRadius(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileRadius";
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
    if (localcUo != null) {
      dj(localcUo.jdMethod_if());
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}