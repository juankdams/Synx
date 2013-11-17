package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import cCX;
import cYk;
import doA;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

final class GetThrowEffectArrivalCell extends SpellEffectActionFunction
{
  private static final String NAME = "getThrowEffectArrivalCell";
  private static final String Vu = "Utilisable uniquement sur l'effet 333 \"Jette le personnage porté\" :\n retourne les coordonnées de la position d'arrivée du lancer";
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetThrowEffectArrivalCell(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getThrowEffectArrivalCell";
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
    doA localdoA = this.kZA.bov();
    if (localdoA == null) {
      throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet qui est null");
    }
    if (!(localdoA instanceof cCX)) {
      throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + localdoA.getClass().getSimpleName());
    }
    cYk localcYk = ((cCX)localdoA).qR();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Utilisable uniquement sur l'effet 333 \"Jette le personnage porté\" :\n retourne les coordonnées de la position d'arrivée du lancer";
  }
}