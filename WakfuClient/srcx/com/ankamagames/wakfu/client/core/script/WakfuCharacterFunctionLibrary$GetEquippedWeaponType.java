package com.ankamagames.wakfu.client.core.script;

import CA;
import Hh;
import PX;
import Su;
import azO;
import bBn;
import bYE;
import ccj;
import dsg;
import org.keplerproject.luajava.LuaState;

class WakfuCharacterFunctionLibrary$GetEquippedWeaponType extends dsg
{
  WakfuCharacterFunctionLibrary$GetEquippedWeaponType(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getEquippedWeaponType";
  }

  public String getDescription()
  {
    return "Renvoie le type de l'arme equippée";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XO();
  }

  public bYE[] cf()
  {
    return WakfuCharacterFunctionLibrary.XP();
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(WakfuCharacterFunctionLibrary.aUf(), "le characterInfo " + l + " n'existe pas ");
      Bz(0);
      return;
    }
    PX localPX = localSu.aeu();
    if (localPX == null) {
      Bz(0);
      return;
    }

    int i = localPX.ap(azO.dRM.hV);
    bBn localbBn = Hh.QM().dh(i);
    int j = ccj.k(localbBn.bKn());
    if (j == 237) {
      Bz(0);
      return;
    }
    Bz(j);
  }
}