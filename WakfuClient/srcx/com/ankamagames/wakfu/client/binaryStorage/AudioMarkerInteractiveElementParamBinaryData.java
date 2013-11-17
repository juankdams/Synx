package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AudioMarkerInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int bZN;
  protected boolean bZO;

  public int getId()
  {
    return this.aw;
  }
  public int WH() {
    return this.bZN;
  }
  public boolean ym() {
    return this.bZO;
  }

  public void reset() {
    this.aw = 0;
    this.bZN = 0;
    this.bZO = false;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bZN = parambUT.getInt();
    this.bZO = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.ekS.getId();
  }
}