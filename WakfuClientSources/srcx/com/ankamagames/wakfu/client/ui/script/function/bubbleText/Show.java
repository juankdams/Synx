package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import dIJ;
import dcY;
import dsg;
import org.keplerproject.luajava.LuaState;

final class Show extends dsg
{
  Show(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "show";
  }

  public String getDescription()
  {
    return "Affiche une bulle de dialogue";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dIJ localdIJ = Kd.UN().fA(Br(0));
    if (localdIJ != null) {
      localdIJ.show();
      return;
    }
    dcY localdcY = Kd.UN().fC(Br(0));
    localdcY.setBubbleIsVisible(true);
  }
}