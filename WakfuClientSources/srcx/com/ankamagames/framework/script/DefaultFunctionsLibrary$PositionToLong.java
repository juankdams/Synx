package com.ankamagames.framework.script;

import aUG;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$PositionToLong extends dsg
{
  DefaultFunctionsLibrary$PositionToLong(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "positionToLong";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.aUh();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.brG();
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    int j = Br(1);
    int k = Br(2);
    kg(aUG.B(i, j, (short)k));
  }
}