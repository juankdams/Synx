package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class GetAnimationDuration extends dsg
{
  private static final Logger K = Logger.getLogger(GetAnimationDuration.class);
  private static final String NAME = "getAnimationDuration";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("animationName", "Nom de l'animation", bxT.giZ, false) };

  private static final bYE[] bxk = { new bYE("time", "Durée de l'animation en ms (0 dans le cas d'une anim en boucle)", bxT.gja, false) };

  public GetAnimationDuration(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getAnimationDuration";
  }

  public String getDescription() {
    return "Renvoi la durée de l'animation en ms";
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
    int i = localcUo.H(str);
    if (i == -1) {
      K.warn("animation (" + str + ") qui boucle");
      i = 0;
    }

    Bz(i);
  }
}