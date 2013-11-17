package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileStaticAnimationKey extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileStaticAnimationKey.class);
  private static final boolean DEBUG = true;
  private static final String NAME = "setMobileAnimationStaticKey";
  private static final bYE[] Rf = { new bYE("mobileId", null, bxT.giY, false), new bYE("animName", null, bxT.giZ, true) };

  public SetMobileStaticAnimationKey(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "setMobileAnimationStaticKey";
  }

  public bYE[] ce() {
    return Rf;
  }

  public bYE[] cf() {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
    {
      String str = paramInt == 2 ? Bv(1) : "AnimStatique";

      localcUo.es(str);
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
    }
  }
}