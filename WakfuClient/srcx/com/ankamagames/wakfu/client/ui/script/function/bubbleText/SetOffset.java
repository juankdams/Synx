package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bxT;
import dIJ;
import dsg;
import org.keplerproject.luajava.LuaState;

final class SetOffset extends dsg
{
  SetOffset(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setOffset";
  }

  public String getDescription()
  {
    return "Décale une bulle de dialogue";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("bubbleId", "Id de la bulle", bxT.gja, false), new bYE("x", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("y", "Décalage en pixel vers le haut", bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dIJ localdIJ = Kd.UN().fA(Br(0));
    if (localdIJ != null)
      localdIJ.setOffset(Br(1), Br(2));
  }
}