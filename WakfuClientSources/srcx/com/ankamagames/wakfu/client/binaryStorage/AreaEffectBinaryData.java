package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AreaEffectBinaryData
  implements drN
{
  protected int aw;
  protected int aSf;
  protected int fBy;
  protected int eWS;
  protected int fBz;
  protected boolean fBA;
  protected boolean fBB;
  protected boolean fBC;
  protected boolean fBD;
  protected boolean fBE;
  protected String Ta;
  protected int[] fBF;
  protected int[] fBG;
  protected int[] fBH;
  protected int[] fBI;
  protected float[] fBJ;
  protected float[] baW;
  protected int[] bdS;
  protected int[] aSX;
  protected String fBK;
  protected String fBL;
  protected String dyq;
  protected String dys;

  public int getId()
  {
    return this.aw;
  }
  public int uN() {
    return this.aSf;
  }
  public int bvI() {
    return this.fBy;
  }
  public int bvJ() {
    return this.eWS;
  }
  public int bvK() {
    return this.fBz;
  }
  public boolean bvL() {
    return this.fBA;
  }
  public boolean bvM() {
    return this.fBB;
  }
  public boolean bvN() {
    return this.fBC;
  }
  public boolean bvO() {
    return this.fBD;
  }
  public boolean bvP() {
    return this.fBE;
  }
  public String getType() {
    return this.Ta;
  }
  public int[] bvQ() {
    return this.fBF;
  }
  public int[] bvR() {
    return this.fBG;
  }
  public int[] bvS() {
    return this.fBH;
  }
  public int[] bvT() {
    return this.fBI;
  }
  public float[] bvU() {
    return this.fBJ;
  }
  public float[] zp() {
    return this.baW;
  }
  public int[] Bz() {
    return this.bdS;
  }
  public int[] vD() {
    return this.aSX;
  }
  public String bvV() {
    return this.fBK;
  }
  public String bvW() {
    return this.fBL;
  }
  public String bvX() {
    return this.dyq;
  }
  public String bvY() {
    return this.dys;
  }

  public void reset() {
    this.aw = 0;
    this.aSf = 0;
    this.fBy = 0;
    this.eWS = 0;
    this.fBz = 0;
    this.fBA = false;
    this.fBB = false;
    this.fBC = false;
    this.fBD = false;
    this.fBE = false;
    this.Ta = null;
    this.fBF = null;
    this.fBG = null;
    this.fBH = null;
    this.fBI = null;
    this.fBJ = null;
    this.baW = null;
    this.bdS = null;
    this.aSX = null;
    this.fBK = null;
    this.fBL = null;
    this.dyq = null;
    this.dys = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aSf = parambUT.getInt();
    this.fBy = parambUT.getInt();
    this.eWS = parambUT.getInt();
    this.fBz = parambUT.getInt();
    this.fBA = parambUT.readBoolean();
    this.fBB = parambUT.readBoolean();
    this.fBC = parambUT.readBoolean();
    this.fBD = parambUT.readBoolean();
    this.fBE = parambUT.readBoolean();
    this.Ta = parambUT.caP();
    this.fBF = parambUT.caR();

    this.fBG = parambUT.caR();

    this.fBH = parambUT.caR();

    this.fBI = parambUT.caR();

    this.fBJ = parambUT.caT();

    this.baW = parambUT.caT();

    this.bdS = parambUT.caR();

    this.aSX = parambUT.caR();

    this.fBK = parambUT.caP();
    this.fBL = parambUT.caP();
    this.dyq = parambUT.caP();
    this.dys = parambUT.caP();
  }

  public final int gE() {
    return aKp.ekR.getId();
  }
}