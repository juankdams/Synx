package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$ToLong extends dsg
{
  DefaultFunctionsLibrary$ToLong(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "toLong";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.XS();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XT();
  }

  protected void S(int paramInt)
  {
    kg(Bu(0));
  }
}