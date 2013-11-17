package com.ankamagames.baseImpl.graphics.script.function.mobile;

import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobilePosition extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobilePosition.class);
  private static final String NAME = "setMobilePosition";
  private static final bYE[] Rf = { new bYE("mobileId", "id du mobile", bxT.giY, false), new bYE("worldX", "Positiuon x", bxT.gjb, false), new bYE("worldY", "Position y", bxT.gjb, false), new bYE("altitude", "Position z", bxT.gjb, false) };

  public SetMobilePosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobilePosition";
  }

  public String getDescription()
  {
    return "Change la position du mobile";
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
    float f1 = Bt(1);
    float f2 = Bt(2);
    float f3 = Bt(3);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.k(f1, f2, f3);
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}