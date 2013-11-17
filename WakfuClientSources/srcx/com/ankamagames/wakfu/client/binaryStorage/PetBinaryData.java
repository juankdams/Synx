package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import axv;
import bLu;
import bUT;
import dJr;
import doa;
import drN;
import due;

public class PetBinaryData
  implements drN
{
  protected int aw;
  protected int dFY;
  protected int aSg;
  protected int dFZ;
  protected int bvH;
  protected long dGa;
  protected long dGb;
  protected byte dGc;
  protected long dGd;
  protected byte dGe;
  protected byte dGf;
  protected short dGg;
  protected short cMS;
  protected bLu[] dGh;
  protected due[] dGi;
  protected dJr[] dGj;
  protected doa[] dGk;
  protected int[] dGl;
  protected axv[] dGm;

  public int getId()
  {
    return this.aw;
  }
  public int aFY() {
    return this.dFY;
  }
  public int oc() {
    return this.aSg;
  }
  public int aFZ() {
    return this.dFZ;
  }
  public int aGa() {
    return this.bvH;
  }
  public long aGb() {
    return this.dGa;
  }
  public long aGc() {
    return this.dGb;
  }
  public byte aGd() {
    return this.dGc;
  }
  public long aGe() {
    return this.dGd;
  }
  public byte aGf() {
    return this.dGe;
  }
  public byte aGg() {
    return this.dGf;
  }
  public short aGh() {
    return this.dGg;
  }
  public short alN() {
    return this.cMS;
  }
  public bLu[] aGi() {
    return this.dGh;
  }
  public due[] aGj() {
    return this.dGi;
  }
  public dJr[] aGk() {
    return this.dGj;
  }
  public doa[] aGl() {
    return this.dGk;
  }
  public int[] aGm() {
    return this.dGl;
  }
  public axv[] aGn() {
    return this.dGm;
  }

  public void reset() {
    this.aw = 0;
    this.dFY = 0;
    this.aSg = 0;
    this.dFZ = 0;
    this.bvH = 0;
    this.dGa = 0L;
    this.dGb = 0L;
    this.dGc = 0;
    this.dGd = 0L;
    this.dGe = 0;
    this.dGf = 0;
    this.dGg = 0;
    this.cMS = 0;
    this.dGh = null;
    this.dGi = null;
    this.dGj = null;
    this.dGk = null;
    this.dGl = null;
    this.dGm = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dFY = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.dFZ = parambUT.getInt();
    this.bvH = parambUT.getInt();
    this.dGa = parambUT.getLong();
    this.dGb = parambUT.getLong();
    this.dGc = parambUT.get();
    this.dGd = parambUT.getLong();
    this.dGe = parambUT.get();
    this.dGf = parambUT.get();
    this.dGg = parambUT.getShort();
    this.cMS = parambUT.getShort();

    int i = parambUT.getInt();
    this.dGh = new bLu[i];
    for (int j = 0; j < i; j++) {
      this.dGh[j] = new bLu();
      this.dGh[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.dGi = new due[j];
    for (int k = 0; k < j; k++) {
      this.dGi[k] = new due();
      this.dGi[k].a(parambUT);
    }

    k = parambUT.getInt();
    this.dGj = new dJr[k];
    for (int m = 0; m < k; m++) {
      this.dGj[m] = new dJr();
      this.dGj[m].a(parambUT);
    }

    m = parambUT.getInt();
    this.dGk = new doa[m];
    for (int n = 0; n < m; n++) {
      this.dGk[n] = new doa();
      this.dGk[n].a(parambUT);
    }

    this.dGl = parambUT.caR();

    n = parambUT.getInt();
    this.dGm = new axv[n];
    for (int i1 = 0; i1 < n; i1++) {
      this.dGm[i1] = new axv();
      this.dGm[i1].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.ena.getId();
  }
}