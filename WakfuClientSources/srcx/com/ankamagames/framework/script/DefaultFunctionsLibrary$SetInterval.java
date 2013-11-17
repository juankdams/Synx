package com.ankamagames.framework.script;

import bFB;
import bXf;
import bYE;
import cOx;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$SetInterval extends dsg
{
  DefaultFunctionsLibrary$SetInterval(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "setInterval";
  }

  public String getDescription()
  {
    return "Demande l'exécution d'une fonction LUA après un interval de temps donné, une infinité de fois.";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.Xz();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XA();
  }

  public final void S(int paramInt)
  {
    bXf localbXf = cYS();

    int i = Br(0);
    String str = Bv(1);

    bFB[] arrayOfbFB = eT(2, paramInt);

    int j = localbXf.a(i, -1, str, arrayOfbFB).huc;
    Bz(j);
  }
}