package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bcm;
import dLE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveProperty extends dsg
{
  UIFunctionsLibrary$RemoveProperty(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeProperty";
  }

  public String getDescription()
  {
    return "Supprime une propriété Xulor";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Ye();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str = Bv(0);
    UIFunctionsLibrary.Yc().remove(str);
    dLE.doY().removeProperty(str);
  }
}