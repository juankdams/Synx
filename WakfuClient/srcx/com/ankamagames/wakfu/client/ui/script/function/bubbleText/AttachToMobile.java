package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bQK;
import bYE;
import bxT;
import cUo;
import dIJ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class AttachToMobile extends dsg
{
  private static final Logger K = Logger.getLogger(AttachToMobile.class);

  AttachToMobile(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getName()
  {
    return "attachToMobile";
  }

  public String getDescription()
  {
    return "Applique une bulle à un mobile";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false), new bYE("mobileId", "Id du mobile auquel lier la bulle", bxT.giY, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    dIJ localdIJ = Kd.UN().fA(i);
    if (localdIJ == null) {
      a(K, "pas de bulle de texte " + i);
      return;
    }

    long l = Bu(1);
    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null) {
      localdIJ.setTarget(localcUo);
      localdIJ.a(localcUo, localcUo.getScreenX(), localcUo.getScreenY(), localcUo.eY());
    } else {
      a(K, "mobile inconnu " + l);
    }

    K.info("attachtoMobile " + localdIJ + ' ' + l);
  }
}