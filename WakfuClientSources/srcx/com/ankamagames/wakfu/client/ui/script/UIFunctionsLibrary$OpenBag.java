package com.ankamagames.wakfu.client.ui.script;

import bCJ;
import bMD;
import bYE;
import byv;
import byz;
import dGW;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$OpenBag extends dsg
{
  UIFunctionsLibrary$OpenBag(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "openBag";
  }

  public String getDescription()
  {
    return "Ouvre une fenêtre d'équipement ou de contenu d'un sac si elle n'est pas ouverte, et ajoute la frame UIEquipmentFrame correspondante";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yj();
  }

  public final bYE[] cf()
  {
    return UIFunctionsLibrary.Yk();
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    bCJ localbCJ = (bCJ)byv.bFN().bFO().bGP().er((byte)i);
    if (localbCJ != null) {
      if (!byv.bFN().c(dGW.dhM())) {
        byv.bFN().a(dGW.dhM());
      }
      String str = dGW.dhM().c(localbCJ);
      pP(str);
    } else {
      UIFunctionsLibrary.K.error("Pas de sac équipé dans le slot " + i);
      pP("");
    }
  }
}