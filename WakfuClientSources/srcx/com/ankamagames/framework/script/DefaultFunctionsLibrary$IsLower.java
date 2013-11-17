package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$IsLower extends dsg
{
  DefaultFunctionsLibrary$IsLower(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "isLower";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XG();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XH();
  }

  public final void S(int paramInt)
  {
    boolean bool = Bu(0) < Bu(1);
    kl(bool);
  }
}