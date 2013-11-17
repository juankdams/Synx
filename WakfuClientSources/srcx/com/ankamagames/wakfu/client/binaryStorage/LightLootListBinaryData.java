package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import bkD;
import drN;

public class LightLootListBinaryData
  implements drN
{
  protected int aw;
  protected bkD[] idS;

  public int getId()
  {
    return this.aw;
  }
  public bkD[] cri() {
    return this.idS;
  }

  public void reset() {
    this.aw = 0;
    this.idS = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.idS = new bkD[i];
    for (int j = 0; j < i; j++) {
      this.idS[j] = new bkD();
      this.idS[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emX.getId();
  }
}