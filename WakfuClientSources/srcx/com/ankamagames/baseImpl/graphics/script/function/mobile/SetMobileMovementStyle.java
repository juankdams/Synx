package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dMM;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileMovementStyle extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileMovementStyle.class);
  private static final String NAME = "setMobileMovementStyle";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("walkStyle", "Style de déplacement à utiliser pour la marche", bxT.giZ, false), new bYE("runStyle", "Style de déplacement à utiliser pour la course", bxT.giZ, true), new bYE("uniqueUsage", null, bxT.gjc, true) };

  public SetMobileMovementStyle(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileMovementStyle";
  }

  public String getDescription()
  {
    return "Définit le style de mouvement d'un mobile (WALK, RUN, SLIDE, SWIM, WALK_CARRY).";
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
    String str2 = paramInt > 2 ? Bv(2) : str1;

    boolean bool = paramInt > 3 ? By(3) : true;

    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo != null) && ((localcUo instanceof dMM))) {
      dMM localdMM = (dMM)localcUo;
      localdMM.a(bool, str1, str2);
    } else {
      a(K, "le mobile " + l + " n'existe pas ");
    }
  }
}