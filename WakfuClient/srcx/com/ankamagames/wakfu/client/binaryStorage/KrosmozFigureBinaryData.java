package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class KrosmozFigureBinaryData
  implements drN
{
  protected int aw;
  protected int gJV;
  protected int gJW;
  protected int bYw;

  public int getId()
  {
    return this.aw;
  }
  public int getYear() {
    return this.gJV;
  }
  public int bQs() {
    return this.gJW;
  }
  public int bQt() {
    return this.bYw;
  }

  public void reset() {
    this.aw = 0;
    this.gJV = 0;
    this.gJW = 0;
    this.bYw = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.gJV = parambUT.getInt();
    this.gJW = parambUT.getInt();
    this.bYw = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emW.getId();
  }
}