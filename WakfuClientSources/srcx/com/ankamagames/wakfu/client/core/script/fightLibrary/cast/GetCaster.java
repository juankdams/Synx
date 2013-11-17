package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import bYE;
import bxT;
import cJs;
import org.keplerproject.luajava.LuaState;

class GetCaster extends CastFunction
{
  private static final String NAME = "getCaster";
  private static final String Vu = "Permet de récupérer l'id du lanceur de l'action";
  private static final bYE[] hVh = { new bYE("casterId", null, bxT.giY, false) };

  GetCaster(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "getCaster";
  }

  public bYE[] ce()
  {
    return null;
  }

  public final bYE[] cf()
  {
    return hVh;
  }

  public void S(int paramInt)
  {
    kg(this.gPj.bwv());
  }

  public String getDescription()
  {
    return "Permet de récupérer l'id du lanceur de l'action";
  }
}