package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ZaapLinkBinaryData
  implements drN
{
  protected int aw;
  protected int aJy;
  protected int aJz;
  protected int aJA;

  public int getId()
  {
    return this.aw;
  }
  public int getStart() {
    return this.aJy;
  }
  public int qV() {
    return this.aJz;
  }
  public int qW() {
    return this.aJA;
  }

  public void reset() {
    this.aw = 0;
    this.aJy = 0;
    this.aJz = 0;
    this.aJA = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aJy = parambUT.getInt();
    this.aJz = parambUT.getInt();
    this.aJA = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emm.getId();
  }
}