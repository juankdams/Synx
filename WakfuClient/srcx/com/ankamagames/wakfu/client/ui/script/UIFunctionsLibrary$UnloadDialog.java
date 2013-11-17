package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cBQ;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$UnloadDialog extends dsg
{
  UIFunctionsLibrary$UnloadDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "unloadDialog";
  }

  public String getDescription()
  {
    return "Supprime un dialogue";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XY();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);
    cBQ.cxL().mW(str);
  }
}