package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;
import wY;

public class HavenWorldBuildingVisualDefinitionBinaryData
  implements drN
{
  protected int aw;
  protected int aCV;
  protected wY[] aCW;

  public int getId()
  {
    return this.aw;
  }
  public int mP() {
    return this.aCV;
  }
  public wY[] mQ() {
    return this.aCW;
  }

  public void reset() {
    this.aw = 0;
    this.aCV = 0;
    this.aCW = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.aCV = parambUT.getInt();

    int i = parambUT.getInt();
    this.aCW = new wY[i];
    for (int j = 0; j < i; j++) {
      this.aCW[j] = new wY();
      this.aCW[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emQ.getId();
  }
}