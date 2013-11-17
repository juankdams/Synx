package com.ankamagames.wakfu.client.ui.script;

import KO;
import bYE;
import cMS;
import coS;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SystemMessage extends dsg
{
  UIFunctionsLibrary$SystemMessage(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "systemMessage";
  }

  public String getDescription() {
    return "Affiche un message admin NON LOCALISÉ sur l'écran";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XD();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str = Bv(0);
    int i = paramInt >= 2 ? Br(1) : 5000;
    KO.Vm().a(new coS(cMS.ksd, str, i));
  }
}