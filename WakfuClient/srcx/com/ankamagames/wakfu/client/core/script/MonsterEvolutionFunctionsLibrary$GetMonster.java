package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import cBN;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterEvolutionFunctionsLibrary$GetMonster extends dsg
{
  MonsterEvolutionFunctionsLibrary$GetMonster(MonsterEvolutionFunctionsLibrary paramMonsterEvolutionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getMonster";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("monsterId", null, bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    kg(MonsterEvolutionFunctionsLibrary.a(this.cGE).aqN());
  }
}