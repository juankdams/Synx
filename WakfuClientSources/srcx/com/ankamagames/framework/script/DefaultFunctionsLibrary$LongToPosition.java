package com.ankamagames.framework.script;

import aUG;
import bYE;
import cYk;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$LongToPosition extends dsg
{
  DefaultFunctionsLibrary$LongToPosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "longToPosition";
  }

  public bYE[] ce()
  {
    return DefaultFunctionsLibrary.XV();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XW();
  }

  protected void S(int paramInt)
  {
    cYk localcYk = aUG.eF(Bu(0));
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }
}