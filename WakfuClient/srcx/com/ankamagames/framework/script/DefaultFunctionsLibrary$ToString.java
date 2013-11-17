package com.ankamagames.framework.script;

import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$ToString extends dsg
{
  DefaultFunctionsLibrary$ToString(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "toString";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.XX();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XY();
  }

  protected void S(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramInt; i++) {
      String str = Bx(i);
      localStringBuilder.append(str != null ? str : null);
    }
    pP(localStringBuilder.toString());
  }
}