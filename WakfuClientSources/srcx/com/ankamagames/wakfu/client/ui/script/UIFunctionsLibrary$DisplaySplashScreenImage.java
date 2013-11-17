package com.ankamagames.wakfu.client.ui.script;

import VV;
import bYE;
import cBQ;
import dLE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplaySplashScreenImage extends dsg
{
  UIFunctionsLibrary$DisplaySplashScreenImage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displaySplashScreenImage";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Za();
  }

  public String getDescription() {
    return "Affiche une image au centre de l'écran (non modale)";
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    try {
      if (paramInt < 1) {
        UIFunctionsLibrary.K.warn("On utilise displaySplashScreenImage sans argument !");
        return;
      }
      cBQ.cxL().a("splashScreenDialog", VV.dJ("splashScreenDialog"), 1L, (short)15000);

      dLE.doY().t("splashScreenIconUrl", Bv(0));
    } catch (Exception localException) {
      UIFunctionsLibrary.K.error("Exception levée lors det l'ajout d'un message de personnage spécial", localException);
    }
  }
}