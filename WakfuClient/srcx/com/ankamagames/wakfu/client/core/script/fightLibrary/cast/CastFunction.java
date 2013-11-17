package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import cJs;
import dsg;
import org.keplerproject.luajava.LuaState;

abstract class CastFunction extends dsg
{
  protected final cJs gPj;

  CastFunction(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState);
    this.gPj = paramcJs;
  }
}