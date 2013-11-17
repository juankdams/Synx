package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class DoorInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int Sk;
  protected boolean cxI;
  protected int cxJ;
  protected int cxK;
  protected String Sj;

  public int getId()
  {
    return this.aw;
  }
  public int gC() {
    return this.Sk;
  }
  public boolean ahy() {
    return this.cxI;
  }
  public int ahz() {
    return this.cxJ;
  }
  public int ahA() {
    return this.cxK;
  }
  public String gB() {
    return this.Sj;
  }

  public void reset() {
    this.aw = 0;
    this.Sk = 0;
    this.cxI = false;
    this.cxJ = 0;
    this.cxK = 0;
    this.Sj = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.Sk = parambUT.getInt();
    this.cxI = parambUT.readBoolean();
    this.cxJ = parambUT.getInt();
    this.cxK = parambUT.getInt();
    this.Sj = parambUT.caP();
  }

  public final int gE() {
    return aKp.enb.getId();
  }
}