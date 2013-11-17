package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetMobileHeight extends dsg
{
  private static final Logger K = Logger.getLogger(GetMobileHeight.class);
  private static final String NAME = "getMobileHeight";
  private static final bYE[] Rf = { new bYE("mobileId", "L'Id du mobile", bxT.giY, false) };

  private static final bYE[] bxk = { new bYE("height", "La hauteur du mobile", bxT.gja, false) };

  public GetMobileHeight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobileHeight";
  }

  public String getDescription()
  {
    return "Récupère la hauteur d'un mobile";
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
      Bz(localcUo.BC());
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
      cYR();
    }
  }
}