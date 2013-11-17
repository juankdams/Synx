package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import dnj;
import drN;
import drY;

public class AchievementBinaryData
  implements drN
{
  protected int aw;
  protected int efE;
  protected boolean bG;
  protected boolean lNp;
  protected boolean cMa;
  protected String Sj;
  protected drY[] msf;
  protected dnj[] msg;
  protected int aKS;
  protected int mqX;
  protected boolean lNr;
  protected boolean lNs;
  protected boolean lNt;
  protected int lNz;
  protected int lNA;
  protected boolean lNu;
  protected int lNw;
  protected long msh;
  protected long msi;
  protected boolean lNv;
  protected int aSg;

  public int getId()
  {
    return this.aw;
  }

  public int aTz() {
    return this.efE;
  }

  public boolean isVisible() {
    return this.bG;
  }

  public boolean dgi() {
    return this.lNp;
  }

  public boolean isActive() {
    return this.cMa;
  }

  public String gB() {
    return this.Sj;
  }

  public drY[] duB() {
    return this.msf;
  }

  public dnj[] duC() {
    return this.msg;
  }

  public int getDuration() {
    return this.aKS;
  }

  public int dtV() {
    return this.mqX;
  }

  public boolean dgk() {
    return this.lNr;
  }

  public boolean bnc() {
    return this.lNs;
  }

  public boolean dgl() {
    return this.lNt;
  }

  public int dgm() {
    return this.lNz;
  }

  public int dgn() {
    return this.lNA;
  }

  public boolean dgj() {
    return this.lNu;
  }

  public int dgo() {
    return this.lNw;
  }

  public long duD() {
    return this.msh;
  }

  public long duE() {
    return this.msi;
  }

  public boolean dgp() {
    return this.lNv;
  }

  public int oc() {
    return this.aSg;
  }

  public void reset() {
    this.aw = 0;
    this.efE = 0;
    this.bG = false;
    this.lNp = false;
    this.cMa = false;
    this.Sj = null;
    this.msf = null;
    this.msg = null;
    this.aKS = 0;
    this.mqX = 0;
    this.lNr = false;
    this.lNs = false;
    this.lNt = false;
    this.lNz = 0;
    this.lNA = 0;
    this.lNu = false;
    this.lNw = 0;
    this.msh = 0L;
    this.msi = 0L;
    this.lNv = false;
    this.aSg = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.efE = parambUT.getInt();
    this.bG = parambUT.readBoolean();
    this.lNp = parambUT.readBoolean();
    this.cMa = parambUT.readBoolean();
    this.Sj = parambUT.caP();

    int i = parambUT.getInt();
    this.msf = new drY[i];
    for (int j = 0; j < i; j++) {
      this.msf[j] = new drY();
      this.msf[j].a(parambUT);
    }

    j = parambUT.getInt();
    this.msg = new dnj[j];
    for (int k = 0; k < j; k++) {
      this.msg[k] = new dnj();
      this.msg[k].a(parambUT);
    }

    this.aKS = parambUT.getInt();
    this.mqX = parambUT.getInt();
    this.lNr = parambUT.readBoolean();
    this.lNs = parambUT.readBoolean();
    this.lNt = parambUT.readBoolean();
    this.lNz = parambUT.getInt();
    this.lNA = parambUT.getInt();
    this.lNu = parambUT.readBoolean();
    this.lNw = parambUT.getInt();
    this.msh = parambUT.getLong();
    this.msi = parambUT.getLong();
    this.lNv = parambUT.readBoolean();
    this.aSg = parambUT.getInt();
  }

  public final int gE() {
    return aKp.ekO.getId();
  }
}