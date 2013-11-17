package com.ankamagames.wakfu.client.core.script;

import azv;
import bYE;
import cYk;
import dsg;
import org.keplerproject.luajava.LuaState;

class ItemActionFunctionsLibrary$GetCastPosition extends dsg
{
  ItemActionFunctionsLibrary$GetCastPosition(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getCastPosition";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return ItemActionFunctionsLibrary.Xw();
  }

  public void S(int paramInt)
  {
    cYk localcYk = azv.aLf().aJa();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }
}