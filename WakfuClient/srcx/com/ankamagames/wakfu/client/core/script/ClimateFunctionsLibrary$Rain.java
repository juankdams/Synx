package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ClimateFunctionsLibrary$Rain extends dsg
{
  ClimateFunctionsLibrary$Rain(ClimateFunctionsLibrary paramClimateFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "rain";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("enable", null, bxT.gjc, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
  }
}