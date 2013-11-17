package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cIM;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveDialogLoadedListener extends dsg
{
  UIFunctionsLibrary$RemoveDialogLoadedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeDialogLoadedListener";
  }

  public String getDescription()
  {
    return "Annule l'effet d'un UI.addDialogLoadedListener";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YN();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);

    cIM.cDe().nu(str);
  }
}