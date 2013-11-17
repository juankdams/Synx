package com.ankamagames.wakfu.client.ui.script;

import aNL;
import bYE;
import biy;
import cBQ;
import cDA;
import cpa;
import dsg;
import org.keplerproject.luajava.LuaState;

class UIFunctionsLibrary$ClickButton extends dsg
{
  UIFunctionsLibrary$ClickButton(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "clickButton";
  }

  public String getDescription()
  {
    return "Simule un clique sur un bouton";
  }

  public bYE[] ce()
  {
    return UIFunctionsLibrary.XQ();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    cpa localcpa = cBQ.cxL().coO().nf(Bv(0));
    if (localcpa == null) {
      return;
    }

    aNL localaNL = localcpa.fi(Bv(1));
    if ((localaNL instanceof biy))
      if (paramInt > 2)
      {
        int i;
        switch (Br(2)) {
        case 2:
          i = 2;
          break;
        case 3:
          i = 3;
          break;
        default:
          i = 1;
        }
        ((biy)localaNL).D(i, paramInt == 4 ? Br(3) : 1, 0);
      } else {
        ((biy)localaNL).buz();
      }
  }
}