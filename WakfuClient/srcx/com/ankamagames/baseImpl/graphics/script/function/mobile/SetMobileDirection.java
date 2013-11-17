package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileDirection extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileDirection.class);
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false), new bYE("directionIndex", "Nouvelle direction du mobile", bxT.gja, false) };

  public SetMobileDirection(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileDirection";
  }

  public String getDescription()
  {
    return "Change la direction du mobile dans un système à 8 directions.";
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
    int i = Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo != null)
      localcUo.c(CG.eu(i));
    else
      a(K, "le mobile " + l + " n'existe pas ");
  }
}