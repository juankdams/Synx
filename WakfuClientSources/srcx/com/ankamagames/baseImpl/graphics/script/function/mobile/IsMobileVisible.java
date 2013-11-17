package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.keplerproject.luajava.LuaState;

public class IsMobileVisible extends dsg
{
  private static final String NAME = "isMobileVisible";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id du mobile", bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("visible", "La visibilité du mobile", bxT.gjc, false) };

  public IsMobileVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isMobileVisible";
  }

  public String getDescription()
  {
    return "indique si le mobile est visible";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return bxk;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    kl((localcUo != null) && (localcUo.isVisible()));
  }
}