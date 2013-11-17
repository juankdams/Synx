package com.ankamagames.wakfu.client.core.script;

import aIA;
import bCO;
import bYE;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterBehaviourFunctionsLibrary$GetResourcePosition extends dsg
{
  MonsterBehaviourFunctionsLibrary$GetResourcePosition(MonsterBehaviourFunctionsLibrary paramMonsterBehaviourFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getResourcePosition";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return MonsterBehaviourFunctionsLibrary.Xx();
  }

  public void S(int paramInt)
  {
    long l = MonsterBehaviourFunctionsLibrary.a(this.iR).aUt();

    Bz(bCO.gs(l));
    Bz(bCO.gt(l));
  }
}