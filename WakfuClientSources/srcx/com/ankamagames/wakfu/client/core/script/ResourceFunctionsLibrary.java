package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class ResourceFunctionsLibrary extends hQ
{
  public static final ResourceFunctionsLibrary ihG = new ResourceFunctionsLibrary();

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new ResourceFunctionsLibrary.SetResourceVisible(paramLuaState), new ResourceFunctionsLibrary.IsResourceVisible(paramLuaState), new ResourceFunctionsLibrary.SetResourceAlpha(paramLuaState), new ResourceFunctionsLibrary.GetResourceAlpha(paramLuaState), new ResourceFunctionsLibrary.AddResourceCreationCallback(paramLuaState), new ResourceFunctionsLibrary.AddResourceDestructionCallback(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Resource";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}