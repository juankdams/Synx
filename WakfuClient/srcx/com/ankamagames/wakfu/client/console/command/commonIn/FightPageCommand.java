package com.ankamagames.wakfu.client.console.command.commonIn;

import aeF;
import byv;
import cth;
import dnc;
import java.util.ArrayList;
import pY;

public class FightPageCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    if (byv.bFN().c(pY.xl()))
      byv.bFN().b(pY.xl());
    else
      byv.bFN().a(pY.xl());
  }

  public boolean X()
  {
    return false;
  }
}