package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cCZ;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveCompass extends dsg
{
  UIFunctionsLibrary$RemoveCompass(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeCompass";
  }

  public String getDescription()
  {
    return "Retire la boussole";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zo();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    cCZ.cyZ().czb();
  }
}