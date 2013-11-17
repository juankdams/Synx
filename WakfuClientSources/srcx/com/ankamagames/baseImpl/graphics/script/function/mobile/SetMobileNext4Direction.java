package com.ankamagames.baseImpl.graphics.script.function.mobile;

import CG;
import bQK;
import bYE;
import bxT;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SetMobileNext4Direction extends dsg
{
  private static final Logger K = Logger.getLogger(SetMobileNext4Direction.class);
  private static final String NAME = "setMobileNext4Direction";
  private static final bYE[] Rf = { new bYE("mobileId", "Id du mobile", bxT.giY, false) };

  public SetMobileNext4Direction(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setMobileNext4Direction";
  }

  public String getDescription()
  {
    return "Oriente un mobile pour qu il soit dans une direction 4";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    cUo localcUo = bQK.bXG().gY(l);
    if ((localcUo != null) && (!localcUo.E().LP()))
      localcUo.c(CG.eu((localcUo.E().m_index + 1) % 8));
    else if (localcUo == null)
      a(K, "le mobile " + l + " n'existe pas ");
  }
}