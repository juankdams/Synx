package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dGx;
import dsg;
import duv;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$ChangeCursor extends dsg
{
  UIFunctionsLibrary$ChangeCursor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "changeCursor";
  }

  public String getDescription()
  {
    return "Change le curseur de la souris.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yv();
  }

  public bYE[] cf()
  {
    return UIFunctionsLibrary.Yw();
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);

    duv localduv = duv.valueOf(str1);
    if (localduv == null) {
      if ("SPELL".equals(str1))
        localduv = duv.lyv;
      else {
        a(UIFunctionsLibrary.K, "Type de curseur inconnu " + str1);
      }
    }
    dGx.dhr().unlock();
    dGx.dhr().a(localduv, true);

    String str2 = "DEFAULT";
    pP("DEFAULT");
  }
}