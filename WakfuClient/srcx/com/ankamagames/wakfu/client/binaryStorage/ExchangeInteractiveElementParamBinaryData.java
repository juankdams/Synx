package com.ankamagames.wakfu.client.binaryStorage;

import aHg;
import aKp;
import bUT;
import drN;

public class ExchangeInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int bFx;
  protected int iaw;
  protected byte iJI;
  protected aHg[] iJJ;
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
  public byte cEp() {
    return this.iJI;
  }
  public aHg[] cEq() {
    return this.iJJ;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.bFx = 0;
    this.iaw = 0;
    this.iJI = 0;
    this.iJJ = null;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bFx = parambUT.getInt();
    this.iaw = parambUT.getInt();
    this.iJI = parambUT.get();

    int i = parambUT.getInt();
    this.iJJ = new aHg[i];
    for (int j = 0; j < i; j++) {
      this.iJJ[j] = new aHg();
      this.iJJ[j].a(parambUT);
    }

    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.emr.getId();
  }
}