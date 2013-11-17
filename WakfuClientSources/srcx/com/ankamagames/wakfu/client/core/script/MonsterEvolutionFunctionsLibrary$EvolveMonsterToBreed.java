package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import byo;
import cBN;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterEvolutionFunctionsLibrary$EvolveMonsterToBreed extends dsg
{
  MonsterEvolutionFunctionsLibrary$EvolveMonsterToBreed(MonsterEvolutionFunctionsLibrary paramMonsterEvolutionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "evolveMonsterToBreed";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("breedId", null, bxT.gja, false) };
  }

  public final bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    short s = (short)Br(0);
    byo localbyo = (byo)MonsterEvolutionFunctionsLibrary.a(this.cGE).cxK();

    if (localbyo != null)
      localbyo.D(s, MonsterEvolutionFunctionsLibrary.a(this.cGE).cxJ());
  }
}