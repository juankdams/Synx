package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$StopDungeonLadderTimer extends dsg
{
  UIFunctionsLibrary$StopDungeonLadderTimer(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "stopDungeonLadderTimer";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Arrête le chrono du donjon";
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
    dJn.diF().diI();
  }
}