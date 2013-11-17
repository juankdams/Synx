package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class SetDirectionParticleSystemVisibility extends dsg
{
  private static final String NAME = "setDirectionParticleSystemVisibility";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("visibility", null, bxT.gjc, false) };

  public SetDirectionParticleSystemVisibility(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setDirectionParticleSystemVisibility";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    boolean bool = By(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo == null) {
      return;
    }
    if (bool)
      localcUo.cgX();
    else
      localcUo.cgW();
  }
}