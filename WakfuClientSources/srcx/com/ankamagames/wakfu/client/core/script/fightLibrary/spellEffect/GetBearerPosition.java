package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import cYk;
import org.keplerproject.luajava.LuaState;

final class GetBearerPosition extends SpellEffectActionFunction
{
  private static final String NAME = "getBearerPosition";
  private static final String Vu = "Retourne les coordonnées de la position du porteur de l'effet (le propriétaire du manager d'effet dans lequel est stocké l'effet)";
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetBearerPosition(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getBearerPosition";
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
    cYk localcYk = this.kZA.box();
    if (localcYk == null)
      return;
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Retourne les coordonnées de la position du porteur de l'effet (le propriétaire du manager d'effet dans lequel est stocké l'effet)";
  }
}