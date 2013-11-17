package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import alZ;
import bUT;
import drN;

public class GenericActivableInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected alZ[] cFk;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public alZ[] aiR() {
    return this.cFk;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.cFk = null;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.cFk = new alZ[i];
    for (int j = 0; j < i; j++) {
      this.cFk[j] = new alZ();
      this.cFk[j].a(parambUT);
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
    return aKp.els.getId();
  }
}