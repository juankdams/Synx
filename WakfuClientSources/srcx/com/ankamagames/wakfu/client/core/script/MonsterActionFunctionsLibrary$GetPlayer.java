package com.ankamagames.wakfu.client.core.script;

import Su;
import bKm;
import bMV;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

class MonsterActionFunctionsLibrary$GetPlayer extends dsg
{
  MonsterActionFunctionsLibrary$GetPlayer(MonsterActionFunctionsLibrary paramMonsterActionFunctionsLibrary, LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "getPlayer";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("playerId", null, bxT.giY, false) };
  }

  public void S(int paramInt)
  {
    bKm localbKm = MonsterActionFunctionsLibrary.a(this.czj).bUC();
    if (localbKm != null)
      kg(localbKm.getId());
    else
      cYR();
  }
}