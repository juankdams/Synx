package com.ankamagames.wakfu.client.ui.script;

import bSH;
import bYE;
import cCZ;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveFromMiniMap extends dsg
{
  UIFunctionsLibrary$RemoveFromMiniMap(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getDescription() {
    return "Enlève le marqueur de boussole de la map et de la miniMap";
  }

  public final String getName()
  {
    return "removeMiniMapMarker";
  }

  public final bYE[] ce()
  {
    return UIFunctionsLibrary.YU();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    cCZ.cyZ().bLW();
    bSH.bZs().bLW();
  }
}