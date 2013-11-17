package com.ankamagames.wakfu.client.core.script.fightLibrary.effectArea;

import aAZ;
import bYE;
import bxT;
import dsg;
import org.keplerproject.luajava.LuaState;

final class GetTarget extends dsg
{
  private static final String NAME = "getTarget";
  private static final String Vu = "Permet de récupérer l'id du personnage qui a activé la zone";
  private static final bYE[] Vt = { new bYE("targetId", null, bxT.giY, false) };
  private final aAZ Vv;

  GetTarget(LuaState paramLuaState, aAZ paramaAZ)
  {
    super(paramLuaState);
    this.Vv = paramaAZ;
  }

  public String getName()
  {
    return "getTarget";
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
    kg(this.Vv.gA());
  }

  public String getDescription()
  {
    return "Permet de récupérer l'id du personnage qui a activé la zone";
  }
}