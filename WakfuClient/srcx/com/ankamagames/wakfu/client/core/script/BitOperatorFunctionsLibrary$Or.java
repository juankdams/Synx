package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class BitOperatorFunctionsLibrary$Or extends dsg
{
  BitOperatorFunctionsLibrary$Or(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "Or";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("number", bxT.giY, false), new bYE("number", bxT.giY, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("number", bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    if (paramInt == 2)
      kg(Bu(0) | Bu(1));
  }
}