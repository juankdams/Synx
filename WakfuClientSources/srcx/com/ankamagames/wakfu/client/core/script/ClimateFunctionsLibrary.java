package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class ClimateFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(ClimateFunctionsLibrary.class);

  private static final ClimateFunctionsLibrary bXL = new ClimateFunctionsLibrary();

  public static ClimateFunctionsLibrary VK() {
    return bXL;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ClimateFunctionsLibrary.Rain(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Climate";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}