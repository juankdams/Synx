package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class ExecuteFirstActionWithSpecialId extends ActionGroupFunction
{
  private static final bYE[] Rf = { new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("actionExists", null, bxT.gjc, false) };
  private static final String NAME = "executeFirstActionWithSpecialId";
  private static final String Vu = "Execute la première action qui correspond à un effet dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";

  ExecuteFirstActionWithSpecialId(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "executeFirstActionWithSpecialId";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    bSR localbSR = this.dGR.ff(i);

    if (localbSR != null) {
      this.dGR.a(localbSR, false);
      kl(true);
    } else {
      kl(false);
    }
  }

  public String getDescription()
  {
    return "Execute la première action qui correspond à un effet dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";
  }
}