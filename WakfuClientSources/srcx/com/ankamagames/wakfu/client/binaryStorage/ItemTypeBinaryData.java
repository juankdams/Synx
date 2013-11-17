package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class ItemTypeBinaryData
  implements drN
{
  protected short aDx;
  protected short aDz;
  protected boolean hfD;
  protected boolean hfE;
  protected boolean hfF;
  protected String[] hfG;
  protected String[] hfH;

  public short nc()
  {
    return this.aDx;
  }
  public short nd() {
    return this.aDz;
  }
  public boolean nm() {
    return this.hfD;
  }
  public boolean nk() {
    return this.hfE;
  }
  public boolean nl() {
    return this.hfF;
  }
  public String[] bZZ() {
    return this.hfG;
  }
  public String[] caa() {
    return this.hfH;
  }

  public void reset() {
    this.aDx = 0;
    this.aDz = 0;
    this.hfD = false;
    this.hfE = false;
    this.hfF = false;
    this.hfG = null;
    this.hfH = null;
  }

  public void a(bUT parambUT) {
    this.aDx = parambUT.getShort();
    this.aDz = parambUT.getShort();
    this.hfD = parambUT.readBoolean();
    this.hfE = parambUT.readBoolean();
    this.hfF = parambUT.readBoolean();
    this.hfG = parambUT.caU();

    this.hfH = parambUT.caU();
  }

  public final int gE()
  {
    return aKp.ely.getId();
  }
}