package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileToStaticAnimation extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileToStaticAnimation.class);
  private static final String NAME = "setMobileToStaticAnimation";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false) };

  public SetMobileToStaticAnimation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileToStaticAnimation";
  }

  public String getDescription()
  {
    return "Remet un mobile dans une pose statique, c'est-à-dire dans une animation par défaut.";
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
      localcUo.eq(localcUo.atp());
    }
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}