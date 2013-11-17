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

class WakfuCharacterFunctionLibrary$GetHandsOccupedByWeapon extends dsg
{
  WakfuCharacterFunctionLibrary$GetHandsOccupedByWeapon(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getHandsOccupedByWeapon";
  }

  public String getDescription()
  {
    return "Renvoie le nombre de mains utilisées par l'arme actuelle";
  }

  public bYE[] ce()
  {
    return WakfuCharacterFunctionLibrary.XR();
  }

  public bYE[] cf()
  {
    return WakfuCharacterFunctionLibrary.XS();
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    Su localSu = CA.Lv().bj(l);
    if (localSu == null) {
      a(WakfuCharacterFunctionLibrary.aUg(), "le characterInfo " + l + " n'existe pas ");
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

    Bz(localbBn.bKm() ? 2 : 1);
  }
}