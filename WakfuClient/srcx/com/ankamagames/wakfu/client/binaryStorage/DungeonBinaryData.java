package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DungeonBinaryData
  implements drN
{
  protected int aw;
  protected short bNX;
  protected short aSh;
  protected short TD;
  protected int[] ihq;

  public int getId()
  {
    return this.aw;
  }
  public short Qb() {
    return this.bNX;
  }
  public short nV() {
    return this.aSh;
  }
  public short Lk() {
    return this.TD;
  }
  public int[] ctD() {
    return this.ihq;
  }

  public void reset() {
    this.aw = 0;
    this.bNX = 0;
    this.aSh = 0;
    this.TD = 0;
    this.ihq = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bNX = parambUT.getShort();
    this.aSh = parambUT.getShort();
    this.TD = parambUT.getShort();
    this.ihq = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.enc.getId();
  }
}