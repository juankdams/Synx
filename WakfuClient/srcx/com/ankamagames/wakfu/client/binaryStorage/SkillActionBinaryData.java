package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class SkillActionBinaryData
  implements drN
{
  protected int aw;
  protected int bjz;
  protected String bjA;
  protected int[] bjB;
  protected String bjC;

  public int getId()
  {
    return this.aw;
  }
  public int Eg() {
    return this.bjz;
  }
  public String Eh() {
    return this.bjA;
  }
  public int[] Ei() {
    return this.bjB;
  }
  public String Ej() {
    return this.bjC;
  }

  public void reset() {
    this.aw = 0;
    this.bjz = 0;
    this.bjA = null;
    this.bjB = null;
    this.bjC = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bjz = parambUT.getInt();
    this.bjA = parambUT.caP();
    this.bjB = parambUT.caR();

    this.bjC = parambUT.caP();
  }

  public final int gE() {
    return aKp.ema.getId();
  }
}