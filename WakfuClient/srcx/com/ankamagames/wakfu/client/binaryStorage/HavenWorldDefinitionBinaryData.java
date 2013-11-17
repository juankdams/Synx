package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenWorldDefinitionBinaryData
  implements drN
{
  protected int aw;
  protected short az;
  protected byte dzE;
  protected short dzF;
  protected short dzG;
  protected short dzH;
  protected short dzI;

  public int getId()
  {
    return this.aw;
  }
  public short D() {
    return this.az;
  }
  public byte aDI() {
    return this.dzE;
  }
  public short aDJ() {
    return this.dzF;
  }
  public short aDK() {
    return this.dzG;
  }
  public short aDL() {
    return this.dzH;
  }
  public short aDM() {
    return this.dzI;
  }

  public void reset() {
    this.aw = 0;
    this.az = 0;
    this.dzE = 0;
    this.dzF = 0;
    this.dzG = 0;
    this.dzH = 0;
    this.dzI = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.az = parambUT.getShort();
    this.dzE = parambUT.get();
    this.dzF = parambUT.getShort();
    this.dzG = parambUT.getShort();
    this.dzH = parambUT.getShort();
    this.dzI = parambUT.getShort();
  }

  public final int gE() {
    return aKp.emJ.getId();
  }
}