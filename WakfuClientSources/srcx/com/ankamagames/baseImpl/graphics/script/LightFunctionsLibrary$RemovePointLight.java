package com.ankamagames.baseImpl.graphics.script;

import bYE;
import btL;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class LightFunctionsLibrary$RemovePointLight extends dsg
{
  LightFunctionsLibrary$RemovePointLight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "removePointLight";
  }

  public String getDescription()
  {
    return "Supprime une lumière ponctuelle";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("lightId", "Id de la lumière", bxT.gja, false) };
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    btL.gcv.b(LightFunctionsLibrary.to(i));
    LightFunctionsLibrary.tp(i);
  }
}