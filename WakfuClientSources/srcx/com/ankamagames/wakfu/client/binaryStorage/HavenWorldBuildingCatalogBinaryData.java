package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cqN;
import drN;

public class HavenWorldBuildingCatalogBinaryData
  implements drN
{
  protected int aw;
  protected int ceP;
  protected int efD;
  protected int efE;
  protected boolean efF;
  protected short efG;
  protected boolean efH;
  protected int efI;
  protected cqN[] efJ;

  public int getId()
  {
    return this.aw;
  }
  public int getOrder() {
    return this.ceP;
  }
  public int aTy() {
    return this.efD;
  }
  public int aTz() {
    return this.efE;
  }
  public boolean aTA() {
    return this.efF;
  }
  public short aTB() {
    return this.efG;
  }
  public boolean aTC() {
    return this.efH;
  }
  public int aTD() {
    return this.efI;
  }
  public cqN[] aTE() {
    return this.efJ;
  }

  public void reset() {
    this.aw = 0;
    this.ceP = 0;
    this.efD = 0;
    this.efE = 0;
    this.efF = false;
    this.efG = 0;
    this.efH = false;
    this.efI = 0;
    this.efJ = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.ceP = parambUT.getInt();
    this.efD = parambUT.getInt();
    this.efE = parambUT.getInt();
    this.efF = parambUT.readBoolean();
    this.efG = parambUT.getShort();
    this.efH = parambUT.readBoolean();
    this.efI = parambUT.getInt();

    int i = parambUT.getInt();
    this.efJ = new cqN[i];
    for (int j = 0; j < i; j++) {
      this.efJ[j] = new cqN();
      this.efJ[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emN.getId();
  }
}