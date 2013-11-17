package com.ankamagames.wakfu.client.ui.script;

import Or;
import aNL;
import bYE;
import bpn;
import bxT;
import cBQ;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$GetWindowSize extends dsg
{
  UIFunctionsLibrary$GetWindowSize(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getWindowSize";
  }

  public String getDescription() {
    return "Fourni la taille d'une fenêtre spécifiée";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.YO();
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("x", null, bxT.gjb, false), new bYE("y", null, bxT.gjb, false) };
  }

  protected void S(int paramInt)
  {
    String str = Bv(0);

    aNL localaNL = cBQ.cxL().mU(str);
    if ((localaNL instanceof bpn)) {
      bpn localbpn = (bpn)localaNL;
      Or localOr = localbpn.getPrefSize();
      Bz(localOr.width);
      Bz(localOr.height);
    } else {
      Bz(0);
      Bz(0);
      UIFunctionsLibrary.K.error("Impossible de récupérer la taille de la fenêtre '" + str + "' qui n'existe pas");
    }
  }
}