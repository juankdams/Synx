package com.ankamagames.wakfu.client.ui.script;

import NN;
import bU;
import bYE;
import cWG;
import cjO;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$LoadTutorialMessageDialog extends dsg
{
  UIFunctionsLibrary$LoadTutorialMessageDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "loadTutorialDialog";
  }

  public String getDescription() {
    return "Ouvre l'interface de tutorial";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zt();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    if (paramInt < 3) {
      UIFunctionsLibrary.K.warn("On utilise LoadTutorialDialog avec trop peu d'arguments !");
      return;
    }
    int i = 0;

    String str1 = Bv(i++);
    String str2 = bU.fH().getString(Bv(i++));
    String str3 = Bv(i++);
    int j;
    if (paramInt == i)
      j = 0;
    else {
      try {
        j = Br(i);
        i++;
      } catch (LuaException localLuaException) {
        j = 0;
      }
    }

    String str4 = null;
    if (paramInt - i == 0) {
      str4 = bU.fH().getString(str3);
    } else {
      localObject = new String[paramInt - i];
      for (int k = i; k < paramInt; k++) {
        String str5 = Bx(k);
        localObject[(k - i)] = str5;
      }
      str4 = bU.fH().getString(str4, (Object[])localObject);
    }

    Object localObject = new NN(str2, str4, str1, j);
    cjO.clE().j((cWG)localObject);
  }
}