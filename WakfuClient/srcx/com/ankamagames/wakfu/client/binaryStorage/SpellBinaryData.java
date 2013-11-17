package com.ankamagames.wakfu.client.binaryStorage;

import aDH;
import aKp;
import akR;
import bUT;
import dPx;
import drN;
import dsu;

public class SpellBinaryData
  implements drN
{
  protected int aw;
  protected int aSf;
  protected int aSg;
  protected short aSh;
  protected short aSi;
  protected short aSj;
  protected short aSk;
  protected float aSl;
  protected short aSm;
  protected boolean aSn;
  protected boolean aSo;
  protected boolean aSp;
  protected boolean aSq;
  protected boolean aSr;
  protected boolean aSs;
  protected int aSt;
  protected String aSu;
  protected float aSv;
  protected float aSw;
  protected float aSx;
  protected float aSy;
  protected float aSz;
  protected float aSA;
  protected float aSB;
  protected float aSC;
  protected float aSD;
  protected float aSE;
  protected short aSF;
  protected short aSG;
  protected short aSH;
  protected short aSI;
  protected short aSJ;
  protected String aSK;
  protected byte aSL;
  protected boolean aSM;
  protected boolean aSN;
  protected boolean aSO;
  protected int[] aSP;
  protected byte aSQ;
  protected boolean aSR;
  protected boolean aSS;
  protected boolean aST;
  protected boolean aSU;
  protected boolean aSV;
  protected boolean aSW;
  protected int[] aSX;
  protected dPx aSY;
  protected akR aSZ;

  public int getId()
  {
    return this.aw;
  }
  public int uN() {
    return this.aSf;
  }
  public int oc() {
    return this.aSg;
  }
  public short nV() {
    return this.aSh;
  }
  public short uO() {
    return this.aSi;
  }
  public short uP() {
    return this.aSj;
  }
  public short uQ() {
    return this.aSk;
  }
  public float uR() {
    return this.aSl;
  }
  public short uS() {
    return this.aSm;
  }
  public boolean uT() {
    return this.aSn;
  }
  public boolean uU() {
    return this.aSo;
  }
  public boolean uV() {
    return this.aSp;
  }
  public boolean uW() {
    return this.aSq;
  }
  public boolean uX() {
    return this.aSr;
  }
  public boolean uY() {
    return this.aSs;
  }
  public int uZ() {
    return this.aSt;
  }
  public String va() {
    return this.aSu;
  }
  public float vb() {
    return this.aSv;
  }
  public float vc() {
    return this.aSw;
  }
  public float vd() {
    return this.aSx;
  }
  public float ve() {
    return this.aSy;
  }
  public float vf() {
    return this.aSz;
  }
  public float vg() {
    return this.aSA;
  }
  public float vh() {
    return this.aSB;
  }
  public float vi() {
    return this.aSC;
  }
  public float vj() {
    return this.aSD;
  }
  public float vk() {
    return this.aSE;
  }
  public short vl() {
    return this.aSF;
  }
  public short vm() {
    return this.aSG;
  }
  public short vn() {
    return this.aSH;
  }
  public short vo() {
    return this.aSI;
  }
  public short vp() {
    return this.aSJ;
  }
  public String vq() {
    return this.aSK;
  }
  public byte vr() {
    return this.aSL;
  }
  public boolean vs() {
    return this.aSM;
  }
  public boolean vt() {
    return this.aSN;
  }
  public boolean vu() {
    return this.aSO;
  }
  public int[] vv() {
    return this.aSP;
  }
  public byte vw() {
    return this.aSQ;
  }
  public boolean vx() {
    return this.aSR;
  }
  public boolean vy() {
    return this.aSS;
  }
  public boolean vz() {
    return this.aST;
  }
  public boolean vA() {
    return this.aSU;
  }
  public boolean vB() {
    return this.aSV;
  }
  public boolean vC() {
    return this.aSW;
  }
  public int[] vD() {
    return this.aSX;
  }
  public dPx vE() {
    return this.aSY;
  }
  public akR vF() {
    return this.aSZ;
  }

  public void reset() {
    this.aw = 0;
    this.aSf = 0;
    this.aSg = 0;
    this.aSh = 0;
    this.aSi = 0;
    this.aSj = 0;
    this.aSk = 0;
    this.aSl = 0.0F;
    this.aSm = 0;
    this.aSn = false;
    this.aSo = false;
    this.aSp = false;
    this.aSq = false;
    this.aSr = false;
    this.aSs = false;
    this.aSt = 0;
    this.aSu = null;
    this.aSv = 0.0F;
    this.aSw = 0.0F;
    this.aSx = 0.0F;
    this.aSy = 0.0F;
    this.aSz = 0.0F;
    this.aSA = 0.0F;
    this.aSB = 0.0F;
    this.aSC = 0.0F;
    this.aSD = 0.0F;
    this.aSE = 0.0F;
    this.aSF = 0;
    this.aSG = 0;
    this.aSH = 0;
    this.aSI = 0;
    this.aSJ = 0;
    this.aSK = null;
    this.aSL = 0;
    this.aSM = false;
    this.aSN = false;
    this.aSO = false;
    this.aSP = null;
    this.aSQ = 0;
    this.aSR = false;
    this.aSS = false;
    this.aST = false;
    this.aSU = false;
    this.aSV = false;
    this.aSW = false;
    this.aSX = null;
    this.aSY = null;
    this.aSZ = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aSf = parambUT.getInt();
    this.aSg = parambUT.getInt();
    this.aSh = parambUT.getShort();
    this.aSi = parambUT.getShort();
    this.aSj = parambUT.getShort();
    this.aSk = parambUT.getShort();
    this.aSl = parambUT.getFloat();
    this.aSm = parambUT.getShort();
    this.aSn = parambUT.readBoolean();
    this.aSo = parambUT.readBoolean();
    this.aSp = parambUT.readBoolean();
    this.aSq = parambUT.readBoolean();
    this.aSr = parambUT.readBoolean();
    this.aSs = parambUT.readBoolean();
    this.aSt = parambUT.getInt();
    this.aSu = parambUT.caP();
    this.aSv = parambUT.getFloat();
    this.aSw = parambUT.getFloat();
    this.aSx = parambUT.getFloat();
    this.aSy = parambUT.getFloat();
    this.aSz = parambUT.getFloat();
    this.aSA = parambUT.getFloat();
    this.aSB = parambUT.getFloat();
    this.aSC = parambUT.getFloat();
    this.aSD = parambUT.getFloat();
    this.aSE = parambUT.getFloat();
    this.aSF = parambUT.getShort();
    this.aSG = parambUT.getShort();
    this.aSH = parambUT.getShort();
    this.aSI = parambUT.getShort();
    this.aSJ = parambUT.getShort();
    this.aSK = parambUT.caP();
    this.aSL = parambUT.get();
    this.aSM = parambUT.readBoolean();
    this.aSN = parambUT.readBoolean();
    this.aSO = parambUT.readBoolean();
    this.aSP = parambUT.caR();

    this.aSQ = parambUT.get();
    this.aSR = parambUT.readBoolean();
    this.aSS = parambUT.readBoolean();
    this.aST = parambUT.readBoolean();
    this.aSU = parambUT.readBoolean();
    this.aSV = parambUT.readBoolean();
    this.aSW = parambUT.readBoolean();
    this.aSX = parambUT.caR();

    int i = parambUT.getInt();
    this.aSY = new dPx(i);

    for (int j = 0; j < i; j++) {
      byte b = parambUT.get();
      dsu localdsu = new dsu();
      localdsu.a(parambUT);

      this.aSY.c(b, localdsu);
    }

    j = parambUT.getInt();
    this.aSZ = new akR(j);

    for (int k = 0; k < j; k++) {
      String str = parambUT.caP();
      aDH localaDH = new aDH();
      localaDH.a(parambUT);

      this.aSZ.put(str, localaDH);
    }
  }

  public final int gE()
  {
    return aKp.emb.getId();
  }
}