package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import cYk;
import org.keplerproject.luajava.LuaState;

final class GetPosition extends SpellEffectActionFunction
{
  private static final String NAME = "getPosition";
  private static final String Vu = "Retourne les coordonnées de la position de la cible de l'effet si elle existe, sinon retourne celles de la cellule cible";
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetPosition(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getPosition";
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
    cYk localcYk = this.kZA.ML();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Retourne les coordonnées de la position de la cible de l'effet si elle existe, sinon retourne celles de la cellule cible";
  }
}