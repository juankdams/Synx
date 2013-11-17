package com.ankamagames.wakfu.client.ui.script;

import KP;
import bYE;
import byv;
import dsg;
import dzx;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$PushStaticProtector extends dsg
{
  UIFunctionsLibrary$PushStaticProtector(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "pushStaticProtector";
  }

  public String getDescription() {
    return "Initialise et affiche les interfaces de protecteur avec les informations d'un protecteur donné (static)";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YY();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise pushStaticProtector sans argument !");
      return;
    }
    int i = Br(0);
    dzx localdzx = dzx.dcY();
    if (KP.bXy.CB() != -1) {
      UIFunctionsLibrary.K.warn("Attention, on push un protecteur static au-dessus d'un autre protecteur !");
    }

    KP.bXy.aM(i);
    if (!byv.bFN().c(localdzx))
      byv.bFN().a(localdzx);
  }
}