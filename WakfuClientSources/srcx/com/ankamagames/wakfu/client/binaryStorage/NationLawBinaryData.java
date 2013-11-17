package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class NationLawBinaryData
  implements drN
{
  protected int aw;
  protected int bTT;
  protected String[] aRS;
  protected int bTU;
  protected int bTV;
  protected int bTW;
  protected boolean bTX;
  protected boolean bTY;
  protected boolean bTZ;
  protected boolean bUa;
  protected int[] bUb;

  public int getId()
  {
    return this.aw;
  }
  public int TK() {
    return this.bTT;
  }
  public String[] getParams() {
    return this.aRS;
  }
  public int TL() {
    return this.bTU;
  }
  public int TM() {
    return this.bTV;
  }
  public int TN() {
    return this.bTW;
  }
  public boolean TO() {
    return this.bTX;
  }
  public boolean TP() {
    return this.bTY;
  }
  public boolean TQ() {
    return this.bTZ;
  }
  public boolean TR() {
    return this.bUa;
  }
  public int[] TS() {
    return this.bUb;
  }

  public void reset() {
    this.aw = 0;
    this.bTT = 0;
    this.aRS = null;
    this.bTU = 0;
    this.bTV = 0;
    this.bTW = 0;
    this.bTX = false;
    this.bTY = false;
    this.bTZ = false;
    this.bUa = false;
    this.bUb = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.bTT = parambUT.getInt();
    this.aRS = parambUT.caU();

    this.bTU = parambUT.getInt();
    this.bTV = parambUT.getInt();
    this.bTW = parambUT.getInt();
    this.bTX = parambUT.readBoolean();
    this.bTY = parambUT.readBoolean();
    this.bTZ = parambUT.readBoolean();
    this.bUa = parambUT.readBoolean();
    this.bUb = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.elN.getId();
  }
}