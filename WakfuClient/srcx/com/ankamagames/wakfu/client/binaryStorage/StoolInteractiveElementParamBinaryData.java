package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class StoolInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected String Sj;
  protected int Sk;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public String gB() {
    return this.Sj;
  }
  public int gC() {
    return this.Sk;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.Sj = null;
    this.Sk = 0;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sj = parambUT.caP();
    this.Sk = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.eme.getId();
  }
}