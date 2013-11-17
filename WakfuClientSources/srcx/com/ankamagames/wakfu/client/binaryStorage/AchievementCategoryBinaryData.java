package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AchievementCategoryBinaryData
  implements drN
{
  protected int aw;
  protected int baB;

  public int getId()
  {
    return this.aw;
  }
  public int yS() {
    return this.baB;
  }

  public void reset() {
    this.aw = 0;
    this.baB = 0;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.baB = parambUT.getInt();
  }

  public final int gE() {
    return aKp.ekQ.getId();
  }
}