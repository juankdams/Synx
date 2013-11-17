package com.ankamagames.wakfu.client.ui.script;

import Ex;
import aKo;
import bU;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddReward extends dsg
{
  UIFunctionsLibrary$AddReward(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addReward";
  }

  public String getDescription() {
    return "[DONJON SHUKRUTE] Ajoute une récompense à l'interface de récompenses du donjon";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zs();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str1 = null;
    if (paramInt >= 2) {
      localObject = Bv(1);
      if (paramInt == 2) {
        str1 = bU.fH().getString((String)localObject);
      } else {
        String[] arrayOfString = new String[paramInt - 2];
        for (int i = 2; i < paramInt; i++) {
          String str2 = Bx(i);
          arrayOfString[(i - 2)] = str2;
        }
        str1 = bU.fH().getString(str1, arrayOfString);
      }
    }

    Object localObject = new aKo(Br(0), str1);
    Ex.Nw().a((aKo)localObject);
  }
}