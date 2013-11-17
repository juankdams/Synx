package com.ankamagames.wakfu.client.binaryStorage;

import KE;
import aKp;
import bUT;
import drN;

public class DialogBinaryData
  implements drN
{
  protected int aw;
  protected String aRT;
  protected KE[] boG;

  public int getId()
  {
    return this.aw;
  }
  public String uL() {
    return this.aRT;
  }
  public KE[] FU() {
    return this.boG;
  }

  public void reset() {
    this.aw = 0;
    this.aRT = null;
    this.boG = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aRT = parambUT.caP();

    int i = parambUT.getInt();
    this.boG = new KE[i];
    for (int j = 0; j < i; j++) {
      this.boG[j] = new KE();
      this.boG[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elo.getId();
  }
}