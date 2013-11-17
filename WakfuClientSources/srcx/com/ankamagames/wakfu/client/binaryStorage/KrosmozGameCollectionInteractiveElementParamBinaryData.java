package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class KrosmozGameCollectionInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected byte fbG;

  public int getId()
  {
    return this.aw;
  }
  public byte bmk() {
    return this.fbG;
  }

  public void reset() {
    this.aw = 0;
    this.fbG = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.fbG = parambUT.get();
  }

  public final int gE() {
    return aKp.emS.getId();
  }
}