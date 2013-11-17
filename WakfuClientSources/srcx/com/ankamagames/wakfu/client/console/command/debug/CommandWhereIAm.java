package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import byv;
import byz;
import cew;
import cth;
import dnc;
import java.util.ArrayList;

public class CommandWhereIAm
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    byv localbyv = byv.bFN();
    byz localbyz = localbyv.bFO();
    cew localcew = localbyz.aeL();
    paramcth.trace(localbyz.cQF() + "[" + Integer.toString(localcew.fa()) + "," + Integer.toString(localcew.fb()) + "," + Double.toString(localcew.getAltitude()) + "]" + " @" + Short.toString(localbyz.Lk()));
  }

  public boolean X()
  {
    return false;
  }
}