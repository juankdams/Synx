package com.ankamagames.wakfu.client.ui.script;

import ask;
import bYE;
import cYq;
import dDE;
import dsg;
import dxL;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$StartCountdown extends dsg
{
  UIFunctionsLibrary$StartCountdown(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "startCountdown";
  }

  public String getDescription()
  {
    return "Affiche un compte à rebours générique";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XA();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    dxL localdxL = paramInt >= 2 ? cYq.jq(Bu(1)) : dDE.dft().VN();

    ask.aEE().e(i, localdxL);
  }
}