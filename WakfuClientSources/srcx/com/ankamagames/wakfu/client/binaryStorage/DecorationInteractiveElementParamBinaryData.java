package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DecorationInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int[] cHR;

  public int getId()
  {
    return this.aw;
  }
  public int[] aju() {
    return this.cHR;
  }

  public void reset() {
    this.aw = 0;
    this.cHR = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.cHR = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.elm.getId();
  }
}