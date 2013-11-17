package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$AbsoluteValue extends dsg
{
  DefaultFunctionsLibrary$AbsoluteValue(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "abs";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XK();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XL();
  }

  public final void S(int paramInt)
  {
    long l = Bu(0);

    kg(Math.abs(l));
  }
}