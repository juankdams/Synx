package com.ankamagames.wakfu.client.core.script;

import bMV;
import bYE;
import bxT;
import byo;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterActionFunctionsLibrary$GetMonster extends dsg
{
  MonsterActionFunctionsLibrary$GetMonster(MonsterActionFunctionsLibrary paramMonsterActionFunctionsLibrary, LuaState paramLuaState)
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
    byo localbyo = MonsterActionFunctionsLibrary.a(this.czj).aKk();
    if (localbyo != null)
      kg(localbyo.getId());
    else
      cYR();
  }
}