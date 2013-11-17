package com.ankamagames.wakfu.client.core.script;

import VY;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class ItemActionFunctionsLibrary$SetClientVar extends dsg
{
  ItemActionFunctionsLibrary$SetClientVar(ItemActionFunctionsLibrary paramItemActionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setClientVar";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("varValue", null, bxT.giY, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    ItemActionFunctionsLibrary.a(this.bYf).ca(Bu(0));
  }
}