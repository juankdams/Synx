package com.ankamagames.wakfu.client.ui.script;

import CM;
import bU;
import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$WriteInEmoteChat extends dsg
{
  UIFunctionsLibrary$WriteInEmoteChat(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "writeEmoteChat";
  }

  public String getDescription() {
    return "[DEPRECATED] Affiche un message chat localisé dans le chat d'emote";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YS();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise writeEmoteChat sans argument !");
      return;
    }
    String str1 = Bv(0);
    String str2;
    if (paramInt == 1) {
      str2 = bU.fH().getString(str1);
    } else {
      Object[] arrayOfObject = new Object[paramInt - 1];
      for (int j = 1; j < paramInt; j++) {
        String str3 = Bv(j);
        arrayOfObject[(j - 1)] = str3;
      }
      str2 = bU.fH().getString(str1, arrayOfObject);
    }
    int i = 1;
    CM.LV().f(str2, 1);
  }
}