package com.ankamagames.wakfu.client.ui.script;

import bJz;
import bKq;
import bYE;
import bZH;
import byv;
import byz;
import cMa;
import cjO;
import dKD;
import dpr;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddEmoteShortcut extends dsg
{
  UIFunctionsLibrary$AddEmoteShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addEmoteShortcut";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yz();
  }

  public String getDescription() {
    return "Ajoute l'emote spécifiée dans la barre de raccourci d'item courante";
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    int i = Br(0);
    short s = -1;
    int j = paramInt > 2 ? 1 : 0;

    bJz localbJz = localbyz.bGD().cWF();

    if (j != 0) {
      s = (short)Br(1);
      if (!localbJz.cH(s)) {
        j = 0;
      }

    }

    if (j == 0) {
      s = localbJz.bQI();
    }
    if (s == -1) {
      return;
    }

    int k = localbyz.ayJ().il(i);

    if (localbJz.tc(i) == null) {
      dKD localdKD = dKD.b(bKq.gNi, -k - 1, i, i);

      cMa localcMa = new cMa();
      localcMa.setItem(localdKD);
      localcMa.iw(true);
      localcMa.yx(localbyz.bGD().cWG());
      localcMa.setPosition(s);
      localcMa.c(false);
      localcMa.d(16700);
      cjO.clE().j(localcMa);
    }
  }
}