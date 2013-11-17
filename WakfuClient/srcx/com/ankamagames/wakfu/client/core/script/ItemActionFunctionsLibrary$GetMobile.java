package com.ankamagames.wakfu.client.core.script;

import VY;
import bKm;
import bYE;
import bxT;
import cew;
import dsg;
import org.keplerproject.luajava.LuaState;

class ItemActionFunctionsLibrary$GetMobile extends dsg
{
  ItemActionFunctionsLibrary$GetMobile(ItemActionFunctionsLibrary paramItemActionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMobile";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("mobileId", null, bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    kg(ItemActionFunctionsLibrary.a(this.bYf).aiS().aeL().getId());
  }
}