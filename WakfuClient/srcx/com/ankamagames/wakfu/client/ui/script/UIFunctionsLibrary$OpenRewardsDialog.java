package com.ankamagames.wakfu.client.ui.script;

import Ex;
import bU;
import bYE;
import dsg;
import jt;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenRewardsDialog extends dsg
{
  UIFunctionsLibrary$OpenRewardsDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openRewardsDialog";
  }

  public String getDescription()
  {
    return "[DONJON SHUKRUTE] Affiche l'interface de récompenses avec un texte donné";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zq();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    String str1 = null;
    String str2 = Bv(0);
    if (paramInt >= 1) {
      if (paramInt == 1) {
        str1 = bU.fH().getString(str2);
      } else {
        localObject = new String[paramInt - 1];
        for (int i = 1; i < paramInt; i++) {
          String str3 = Bx(i);
          localObject[(i - 1)] = str3;
        }
        str1 = bU.fH().getString(str1, (Object[])localObject);
      }
    }

    Object localObject = new jt(str1);
    Ex.Nw().a((jt)localObject);
  }
}