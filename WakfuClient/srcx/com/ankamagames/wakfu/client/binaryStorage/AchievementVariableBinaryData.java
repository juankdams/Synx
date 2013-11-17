package com.ankamagames.wakfu.client.binaryStorage;

import aKp;
import bUT;
import drN;

public class AchievementVariableBinaryData
  implements drN
{
  protected int aw;
  protected String m_name;

  public int getId()
  {
    return this.aw;
  }
  public String getName() {
    return this.m_name;
  }

  public void reset() {
    this.aw = 0;
    this.m_name = null;
  }

  public void a(bUT parambUT) {
    this.aw = parambUT.getInt();
    this.m_name = parambUT.caP();
  }

  public final int gE() {
    return aKp.ekP.getId();
  }
}