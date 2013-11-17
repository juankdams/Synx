package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import dac;
import drN;
import nD;

public class CollectInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected short coT;
  protected boolean coU;
  protected int coV;
  protected dac[] kZZ;
  protected nD[] laa;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public short abQ() {
    return this.coT;
  }
  public boolean isLocked() {
    return this.coU;
  }
  public int abT() {
    return this.coV;
  }
  public dac[] cPq() {
    return this.kZZ;
  }
  public nD[] cPr() {
    return this.laa;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.coT = 0;
    this.coU = false;
    this.coV = 0;
    this.kZZ = null;
    this.laa = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.coT = parambUT.getShort();
    this.coU = parambUT.readBoolean();
    this.coV = parambUT.getInt();

    int i = parambUT.getInt();
    this.kZZ = new dac[i];
    for (int j = 0; j < i; j++) {
      this.kZZ[j] = new dac();
      this.kZZ[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.laa = new nD[j];
    for (int k = 0; k < j; k++) {
      this.laa[k] = new nD();
      this.laa[k].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elj.getId();
  }
}