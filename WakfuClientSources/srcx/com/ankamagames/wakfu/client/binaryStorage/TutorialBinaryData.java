package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bCV;
import bUT;
import drN;

public class TutorialBinaryData
  implements drN
{
  protected int aw;
  protected bCV[] czp;

  public int getId()
  {
    return this.aw;
  }

  public bCV[] aik() {
    return this.czp;
  }

  public void reset() {
    this.aw = 0;
    this.czp = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.czp = new bCV[i];
    for (int j = 0; j < i; j++) {
      this.czp[j] = new bCV();
      this.czp[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.enn.getId();
  }
}