package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class ExecuteAction extends ActionGroupFunction
{
  private static final String NAME = "executeAction";
  private static final String Vu = "Force l'execution d'une action dont l'uid est passé en paramètre";
  private static final bYE[] Rf = { new bYE("actionUID", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("actionExists", null, bxT.gjc, false) };

  ExecuteAction(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "executeAction";
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

    bSR localbSR = this.dGR.fc(i);

    if (localbSR != null) {
      this.dGR.a(localbSR, false);
      kl(true);
    } else {
      kl(false);
    }
  }

  public String getDescription()
  {
    return "Force l'execution d'une action dont l'uid est passé en paramètre";
  }
}