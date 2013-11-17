package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetNextActionWithSpecialIdTarget extends ActionGroupFunction
{
  private static final String NAME = "getNextActionWithSpecialIdTarget";
  private static final String Vu = "Retourne l'id de la cible de la prochaine action du groupe dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";
  private static final bYE[] Rf = { new bYE("specialId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("targetId", null, bxT.giY, false) };

  GetNextActionWithSpecialIdTarget(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "getNextActionWithSpecialIdTarget";
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
    if (localbSR != null)
      kg(localbSR.gA());
    else
      kg(0L);
  }

  public String getDescription()
  {
    return "Retourne l'id de la cible de la prochaine action du groupe dont l'id (id de l'effet, pas du type de l'effet) est passé en paramètre";
  }
}