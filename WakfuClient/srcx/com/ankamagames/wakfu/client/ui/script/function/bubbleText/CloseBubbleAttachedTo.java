package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bQK;
import bVf;
import bVl;
import bYE;
import bxT;
import dcY;
import dsg;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class CloseBubbleAttachedTo extends dsg
{
  private static final Logger K = Logger.getLogger(CloseBubbleAttachedTo.class);
  private static final bYE[] Rf = { new bYE("characterId", null, bxT.giY, false) };

  CloseBubbleAttachedTo(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "closeBubbleAttachedTo";
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
    Object localObject = bQK.bXG().gY(l);
    if (localObject == null) {
      localObject = bVl.caZ().hb(l);
    }

    if (localObject == null) {
      a(K, "mobile ou IE " + l + " inexistant");
      return;
    }

    Collection localCollection = Kd.UN().a((bVf)localObject);
    for (dcY localdcY : localCollection)
      Close.qt(localdcY.getAdviserId());
  }
}