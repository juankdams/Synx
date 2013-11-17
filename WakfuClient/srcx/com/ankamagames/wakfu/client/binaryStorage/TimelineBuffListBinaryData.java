package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class TimelineBuffListBinaryData
  implements drN
{
  protected int aw;
  protected int aWH;
  protected int aSg;
  protected int[] aSX;

  public int getId()
  {
    return this.aw;
  }
  public int xj() {
    return this.aWH;
  }
  public int oc() {
    return this.aSg;
  }
  public int[] vD() {
    return this.aSX;
  }

  public void reset() {
    this.aw = 0;
    this.aWH = 0;
    this.aSg = 0;
    this.aSX = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aWH = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.aSX = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.emi.getId();
  }
}