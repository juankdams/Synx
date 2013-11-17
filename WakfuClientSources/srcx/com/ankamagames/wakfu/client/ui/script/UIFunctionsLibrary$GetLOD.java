package com.ankamagames.wakfu.client.ui.script;

import bYE;
import btb;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$GetLOD extends dsg
{
  UIFunctionsLibrary$GetLOD(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getLOD";
  }

  public String getDescription()
  {
    return "Fourni le niveau de détails actuel du jeu";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.Zl();
  }

  protected void S(int paramInt)
  {
    Bz(btb.bBd().bBl());
  }
}