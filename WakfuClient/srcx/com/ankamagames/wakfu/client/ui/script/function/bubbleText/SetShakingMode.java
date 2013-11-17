package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import dcY;
import dsg;
import org.keplerproject.luajava.LuaState;

final class SetShakingMode extends dsg
{
  SetShakingMode(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setShakingMode";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", null, bxT.gja, false), new bYE("enable", null, bxT.gjc, true) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    if (i < 0) {
      return;
    }
    dcY localdcY = Kd.UN().fC(i);
    if (localdcY != null) {
      boolean bool = true;
      if (paramInt > 1)
        bool = By(1);
      localdcY.setShakingBubble(bool);
    }
  }
}