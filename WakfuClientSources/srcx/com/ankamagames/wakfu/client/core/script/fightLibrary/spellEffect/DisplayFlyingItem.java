package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import CA;
import Su;
import aZI;
import arl;
import bYE;
import byv;
import byz;
import cYk;
import dtY;
import mu;
import org.keplerproject.luajava.LuaState;

final class DisplayFlyingItem extends SpellEffectActionFunction
{
  private static final String NAME = "displayFlyingItem";
  private static final String Vu = "Affiche le gfx d'un item au dessus de la cible de l'effet (le refId de l'item correspond à la valeur de l'effet)";

  DisplayFlyingItem(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "displayFlyingItem";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = this.kZA.are();

    long l = this.kZA.gA();
    Su localSu = CA.Lv().bj(l);
    byz localbyz = byv.bFN().bFO();
    cYk localcYk;
    if (localSu != null)
      localcYk = localSu.ML();
    else {
      localcYk = this.kZA.ML();
    }
    arl localarl = localbyz.bGv();
    if ((localarl != null) && (this.kZA.a() != localarl.getId())) {
      return;
    }
    if (localcYk == null) {
      return;
    }
    dtY.a(i, new mu(localcYk), localSu.xK());
  }

  public String getDescription()
  {
    return "Affiche le gfx d'un item au dessus de la cible de l'effet (le refId de l'item correspond à la valeur de l'effet)";
  }
}