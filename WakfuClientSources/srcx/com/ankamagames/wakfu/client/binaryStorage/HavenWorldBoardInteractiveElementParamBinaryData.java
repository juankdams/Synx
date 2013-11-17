package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenWorldBoardInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected short fbO;
  protected short fbP;
  protected short fbQ;
  protected short fbR;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public short bmp() {
    return this.fbO;
  }
  public short bmq() {
    return this.fbP;
  }
  public short bmr() {
    return this.fbQ;
  }
  public short bms() {
    return this.fbR;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.fbO = 0;
    this.fbP = 0;
    this.fbQ = 0;
    this.fbR = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.fbO = parambUT.getShort();
    this.fbP = parambUT.getShort();
    this.fbQ = parambUT.getShort();
    this.fbR = parambUT.getShort();
  }

  public final int gE() {
    return aKp.emU.getId();
  }
}