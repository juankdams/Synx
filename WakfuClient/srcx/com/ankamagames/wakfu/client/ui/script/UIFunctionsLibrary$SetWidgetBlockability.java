package com.ankamagames.wakfu.client.ui.script;

import aNL;
import bYE;
import cBQ;
import cDA;
import cpa;
import dOc;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetWidgetBlockability extends dsg
{
  UIFunctionsLibrary$SetWidgetBlockability(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setWidgetBlockability";
  }

  public String getDescription() {
    return "Spécifie si un widget spécifié bloque ou non les interactions de clic de souris";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yi();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);
    boolean bool = By(2);

    cpa localcpa = cBQ.cxL().coO().nf(str1);
    if (localcpa == null) {
      a(UIFunctionsLibrary.K, "Dialogue inconnu " + str1);
      return;
    }

    aNL localaNL = localcpa.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "ElementDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }
    if (!(localaNL instanceof dOc)) {
      a(UIFunctionsLibrary.K, "le widget n'est pas du type Widget");
      return;
    }

    dOc localdOc = (dOc)localaNL;
    localdOc.setNonBlocking(!bool);
  }
}