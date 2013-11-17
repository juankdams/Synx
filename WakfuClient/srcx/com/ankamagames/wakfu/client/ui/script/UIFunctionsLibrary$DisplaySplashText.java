package com.ankamagames.wakfu.client.ui.script;

import bU;
import bYE;
import dJn;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplaySplashText extends dsg
{
  UIFunctionsLibrary$DisplaySplashText(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displaySplashText";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Affiche un message splash (trace de pneu + particule..)";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zg();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    String str2;
    if (paramInt == 1) {
      str2 = bU.fH().getString(str1);
    } else {
      Object[] arrayOfObject = new Object[paramInt - 1];
      for (int i = 1; i < paramInt; i++) {
        String str3 = Bv(i);
        arrayOfObject[(i - 1)] = str3;
      }
      str2 = bU.fH().getString(str1, arrayOfObject);
    }
    dJn.diF().iR(str2);
  }
}