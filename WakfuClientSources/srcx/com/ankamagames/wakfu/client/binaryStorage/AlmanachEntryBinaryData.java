package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AlmanachEntryBinaryData
  implements drN
{
  protected int aw;
  protected int aNN;
  protected int aPh;
  protected int[] gSQ;

  public int getId()
  {
    return this.aw;
  }
  public int se() {
    return this.aNN;
  }
  public int sY() {
    return this.aPh;
  }
  public int[] bVl() {
    return this.gSQ;
  }

  public void reset() {
    this.aw = 0;
    this.aNN = 0;
    this.aPh = 0;
    this.gSQ = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aNN = parambUT.getInt();
    this.aPh = parambUT.getInt();
    this.gSQ = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.emH.getId();
  }
}