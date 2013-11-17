package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class MonsterTypeRelashionshipBinaryData
  implements drN
{
  protected int aw;
  protected int fMQ;
  protected int fMR;

  public int getId()
  {
    return this.aw;
  }
  public int bzP() {
    return this.fMQ;
  }
  public int bzQ() {
    return this.fMR;
  }

  public void reset() {
    this.aw = 0;
    this.fMQ = 0;
    this.fMR = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.fMQ = parambUT.getInt();
    this.fMR = parambUT.getInt();
  }

  public final int gE() {
    return aKp.elK.getId();
  }
}