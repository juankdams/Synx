package com.ankamagames.wakfu.client.ui.script;

import bJz;
import bYE;
import byv;
import byz;
import cMa;
import cjO;
import dCi;
import dpr;
import dsg;
import dsj;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddSpellShortcut extends dsg
{
  UIFunctionsLibrary$AddSpellShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addSpellShortcut";
  }

  public String getDescription()
  {
    return "Ajoute un lien vers un sort dans la barre de raccourcis active.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YB();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    String str = Bv(0);
    long l = Bu(1);
    short s = -1;
    int i = paramInt > 2 ? 1 : 0;

    bJz localbJz = localbyz.bGD().fs((byte)0);

    if (i != 0) {
      s = (short)Br(2);
      if (!localbJz.cH(s)) {
        i = 0;
      }

    }

    if (i == 0) {
      s = localbJz.bQI();
    }
    if (s == -1)
      return;
    dsj localdsj;
    if ("uid".equalsIgnoreCase(str)) {
      localdsj = localbyz.auK().ci(l);
      if (localdsj != null);
    }
    else if ("refId".equalsIgnoreCase(str)) {
      localdsj = localbyz.auK().hh((int)l);
      if (localdsj != null);
    }
    else {
      UIFunctionsLibrary.K.warn("Type de référence (uid, ref id) inconnu pour ajouter un sort : " + str);
      return;
    }

    cMa localcMa = new cMa();
    localcMa.setItem(localdsj);
    localcMa.iw(true);
    localcMa.yx(localbyz.bGD().a(localbJz));
    localcMa.setPosition(s);
    localcMa.c(false);
    localcMa.d(16700);
    cjO.clE().j(localcMa);
  }
}