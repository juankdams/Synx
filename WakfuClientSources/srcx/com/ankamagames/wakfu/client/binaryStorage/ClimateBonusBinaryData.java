package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ClimateBonusBinaryData
  implements drN
{
  protected int cpF;
  protected int aSg;
  protected String aRT;
  protected int aKS;
  protected short fBU;
  protected float fBV;
  protected float fBW;
  protected float fBX;

  public int acm()
  {
    return this.cpF;
  }
  public int oc() {
    return this.aSg;
  }
  public String uL() {
    return this.aRT;
  }
  public int getDuration() {
    return this.aKS;
  }
  public short bwc() {
    return this.fBU;
  }
  public float bwd() {
    return this.fBV;
  }
  public float bwe() {
    return this.fBW;
  }
  public float bwf() {
    return this.fBX;
  }

  public void reset() {
    this.cpF = 0;
    this.aSg = 0;
    this.aRT = null;
    this.aKS = 0;
    this.fBU = 0;
    this.fBV = 0.0F;
    this.fBW = 0.0F;
    this.fBX = 0.0F;
  }

  public void a(bUT parambUT) {
    this.cpF = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.aKS = parambUT.getInt();
    this.fBU = parambUT.getShort();
    this.fBV = parambUT.getFloat();
    this.fBW = parambUT.getFloat();
    this.fBX = parambUT.getFloat();
  }

  public final int gE() {
    return aKp.elh.getId();
  }
}