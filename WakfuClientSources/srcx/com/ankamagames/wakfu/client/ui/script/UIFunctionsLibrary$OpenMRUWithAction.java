package com.ankamagames.wakfu.client.ui.script;

import aiI;
import akc;
import bVl;
import bYE;
import clD;
import csx;
import dsg;
import ob;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenMRUWithAction extends dsg
{
  UIFunctionsLibrary$OpenMRUWithAction(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openMRUWithAction";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XE();
  }

  public String getDescription() {
    return "Ouvre une MRU qui lance un script sur un élément interactif du jeu";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    clD localclD = new clD();

    long l = Bu(0);
    int i = Br(1);
    int j = Br(2);

    ob localob = bVl.caZ().hb(l);
    if (localob == null) {
      UIFunctionsLibrary.K.warn("impossible de trouver l'interactiveElement d'id " + l);
      return;
    }

    akc localakc = (akc)aiI.dgb.avu().qb();
    localakc.iT(j);
    localakc.cb(i);

    csx[] arrayOfcsx = new csx[1];
    arrayOfcsx[0] = localakc;
    localclD.a(arrayOfcsx, localob);

    if (localclD.isDisplayable())
      localclD.display();
  }
}