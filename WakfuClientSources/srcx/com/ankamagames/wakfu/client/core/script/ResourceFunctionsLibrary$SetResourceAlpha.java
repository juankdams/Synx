package com.ankamagames.wakfu.client.core.script;

import acL;
import azX;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ResourceFunctionsLibrary$SetResourceAlpha extends dsg
{
  ResourceFunctionsLibrary$SetResourceAlpha(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setResourceAlpha";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("Resource X", null, bxT.gjb, false), new bYE("Resource Y", null, bxT.gjb, false), new bYE("Alpha", null, bxT.gjb, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    float f = (float)Bs(2);

    azX localazX = acL.apd().aP(i, j);

    if (localazX == null) {
      a(ResourceFunctionsLibrary.an(), "Aucune ressource trouvée en [" + i + ";" + j + "]");
      return;
    }

    localazX.z(f);
  }
}