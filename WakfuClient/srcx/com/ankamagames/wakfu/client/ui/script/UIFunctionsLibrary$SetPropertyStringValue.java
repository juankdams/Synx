package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bcm;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetPropertyStringValue extends dsg
{
  UIFunctionsLibrary$SetPropertyStringValue(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPropertyStringValue";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yd();
  }

  public String getDescription()
  {
    return "Applique une valeure String à une propriété xulor";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2 = Bv(1);

    UIFunctionsLibrary.Yc().add(str1);

    dLE.doY().t(str1, str2);
  }
}