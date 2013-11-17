package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetTarget extends SpellEffectActionFunction
{
  private static final String NAME = "getTarget";
  private static final String Vu = "Retourne l'id de la cible de l'effet";
  private static final bYE[] Vt = { new bYE("targetId", null, bxT.giY, false) };

  GetTarget(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
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
    kg(this.kZA.gA());
  }

  public String getDescription()
  {
    return "Retourne l'id de la cible de l'effet";
  }
}