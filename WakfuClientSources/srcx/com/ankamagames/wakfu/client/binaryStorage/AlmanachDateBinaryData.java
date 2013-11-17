package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;
import java.sql.Timestamp;

public class AlmanachDateBinaryData
  implements drN
{
  protected int aw;
  protected Timestamp lWI;
  protected int lWJ;

  public int getId()
  {
    return this.aw;
  }
  public Timestamp djj() {
    return this.lWI;
  }
  public int djk() {
    return this.lWJ;
  }

  public void reset() {
    this.aw = 0;
    this.lWI = null;
    this.lWJ = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.lWI = new Timestamp(parambUT.getLong());
    this.lWJ = parambUT.getInt();
  }

  public final int gE() {
    return aKp.emI.getId();
  }
}