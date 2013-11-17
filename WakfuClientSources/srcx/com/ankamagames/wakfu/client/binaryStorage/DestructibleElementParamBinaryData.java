package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DestructibleElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int day;
  protected int daz;
  protected int daA;
  protected int daB;
  protected int daC;
  protected int daD;
  protected int[] aSX;

  public int getId()
  {
    return this.aw;
  }
  public int ash() {
    return this.day;
  }
  public int asi() {
    return this.daz;
  }
  public int asj() {
    return this.daA;
  }
  public int ask() {
    return this.daB;
  }
  public int asl() {
    return this.daC;
  }
  public int asm() {
    return this.daD;
  }
  public int[] vD() {
    return this.aSX;
  }

  public void reset() {
    this.aw = 0;
    this.day = 0;
    this.daz = 0;
    this.daA = 0;
    this.daB = 0;
    this.daC = 0;
    this.daD = 0;
    this.aSX = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.day = parambUT.getInt();
    this.daz = parambUT.getInt();
    this.daA = parambUT.getInt();
    this.daB = parambUT.getInt();
    this.daC = parambUT.getInt();
    this.daD = parambUT.getInt();
    this.aSX = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.eln.getId();
  }
}