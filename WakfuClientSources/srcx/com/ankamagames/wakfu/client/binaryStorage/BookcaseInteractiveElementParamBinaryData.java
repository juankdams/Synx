package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BookcaseInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected byte dMr;

  public int getId()
  {
    return this.aw;
  }
  public byte aIO() {
    return this.dMr;
  }

  public void reset() {
    this.aw = 0;
    this.dMr = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dMr = parambUT.get();
  }

  public final int gE() {
    return aKp.emO.getId();
  }
}