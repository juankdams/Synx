package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$IsEqual extends dsg
{
  DefaultFunctionsLibrary$IsEqual(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "isEqual";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XC();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XD();
  }

  public final void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    boolean bool = l1 == l2;

    kl(bool);
  }
}