package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import cqJ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetDistanceBetweenMobile extends dsg
{
  private static final Logger K = Logger.getLogger(GetDistanceBetweenMobile.class);
  private static final String NAME = "getDistanceBetweenMobile";
  private static final bYE[] Rf = { new bYE("mobileIdA", "L'Id du premier mobile", bxT.giY, false), new bYE("mobileIdB", "L'id du second mobile", bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("distance", "La distance entre les deux mobiles (deltaX + deltaY)", bxT.gja, false) };

  public GetDistanceBetweenMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getDistanceBetweenMobile";
  }

  public String getDescription()
  {
    return "Retourne la distance entre deux mobiles en nombre de cases";
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
    long l1 = Bu(0);
    long l2 = Bu(1);

    cUo localcUo1 = bQK.bXG().gY(l1);
    if (localcUo1 == null) {
      a(K, "le mobile " + l1 + "n'existe pas");
      cYR();
      return;
    }
    cUo localcUo2 = bQK.bXG().gY(l2);
    if (localcUo2 == null) {
      a(K, "le mobile " + l2 + "n'existe pas");
      cYR();
      return;
    }

    Bz(cqJ.c(localcUo1, localcUo2));
  }
}