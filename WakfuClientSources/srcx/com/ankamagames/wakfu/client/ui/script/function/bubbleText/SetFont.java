package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import dIJ;
import dsg;
import org.keplerproject.luajava.LuaState;

final class SetFont extends dsg
{
  SetFont(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setFont";
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
    dIJ localdIJ = Kd.UN().fA(Br(0));
    if (localdIJ != null) {
      localdIJ.setBubbleFontName(Bv(1));
      localdIJ.setBubbleFontSize(Br(2));
      localdIJ.setBubbleFontStyle(Br(3));
    }
  }
}