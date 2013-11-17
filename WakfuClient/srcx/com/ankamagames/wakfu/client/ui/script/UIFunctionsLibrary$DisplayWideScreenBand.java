package com.ankamagames.wakfu.client.ui.script;

import aTL;
import bYE;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayWideScreenBand extends dsg
{
  UIFunctionsLibrary$DisplayWideScreenBand(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayWideScreenBand";
  }

  public String getDescription()
  {
    return "Affiche/Masque les bandes noires pour faire un aspect cinéma";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yx();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();

    localaTL.eX(By(0));
    if (paramInt > 1) {
      localaTL.bp(Br(1));
      if (paramInt > 2)
        localaTL.br(1000.0F / Br(2));
    }
  }
}