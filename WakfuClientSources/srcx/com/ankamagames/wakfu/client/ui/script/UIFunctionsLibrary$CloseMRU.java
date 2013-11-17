package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cqu;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CloseMRU extends dsg
{
  UIFunctionsLibrary$CloseMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "closeMRU";
  }

  public String getDescription() {
    return "Ferme le MRU courant s'il est affiché";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    UIFunctionsLibrary.K.info("Fermeture de tous les MRU");
    cqu.cpE().alK();
  }
}