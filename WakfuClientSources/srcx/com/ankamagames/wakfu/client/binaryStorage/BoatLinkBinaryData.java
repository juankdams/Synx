package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class BoatLinkBinaryData
  implements drN
{
  protected int aw;
  protected int aJy;
  protected int aJz;
  protected int aJA;
  protected String aRT;
  protected String lJr;
  protected boolean kzB;
  protected TravelLoadingBinaryData fiG;

  public int getId()
  {
    return this.aw;
  }
  public int getStart() {
    return this.aJy;
  }
  public int qV() {
    return this.aJz;
  }
  public int qW() {
    return this.aJA;
  }
  public String uL() {
    return this.aRT;
  }
  public String deL() {
    return this.lJr;
  }
  public boolean cGY() {
    return this.kzB;
  }
  public TravelLoadingBinaryData bpi() {
    return this.fiG;
  }

  public void reset() {
    this.aw = 0;
    this.aJy = 0;
    this.aJz = 0;
    this.aJA = 0;
    this.aRT = null;
    this.lJr = null;
    this.kzB = false;
    this.fiG = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aJy = parambUT.getInt();
    this.aJz = parambUT.getInt();
    this.aJA = parambUT.getInt();
    this.aRT = parambUT.caP();
    this.lJr = parambUT.caP();
    this.kzB = parambUT.readBoolean();
    this.fiG = new TravelLoadingBinaryData();
    this.fiG.a(parambUT);
  }

  public final int gE()
  {
    return aKp.ekW.getId();
  }
}