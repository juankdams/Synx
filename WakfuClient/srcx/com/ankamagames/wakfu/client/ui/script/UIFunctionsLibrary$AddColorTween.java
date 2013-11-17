package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aNL;
import bNa;
import bYE;
import cBQ;
import cDA;
import cpa;
import dOc;
import ddp;
import dsg;
import gm;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddColorTween extends dsg
{
  UIFunctionsLibrary$AddColorTween(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addColorTween";
  }

  public String getDescription()
  {
    return "Ajoute un tween de changement de couleur de modulation sur le Widget passé en paramètre.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yo();
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

    int i = Br(2);
    int j = Br(3);

    bNa localbNa1 = new bNa();
    bNa localbNa2 = new bNa();

    if (paramInt == 12) {
      localbNa1.k((float)Bs(4), (float)Bs(5), (float)Bs(6), (float)Bs(7));
      localbNa2.k((float)Bs(8), (float)Bs(9), (float)Bs(10), (float)Bs(11));
    } else {
      localbNa1.set(bNa.gRx.get());
      localbNa2.set(bNa.gRG.get());
    }

    Jg localJg = ((dOc)localaNL).getAppearance();
    localJg.a(new gm(localbNa1, localbNa2, localJg, 0, i, j, ddp.kWG));
  }
}