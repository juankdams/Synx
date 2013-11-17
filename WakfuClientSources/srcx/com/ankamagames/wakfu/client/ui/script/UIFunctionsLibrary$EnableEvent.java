package com.ankamagames.wakfu.client.ui.script;

import CH;
import aNL;
import bYE;
import cBQ;
import cDA;
import cpa;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$EnableEvent extends dsg
{
  UIFunctionsLibrary$EnableEvent(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "enableEvent";
  }

  public String getDescription()
  {
    return "Permet de désactiver/réactiver des événements sur un widget.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XS();
  }

  public bYE[] cf()
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
      a(UIFunctionsLibrary.K, "ElementDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }

    String str3 = Bv(2);
    CH localCH = CH.valueOf(str3);
    if (localCH == null) {
      a(UIFunctionsLibrary.K, "Type d'evenement inconnu " + str3 + " pour le dialog " + str1);
      return;
    }

    localaNL.a(localCH, By(3));
  }
}