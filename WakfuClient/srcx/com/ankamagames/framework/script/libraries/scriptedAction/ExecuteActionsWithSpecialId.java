package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class ExecuteActionsWithSpecialId extends ActionGroupFunction
{
  private static final String NAME = "executeActionsWithSpecialId";
  private static final String Vu = "Execute toutes les actions qui correspondent à un effet dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";
  private static final bYE[] Rf = { new bYE("actionId", null, bxT.gja, false) };

  ExecuteActionsWithSpecialId(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "executeActionsWithSpecialId";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    int i = Br(0);
    bSR localbSR = this.dGR.ff(i);

    while (localbSR != null) {
      this.dGR.a(localbSR, false);
      localbSR = this.dGR.ff(i);
    }
  }

  public String getDescription()
  {
    return "Execute toutes les actions qui correspondent à un effet dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";
  }
}