package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import agl;
import avO;
import bYE;
import bxT;
import doA;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

final class GetMover extends SpellEffectActionFunction
{
  private static final String NAME = "getMover";
  private static final String Vu = "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne l'id du personnage déplacé";
  private static final bYE[] Vt = { new bYE("moverId", null, bxT.giY, false) };

  GetMover(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getMover";
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
    agl localagl = ((avO)localdoA).aAx();
    if (localagl != null)
      kg(localagl.getId());
    else
      kg(-1L);
  }

  public String getDescription()
  {
    return "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne l'id du personnage déplacé";
  }
}