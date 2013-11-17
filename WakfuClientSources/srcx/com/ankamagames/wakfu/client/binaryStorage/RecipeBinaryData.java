package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bTQ;
import bUT;
import drN;
import pZ;

public class RecipeBinaryData
  implements drN
{
  protected int aw;
  protected int efE;
  protected long ctZ;
  protected String aRT;
  protected int aQF;
  protected int[] bdS;
  protected int iBE;
  protected int[] iGq;
  protected pZ[] iGr;
  protected bTQ[] iGs;

  public int getId()
  {
    return this.aw;
  }
  public int aTz() {
    return this.efE;
  }
  public long getDuration() {
    return this.ctZ;
  }
  public String uL() {
    return this.aRT;
  }
  public int getLevel() {
    return this.aQF;
  }
  public int[] Bz() {
    return this.bdS;
  }
  public int cBw() {
    return this.iBE;
  }
  public int[] cCH() {
    return this.iGq;
  }
  public pZ[] cCI() {
    return this.iGr;
  }
  public bTQ[] cCJ() {
    return this.iGs;
  }

  public void reset() {
    this.aw = 0;
    this.efE = 0;
    this.ctZ = 0L;
    this.aRT = null;
    this.aQF = 0;
    this.bdS = null;
    this.iBE = 0;
    this.iGq = null;
    this.iGr = null;
    this.iGs = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.efE = parambUT.getInt();
    this.ctZ = parambUT.getLong();
    this.aRT = parambUT.caP();
    this.aQF = parambUT.getInt();
    this.bdS = parambUT.caR();

    this.iBE = parambUT.getInt();
    this.iGq = parambUT.caR();

    int i = parambUT.getInt();
    this.iGr = new pZ[i];
    for (int j = 0; j < i; j++) {
      this.iGr[j] = new pZ();
      this.iGr[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.iGs = new bTQ[j];
    for (int k = 0; k < j; k++) {
      this.iGs[k] = new bTQ();
      this.iGs[k].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elT.getId();
  }
}