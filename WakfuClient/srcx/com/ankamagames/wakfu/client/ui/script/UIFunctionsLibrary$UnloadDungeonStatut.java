package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$UnloadDungeonStatut extends dsg
{
  UIFunctionsLibrary$UnloadDungeonStatut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "unloadDungeonStatut";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Fais disparaître les affichages du donjon";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    dJn.diF().diH();
  }
}