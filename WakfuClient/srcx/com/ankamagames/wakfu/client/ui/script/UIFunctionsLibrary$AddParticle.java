package com.ankamagames.wakfu.client.ui.script;

import Jg;
import aFG;
import aNL;
import bDf;
import bYE;
import cBQ;
import cDA;
import cSR;
import cag;
import cpa;
import dOc;
import dsg;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$AddParticle extends dsg
{
  UIFunctionsLibrary$AddParticle(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "addParticle";
  }

  public String getDescription()
  {
    return "Ajoute un système de particule sur un élément d'interface";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yq();
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.Yr();
  }

  protected void S(int paramInt)
  {
    String str1 = Bv(0);
    cpa localcpa = cBQ.cxL().coO().nf(str1);
    if (localcpa == null) {
      a(UIFunctionsLibrary.K, "Dialogue inconnu " + str1);
      cYR();
      return;
    }

    String str2 = Bv(1);
    aNL localaNL = localcpa.fi(str2);
    if (localaNL == null) {
      a(UIFunctionsLibrary.K, "ElementDispatcher inconnu " + str2 + " dans le dialog " + str1);
      cYR();
      return;
    }

    if (!(localaNL instanceof dOc)) {
      a(UIFunctionsLibrary.K, "le widget n'est pas du type Widget");
      cYR();
      return;
    }

    String str3 = Bv(2);
    cag localcag = new cag();
    int i = UIFunctionsLibrary.Ys();
    localcag.aJ();
    localcag.setFile(str3);
    localcag.setX(Br(3));
    localcag.setY(Br(4));
    localcag.setFollowBorders(By(5));

    aFG localaFG = aFG.eck;
    int j = bDf.gyc;

    if (paramInt > 6) {
      if (getParam(8).isString())
        localaFG = aFG.valueOf(Bv(6));
      else if (getParam(8).isNumber()) {
        j = Br(6);
      }
    }

    if ((paramInt > 7) && 
      (getParam(9).isNumber())) {
      j = Br(7);
    }

    if (j != bDf.gyc) {
      localcag.setLevel(j);
    }
    localcag.setAlignment(localaFG);

    ((dOc)localaNL).getAppearance().a(localcag);
    UIFunctionsLibrary.Xv().ccR.put(i, localcag);
    Bz(i);
  }
}