package com.ankamagames.wakfu.client.ui.script;

import aIH;
import bYE;
import bmz;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$IsBarLockedMode extends dsg
{
  UIFunctionsLibrary$IsBarLockedMode(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isBarLockedMode";
  }

  public String getDescription() {
    return "Indique si le controlCenter (barres, coeur,...) est verouillée ou non";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return UIFunctionsLibrary.Zb();
  }

  protected void S(int paramInt)
  {
    kl(WakfuClientInstance.awy().awB().a(bmz.fEG));
  }
}