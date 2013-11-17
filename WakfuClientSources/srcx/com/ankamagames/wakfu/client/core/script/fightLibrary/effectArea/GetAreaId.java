package com.ankamagames.wakfu.client.core.script.fightLibrary.effectArea;

import aAZ;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

final class GetAreaId extends dsg
{
  private static final String NAME = "getAreaId";
  private static final String Vu = "Permet de récupérer l'id de la zone associée de l'action";
  private static final bYE[] Vt = { new bYE("areaId", null, bxT.giY, false) };
  private final aAZ Vv;

  GetAreaId(LuaState paramLuaState, aAZ paramaAZ)
  {
    super(paramLuaState);
    this.Vv = paramaAZ;
  }

  public String getName()
  {
    return "getAreaId";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  public void S(int paramInt)
  {
    kg(this.Vv.bwv());
  }

  public String getDescription()
  {
    return "Permet de récupérer l'id de la zone associée de l'action";
  }
}