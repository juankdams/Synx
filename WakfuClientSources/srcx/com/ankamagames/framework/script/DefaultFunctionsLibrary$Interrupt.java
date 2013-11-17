package com.ankamagames.framework.script;

import bXf;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Interrupt extends dsg
{
  DefaultFunctionsLibrary$Interrupt(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "interrupt";
  }

  public String getDescription()
  {
    return "Termine immédiatement l'exécution d'un script";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XB();
  }

  public final bYE[] cf()
  {
    return null;
  }

  public final void S(int paramInt)
  {
    bXf localbXf = cYS();
    if (localbXf != null)
      if (paramInt == 1)
        localbXf.ul(Br(0));
      else
        localbXf.interrupt();
  }
}