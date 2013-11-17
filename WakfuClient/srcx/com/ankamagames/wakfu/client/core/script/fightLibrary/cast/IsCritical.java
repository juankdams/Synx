package com.ankamagames.wakfu.client.core.script.fightLibrary.cast;

import bYE;
import bxT;
import cJs;
import org.keplerproject.luajava.LuaState;

final class IsCritical extends CastFunction
{
  private static final String NAME = "isCritical";
  private static final String Vu = "Permet de récupérer savoir si l'action a déclenché un coup critique";
  private static final bYE[] gdK = { new bYE("criticalHit", null, bxT.gjc, false) };

  IsCritical(LuaState paramLuaState, cJs paramcJs)
  {
    super(paramLuaState, paramcJs);
  }

  public String getName()
  {
    return "isCritical";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return gdK;
  }

  public void S(int paramInt)
  {
    kl(this.gPj.Iy());
  }

  public String getDescription()
  {
    return "Permet de récupérer savoir si l'action a déclenché un coup critique";
  }
}