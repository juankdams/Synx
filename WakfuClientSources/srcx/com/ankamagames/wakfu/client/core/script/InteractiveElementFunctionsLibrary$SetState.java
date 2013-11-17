package com.ankamagames.wakfu.client.core.script;

import ayg;
import bYE;
import bxT;
import dWu;
import dsg;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

class InteractiveElementFunctionsLibrary$SetState extends dsg
{
  InteractiveElementFunctionsLibrary$SetState(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setState";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("elementId", null, bxT.giY, false), new bYE("state", null, bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    long l = Bu(0);
    short s = (short)Br(1);

    dWu localdWu = ayg.aJQ().dw(l);
    if (localdWu == null) {
      InteractiveElementFunctionsLibrary.ch().error("L'élément interactif " + l + "n'existe pas");
      return;
    }

    localdWu.x(s);
    localdWu.JZ();
    localdWu.sM();
  }
}