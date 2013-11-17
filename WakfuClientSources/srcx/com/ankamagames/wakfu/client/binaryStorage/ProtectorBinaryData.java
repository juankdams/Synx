package com.ankamagames.wakfu.client.binaryStorage;

import Qd;
import SD;
import aKp;
import bUT;
import drN;
import pU;

public class ProtectorBinaryData
  implements drN
{
  protected int aGC;
  protected int cXU;
  protected int dhy;
  protected int dhz;
  protected int dhA;
  protected int dhB;
  protected int dhC;
  protected int dhD;
  protected int dhE;
  protected int ie;
  protected int dhF;
  protected int dhG;
  protected int dhH;
  protected int dhI;
  protected short dhJ;
  protected int[] dhK;
  protected Qd[] dhL;
  protected SD[] dhM;
  protected pU[] dhN;

  public int CB()
  {
    return this.aGC;
  }
  public int aqS() {
    return this.cXU;
  }
  public int avK() {
    return this.dhy;
  }
  public int avL() {
    return this.dhz;
  }
  public int avM() {
    return this.dhA;
  }
  public int avN() {
    return this.dhB;
  }
  public int avO() {
    return this.dhC;
  }
  public int avP() {
    return this.dhD;
  }
  public int avQ() {
    return this.dhE;
  }
  public int bP() {
    return this.ie;
  }
  public int avR() {
    return this.dhF;
  }
  public int avS() {
    return this.dhG;
  }
  public int avT() {
    return this.dhH;
  }
  public int avU() {
    return this.dhI;
  }
  public short avV() {
    return this.dhJ;
  }
  public int[] avW() {
    return this.dhK;
  }
  public Qd[] avX() {
    return this.dhL;
  }
  public SD[] avY() {
    return this.dhM;
  }
  public pU[] avZ() {
    return this.dhN;
  }

  public void reset() {
    this.aGC = 0;
    this.cXU = 0;
    this.dhy = 0;
    this.dhz = 0;
    this.dhA = 0;
    this.dhB = 0;
    this.dhC = 0;
    this.dhD = 0;
    this.dhE = 0;
    this.ie = 0;
    this.dhF = 0;
    this.dhG = 0;
    this.dhH = 0;
    this.dhI = 0;
    this.dhJ = 0;
    this.dhK = null;
    this.dhL = null;
    this.dhM = null;
    this.dhN = null;
  }

  public void a(bUT parambUT) {
    this.aGC = parambUT.getInt();
    this.cXU = parambUT.getInt();
    this.dhy = parambUT.getInt();
    this.dhz = parambUT.getInt();
    this.dhA = parambUT.getInt();
    this.dhB = parambUT.getInt();
    this.dhC = parambUT.getInt();
    this.dhD = parambUT.getInt();
    this.dhE = parambUT.getInt();
    this.ie = parambUT.getInt();
    this.dhF = parambUT.getInt();
    this.dhG = parambUT.getInt();
    this.dhH = parambUT.getInt();
    this.dhI = parambUT.getInt();
    this.dhJ = parambUT.getShort();
    this.dhK = parambUT.caR();

    int i = parambUT.getInt();
    this.dhL = new Qd[i];
    for (int j = 0; j < i; j++) {
      this.dhL[j] = new Qd();
      this.dhL[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.dhM = new SD[j];
    for (int k = 0; k < j; k++) {
      this.dhM[k] = new SD();
      this.dhM[k].a(parambUT);
    }

    k = parambUT.getInt();
    this.dhN = new pU[k];
    for (int m = 0; m < k; m++) {
      this.dhN[m] = new pU();
      this.dhN[m].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elP.getId();
  }
}