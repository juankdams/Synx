package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class CraftInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int bFx;
  protected int iaw;
  protected int bVc;
  protected int[] isE;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int LI() {
    return this.bFx;
  }
  public int cpJ() {
    return this.iaw;
  }
  public int Uq() {
    return this.bVc;
  }
  public int[] cxE() {
    return this.isE;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.bFx = 0;
    this.iaw = 0;
    this.bVc = 0;
    this.isE = null;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bFx = parambUT.getInt();
    this.iaw = parambUT.getInt();
    this.bVc = parambUT.getInt();
    this.isE = parambUT.caR();

    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.ell.getId();
  }
}