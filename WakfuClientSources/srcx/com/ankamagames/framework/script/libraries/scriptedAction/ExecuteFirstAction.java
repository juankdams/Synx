package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class ExecuteFirstAction extends ActionGroupFunction
{
  private static final String NAME = "executeFirstAction";
  private static final String Vu = "Execute la premiere action de type et d'id donné dans le groupe d'actions";
  private static final bYE[] Rf = { new bYE("actionType", null, bxT.gja, false), new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("actionExists", null, bxT.gjc, false) };

  ExecuteFirstAction(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "executeFirstAction";
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

    if (localbSR != null) {
      this.dGR.a(localbSR, false);
      kl(true);
    } else {
      kl(false);
    }
  }

  public String getDescription()
  {
    return "Execute la premiere action de type et d'id donné dans le groupe d'actions";
  }
}