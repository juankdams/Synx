package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayDungeonLadderTimer extends dsg
{
  UIFunctionsLibrary$DisplayDungeonLadderTimer(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayDungeonLadderTimer";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Affiche et démarre le chrono du donjon";
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
    dJn.diF().diG();
  }
}