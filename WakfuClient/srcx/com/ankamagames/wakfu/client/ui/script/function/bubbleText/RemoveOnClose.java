package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import dIJ;
import dsg;
import org.keplerproject.luajava.LuaState;

final class RemoveOnClose extends dsg
{
  RemoveOnClose(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeOnClose";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", null, bxT.gja, false) };
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
    dIJ localdIJ = Kd.UN().fA(i);
    if (localdIJ != null)
    {
      int j = ("interactiveBubbleDialog" + i).hashCode();
      Kd.UN().fx(j);
    }
    else {
      Kd.UN().fy(i);
    }
  }
}