package com.ankamagames.wakfu.client.ui.script;

import bU;
import bYE;
import bzb;
import dsg;
import dyQ;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenInfoDialog extends dsg
{
  UIFunctionsLibrary$OpenInfoDialog(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openInfoDialog";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zr();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public String getDescription() {
    return "Ouvre un popup semblable à celui des donjons shukrutes, mais sans icône challenge et avec un titre paramétré";
  }

  public void S(int paramInt)
  {
    String str1 = null;
    String str2 = bU.fH().getString(Bv(0));
    if (paramInt >= 1) {
      localObject = Bv(1);
      if (paramInt == 1) {
        str1 = bU.fH().getString((String)localObject);
      } else {
        String[] arrayOfString = new String[paramInt - 1];
        for (int i = 1; i < paramInt; i++) {
          String str3 = Bx(i);
          arrayOfString[(i - 1)] = str3;
        }
        str1 = bU.fH().getString((String)localObject, arrayOfString);
      }
    }

    Object localObject = new bzb(str2, str1);
    dyQ.dcP().a((bzb)localObject);
  }
}