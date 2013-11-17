package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dlw;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveLandMarkNote extends dsg
{
  UIFunctionsLibrary$RemoveLandMarkNote(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeLandMarkNote";
  }

  public String getDescription()
  {
    return "Retire une note personnelle";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Xx();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    if (!dlw.cTl().AC(i))
      UIFunctionsLibrary.K.warn("Tentative de suppression d'un landmark d'id " + i + " non trouvé.");
  }
}