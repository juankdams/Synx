package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$IsGreater extends dsg
{
  DefaultFunctionsLibrary$IsGreater(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "isGreater";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XE();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XF();
  }

  public final void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    boolean bool = l1 > l2;

    kl(bool);
  }
}