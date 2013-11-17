package com.ankamagames.wakfu.client.ui.script;

import bYE;
import dJn;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayDungeonResultSplashText extends dsg
{
  UIFunctionsLibrary$DisplayDungeonResultSplashText(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayDungeonResultSplashText";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Affiche le résultat du donjon en fonction de la position sur le podium du groupe de joueur";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zh();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise addSpellSelectionListener sans argument !");
      return;
    }
    dJn.diF().eG((short)Br(0));
  }
}