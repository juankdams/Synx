package com.ankamagames.wakfu.client.core.script.function.context;

import CA;
import Su;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class GetCharacterName extends dsg
{
  public GetCharacterName(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName() {
    return "getCharacterName";
  }

  public bYE[] ce() {
    return new bYE[] { new bYE("characterId", null, bxT.giY, false) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("characterName", null, bxT.giZ, false) };
  }

  protected void S(int paramInt)
  {
    Su localSu = CA.Lv().bj(Bu(0));
    pP(localSu != null ? localSu.getName() : "");
  }
}