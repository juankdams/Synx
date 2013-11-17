package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ZaapBinaryData
  implements drN
{
  protected int kWO;
  protected int dah;
  protected int dai;
  protected int daj;
  protected int Sk;
  protected int bHh;
  protected byte eWA;
  protected boolean kWP;
  protected String kWQ;
  protected TravelLoadingBinaryData fiG;

  public int cOG()
  {
    return this.kWO;
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
  public boolean cOH() {
    return this.kWP;
  }
  public String cOI() {
    return this.kWQ;
  }
  public TravelLoadingBinaryData bpi() {
    return this.fiG;
  }

  public void reset() {
    this.kWO = 0;
    this.dah = 0;
    this.dai = 0;
    this.daj = 0;
    this.Sk = 0;
    this.bHh = 0;
    this.eWA = 0;
    this.kWP = false;
    this.kWQ = null;
    this.fiG = null;
  }

  public void a(bUT parambUT) {
    this.kWO = parambUT.getInt();
    this.dah = parambUT.getInt();
    this.dai = parambUT.getInt();
    this.daj = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.bHh = parambUT.getInt();
    this.eWA = parambUT.get();
    this.kWP = parambUT.readBoolean();
    this.kWQ = parambUT.caP();
    if (parambUT.get() != 0) {
      this.fiG = new TravelLoadingBinaryData();
      this.fiG.a(parambUT);
    } else {
      this.fiG = null;
    }
  }

  public final int gE()
  {
    return aKp.eml.getId();
  }
}