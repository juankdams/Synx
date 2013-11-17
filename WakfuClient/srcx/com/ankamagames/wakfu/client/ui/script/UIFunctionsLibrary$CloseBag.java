package com.ankamagames.wakfu.client.ui.script;

import ajw;
import bCJ;
import bMD;
import bYE;
import byv;
import byz;
import cjO;
import dGW;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$CloseBag extends dsg
{
  UIFunctionsLibrary$CloseBag(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "closeBag";
  }

  public String getDescription()
  {
    return "Ferme une fenêtre d'équipement ou de contenu d'un sac si elle est ouverte, et enlève la frame UIEquipmentFrame si nécessaire.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Yl();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    bCJ localbCJ = (bCJ)byv.bFN().bFO().bGP().er((byte)i);
    if (localbCJ != null) {
      if (!byv.bFN().c(dGW.dhM())) {
        byv.bFN().a(dGW.dhM());
      }
      ajw localajw = new ajw();
      localajw.d(16418);
      localajw.a(localbCJ);
      cjO.clE().j(localajw);
    } else {
      UIFunctionsLibrary.K.error("Pas de sac équipé dans le slot " + i);
    }
  }
}