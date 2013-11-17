package com.ankamagames.wakfu.client.ui.script;

import ask;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$StopScenarioCountdown extends dsg
{
  UIFunctionsLibrary$StopScenarioCountdown(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "stopCountdown";
  }

  public String getDescription()
  {
    return "Arrête et efface le compte à rebours générique";
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
    ask.aEE().stop();
  }
}