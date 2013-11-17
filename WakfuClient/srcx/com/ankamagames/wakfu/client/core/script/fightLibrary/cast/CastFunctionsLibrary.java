package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import cJs;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class CastFunctionsLibrary extends hQ
{
  private static final String NAME = "Cast";
  private static final String Vu = "Permet de récupérer des informations liées aux actions de Cast en combat (utilisation de sort ou d'arme)";
  private final cJs gPj;

  public CastFunctionsLibrary(cJs paramcJs)
  {
    this.gPj = paramcJs;
  }

  public final String getName()
  {
    return "Cast";
  }

  public String getDescription()
  {
    return "Permet de récupérer des informations liées aux actions de Cast en combat (utilisation de sort ou d'arme)";
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new GetCaster(paramLuaState, this.gPj), new GetCasterSex(paramLuaState, this.gPj), new GetPosition(paramLuaState, this.gPj), new GetCasterPosition(paramLuaState, this.gPj), new GetCasterInformation(paramLuaState, this.gPj), new IsCritical(paramLuaState, this.gPj), new GetLevel(paramLuaState, this.gPj), new GetCasterBreed(paramLuaState, this.gPj), new HasState(paramLuaState, this.gPj), new HasEffect(paramLuaState, this.gPj) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}