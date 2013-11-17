package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileAnimationSuffix extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileAnimationSuffix.class);
  private static final String NAME = "setMobileAnimationSuffix";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("animationSuffix", "Suffixe des animations", bxT.giZ, true) };

  public SetMobileAnimationSuffix(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileAnimationSuffix";
  }

  public String getDescription()
  {
    return "Spécifie un suffixe qui sera ajouté à toutes les anims";
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

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo == null) {
      a(K, "le mobile " + l + " n'existe pas ");
      return;
    }

    localcUo.er(paramInt == 2 ? Bv(1) : null);
  }
}