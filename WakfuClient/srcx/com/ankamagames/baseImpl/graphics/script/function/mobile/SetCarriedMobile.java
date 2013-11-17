package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetCarriedMobile extends dsg
{
  private static final Logger K = Logger.getLogger(SetCarriedMobile.class);
  private static final String NAME = "setCarriedMobile";
  private static final bYE[] Rf = { new bYE("carrierId", null, bxT.giY, false), new bYE("carriedId", null, bxT.giY, true) };

  public SetCarriedMobile(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setCarriedMobile";
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
    long l1 = Bu(0);
    int i = paramInt > 1 ? 1 : 0;

    cUo localcUo1 = bQK.bXG().gY(l1);

    if (localcUo1 == null) {
      a(K, "Pas de carrier trouvé avec l'id " + l1);
      return;
    }

    if (i != 0) {
      if (localcUo1.cJC()) {
        a(K, "Le mobile " + l1 + " porte deja qq ");
        return;
      }

      long l2 = Bu(1);
      cUo localcUo2 = bQK.bXG().gY(l2);
      if ((localcUo2 != null) && (localcUo2.Vj())) {
        a(K, "Le mobile " + l1 + " est deja porté ou est null ");
        return;
      }
      localcUo1.m(localcUo2);
    } else {
      if (!localcUo1.cJC()) {
        a(K, "Le mobile " + l1 + " ne porte personne ");
        return;
      }
      localcUo1.cJD();
    }
  }
}