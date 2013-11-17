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
import gA;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddEquipmentShortcut extends dsg
{
  UIFunctionsLibrary$AddEquipmentShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addEquipmentShortcut";
  }

  public String getDescription()
  {
    return "Ajoute un lien vers un objet équipe dans la barre de raccourcis active.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yy();
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

    bJz localbJz = localbyz.bGD().cWF();

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
    gA localgA;
    if ("pos".equalsIgnoreCase(str)) {
      localgA = (gA)localbyz.ayJ().dB((short)(int)l);
      if (localgA != null);
    }
    else if ("uid".equalsIgnoreCase(str)) {
      localgA = (gA)localbyz.ayJ().ci(l);
      if (localgA != null);
    }
    else if ("refId".equalsIgnoreCase(str)) {
      localgA = (gA)localbyz.ayJ().hh((int)l);
      if (localgA != null);
    }
    else {
      UIFunctionsLibrary.K.warn("Type de référence (uid, ref id, position, ...) inconnu pour ajouter un equipment : " + str);
      return;
    }

    int j = localbyz.ayJ().il(localgA.oj());

    if (localbJz.tc(localgA.ok()) == null) {
      dKD localdKD = dKD.b(bKq.gNh, -j - 1, localgA.ok(), localgA.oc());

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