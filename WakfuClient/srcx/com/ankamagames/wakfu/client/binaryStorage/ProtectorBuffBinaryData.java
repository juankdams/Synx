package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ProtectorBuffBinaryData
  implements drN
{
  protected int cpF;
  protected int aSg;
  protected String aRT;
  protected byte lZq;
  protected int[] bUC;

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
  public byte djH() {
    return this.lZq;
  }
  public int[] djI() {
    return this.bUC;
  }

  public void reset() {
    this.cpF = 0;
    this.aSg = 0;
    this.aRT = null;
    this.lZq = 0;
    this.bUC = null;
  }

  public void a(bUT parambUT) {
    this.cpF = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.lZq = parambUT.get();
    this.bUC = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.elQ.getId();
  }
}