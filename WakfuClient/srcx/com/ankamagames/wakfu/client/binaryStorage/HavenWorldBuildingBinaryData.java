package com.ankamagames.wakfu.client.binaryStorage;

import Wg;
import aKp;
import bUT;
import cgj;
import ctw;
import drN;

public class HavenWorldBuildingBinaryData
  implements drN
{
  protected int aw;
  protected short gTZ;
  protected int cxK;
  protected int hem;
  protected byte hen;
  protected byte dzE;
  protected int heo;
  protected boolean fBE;
  protected ctw[] hep;
  protected cgj[] heq;
  protected int[] aSX;
  protected Wg[] her;

  public int getId()
  {
    return this.aw;
  }
  public short bVJ() {
    return this.gTZ;
  }
  public int ahA() {
    return this.cxK;
  }
  public int bZB() {
    return this.hem;
  }
  public byte bZC() {
    return this.hen;
  }
  public byte aDI() {
    return this.dzE;
  }
  public int bcY() {
    return this.heo;
  }
  public boolean bvP() {
    return this.fBE;
  }
  public ctw[] bZD() {
    return this.hep;
  }
  public cgj[] bZE() {
    return this.heq;
  }
  public int[] vD() {
    return this.aSX;
  }
  public Wg[] bZF() {
    return this.her;
  }

  public void reset() {
    this.aw = 0;
    this.gTZ = 0;
    this.cxK = 0;
    this.hem = 0;
    this.hen = 0;
    this.dzE = 0;
    this.heo = 0;
    this.fBE = false;
    this.hep = null;
    this.heq = null;
    this.aSX = null;
    this.her = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.gTZ = parambUT.getShort();
    this.cxK = parambUT.getInt();
    this.hem = parambUT.getInt();
    this.hen = parambUT.get();
    this.dzE = parambUT.get();
    this.heo = parambUT.getInt();
    this.fBE = parambUT.readBoolean();

    int i = parambUT.getInt();
    this.hep = new ctw[i];
    for (int j = 0; j < i; j++) {
      this.hep[j] = new ctw();
      this.hep[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.heq = new cgj[j];
    for (int k = 0; k < j; k++) {
      this.heq[k] = new cgj();
      this.heq[k].a(parambUT);
    }

    this.aSX = parambUT.caR();

    k = parambUT.getInt();
    this.her = new Wg[k];
    for (int m = 0; m < k; m++) {
      this.her[m] = new Wg();
      this.her[m].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emL.getId();
  }
}