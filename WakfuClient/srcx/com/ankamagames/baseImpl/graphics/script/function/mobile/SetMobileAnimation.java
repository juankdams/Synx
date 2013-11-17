package com.ankamagames.baseImpl.graphics.script.function.mobile;

import ahm;
import bFB;
import bQK;
import bXf;
import bYE;
import bxT;
import dps;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;
import pn;

public class SetMobileAnimation extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileAnimation.class);
  private static final String NAME = "setMobileAnimation";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("animationName", "Nom de l'animation", bxT.giZ, false), new bYE("func", null, bxT.giZ, true), new bYE("params", null, bxT.gje, true) };

  public SetMobileAnimation(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileAnimation";
  }

  public String getDescription() {
    return "joue une animation sur un mobile";
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
    String str1 = Bv(1);

    Object localObject1 = bQK.bXG().gY(l);
    if (localObject1 == null) {
      localObject1 = dps.cXa().jR(l);
    }
    if (localObject1 != null) {
      ((ahm)localObject1).eq(str1);
      ((ahm)localObject1).asZ();

      if (paramInt > 2) {
        bXf localbXf = cYS();
        String str2 = Bv(2);
        bFB[] arrayOfbFB = eT(3, paramInt);

        boolean bool = localbXf.a(str2, arrayOfbFB);

        Object localObject2 = localObject1;
        ((ahm)localObject1).a(new pn(this, localObject2, bool, localbXf, str2, arrayOfbFB));
      }

    }
    else
    {
      a(K, "le mobile " + l + " n'existe pas ");
    }
  }
}