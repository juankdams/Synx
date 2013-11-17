package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public final class GetCarriedMobileId extends dsg
{
  private static final Logger K = Logger.getLogger(GetCarriedMobileId.class);

  private static final bYE[] Rf = { new bYE("carrierMobileId", null, bxT.giY, false) };

  private static final bYE[] Vt = { new bYE("carriedMobileId", null, bxT.giY, false) };

  public GetCarriedMobileId(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getCarriedMobileId";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo1 = bQK.bXG().gY(l);

    if (localcUo1 == null) {
      a(K, "Pas de carrier trouvé avec l'id " + l);
      kg(1L);
      return;
    }

    cUo localcUo2 = localcUo1.cJA();
    if (localcUo2 == null) {
      a(K, "Pas de carrier porté trouvé avec l'id " + l);
      kg(1L);
      return;
    }

    kg(localcUo2.getId());
  }
}