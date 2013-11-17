package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cVl;
import drN;

public class BackgroundFeedbackBinaryData
  implements drN
{
  protected int aw;
  protected short dYr;
  protected cVl[] kSq;

  public int getId()
  {
    return this.aw;
  }
  public short getType() {
    return this.dYr;
  }
  public cVl[] cMK() {
    return this.kSq;
  }

  public void reset() {
    this.aw = 0;
    this.dYr = 0;
    this.kSq = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dYr = parambUT.getShort();

    int i = parambUT.getInt();
    this.kSq = new cVl[i];
    for (int j = 0; j < i; j++) {
      this.kSq[j] = new cVl();
      this.kSq[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.ekT.getId();
  }
}