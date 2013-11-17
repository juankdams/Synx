package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenWorldBuildingDecoBinaryData
  implements drN
{
  protected int aw;
  protected short gTZ;
  protected int cxK;
  protected int hem;
  protected int heo;

  public int getId()
  {
    return this.aw;
  }
  public short bVJ() {
    return this.gTZ;
  }
  public int ahA() {
    return this.cxK;
  }
  public int bZB() {
    return this.hem;
  }
  public int bcY() {
    return this.heo;
  }

  public void reset() {
    this.aw = 0;
    this.gTZ = 0;
    this.cxK = 0;
    this.hem = 0;
    this.heo = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.gTZ = parambUT.getShort();
    this.cxK = parambUT.getInt();
    this.hem = parambUT.getInt();
    this.heo = parambUT.getInt();
  }

  public final int gE() {
    return aKp.enk.getId();
  }
}