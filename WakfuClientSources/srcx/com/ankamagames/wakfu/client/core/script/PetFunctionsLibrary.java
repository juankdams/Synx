package com.ankamagames.wakfu.client.core.script;

import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class PetFunctionsLibrary extends hQ
{
  private static final PetFunctionsLibrary egn = new PetFunctionsLibrary();

  public static PetFunctionsLibrary aUa() {
    return egn;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new PetFunctionsLibrary.GetPetId(paramLuaState), new PetFunctionsLibrary.SetPetVisible(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public final String getName()
  {
    return "Pet";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }
}