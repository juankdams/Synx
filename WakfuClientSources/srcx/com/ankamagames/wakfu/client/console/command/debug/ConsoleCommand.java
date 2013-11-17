package com.ankamagames.wakfu.client.console.command.debug;

import VV;
import aeF;
import aps;
import bBc;
import byv;
import cBQ;
import cth;
import dnc;
import java.util.ArrayList;

public class ConsoleCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    aps localaps = byv.bFN().bFQ();
    if ((localaps != null) && (!bBc.f(localaps.bOR(), bBc.gto)))
      if (cBQ.cxL().mZ("consoleDialog"))
        cBQ.cxL().mW("consoleDialog");
      else
        cBQ.cxL().a("consoleDialog", VV.dJ("consoleDialog"), 1025L, (short)30000);
  }

  public boolean X()
  {
    return false;
  }
}