package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import bNu;
import byv;
import byz;
import cth;
import dnc;
import java.util.ArrayList;

public class PassportCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(bNu.bVe()))
      byv.bFN().b(bNu.bVe());
    else if (byv.bFN().bFO().bSh())
      byv.bFN().a(bNu.bVe());
  }

  public boolean X()
  {
    return false;
  }
}