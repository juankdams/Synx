package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class EventFunctionsLibrary extends hQ
{
  private static final EventFunctionsLibrary dzK = new EventFunctionsLibrary();

  public static EventFunctionsLibrary aDO() {
    return dzK;
  }

  public final String getName()
  {
    return "Event";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new EventFunctionsLibrary.RunOnInstanceLoaded(paramLuaState), new EventFunctionsLibrary.RunOnInteractiveElementActivation(paramLuaState), new EventFunctionsLibrary.RemoveInteractiveElementListener(paramLuaState), new EventFunctionsLibrary.RunOnItemEquipped(paramLuaState), new EventFunctionsLibrary.RunOnBagLinked(paramLuaState), new EventFunctionsLibrary.AddFleaModifiedListener(paramLuaState), new EventFunctionsLibrary.RemoveFleaModifiedListener(paramLuaState), new EventFunctionsLibrary.RunOnEnterSellerMode(paramLuaState), new EventFunctionsLibrary.SetFightTurnStartedListener(paramLuaState), new EventFunctionsLibrary.RemoveFightTurnStartedListener(paramLuaState), new EventFunctionsLibrary.ListenInteractiveElementActivation(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}