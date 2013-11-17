package com.ankamagames.wakfu.client.ui.script;

import CM;
import bU;
import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$WriteInChat extends dsg
{
  UIFunctionsLibrary$WriteInChat(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "writeLocalisedInChat";
  }

  public String getDescription() {
    return "Écrit dans le chat d'information de jeu le message lié à la clef de traduction spécifiée";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YR();
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    if (paramInt < 1) {
      UIFunctionsLibrary.K.warn("On utilise writeLocalisedInChat sans argument !");
      return;
    }
    String str1;
    if (paramInt == 1) {
      str1 = bU.fH().getString(Bv(0));
    } else {
      String[] arrayOfString = new String[paramInt - 1];
      for (int j = 1; j < paramInt; j++) {
        String str2 = Bx(j);
        arrayOfString[(j - 1)] = str2;
      }
      str1 = bU.fH().getString(Bv(0), arrayOfString);
    }
    int i = 4;
    CM.LV().f(str1, 4);
  }
}