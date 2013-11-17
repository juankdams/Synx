package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BoardInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;

  public int getId()
  {
    return this.aw;
  }

  public void reset() {
    this.aw = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emo.getId();
  }
}