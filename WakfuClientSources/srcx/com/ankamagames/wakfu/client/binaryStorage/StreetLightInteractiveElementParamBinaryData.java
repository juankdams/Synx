package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class StreetLightInteractiveElementParamBinaryData
  implements drN
{
  protected int aw;
  protected int dui;
  protected float duj;
  protected int bFx;
  protected boolean dZl;
  protected int dul;
  protected boolean dum;
  protected int dun;
  protected int duo;
  protected boolean dup;
  protected int duq;
  protected ChaosParamBinaryData Sl;

  public int getId()
  {
    return this.aw;
  }
  public int aBc() {
    return this.dui;
  }
  public float aBd() {
    return this.duj;
  }
  public int LI() {
    return this.bFx;
  }
  public boolean aQe() {
    return this.dZl;
  }
  public int aBf() {
    return this.dul;
  }
  public boolean aBg() {
    return this.dum;
  }
  public int aBh() {
    return this.dun;
  }
  public int aBi() {
    return this.duo;
  }
  public boolean aBj() {
    return this.dup;
  }
  public int aBk() {
    return this.duq;
  }
  public ChaosParamBinaryData gD() {
    return this.Sl;
  }

  public void reset() {
    this.aw = 0;
    this.dui = 0;
    this.duj = 0.0F;
    this.bFx = 0;
    this.dZl = false;
    this.dul = 0;
    this.dum = false;
    this.dun = 0;
    this.duo = 0;
    this.dup = false;
    this.duq = 0;
    this.Sl = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dui = parambUT.getInt();
    this.duj = parambUT.getFloat();
    this.bFx = parambUT.getInt();
    this.dZl = parambUT.readBoolean();
    this.dul = parambUT.getInt();
    this.dum = parambUT.readBoolean();
    this.dun = parambUT.getInt();
    this.duo = parambUT.getInt();
    this.dup = parambUT.readBoolean();
    this.duq = parambUT.getInt();
    if (parambUT.get() != 0) {
      this.Sl = new ChaosParamBinaryData();
      this.Sl.a(parambUT);
    } else {
      this.Sl = null;
    }
  }

  public final int gE()
  {
    return aKp.emg.getId();
  }
}