package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bxT;
import cYk;
import org.keplerproject.luajava.LuaState;

final class GetTargetCell extends SpellEffectActionFunction
{
  private static final String NAME = "getTargetCell";
  private static final String Vu = "Retourne les coordonnées de la cellule cible de l'effet";
  private static final bYE[] Vt = { new bYE("posX", null, bxT.gja, false), new bYE("posY", null, bxT.gja, false), new bYE("posZ", null, bxT.gja, false) };

  GetTargetCell(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getTargetCell";
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
    cYk localcYk = this.kZA.bkg();
    if (localcYk == null) {
      return;
    }
    Bz(localcYk.getX());
    Bz(localcYk.getY());
    Bz(localcYk.IB());
  }

  public String getDescription()
  {
    return "Retourne les coordonnées de la cellule cible de l'effet";
  }
}