package com.ankamagames.wakfu.client.binaryStorage;

import Qq;
import aKp;
import bUT;
import drN;

public class ClientEventBinaryData
  implements drN
{
  protected int aw;
  protected int aGs;
  protected short aOg;
  protected short aOh;
  protected String Sj;
  protected String[] aOi;
  protected boolean aOj;
  protected Qq[] aOk;

  public int getId()
  {
    return this.aw;
  }
  public int getType() {
    return this.aGs;
  }
  public short si() {
    return this.aOg;
  }
  public short sj() {
    return this.aOh;
  }
  public String gB() {
    return this.Sj;
  }
  public String[] sk() {
    return this.aOi;
  }
  public boolean sl() {
    return this.aOj;
  }
  public Qq[] sm() {
    return this.aOk;
  }

  public void reset() {
    this.aw = 0;
    this.aGs = 0;
    this.aOg = 0;
    this.aOh = 0;
    this.Sj = null;
    this.aOi = null;
    this.aOj = false;
    this.aOk = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aGs = parambUT.getInt();
    this.aOg = parambUT.getShort();
    this.aOh = parambUT.getShort();
    this.Sj = parambUT.caP();
    this.aOi = parambUT.caU();

    this.aOj = parambUT.readBoolean();

    int i = parambUT.getInt();
    this.aOk = new Qq[i];
    for (int j = 0; j < i; j++) {
      this.aOk[j] = new Qq();
      this.aOk[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.elf.getId();
  }
}