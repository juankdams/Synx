package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import aZI;
import bYE;
import bbH;
import bxT;
import cYk;
import dle;
import doA;
import dpI;
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

public final class GetEffectArea extends SpellEffectActionFunction
{
  private static final String NAME = "getEffectArea";
  private static final String Vu = "Retourne un tableau contenant la liste des cellules (x,y) de l'aire d'effet de l'effet";
  private static final bYE[] Vt = { new bYE("cells", null, bxT.gja, false), new bYE("cells", null, bxT.gjd, true) };

  public GetEffectArea(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "getEffectArea";
  }

  public bYE[] ce()
  {
    return null;
  }

  public bYE[] cf()
  {
    return Vt;
  }

  public void S(int paramInt)
  {
    Iterable localIterable = a(this.kZA);
    if (localIterable == null) {
      Bz(0);
      return;
    }

    Iterator localIterator = localIterable.iterator();
    int i = 0;

    while (localIterator.hasNext()) {
      localIterator.next();
      i++;
    }

    Bz(i);

    localIterator = localIterable.iterator();

    this.L.newTable();

    int j = 1;
    while (localIterator.hasNext()) {
      int[] arrayOfInt = (int[])localIterator.next();
      this.L.pushNumber(j++);

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

  public static Iterable a(aZI paramaZI)
  {
    doA localdoA = paramaZI.bov();
    if (localdoA == null) {
      return null;
    }
    dpI localdpI = (dpI)localdoA.bkc();
    if (localdpI == null) {
      return null;
    }
    bbH localbbH = localdpI.aui();
    if (localbbH == null) {
      return null;
    }
    cYk localcYk = localdoA.bkg();
    dle localdle = localdoA.bke();
    Iterable localIterable;
    if (localdle != null) {
      localIterable = localbbH.b(localcYk.getX(), localcYk.getY(), localcYk.IB(), localdle.fa(), localdle.fb(), localcYk.IB(), localdle.E());
    }
    else
    {
      localIterable = localbbH.a(localcYk.getX(), localcYk.getY(), localcYk.IB(), localcYk.getX(), localcYk.getY(), localcYk.IB());
    }
    return localIterable;
  }

  public String getDescription()
  {
    return "Retourne un tableau contenant la liste des cellules (x,y) de l'aire d'effet de l'effet";
  }
}