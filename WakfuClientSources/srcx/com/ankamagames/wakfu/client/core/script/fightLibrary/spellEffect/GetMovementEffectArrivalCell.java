package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import avO;
import bYE;
import bxT;
import cYk;
import doA;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

final class GetMovementEffectArrivalCell extends SpellEffectActionFunction
{
  private static final String NAME = "getMovementEffectArrivalCell";
  private static final String Vu = "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne les coordonnées de la cellule d'arrivée du mouvement";
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetMovementEffectArrivalCell(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getMovementEffectArrivalCell";
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
    if (!(localdoA instanceof avO)) {
      throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + localdoA.getClass().getSimpleName());
    }
    cYk localcYk = ((avO)localdoA).qR();
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne les coordonnées de la cellule d'arrivée du mouvement";
  }
}