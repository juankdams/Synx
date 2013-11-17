package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aNL;
import axU;
import bNa;
import bYE;
import cBQ;
import cDA;
import ccG;
import cpa;
import dOc;
import ddp;
import dsg;
import gm;
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddListColorTween extends dsg
{
  UIFunctionsLibrary$AddListColorTween(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addListColorTween";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Ym();
  }

  public String getDescription() {
    return "Ajoute un colorTween aux éléments d'une liste";
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

    ccG localccG = (ccG)localaNL;

    String str3 = Bv(2);
    int i = Br(3);
    int j = Br(4);

    bNa localbNa1 = new bNa();
    bNa localbNa2 = new bNa();

    if (paramInt == 13) {
      localbNa1.k((float)Bs(5), (float)Bs(6), (float)Bs(7), (float)Bs(8));
      localbNa2.k((float)Bs(9), (float)Bs(10), (float)Bs(11), (float)Bs(12));
    } else {
      localbNa1.set(bNa.gRx.get());
      localbNa2.set(bNa.gRG.get());
    }

    ArrayList localArrayList = localccG.getRenderables();
    int k = 0; for (int m = localArrayList.size(); k < m; k++) {
      axU localaxU = (axU)localArrayList.get(k);
      if (localaxU != null)
      {
        cpa localcpa2 = localaxU.getInnerElementMap();
        if (localcpa2 != null)
        {
          dOc localdOc = (dOc)localcpa2.fi(str3);
          if (localdOc != null)
          {
            Jg localJg = localdOc.getAppearance();
            localJg.a(new gm(localbNa1, localbNa2, localJg, 0, i, j, ddp.kWG));
          }
        }
      }
    }
  }
}