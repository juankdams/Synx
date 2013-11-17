package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aNL;
import axU;
import bYE;
import cBQ;
import cDA;
import ccG;
import cpa;
import dOc;
import dsg;
import gm;
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveListColorTween extends dsg
{
  UIFunctionsLibrary$RemoveListColorTween(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeListColorTween";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yn();
  }

  public String getDescription() {
    return "Supprime un colorTween des éléments d'une liste";
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    cpa localcpa1 = cBQ.cxL().coO().nf(str1);
    if (localcpa1 == null) {
      a(UIFunctionsLibrary.K, "Dialogue inconnu " + str1);
      return;
    }

    String str2 = Bv(1);
    aNL localaNL = localcpa1.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "EventDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }

    if (!(localaNL instanceof ccG)) {
      a(UIFunctionsLibrary.K, "l'EventDispatcher n'est pas du type Widget");
      return;
    }
    String str3 = Bv(2);

    ccG localccG = (ccG)localaNL;
    ArrayList localArrayList = localccG.getRenderables();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      axU localaxU = (axU)localArrayList.get(i);
      if (localaxU != null)
      {
        cpa localcpa2 = localaxU.getInnerElementMap();
        if (localcpa2 != null)
        {
          dOc localdOc = (dOc)localcpa2.fi(str3);
          if (localdOc != null)
          {
            localdOc.getAppearance().J(gm.class);
          }
        }
      }
    }
  }
}