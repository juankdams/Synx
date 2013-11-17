package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bDc;
import cth;
import dka;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FlyingImageCommand
  implements dnc
{
  protected static final Logger K = Logger.getLogger(FlyingImageCommand.class);

  private static Runnable cGC = null;

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (cGC == null) {
      cGC = new bDc(this);

      dka.cSF().a(cGC, 5000L, -1);
    } else {
      dka.cSF().j(cGC);
      cGC = null;
    }
  }

  public boolean X()
  {
    return false;
  }
}