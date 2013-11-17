package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class MonsterTypeBinaryData
  implements drN
{
  protected int aw;
  protected int baB;
  protected byte bkM;

  public int getId()
  {
    return this.aw;
  }
  public int yS() {
    return this.baB;
  }
  public byte getType() {
    return this.bkM;
  }

  public void reset() {
    this.aw = 0;
    this.baB = 0;
    this.bkM = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.baB = parambUT.getInt();
    this.bkM = parambUT.get();
  }

  public final int gE() {
    return aKp.elI.getId();
  }
}