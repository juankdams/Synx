package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cwb;
import drN;

public class CannonBinaryData
  implements drN
{
  protected int lIU;
  protected int Sk;
  protected int bHh;
  protected byte eWA;
  protected int RZ;
  protected int liX;
  protected cwb[] lIV;

  public int deE()
  {
    return this.lIU;
  }
  public int gC() {
    return this.Sk;
  }
  public int Mc() {
    return this.bHh;
  }
  public byte bjZ() {
    return this.eWA;
  }
  public int gw() {
    return this.RZ;
  }
  public int cTq() {
    return this.liX;
  }
  public cwb[] deF() {
    return this.lIV;
  }

  public void reset() {
    this.lIU = 0;
    this.Sk = 0;
    this.bHh = 0;
    this.eWA = 0;
    this.RZ = 0;
    this.liX = 0;
    this.lIV = null;
  }

  public void a(bUT parambUT) {
    this.lIU = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.bHh = parambUT.getInt();
    this.eWA = parambUT.get();
    this.RZ = parambUT.getInt();
    this.liX = parambUT.getInt();

    int i = parambUT.getInt();
    this.lIV = new cwb[i];
    for (int j = 0; j < i; j++) {
      this.lIV[j] = new cwb();
      this.lIV[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.ekZ.getId();
  }
}