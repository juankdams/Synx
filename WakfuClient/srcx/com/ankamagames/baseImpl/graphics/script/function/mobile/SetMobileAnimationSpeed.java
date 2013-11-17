package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileAnimationSpeed extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileAnimationSpeed.class);
  private static final String NAME = "setMobileAnimationSpeed";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("animationSpeed", "Nouvelle vitesse d'animation (1 = normale)", bxT.gjb, false) };

  public SetMobileAnimationSpeed(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileAnimationSpeed";
  }

  public String getDescription()
  {
    return "Change la vitesse d'exécution de l'animation d'un mobile.";
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
      localcUo.av(f);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}