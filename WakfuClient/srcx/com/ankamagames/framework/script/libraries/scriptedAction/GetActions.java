package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetActions extends ActionGroupFunction
{
  private static final String NAME = "getActions";
  private static final String Vu = "Retourne des infos (uid, instigatorId, targetId) sur les actions du groupe";
  private static final bYE[] Rf = { new bYE("actionType", null, bxT.gja, false), new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("actions", null, bxT.gje, false) };

  GetActions(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "getActions";
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

    this.L.newTable();
    int k = 1;
    for (bSR localbSR : this.dGR.RG()) {
      if ((localbSR.eo() == j) && (localbSR.uK() == i)) {
        this.L.pushNumber(k++);
        this.L.newTable();

        this.L.pushString("uid");
        this.L.pushNumber(localbSR.bQX());
        this.L.setTable(-3);

        this.L.pushString("from");
        this.L.pushNumber(localbSR.bwv());
        this.L.setTable(-3);

        this.L.pushString("target");
        this.L.pushNumber(localbSR.gA());
        this.L.setTable(-3);

        this.L.setTable(-3);
      }
    }

    this.luy += 1;
  }

  public String getDescription()
  {
    return "Retourne des infos (uid, instigatorId, targetId) sur les actions du groupe";
  }
}