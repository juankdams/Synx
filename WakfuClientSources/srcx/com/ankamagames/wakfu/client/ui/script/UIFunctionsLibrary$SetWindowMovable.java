package com.ankamagames.wakfu.client.ui.script;

import aNL;
import bYE;
import bpn;
import cBQ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$SetWindowMovable extends dsg
{
  UIFunctionsLibrary$SetWindowMovable(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setWindowMovable";
  }

  public String getDescription()
  {
    return "Permet de verrouiller ou déverrouiller une fenêtre de l'interface.";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XZ();
  }

  public final bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);
    boolean bool = By(1);
    aNL localaNL = cBQ.cxL().mU(str);
    if ((localaNL instanceof bpn)) {
      bpn localbpn = (bpn)localaNL;
      localbpn.setMovable(bool);
    } else {
      UIFunctionsLibrary.K.error("Impossible de trouver la fenêtre '" + str + "' pour la rendre movable=" + bool);
    }
  }
}