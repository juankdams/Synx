package com.ankamagames.baseImpl.graphics.script.function.particle;

import bQK;
import bYE;
import bxT;
import cUo;
import cWS;
import dsg;
import org.keplerproject.luajava.LuaState;

public class ClearParticleSystemOnMobile extends dsg
{
  private static final String NAME = "clearParticleSystemOnMobile";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id unique du mobile", bxT.giY, false) };

  public ClearParticleSystemOnMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "clearParticleSystemOnMobile";
  }

  public String getDescription()
  {
    return "Détruit les systèmes de particules attachés à un mobile";
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
    if (localcUo == null)
      return;
    cWS.cKD().f(localcUo);
  }
}