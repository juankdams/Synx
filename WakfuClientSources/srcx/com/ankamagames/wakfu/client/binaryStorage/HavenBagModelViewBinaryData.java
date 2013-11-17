package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class HavenBagModelViewBinaryData
  implements drN
{
  protected int aw;
  protected boolean dji;
  protected boolean djj;
  protected int djk;
  protected boolean bYt;

  public int getId()
  {
    return this.aw;
  }
  public boolean awt() {
    return this.dji;
  }
  public boolean awu() {
    return this.djj;
  }
  public int awv() {
    return this.djk;
  }
  public boolean Wk() {
    return this.bYt;
  }

  public void reset() {
    this.aw = 0;
    this.dji = false;
    this.djj = false;
    this.djk = 0;
    this.bYt = false;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dji = parambUT.readBoolean();
    this.djj = parambUT.readBoolean();
    this.djk = parambUT.getInt();
    this.bYt = parambUT.readBoolean();
  }

  public final int gE() {
    return aKp.elu.getId();
  }
}