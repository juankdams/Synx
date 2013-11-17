package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class InteractiveElementFunctionsLibrary extends hQ
{
  private static final Logger K = Logger.getLogger(InteractiveElementFunctionsLibrary.class);

  private static final InteractiveElementFunctionsLibrary aZG = new InteractiveElementFunctionsLibrary();

  public final String getName()
  {
    return "InteractiveElement";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public static InteractiveElementFunctionsLibrary yi()
  {
    return aZG;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new InteractiveElementFunctionsLibrary.SetAnimation(paramLuaState), new InteractiveElementFunctionsLibrary.GetElementId(paramLuaState), new InteractiveElementFunctionsLibrary.GetElementsId(paramLuaState), new InteractiveElementFunctionsLibrary.FireAction(paramLuaState), new InteractiveElementFunctionsLibrary.SetVisible(paramLuaState), new InteractiveElementFunctionsLibrary.IsVisible(paramLuaState), new InteractiveElementFunctionsLibrary.GetPosition(paramLuaState), new InteractiveElementFunctionsLibrary.GetState(paramLuaState), new InteractiveElementFunctionsLibrary.IsUsable(paramLuaState), new InteractiveElementFunctionsLibrary.SetState(paramLuaState), new InteractiveElementFunctionsLibrary.SetBlockingMovements(paramLuaState), new InteractiveElementFunctionsLibrary.AddInteractiveElementCreationCallback(paramLuaState), new InteractiveElementFunctionsLibrary.AddInteractiveElementDestructionCallback(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}