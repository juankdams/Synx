package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileAlpha extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileAlpha.class);
  private static final String NAME = "getMobileAlpha";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false) };
  private static final bYE[] bxk = { new bYE("alpha", "opacité du personnage", bxT.gjb, false) };

  public GetMobileAlpha(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileAlpha";
  }

  public String getDescription()
  {
    return "Retourne l'opacité du mobile.";
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
      dj(localcUo.getAlpha());
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}