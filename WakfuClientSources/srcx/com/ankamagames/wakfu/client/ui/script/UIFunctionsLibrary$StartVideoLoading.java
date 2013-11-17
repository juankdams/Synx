package com.ankamagames.wakfu.client.ui.script;

import aNP;
import ay;
import bYE;
import bdh;
import byv;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$StartVideoLoading extends dsg
{
  UIFunctionsLibrary$StartVideoLoading(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "startVideoLoading";
  }

  public String getDescription()
  {
    return "[WIP] Charge une vidéo donnée et affiche une interface de chargement";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zp();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str1 = Bv(0);
    try {
      String str2 = ay.bd().getString("videosPath");
      str2 = String.format(str2, new Object[] { str1 });
      aNP.beQ().setVideoPath(str2);
      byv.bFN().a(aNP.beQ());
    } catch (bdh localbdh) {
      UIFunctionsLibrary.K.error("Impossible de récupérer le chemin vers les videos");
    }
  }
}