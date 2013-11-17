package com.ankamagames.wakfu.client.core.script;

import CA;
import Su;
import bYE;
import cew;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$ChangeActorDefaultDeltaZ extends dsg
{
  WakfuCharacterFunctionLibrary$ChangeActorDefaultDeltaZ(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "changeActorDefaultDeltaZ";
  }

  public String getDescription()
  {
    return "Place le mobile sur un autre plan. Le plan par défaut est le 7.";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XB();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);
    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(WakfuCharacterFunctionLibrary.asw(), "Mobile introuvable " + l);
      return;
    }
    localSu.aeL().id(i);
  }
}