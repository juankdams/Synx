package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bPB;
import bUT;
import cSR;
import drN;

public class ResourceBinaryData
  implements drN
{
  protected int aw;
  protected int aGs;
  protected short bdK;
  protected short bdL;
  protected short bdM;
  protected short bdN;
  protected boolean bdO;
  protected boolean bdP;
  protected boolean bdQ;
  protected short bdR;
  protected int[] bdS;
  protected int[] bdT;
  protected bPB[] bdU;
  protected short bdV;
  protected int bdW;
  protected cSR bdX;

  public int getId()
  {
    return this.aw;
  }
  public int getType() {
    return this.aGs;
  }
  public short Bs() {
    return this.bdK;
  }
  public short Bt() {
    return this.bdL;
  }
  public short Bu() {
    return this.bdM;
  }
  public short Bv() {
    return this.bdN;
  }
  public boolean isBlocking() {
    return this.bdO;
  }
  public boolean Bw() {
    return this.bdP;
  }
  public boolean Bx() {
    return this.bdQ;
  }
  public short By() {
    return this.bdR;
  }
  public int[] Bz() {
    return this.bdS;
  }
  public int[] BA() {
    return this.bdT;
  }
  public bPB[] BB() {
    return this.bdU;
  }
  public short BC() {
    return this.bdV;
  }
  public int BD() {
    return this.bdW;
  }
  public cSR BE() {
    return this.bdX;
  }

  public void reset() {
    this.aw = 0;
    this.aGs = 0;
    this.bdK = 0;
    this.bdL = 0;
    this.bdM = 0;
    this.bdN = 0;
    this.bdO = false;
    this.bdP = false;
    this.bdQ = false;
    this.bdR = 0;
    this.bdS = null;
    this.bdT = null;
    this.bdU = null;
    this.bdV = 0;
    this.bdW = 0;
    this.bdX = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.bdK = parambUT.getShort();
    this.bdL = parambUT.getShort();
    this.bdM = parambUT.getShort();
    this.bdN = parambUT.getShort();
    this.bdO = parambUT.readBoolean();
    this.bdP = parambUT.readBoolean();
    this.bdQ = parambUT.readBoolean();
    this.bdR = parambUT.getShort();
    this.bdS = parambUT.caR();

    this.bdT = parambUT.caR();

    int i = parambUT.getInt();
    this.bdU = new bPB[i];
    for (int j = 0; j < i; j++) {
      this.bdU[j] = new bPB();
      this.bdU[j].a(parambUT);
    }

    this.bdV = parambUT.getShort();
    this.bdW = parambUT.getInt();
    j = parambUT.getInt();
    this.bdX = new cSR(j);

    for (int m = 0; m < j; m++) {
      int k = parambUT.getInt();
      int[] arrayOfInt = parambUT.caR();

      this.bdX.put(k, arrayOfInt);
    }
  }

  public final int gE()
  {
    return aKp.elV.getId();
  }
}