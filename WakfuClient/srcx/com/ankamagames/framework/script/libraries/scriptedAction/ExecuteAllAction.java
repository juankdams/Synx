package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class ExecuteAllAction extends ActionGroupFunction
{
  private static final String NAME = "executeAllAction";
  private static final String Vu = "Execute toutes les actions dont le type est l'id sont passés en paramètre";
  private static final bYE[] Rf = { new bYE("actionType", null, bxT.gja, false), new bYE("actionId", null, bxT.gja, false) };

  ExecuteAllAction(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "executeAllAction";
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
    int j = Br(1);

    bSR localbSR = this.dGR.Z(i, j);

    while (localbSR != null) {
      this.dGR.a(localbSR, false);
      localbSR = this.dGR.Z(i, j);
    }
  }

  public String getDescription()
  {
    return "Execute toutes les actions dont le type est l'id sont passés en paramètre";
  }
}