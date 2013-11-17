package com.ankamagames.wakfu.client.core.script.function.context;

import bYE;
import bxT;
import dps;
import dsg;
import org.keplerproject.luajava.LuaState;

public class DeleteAnimatedElement extends dsg
{
  public DeleteAnimatedElement(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "deleteAnimatedElement";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("id", null, bxT.giY, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    long l = Bu(0);
    dps.cXa().jQ(l);
  }
}