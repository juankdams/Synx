package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dR;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class HasAnimation extends dsg
{
  private static final Logger K = Logger.getLogger(HasAnimation.class);
  private static final String NAME = "hasAnimation";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("animationName", null, bxT.giZ, false) };

  private static final bYE[] bxk = { new bYE("res", null, bxT.gjc, false) };

  public HasAnimation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "hasAnimation";
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
    if (localcUo == null) {
      a(K, "le mobile " + l + "n'existe pas");
      cYR();
      return;
    }

    String str = Bv(1);
    boolean bool = localcUo.aty().J(localcUo.kw(str));

    kl(bool);
  }
}