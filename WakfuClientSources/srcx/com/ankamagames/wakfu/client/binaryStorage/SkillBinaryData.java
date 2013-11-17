package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class SkillBinaryData
  implements drN
{
  protected int aw;
  protected int aGs;
  protected int aSf;
  protected int bjz;
  protected String bjA;
  protected String bjC;
  protected int[] caN;
  protected int[] bjB;
  protected int bYs;
  protected boolean caO;

  public int getId()
  {
    return this.aw;
  }
  public int getType() {
    return this.aGs;
  }
  public int uN() {
    return this.aSf;
  }
  public int Eg() {
    return this.bjz;
  }
  public String Eh() {
    return this.bjA;
  }
  public String Ej() {
    return this.bjC;
  }
  public int[] Xu() {
    return this.caN;
  }
  public int[] Ei() {
    return this.bjB;
  }
  public int PY() {
    return this.bYs;
  }
  public boolean Wk() {
    return this.caO;
  }

  public void reset() {
    this.aw = 0;
    this.aGs = 0;
    this.aSf = 0;
    this.bjz = 0;
    this.bjA = null;
    this.bjC = null;
    this.caN = null;
    this.bjB = null;
    this.bYs = 0;
    this.caO = false;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.aSf = parambUT.getInt();
    this.bjz = parambUT.getInt();
    this.bjA = parambUT.caP();
    this.bjC = parambUT.caP();
    this.caN = parambUT.caR();

    this.bjB = parambUT.caR();

    this.bYs = parambUT.getInt();
    this.caO = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.elZ.getId();
  }
}