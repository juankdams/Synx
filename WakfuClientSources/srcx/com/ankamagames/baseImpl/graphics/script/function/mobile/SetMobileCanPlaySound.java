package com.ankamagames.baseImpl.graphics.script.function.mobile;

import ahm;
import bQK;
import bYE;
import bxT;
import dps;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileCanPlaySound extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileCanPlaySound.class);
  private static final String NAME = "setMobileCanPlaySound";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("canPlaySound", null, bxT.gjc, false) };

  public SetMobileCanPlaySound(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileCanPlaySound";
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
    if (localObject == null) {
      localObject = dps.cXa().jR(l);
    }
    if (localObject != null)
      ((ahm)localObject).cb(bool);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}