package com.ankamagames.wakfu.client.ui.script;

import CM;
import bYE;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$WriteBloopsInChat extends dsg
{
  UIFunctionsLibrary$WriteBloopsInChat(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "writeInChat";
  }

  public String getDescription() {
    return "[DEPRECATED] Écrit des informations NON LOCALISÉES dans le chat d'information de jeu";
  }

  public final bYE[] ce()
  {
    return UIFunctionsLibrary.YV();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramInt; i++) {
      String str = Bx(i);
      localStringBuilder.append(" ").append(str != null ? str : null);
    }
    i = 4;
    CM.LV().f(localStringBuilder.toString(), 4);
    UIFunctionsLibrary.K.warn("On utilise writeInChat pour : " + localStringBuilder.toString() + ", préférer writeLocalisedInChat");
  }
}