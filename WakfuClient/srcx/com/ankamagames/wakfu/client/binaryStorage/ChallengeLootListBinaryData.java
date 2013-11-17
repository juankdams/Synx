package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bPt;
import bUT;
import drN;

public class ChallengeLootListBinaryData
  implements drN
{
  protected int aw;
  protected bPt[] gRs;

  public int getId()
  {
    return this.aw;
  }
  public bPt[] bUG() {
    return this.gRs;
  }

  public void reset() {
    this.aw = 0;
    this.gRs = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.gRs = new bPt[i];
    for (int j = 0; j < i; j++) {
      this.gRs[j] = new bPt();
      this.gRs[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emp.getId();
  }
}