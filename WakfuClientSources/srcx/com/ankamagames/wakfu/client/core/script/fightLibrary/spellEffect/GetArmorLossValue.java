package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetArmorLossValue extends SpellEffectActionFunction
{
  private static final String NAME = "getArmorLossValue";
  private static final String Vu = "Retourne la valeur d'armure perdue";
  private static final bYE[] Vt = { new bYE("value", null, bxT.gja, false) };

  GetArmorLossValue(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getArmorLossValue";
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
    Bz(this.kZA.boy());
  }

  public String getDescription()
  {
    return "Retourne la valeur d'armure perdue";
  }
}