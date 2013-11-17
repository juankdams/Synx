package com.ankamagames.wakfu.client.ui.script;

import aNL;
import bYE;
import bbo;
import cBQ;
import cDA;
import cpa;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemovePropertyClient extends dsg
{
  UIFunctionsLibrary$RemovePropertyClient(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removePropertyClient";
  }

  public String getDescription() {
    return "Supprime un élément d'interface spécifié de la liste des clients d'une propriété";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yf();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);
    String str3 = Bv(2);
    boolean bool = false;
    if (paramInt > 3) {
      bool = By(3);
    }

    cpa localcpa = cBQ.cxL().coO().nf(str1);

    if (localcpa == null) {
      a(UIFunctionsLibrary.K, "ElementMap inconnue " + str1);
      return;
    }

    bbo localbbo = bool ? dLE.doY().bs(str3, str1) : dLE.doY().getProperty(str3);

    if (localbbo == null) {
      a(UIFunctionsLibrary.K, "Propriétée inconnue " + str3);
      return;
    }

    aNL localaNL = localcpa.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "ElementDispatcher inconnu " + str2 + " dans le dialog " + str1);
      return;
    }

    localbbo.ba(localaNL);
  }
}