package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetPartVisible extends dsg
{
  private static final Logger K = Logger.getLogger(SetPartVisible.class);
  private static final String NAME = "setPartVisible";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("visible", "Visibilité", bxT.gjc, false), new bYE("partNames", "Noms des 'parts'", bxT.gje, false) };

  public SetPartVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPartVisible";
  }

  public String getDescription() {
    return "Change la visibilité d'une 'part' du mobile";
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

    boolean bool = By(1);
    String[] arrayOfString = new String[paramInt - 2];
    for (int i = 2; i < paramInt; i++) {
      arrayOfString[(i - 2)] = Bv(i);
    }
    localcUo.a(arrayOfString, bool);
  }
}