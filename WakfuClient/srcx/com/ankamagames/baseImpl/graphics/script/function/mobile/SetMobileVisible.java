package com.ankamagames.baseImpl.graphics.script.function.mobile;

import ahm;
import bQK;
import bYE;
import bxT;
import dps;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileVisible extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileVisible.class);
  private static final String NAME = "setMobileVisible";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("visible", "Visilité", bxT.gjc, false) };

  public SetMobileVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileVisible";
  }

  public String getDescription()
  {
    return "Change la visibilité d'un mobile";
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
    boolean bool = By(1);

    Object localObject = bQK.bXG().gY(l);
    if (localObject == null)
      localObject = dps.cXa().jR(l);
    if (localObject != null)
      ((ahm)localObject).setVisible(bool);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}