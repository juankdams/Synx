package com.ankamagames.wakfu.client.ui.script;

import bUH;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayChallengeVarUpdateFlyingImage extends dsg
{
  UIFunctionsLibrary$DisplayChallengeVarUpdateFlyingImage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayChallengeVarUpdateFlyingImage";
  }

  public String getDescription()
  {
    return "Affiche l'image volante d'update de variable de challenge";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Xy();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    boolean bool = true;
    if (paramInt >= 1) {
      bool = By(0);
    }
    bUH.caG().gH(bool);
  }
}