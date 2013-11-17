package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aJD;
import bOX;
import bYE;
import bxT;
import cCq;
import cjK;
import ckT;
import dhy;
import dsg;
import org.keplerproject.luajava.LuaState;

final class SetEffectAreaPlayDeathAnim extends dsg
{
  private static final String NAME = "setEffectAreaPlayDeathAnim";
  private static final String Vu = "Active ou désactive l'anim de mort sur la zone dont l'uid est passé en paramètre";
  private static final bYE[] Rf = { new bYE("areaId", null, bxT.giY, false), new bYE("playAnim", null, bxT.gjc, false) };

  SetEffectAreaPlayDeathAnim(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "setEffectAreaPlayDeathAnim";
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
    long l = Bu(0);
    boolean bool = By(1);

    ckT localckT = bOX.bVM().mD();
    if (localckT == null) {
      return;
    }
    aJD localaJD = localckT.LC();
    if (localaJD == null) {
      return;
    }
    cjK localcjK = localaJD.eb(l);
    if (!(localcjK instanceof dhy)) {
      return;
    }
    ((dhy)localcjK).Uc().hT(bool);
  }

  public String getDescription()
  {
    return "Active ou désactive l'anim de mort sur la zone dont l'uid est passé en paramètre";
  }
}