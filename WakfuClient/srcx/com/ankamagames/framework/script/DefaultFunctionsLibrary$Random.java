package com.ankamagames.framework.script;

import bCO;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class DefaultFunctionsLibrary$Random extends dsg
{
  DefaultFunctionsLibrary$Random(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public final String getName()
  {
    return "random";
  }

  public final bYE[] ce()
  {
    return DefaultFunctionsLibrary.XO();
  }

  public bYE[] cf()
  {
    return DefaultFunctionsLibrary.XP();
  }

  public final void S(int paramInt)
  {
    long l1 = Bu(0);
    long l2 = Bu(1);
    long l3 = bCO.C(l1, l2);

    kg(l3);
  }
}