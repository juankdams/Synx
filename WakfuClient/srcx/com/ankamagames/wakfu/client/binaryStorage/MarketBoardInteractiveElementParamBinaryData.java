package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class MarketBoardInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int iaw;
  protected int djr;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int cpJ() {
    return this.iaw;
  }
  public int axd() {
    return this.djr;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.iaw = 0;
    this.djr = 0;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.iaw = parambUT.getInt();
    this.djr = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.elC.getId();
  }
}