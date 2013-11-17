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

class UIFunctionsLibrary$HasShortcut extends dsg
{
  UIFunctionsLibrary$HasShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "hasShortcut";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YH();
  }

  public String getDescription() {
    return "Indique si le joueur a au moins un raccourci";
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.YI();
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

    ArrayList localArrayList1 = localdpr.kb(false);
    if (a(i, localbKq, localArrayList1)) {
      return;
    }

    ArrayList localArrayList2 = localdpr.ka(false);
    if (a(i, localbKq, localArrayList2)) {
      return;
    }

    kl(false);
  }

  private boolean a(int paramInt, bKq parambKq, ArrayList paramArrayList) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      bJz localbJz = (bJz)paramArrayList.get(i);
      if (paramInt != -1) {
        for (dKD localdKD : localbJz.hi(paramInt)) {
          if (localdKD.asL() == parambKq) {
            kl(true);
            return true;
          }
        }
      }
      else if (!localbJz.isEmpty()) {
        kl(true);
        return true;
      }
    }

    return false;
  }
}