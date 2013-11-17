package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DungeonDisplayerInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int eaH;

  public int getId()
  {
    return this.aw;
  }
  public int aRs() {
    return this.eaH;
  }

  public void reset() {
    this.aw = 0;
    this.eaH = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.eaH = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emE.getId();
  }
}