package com.ankamagames.framework.script;

import bXf;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$GetTimer extends dsg
{
  DefaultFunctionsLibrary$GetTimer(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "getTimer";
  }

  public String getDescription()
  {
    return "Récupère le temps écoulé depuis le début d'exécution du script, en millisecondes.";
  }

  public final bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.Ep();
  }

  public final void S(int paramInt)
  {
    Bz(cYS().ccv());
  }
}