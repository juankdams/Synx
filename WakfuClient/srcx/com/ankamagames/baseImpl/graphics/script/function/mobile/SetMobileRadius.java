package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileRadius extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileRadius.class);
  private static final String NAME = "setMobileRadius";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("radius", "Nouveau rayon", bxT.gjb, false) };

  private static final bYE[] bxk = { new bYE("oldRadius", "Ancien rayon", bxT.gjb, false) };

  public SetMobileRadius(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileRadius";
  }

  public String getDescription()
  {
    return "Change le rayon du mobile pour permettre le multi-case";
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
    float f = Bt(1);

    cUo localcUo1 = bQK.bXG().gY(l);
    if (localcUo1 != null) {
      dj(localcUo1.jdMethod_if());
      localcUo1.R(f);
      cUo localcUo2 = localcUo1.cJA();
      if (localcUo2 != null)
        localcUo2.R(f);
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}