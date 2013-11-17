package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class EquipableDummyInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected String UV;
  protected byte aHn;

  public int getId()
  {
    return this.aw;
  }
  public String getAnimName() {
    return this.UV;
  }
  public byte xK() {
    return this.aHn;
  }

  public void reset() {
    this.aw = 0;
    this.UV = null;
    this.aHn = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.UV = parambUT.caP();
    this.aHn = parambUT.get();
  }

  public final int gE() {
    return aKp.emP.getId();
  }
}