package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class EmoteBinaryData
  implements drN
{
  protected int aw;
  protected short dYr;
  protected String eeM;
  protected boolean eeN;
  protected boolean eeO;
  protected boolean eeP;
  protected boolean eeQ;
  protected String[] eeR;

  public int getId()
  {
    return this.aw;
  }
  public short getType() {
    return this.dYr;
  }
  public String aTh() {
    return this.eeM;
  }
  public boolean aTi() {
    return this.eeN;
  }
  public boolean aTj() {
    return this.eeO;
  }
  public boolean aTk() {
    return this.eeP;
  }
  public boolean aTl() {
    return this.eeQ;
  }
  public String[] aTm() {
    return this.eeR;
  }

  public void reset() {
    this.aw = 0;
    this.dYr = 0;
    this.eeM = null;
    this.eeN = false;
    this.eeO = false;
    this.eeP = false;
    this.eeQ = false;
    this.eeR = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.dYr = parambUT.getShort();
    this.eeM = parambUT.caP();
    this.eeN = parambUT.readBoolean();
    this.eeO = parambUT.readBoolean();
    this.eeP = parambUT.readBoolean();
    this.eeQ = parambUT.readBoolean();
    this.eeR = parambUT.caU();
  }

  public final int gE()
  {
    return aKp.emq.getId();
  }
}