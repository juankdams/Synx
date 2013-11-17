package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class TreasureBinaryData
  implements drN
{
  protected int aw;
  protected int dLw;
  protected int dLx;
  protected short aFe;
  protected int dLy;
  protected int dLz;
  protected int aKS;
  protected String Sj;
  protected float kDE;

  public int getId()
  {
    return this.aw;
  }
  public int aIh() {
    return this.dLw;
  }
  public int aIi() {
    return this.dLx;
  }
  public short nP() {
    return this.aFe;
  }
  public int aIj() {
    return this.dLy;
  }
  public int aIk() {
    return this.dLz;
  }
  public int getDuration() {
    return this.aKS;
  }
  public String gB() {
    return this.Sj;
  }
  public float cHQ() {
    return this.kDE;
  }

  public void reset() {
    this.aw = 0;
    this.dLw = 0;
    this.dLx = 0;
    this.aFe = 0;
    this.dLy = 0;
    this.dLz = 0;
    this.aKS = 0;
    this.Sj = null;
    this.kDE = 0.0F;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dLw = parambUT.getInt();
    this.dLx = parambUT.getInt();
    this.aFe = parambUT.getShort();
    this.dLy = parambUT.getInt();
    this.dLz = parambUT.getInt();
    this.aKS = parambUT.getInt();
    this.Sj = parambUT.caP();
    this.kDE = parambUT.getFloat();
  }

  public final int gE() {
    return aKp.eng.getId();
  }
}