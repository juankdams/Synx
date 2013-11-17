package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aNL;
import bYE;
import cBQ;
import cDA;
import cpa;
import dOc;
import dsg;
import gm;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveColorTween extends dsg
{
  UIFunctionsLibrary$RemoveColorTween(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeColorTween";
  }

  public String getDescription()
  {
    return "Retire les ColorTween sur le widget passé en paramètre";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yp();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    cpa localcpa = cBQ.cxL().coO().nf(str1);
    if (localcpa == null) {
      a(UIFunctionsLibrary.K, "Dialogue inconnu " + str1);
      return;
    }

    String str2 = Bv(1);
    aNL localaNL = localcpa.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "EventDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }

    if (!(localaNL instanceof dOc)) {
      a(UIFunctionsLibrary.K, "l'EventDispatcher n'est pas du type Widget");
      return;
    }

    ((dOc)localaNL).getAppearance().J(gm.class);
  }
}