package com.ankamagames.wakfu.client.ui.script;

import CA;
import Su;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveMRU extends dsg
{
  UIFunctionsLibrary$RemoveMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeMRU";
  }

  public String getDescription() {
    return "Enlève un MRU d'action spécifiée au personnage spécifié";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XJ();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    int i = Br(1);
    Su localSu = CA.Lv().bj(l);
    if (localSu != null)
      localSu.gF(i);
  }
}