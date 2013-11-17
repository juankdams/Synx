package com.ankamagames.wakfu.client.ui.script;

import CH;
import aNL;
import bXf;
import bYE;
import cBQ;
import cDA;
import cIM;
import cpa;
import doN;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveEventListener extends dsg
{
  UIFunctionsLibrary$RemoveEventListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeEventListener";
  }

  public String getDescription()
  {
    return "Permet de retirer une fonction sur un événement sur un widget.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XP();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
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
    boolean bool = "MOUSE_CLICKED_AND_DOUBLE_CLICKED".equals(str3);

    CH localCH = bool ? CH.bGw : CH.valueOf(str3);
    if (localCH == null) {
      a(UIFunctionsLibrary.K, "Type d'evnement inconnu " + str3 + " pour le dialog " + str1);
      return;
    }

    String str4 = Bv(3);
    bXf localbXf = cYS();

    doN localdoN = (doN)cIM.cDe().b(localbXf, str1, str2, str3, str4);
    if (localdoN == null) {
      a(UIFunctionsLibrary.K, "Le Listener a déjà été enlevé");
      return;
    }
    localaNL.b(localCH, localdoN, false);
    if (bool)
      localaNL.b(CH.bGx, localdoN, false);
  }
}