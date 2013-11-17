package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cIM;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveDialogUnloadedListener extends dsg
{
  UIFunctionsLibrary$RemoveDialogUnloadedListener(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeDialogUnloadedListener";
  }

  public String getDescription()
  {
    return "Annule l'effet d'un UI.addDialogUnloadedListener";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YL();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);

    cIM.cDe().nt(str);
  }
}