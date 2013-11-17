package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class InteractiveElementModelBinaryData
  implements drN
{
  protected int aw;
  protected short dYr;
  protected int aTm;
  protected int dui;
  protected byte io;
  protected int cOu;
  protected int dMv;

  public int getId()
  {
    return this.aw;
  }
  public short getType() {
    return this.dYr;
  }
  public int ajB() {
    return this.aTm;
  }
  public int aBc() {
    return this.dui;
  }
  public byte bY() {
    return this.io;
  }
  public int ant() {
    return this.cOu;
  }
  public int aPJ() {
    return this.dMv;
  }

  public void reset() {
    this.aw = 0;
    this.dYr = 0;
    this.aTm = 0;
    this.dui = 0;
    this.io = 0;
    this.cOu = 0;
    this.dMv = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dYr = parambUT.getShort();
    this.aTm = parambUT.getInt();
    this.dui = parambUT.getInt();
    this.io = parambUT.get();
    this.cOu = parambUT.getInt();
    this.dMv = parambUT.getInt();
  }

  public final int gE() {
    return aKp.elv.getId();
  }
}