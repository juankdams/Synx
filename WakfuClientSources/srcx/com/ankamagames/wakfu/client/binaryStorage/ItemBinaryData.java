package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import dTV;
import drN;

public class ItemBinaryData
  implements drN
{
  protected int aw;
  protected int guf;
  protected short bmv;
  protected int aSg;
  protected int gtI;
  protected int gtJ;
  protected short cZu;
  protected String[] msl;
  protected int msm;
  protected short msn;
  protected byte gtP;
  protected byte gtQ;
  protected byte mso;
  protected int gtS;
  protected int gtT;
  protected boolean gtU;
  protected boolean gtV;
  protected boolean msp;
  protected boolean msq;
  protected short msr;
  protected String mss;
  protected int[] mst;
  protected byte msu;
  protected byte msv;
  protected byte msw;
  protected byte msx;
  protected byte msy;
  protected int[] aSX;
  protected dTV[] msz;
  protected int[] msA;
  protected byte[] msB;

  public boolean duG()
  {
    return this.guf == this.aw;
  }

  public boolean duH() {
    return (this.guf > 0) && (this.guf != this.aw);
  }

  public int getId() {
    return this.aw;
  }
  public int bKE() {
    return this.guf;
  }
  public short FD() {
    return this.bmv;
  }
  public int oc() {
    return this.aSg;
  }
  public int od() {
    return this.gtI;
  }
  public int oe() {
    return this.gtJ;
  }
  public short nU() {
    return this.cZu;
  }
  public String[] duI() {
    return this.msl;
  }
  public int duJ() {
    return this.msm;
  }
  public short duK() {
    return this.msn;
  }
  public byte duL() {
    return this.gtP;
  }
  public byte duM() {
    return this.gtQ;
  }
  public byte duN() {
    return this.mso;
  }
  public int bKp() {
    return this.gtS;
  }
  public int bKo() {
    return this.gtT;
  }
  public boolean duO() {
    return this.gtU;
  }
  public boolean duP() {
    return this.gtV;
  }
  public boolean duQ() {
    return this.msp;
  }
  public boolean duR() {
    return this.msq;
  }
  public short duS() {
    return this.msr;
  }
  public String duT() {
    return this.mss;
  }
  public int[] duU() {
    return this.mst;
  }
  public byte duV() {
    return this.msu;
  }
  public byte duW() {
    return this.msv;
  }
  public byte duX() {
    return this.msw;
  }
  public byte duY() {
    return this.msx;
  }
  public byte duZ() {
    return this.msy;
  }
  public int[] vD() {
    return this.aSX;
  }
  public dTV[] dva() {
    return this.msz;
  }
  public int[] dvb() {
    return this.msA;
  }
  public byte[] dvc() {
    return this.msB;
  }

  public void reset() {
    this.aw = 0;
    this.guf = 0;
    this.bmv = 0;
    this.aSg = 0;
    this.gtI = 0;
    this.gtJ = 0;
    this.cZu = 0;
    this.msl = null;
    this.msm = 0;
    this.msn = 0;
    this.gtP = 0;
    this.gtQ = 0;
    this.mso = 0;
    this.gtS = 0;
    this.gtT = 0;
    this.gtU = false;
    this.gtV = false;
    this.msp = false;
    this.msq = false;
    this.msr = 0;
    this.mss = null;
    this.mst = null;
    this.msu = 0;
    this.msv = 0;
    this.msw = 0;
    this.msx = 0;
    this.msy = 0;
    this.aSX = null;
    this.msz = null;
    this.msA = null;
    this.msB = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.guf = parambUT.getInt();
    this.bmv = parambUT.getShort();
    this.aSg = parambUT.getInt();
    this.gtI = parambUT.getInt();
    this.gtJ = parambUT.getInt();
    this.cZu = parambUT.getShort();
    this.msl = parambUT.caU();

    this.msm = parambUT.getInt();
    this.msn = parambUT.getShort();
    this.gtP = parambUT.get();
    this.gtQ = parambUT.get();
    this.mso = parambUT.get();
    this.gtS = parambUT.getInt();
    this.gtT = parambUT.getInt();
    this.gtU = parambUT.readBoolean();
    this.gtV = parambUT.readBoolean();
    this.msp = parambUT.readBoolean();
    this.msq = parambUT.readBoolean();
    this.msr = parambUT.getShort();
    this.mss = parambUT.caP();
    this.mst = parambUT.caR();

    this.msu = parambUT.get();
    this.msv = parambUT.get();
    this.msw = parambUT.get();
    this.msx = parambUT.get();
    this.msy = parambUT.get();
    this.aSX = parambUT.caR();

    int i = parambUT.getInt();
    this.msz = new dTV[i];
    for (int j = 0; j < i; j++) {
      this.msz[j] = new dTV();
      this.msz[j].a(parambUT);
    }

    this.msA = parambUT.caR();

    this.msB = parambUT.caQ();
  }

  public final int gE()
  {
    return aKp.elw.getId();
  }
}