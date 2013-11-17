package com.ankamagames.wakfu.client.core.script;

import bQK;
import bYE;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$ApplyColorFrom extends dsg
{
  WakfuCharacterFunctionLibrary$ApplyColorFrom(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "applyColorFrom";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.Ep();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);

    cUo localcUo1 = bQK.bXG().gY(l1);
    cUo localcUo2 = bQK.bXG().gY(l2);
    if (localcUo1 == null) {
      WakfuCharacterFunctionLibrary.i().error("impossible de trouver le mobile " + l1);
      return;
    }
    if (localcUo2 == null) {
      WakfuCharacterFunctionLibrary.an().error("impossible de trouver le mobile " + l2);
      return;
    }
    localcUo1.p(localcUo2);
  }
}