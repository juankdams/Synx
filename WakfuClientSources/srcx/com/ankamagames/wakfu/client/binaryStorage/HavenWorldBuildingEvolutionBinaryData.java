package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenWorldBuildingEvolutionBinaryData
  implements drN
{
  protected int aw;
  protected short gTZ;
  protected int gUa;
  protected int gUb;
  protected long fiV;
  protected byte bvo;

  public int getId()
  {
    return this.aw;
  }
  public short bVJ() {
    return this.gTZ;
  }
  public int bVK() {
    return this.gUa;
  }
  public int bVL() {
    return this.gUb;
  }
  public long getDelay() {
    return this.fiV;
  }
  public byte IS() {
    return this.bvo;
  }

  public void reset() {
    this.aw = 0;
    this.gTZ = 0;
    this.gUa = 0;
    this.gUb = 0;
    this.fiV = 0L;
    this.bvo = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.gTZ = parambUT.getShort();
    this.gUa = parambUT.getInt();
    this.gUb = parambUT.getInt();
    this.fiV = parambUT.getLong();
    this.bvo = parambUT.get();
  }

  public final int gE() {
    return aKp.emM.getId();
  }
}