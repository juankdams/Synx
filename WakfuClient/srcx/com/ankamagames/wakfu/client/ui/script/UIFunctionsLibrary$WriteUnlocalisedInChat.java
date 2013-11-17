package com.ankamagames.wakfu.client.ui.script;

import CM;
import aEe;
import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$WriteUnlocalisedInChat extends dsg
{
  UIFunctionsLibrary$WriteUnlocalisedInChat(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "writeUnlocalisedInChat";
  }

  public String getDescription() {
    return "[DEPRECATED] Écrit un message NON LOCALISÉ dans le chat, fait parler un personnage";
  }

  public final bYE[] ce()
  {
    return UIFunctionsLibrary.YW();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    if (paramInt < 2) {
      UIFunctionsLibrary.K.warn("On utilise writeEmoteChat sans argument !");
      return;
    }
    String str1 = Bv(0);
    int i = Br(1);
    String str2;
    if (paramInt == 2) {
      str2 = str1;
    } else {
      localObject = new Object[paramInt - 1];
      for (int j = 1; j < paramInt; j++) {
        String str3 = Bv(j);
        localObject[(j - 1)] = str3;
      }
      str2 = String.format(str1, (Object[])localObject);
    }
    Object localObject = new aEe(i, str2);
    ((aEe)localObject).mm(1);
    CM.LV().a((aEe)localObject);
  }
}