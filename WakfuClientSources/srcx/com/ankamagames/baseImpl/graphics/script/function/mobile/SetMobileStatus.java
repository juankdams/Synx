package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class SetMobileStatus extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileStatus.class);
  private static final String NAME = "setMobileStatus";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("statusId", "Id du status (0 = NORMAL,  1 = KO, 2 = DEAD)", bxT.gja, false) };

  public SetMobileStatus(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileStatus";
  }

  public String getDescription()
  {
    return "Change le status d'un mobile";
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
    byte b = (byte)Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.setStatus(b);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}