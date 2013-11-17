package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BagsBinaryData
  implements drN
{
  protected int aw;
  protected short coT;
  protected int iyu;
  protected int[] iyv;

  public int getId()
  {
    return this.aw;
  }
  public short abQ() {
    return this.coT;
  }
  public int cAl() {
    return this.iyu;
  }
  public int[] cAm() {
    return this.iyv;
  }

  public void reset() {
    this.aw = 0;
    this.coT = 0;
    this.iyu = 0;
    this.iyv = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.coT = parambUT.getShort();
    this.iyu = parambUT.getInt();
    this.iyv = parambUT.caR();
  }

  public final int gE()
  {
    return aKp.enf.getId();
  }
}