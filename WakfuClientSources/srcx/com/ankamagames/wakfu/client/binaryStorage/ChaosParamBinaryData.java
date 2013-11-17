package com.ankamagames.wakfu.client.binaryStorage;

import bUT;
import drN;

public class ChaosParamBinaryData
  implements drN
{
  protected byte hTc;
  protected int hGX;

  public byte cnM()
  {
    return this.hTc;
  }
  public int ckc() {
    return this.hGX;
  }

  public void reset() {
    this.hTc = 0;
    this.hGX = 0;
  }

  public void a(bUT parambUT) {
    this.hTc = parambUT.get();
    this.hGX = parambUT.getInt();
  }

  public final int gE() {
    throw new UnsupportedOperationException();
  }
}