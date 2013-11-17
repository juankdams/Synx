package com.ankamagames.wakfu.client.ui.script;

import HJ;
import bYE;
import byv;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$DisplayFresco extends dsg
{
  UIFunctionsLibrary$DisplayFresco(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "displayFresco";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.Xz();
  }

  public String getDescription() {
    return "Affiche une frèsque background manipulable horizontalement à la souris";
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    HJ.Ra().eT(i);
    byv.bFN().a(HJ.Ra());
  }
}