package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$MaxValue extends dsg
{
  DefaultFunctionsLibrary$MaxValue(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "max";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XM();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XN();
  }

  public final void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);

    kg(Math.max(l1, l2));
  }
}