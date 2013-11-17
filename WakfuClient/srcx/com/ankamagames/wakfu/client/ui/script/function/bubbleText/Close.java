package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import cBQ;
import dbI;
import dsg;
import org.keplerproject.luajava.LuaState;

final class Close extends dsg
{
  private static final bYE[] Rf = { new bYE("bubbleId", "Id de la bulle à fermer", bxT.gja, false) };

  Close(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "close";
  }

  public String getDescription()
  {
    return "Ferme une bulle de dialogue";
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
    int i = Br(0);
    if (i < 0) {
      return;
    }
    qt(i);
  }

  static void qt(int paramInt) {
    if (Kd.UN().fB(paramInt) != null) {
      cBQ.cxL().mW("interactiveBubbleDialog" + paramInt);
    }
    else {
      dbI.cNt().zE(paramInt);
      Kd.UN().fD(paramInt);
    }
  }
}