package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import CA;
import Su;
import aZI;
import bYE;
import bxT;
import ckc;
import cpX;
import org.keplerproject.luajava.LuaState;

final class RollEcaflipDice extends SpellEffectActionFunction
{
  private static final String NAME = "rollEcaflipDice";
  private static final String Vu = "Joue les visuels associés à un jet de dé Ecaflip";
  private static final bYE[] Rf = { new bYE("diceValue", null, bxT.gjb, false) };

  RollEcaflipDice(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "rollEcaflipDice";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  protected void S(int paramInt)
  {
    int i = Br(0);
    long l = this.kZA.gA();
    Su localSu = CA.Lv().bj(l);
    ckc localckc = cpX.hZN.hG(localSu.getId());
    localckc.dL((byte)i);
  }

  public String getDescription()
  {
    return "Joue les visuels associés à un jet de dé Ecaflip";
  }
}