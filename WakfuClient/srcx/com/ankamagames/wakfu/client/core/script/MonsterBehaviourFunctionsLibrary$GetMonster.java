package com.ankamagames.wakfu.client.core.script;

import aIA;
import bYE;
import byo;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterBehaviourFunctionsLibrary$GetMonster extends dsg
{
  MonsterBehaviourFunctionsLibrary$GetMonster(MonsterBehaviourFunctionsLibrary paramMonsterBehaviourFunctionsLibrary, LuaState paramLuaState)
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
    return MonsterBehaviourFunctionsLibrary.Ep();
  }

  public void S(int paramInt)
  {
    byo localbyo = MonsterBehaviourFunctionsLibrary.a(this.iR).aKk();
    if (localbyo != null)
      kg(localbyo.getId());
    else
      cYR();
  }
}