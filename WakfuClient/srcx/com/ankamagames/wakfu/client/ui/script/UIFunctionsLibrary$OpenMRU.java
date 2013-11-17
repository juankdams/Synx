package com.ankamagames.wakfu.client.ui.script;

import bVl;
import bYE;
import clD;
import cqu;
import dsg;
import ob;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenMRU extends dsg
{
  UIFunctionsLibrary$OpenMRU(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openMRU";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XF();
  }

  public String getDescription() {
    return "Ouvre un MRU non défini sur un élément interactif du jeu";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    clD localclD = new clD();
    long l = Bu(0);
    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      UIFunctionsLibrary.K.warn("impossible de trouver l'interactiveElement d'id " + l);
      return;
    }
    cqu.a(localclD, localob);
    if (localclD.isDisplayable())
      localclD.display();
  }
}