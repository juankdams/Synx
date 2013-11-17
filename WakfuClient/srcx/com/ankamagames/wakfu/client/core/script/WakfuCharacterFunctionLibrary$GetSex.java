package com.ankamagames.wakfu.client.core.script;

import CA;
import Su;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$GetSex extends dsg
{
  WakfuCharacterFunctionLibrary$GetSex(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getSex";
  }

  public String getDescription()
  {
    return "Renvoi le genre d'un personnage";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XE();
  }

  public bYE[] cf()
  {
    return WakfuCharacterFunctionLibrary.XF();
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(WakfuCharacterFunctionLibrary.asz(), "Mobile introuvable " + l);
      cYR();
      return;
    }
    Bz(localSu.xK());
  }
}