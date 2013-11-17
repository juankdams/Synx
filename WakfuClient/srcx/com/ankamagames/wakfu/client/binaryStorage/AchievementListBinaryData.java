package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import cYu;
import drN;

public class AchievementListBinaryData
  implements drN
{
  protected int aw;
  protected cYu[] fMb;

  public int getId()
  {
    return this.aw;
  }
  public cYu[] bzG() {
    return this.fMb;
  }

  public void reset() {
    this.aw = 0;
    this.fMb = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();

    int i = parambUT.getInt();
    this.fMb = new cYu[i];
    for (int j = 0; j < i; j++) {
      this.fMb[j] = new cYu();
      this.fMb[j].a(parambUT);
    }
  }

  public final int gE()
  {
    return aKp.emY.getId();
  }
}