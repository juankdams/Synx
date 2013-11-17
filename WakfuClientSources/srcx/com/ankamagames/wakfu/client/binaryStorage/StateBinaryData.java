package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class StateBinaryData
  implements drN
{
  protected int aw;
  protected short aSh;
  protected int[] bKC;
  protected int[] bKD;
  protected float[] bKE;
  protected boolean aOE;
  protected boolean aOD;
  protected boolean bKF;
  protected boolean bKG;
  protected boolean bKH;
  protected String bKI;
  protected String bKJ;
  protected boolean bKK;
  protected boolean bbu;
  protected int[] aSX;
  protected int[] bKL;
  protected boolean bKM;
  protected boolean bKN;
  protected byte bKO;
  protected byte bKP;
  protected boolean bKQ;
  protected boolean bKR;
  protected int aSg;
  protected boolean bKS;

  public int getId()
  {
    return this.aw;
  }
  public short nV() {
    return this.aSh;
  }
  public int[] NL() {
    return this.bKC;
  }
  public int[] NM() {
    return this.bKD;
  }
  public float[] NN() {
    return this.bKE;
  }
  public short NO() {
    return (short)this.bKD[0];
  }

  public int NP() {
    return this.bKD.length == 0 ? 0 : 1000 * this.bKD[1];
  }

  public float NQ() {
    return this.bKE[0];
  }

  public int NR() {
    return this.bKE.length == 0 ? 0 : (int)(1000.0F * this.bKE[1]);
  }

  public boolean zl() {
    return this.aOE;
  }
  public boolean zm() {
    return this.aOD;
  }
  public boolean zS() {
    return this.bKF;
  }
  public boolean NS() {
    return this.bKG;
  }
  public boolean NT() {
    return this.bKH;
  }
  public String NU() {
    return this.bKI;
  }
  public String NV() {
    return this.bKJ;
  }
  public boolean NW() {
    return this.bKK;
  }
  public boolean zN() {
    return this.bbu;
  }
  public int[] vD() {
    return this.aSX;
  }
  public int[] NX() {
    return this.bKL;
  }
  public boolean NY() {
    return this.bKM;
  }
  public boolean zI() {
    return this.bKN;
  }
  public byte NZ() {
    return this.bKO;
  }
  public byte Oa() {
    return this.bKP;
  }
  public boolean Ob() {
    return this.bKQ;
  }
  public boolean Oc() {
    return this.bKR;
  }
  public int oc() {
    return this.aSg;
  }
  public boolean Od() {
    return this.bKS;
  }

  public void reset() {
    this.aw = 0;
    this.aSh = 0;
    this.bKC = null;
    this.bKD = null;
    this.bKE = null;
    this.aOE = false;
    this.aOD = false;
    this.bKF = false;
    this.bKG = false;
    this.bKH = false;
    this.bKI = null;
    this.bKJ = null;
    this.bKK = false;
    this.bbu = false;
    this.aSX = null;
    this.bKL = null;
    this.bKM = false;
    this.bKN = false;
    this.bKO = 0;
    this.bKP = 0;
    this.bKQ = false;
    this.bKR = false;
    this.aSg = 0;
    this.bKS = false;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aSh = parambUT.getShort();
    this.bKC = parambUT.caR();

    this.bKD = parambUT.caR();

    this.bKE = parambUT.caT();

    this.aOE = parambUT.readBoolean();
    this.aOD = parambUT.readBoolean();
    this.bKF = parambUT.readBoolean();
    this.bKG = parambUT.readBoolean();
    this.bKH = parambUT.readBoolean();
    this.bKI = parambUT.caP();
    this.bKJ = parambUT.caP();
    this.bKK = parambUT.readBoolean();
    this.bbu = parambUT.readBoolean();
    this.aSX = parambUT.caR();

    this.bKL = parambUT.caR();

    this.bKM = parambUT.readBoolean();
    this.bKN = parambUT.readBoolean();
    this.bKO = parambUT.get();
    this.bKP = parambUT.get();
    this.bKQ = parambUT.readBoolean();
    this.bKR = parambUT.readBoolean();
    this.aSg = parambUT.getInt();
    this.bKS = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.emc.getId();
  }
}