package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import agT;
import bUT;
import drN;
import il;

public class GroundBinaryData
  implements drN
{
  protected int aw;
  protected il Tn;
  protected agT To;

  public int getId()
  {
    return this.aw;
  }
  public il hi() {
    return this.Tn;
  }
  public agT hj() {
    return this.To;
  }

  public void reset() {
    this.aw = 0;
    this.Tn = null;
    this.To = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    int i = parambUT.getInt();
    this.Tn = new il(i);

    for (int k = 0; k < i; k++) {
      int j = parambUT.getInt();
      short s1 = parambUT.getShort();
      this.Tn.a(j, s1);
    }

    k = parambUT.getInt();
    this.To = new agT(k);

    for (int m = 0; m < k; m++) {
      short s2 = parambUT.getShort();
      short s3 = parambUT.getShort();
      this.To.m(s2, s3);
    }
  }

  public final int gE()
  {
    return aKp.elt.getId();
  }
}