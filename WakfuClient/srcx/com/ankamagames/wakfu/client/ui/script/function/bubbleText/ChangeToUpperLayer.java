package com.ankamagames.wakfu.client.ui.script.function.bubbleText;

import Kd;
import bYE;
import bsP;
import bxT;
import cOP;
import dIJ;
import dsg;
import org.keplerproject.luajava.LuaState;

final class ChangeToUpperLayer extends dsg
{
  ChangeToUpperLayer(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "changeToUpperLayer";
  }

  public String getDescription()
  {
    return "Ajoute la bulle à la couche supérieure d'affichage";
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
      bsP.getInstance().getLayeredContainer().j(localdIJ);
      localdIJ.setModalLevel((short)32767);
      bsP.getInstance().getLayeredContainer().b(localdIJ, 26000);
    }
  }
}