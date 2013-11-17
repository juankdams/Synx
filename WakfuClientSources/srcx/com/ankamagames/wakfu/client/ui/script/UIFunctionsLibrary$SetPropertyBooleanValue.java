package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bcm;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetPropertyBooleanValue extends dsg
{
  UIFunctionsLibrary$SetPropertyBooleanValue(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setPropertyBooleanValue";
  }

  public String getDescription()
  {
    return "Applique une valeure booléenne à une propriété xulor";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yb();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str = Bv(0);
    boolean bool = By(1);

    UIFunctionsLibrary.Yc().add(str);
    dLE.doY().t(str, Boolean.valueOf(bool));
  }
}