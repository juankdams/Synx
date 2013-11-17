package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import abn;
import bUT;
import drN;

public class TeleporterBinaryData
  implements drN
{
  protected int hVW;
  protected int Sk;
  protected int bFx;
  protected short hVX;
  protected int dnO;
  protected short etD;
  protected boolean dnQ;
  protected short hVY;
  protected int dfl;
  protected abn[] hVZ;

  public int coz()
  {
    return this.hVW;
  }
  public int gC() {
    return this.Sk;
  }
  public int LI() {
    return this.bFx;
  }
  public short coA() {
    return this.hVX;
  }
  public int ayN() {
    return this.dnO;
  }
  public short bej() {
    return this.etD;
  }
  public boolean ayP() {
    return this.dnQ;
  }
  public short coB() {
    return this.hVY;
  }
  public int coC() {
    return this.dfl;
  }
  public abn[] coD() {
    return this.hVZ;
  }

  public void reset() {
    this.hVW = 0;
    this.Sk = 0;
    this.bFx = 0;
    this.hVX = 0;
    this.dnO = 0;
    this.etD = 0;
    this.dnQ = false;
    this.hVY = 0;
    this.dfl = 0;
    this.hVZ = null;
  }

  public void a(bUT parambUT) {
    this.hVW = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.bFx = parambUT.getInt();
    this.hVX = parambUT.getShort();
    this.dnO = parambUT.getInt();
    this.etD = parambUT.getShort();
    this.dnQ = parambUT.readBoolean();
    this.hVY = parambUT.getShort();
    this.dfl = parambUT.getInt();

    int i = parambUT.getInt();
    this.hVZ = new abn[i];
    for (int j = 0; j < i; j++) {
      this.hVZ[j] = new abn();
      this.hVZ[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emh.getId();
  }
}