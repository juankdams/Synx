package com.ankamagames.baseImpl.graphics.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class FlyingElementFunctionsLibrary extends hQ
{
  private static final FlyingElementFunctionsLibrary mlk = new FlyingElementFunctionsLibrary();

  public static FlyingElementFunctionsLibrary drI()
  {
    return mlk;
  }

  public final String getName()
  {
    return "Flying";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new FlyingElementFunctionsLibrary.AddFlyingImageIE(paramLuaState), new FlyingElementFunctionsLibrary.AddFlyingImageMob(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}