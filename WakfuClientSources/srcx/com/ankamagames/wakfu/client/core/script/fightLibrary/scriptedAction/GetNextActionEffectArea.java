package com.ankamagames.wakfu.client.core.script.fightLibrary.scriptedAction;

import aZI;
import bSR;
import bYE;
import bvm;
import bxT;
import com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect.GetEffectArea;
import dPD;
import dsg;
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

class GetNextActionEffectArea extends dsg
{
  private static final bYE[] hzT = { new bYE("actionId", null, bxT.gja, false) };

  private static final bYE[] hzU = { new bYE("targetId", null, bxT.gja, false) };
  private static final String NAME = "getNextActionEffectArea";
  private static final String Vu = "Permet de récupérer la liste des cellules de la zone d'un effet";
  private final bvm dGR;

  GetNextActionEffectArea(LuaState paramLuaState, bvm parambvm)
  {
    super(paramLuaState);
    this.dGR = parambvm;
  }

  public final String getName()
  {
    return "getNextActionEffectArea";
  }

  public final bYE[] ce()
  {
    return hzT;
  }

  public bYE[] cf()
  {
    return hzU;
  }

  public void S(int paramInt)
  {
    int i = dPD.mhg.bJ();
    int j = Br(0);

    bSR localbSR = this.dGR.Z(i, j);
    if (!(localbSR instanceof aZI)) {
      Bz(0);
      return;
    }

    Iterable localIterable = GetEffectArea.a((aZI)localbSR);
    if (localIterable == null) {
      Bz(0);
      return;
    }

    Iterator localIterator = localIterable.iterator();
    int k = 0;

    while (localIterator.hasNext()) {
      localIterator.next();
      k++;
    }

    Bz(k);

    localIterator = localIterable.iterator();

    this.L.newTable();

    int m = 1;
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();
      this.L.pushNumber(m++);

      this.L.newTable();

      this.L.pushString("x");
      this.L.pushNumber(arrayOfInt[0]);
      this.L.setTable(-3);

      this.L.pushString("y");
      this.L.pushNumber(arrayOfInt[1]);
      this.L.setTable(-3);

      this.L.setTable(-3);
    }

    this.luy += 1;
  }

  public String getDescription()
  {
    return "Permet de récupérer la liste des cellules de la zone d'un effet";
  }
}