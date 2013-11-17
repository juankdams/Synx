package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import aRk;
import bUT;
import drN;

public class CitizenRankBinaryData
  implements drN
{
  protected int aw;
  protected int cuh;
  protected int dcH;
  protected String dcI;
  protected String dcJ;
  protected int[] kDW;

  public int getId()
  {
    return this.aw;
  }
  public int agg() {
    return this.cuh;
  }
  public int agh() {
    return this.dcH;
  }
  public String agf() {
    return this.dcI;
  }
  public String getColor() {
    return this.dcJ;
  }
  public int[] cIa() {
    return this.kDW;
  }
  public aRk[] cIb() {
    aRk[] arrayOfaRk = new aRk[this.kDW.length];
    for (int i = 0; i < this.kDW.length; i++) {
      arrayOfaRk[i] = aRk.nG(this.kDW[i]);
    }
    return arrayOfaRk;
  }

  public void reset()
  {
    this.aw = 0;
    this.cuh = 0;
    this.dcH = 0;
    this.dcI = null;
    this.dcJ = null;
    this.kDW = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.cuh = parambUT.getInt();
    this.dcH = parambUT.getInt();
    this.dcI = parambUT.caP();
    this.dcJ = parambUT.caP();
    this.kDW = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.ele.getId();
  }
}