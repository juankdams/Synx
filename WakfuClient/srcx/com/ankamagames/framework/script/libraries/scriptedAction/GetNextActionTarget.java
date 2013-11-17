package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetNextActionTarget extends ActionGroupFunction
{
  private static final String NAME = "getNextActionTarget";
  private static final String Vu = "Retourne l'id de la cible de la prochaine action du groupe dont le type est l'id sont passés en paramètre";
  private static final bYE[] Rf = { new bYE("actionType", null, bxT.gja, false), new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("targetId", null, bxT.giY, false) };

  GetNextActionTarget(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "getNextActionTarget";
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
    int j = Br(1);

    bSR localbSR = this.dGR.Z(i, j);
    if (localbSR != null)
      kg(localbSR.gA());
    else
      kg(0L);
  }

  public String getDescription()
  {
    return "Retourne l'id de la cible de la prochaine action du groupe dont le type est l'id sont passés en paramètre";
  }
}