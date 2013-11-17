package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BoatBinaryData
  implements drN
{
  protected int eWz;
  protected int dah;
  protected int dai;
  protected int daj;
  protected int Sk;
  protected int bHh;
  protected byte eWA;

  public int bjY()
  {
    return this.eWz;
  }
  public int arR() {
    return this.dah;
  }
  public int arS() {
    return this.dai;
  }
  public int arT() {
    return this.daj;
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

  public void reset() {
    this.eWz = 0;
    this.dah = 0;
    this.dai = 0;
    this.daj = 0;
    this.Sk = 0;
    this.bHh = 0;
    this.eWA = 0;
  }

  public void a(bUT parambUT) {
    this.eWz = parambUT.getInt();
    this.dah = parambUT.getInt();
    this.dai = parambUT.getInt();
    this.daj = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.bHh = parambUT.getInt();
    this.eWA = parambUT.get();
  }

  public final int gE() {
    return aKp.ekV.getId();
  }
}