package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class RecycleMachineInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int iaw;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int cpJ() {
    return this.iaw;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.iaw = 0;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.iaw = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.emu.getId();
  }
}