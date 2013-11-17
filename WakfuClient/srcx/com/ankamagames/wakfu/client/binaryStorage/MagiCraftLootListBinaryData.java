package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;
import uX;

public class MagiCraftLootListBinaryData
  implements drN
{
  protected int aw;
  protected uX[] hFD;

  public int getId()
  {
    return this.aw;
  }
  public uX[] cjs() {
    return this.hFD;
  }

  public void reset() {
    this.aw = 0;
    this.hFD = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.hFD = new uX[i];
    for (int j = 0; j < i; j++) {
      this.hFD[j] = new uX();
      this.hFD[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.enh.getId();
  }
}