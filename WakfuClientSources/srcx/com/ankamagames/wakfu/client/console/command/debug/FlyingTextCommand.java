package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bCO;
import cgd;
import cth;
import dka;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FlyingTextCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(FlyingTextCommand.class);

  private static Runnable cGC = null;
  private static final int gvW = 500;
  private static final float gvX = 0.65F;
  private static final float gvY = 1.3F;
  private int gvZ = 0;

  private float sd(int paramInt)
  {
    int i = bCO.J(paramInt, 0, 500);

    int j = i / 50;
    float f = j * 50 / 500.0F;

    return bCO.s(0.65F, 1.3F, f);
  }

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (cGC == null) {
      cGC = new cgd(this);

      dka.cSF().a(cGC, 500L, -1);
    } else {
      dka.cSF().j(cGC);
      cGC = null;
      this.gvZ = 0;
    }
  }

  public boolean X()
  {
    return false;
  }
}