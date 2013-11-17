package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetCaster extends SpellEffectActionFunction
{
  private static final String NAME = "getCaster";
  private static final String Vu = "Retourne l'id du caster de l'effet";
  private static final bYE[] Vt = { new bYE("casterId", null, bxT.giY, false) };

  GetCaster(LuaState paramLuaState, aZI paramaZI) {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getCaster";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  protected void S(int paramInt)
  {
    kg(this.kZA.Iw());
  }

  public String getDescription()
  {
    return "Retourne l'id du caster de l'effet";
  }
}