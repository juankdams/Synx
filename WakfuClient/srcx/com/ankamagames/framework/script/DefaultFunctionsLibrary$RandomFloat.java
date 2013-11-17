package com.ankamagames.framework.script;

import bCO;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$RandomFloat extends dsg
{
  DefaultFunctionsLibrary$RandomFloat(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "randomFloat";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XQ();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XR();
  }

  public final void S(int paramInt)
  {
    float f1 = Bt(0);
    float f2 = Bt(1);
    float f3 = bCO.U(f1, f2);

    dj(f3);
  }
}