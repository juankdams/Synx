package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class CensoredEntryBinaryData
  implements drN
{
  protected int aw;
  protected boolean dJw;
  protected int fse;
  protected int fsf;
  protected String hi;

  public int getId()
  {
    return this.aw;
  }
  public boolean aGZ() {
    return this.dJw;
  }
  public int bsv() {
    return this.fse;
  }
  public int bsw() {
    return this.fsf;
  }
  public String getText() {
    return this.hi;
  }

  public void reset() {
    this.aw = 0;
    this.dJw = false;
    this.fse = 0;
    this.fsf = 0;
    this.hi = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dJw = parambUT.readBoolean();
    this.fse = parambUT.getInt();
    this.fsf = parambUT.getInt();
    this.hi = parambUT.caP();
  }

  public final int gE() {
    return aKp.ela.getId();
  }
}