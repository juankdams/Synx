package com.ankamagames.wakfu.client.ui.script;

import bYE;
import ceb;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplaySmiley extends dsg
{
  UIFunctionsLibrary$DisplaySmiley(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "displaySmiley";
  }

  public String getDescription() {
    return "Affiche le smiley spécifié au-dessus d'un mobile";
  }

  public final bYE[] ce()
  {
    return UIFunctionsLibrary.YX();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    if (paramInt < 2) {
      UIFunctionsLibrary.K.warn("On utilise displaySmiley sans argument !");
      return;
    }
    int i = paramInt > 2 ? Br(2) : -1;
    ceb.cgG().b(Br(0), Bu(1), i);
  }
}