package com.ankamagames.wakfu.client.ui.script;

import bSH;
import bYE;
import cCZ;
import clP;
import dSP;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$FollowOnMiniMap extends dsg
{
  UIFunctionsLibrary$FollowOnMiniMap(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "miniMapMarker";
  }

  public String getDescription() {
    return "Applique le marqueur de boussole sur la map et la minimap à une position spécifiée";
  }

  public final bYE[] ce()
  {
    return UIFunctionsLibrary.YT();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);
    cCZ.cyZ().a(i, j, k, "", this, dSP.mpb, clP.hOS);

    bSH.bZs().a(i, j, k, "", this, dSP.mpb, clP.hOS);
  }
}