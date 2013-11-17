package com.ankamagames.wakfu.client.core.script;

import cBN;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class MonsterEvolutionFunctionsLibrary extends hQ
{
  private final cBN lny;

  public final String getName()
  {
    return "Evolution";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public MonsterEvolutionFunctionsLibrary(cBN paramcBN)
  {
    this.lny = paramcBN;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new MonsterEvolutionFunctionsLibrary.GetMonster(this, paramLuaState), new MonsterEvolutionFunctionsLibrary.GetEvolvedBreedId(this, paramLuaState), new MonsterEvolutionFunctionsLibrary.EvolveMonsterToBreed(this, paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}