package com.ankamagames.wakfu.client.ui.script;

import bKq;
import bYE;
import byv;
import byz;
import dpr;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveShortCutWithId extends dsg
{
  public String getName()
  {
    return "removeShortcut";
  }

  UIFunctionsLibrary$RemoveShortCutWithId(LuaState paramLuaState) {
    super(paramLuaState);
  }

  public String getDescription() {
    return "Enlève le raccourci spécifié des barres de raccourcis";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YA();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    int i = Br(0);
    bKq localbKq = bKq.ds((byte)Br(1));
    localbyz.bGD().a(i, localbKq, true);
  }
}