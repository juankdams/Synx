package com.ankamagames.wakfu.client.core.script.function.context;

import arl;
import bXf;
import bYE;
import bxT;
import byv;
import byz;
import dsg;
import org.keplerproject.luajava.LuaState;

public final class IsLocalPlayerInFight extends dsg
{
  public IsLocalPlayerInFight(LuaState paramLuaState)
  {
    super(paramLuaState);
  }

  public String getName()
  {
    return "isInFight";
  }

  public String getDescription()
  {
    return "Test si le localPlayer est en combat.";
  }

  public bYE[] ce()
  {
    return new bYE[] { new bYE("currentFight", "True si on veut tester que le joueur local appartient au combat courant", bxT.gjc, true) };
  }

  public final bYE[] cf()
  {
    return new bYE[] { new bYE("inFight", "True si le joueur local est en combat, false sinon", bxT.gjc, false) };
  }

  protected void S(int paramInt)
  {
    arl localarl = byv.bFN().bFO().bGv();
    if (localarl == null) {
      kl(false);
      return;
    }

    if ((paramInt == 1) && (By(0))) {
      kl(cYS().a() == localarl.getId());
      return;
    }

    kl(true);
  }
}