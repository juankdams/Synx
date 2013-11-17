package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileStatus extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileStatus.class);
  private static final String NAME = "getMobileStatus";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id du mobile", bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("status", "Status du mobile (0 = NORMAL, 1 = KO, 2 = DEAD)", bxT.gja, false) };

  public GetMobileStatus(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileStatus";
  }

  public String getDescription()
  {
    return "Retourne l'état du mobile.";
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
      Bz(localcUo.aGC());
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}