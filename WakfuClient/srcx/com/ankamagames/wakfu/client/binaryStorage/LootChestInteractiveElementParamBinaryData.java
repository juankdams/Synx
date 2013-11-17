package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class LootChestInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected int mqX;
  protected int aJA;
  protected int lVb;
  protected int lVc;
  protected boolean dnQ;
  protected int lVd;
  protected int mqY;
  protected String aRT;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public int dtV() {
    return this.mqX;
  }
  public int qW() {
    return this.aJA;
  }
  public int diN() {
    return this.lVb;
  }
  public int diO() {
    return this.lVc;
  }
  public boolean ayP() {
    return this.dnQ;
  }
  public int diQ() {
    return this.lVd;
  }
  public int dtW() {
    return this.mqY;
  }
  public String uL() {
    return this.aRT;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.mqX = 0;
    this.aJA = 0;
    this.lVb = 0;
    this.lVc = 0;
    this.dnQ = false;
    this.lVd = 0;
    this.mqY = 0;
    this.aRT = null;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.mqX = parambUT.getInt();
    this.aJA = parambUT.getInt();
    this.lVb = parambUT.getInt();
    this.lVc = parambUT.getInt();
    this.dnQ = parambUT.readBoolean();
    this.lVd = parambUT.getInt();
    this.mqY = parambUT.getInt();
    this.aRT = parambUT.caP();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.elz.getId();
  }
}