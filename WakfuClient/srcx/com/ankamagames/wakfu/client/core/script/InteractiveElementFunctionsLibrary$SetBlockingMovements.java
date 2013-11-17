package com.ankamagames.wakfu.client.core.script;

import ayg;
import bYE;
import bxT;
import dWu;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$SetBlockingMovements extends dsg
{
  InteractiveElementFunctionsLibrary$SetBlockingMovements(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setBlockingMovements";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", null, bxT.giY, false), new bYE("blocking", null, bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    boolean bool = By(1);

    dWu localdWu = ayg.aJQ().dw(l);
    if (localdWu == null) {
      InteractiveElementFunctionsLibrary.ch().error("L'élément interactif " + l + "n'existe pas");
      return;
    }

    localdWu.ev(bool);
    localdWu.JZ();
    localdWu.sM();
  }
}