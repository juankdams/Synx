package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ProtectorBuffListBinaryData
  implements drN
{
  protected int dhy;
  protected int[] icd;

  public int avK()
  {
    return this.dhy;
  }
  public int[] cqL() {
    return this.icd;
  }

  public void reset() {
    this.dhy = 0;
    this.icd = null;
  }

  public void a(bUT parambUT) {
    this.dhy = parambUT.getInt();
    this.icd = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.elR.getId();
  }
}