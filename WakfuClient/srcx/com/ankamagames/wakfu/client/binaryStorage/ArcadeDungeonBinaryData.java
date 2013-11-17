package com.ankamagames.wakfu.client.binaryStorage;

import E;
import aKp;
import bP;
import bUT;
import drN;
import fH;

public class ArcadeDungeonBinaryData
  implements drN
{
  protected int aw;
  protected short az;
  protected E[] lRe;
  protected bP[] lRf;
  protected fH[] lRg;
  protected int lRh;
  protected int lRi;

  public int getId()
  {
    return this.aw;
  }
  public short D() {
    return this.az;
  }
  public E[] dhu() {
    return this.lRe;
  }
  public bP[] dhv() {
    return this.lRf;
  }
  public fH[] dhw() {
    return this.lRg;
  }
  public int dhx() {
    return this.lRh;
  }
  public int dhy() {
    return this.lRi;
  }

  public void reset() {
    this.aw = 0;
    this.az = 0;
    this.lRe = null;
    this.lRf = null;
    this.lRg = null;
    this.lRh = 0;
    this.lRi = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.az = parambUT.getShort();

    int i = parambUT.getInt();
    this.lRe = new E[i];
    for (int j = 0; j < i; j++) {
      this.lRe[j] = new E();
      this.lRe[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.lRf = new bP[j];
    for (int k = 0; k < j; k++) {
      this.lRf[k] = new bP();
      this.lRf[k].a(parambUT);
    }

    k = parambUT.getInt();
    this.lRg = new fH[k];
    for (int m = 0; m < k; m++) {
      this.lRg[m] = new fH();
      this.lRg[m].a(parambUT);
    }

    this.lRh = parambUT.getInt();
    this.lRi = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emw.getId();
  }
}