package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileAlpha extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileAlpha.class);
  private static final String NAME = "setMobileAlpha";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("alpha", "Valeur de l'opacité", bxT.gjb, false) };

  public SetMobileAlpha(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileAlpha";
  }

  public String getDescription()
  {
    return "Change l'opacité d'un mobile";
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
    float f = (float)Bs(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.z(f);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}