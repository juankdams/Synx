package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class BitOperatorFunctionsLibrary extends hQ
{
  public String getName()
  {
    return "BitOperator";
  }

  public String getDescription()
  {
    return "";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new BitOperatorFunctionsLibrary.Or(paramLuaState), new BitOperatorFunctionsLibrary.And(paramLuaState), new BitOperatorFunctionsLibrary.Shift(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}