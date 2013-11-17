package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AvatarBreedBinaryData
  implements drN
{
  protected int aw;
  protected String m_name;
  protected int bJt;
  protected int bJu;
  protected int bJv;
  protected int bJw;
  protected int bJx;
  protected int bJy;
  protected int bJz;
  protected int bJA;
  protected int bJB;
  protected int bJC;
  protected int bJD;
  protected int bJE;
  protected int bJF;
  protected int bJG;
  protected int bJH;
  protected byte[] bJI;
  protected float[] bJJ;

  public int getId()
  {
    return this.aw;
  }
  public String getName() {
    return this.m_name;
  }
  public int Nf() {
    return this.bJt;
  }
  public int Ng() {
    return this.bJu;
  }
  public int Nh() {
    return this.bJv;
  }
  public int Ni() {
    return this.bJw;
  }
  public int Nj() {
    return this.bJx;
  }
  public int Nk() {
    return this.bJy;
  }
  public int Nl() {
    return this.bJz;
  }
  public int Nm() {
    return this.bJA;
  }
  public int Nn() {
    return this.bJB;
  }
  public int No() {
    return this.bJC;
  }
  public int Np() {
    return this.bJD;
  }
  public int Nq() {
    return this.bJE;
  }
  public int Nr() {
    return this.bJF;
  }
  public int Ns() {
    return this.bJG;
  }
  public int Nt() {
    return this.bJH;
  }
  public byte[] Nu() {
    return this.bJI;
  }
  public float[] Nv() {
    return this.bJJ;
  }

  public void reset() {
    this.aw = 0;
    this.m_name = null;
    this.bJt = 0;
    this.bJu = 0;
    this.bJv = 0;
    this.bJw = 0;
    this.bJx = 0;
    this.bJy = 0;
    this.bJz = 0;
    this.bJA = 0;
    this.bJB = 0;
    this.bJC = 0;
    this.bJD = 0;
    this.bJE = 0;
    this.bJF = 0;
    this.bJG = 0;
    this.bJH = 0;
    this.bJI = null;
    this.bJJ = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.m_name = parambUT.caP();
    this.bJt = parambUT.getInt();
    this.bJu = parambUT.getInt();
    this.bJv = parambUT.getInt();
    this.bJw = parambUT.getInt();
    this.bJx = parambUT.getInt();
    this.bJy = parambUT.getInt();
    this.bJz = parambUT.getInt();
    this.bJA = parambUT.getInt();
    this.bJB = parambUT.getInt();
    this.bJC = parambUT.getInt();
    this.bJD = parambUT.getInt();
    this.bJE = parambUT.getInt();
    this.bJF = parambUT.getInt();
    this.bJG = parambUT.getInt();
    this.bJH = parambUT.getInt();
    this.bJI = parambUT.caQ();

    this.bJJ = parambUT.caT();
  }

  public final int gE()
  {
    return aKp.emv.getId();
  }
}