package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bbo;
import bxT;
import cBQ;
import cDA;
import cpa;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$GetPropertyValueInt extends dsg
{
  UIFunctionsLibrary$GetPropertyValueInt(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getPropertyValueInt";
  }

  public String getDescription() {
    return "Fourni la valeur entière d'une propriété spécifiée";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yg();
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("propertyValue", null, bxT.gja, false) };
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

    bbo localbbo = bool ? dLE.doY().bs(str2, str1) : dLE.doY().getProperty(str2);

    if (localbbo == null) {
      a(UIFunctionsLibrary.K, "Propriétée inconnue " + str2);
      return;
    }

    int i = localbbo.hK(str3) == null ? localbbo.getInt() : localbbo.hN(str3);

    Bz(i);
  }
}