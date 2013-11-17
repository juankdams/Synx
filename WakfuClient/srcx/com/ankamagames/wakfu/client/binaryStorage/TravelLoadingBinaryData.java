package com.ankamagames.wakfu.client.binaryStorage;

import bUT;
import drN;

public class TravelLoadingBinaryData
  implements drN
{
  protected String cPL;
  protected int cPM;
  protected int cPN;
  protected int cPO;

  public String anO()
  {
    return this.cPL;
  }
  public int anP() {
    return this.cPM;
  }
  public int anQ() {
    return this.cPN;
  }
  public int anR() {
    return this.cPO;
  }

  public void reset() {
    this.cPL = null;
    this.cPM = 0;
    this.cPN = 0;
    this.cPO = 0;
  }

  public void a(bUT parambUT) {
    this.cPL = parambUT.caP();
    this.cPM = parambUT.getInt();
    this.cPN = parambUT.getInt();
    this.cPO = parambUT.getInt();
  }

  public final int gE() {
    throw new UnsupportedOperationException();
  }
}