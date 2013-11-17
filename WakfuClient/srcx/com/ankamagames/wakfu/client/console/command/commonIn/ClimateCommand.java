package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import bDk;
import bWW;
import brL;
import byv;
import byz;
import cth;
import dUx;
import dnc;
import java.util.ArrayList;

public class ClimateCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    dUx localdUx = bDk.bLI().cr(byv.bFN().bFO().Lk());
    if (byv.bFN().c(brL.bzT()))
      byv.bFN().b(brL.bzT());
    else if ((bWW.ccf().FB() != null) && (localdUx.mrS))
      byv.bFN().a(brL.bzT());
  }

  public boolean X()
  {
    return false;
  }
}