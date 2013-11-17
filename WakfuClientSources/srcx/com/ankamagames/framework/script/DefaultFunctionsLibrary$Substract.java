package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Substract extends dsg
{
  DefaultFunctionsLibrary$Substract(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "substract";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XI();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XJ();
  }

  public final void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    long l3 = l1 - l2;

    kg(l3);
  }
}