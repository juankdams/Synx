package com.ankamagames.baseImpl.graphics.script;

import bYE;
import btL;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$RemoveGlobalLight extends dsg
{
  LightFunctionsLibrary$RemoveGlobalLight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removeGlobalLight";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", null, bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    btL.gcv.b(LightFunctionsLibrary.tq(i));
    LightFunctionsLibrary.tr(i);
  }
}