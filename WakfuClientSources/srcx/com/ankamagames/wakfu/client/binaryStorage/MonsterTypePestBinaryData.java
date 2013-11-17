package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class MonsterTypePestBinaryData
  implements drN
{
  protected int aw;
  protected int aDH;
  protected int bqh;

  public int getId()
  {
    return this.aw;
  }
  public int nn() {
    return this.aDH;
  }
  public int GC() {
    return this.bqh;
  }

  public void reset() {
    this.aw = 0;
    this.aDH = 0;
    this.bqh = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aDH = parambUT.getInt();
    this.bqh = parambUT.getInt();
  }

  public final int gE() {
    return aKp.elJ.getId();
  }
}