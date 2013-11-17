package com.ankamagames.wakfu.client.binaryStorage;

import BI;
import aKp;
import bUT;
import btV;
import drN;

public class ProtectorEcosystemProtectionBinaryData
  implements drN
{
  protected int aGC;
  protected btV[] mun;
  protected BI[] muo;

  public int CB()
  {
    return this.aGC;
  }
  public btV[] dvp() {
    return this.mun;
  }
  public BI[] dvq() {
    return this.muo;
  }

  public void reset() {
    this.aGC = 0;
    this.mun = null;
    this.muo = null;
  }

  public void a(bUT parambUT) {
    this.aGC = parambUT.getInt();

    int i = parambUT.getInt();
    this.mun = new btV[i];
    for (int j = 0; j < i; j++) {
      this.mun[j] = new btV();
      this.mun[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.muo = new BI[j];
    for (int k = 0; k < j; k++) {
      this.muo[k] = new BI();
      this.muo[k].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elS.getId();
  }
}