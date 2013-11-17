package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class EffectGroupBinaryData
  implements drN
{
  protected int aw;
  protected int[] aSX;

  public int getId()
  {
    return this.aw;
  }
  public int[] vD() {
    return this.aSX;
  }

  public void reset() {
    this.aw = 0;
    this.aSX = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aSX = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.elq.getId();
  }
}