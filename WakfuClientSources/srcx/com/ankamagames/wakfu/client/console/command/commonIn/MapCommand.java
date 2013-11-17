package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cCZ;
import cth;
import dCr;
import dnc;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MapCommand
  implements dnc
{
  protected static Logger K = Logger.getLogger(MapCommand.class);

  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList) {
    xt();
  }

  public static void xt() {
    dCr localdCr = dCr.deY();
    if ((!byv.bFN().c(localdCr)) && (cCZ.cyZ().bMq()))
      byv.bFN().a(localdCr);
    else
      byv.bFN().b(localdCr);
  }

  public boolean X()
  {
    return false;
  }
}