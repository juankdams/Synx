package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dGW;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenAllBags extends dsg
{
  UIFunctionsLibrary$OpenAllBags(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openAllBags";
  }

  public String getDescription() {
    return "Ouvre la fenêtre d'inventaires";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dGW.dhM().dhN();
  }
}