package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BackgroundInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected int btO;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public int HX() {
    return this.btO;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.btO = 0;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.btO = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.ekU.getId();
  }
}