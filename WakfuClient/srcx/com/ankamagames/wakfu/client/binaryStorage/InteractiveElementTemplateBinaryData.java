package com.ankamagames.wakfu.client.binaryStorage;

import Fm;
import KR;
import aKp;
import bUT;
import drN;

public class InteractiveElementTemplateBinaryData
  implements drN
{
  protected int aw;
  protected short iaW;
  protected short az;
  protected int hY;
  protected int hZ;
  protected short aOl;
  protected short iab;
  protected boolean iac;
  protected boolean iad;
  protected boolean fft;
  protected boolean iae;
  protected byte boN;
  protected short fgF;
  protected String fgH;
  protected int bxi;
  protected int[] bdS;
  protected Fm[] iaX;
  protected KR iaY;
  protected int[] fNV;

  public int getId()
  {
    return this.aw;
  }

  public short cpV() {
    return this.iaW;
  }

  public short D() {
    return this.az;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public short cpW() {
    return this.iab;
  }

  public boolean cpX() {
    return this.iac;
  }

  public boolean cpY() {
    return this.iad;
  }

  public boolean aeH() {
    return this.fft;
  }

  public boolean cpZ() {
    return this.iae;
  }

  public byte FW() {
    return this.boN;
  }

  public short boz() {
    return this.fgF;
  }

  public String cqa() {
    return this.fgH;
  }

  public int apa() {
    return this.bxi;
  }

  public int[] Bz() {
    return this.bdS;
  }

  public Fm[] cqb() {
    return this.iaX;
  }

  public KR cqc() {
    return this.iaY;
  }

  public int[] cqd() {
    return this.fNV;
  }

  public void reset() {
    this.aw = 0;
    this.iaW = 0;
    this.az = 0;
    this.hY = 0;
    this.hZ = 0;
    this.aOl = 0;
    this.iab = 0;
    this.iac = false;
    this.iad = false;
    this.fft = false;
    this.iae = false;
    this.boN = 0;
    this.fgF = 0;
    this.fgH = null;
    this.bxi = 0;
    this.bdS = null;
    this.iaX = null;
    this.iaY = null;
    this.fNV = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.iaW = parambUT.getShort();
    this.az = parambUT.getShort();
    this.hY = parambUT.getInt();
    this.hZ = parambUT.getInt();
    this.aOl = parambUT.getShort();
    this.iab = parambUT.getShort();
    this.iac = parambUT.readBoolean();
    this.iad = parambUT.readBoolean();
    this.fft = parambUT.readBoolean();
    this.iae = parambUT.readBoolean();
    this.boN = parambUT.get();
    this.fgF = parambUT.getShort();
    this.fgH = parambUT.caP();
    this.bxi = parambUT.getInt();
    this.bdS = parambUT.caR();

    int i = parambUT.getInt();
    this.iaX = new Fm[i];
    for (int j = 0; j < i; j++) {
      this.iaX[j] = new Fm();
      this.iaX[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.iaY = new KR(j);

    for (int m = 0; m < j; m++) {
      short s = parambUT.getShort();
      int k = parambUT.getInt();
      this.iaY.a(s, k);
    }

    this.fNV = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.enm.getId();
  }
}