package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileToHitAnimation extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileToHitAnimation.class);
  private static final String NAME = "setMobileToHitAnimation";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false) };

  public SetMobileToHitAnimation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileToHitAnimation";
  }

  public String getDescription()
  {
    return "Joue l'animation hit du mobile";
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
    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
    {
      localcUo.eq(localcUo.att());
    }
    else a(K, "le mobile " + l + " n'existe pas ");
  }
}