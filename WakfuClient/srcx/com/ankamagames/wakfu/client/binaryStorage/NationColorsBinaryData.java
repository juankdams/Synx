package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class NationColorsBinaryData
  implements drN
{
  protected int aw;
  protected String dcJ;

  public int getId()
  {
    return this.aw;
  }
  public String getColor() {
    return this.dcJ;
  }

  public void reset() {
    this.aw = 0;
    this.dcJ = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dcJ = parambUT.caP();
  }

  public final int gE() {
    return aKp.elM.getId();
  }
}