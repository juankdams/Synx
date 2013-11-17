package com.ankamagames.wakfu.client.core.script;

import aIA;
import bYE;
import byo;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterBehaviourFunctionsLibrary$IsMonsterOnFight extends dsg
{
  MonsterBehaviourFunctionsLibrary$IsMonsterOnFight(MonsterBehaviourFunctionsLibrary paramMonsterBehaviourFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isMonsterOnFight";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return MonsterBehaviourFunctionsLibrary.Er();
  }

  public void S(int paramInt)
  {
    byo localbyo = MonsterBehaviourFunctionsLibrary.a(this.iR).aKk();
    if (localbyo != null)
      kl(localbyo.adF());
    else
      cYR();
  }
}