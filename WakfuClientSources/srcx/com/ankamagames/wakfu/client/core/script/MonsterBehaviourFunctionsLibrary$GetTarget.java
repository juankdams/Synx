package com.ankamagames.wakfu.client.core.script;

import Su;
import aIA;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterBehaviourFunctionsLibrary$GetTarget extends dsg
{
  MonsterBehaviourFunctionsLibrary$GetTarget(MonsterBehaviourFunctionsLibrary paramMonsterBehaviourFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getTarget";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return MonsterBehaviourFunctionsLibrary.Eq();
  }

  public void S(int paramInt)
  {
    Su localSu = MonsterBehaviourFunctionsLibrary.a(this.iR).aUs();
    if (localSu != null)
      kg(localSu.getId());
    else
      cYR();
  }
}