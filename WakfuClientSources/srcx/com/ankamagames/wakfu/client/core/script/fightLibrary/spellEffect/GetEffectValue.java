package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetEffectValue extends SpellEffectActionFunction
{
  private static final String NAME = "getEffectValue";
  private static final String Vu = "Retourne la valeur de l'effet";
  private static final bYE[] Vt = { new bYE("value", null, bxT.gja, false) };

  GetEffectValue(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getEffectValue";
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
    Bz(this.kZA.are());
  }

  public String getDescription()
  {
    return "Retourne la valeur de l'effet";
  }
}