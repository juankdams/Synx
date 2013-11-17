package com.ankamagames.wakfu.client.ui.script;

import KO;
import bU;
import bYE;
import bxT;
import cMS;
import coS;
import dsg;
import org.keplerproject.luajava.LuaState;

class SystemMessageFunctionsLibrary$AddSystemMessage extends dsg
{
  private SystemMessageFunctionsLibrary$AddSystemMessage(SystemMessageFunctionsLibrary paramSystemMessageFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addMessage";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("message", null, bxT.giZ, false), new bYE("params", null, bxT.gje, true) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
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

    int i = 1000 + 50 * str1.length();
    KO.Vm().a(new coS(cMS.ksf, str1, i));
  }
}