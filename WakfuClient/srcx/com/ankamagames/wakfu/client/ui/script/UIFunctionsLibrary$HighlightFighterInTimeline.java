package com.ankamagames.wakfu.client.ui.script;

import CA;
import Su;
import arl;
import bYE;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;
import zu;

class UIFunctionsLibrary$HighlightFighterInTimeline extends dsg
{
  UIFunctionsLibrary$HighlightFighterInTimeline(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "highlightFighterInTimeline";
  }

  public String getDescription() {
    return "Sélectionne un personnage dans la timeLine";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XB();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.aeQ();
    Su localSu = CA.Lv().bj(Bu(0));
    if (localSu == null) {
      return;
    }
    if ((localarl != null) && (localarl.ac(localSu)))
      localarl.aDp().b(localSu, By(1));
  }
}