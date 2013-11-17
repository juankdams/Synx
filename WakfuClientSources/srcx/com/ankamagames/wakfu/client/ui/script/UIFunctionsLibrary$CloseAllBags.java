package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dGW;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CloseAllBags extends dsg
{
  UIFunctionsLibrary$CloseAllBags(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "closeAllBags";
  }

  public String getDescription() {
    return "Ferme la fenêtre des inventaires";
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
    dGW.dhM().dhP();
  }
}