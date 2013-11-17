package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import cBN;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterEvolutionFunctionsLibrary$GetEvolvedBreedId extends dsg
{
  MonsterEvolutionFunctionsLibrary$GetEvolvedBreedId(MonsterEvolutionFunctionsLibrary paramMonsterEvolutionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getEvolvedBreedId";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("breedId", null, bxT.gja, false) };
  }

  public void S(int paramInt)
  {
    Bz(MonsterEvolutionFunctionsLibrary.a(this.cGE).cxI());
  }
}