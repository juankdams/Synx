package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cSR;
import cag;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$RemoveParticle extends dsg
{
  UIFunctionsLibrary$RemoveParticle(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeParticle";
  }

  public String getDescription()
  {
    return "Enlève un système de particule sur un élément d'interface";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yt();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    cag localcag = (cag)UIFunctionsLibrary.Xv().ccR.remove(i);
    if (localcag != null)
      try {
        localcag.setTimeToLive(paramInt == 2 ? Br(1) : 100);
      } catch (Exception localException) {
        UIFunctionsLibrary.K.error("Exception levée dans le removeParticle(" + i + ")", localException);
      }
    else
      UIFunctionsLibrary.K.warn("Impossible de trouver la particle " + i + " pour la supprimer");
  }
}