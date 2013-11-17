package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenWorldPatchDefinitionBinaryData
  implements drN
{
  protected int aw;
  protected int gRR;
  protected int cxK;
  protected int efE;
  protected int hj;

  public int getId()
  {
    return this.aw;
  }
  public int bUX() {
    return this.gRR;
  }
  public int ahA() {
    return this.cxK;
  }
  public int aTz() {
    return this.efE;
  }
  public int getSoundId() {
    return this.hj;
  }

  public void reset() {
    this.aw = 0;
    this.gRR = 0;
    this.cxK = 0;
    this.efE = 0;
    this.hj = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.gRR = parambUT.getInt();
    this.cxK = parambUT.getInt();
    this.efE = parambUT.getInt();
    this.hj = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emK.getId();
  }
}