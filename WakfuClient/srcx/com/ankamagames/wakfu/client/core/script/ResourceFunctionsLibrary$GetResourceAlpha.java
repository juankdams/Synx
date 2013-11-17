package com.ankamagames.wakfu.client.core.script;

import acL;
import azX;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ResourceFunctionsLibrary$GetResourceAlpha extends dsg
{
  ResourceFunctionsLibrary$GetResourceAlpha(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getResourceAlpha";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("Resource X", null, bxT.gjb, false), new bYE("Resource Y", null, bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("Alpha", null, bxT.gjb, false) };
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);

    azX localazX = acL.apd().aP(i, j);

    if (localazX == null) {
      a(ResourceFunctionsLibrary.Re(), "Aucune ressource trouvée en [" + i + ";" + j + "]");
      return;
    }

    dj(localazX.getAlpha());
  }
}