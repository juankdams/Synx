package com.ankamagames.wakfu.client.core.script;

import acL;
import azX;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ResourceFunctionsLibrary$IsResourceVisible extends dsg
{
  ResourceFunctionsLibrary$IsResourceVisible(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isResourceVisible";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("Resource X", null, bxT.gjb, false), new bYE("Resource Y", null, bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("Visibility", null, bxT.gjc, false) };
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    azX localazX = acL.apd().aP(i, j);

    if (localazX == null) {
      a(ResourceFunctionsLibrary.i(), "Aucune ressource trouvée en [" + i + ";" + j + "]");
      return;
    }

    kl(localazX.isVisible());
  }
}