package com.ankamagames.wakfu.client.core.script;

import CA;
import Su;
import bYE;
import cew;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$StopMovingActor extends dsg
{
  WakfuCharacterFunctionLibrary$StopMovingActor(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "stopMovingActor";
  }

  public String getDescription()
  {
    return "Arrête un personnage";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XC();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);

    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(WakfuCharacterFunctionLibrary.asx(), "Mobile introuvable " + l);
      return;
    }
    localSu.aeL().bIS();
  }
}