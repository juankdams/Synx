package com.ankamagames.wakfu.client.ui.script;

import aFy;
import bJz;
import bMD;
import bVw;
import bYE;
import byv;
import byz;
import cMa;
import cjO;
import czM;
import dpr;
import dsg;
import gA;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddItemShortcut extends dsg
{
  UIFunctionsLibrary$AddItemShortcut(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "AddItemShortcut";
  }

  public String getDescription() {
    return "Ajoute un raccourci d'item donné aux barres de raccourci";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YC();
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
    int i = paramInt > 2 ? 1 : 0;
    gA localgA;
    if ("uid".equalsIgnoreCase(str)) {
      localgA = localbyz.bGP().iS(l);
    } else if ("refId".equalsIgnoreCase(str)) {
      localObject = localbyz.bGP().hi((int)l);
      localgA = ((gA[])localObject.toArray(new gA[localObject.size()]))[0];
    } else {
      UIFunctionsLibrary.K.warn("Type de référence (uid, ref id) inconnu pour ajouter un item : " + str);
      return;
    }
    if (localgA == null) {
      return;
    }

    Object localObject = localbyz.bGD();
    aFy localaFy = ((dpr)localObject).cWy();
    bVw localbVw = (bVw)localgA.oi();
    if (((!localgA.on()) || (localaFy != aFy.ebG)) && ((localaFy != aFy.ebH) || ((!localbVw.cbh().cwA()) && (!localgA.om()))))
    {
      if ((!localgA.om()) && (!localgA.on()) && (!localbVw.cbh().cwA())) {
        return;
      }

      localcMa1 = new cMa();
      localcMa1.setItem(localgA);
      localcMa1.iw(true);
      localcMa1.yx(-1);
      localcMa1.setPosition(-1);
      localcMa1.c(false);
      localcMa1.d(16700);
      cjO.clE().j(localcMa1);
      return;
    }
    cMa localcMa1 = localaFy == aFy.ebG ? ((dpr)localObject).cWF() : localaFy == aFy.ebH ? ((dpr)localObject).cWC() : null;

    short s = -1;
    if (i != 0) {
      s = (short)Br(2);
      if (!localcMa1.cH(s)) {
        i = 0;
      }
    }

    cMa localcMa2 = new cMa();
    localcMa2.setItem(localgA);
    localcMa2.iw(true);
    localcMa2.yx(((dpr)localObject).a(localcMa1));
    localcMa2.setPosition(i != 0 ? s : -1);
    localcMa2.c(false);
    localcMa2.d(16700);
    cjO.clE().j(localcMa2);
  }
}