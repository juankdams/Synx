package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ClimateBonusListBinaryData
  implements drN
{
  protected int dhy;
  protected int[] hry;

  public int avK()
  {
    return this.dhy;
  }
  public int[] ceP() {
    return this.hry;
  }

  public void reset() {
    this.dhy = 0;
    this.hry = null;
  }

  public void a(bUT parambUT) {
    this.dhy = parambUT.getInt();
    this.hry = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.eli.getId();
  }
}