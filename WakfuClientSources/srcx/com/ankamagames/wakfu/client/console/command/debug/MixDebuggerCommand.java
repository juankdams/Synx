package com.ankamagames.wakfu.client.console.command.debug;

import aeF;
import bxU;
import byv;
import cth;
import dnc;
import java.util.ArrayList;

public class MixDebuggerCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    bxU localbxU = bxU.bFg();
    if (byv.bFN().c(localbxU))
      byv.bFN().b(localbxU);
    else
      byv.bFN().a(localbxU);
  }

  public boolean X()
  {
    return false;
  }
}