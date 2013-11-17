package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DragoBinaryData
  implements drN
{
  protected int fiF;
  protected int dah;
  protected int dai;
  protected int Sk;
  protected int bHh;
  protected byte eWA;
  protected TravelLoadingBinaryData fiG;

  public int bph()
  {
    return this.fiF;
  }
  public int arR() {
    return this.dah;
  }
  public int arS() {
    return this.dai;
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
  public TravelLoadingBinaryData bpi() {
    return this.fiG;
  }

  public void reset() {
    this.fiF = 0;
    this.dah = 0;
    this.dai = 0;
    this.Sk = 0;
    this.bHh = 0;
    this.eWA = 0;
    this.fiG = null;
  }

  public void a(bUT parambUT) {
    this.fiF = parambUT.getInt();
    this.dah = parambUT.getInt();
    this.dai = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.bHh = parambUT.getInt();
    this.eWA = parambUT.get();
    if (parambUT.get() != 0) {
      this.fiG = new TravelLoadingBinaryData();
      this.fiG.a(parambUT);
    } else {
      this.fiG = null;
    }
  }

  public final int gE()
  {
    return aKp.elp.getId();
  }
}