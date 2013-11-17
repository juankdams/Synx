package com.ankamagames.wakfu.client.ui.script;

import aNL;
import axU;
import bYE;
import cBQ;
import cDA;
import ccG;
import cpa;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$EnableDragNDrop extends dsg
{
  UIFunctionsLibrary$EnableDragNDrop(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "enableDragNDrop";
  }

  public String getDescription()
  {
    return "Permet de désactiver/réactiver le dragNDrop sur une List ou un RenderableContainer";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XR();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    cpa localcpa = cBQ.cxL().coO().nf(Bv(0));
    if (localcpa == null) {
      return;
    }

    aNL localaNL = localcpa.fi(Bv(1));
    if (localaNL != null) {
      if ((localaNL instanceof ccG))
        ((ccG)localaNL).setEnableDND(By(2));
      else if ((localaNL instanceof axU))
        ((axU)localaNL).setEnableDND(By(2));
      else
        a(UIFunctionsLibrary.K, Bv(0) + '.' + Bv(1) + " n'est pas du bon type !");
    }
    else
      a(UIFunctionsLibrary.K, Bv(0) + '.' + Bv(1) + " est introuvable !");
  }
}