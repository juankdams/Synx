package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class NationRankBinaryData
  implements drN
{
  protected int aw;
  protected float bvi;
  protected String aRT;
  protected int bvj;

  public int getId()
  {
    return this.aw;
  }
  public float IO() {
    return this.bvi;
  }
  public String uL() {
    return this.aRT;
  }
  public int IP() {
    return this.bvj;
  }

  public void reset() {
    this.aw = 0;
    this.bvi = 0.0F;
    this.aRT = null;
    this.bvj = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bvi = parambUT.getFloat();
    this.aRT = parambUT.caP();
    this.bvj = parambUT.getInt();
  }

  public final int gE() {
    return aKp.elO.getId();
  }
}