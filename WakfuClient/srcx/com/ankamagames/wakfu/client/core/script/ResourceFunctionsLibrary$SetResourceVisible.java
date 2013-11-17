package com.ankamagames.wakfu.client.core.script;

import acL;
import azX;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ResourceFunctionsLibrary$SetResourceVisible extends dsg
{
  ResourceFunctionsLibrary$SetResourceVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setResourceVisible";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("Resource X", null, bxT.gjb, false), new bYE("Resource Y", null, bxT.gjb, false), new bYE("Visible ?", null, bxT.gjc, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    boolean bool = By(2);

    azX localazX = acL.apd().aP(i, j);

    if (localazX == null) {
      a(ResourceFunctionsLibrary.ch(), "Aucune ressource trouvée en [" + i + ";" + j + "]");
      return;
    }

    localazX.setVisible(bool);
  }
}