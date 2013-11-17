package com.ankamagames.wakfu.client.binaryStorage;

import SI;
import aKp;
import bUT;
import drN;

public class StorageBoxBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected ChaosParamBinaryData Sl;
  protected SI[] evd;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }
  public SI[] bfp() {
    return this.evd;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.Sl = null;
    this.evd = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }

    int i = parambUT.getInt();
    this.evd = new SI[i];
    for (int j = 0; j < i; j++) {
      this.evd[j] = new SI();
      this.evd[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emf.getId();
  }
}