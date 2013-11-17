package com.ankamagames.wakfu.client.ui.script;

import Hv;
import bYE;
import byv;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayBackground extends dsg
{
  UIFunctionsLibrary$DisplayBackground(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayBackground";
  }

  public String getDescription() {
    return "Ouvre l'interface d'affichage background (Affiche, Stèle, Livre, etc..)";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zf();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    Hv localHv = Hv.QV();
    localHv.eR(Br(0));
    byv.bFN().a(localHv);
  }
}