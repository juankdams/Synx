package com.ankamagames.framework.script.libraries.scriptedAction;

import bvm;
import dsg;
import org.keplerproject.luajava.LuaState;

abstract class ActionGroupFunction extends dsg
{
  protected final bvm dGR;

  public ActionGroupFunction(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState);
    this.dGR = parambvm;
  }
}