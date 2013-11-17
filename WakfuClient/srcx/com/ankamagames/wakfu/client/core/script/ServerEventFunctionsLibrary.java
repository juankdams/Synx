package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ServerEventFunctionsLibrary extends hQ
{
  private static final ServerEventFunctionsLibrary lwD = new ServerEventFunctionsLibrary();

  public static ServerEventFunctionsLibrary cZP() {
    return lwD;
  }

  public final String getName()
  {
    return "Server";
  }

  public String getDescription()
  {
    return "Fonctions critiques qu'il vaut mieux éviter d'utiliser";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ServerEventFunctionsLibrary.TriggerEvent(paramLuaState), new ServerEventFunctionsLibrary.SetMonsterFollowEventId(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return new dsg[0];
  }
}