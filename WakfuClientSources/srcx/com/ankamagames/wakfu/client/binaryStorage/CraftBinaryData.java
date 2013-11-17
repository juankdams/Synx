package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class CraftBinaryData
  implements drN
{
  protected int aHf;
  protected int kNt;
  protected float frL;
  protected boolean bYt;
  protected boolean kNu;
  protected boolean kNv;

  public int axX()
  {
    return this.aHf;
  }
  public int cMt() {
    return this.kNt;
  }
  public float bAz() {
    return this.frL;
  }
  public boolean Wk() {
    return this.bYt;
  }
  public boolean cMu() {
    return this.kNu;
  }
  public boolean cMv() {
    return this.kNv;
  }

  public void reset() {
    this.aHf = 0;
    this.kNt = 0;
    this.frL = 0.0F;
    this.bYt = false;
    this.kNu = false;
    this.kNv = false;
  }

  public void a(bUT parambUT) {
    this.aHf = parambUT.getInt();
    this.kNt = parambUT.getInt();
    this.frL = parambUT.getFloat();
    this.bYt = parambUT.readBoolean();
    this.kNu = parambUT.readBoolean();
    this.kNv = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.elk.getId();
  }
}