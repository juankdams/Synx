package com.ankamagames.wakfu.client.ui.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class SystemMessageFunctionsLibrary extends hQ
{
  private static final SystemMessageFunctionsLibrary luo = new SystemMessageFunctionsLibrary();

  public static SystemMessageFunctionsLibrary cYE()
  {
    return luo;
  }

  public final String getName()
  {
    return "SystemMessage";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new SystemMessageFunctionsLibrary.AddSystemMessage(this, paramLuaState, null) };
  }
}