package com.ankamagames.framework.script;

import abf;
import bFB;
import bXf;
import bYE;
import cOx;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Invoke extends dsg
{
  DefaultFunctionsLibrary$Invoke(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "invoke";
  }

  public String getDescription()
  {
    return "Demande l'exécution d'une fonction LUA après un interval de temps donné, une ou plusieurs fois.";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.Xw();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.Eq();
  }

  public final void S(int paramInt)
  {
    bXf localbXf = cYS();
    int i = Br(0);
    int j = Br(1);
    String str = Bv(2);
    bFB[] arrayOfbFB = eT(3, paramInt);
    cOx localcOx = localbXf.a(i, j, str, arrayOfbFB);
    Bz(localcOx.getId());
  }
}