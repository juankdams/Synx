package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import bTX;
import byv;
import cth;
import dnc;
import java.util.ArrayList;

public class NationDialogCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (!byv.bFN().c(bTX.cah()))
      byv.bFN().a(bTX.cah());
    else
      byv.bFN().b(bTX.cah());
  }

  public boolean X()
  {
    return false;
  }
}