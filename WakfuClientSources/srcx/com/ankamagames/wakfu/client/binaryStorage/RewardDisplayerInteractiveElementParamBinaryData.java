package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class RewardDisplayerInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int[] btR;

  public int getId()
  {
    return this.aw;
  }
  public int[] HY() {
    return this.btR;
  }

  public void reset() {
    this.aw = 0;
    this.btR = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.btR = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.emF.getId();
  }
}