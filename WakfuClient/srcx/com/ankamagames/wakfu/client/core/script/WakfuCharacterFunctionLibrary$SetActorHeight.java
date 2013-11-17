package com.ankamagames.wakfu.client.core.script;

import bQK;
import bYE;
import cUo;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$SetActorHeight extends dsg
{
  WakfuCharacterFunctionLibrary$SetActorHeight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setActorHeight";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.Xy();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    short s = (short)Br(1);

    cUo localcUo = bQK.bXG().gY(l);
    if (localcUo == null)
      WakfuCharacterFunctionLibrary.asu().warn("impossible de trouver le mobile " + l);
    else
      localcUo.ax(s);
  }
}