package com.ankamagames.framework.script.libraries.scriptedAction;

import bSR;
import bYE;
import bvm;
import bxT;
import org.keplerproject.luajava.LuaState;

final class GetNextActionsTargets extends ActionGroupFunction
{
  private static final String NAME = "getNextActionsTargets";
  private static final String Vu = "Retourne un tableau contenant les ids des cibles des prochaines actions du groupe dont le type est l'id sont passés en paramètre";
  private static final bYE[] Rf = { new bYE("actionType", null, bxT.gja, false), new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] Vt = { new bYE("targetId", null, bxT.gjd, false) };

  GetNextActionsTargets(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState, parambvm);
  }

  public String getName()
  {
    return "getNextActionsTargets";
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
      if ((localbSR.eo() == j) && (localbSR.uK() == i))
      {
        this.L.pushNumber(k++);
        this.L.pushObjectValue(Long.valueOf(localbSR.gA()));
        this.L.setTable(-3);
      }
    }
    this.luy += 1;
  }

  public String getDescription()
  {
    return "Retourne un tableau contenant les ids des cibles des prochaines actions du groupe dont le type est l'id sont passés en paramètre";
  }
}