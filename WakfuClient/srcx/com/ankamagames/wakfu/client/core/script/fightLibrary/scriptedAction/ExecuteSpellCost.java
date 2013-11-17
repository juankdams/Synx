package com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction;

import bSR;
import bYE;
import bsj;
import bvm;
import bxT;
import dPD;
import dkF;
import dsg;
import java.util.List;
import org.keplerproject.luajava.LuaState;

class ExecuteSpellCost extends dsg
{
  private static final int TYPE = dPD.mhg.bJ();
  private static final String NAME = "executeSpellCost";
  private static final String Vu = "Execute les effets de type ActionCost présents dans le groupe d'actions";
  private final bvm dGR;

  public ExecuteSpellCost(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState);
    this.dGR = parambvm;
  }

  public final String getName()
  {
    return "executeSpellCost";
  }

  public final bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return new bYE[] { new bYE("actionExists", null, bxT.gjc, false) };
  }

  public final void S(int paramInt)
  {
    boolean bool = false;
    bSR[] arrayOfbSR1 = new bSR[this.dGR.RG().size()];
    this.dGR.RG().toArray(arrayOfbSR1);
    for (bSR localbSR : arrayOfbSR1) {
      if (localbSR.uK() == TYPE)
      {
        int k = localbSR.eo();
        if (k == bsj.fOX.getId()) {
          this.dGR.a(localbSR, false);
          bool = true;
        }
      }
    }
    kl(bool);
  }

  public String getDescription()
  {
    return "Execute les effets de type ActionCost présents dans le groupe d'actions";
  }
}