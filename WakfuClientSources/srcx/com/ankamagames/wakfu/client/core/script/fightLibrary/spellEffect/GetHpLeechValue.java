package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import aZw;
import bYE;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetHpLeechValue extends SpellEffectActionFunction
{
  private static final String NAME = "getHpLeechValue";
  private static final String Vu = "Utilisable uniquement avec des effets de vol de vie (11,13,12,14,15) :\n Retourne la valeur de la vie volée";
  private static final bYE[] Vt = { new bYE("value", null, bxT.gja, false) };

  GetHpLeechValue(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getHpLeechValue";
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
    int i = 0;
    if ((this.kZA.bov() instanceof aZw)) {
      aZw localaZw = (aZw)this.kZA.bov();
      i = localaZw.bor();
    }
    Bz(i);
  }

  public String getDescription()
  {
    return "Utilisable uniquement avec des effets de vol de vie (11,13,12,14,15) :\n Retourne la valeur de la vie volée";
  }
}