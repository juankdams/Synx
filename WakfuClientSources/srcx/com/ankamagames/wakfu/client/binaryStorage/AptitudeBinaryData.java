package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AptitudeBinaryData
  implements drN
{
  protected int aw;
  protected short aSi;
  protected byte ksC;
  protected int gKz;
  protected int gKC;
  protected int gKD;
  protected short aSh;
  protected int gKE;
  protected int[] ksD;
  protected int dcO;
  protected int[] ksE;
  protected int[] aSX;

  public int getId()
  {
    return this.aw;
  }
  public short uO() {
    return this.aSi;
  }
  public byte cFK() {
    return this.ksC;
  }
  public int bQA() {
    return this.gKz;
  }
  public int bQB() {
    return this.gKC;
  }
  public int bQC() {
    return this.gKD;
  }
  public short nV() {
    return this.aSh;
  }
  public int cFL() {
    return this.gKE;
  }
  public int[] cFM() {
    return this.ksD;
  }
  public int atR() {
    return this.dcO;
  }
  public int[] cFN() {
    return this.ksE;
  }
  public int[] vD() {
    return this.aSX;
  }

  public void reset() {
    this.aw = 0;
    this.aSi = 0;
    this.ksC = 0;
    this.gKz = 0;
    this.gKC = 0;
    this.gKD = 0;
    this.aSh = 0;
    this.gKE = 0;
    this.ksD = null;
    this.dcO = 0;
    this.ksE = null;
    this.aSX = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aSi = parambUT.getShort();
    this.ksC = parambUT.get();
    this.gKz = parambUT.getInt();
    this.gKC = parambUT.getInt();
    this.gKD = parambUT.getInt();
    this.aSh = parambUT.getShort();
    this.gKE = parambUT.getInt();
    this.ksD = parambUT.caR();

    this.dcO = parambUT.getInt();
    this.ksE = parambUT.caR();

    this.aSX = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.emn.getId();
  }
}