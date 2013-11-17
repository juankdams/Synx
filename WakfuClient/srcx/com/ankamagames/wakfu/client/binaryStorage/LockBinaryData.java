package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;
import java.sql.Timestamp;

public class LockBinaryData
  implements drN
{
  protected int aw;
  protected int bXY;
  protected int aPG;
  protected long bXZ;
  protected Timestamp bYa;

  public int getId()
  {
    return this.aw;
  }

  public int VQ() {
    return this.bXY;
  }

  public int tt() {
    return this.aPG;
  }

  public long VR() {
    return this.bXZ;
  }

  public Timestamp VS() {
    return this.bYa;
  }

  public void reset() {
    this.aw = 0;
    this.bXY = 0;
    this.aPG = 0;
    this.bXZ = 0L;
    this.bYa = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bXY = parambUT.getInt();
    this.aPG = parambUT.getInt();
    this.bXZ = parambUT.getLong();
    this.bYa = new Timestamp(parambUT.getLong());
  }

  public final int gE() {
    return aKp.ene.getId();
  }
}