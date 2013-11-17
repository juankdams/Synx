package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class AmbianceFunctionLibrary extends hQ
{
  private static final AmbianceFunctionLibrary cJR = new AmbianceFunctionLibrary();

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new AmbianceFunctionLibrary.SetEnvironmentParticleSystem(paramLuaState), new AmbianceFunctionLibrary.SetWeather(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return new dsg[0];
  }

  public static AmbianceFunctionLibrary akp()
  {
    return cJR;
  }

  public final String getName()
  {
    return "Ambiance";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}