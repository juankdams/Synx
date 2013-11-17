package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cSR;
import drN;

public class ItemSetBinaryData
  implements drN
{
  protected short aDx;
  protected int dTC;
  protected int[] efQ;
  protected cSR efR;

  public short nc()
  {
    return this.aDx;
  }
  public int aTJ() {
    return this.dTC;
  }
  public int[] aTK() {
    return this.efQ;
  }
  public cSR aTL() {
    return this.efR;
  }

  public void reset() {
    this.aDx = 0;
    this.dTC = 0;
    this.efQ = null;
    this.efR = null;
  }

  public void a(bUT parambUT) {
    this.aDx = parambUT.getShort();
    this.dTC = parambUT.getInt();
    this.efQ = parambUT.caR();

    int i = parambUT.getInt();
    this.efR = new cSR(i);

    for (int k = 0; k < i; k++) {
      int j = parambUT.getInt();
      int[] arrayOfInt = parambUT.caR();

      this.efR.put(j, arrayOfInt);
    }
  }

  public final int gE()
  {
    return aKp.elx.getId();
  }
}