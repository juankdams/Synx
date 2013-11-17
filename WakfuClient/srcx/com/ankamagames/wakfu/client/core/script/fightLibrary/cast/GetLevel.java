package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import bYE;
import bxT;
import cJs;
import org.keplerproject.luajava.LuaState;

final class GetLevel extends CastFunction
{
  private static final String NAME = "getLevel";
  private static final String Vu = "Permet de récupérer le niveau du sort ou du skill associé à l'action";
  private static final bYE[] cRe = { new bYE("castLevel", null, bxT.gja, false) };

  GetLevel(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getLevel";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return cRe;
  }

  public void S(int paramInt)
  {
    Bz(this.gPj.nU());
  }

  public String getDescription()
  {
    return "Permet de récupérer le niveau du sort ou du skill associé à l'action";
  }
}