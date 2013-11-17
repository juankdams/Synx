package com.ankamagames.wakfu.client.core.script;

import bQK;
import bYE;
import cUo;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$CopyActorFrom extends dsg
{
  WakfuCharacterFunctionLibrary$CopyActorFrom(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "copyActorFrom";
  }

  public String getDescription()
  {
    return "Recopie un mobile dans un autre mobile";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.aUh();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);

    cUo localcUo1 = bQK.bXG().gY(l1);
    cUo localcUo2 = bQK.bXG().gY(l2);
    if (localcUo1 == null) {
      a(WakfuCharacterFunctionLibrary.aUi(), "le mobile " + l1 + " n'existe pas ");
      return;
    }
    if (localcUo2 == null) {
      a(WakfuCharacterFunctionLibrary.aUj(), "le mobile " + l2 + " n'existe pas ");
      return;
    }

    localcUo2.e(localcUo1);
  }
}