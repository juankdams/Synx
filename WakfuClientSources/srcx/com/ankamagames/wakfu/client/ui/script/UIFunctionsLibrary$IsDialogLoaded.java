package com.ankamagames.wakfu.client.ui.script;

import bYE;
import cBQ;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$IsDialogLoaded extends dsg
{
  UIFunctionsLibrary$IsDialogLoaded(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isDialogLoaded";
  }

  public String getDescription() {
    return "Indique si l'interface spécifiée est ouverte ou non";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Zc();
  }

  public bYE[] cf()
  {
    return UIFunctionsLibrary.Zd();
  }

  protected void S(int paramInt)
  {
    kl(cBQ.cxL().mZ(Bv(0)));
  }
}