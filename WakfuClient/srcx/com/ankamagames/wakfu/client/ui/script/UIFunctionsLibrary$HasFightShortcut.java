package com.ankamagames.wakfu.client.ui.script;

import bJz;
import bKq;
import bYE;
import byv;
import byz;
import dKD;
import dpr;
import dsg;
import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$HasFightShortcut extends dsg
{
  UIFunctionsLibrary$HasFightShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "hasFightShortcut";
  }

  public String getDescription() {
    return "Indique si le joueur a au moins un raccourci de combat";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YD();
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.YE();
  }

  protected void S(int paramInt)
  {
    int i = -1;
    bKq localbKq = null;
    if (paramInt == 2) {
      i = Br(0);
      localbKq = bKq.ds((byte)Br(1));
    }

    byz localbyz = byv.bFN().bFO();
    dpr localdpr = localbyz.bGD();

    ArrayList localArrayList = localdpr.ka(false);
    for (int j = localArrayList.size() - 1; j >= 0; j--) {
      bJz localbJz = (bJz)localArrayList.get(j);
      if (i != -1) {
        for (dKD localdKD : localbJz.hi(i)) {
          if (localdKD.asL() == localbKq) {
            kl(true);
            return;
          }
        }
      }
      else if (!localbJz.isEmpty()) {
        kl(true);
        return;
      }

    }

    kl(false);
  }
}